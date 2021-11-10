package one.digitalinovation.personapi.controller;

import one.digitalinovation.personapi.entitiy.Person;
import one.digitalinovation.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
    private PersonRepository personRepository;
    @Autowired




    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }



@PostMapping
    public String createPerson(@RequestBody  Person person){

        Person savedPerson = personRepository.save(person);
        return "Teste";
}
    public  MensageResponseDTO creatPerson(@RequestBody Person person){
        return  MensageResponseDTO
                .builder()
                .mensage("Created person whith id"+servicePerson.getId())
                .build();
    }
}

}
