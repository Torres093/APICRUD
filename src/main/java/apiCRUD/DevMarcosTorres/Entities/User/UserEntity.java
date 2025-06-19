package apiCRUD.DevMarcosTorres.Entities.User;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
    @SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", allocationSize = 1)
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
