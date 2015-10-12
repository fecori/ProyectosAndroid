package pe.friki.models;

/**
 * Created by Fcordova on 02/10/2015.
 */
public class Radios {

    private int id;
    private String Nombre;
    private String Stream;
    private String Logo;

    public Radios(int id, String nombre, String stream, String logo) {
        this.id = id;
        Nombre = nombre;
        Stream = stream;
        Logo = logo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getStream() {
        return Stream;
    }

    public void setStream(String stream) {
        Stream = stream;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }
}
