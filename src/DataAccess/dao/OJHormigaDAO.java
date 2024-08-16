package DataAccess.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import BusinessLogic.OJHormiga;
import DataAccess.dto.OJHormigaDTO;
import DataAccess.OJDataHelper;
import DataAccess.OJIDAO;

import DataAccess.dto.OJHormigaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OJHormigaDAO {

    private Connection conn;

    public OJHormigaDAO(Connection conn) {
        this.conn = conn;
    }

    // Método para crear una nueva hormiga
    public void create(OJHormigaDTO hormiga) throws SQLException {
        String sql = "INSERT INTO Hormiga (TipoHormiga, Sexo, Provincia, Estado, IdAlimento) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, hormiga.getOjTipoHormiga());
            stmt.setString(2, hormiga.getOjSexo());
            stmt.setString(3, hormiga.getOjProvincia());
            stmt.setString(4, hormiga.getOjEstado());
            stmt.setInt(5, hormiga.getOjIdAlimento());
            stmt.executeUpdate();
        }
    }

    public List<OJHormigaDTO> readAll() throws SQLException {
        List<OJHormigaDTO> hormigas = new ArrayList<>();
        String sql = "SELECT * FROM Hormiga";
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                OJHormigaDTO hormiga = new OJHormigaDTO();
                hormiga.setOjIdHormiga(rs.getInt("IdHormiga"));
                hormiga.setOjTipoHormiga(rs.getString("TipoHormiga"));
                hormiga.setOjSexo(rs.getString("Sexo"));
                hormiga.setOjProvincia(rs.getString("Provincia"));
                hormiga.setOjEstado(rs.getString("Estado"));
                hormiga.setOjIdAlimento(rs.getInt("IdAlimento"));
                hormigas.add(hormiga);
            }
        }
        return hormigas;
    }
}