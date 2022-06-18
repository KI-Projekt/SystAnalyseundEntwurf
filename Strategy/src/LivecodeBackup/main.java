package LivecodeBackup;

public class main {
    public static void main(String[] args) {

        Transportmittel LKW = new Fahrzeug();
        Transportmittel AIDA = new Schiff();
        Transportmittel A330 = new Flugzeug();
        LKW.vortbewegen();
        AIDA.vortbewegen();
        A330.vortbewegen();

    }
}
