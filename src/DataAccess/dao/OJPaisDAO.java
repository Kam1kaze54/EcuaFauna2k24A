package DataAccess.dao;

import DataAccess.dto.OJPaisDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OJPaisDAO {
    private Connection ojConnection;

    public OJPaisDAO(Connection ojConnection) {
        this.ojConnection = ojConnection;
    }

    public void create(OJPaisDTO ojPais) throws SQLException {
        String ojQuery = "INSERT INTO Pais (Nombre, IdRegion) VALUES (?, ?)";
        try (PreparedStatement ojStmt = ojConnection.prepareStatement(ojQuery)) {
            ojStmt.setString(1, ojPais.getOjNombre());
            ojStmt.setInt(2, ojPais.getOjIdRegion());
            ojStmt.executeUpdate();
        }
    }

    public OJPaisDTO readBy(Integer ojIdPais) throws SQLException {
        String ojQuery = "SELECT * FROM Pais WHERE IdPais = ?";
        try (PreparedStatement ojStmt = ojConnection.prepareStatement(ojQuery)) {
            ojStmt.setInt(1, ojIdPais);
            ResultSet ojRs = ojStmt.executeQuery();
            if (ojRs.next()) {
                return new OJPaisDTO(
                    ojRs.getInt("IdPais"),
                    ojRs.getString("Nombre"),
                    ojRs.getInt("IdRegion")
                );
            }
            return null;
        }
    }

    public List<OJPaisDTO> readAll() throws SQLException {
        List<OJPaisDTO> ojPaises = new ArrayList<>();
        String ojQuery = "SELECT * FROM Pais";
        try (PreparedStatement ojStmt = ojConnection.prepareStatement(ojQuery);
            ResultSet ojRs = ojStmt.executeQuery()) {
            while (ojRs.next()) {
                ojPaises.add(new OJPaisDTO(
                    ojRs.getInt("IdPais"),
                    ojRs.getString("Nombre"),
                    ojRs.getInt("IdRegion")
                ));
            }
        }
        return ojPaises;
    }

    public void update(OJPaisDTO ojPais) throws SQLException {
        String ojQuery = "UPDATE Pais SET Nombre = ?, IdRegion = ? WHERE IdPais = ?";
        try (PreparedStatement ojStmt = ojConnection.prepareStatement(ojQuery)) {
            ojStmt.setString(1, ojPais.getOjNombre());
            ojStmt.setInt(2, ojPais.getOjIdRegion());
            ojStmt.setInt(3, ojPais.getOjIdPais());
            ojStmt.executeUpdate();
        }
    }

    public void delete(Integer ojIdPais) throws SQLException {
        String ojQuery = "DELETE FROM Pais WHERE IdPais = ?";
        try (PreparedStatement ojStmt = ojConnection.prepareStatement(ojQuery)) {
            ojStmt.setInt(1, ojIdPais);
            ojStmt.executeUpdate();
        }
    }
}
