package Data;

import java.util.ArrayList;

public class DsSanPham {
ArrayList<SanPham> dsSP=new ArrayList<SanPham>();
	
	public void addKH(SanPham sp){
		dsSP.add(sp);
	}
	public DsSanPham() {
	}
	public ArrayList<SanPham> getDsSanPham(){
		SanPham sp=new SanPham("Nhẫn", 525000, "nhan/1.png");
		dsSP.add(sp);
		return dsSP;
	}
	public String getToString() {
		return "Nhẫn";
	}
}
