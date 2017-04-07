package DateTimeOperations;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class VehicleBooking {
	
	private int vehicleId;
	//private ArrayList<PeriodBooked> period = new ArrayList<>();
	private GregorianCalendar sd;
	private GregorianCalendar ed;
	
	public VehicleBooking(int vehicleId, GregorianCalendar sd, GregorianCalendar ed) {
		super();
		this.vehicleId = vehicleId;
		this.sd = sd;
		this.ed = ed;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public GregorianCalendar getSd() {
		return sd;
	}

	public void setSd(GregorianCalendar sd) {
		this.sd = sd;
	}

	public GregorianCalendar getEd() {
		return ed;
	}

	public void setEd(GregorianCalendar ed) {
		this.ed = ed;
	}

	@Override
	public String toString() {
		return "VehicleBooking [vehicleId=" + vehicleId + ", sd=" + sd + ", ed=" + ed + "]";
	}
	
	
	
}
