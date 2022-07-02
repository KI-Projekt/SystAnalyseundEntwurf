public class PNG implements Dateisystem {
    private String name;
    private double groesse;

    public PNG(String name, double groesse) {
        this.name = name;
        this.groesse = groesse;
    }

    @Override
    public String getName(int identation) {
        return this.name + "." + getClass().getSimpleName();
    }

    @Override
    public double getGroesse() {
        return this.groesse;
    }
}
