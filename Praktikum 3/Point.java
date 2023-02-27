public class Point {
    private Double latitude, longitude, y; // absis dan ordinat

    public Point (Double latitude, Double longitude) {
      this.latitude = latitude;
      this.longitude = longitude;
    } 

    public Double getLatitude(){
      return latitude;
    }

    public Double getLongitude(){
      return longitude;
    }
}