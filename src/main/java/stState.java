public class stState implements State {
    public void atacar(float velocidadeAtaque) {
        System.out.println("Atacando na velocidade " + velocidadeAtaque);
    }

    public void mover(float velocidadeDeMovimento) {
        System.out.println("Movendo na velocidade " + velocidadeDeMovimento);
    }
}
