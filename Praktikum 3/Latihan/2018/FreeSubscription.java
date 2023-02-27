public class FreeSubscription implements Subscription {
	String type;
	int bill;
	
	public FreeSubscription() {
		type = "Free";
		bill = 0;
	}
	
	public String getType() {
		return type;
	}
	
    public int getBillAmount() {
		return bill;
	}
}