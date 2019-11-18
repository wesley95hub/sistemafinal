/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.UsuarioDAOImpl;
import MODEL.Usuario;

/**
 *
 * @author PC13
 */
public class UsuarioController {
    UsuarioDAOImpl daoUser;
    public UsuarioController(){
        daoUser = new UsuarioDAOImpl();
    }
    
    public Usuario validarUsuario(Usuario user){
        return daoUser.validarUsuario(user);
    }
    
    public void bloquearUsuario(Usuario user){
         daoUser.bloquearUsuario(user);
    }
    
}
