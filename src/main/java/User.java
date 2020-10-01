package blackdesert;

public class User {
	private Classe classe;
    private static User user;
    private State estadoAtual;

    private User() {
        estadoAtual = new stState());
        classe = new Tripulante();
    }

    public void setClasse(Classe novaClasse) {
        this.classe = novaClasse;
    }

    public Classe getClasse() {
        return classe;
    }

    public static Personagem getUser() {
        if (personagem == null) {
            personagem = new User();
        }
        return user;
    }

    public void classe() {
        classe.classe();
    }

    private void setNewState(State novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public void entrarNoMapa() {
        System.out.println("Mapa the Skeld");
        setNewState(new Ejetado());
    }

    public void entrarEletrica() {
        System.out.println("Sala Eletrica");
        setNewState(new stState());
    }
    
    public void consumirEstamina(){
        
        System.out.println("Estamina");
        setNewState(new GodState());
    }

    public void mover() {
        estadoAtual.mover(classe.velocidadeDeMovimento());
    }

    public void atacar() {
        estadoAtual.atacar(classe.velocidadeDeAtaque());
    }

    public void Atributos() {
        System.out.println("Vida:" +getClasse().vida());
        System.out.println("Estamina:" +getClasse().manaBase());
        System.out.println("Velocidade de ataque base:" +getClasse().velocidadeDeAtaque());
        System.out.println("Veocidade de movimento base:" +getClasse().velocidadeDeMovimento());
    }

}
