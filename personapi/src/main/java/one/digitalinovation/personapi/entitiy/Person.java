package one.digitalinovation.personapi.entitiy;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private  String firstName;
    @Column(nullable = false)
    private  String lastName;
    @Column(nullable = false,unique = true)
    private  String cpf;
    private LocalDate birth;
    @OneToMany(fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
    private List<Phone> phones;
}
