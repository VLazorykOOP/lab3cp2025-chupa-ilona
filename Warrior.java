
public class Warrior implements CharacterPrototype{
    private String name;
    private int level;
    private String weapon;
    private String[] skills;

    public Warrior(String name, int level, String weapon, String[] skills){
        this.name=name;
        this.level=level;
        this.weapon = weapon;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public Warrior clone() {
        String[] skillsClone = this.skills != null ? this.skills.clone() : null;
        return new Warrior(this.name, this.level, this.weapon, skillsClone);
    }

    public void fight(){
        System.out.println("Воїн "+this.name + " ("+this.level+") використав "+ this.weapon);
    }

}
