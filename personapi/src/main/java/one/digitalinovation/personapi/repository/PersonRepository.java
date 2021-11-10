package one.digitalinovation.personapi.repository;

import one.digitalinovation.personapi.entitiy.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
