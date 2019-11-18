package DAO;
import java.util.ArrayList;
import MODEL.Funcionario;
        
public interface FuncionarioDAO {
    
    public void cadastrar(Funcionario fun);
    
    public void deletar(Funcionario fun);
    
    public Funcionario pesquisar(String Funcionario);
    
    public Funcionario pesquisar(int codigo);
    
    public void alterar(Funcionario fun);
    
    public ArrayList<Funcionario> selecionarFuncionarios();
    
    public ArrayList<Funcionario> pesquisarFuncionariosNome(String nome);
    
    public ArrayList<Funcionario> selcionarFuncionariosUF(String uf);
    
    public ArrayList<Funcionario> pesquisarFuncionarios(String nome);
    
    public int pegarIdFuncionario(Funcionario fun);
    public int pegarIdFuncionario();
}
