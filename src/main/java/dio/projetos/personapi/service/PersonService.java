package dio.projetos.personapi.service;

import dio.projetos.personapi.dto.response.MessageResponseDto;
import dio.projetos.personapi.entitie.Person;
import dio.projetos.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {

  PersonRepository personRepository;
  @Autowired
  public PersonService(PersonRepository personRepository){
    this.personRepository=personRepository;
  }

  public MessageResponseDto create(Person person){

    Person savePerson = personRepository.save(person);

    return MessageResponseDto.builder().message("Person created with Id#: "+savePerson.getId()).build();
  }

}
