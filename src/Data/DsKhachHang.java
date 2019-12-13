package Data;

import java.util.ArrayList;



public class DsKhachHang {
	ArrayList<KhachHang> dsKH=new ArrayList<KhachHang>();
	LoadData ldb=new LoadData();
	
	public int getSize() {
		return dsKH.size();
	}
	public boolean checkLoginName(String loginName) {
		for (int i=0; i<dsKH.size();i++)
			if (dsKH.get(i).tenDangNhap.equals(loginName))
				return false;
		return true;
	}
	public void addKH(KhachHang kH){
		dsKH.add(kH);
		SaveData saveData=new SaveData();
		saveData.saveData(dsKH.size(),kH);
	}
	public void inDSKH() {
		for (KhachHang khachHang : dsKH) {
			System.out.println(khachHang.toString());
		}
	}
	public DsKhachHang() {
		dsKH=ldb.loadDB();
	}
	public String getToString() {
		String ds = "";
		for (KhachHang khachHang : dsKH) {
			ds+=khachHang.toString()+"\n";
		}
		return ds;
	}
	public static void main(String[] args) {
		DsKhachHang a = new DsKhachHang();
		System.out.println(a.checkLoginName("nhat"));
	}
}
