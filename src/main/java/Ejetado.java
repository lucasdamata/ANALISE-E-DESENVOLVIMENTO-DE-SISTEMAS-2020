public class Ejetado implements State {

    public void ejetar(float votoEjetar){
        System.out.println("Votado" + (votoEjetar - 1));
    }

    public void correr(float estaminaMovimento){
        System.out.println("Estamina de movimento" + (estaminaMovimento - 30));
    }


}
