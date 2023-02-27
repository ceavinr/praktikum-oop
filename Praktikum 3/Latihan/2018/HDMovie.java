public class HDMovie implements Movie {
	private String name;
	private String type;
	
	public HDMovie(String name) {
		this.name = name;
		type = "HDMovie";
	}
	
	public String getType() {
		return type;
	}
	
    public String getName() {
		return name;
	}
    
    
}