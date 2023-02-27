import java.lang.Math;

public class CasioGraph implements GraphCalculator{
	private Point point;
	private int batteryLevel = 100;
	private Boolean status = false;

	public CasioGraph(int x, int y){
		point = new Point(x, y);
	}
	public int add(int a, int b){
		if (status) {
			batteryLevel -= 10;
			if (batteryLevel == 0){
				status = false;
			}
			return a + b;
		} else {
			return -1;
		}
	}
    public int substract(int a, int b){
    	if (status) {
			batteryLevel -= 10;
			if (batteryLevel == 0){
				status = false;
			}
    		return a - b;
		} else {
			return -1;
		}
    }
    public int multiply(int a, int b){
    	if (status) {
			batteryLevel -= 10;
			if (batteryLevel == 0){
				status = false;
			}
    		return a * b;
		} else {
			return -1;
		}
    }
    public double divide(int a, int b){
		if (status) {
			batteryLevel -= 10;
			if (batteryLevel == 0){
				status = false;
			}
    		return (double) a / (double) b;
		} else {
			return -1.0;
		}
    }
    
    public void shiftX(int shiftCount){
    	if (status) {
			batteryLevel -= 10;
    		point.setX(point.getX() + shiftCount);
			if (batteryLevel == 0){
				status = false;
			}
    	}
    }
    public void shiftY(int shiftCount){
    	if (status) {
			batteryLevel -= 10;
	    	point.setY(point.getY() + shiftCount);
	    	if (batteryLevel == 0){
				status = false;
			}
	    }
    }
    public double distance(int x, int y){
    	if (status) {
			batteryLevel -= 10;
			if (batteryLevel == 0){
				status = false;
			}
			return Math.sqrt(Math.pow((point.getX() - x), 2) + Math.pow((point.getY() - y), 2));
		} else {
			return -1.0;
		}
    }

    //
    public void start(){
    	if (batteryLevel == 0){
    		status = false;
    	} else if (batteryLevel > 0){
    		status = true;
    	}
    }
    //
    public void stop(){
    	status = false;
    }
    //
    public int checkBattery(){
    	return batteryLevel;
    }
    //
    public Boolean getStatus(){
    	return status;
    }
    //
    public Point getPoint(){
    	return point;
    }
    //
    public void charge(){
    	this.batteryLevel = 100;
    	status = true;
    }
}