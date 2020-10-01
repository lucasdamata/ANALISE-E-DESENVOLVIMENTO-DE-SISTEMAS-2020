public class Main {
    public static void main(String[] args) {
       
        User user = User.getUser(); 

        Classe tripulante = new Tripulante();
        Classe impostor = new Impostor();
        
        personagem.classe();
        personagem.Atributos();
        personagem.setClasse(Tripulante);
        personagem.classe();
        personagem.Atributos();
        personagem.setClasse(Impostor);
        personagem.classe();
        personagem.Atributos();
        personagem.setClasse(new Tripulante());
        personagem.classe();
        personagem.Atributos();
        personagem.mover();
        personagem.entrarNoMapa();
        personagem.atacar();
        personagem.consumirEstamina();
        personagem.atacar();
        personagem.mover();
        personagem.entrarEletrica();
        personagem.atacar();
    }
}
