package apiCRUD.DevMarcosTorres.Models.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter @NotBlank
public class UserDTO {
    private Long id;


    private String firstname;
    private String lastname;
    private Long idGrupoExpo;
    private  Long idRol;

    @Email
    private String email;
    @Size (min = 8, message = "Minimo 8 caracteres")
    private String password;
    private Long idPosition;
}
