package dio.projetos.personapi.service;

import dio.projetos.personapi.dto.request.PersonDTO;
import dio.projetos.personapi.dto.response.MessageResponseDto;
import dio.projetos.personapi.entitie.Person;
import dio.projetos.personapi.mapper.PersonMapper;
import dio.projetos.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {

  PersonRepository personRepository;

  private final PersonMapper personMapper = PersonMapper.INSTANCE;

  @Autowired
  public PersonService(PersonRepository personRepository){
    this.personRepository=personRepository;
  }

  public MessageResponseDto create(PersonDTO personDTO){

    Person personToSave = personMapper.toModel(personDTO);

    Person savePerson = personRepository.save(personToSave);

    return MessageResponseDto.builder().message("Person created with Id#: "+savePerson.getId()).build();
  }

}
