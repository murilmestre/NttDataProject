package one.digitalinovation.personapi.dto.mapper;

import one.digitalinovation.personapi.dto.request.PersonDTO;
import one.digitalinovation.personapi.entitiy.Person;
import org.springframework.web.bind.annotation.Mapping;

public class PersonMapper {
    public Person toModel(PersonDTO personDTO) {
    }

    @Mapper(componentModel = "spring")
    public interface PersonMapper {

        @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
        Person toModel(PersonDTO dto);

        PersonDTO toDTO(Person dto);
    }
}
