package apiCRUD.DevMarcosTorres.Entities.Cargo;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name ="TBCARGO")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CargoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cargo")
    @SequenceGenerator(name = "seq_cargo", sequenceName = "seq_cargo", allocationSize = 1)
    @Column(name = "IDCARGO")
    private Long id;
    @Column(name="ROL")
    private String cargo;
}
