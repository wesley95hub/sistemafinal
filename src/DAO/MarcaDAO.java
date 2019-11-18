package DAO;
import java.util.ArrayList;
import MODEL.Marca;
        
public interface MarcaDAO {
    
    public void cadastrar(Marca mar);
    
    public void deletar(Marca mar);
    
    public Marca pesquisar(String Marca);
    
    public Marca pesquisar(int codigo);
    
    public void alterar(Marca mar);
    
    public ArrayList<Marca> selecionarMarcas();
    
    public ArrayList<Marca> pesquisarMarcasNome(String nome);   
    
    public ArrayList<Marca> pesquisarMarcas(String nome);
    
    public int pegarIdMarca();
}
