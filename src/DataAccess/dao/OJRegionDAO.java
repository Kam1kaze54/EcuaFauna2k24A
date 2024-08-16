package DataAccess.dao;

import DataAccess.dto.OJRegionDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OJRegionDAO {
    private Connection ojConnection;

    public OJRegionDAO(Connection ojConnection) {
        this.ojConnection = ojConnection;
    }

    public void create(OJRegionDTO ojRegion) throws SQLException {
        String ojQuery = "INSERT INTO Region (Nombre) VALUES (?)";
        try (PreparedStatement ojStmt = ojConnection.prepareStatement(ojQuery)) {
            ojStmt.setString(1, ojRegion.getOjNombre());
            ojStmt.executeUpdate();
        }
    }

    public OJRegionDTO readBy(Integer ojIdRegion) throws SQLException {
        String ojQuery = "SELECT * FROM Region WHERE IdRegion = ?";
        try (PreparedStatement ojStmt = ojConnection.prepareStatement(ojQuery)) {
            ojStmt.setInt(1, ojIdRegion);
            ResultSet ojRs = ojStmt.executeQuery();
            if (ojRs.next()) {
                return new OJRegionDTO(
                    ojRs.getInt("IdRegion"),
                    ojRs.getString("Nombre")
                );
            }
            return null;
        }
    }

    public List<OJRegionDTO> readAll() throws SQLException {
        List<OJRegionDTO> ojRegions = new ArrayList<>();
        String ojQuery = "SELECT * FROM Region";
        try (PreparedStatement ojStmt = ojConnection.prepareStatement(ojQuery);
            ResultSet ojRs = ojStmt.executeQuery()) {
            while (ojRs.next()) {
                ojRegions.add(new OJRegionDTO(
                    ojRs.getInt("IdRegion"),
                    ojRs.getString("Nombre")
                ));
            }
        }
        return ojRegions;
    }

    public void update(OJRegionDTO ojRegion) throws SQLException {
        String ojQuery = "UPDATE Region SET Nombre = ? WHERE IdRegion = ?";
        try (PreparedStatement ojStmt = ojConnection.prepareStatement(ojQuery)) {
            ojStmt.setString(1, ojRegion.getOjNombre());
            ojStmt.setInt(2, ojRegion.getOjIdRegion());
            ojStmt.executeUpdate();
        }
    }

    public void delete(Integer ojIdRegion) throws SQLException {
        String ojQuery = "DELETE FROM Region WHERE IdRegion = ?";
        try (PreparedStatement ojStmt = ojConnection.prepareStatement(ojQuery)) {
            ojStmt.setInt(1, ojIdRegion);
            ojStmt.executeUpdate();
        }
    }
}
