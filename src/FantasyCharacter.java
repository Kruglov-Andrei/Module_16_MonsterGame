public abstract class FantasyCharacter implements Fighter{
    //Имя персонажа
    private String name;
    // Качества персонала
    private int healthPoints;
    private int strength;
    private int dexterity;
    //опыт и золото
    private int experience;
    private int gold;

    public FantasyCharacter(String name, int healthPoints, int strength, int dexterity, int experience, int gold) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.dexterity = dexterity;
        this.experience = experience;
        this.gold = gold;
    }

    @Override
    public int attack() {
        if (dexterity * 3 > getRandomValue()){
            return strength;
        }
        else {
            return 0;
        }
    }

   private int getRandomValue(){
        return (int) (Math.random() * 100);
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
    @Override
    public String toString(){
        return String.format("%s здоровье: %d", name, healthPoints);
    }

}
