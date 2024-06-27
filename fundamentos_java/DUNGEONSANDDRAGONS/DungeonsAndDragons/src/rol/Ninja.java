public class Ninja extends Human{

    public Ninja(String name){
        super(name);
        this.stealth = 10;
        


    }

    public void robar( Human human){
        int robarVida = human.getHealth() - this.stealth;
        human.setHealth(robarVida);
        this.setHealth(this.getHealth() + this.stealth);
    }

    public void escaparse() throws HumanException{
        if(this.getHealth() < 10){
            throw new HumanException("El ninja no puede escaparse");
        }
        int escapar = this.getHealth() - 10;
        this.setHealth(escapar);

    }
    
    public String toString(){
        return "Ninja: %s (%s HP)".formatted(this.name,this.health);
    } 
    

}
