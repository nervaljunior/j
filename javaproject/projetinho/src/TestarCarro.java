public class TestarCarro {
    public static void main(String[] args){
        Carro c1= new Carro();
        c1.nome="Uno";
        c1.marca="Fiat";
        c1.ano=2021;
        c1.vel=60;

        c1.acelerar(10);

        System.out.println("velocidade:"+c1.vel+"km/h");

    }
    
}
