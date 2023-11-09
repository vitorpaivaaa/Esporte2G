public class Esportista extends Pessoa{
    private int idFederacao;
    //contrutores


    public Esportista(int idFederacao) {
        this.idFederacao = idFederacao;
    }

    public Esportista() {
    }
    //metodos
    public String sacar(){
        return "Saque viagem...";
    }
}
