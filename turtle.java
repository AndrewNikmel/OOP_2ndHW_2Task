public class turtle extends peaceful implements swimming, walking {
    public turtle(String name) {
        super(name);
    }

    @Override
    public String layer() {
        return "everywhere";
    }

    @Override
    public int speedOfSwimm() {
        return 30;
    }

    @Override
    public int speedOfWalk() {
        return 1;
    }

    @Override
    public String toString() {
        return String.format("Turtle %s", super.toString());
    }

}
