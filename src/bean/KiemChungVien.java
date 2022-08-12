package bean;

public class KiemChungVien extends NhanVien {
	int soloi;

	public int getSoloi() {
		return soloi;
	}

	public void setSoloi(int soloi) {
		this.soloi = soloi;
	}

	public KiemChungVien(int soloi) {
		super();
		this.soloi = soloi;
	}

	public KiemChungVien() {
		super();
	}
	
	public float luong() {
		return super.luongCoBan * this.soloi * 50000;
	}

}
