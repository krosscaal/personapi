package dio.projetos.personapi.repository;

import dio.projetos.personapi.entitie.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
