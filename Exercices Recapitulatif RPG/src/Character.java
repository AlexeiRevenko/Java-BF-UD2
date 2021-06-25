public class Character {

    protected byte endurance;
    protected byte force;
    protected byte lifePoints;
    protected String name;

    public Character(String name) {
        this.name = name;
        this.endurance = (byte)Dice.rollMyDice((byte)6,(byte)4);
        this.force = (byte)Dice.rollMyDice((byte)6,(byte)4);
        this.lifePoints = (byte) ((this.endurance < 5)? this.endurance - 1 : ((this.endurance < 10) ? this.endurance :
                ((this.endurance < 15) ? this.endurance + 1 : this.endurance + 2)));
    }

    public byte getEndurance() {
        return endurance;
    }

    public void setEndurance(byte endurance) {
        this.endurance = endurance;
    }

    public byte getForce() {
        return force;
    }

    public void setForce(byte force) {
        this.force = force;
    }

    public byte getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(byte lifePoints) {
        this.lifePoints = lifePoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Character{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
