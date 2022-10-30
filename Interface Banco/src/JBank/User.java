package JBank;
public class User {
    private String Nome, Email, Senha;
    private int CRE;
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public int getCRE() {
        return CRE;
    }

    public void setCRE(int CRE) {
        this.CRE = CRE;
    }
}
