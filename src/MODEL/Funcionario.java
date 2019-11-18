package MODEL;

import java.sql.Date;

public class Funcionario extends Pessoa {

    int idFuncionario;

    String ctFuncionario;
    double salarioFuncionario;
    String dataAdmissaoFuncionario;
    String pisFuncionario;
    String estadoCivilFuncionario;
    String formacaoEscolarFuncionario;
    int cargo_idCargo;
    int departamento_idDepartamento;
    int qtdDependentesFuncionario;

    public String getCtFuncionario() {
        return ctFuncionario;
    }

    public void setCtFuncionario(String ctFuncionario) {
        this.ctFuncionario = ctFuncionario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public String getDataAdmissaoFuncionario() {
        return dataAdmissaoFuncionario;
    }

    public void setDataAdmissaoFuncionario(String dataAdmissaoFuncionario) {
        this.dataAdmissaoFuncionario = dataAdmissaoFuncionario;
    }

   

    public String getPisFuncionario() {
        return pisFuncionario;
    }

    public void setPisFuncionario(String pisFuncionario) {
        this.pisFuncionario = pisFuncionario;
    }

    public String getEstadoCivilFuncionario() {
        return estadoCivilFuncionario;
    }

    public void setEstadoCivilFuncionario(String estadoCivilFuncionario) {
        this.estadoCivilFuncionario = estadoCivilFuncionario;
    }

    public String getFormacaoEscolarFuncionario() {
        return formacaoEscolarFuncionario;
    }

    public void setFormacaoEscolarFuncionario(String formacaoEscolarFuncionario) {
        this.formacaoEscolarFuncionario = formacaoEscolarFuncionario;
    }

    public int getCargo_idCargo() {
        return cargo_idCargo;
    }

    public void setCargo_idCargo(int cargo_idCargo) {
        this.cargo_idCargo = cargo_idCargo;
    }

    public int getDepartamento_idDepartamento() {
        return departamento_idDepartamento;
    }

    public void setDepartamento_idDepartamento(int departamento_idDepartamento) {
        this.departamento_idDepartamento = departamento_idDepartamento;
    }

    public int getQtdDependentesFuncionario() {
        return qtdDependentesFuncionario;
    }

    public void setQtdDependentesFuncionario(int qtdDependentesFuncionario) {
        this.qtdDependentesFuncionario = qtdDependentesFuncionario;
    }
}
