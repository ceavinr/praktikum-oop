import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<User> userslist = new ArrayList<User>();
		List<Movie> movlist = new ArrayList<Movie>();
		
				
		String username;
		String movname;
		String movtype;
		int balance;
		String substype;
		
		
		Scanner inp = new Scanner(System.in);
		
		String com = inp.next();

		
		if (!com.equals("END")) {
			do {

			//~ CreateUser <username> <balance> Membuat sebuah user baru dengan username dan balance.
			if (com.equals("CreateUser")) {
				username = inp.next();
				balance  = inp.nextInt();
				User a = new User(username, balance);
				userslist.add(a);
			}

			//~ Register <username> <Free/Premium> mengubah subscription user dengan username.
			if (com.equals("Register")) {
				username = inp.next();
				substype = inp.next();
				
				Subscription temptype;
				
				if (substype.equals("Free")) {
					temptype = new FreeSubscription();
				} else {
					temptype = new PremiumSubscription();
				}
				
				
				for (User user: userslist) {
					if (user.getUsername().equals(username)) {
						user.setSubscription(temptype);
						break;
					}
				}
			}


			//~ Bill melakukan billing terhadap user, jika user tidak memiliki balance yang cukup, ubah subscriptionnya menjadi Free.
			if (com.equals("Bill")) {
				
				for (User user: userslist) {
					if (!user.bill()) {
						Subscription freesubs = new FreeSubscription(); 
						user.setSubscription(freesubs);
					}
				}
			}


			//~ AddBalance <username> <balance> menambahkan balance pada User
			if (com.equals("AddBalance")) {
				username = inp.next();
				balance  = inp.nextInt();
				
				for (User user: userslist) {
					if (user.getUsername().equals(username)) {
						user.addBalance(balance);
						break;
					}
				}
				
			}


			//~ AddMovie <name> <HD/UltraHD> menambahkan sebuah movie dengan tipe HD/UltraHD bernama name
			if (com.equals("AddMovie")) {
				movname = inp.next();
				movtype = inp.next();
				
				Movie m;
				
				if (movtype.equals("HD")) {
					m = new HDMovie(movname);
				} else {
					m = new UltraHDMovie(movname);
				}
				
				movlist.add(m);
			}


			//~ Watch <username> <name> membuat user dengan username menonton movie bername name.
			if (com.equals("Watch")) {
				username = inp.next();
				movname = inp.next();
				
				boolean temp;
				Movie m;
				
				for (Movie mov: movlist) {
					if (mov.getName().equals(movname)) {
						m = mov;
						for (User user: userslist) {
							if (user.getUsername().equals(username)) {
								temp = user.watch(m);
								break;
							}
						}
						
						break;
					}
				}
			}


			//~ PrintInfoMovie digunakan untuk mencetak informasi Movie. 
			//~ Dengan format
			//~ Judul Film: {judul_film}
			//~ Tipe Film: {tipe_film}
			if (com.equals("PrintInfoMovie")) {
				for (Movie mov: movlist) {
					System.out.println("Judul Film: " + mov.getName());
					System.out.println("Tipe Film: " + mov.getType());
				}
			}
			
			
			//~ PrintInfoUser digunakan untuk mencetak informasi user.
			//~ Nama Pengguna: {username}
			//~ Jumlah Saldo: {saldo}
			//~ Jenis Subskribsi: {jenis}
			if (com.equals("PrintInfoUser")) {
				for (User user: userslist) {
					System.out.println("Nama Pengguna: " + user.getUsername());
					System.out.println("Jumlah Saldo: " + user.getBalance());
					System.out.println("Jenis Subskribsi: " + user.getSubscription().getType());
				}
			}	
				
			com = inp.next();
			} while (!com.equals("END"));
		}	
	}
}