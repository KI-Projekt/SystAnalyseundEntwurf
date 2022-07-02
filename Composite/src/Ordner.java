import java.util.ArrayList;
import java.util.List;

public class Ordner implements Dateisystem {
    private String name;
    private List<Dateisystem> kinderDateien;

    public Ordner(String name) {
        this.name = name;
        this.kinderDateien = new ArrayList<>();
    }

    public void addDatei(Dateisystem datei) {
        kinderDateien.add(datei);
    }

    @Override
    public String getName(int identation) {
        String ausgabe = "\uD83D\uDCC1 " + this.name;
        for(Dateisystem i : kinderDateien ){
            ausgabe += "\n" + printIdentation("⮩ " + i.getName(identation+1), identation+1);
        }
        return ausgabe;
    }

    @Override
    public double getGroesse() {
        return kinderDateien.stream()
                .mapToDouble(Dateisystem::getGroesse)
                .sum();
    }

    public String printIdentation(String text, int identation){
        String identationText = "";
        for(int i=0; i < identation; i++){
            identationText = "\t" + identationText;
        }
        return identationText + text;
    }
}
