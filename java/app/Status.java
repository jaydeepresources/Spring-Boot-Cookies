package app;

public class Status {

	String statusTxt;
	
	public Status() {
	
	}

	public Status(String statusTxt) {
		super();
		this.statusTxt = statusTxt;
	}

	public String getStatusTxt() {
		return statusTxt;
	}

	public void setStatusTxt(String statusTxt) {
		this.statusTxt = statusTxt;
	}

	@Override
	public String toString() {
		return "Status [statusTxt=" + statusTxt + "]";
	}

}
