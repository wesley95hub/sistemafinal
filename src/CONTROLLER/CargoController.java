package CONTROLLER;

import DAO.CargoDAOImpl;
import MODEL.Cargo;
import java.util.ArrayList;

public class CargoController {
    
 CargoDAOImpl dao;
 
    public CargoController() {
       
     dao = new CargoDAOImpl();
        
    }

    public void cadastrar(Cargo car) {
        dao.cadastrar(car);
    }

    public void deletar(Cargo car) {
        dao.deletar(car);
    }

    public Cargo pesquisar(String Cargo) {
        return dao.pesquisar(Cargo);
    }

    public Cargo pesquisar(int codigo) {
        return dao.pesquisar(codigo);
    }

    public void alterar(Cargo car) {
        dao.alterar(car);
    }

    public ArrayList<Cargo> selecionarCargos() {
        return dao.selecionarCargos();
    }

    public ArrayList<Cargo> pesquisarCargosNome(String nome) {
        return dao.pesquisarCargosNome(nome);
    }

   
    public ArrayList<Cargo> pesquisarCargos(String nome) {
        return dao.pesquisarCargos(nome);
    }

    public int pegarIdCargo() {
        return dao.pegarIdCargo();
    }
    
    
}
