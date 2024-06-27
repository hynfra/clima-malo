public class Human {

    protected String name;
    protected int strength, stealth, intelligence,health;
    public String toString(){
        return "Human: %s (%s HP)".formatted(this.name,this.health);
    }
    public Human(String name) {
        this.name = name;
        this.strength = 5;
        this.stealth = 5;
        this.intelligence = 5;
        this.health = 100;
    }
    public Human (String name, int health){
        this.name = name;
        this.strength = 5;
        this.stealth = 5;
        this.intelligence = 5;
        this.health = health;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(Human humanoAtacado){
       int ataque =  humanoAtacado.getHealth() - this.strength;

       humanoAtacado.setHealth(ataque);

    }

    public void heal (Human humanoSanado) throws HumanException{
        
        heal(humanoSanado, 5);
    }

    public void heal (Human humanoSanado, int cantidadSanada) throws HumanException{
        if(this.getHealth() <= cantidadSanada){
            throw new HumanException("No tiene la suficiente vida para sanar");
        }
        int vidaSanador = this.health -cantidadSanada;
        int vidaDelSanado = humanoSanado.getHealth() + cantidadSanada;
        humanoSanado.setHealth(vidaDelSanado);
        this.setHealth(vidaSanador); 
        
    }
    

}
