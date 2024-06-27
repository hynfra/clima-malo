package pokemones;
public interface PokemonInterface {

    Pokemon createPokemon(String name, String type,int health ); // Este método crea y retorna un Pokemon

    String pokemonInfo(Pokemon pokemon); // Este método devuelve un string con el name, health, y type del Pokemon

    void listPokemon(); // Lista el nombre de todos los Pokemones que tienes en la Pokedex.

}
