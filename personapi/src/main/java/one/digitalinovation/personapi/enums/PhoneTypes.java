package one.digitalinovation.personapi.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneTypes {
    HOME("Home"),
        MOBILE("Mobile"),
            COMMERCIAL("Comercial");
    private final String description;


}
