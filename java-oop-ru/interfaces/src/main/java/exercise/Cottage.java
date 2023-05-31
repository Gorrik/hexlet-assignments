package exercise;

// BEGIN
class Cottage implements Home {
    double area;
    int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public int compareTo(Home another) {
        if (this.getArea() > another.getArea()) {
            return 1;
        } else if (this.getArea() > another.getArea()) {
            return 0;
        } else return -1;
    }

    @Override
    public String toString() {
        return this.floorCount + " этажный коттедж площадью " + this.area  + " метров";
    }

}

// END
