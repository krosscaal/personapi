package dio.projetos.personapi.mapper;

import dio.projetos.personapi.dto.request.PersonDTO;
import dio.projetos.personapi.entitie.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

  PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

  @Mapping(source ="birthDate", target ="birthDate", dateFormat ="dd-MM-yyyy")
  Person toModel(PersonDTO personDTO);

  PersonDTO toDTO(Person person);
}
