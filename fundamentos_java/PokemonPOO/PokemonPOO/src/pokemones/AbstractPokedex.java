package pokemones;
public abstract class AbstractPokedex implements PokemonInterface {

    

    @Override
    public Pokemon createPokemon(String name,  String type, int health) {
        Pokemon newP = new Pokemon(name, type , health);
        return newP;
    }

    @Override
    public String pokemonInfo(Pokemon pokemon) {
        String resp = "%s : (Salud: %s, tipo: %s)".formatted(pokemon.getName(),
         pokemon.getHealth(), 
         pokemon.getType());
        return resp;
    }

}
