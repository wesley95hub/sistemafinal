package DAO;

import java.util.ArrayList;
import MODEL.Endereco;

public interface EnderecoDAO {

    public void cadastrar(Endereco end);
   
    public void deletar(Endereco end);

    public Endereco pesquisar(String Endereco);

    public Endereco pesquisar(int codigo);

    public void alterar(Endereco end);

    public ArrayList<Endereco> selecionarEnderecos();

    public ArrayList<Endereco> pesquisarEnderecosNome(String nome);

    public Endereco pesquisarEnderecos(String nome);

    public Endereco pesquisarEnderecosFuncionario(int codigo);

    public Endereco pesquisarEnderecosCliente(int codigo);
    
    public Endereco pesquisarEnderecosFornecedor(int codigo);

    public int pegarIdEndereco(Endereco end);
}
