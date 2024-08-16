package DataAccess.dto;

public class OJRegionDTO {
    private int ojIdRegion;
    private String ojNombre;

    public OJRegionDTO(int ojIdRegion, String ojNombre) {
        this.ojIdRegion = ojIdRegion;
        this.ojNombre = ojNombre;
    }

    // Getters y Setters
    public int getOjIdRegion() {
        return ojIdRegion;
    }

    public void setOjIdRegion(int ojIdRegion) {
        this.ojIdRegion = ojIdRegion;
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
