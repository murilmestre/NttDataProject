package one.digitalinovation.personapi.entitiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import one.digitalinovation.personapi.enums.PhoneTypes;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor

public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneTypes type;
    @Column(nullable = false)
    private String number;

}
