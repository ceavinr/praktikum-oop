class User {
  private int balance;
  private Subscription subscription;
  private String username;

  public User(String username) {
	  this.username = username;
	  balance = 0;
	  subscription = new FreeSubscription();
  }
  
  public User(String username, int balance) {
	  this.username = username;
	  this.balance = balance;
	  subscription = new FreeSubscription();
  }

  public String getUsername() {
	  return username;
  }
  
  public Subscription getSubscription() {
	  return subscription;
  }

  public void setSubscription(Subscription subscription) {
	  this.subscription = subscription;
  }

  public boolean watch(Movie movie) {
	  if (subscription.getType().equals("Premium")) {
			System.out.println("Selamat menonton");
			return true;
	  } else {
			if (movie.getType().equals("UltraHDMovie")) {
				System.out.println("Kamu perlu Premium Subscription untuk menonton ini");
				return false;
			} else {
				System.out.println("Selamat menonton");
				return true;
			}
	  }
	  
  }

  // Menambahkan balance user
  public void addBalance(int balance) {
	  this.balance += balance;
  }
  
  public int getBalance() {
	  return balance;
  }

  // Mengurangi balance user sesuai dengan tipe subscription
  // Mengeluarkan false jika user tidak memiliki balance cukup
  public boolean bill() {
	  if (balance >= subscription.getBillAmount()) {
		  balance -= subscription.getBillAmount();
		  return true;
	  } else {
		  return false;
	  }
  }
}
	