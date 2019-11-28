package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class konek {
    static Connection konek;
    public static Connection getConnection(){
        try{
            konek=DriverManager.getConnection("jdbc:mysql://localhost/sekolah","root","");
        }
        catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Koneksi gagal! " + e.toString());
        }
        return konek;
    }
}
