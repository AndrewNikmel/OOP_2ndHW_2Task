public class clown extends peaceful implements swimming {
    public clown(String name) {
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
    public String toString() {
        return String.format("Fish %s", super.toString());
    }

}
