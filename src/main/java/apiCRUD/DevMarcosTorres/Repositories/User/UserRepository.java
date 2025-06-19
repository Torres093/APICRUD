package apiCRUD.DevMarcosTorres.Repositories.User;

import apiCRUD.DevMarcosTorres.Entities.User.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
