package financials.api.financials.API.Service.Interfaces;

import java.util.List;

import financials.api.financials.API.Models.Moviment;

public interface IMovimentService {
    public Moviment CreateMovimente(Moviment Movimente);
    public void DeleteMovimente(String Id);
    public Moviment UpdateMovimente(String Id,Moviment Movimente);
    public List<Moviment> GetAllMovimentes();
    public Moviment GetMovimenteById(String Id);
}
