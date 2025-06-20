package apiCRUD.DevMarcosTorres.Controller.User;

import apiCRUD.DevMarcosTorres.Models.DTO.UserDTO;
import apiCRUD.DevMarcosTorres.Services.User.UserServive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apiUser")
public class UserController {
    @Autowired
    private UserServive services;


    @RequestMapping("/getDataUser")
    public List<UserDTO> getData(){
        return services.getAllUsers();
    }
}
