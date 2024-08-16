package DataAccess.dto;

public class OJAlimentoDTO {
    private int ojIdAlimento;
    private String ojGenoAlimento;
    private String ojIngestaNativa;
    private String ojObservacion;
    private String ojEstado;
    private String ojFechaCreacion;
    private String ojFechaModifica;

    public OJAlimentoDTO(int ojIdAlimento, String ojGenoAlimento, String ojIngestaNativa, String ojObservacion, String ojEstado, String ojFechaCreacion, String ojFechaModifica) {
        this.ojIdAlimento = ojIdAlimento;
        this.ojGenoAlimento = ojGenoAlimento;
        this.ojIngestaNativa = ojIngestaNativa;
        this.ojObservacion = ojObservacion;
        this.ojEstado = ojEstado;
        this.ojFechaCreacion = ojFechaCreacion;
        this.ojFechaModifica = ojFechaModifica;
    }

    public int getOjIdAlimento() {
        return ojIdAlimento;
    }

    public void setOjIdAlimento(int ojIdAlimento) {
        this.ojIdAlimento = ojIdAlimento;
    }

    public String getOjGenoAlimento() {
        return ojGenoAlimento;
    }

    public void setOjGenoAlimento(String ojGenoAlimento) {
        this.ojGenoAlimento = ojGenoAlimento;
    }

    public String getOjIngestaNativa() {
        return ojIngestaNativa;
    }

    public void setOjIngestaNativa(String ojIngestaNativa) {
        this.ojIngestaNativa = ojIngestaNativa;
    }

    public String getOjObservacion() {
        return ojObservacion;
    }

    public void setOjObservacion(String ojObservacion) {
        this.ojObservacion = ojObservacion;
    }

    public String getOjEstado() {
        return ojEstado;
    }

    public void setOjEstado(String ojEstado) {
        this.ojEstado = ojEstado;
    }

    public String getOjFechaCreacion() {
        return ojFechaCreacion;
    }

    public void setOjFechaCreacion(String ojFechaCreacion) {
        this.ojFechaCreacion = ojFechaCreacion;
    }

    public String getOjFechaModifica() {
        return ojFechaModifica;
    }

    public void setOjFechaModifica(String ojFechaModifica) {
        this.ojFechaModifica = ojFechaModifica;
    }

    @Override
    public String toString() {
        return getClass().getName()
                + "\n ojGenoAlimento: " + getOjGenoAlimento()
                + "\n ojIngestaNativa: " + getOjIngestaNativa()
                + "\n ojObservacion: " + getOjObservacion()
                + "\n ojEstado: " + getOjEstado()
                + "\n ojFechaCreacion: " + getOjFechaCreacion()
                + "\n ojFechaModifica: " + getOjFechaModifica();
    }
}
