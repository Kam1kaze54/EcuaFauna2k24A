package BusinessLogic;

public abstract class OJAlimento {
    private String nombre;

    public OJAlimento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
