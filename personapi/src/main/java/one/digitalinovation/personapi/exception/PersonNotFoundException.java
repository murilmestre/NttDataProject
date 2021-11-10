package one.digitalinovation.personapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class PersonNotFoundException {
    public PersonNotFoundException(Long id) {

    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public class PersonNotFoundException extends Exception {

        public PersonNotFoundException(Long id) {
            super(String.format("Person with ID %s not found!", id));
        }
    }
}
