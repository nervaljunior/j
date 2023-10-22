package projeto;

import classes.Livro;
import java.util.List;
import java.util.Scanner;


public class projetoLivro {

    public static int imprimeMenu(){

        Scanner leitor= new Scanner(System.in);

        System.out.println("Informe o livro:");
        System.out.println("remove livro:");
        System.out.println("pesquisa livro:");
        System.out.println("Informe a opção:");

        return leitor.nextInt();
    }
    public static void main(String[] args){

        List<Livro> listaLivros;

        int opcao=imprimeMenu();

        if(opcao==1){
            //inserção
        }else if(opcao==2){
            //remoção
        }else if(opcao==3){
            //pesquisa titulo
        }else if(opcao==4){
            //pesquisa autor
        }


    }
   
}
