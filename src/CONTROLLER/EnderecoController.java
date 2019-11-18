package CONTROLLER;

import DAO.EnderecoDAOImpl;
import MODEL.Endereco;
import java.util.ArrayList;

public class EnderecoController {

    EnderecoDAOImpl dao;

    public EnderecoController() {

        dao = new EnderecoDAOImpl();

    }

    public void cadastrar(Endereco end) {
        dao.cadastrar(end);
    }

    public void deletar(Endereco end) {
        dao.deletar(end);
    }

    public Endereco pesquisar(String Endereco) {
        return dao.pesquisar(Endereco);
    }

    public Endereco pesquisar(int codigo) {
        return dao.pesquisar(codigo);
    }

    public void alterar(Endereco end) {
        dao.alterar(end);
    }

    public ArrayList<Endereco> selecionarEnderecos() {
        return dao.selecionarEnderecos();
    }

    public ArrayList<Endereco> pesquisarEnderecosNome(String nome) {
        return dao.pesquisarEnderecosNome(nome);
    }

    public int pegarIdEndereco(Endereco end) {
        return dao.pegarIdEndereco(end);
    }

    public Endereco pesquisarEnderecosFuncionario(int codigo) {
        return dao.pesquisarEnderecosFuncionario(codigo);
    }

    public Endereco pesquisarEnderecosCliente(int codigo) {
        return dao.pesquisarEnderecosCliente(codigo);
    }

    public Endereco pesquisarEnderecosFornecedor(int codigo) {
        return dao.pesquisarEnderecosFornecedor(codigo);
    }

}
