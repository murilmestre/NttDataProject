package one.digitalinovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class PhoneDTO {
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public class PhoneDTO {

        private Long id;

        @Enumerated(EnumType.STRING)
        private PhoneType type;

        @NotEmpty
        @Size(min = 13, max = 14)
        private String number;
    }
}
