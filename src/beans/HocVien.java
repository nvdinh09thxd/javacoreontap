package beans;

public class HocVien {
	String MaHV;
	String HoTen;
	String DiaChi;
	int Tuoi;

	public String getMaHV() {
		return MaHV;
	}

	public void setMaHV(String maHV) {
		MaHV = maHV;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public int getTuoi() {
		return Tuoi;
	}

	public void setTuoi(int tuoi) {
		Tuoi = tuoi;
	}

	public HocVien(String maHV, String hoTen, String diaChi, int tuoi) {
		super();
		MaHV = maHV;
		HoTen = hoTen;
		DiaChi = diaChi;
		Tuoi = tuoi;
	}

	public HocVien() {
		super();
	}

	@Override
	public String toString() {
		return "MaHV = " + MaHV + "\nHoTen = " + HoTen + "\nDiaChi = " + DiaChi + "\nTuoi = " + Tuoi;
	}

}
