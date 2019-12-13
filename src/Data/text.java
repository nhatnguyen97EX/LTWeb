package Data;

public class text {
	public static void main(String[] args) {
		SaveData savedata=new SaveData();
		KhachHang kh=new KhachHang("nhat", "12345678", "Nhat Nguyen", "Nam", "04/11/1997", "0367217260", "nhatsuyen@gmail.com", "Suối Rao, Châu Đức, BRVT, VN");
		savedata.saveData(2, kh);
	}

}
