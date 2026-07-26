public class Pessoa {
    String nome="";
    int idade=0;
    int codigoPessoa=0;
;
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public int getCodigoPessoa(){
        return codigoPessoa;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }
    public void setCodigoPessoa(int codigoPessoa){
        this.codigoPessoa=codigoPessoa;
    }
    public String toString(){
        return"\n nome : "+nome+
                "\n idade : "+idade+
                "\n codigo : "+codigoPessoa;
    }
}
