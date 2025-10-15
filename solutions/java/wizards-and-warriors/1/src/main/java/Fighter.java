class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }

}

class Warrior extends Fighter {

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
    
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {

    private boolean hasASpell = true;

    public void prepareSpell() {
        this.hasASpell = false;
    }

    @Override
    boolean isVulnerable() {
        return this.hasASpell;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return !hasASpell ? 12 : 3;
    }
    
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

}
