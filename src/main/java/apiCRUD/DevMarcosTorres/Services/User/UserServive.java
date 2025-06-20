package apiCRUD.DevMarcosTorres.Services.User;

import apiCRUD.DevMarcosTorres.Entities.User.UserEntity;
import apiCRUD.DevMarcosTorres.Models.DTO.UserDTO;
import apiCRUD.DevMarcosTorres.Repositories.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class UserServive {
    @Autowired
    private UserRepository repo;
    
    public List<UserDTO> getAllUsers(){
        List<UserEntity> users = repo.findAll();
        return users.stream()
                .map(this:: convertirAUsuarioDTO)
                .collect(Collectors.toList());

    }
    public UserDTO convertirAUsuarioDTO(UserEntity usuario){
        UserDTO dto = new UserDTO();
        dto.setId(usuario.getId());
        dto.setFirstname(usuario.getFirstname());
        dto.setLastname(usuario.getLastname());
        dto.setIdGrupoExpo(usuario.getIdGrupoExpo());
        dto.setIdRol(usuario.getIdRol());
        dto.setEmail(usuario.getEmail());
        dto.setPassword(usuario.getPassword());
        dto.setIdPosition(usuario.getIdPosition());

        return dto;
    }

}
