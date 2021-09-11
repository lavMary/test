public abstract class Healer {
    protected String name;
    protected int hp;

    public Healer(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public abstract void doNothing();


    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

}

