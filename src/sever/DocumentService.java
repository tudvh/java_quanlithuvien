package sever;

import dao.DocumentDao;
import java.sql.SQLException;
import java.util.List;
import model.Document;

public class DocumentService {
    private DocumentDao documentDao;

    public DocumentService() {
        documentDao = new DocumentDao();
    }
    
    public List<Document> getAll(int idLoai) throws ClassNotFoundException, SQLException {
        return documentDao.getAll(idLoai);
    }
    
    public List<String> getCategori() throws SQLException {
        return documentDao.getCategori();
    }
    
//    public Document getUserById(int id) throws SQLException {
//        return userDao.getUserById(id);
//    }
//    
//    public int addUser(Document user) throws ClassNotFoundException, SQLException{
//        return userDao.addUser(user);
//    }
//    
//    public int deleteUser(int id) throws SQLException {
//        return userDao.deleteUser(id);
//    }
//    
//    public int updateUser(Document user) throws SQLException {
//        return userDao.updateUser(user);
//    }
}