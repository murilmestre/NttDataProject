package one.digitalinovation.personapi.service;


import lombok.AllArgsConstructor;
import one.digitalinovation.personapi.dto.MensageResponseDTO;
import one.digitalinovation.personapi.dto.mapper.PersonMapper;
import one.digitalinovation.personapi.dto.request.PersonDTO;
import one.digitalinovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinovation.personapi.entitiy.Person;
import one.digitalinovation.personapi.exception.PersonNotFoundException;
import one.digitalinovation.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRypository;

    @Service
    @AllArgsConstructor(onConstructor = @__(@Autowired))
    public class PersonService {

        private final PersonRepository personRepository;

        private final PersonMapper personMapper;

        public PersonService(PersonRepository personRepository) {
            this.personRepository = personRepository;
        }

        public MessageResponseDTO create(PersonDTO personDTO) {
            Person person = personMapper.toModel(personDTO);
            Person savedPerson = personRepository.save(person);

            MessageResponseDTO messageResponse = createMessageResponse("Person successfully created with ID ", savedPerson.getId());

            return messageResponse;
        }

        public PersonDTO findById(Long id) throws PersonNotFoundException {
            Person person = personRepository.findById(id)
                    .orElseThrow(() -> new PersonNotFoundException(id));

            return personMapper.toDTO(person);
        }

        public List<PersonDTO> listAll() {
            List<Person> people = personRepository.findAll();
            return people.stream()
                    .map(personMapper::toDTO)
                    .collect(Collectors.toList());
        }

        public MessageResponseDTO update(Long id, PersonDTO personDTO) throws PersonNotFoundException {
            personRepository.findById(id)
                    .orElseThrow(() -> new PersonNotFoundException(id));

            Person updatedPerson = personMapper.toModel(personDTO);
            Person savedPerson = personRepository.save(updatedPerson);

            MessageResponseDTO messageResponse = createMessageResponse("Person successfully updated with ID ", savedPerson.getId());

            return messageResponse;
        }

        public void delete(Long id) throws PersonNotFoundException {
            personRepository.findById(id)
                    .orElseThrow(() -> new PersonNotFoundException(id));

            personRepository.deleteById(id);
        }

        private MessageResponseDTO createMessageResponse(String s, Long id2) {
            return MessageResponseDTO.builder()
                    .message(s + id2)
                    .build();
        }