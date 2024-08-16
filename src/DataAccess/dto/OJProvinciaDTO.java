package DataAccess.dto;

public class OJProvinciaDTO {
    private int ojIdProvincia;
    private String ojNombre;

    public OJProvinciaDTO(int ojIdProvincia, String ojNombre) {
        this.ojIdProvincia = ojIdProvincia;
        this.ojNombre = ojNombre;
    }

    // Getters y Setters
    public int getOjIdProvincia() {
        return ojIdProvincia;
    }

    public void setOjIdProvincia(int ojIdProvincia) {
        this.ojIdProvincia = ojIdProvincia;
    }

    public String getOjNombre() {
        return ojNombre;
    }

    public void setOjNombre(String ojNombre) {
        this.ojNombre = ojNombre;
    }

    @Override
    public String toString() {
        return getClass().getName()
                + "\n ojNombre: " + getOjNombre();
    }
}
