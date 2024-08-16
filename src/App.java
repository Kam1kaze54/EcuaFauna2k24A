import DataAccess.OJDataHelper;
import DataAccess.dao.OJAlimentoDAO;
import DataAccess.dto.OJAlimentoDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class App {
    private static Connection conn;

    public static void main(String[] args) {
        try {
            // Intentar abrir una conexión a la base de datos
            conn = OJDataHelper.openConnection();

            if (conn != null && !conn.isClosed()) {
                System.out.println("Conexión a la base de datos establecida correctamente.");

                // Crear un DAO de ejemplo
                OJAlimentoDAO alimentoDAO = new OJAlimentoDAO(conn);

                // Crear un objeto DTO de ejemplo
                OJAlimentoDTO nuevoAlimento = new OJAlimentoDTO(
                    1,
                    "Genoalimento1",
                    "Herbívoro",
                    "Observación de prueba",
                    "Activo",
                    "2024-08-16",
                    "2024-08-16"
                );

                // Insertar el objeto DTO en la base de datos
                alimentoDAO.create(nuevoAlimento);
                System.out.println("Alimento creado correctamente.");

                // Leer el objeto DTO desde la base de datos
                OJAlimentoDTO alimentoLeido = alimentoDAO.readBy(1);
                if (alimentoLeido != null) {
                    System.out.println("Alimento leído desde la base de datos:");
                    System.out.println(alimentoLeido);
                } else {
                    System.out.println("No se encontró el alimento con ID 1.");
                }

                // Leer todos los alimentos
                List<OJAlimentoDTO> alimentos = alimentoDAO.readAll();
                System.out.println("Todos los alimentos en la base de datos:");
                for (OJAlimentoDTO alimento : alimentos) {
                    System.out.println(alimento);
                }

                // Actualizar el alimento
                nuevoAlimento.setOjObservacion("Observación actualizada");
                alimentoDAO.update(nuevoAlimento);
                System.out.println("Alimento actualizado correctamente.");

                // Eliminar el alimento
                alimentoDAO.delete(1);
                System.out.println("Alimento eliminado correctamente.");

            } else {
                System.out.println("No se pudo establecer la conexión a la base de datos.");
            }

        } catch (SQLException e) {
            System.err.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    }

    // Método para cerrar la conexión desde la GUI o desde otro lugar si es necesario
    public static void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                conn = null; // Asegurarse de que conn se establezca a null después de cerrarla
                System.out.println("Conexión a la base de datos cerrada.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión a la base de datos: " + e.getMessage());
        }
    }
}
