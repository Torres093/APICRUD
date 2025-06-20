package apiCRUD.DevMarcosTorres.Controller.Cargo;

import apiCRUD.DevMarcosTorres.Models.DTO.CargoDTO;
import apiCRUD.DevMarcosTorres.Services.Cargo.CargoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apiCargo")
public class CargoController {
    @Autowired
    private CargoServices services;

    @RequestMapping("/getCargoData")
    public List<CargoDTO> getData(){
        return services.getAllCargos();
    }
}
