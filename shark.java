public class shark extends dangerous implements swimming {
    public shark(String name) {
        super(name);
    }

    @Override
    public String layer() {
        return "everywhere";
    }

    @Override
    public int speedOfSwimm() {
        return 70;
    }

    @Override
    public String toString() {
        return String.format("Fish %s", super.toString());
    }

}
