public class AppRol {

    public static void main(String[] args) throws Exception{
        
        String nombre2 = Util.leer("Ingresa el nombre del humano");

        Human humano2 = new Human(nombre2);

        String nombre3 = Util.leer("Ingresa el nombre del wizard");

        Wizard mati = new Wizard(nombre3);

        String nombre = Util.leer("Ingresa el nombre del ninja");
        Ninja isi = new Ninja(nombre);
        String nombreSamurai = Util.leer("Ingrese el nombre del samurai");
        Samurai kenshin = new Samurai(nombreSamurai);
        String nombreSamurai2 = Util.leer("Ingrese el nombre del samurai");
        Samurai tanjiro = new Samurai(nombreSamurai2);

        System.out.println("El wizard " + mati + " cura al humano " + humano2 +" en base a su intelligence " + mati.getIntelligence());
        mati.heal(humano2);

        System.out.println(mati + " " + humano2);

        System.out.println("El wizard al ver al humano " + humano2 + " muy desagradecido con su curacion, decide atacar con una bola de fuego ");
        mati.bolaDeFuego(humano2);
        System.out.println(mati + " " + humano2);

        System.out.println("El " +isi + " al ver al humano herido, decide robar al wizard ");
        isi.robar(mati);
        System.out.println(isi + " " + mati);
        System.out.println("El " + isi + " al cumplir su objetivo se escapa");
        isi.escaparse();
        System.out.println( "vida actual del " + isi);

        System.out.println("El samurai "+ kenshin.getName() + " remata al " + mati);
        kenshin.golpeMortal(mati);
        System.out.println(kenshin +" " + mati);
        System.out.println("El samurai luego de atacar al "+ mati+ ", medita sobre sus actos");
        kenshin.meditar();
        System.out.println( Samurai.howMany() );



/* 
        System.out.println("El humano "+humano1.getName() + " ha atacado al humano " + humano2.getName());
        humano1.attack(humano2);
        System.out.println(humano1 + " " + humano2);
        */


        /* 
        System.out.println("El humano " + humano3.getName()+ " intenta sanar al " + humano2.getName()  + " con toda su vida ");
        humano3.heal(humano2, 40);

        System.out.println(humano3 + " " + humano2);
        */


    }

}
