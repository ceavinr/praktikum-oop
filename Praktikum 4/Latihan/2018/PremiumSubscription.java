public class PremiumSubscription implements Subscription {
	String type;
	int bill;
	
	public PremiumSubscription() {
		type = "Premium";
		bill = 169900;
	}
	
	public String getType() {
		return type;
	}
	
    public int getBillAmount() {
		return bill;
	}
}