package pokemones;
import java.util.ArrayList;

public class Pokedex extends AbstractPokedex {

    // variable de instancia
    private ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon>();


    //itera sobre todos mis pokemones, imprimiendo sus datos en consola
    @Override
    public void listPokemon() {
       for (Pokemon pokemon : myPokemons) {

        System.out.println(pokemonInfo(pokemon));
        
       }
    }

    public void addPokemon(Pokemon p){
        
            myPokemons.add(p);
        
        
    }

}
