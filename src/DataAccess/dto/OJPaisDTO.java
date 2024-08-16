package DataAccess.dto;

public class OJPaisDTO {
    private int ojIdPais;
    private String ojNombre;
    private int ojIdRegion;

    public OJPaisDTO(int ojIdPais, String ojNombre, int ojIdRegion) {
        this.ojIdPais = ojIdPais;
        this.ojNombre = ojNombre;
        this.ojIdRegion = ojIdRegion;
    }

    public int getOjIdPais() {
        return ojIdPais;
    }

    public void setOjIdPais(int ojIdPais) {
        this.ojIdPais = ojIdPais;
    }

    public String getOjNombre() {
        return ojNombre;
    }

    public void setOjNombre(String ojNombre) {
        this.ojNombre = ojNombre;
    }

    public int getOjIdRegion() {
        return ojIdRegion;
    }

    public void setOjIdRegion(int ojIdRegion) {
        this.ojIdRegion = ojIdRegion;
    }

    @Override
    public String toString() {
        return getClass().getName()
                + "\n ojNombre: " + getOjNombre()
                + "\n ojIdRegion: " + getOjIdRegion();
    }
}
