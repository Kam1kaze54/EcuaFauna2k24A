package DataAccess;

import java.sql.SQLException;
import java.util.List;

public interface OJIDAO<T> {
    void create(T dto) throws SQLException;
    List<T> readAll() throws SQLException;
    T readBy(int id) throws SQLException;
    void update(T dto) throws SQLException;
    void delete(int id) throws SQLException;
}
