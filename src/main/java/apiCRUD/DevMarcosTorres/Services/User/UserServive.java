package apiCRUD.DevMarcosTorres.Services.User;

import apiCRUD.DevMarcosTorres.Entities.User.UserEntity;
import apiCRUD.DevMarcosTorres.Models.DTO.UserDTO;
import apiCRUD.DevMarcosTorres.Repositories.User.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServive {

    private UserRepository repo;
    
    public List<UserDTO> getDataService(){
        List<UserEntity> usuarios = repo.findAll();
    }

}
