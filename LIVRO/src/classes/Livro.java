package classes;

import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;
    private int num_pag;
    private double preco;

    public Livro(){
        this.autor="";
        this.titulo="";
        this.num_pag= 0;
        this.preco=0.0;

    }

    public void preencher(){

        Scanner leitor= new Scanner(System.in);

        System.out.println("Informe o Titulo:");
        this.titulo=leitor.nextLine();
        System.out.println("Informe o autor:");
        this.autor=leitor.nextLine();
        System.out.println("Informe as paginas:");
        this.num_pag=leitor.nextInt();
        System.out.println("Informe o preço:");
        this.preco=leitor.nextDouble();
    }
    public void imprimir(){

        System.out.println("Titulo:"+this.titulo);
        System.out.println("autor:"+this.autor);
        System.out.println("paginas:"+this.num_pag);
        System.out.println("preço:"+this.preco);

    }
    public void copiar(Livro outro){
        this.titulo=outro.getTitulo();
        this.autor=outro.getAutor();
        this.num_pag=outro.getnumPage();
        this.preco=outro.getPreco();
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public void setAutor(String autor){
        this.autor= autor;
    }
    public String getAutor(){
        return this.autor;
    }
    
    public void setnumPage(int page){
        this.num_pag=page;
    }
    public int getnumPage(){
        return this.num_pag;
    }
    
    public void setPreco(int preco){
        this.preco=preco;
    }
    public double getPreco(){
        return this.preco;
    }
    
}
