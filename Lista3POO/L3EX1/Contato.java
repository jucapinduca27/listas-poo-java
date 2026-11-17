public class Contato {
    private String nome;
    private String tel;
    private String email;

    public Contato(String nome, String tel, String email){ // Construtor
        this.nome = nome;
        this.tel = tel;
        this.email = email;
    }
    public String getNome(){
        return this.nome;
    }
    public String getTel(){
        return this.tel;
    }
    public String getEmail(){
        return this.email;
    }
    public void setNome(Contato pessoa, String novoNome){
        this.nome = novoNome;
    }
    public void setTel(Contato pessoa, String novoTel){
        this.tel = novoTel;
    }
    public void setEmail(Contato pessoa, String novoEmail){
        this.email = novoEmail;
    }

}