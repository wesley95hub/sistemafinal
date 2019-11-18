
package MODEL;


public class Usuario {
    int codigo;
    String cpf;
    String senha;
    int tentativaLogin;

    public int getTentativaLogin() {
        return tentativaLogin;
    }

    public void setTentativaLogin(int tentativaLogin) {
        this.tentativaLogin = tentativaLogin;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
      
}
