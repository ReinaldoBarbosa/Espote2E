public class Esportista extends Pessoa{

    //Atributo

    private int idFederacao;

    //Construtores

    public Esportista(int idFederaco){
        this.idFederacao = idFederacao;
    }

    public Esportista(){

    }

    //Metodo

    public String sacar(){
        return "Sacando para o jogo...";
    }


}
