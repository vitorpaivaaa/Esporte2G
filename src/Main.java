import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Pessoa qualquer = new Pessoa();
        qualquer.setNome("Miters");
        System.out.println(qualquer.getNome());

        Esportista jogadora = new Esportista();
        Esportista surfista = new Esportista(345);
        jogadora.setNome("Thais ");
        System.out.println(jogadora.getNome());

        //polimorfismo
        Pessoa outra = new Pessoa();
        String retorno = outra.sacar();
        System.out.println(retorno);
        outra = new Esportista();
        retorno = outra.sacar();
        System.out.println(retorno);

    }
}