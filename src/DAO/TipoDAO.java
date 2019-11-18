package DAO;
import java.util.ArrayList;
import MODEL.Tipo;
        
public interface TipoDAO {
    
    public void cadastrar(Tipo tipo);
    
    public void deletar(Tipo tipo);
    
    public Tipo pesquisar(String Tipo);
    
    public Tipo pesquisar(int codigo);
    
    public void alterar(Tipo tipo);
    
    public ArrayList<Tipo> selecionarTipos();
    
    public ArrayList<Tipo> pesquisarTiposNome(String nome);   
    
    public ArrayList<Tipo> pesquisarTipos(String nome);
    
    public int pegarIdTipo();
}
