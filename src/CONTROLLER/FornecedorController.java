package CONTROLLER;

import DAO.FornecedorDAOImpl;
import MODEL.Cidade;
import MODEL.Fornecedor;

public class FornecedorController {
    
    FornecedorDAOImpl dao;
 
    public FornecedorController() {
       
     dao = new FornecedorDAOImpl();
        
    }

    public void cadastrar(Fornecedor forn) {
        dao.cadastrar(forn);
    }

    public void deletar(Fornecedor forn) {
        dao.deletar(forn);
    }

    public Fornecedor pesquisar(String Fornecedor) {
        return dao.pesquisar(Fornecedor);
    }

    public Fornecedor pesquisar(int codigo) {
        return dao.pesquisar(codigo);
    }

    public void alterar(Fornecedor forn) {
        dao.alterar(forn);
    }
    public int pegarIdFornecedor(Fornecedor forn){
        return dao.pegarIdFornecedor(forn);
    }
    public int pegarIdFornecedor(){
        return dao.pegarIdFornecedor();
    }
}
