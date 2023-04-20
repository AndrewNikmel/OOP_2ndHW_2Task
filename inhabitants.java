public abstract class inhabitants {
    private String name;

    public inhabitants(String name) {
        this.name = name;
    }

    public abstract String consumes();

    public abstract String layer();

    @Override
    public String toString() {
        return String.format("Name - %s, consumes - %s, lives in %s", name, consumes(), layer());
    }
}
