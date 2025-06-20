package apiCRUD.DevMarcosTorres.Services.Cargo;

import apiCRUD.DevMarcosTorres.Entities.Cargo.CargoEntity;
import apiCRUD.DevMarcosTorres.Models.DTO.CargoDTO;
import apiCRUD.DevMarcosTorres.Repositories.Cargo.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CargoServices {
    @Autowired
    private CargoRepository repo;

    public List<CargoDTO> getAllCargos(){
        List<CargoEntity> Cargo = repo.findAll();
        return Cargo.stream()
                .map(this::converturACargoDTO)
                .collect(Collectors.toList());
    }
    public CargoDTO converturACargoDTO(CargoEntity cargo){
        CargoDTO dto = new CargoDTO();
        dto.setId(cargo.getId());
        dto.setCargo(cargo.getCargo());
        return dto;
    }
}
