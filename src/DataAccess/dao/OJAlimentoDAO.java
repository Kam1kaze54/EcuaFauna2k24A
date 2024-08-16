package DataAccess.dao;

import DataAccess.dto.OJAlimentoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OJAlimentoDAO {
    private Connection ojConnection;

    public OJAlimentoDAO(Connection ojConnection) {
        this.ojConnection = ojConnection;
    }

    public void create(OJAlimentoDTO ojAlimento) throws SQLException {
        String ojQuery = "INSERT INTO Alimento (GenoAlimento, IngestaNativa, Observacion, Estado, FechaCreacion, FechaModifica) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ojStmt = ojConnection.prepareStatement(ojQuery)) {
            ojStmt.setString(1, ojAlimento.getOjGenoAlimento());
            ojStmt.setString(2, ojAlimento.getOjIngestaNativa());
            ojStmt.setString(3, ojAlimento.getOjObservacion());
            ojStmt.setString(4, ojAlimento.getOjEstado());
            ojStmt.setString(5, ojAlimento.getOjFechaCreacion());
            ojStmt.setString(6, ojAlimento.getOjFechaModifica());
            ojStmt.executeUpdate();
        }
    }

    public OJAlimentoDTO readBy(Integer ojIdAlimento) throws SQLException {
        String ojQuery = "SELECT * FROM Alimento WHERE IdAlimento = ?";
        try (PreparedStatement ojStmt = ojConnection.prepareStatement(ojQuery)) {
            ojStmt.setInt(1, ojIdAlimento);
            ResultSet ojRs = ojStmt.executeQuery();
            if (ojRs.next()) {
                return new OJAlimentoDTO(
                    ojRs.getInt("IdAlimento"),
                    ojRs.getString("GenoAlimento"),
                    ojRs.getString("IngestaNativa"),
                    ojRs.getString("Observacion"),
                    ojRs.getString("Estado"),
                    ojRs.getString("FechaCreacion"),
                    ojRs.getString("FechaModifica")
                );
            }
            return null;
        }
    }

    public List<OJAlimentoDTO> readAll() throws SQLException {
        List<OJAlimentoDTO> ojAlimentos = new ArrayList<>();
        String ojQuery = "SELECT * FROM Alimento";
        try (PreparedStatement ojStmt = ojConnection.prepareStatement(ojQuery);
            ResultSet ojRs = ojStmt.executeQuery()) {
            while (ojRs.next()) {
                ojAlimentos.add(new OJAlimentoDTO(
                    ojRs.getInt("IdAlimento"),
                    ojRs.getString("GenoAlimento"),
                    ojRs.getString("IngestaNativa"),
                    ojRs.getString("Observacion"),
                    ojRs.getString("Estado"),
                    ojRs.getString("FechaCreacion"),
                    ojRs.getString("FechaModifica")
                ));
            }
        }
        return ojAlimentos;
    }

    public void update(OJAlimentoDTO ojAlimento) throws SQLException {
        String ojQuery = "UPDATE Alimento SET GenoAlimento = ?, IngestaNativa = ?, Observacion = ?, Estado = ?, FechaCreacion = ?, FechaModifica = ? WHERE IdAlimento = ?";
        try (PreparedStatement ojStmt = ojConnection.prepareStatement(ojQuery)) {
            ojStmt.setString(1, ojAlimento.getOjGenoAlimento());
            ojStmt.setString(2, ojAlimento.getOjIngestaNativa());
            ojStmt.setString(3, ojAlimento.getOjObservacion());
            ojStmt.setString(4, ojAlimento.getOjEstado());
            ojStmt.setString(5, ojAlimento.getOjFechaCreacion());
            ojStmt.setString(6, ojAlimento.getOjFechaModifica());
            ojStmt.setInt(7, ojAlimento.getOjIdAlimento());
            ojStmt.executeUpdate();
        }
    }

    public void delete(Integer ojIdAlimento) throws SQLException {
        String ojQuery = "DELETE FROM Alimento WHERE IdAlimento = ?";
        try (PreparedStatement ojStmt = ojConnection.prepareStatement(ojQuery)) {
            ojStmt.setInt(1, ojIdAlimento);
            ojStmt.executeUpdate();
        }
    }
}
