package DataAccess.dao;

import DataAccess.dto.OJProvinciaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OJProvinciaDAO {

    private Connection ojConnection;

    public OJProvinciaDAO(Connection ojConnection) {
        this.ojConnection = ojConnection;
    }

    public void create(OJProvinciaDTO ojProvincia) throws SQLException {
        String ojQuery = "INSERT INTO Provincia (Nombre) VALUES (?)";
        try (PreparedStatement ojStmt = ojConnection.prepareStatement(ojQuery)) {
            ojStmt.setString(1, ojProvincia.getOjNombre());
            ojStmt.executeUpdate();
        }
    }

    public OJProvinciaDTO findById(int ojIdProvincia) throws SQLException {
        String ojQuery = "SELECT * FROM Provincia WHERE IdProvincia = ?";
        try (PreparedStatement ojStmt = ojConnection.prepareStatement(ojQuery)) {
            ojStmt.setInt(1, ojIdProvincia);
            ResultSet ojRs = ojStmt.executeQuery();
            if (ojRs.next()) {
                return new OJProvinciaDTO(
                    ojRs.getInt("IdProvincia"),
                    ojRs.getString("Nombre")
                );
            }
            return null;
        }
    }

    public List<OJProvinciaDTO> readAll() throws SQLException {
        List<OJProvinciaDTO> ojProvincias = new ArrayList<>();
        String ojQuery = "SELECT * FROM Provincia";
        try (PreparedStatement ojStmt = ojConnection.prepareStatement(ojQuery);
            ResultSet ojRs = ojStmt.executeQuery()) {
            while (ojRs.next()) {
                ojProvincias.add(new OJProvinciaDTO(
                    ojRs.getInt("IdProvincia"),
                    ojRs.getString("Nombre")
                ));
            }
        }
        return ojProvincias;
    }

    public void update(OJProvinciaDTO ojProvincia) throws SQLException {
        String ojQuery = "UPDATE Provincia SET Nombre = ? WHERE IdProvincia = ?";
        try (PreparedStatement ojStmt = ojConnection.prepareStatement(ojQuery)) {
            ojStmt.setString(1, ojProvincia.getOjNombre());
            ojStmt.setInt(2, ojProvincia.getOjIdProvincia());
            ojStmt.executeUpdate();
        }
    }

    public void delete(int ojIdProvincia) throws SQLException {
        String ojQuery = "DELETE FROM Provincia WHERE IdProvincia = ?";
        try (PreparedStatement ojStmt = ojConnection.prepareStatement(ojQuery)) {
            ojStmt.setInt(1, ojIdProvincia);
            ojStmt.executeUpdate();
        }
    }
}
