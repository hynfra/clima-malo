
import pokemones.Pokedex;
import pokemones.Pokemon;

public class App {
    public static void main(String[] args) throws Exception {
        Pokedex pokedex = new Pokedex();
        Pokemon machamp = pokedex.createPokemon("Machamp", "Normal", 100);
        Pokemon charizard = pokedex.createPokemon("Charizard","Fuego",100);
        Pokemon pikachu = pokedex.createPokemon("Pikachu","Electrico",100);

        machamp.attackPokemon(pikachu);

        pokedex.addPokemon(pikachu);
        pokedex.addPokemon(charizard);
        pokedex.addPokemon(machamp);
       pokedex.listPokemon();

       int cantPokemon = Pokemon.getCount();
       System.out.println("Cantidad de pokemons: " + cantPokemon);
        
    }
}
