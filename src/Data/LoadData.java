package Data;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class LoadData {
	public ArrayList<KhachHang> loadDB(){
		ArrayList<KhachHang> list=new ArrayList<KhachHang>();
		try {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/shop?useUnicode=true&amp;characterEncoding=utf8?autoReconnect=true&useSSL=false";
		String user = "root";
		String password = "nhat0411";
		Connection conn=DriverManager.getConnection(url,user,password);
		
		Statement sta=conn.createStatement();
		ResultSet re=sta.executeQuery("select * from khachhang");
		while (re.next())
		{
			String tenDangNhap=re.getString("tenDangNhap");
			String matKhau=re.getString("matKhau");
			String hoTen=re.getString("hoTen");
			String gioiTinh=re.getString("gioiTinh");
			String ngaySinh=re.getString("ngaySinh");
			String soDienThoai=re.getString("soDienThoai");
			String diaChiEmail=re.getString("email");
			String diaChi=re.getString("diaChi");
			
			KhachHang st=new KhachHang(tenDangNhap, matKhau, hoTen, gioiTinh, ngaySinh, soDienThoai, diaChiEmail, diaChi);
			list.add(st);
		}
		sta.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println();
		}
		
		return list;
		
	}
}
