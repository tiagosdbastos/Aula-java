package construtores;

public class Pessoa {
    String nome;
    int idade;
    double  peso;

  /*  Pessoa(){
//construtor padrão
    }*/


  /*  Pessoa(int idade, double peso){
//construtor com 2 assinaturas
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;

    }
*/

    //construtor com 3 assinaturas
    Pessoa(String nome, int idade, double peso){

        this.nome = nome;
        this.idade = idade;
        this.peso = peso;

    }
}
