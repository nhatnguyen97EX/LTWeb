package Servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Data.DsKhachHang;
import Data.KhachHang;

/**
 * Servlet implementation class KiemTraThongTin
 */
@WebServlet("/KiemTraThongTin")
public class KiemTraThongTin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DsKhachHang dsKH;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public KiemTraThongTin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean ok = true;
		String mess = "";
		ServletContext context = getServletContext();
		dsKH = (DsKhachHang) context.getAttribute("DsKhachHang");
		if (dsKH == null) {
			dsKH = new DsKhachHang();
			context.setAttribute("DsKhachHang", dsKH);
		}

		// Lấy thông tin từ form đăng ký
		String reset = request.getParameter("lamMoi");
		String tenDangNhap = request.getParameter("tenDangNhap");
		String matKhau1 = request.getParameter("matKhau1");
		String matKhau2 = request.getParameter("matKhau2");
		String hoTen = request.getParameter("hoTen");
		String gioiTinh = request.getParameter("gioiTinh");
		String ngaySinh = request.getParameter("ngaySinh");
		String soDienThoai = request.getParameter("soDienThoai");
		String diaChiEmail = request.getParameter("diaChiEmail");
		String quocGia = request.getParameter("quocGia");
		String tinh = request.getParameter("tinh");
		String huyen = request.getParameter("huyen");
		String duong = request.getParameter("duong");

		// Kiểm tra thông tin người dùng đã nhập
		if (!dsKH.checkLoginName(tenDangNhap)) {
			mess += "Tên người dùng đã tồn tại";
			ok = false;
		} else if (tenDangNhap == null | tenDangNhap == "") {
			mess += "<br>Bạn chưa nhập tên đăng nhập";
			ok = false;
		}

		if (matKhau1 == null | matKhau1 == "") {
			mess += "<br>Bạn chưa nhập mật khẩu";
			ok = false;
		} else if (matKhau1.length() < 8) {
			mess += "<br>Mật khẩu phải ít nhất 8 ký tự, bạn đã nhập ít hơn 8 ký tự";
			ok = false;
		} else if (!matKhau2.equals(matKhau1)) {
			mess += "<br>Xác nhận mật khẩu không trùng khớp";
			ok = false;
		}

		if (hoTen == null | hoTen == "") {
			mess += "<br>Bạn chưa nhập họ tên";
			ok = false;
		}

		if (soDienThoai == null | soDienThoai == "") {
			mess += "<br>Bạn chưa nhập số điện thoại";
			ok = false;
		}

		if (quocGia == null | quocGia == "" | tinh == null | tinh == "" | huyen == null | huyen == "" | duong == null
				| duong == "") {
			mess += "<br>Bạn nhập thông tin địa chỉ chưa đầy đủ";
			ok = false;
		}

		mess += "<br><b>Vui lòng nhập lại thông tin đầy đủ</b>";
		request.setAttribute("mess", mess);
		response.getWriter().print(mess);
		if (reset != null)
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		else if (ok) {
			String diaChi;
			diaChi = duong + " " + huyen + " " + tinh + " " + quocGia;
			KhachHang kh = new KhachHang(tenDangNhap, matKhau1, hoTen, gioiTinh, ngaySinh, soDienThoai, diaChiEmail,
					diaChi);
			dsKH.addKH(kh);
			getServletContext().getRequestDispatcher("/DangKyThanhCong.jsp").forward(request, response);
		} else
			getServletContext().getRequestDispatcher("/DangKyLai.jsp").forward(request, response);
		doGet(request, response);
	}
}
