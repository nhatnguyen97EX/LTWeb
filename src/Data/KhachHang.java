package Data;

public class KhachHang {
	String tenDangNhap, matKhau, hoTen, gioiTinh, ngaySinh, soDienThoai, diaChiEmail, diaChi;

	public String getTenDangNhap() {
		return tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getDiaChiEmail() {
		return diaChiEmail;
	}

	public void setDiaChiEmail(String diaChiEmail) {
		this.diaChiEmail = diaChiEmail;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public KhachHang(String tenDangNhap, String matKhau, String hoTen, String gioiTinh, String ngaySinh,
			String soDienThoai, String diaChiEmail, String diaChi) {
		super();
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.soDienThoai = soDienThoai;
		this.diaChiEmail = diaChiEmail;
		this.diaChi = diaChi;
	}
	public String toString() {
		return "Tên đăng nhâp: "+tenDangNhap+"\n"+
				"Họ tên: "+hoTen+"\n"+
				"Giới tính: "+gioiTinh+"\n";
	}
}
