public class PoliceCar implements TrackableVehicle {
	private String plateNumber;
	private Point gpsPosition;
	private int speed;
	private String direction = "North";
	private int wheel;
	private String fuelType;
	private Boolean started = false;

	public PoliceCar (String plateNumber, Point gpsPosition, int speed, int wheel, String fuelType){
		this.plateNumber = plateNumber;
		this.gpsPosition = gpsPosition;
		this.speed = speed;
		this.wheel = wheel;
		this.fuelType = fuelType;
	}

	public String getPlateNumber() {
        return plateNumber;
    }

	public Point getGPSPosition() {
        return gpsPosition;
    }

    public String getDirection() {
        return direction;
    }

	public int getMaxSpeed() {
        return speed;
    }

	public int getNumberOfWheels() {
        return wheel;
    }

	public String getFuelType() {
        return fuelType;
    }

    public Boolean getStarted() {
        return started;
    }

	public void start(){
		this.started = true;
	}

	public void stop(){
		this.started = false;
	}

	public void turn(String direction){
		this.direction = direction;
	}
}