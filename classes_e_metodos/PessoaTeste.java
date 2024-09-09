package classes_e_metodos;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.nome = "Tiago";
        p1.idade = 18;
        p1.peso = 73.000;


        p1.PrintInfo();

        int novaIdade = p1.fazerAniversario();
        System.out.println(novaIdade);

        p1.PrintInfo();




    }

}
