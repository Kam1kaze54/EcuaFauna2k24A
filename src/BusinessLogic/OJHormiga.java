package BusinessLogic;

public abstract class OJHormiga {
    private int idHormiga;
    private String tipoHormiga;
    private String estado;

    public OJHormiga(int idHormiga, String tipoHormiga) {
        this.idHormiga = idHormiga;
        this.tipoHormiga = tipoHormiga;
        this.estado = "Larva"; // Inicialmente como larva
    }

    public int getIdHormiga() {
        return idHormiga;
    }

    public void setIdHormiga(int idHormiga) {
        this.idHormiga = idHormiga;
    }

    public String getTipoHormiga() {
        return tipoHormiga;
    }

    public void setTipoHormiga(String tipoHormiga) {
        this.tipoHormiga = tipoHormiga;
    }

    public String getEstado() {
        return estado;
    }

    public void alimentar(OJAlimento alimento) {
        if (alimento instanceof OJIngestaNativa) {
            if (alimento instanceof OJInsectivoro) {
                evolucionar();
            } else {
                System.out.println("La hormiga solo puede comer insectos.");
            }
        } else if (alimento instanceof OJGenoAlimento) {
            if (alimento instanceof OJXX) {
                evolucionar();
            } else {
                System.out.println("La hormiga solo puede comer XX.");
            }
        }
    }

    public void evolucionar() {
        if ("Larva".equals(estado)) {
            this.estado = "Reina"; // Evoluciona a Reina después de comer
        }
    }
}
