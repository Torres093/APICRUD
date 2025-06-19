package apiCRUD.DevMarcosTorres.Entities.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name ="TBUSUARIO")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class UserEntity {
    @Id //PRIMARY KEY
    @Column(name= "IDUSUARIO")
    private Long id;
    @Column(name= "NOMBRE")
    private String firstname;
    @Column(name= "APELLIDO")
    private String lastname;
    @Column(name= "IDGRUPOEXPO")
    private Long idGrupoExpo;
    @Column(name= "IDROL")
    private  Long idRol;
    @Column(name= "CORREO", unique = true)
    private String email;
    @Column(name= "CONTRASENA")
    private String password;
    @Column(name= "IDCARGO")
    private Long idPosition;
}
