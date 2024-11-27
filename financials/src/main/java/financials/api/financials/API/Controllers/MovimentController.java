package financials.api.financials.API.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import financials.api.financials.API.Models.Moviment;
import financials.api.financials.API.Service.Interfaces.IMovimentService;
import financials.api.financials.API.Service.Interfaces.ISystemUserService;

import java.util.List;

@RestController
public class MovimentController {
    @Autowired
    private  IMovimentService MovimentService;
    private ISystemUserService SystemUserService;

    public MovimentController(IMovimentService movimentService, ISystemUserService systemUserService) {
        MovimentService = movimentService;
        SystemUserService = systemUserService;
    }

    @GetMapping
    public List<Moviment> GetAllMoviments() {
        return MovimentService.GetAllMovimentes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Moviment> getMovimentById(@PathVariable  String id) {
        Moviment moviment = MovimentService.GetMovimenteById(id);
        if (moviment != null) {
            return ResponseEntity.ok(moviment);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Moviment createMoviment(@RequestBody Moviment moviment) {
        return MovimentService.CreateMovimente(moviment);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Moviment> updateMoviment(@PathVariable  String id, @RequestBody Moviment movimentDetails) {
        Moviment updatedMoviment = MovimentService.UpdateMovimente(id, movimentDetails);
        if (updatedMoviment != null) {
            return ResponseEntity.ok(updatedMoviment);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMoviment(@PathVariable  String id) {
        MovimentService.DeleteMovimente(id);
  
        return ResponseEntity.ok().build();
        
    }
}

