package LivecodeBackup;

public abstract class Transportmittel {

    VortbewegungsArt vortbewegen;

    public void bewegen(){
        System.out.println("ich kann mich Fahren");
    }
    public void vortbewegen(){
        vortbewegen.Vortbewegen();

    }


}
