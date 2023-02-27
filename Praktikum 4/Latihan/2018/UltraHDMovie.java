public class UltraHDMovie implements Movie {
	private String name;
	private String type;
	
	public UltraHDMovie(String name) {
		this.name = name;
		type = "UltraHDMovie";
	}
	
	public String getType() {
		return type;
	}
	
    public String getName() {
		return name;
	}   
}