package dio.projetos.personapi.controller;

import dio.projetos.personapi.dto.request.PersonDTO;
import dio.projetos.personapi.dto.response.MessageResponseDto;
import dio.projetos.personapi.entitie.Person;
import dio.projetos.personapi.repository.PersonRepository;
import dio.projetos.personapi.service.PersonService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

  PersonService personService;

  @Autowired
  public PersonController(PersonService personService){
    this.personService=personService;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public MessageResponseDto create(@RequestBody @Valid PersonDTO personDTO){
    return personService.create(personDTO);
  }

}
