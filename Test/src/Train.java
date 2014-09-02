import java.io.Serializable;

public class Train implements Serializable {

	private static final long serialVersionUID = -3837948608321882926L;
	private String trainno;
	private String stationname;
	private String seattype;

	@Override
	public String toString() {
		return "Train [trainno=" + trainno + ", stationname=" + stationname
				+ ", seattype=" + seattype + "]";
	}

	public String getTrainno() {
		return trainno;
	}

	public void setTrainno(String trainno) {
		this.trainno = trainno;
	}

	public String getStationname() {
		return stationname;
	}

	public void setStationname(String stationname) {
		this.stationname = stationname;
	}

	public String getSeattype() {
		return seattype;
	}

	public void setSeattype(String seattype) {
		this.seattype = seattype;
	}

}
