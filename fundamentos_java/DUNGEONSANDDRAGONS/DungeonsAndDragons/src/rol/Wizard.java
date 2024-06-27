public class Wizard extends Human {

    

    public Wizard(String name){
        super( name);
        this.health = 50;
        this.intelligence = 8;
        
    }

    public int getIntelligence() {
        return intelligence;
    }
    

    public void heal(Human human){
        int curar = human.getHealth() + this.intelligence;
        human.setHealth(curar);

    }
    public void bolaDeFuego(Human human){
        int dano = human.getHealth() - (this.intelligence *3);
        human.setHealth(dano);
    }
    public String toString(){
        return "Wizard: %s (%s HP)".formatted(this.name,this.health);
    } 

}
