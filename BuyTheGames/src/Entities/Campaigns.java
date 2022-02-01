package Entities;

public class Campaigns {
	private int id;
	private double percent;
	private int deadline;
	
	public Campaigns() {
		
	}
	public Campaigns(int id, double percent, int deadline) {
		
		this.id = id;
		this.percent = percent;
		this.deadline = deadline;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public int getDeadline() {
		return deadline;
	}
	public void setDeadline(int deadline) {
		this.deadline = deadline;
	}

	
}
