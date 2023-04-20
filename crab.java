public class crab extends peaceful implements walking {
    public crab(String name) {
        super(name);
    }

    @Override
    public String layer() {
        return "on the bottom";
    }

    @Override
    public int speedOfWalk() {
        return 12;
    }

    @Override
    public String toString() {
        return String.format("Crab %s", super.toString());
    }

}
