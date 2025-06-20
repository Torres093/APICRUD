package apiCRUD.DevMarcosTorres.Repositories.Cargo;

import apiCRUD.DevMarcosTorres.Entities.Cargo.CargoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends JpaRepository<CargoEntity, Long> {
}
