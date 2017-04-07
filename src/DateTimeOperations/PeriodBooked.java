package DateTimeOperations;

//import java.util.Date;
import java.util.GregorianCalendar;

public class PeriodBooked {
	//Date sd;
	//Date ed;
	
	//GregorianCalendar(int year, int month, int dayOfMonth)
	private GregorianCalendar sd;
	private GregorianCalendar ed;
	
	PeriodBooked(GregorianCalendar sdi, GregorianCalendar edi) {
		sd = sdi;
		ed = edi;
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
	
	
	
	
	
	
}
