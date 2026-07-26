public class carro {
    String carro="";
    String Placa="";
    String marca="";
    int codigo=0;

    public int getCodigo(){
        return codigo;
    }

    public void setNomeCarro(String carro){
        this.carro=carro;
    }
    public void setPlaca(String placa) {
        this.Placa=placa;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public String toString(){
        return"\n nome : "+carro+"\n Placa : "+Placa+
                "\n Marca : "+marca+"\n codigo : "+codigo;
    }
}