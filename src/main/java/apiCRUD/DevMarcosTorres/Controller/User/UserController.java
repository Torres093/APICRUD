package apiCRUD.DevMarcosTorres.Controller.User;

import apiCRUD.DevMarcosTorres.Models.DTO.UserDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apiUser")
public class UserController {
    @RequestMapping("/getDataUser")
    public List<UserDTO> getData(){

    }
}
