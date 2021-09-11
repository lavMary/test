public final  class HealerDruid extends Healer{
    protected String name;
    protected int hp;

    public HealerDruid(String name, int hp, String name1, int hp1) {
        super(name, hp);
        this.name = name1;
        this.hp = hp1;
    }
    public final void doNothing() {
        System.out.println("I am so useless...");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }
}
