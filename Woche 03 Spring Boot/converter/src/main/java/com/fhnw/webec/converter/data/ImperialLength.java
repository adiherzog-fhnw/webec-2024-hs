package com.fhnw.webec.converter.data;

public class ImperialLength {

    private Double feet;
    private Double inches;

    private static final int INCHES_PER_FOOT = 12;
    private static final double CM_PER_INCH = 2.54;

    public ImperialLength(Double feet, Double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public Double getFeet() {
        return feet;
    }

    public Double getInches() {
        return inches;
    }

    public boolean hasValue() {
        return feet != null && inches != null;
    }

    public MetricLength toMetricLength() {
        var cmTotal = (this.inches + (this.feet * INCHES_PER_FOOT)) * CM_PER_INCH;
        int cm = (int) cmTotal;
        int mm = (int) Math.round((cmTotal - cm) * 10);

        return new MetricLength(cm, mm);
    }
}
