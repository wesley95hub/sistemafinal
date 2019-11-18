package DAO;
import java.util.ArrayList;
import MODEL.Cargo;
        
public interface CargoDAO {
    
    public void cadastrar(Cargo car);
    
    public void deletar(Cargo car);
    
    public Cargo pesquisar(String Cargo);
    
    public Cargo pesquisar(int codigo);
    
    public void alterar(Cargo car);
    
    public ArrayList<Cargo> selecionarCargos();
    
    public ArrayList<Cargo> pesquisarCargosNome(String nome);   
    
    public ArrayList<Cargo> pesquisarCargos(String nome);
    
    public int pegarIdCargo();
}
