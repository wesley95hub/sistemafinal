package DAO;
import java.util.ArrayList;
import MODEL.Departamento;
        
public interface DepartamentoDAO {
    
    public void cadastrar(Departamento dep);
    
    public void deletar(Departamento dep);
    
    public Departamento pesquisar(String Departamento);
    
    public Departamento pesquisar(int codigo);
    
    public void alterar(Departamento dep);
    
    public ArrayList<Departamento> selecionarDepartamentos();
    
    public ArrayList<Departamento> pesquisarDepartamentosNome(String nome);   
    
    public ArrayList<Departamento> pesquisarDepartamentos(String nome);
    
    public int pegarIdDepartamento();
}
