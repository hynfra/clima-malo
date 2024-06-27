public class Samurai extends Human {

    static int  cantidadSamurai = 0;
    public Samurai(String name){
        super(name);
        this.health = 200;
        cantidadSamurai ++;

    }

    public void golpeMortal(Human human){
        human.setHealth(0);
        int vidaSamurai = this.getHealth() - (this.getHealth() / 2);
        this.setHealth(vidaSamurai);

    }

    public void meditar(){
        this.setHealth(Math.round(this.getHealth() + (this.getHealth() /2)));

    }

    public static  String howMany(){

        return "Hay " + cantidadSamurai +" Samurais";
    }


}
