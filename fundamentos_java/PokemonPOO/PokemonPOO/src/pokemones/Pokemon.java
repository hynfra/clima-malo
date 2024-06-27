package pokemones;
public class Pokemon {

    private String name, type;
    private int health;
    private static int count = 0;
    public Pokemon(String name, String type, int health) {
        this.name = name;
        this.type = type;
        this.health = health;
        count ++;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public static int getCount() {
        return count;
    }
    
    public void attackPokemon(Pokemon pokemon){
        int ataque = pokemon.getHealth() - 10;

        pokemon.setHealth(ataque);
    }
    
    
}
