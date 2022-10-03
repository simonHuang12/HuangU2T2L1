public class Point {
    private int x;
    private int y;

    public Point(int x, int y) { //custom coords
        this.x = x;
        this.y = y;
    }

    public Point(int equal) { //same xy coords
        x = equal;
        y = equal;
    }

    public Point() { //default coords origin
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    } //getters for x and y

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        x = newX;
    } //setters for x and y

    public void setY(int newY) {
        y = newY;
    }

    public String coordinate() {
        String coords = "("+x+","+y+")";
        return coords;
    }
    public String quadrant(){
        String quadrant = null;
        if (x>0 && y>0){
            quadrant = "I";
        }if (x<0 && y>0){
            quadrant = "II";
        }if (x<0 && y<0){
            quadrant = "III";
        }if (x>0 && y<0){
            quadrant = "IV";
        }if (x==0 && y>0 || y<0){
            quadrant = "On x-axis";
        }if (y==0 && x>0 || x<0){
            quadrant = "On y-axis";
        }if (x==0 && y==0){
            quadrant = "On origin";
        }
        return quadrant;
    }
}