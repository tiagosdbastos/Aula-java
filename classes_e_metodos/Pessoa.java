package classes_e_metodos;

public class Pessoa {
    String nome;
    int idade;
    final double altura = 1.73;
    double peso;

     void PrintInfo(){
         System.out.printf("Nome: %s\nIdade: %d\nAltura:%.2f\nPeso:%.2f", nome, idade, altura, peso);


     }
     int fazerAniversario(){
         return 4 + 4 ;
     }
}
