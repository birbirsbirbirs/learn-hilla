package co.ptm.learn_hilla.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contact {
    @Id
    @GeneratedValue
    private Long id;
    @Size(min = 2, max = 50, message = "first name must be marcus")
    private String firstName;
    @Size(min = 2, max = 50)
    private String lastName;
    @Email
    private String email;
    private String phone;
}
