public class tuna extends peaceful implements swimming {
    public tuna(String name) {
        super(name);
    }

    @Override
    public String layer() {
        return "everywhere";
    }

    @Override
    public int speedOfSwimm() {
        return 90;
    }

    @Override
    public String toString() {
        return String.format("Fish %s", super.toString());
    }

}
