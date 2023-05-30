package exercise;

// BEGIN
class Segment{
    private Point beginPoint;
    private Point endPoint;

    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Point getMidPoint(){
        return new Point((this.endPoint.getX()+this.beginPoint.getX())/2,(this.endPoint.getY()+this.beginPoint.getY())/2);
    }

    public Point getBeginPoint() {
        return beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

}
// END



