package Data;

public class SanPham {
	String name;
	double gia;
	String link;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public SanPham(String name, double gia, String link) {
		super();
		this.name = name;
		this.gia = gia;
		this.link = link;
	}
}
