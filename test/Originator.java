package test;

public class Originator {
	
	private String status;
	
	public void setStatus(String saveStatus) {
		this.status = saveStatus;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public Memento saveMementoStatus() {
		return new Memento(status);
	}
	
	public void getMementoStatus(Memento lastStatus) {
		status = lastStatus.getStatus();
	}
	
}

