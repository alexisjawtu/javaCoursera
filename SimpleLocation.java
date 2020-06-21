public class SimpleLocation
{
    // member variables
    public double latitude;
    public double longitude;

    // methods

    // constructor
    public SimpleLocation(double lat, double lon)
    {
        this.latitude = lat;
        this.longitude = lon;
    }

    public double distance(SimpleLocation other)
    {
        return this.getDist(other.latitude, other.longitude, this.latitude, 
            this.longitude);
    }

    public double getDist(double x1, double y1, double x2, double y2)
    {
        // this is not realistic
        return Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
    }
}