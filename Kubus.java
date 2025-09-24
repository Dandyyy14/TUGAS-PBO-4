class Kubus {
    double s;

    public Kubus(double s) {
        this.s = s;
    }

    public double Volume() {
        return s * s * s;
    }

    public double Luas() {
        return 6 * s * s;
    }
}
