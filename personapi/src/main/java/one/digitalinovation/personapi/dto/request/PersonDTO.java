package one.digitalinovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class PersonDTO {
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public class PersonDTO {

        private Long id;

        @NotEmpty
        @Size(min = 2, max = 100)
        private String firstName;

        @NotEmpty
        @Size(min = 2, max = 100)
        private String lastName;

        @NotEmpty
        @CPF
        private String cpf;

        @NotNull
        private String birthDate;

        @Valid
        @NotEmpty
        private List<PhoneDTO> phones;
}
