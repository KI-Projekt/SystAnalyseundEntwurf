public class CompositeDemo {
    public static void main(String[] args) {
        Ordner fotoalbum1 = new Ordner("FamilienAlbum1");
        Dateisystem bilddatei1 = new PNG("Foto1", 18.7);
        Dateisystem bilddatei2 = new JPG("FamilienFoto2", 40.4);

        Ordner fotoalbum2 = new Ordner("Sommerurlaub 2022");
        Dateisystem bilddatei3 = new PNG("Urlaubsfoto", 69.3);


        fotoalbum1.addDatei(bilddatei1);
        fotoalbum1.addDatei(bilddatei2);
        fotoalbum1.addDatei(fotoalbum2);
        fotoalbum2.addDatei(bilddatei3);

        System.out.println( fotoalbum1.getName(0) );
        System.out.println( fotoalbum1.getGroesse() + "MiB" );
    }
}
