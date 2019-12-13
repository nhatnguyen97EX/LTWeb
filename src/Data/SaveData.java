package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveData {
	public void saveData(int id, KhachHang kh) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/shop?useUnicode=true&amp;characterEncoding=utf8?autoReconnect=true&useSSL=false";
			String user = "root";
			String password = "nhat0411";
			Connection conn=DriverManager.getConnection(url,user,password);
			
			Statement sta=conn.createStatement();
			sta.executeLargeUpdate("INSERT INTO khachhang VALUES("+String.valueOf(id)+",'"+kh.tenDangNhap+"','"+kh.matKhau+"','"+kh.hoTen+"','"
					+kh.gioiTinh+"','"+kh.ngaySinh+"','"+kh.soDienThoai+"','"+kh.diaChiEmail+"','"+kh.diaChi+"')");
			sta.close();
			} catch (ClassNotFoundException | SQLException e) {
				System.out.println();
			}
		
	}
}
