package financials.api.financials.API.Service.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import financials.api.financials.API.Models.Moviment;
import financials.api.financials.API.Repository.MovimentRepository;
import financials.api.financials.API.Service.Interfaces.IMovimentService;

import org.springframework.stereotype.Service;
@Service
public class MovimentService implements IMovimentService{

    @Autowired
    private MovimentRepository MovimentRepository;

    public Moviment CreateMovimente(Moviment Movimente) {
        return MovimentRepository.save(Movimente);
    }

    public void DeleteMovimente(String Id) {
        MovimentRepository.deleteById(Id);
    }

    public Moviment UpdateMovimente(String Id, Moviment Movimente) {
        return MovimentRepository.save(Movimente);
    }

    public List<Moviment> GetAllMovimentes() {
        return MovimentRepository.findAll();
    }

    public Moviment GetMovimenteById(String Id) {
        return MovimentRepository.findById(Id).get();
    }
}
