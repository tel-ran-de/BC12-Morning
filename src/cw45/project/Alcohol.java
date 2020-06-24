package cw45.project;

public class Alcohol {
    private String spiritName;
    private double alcoholPercent;
    private double milliLiter;

    public Alcohol() {
    }

    public Alcohol(String spiritName, double alcoholPercent) {
        this.spiritName = spiritName;
        this.alcoholPercent = alcoholPercent;
    }

    public Alcohol(double alcoholPercent, double milliLiter) {
        this.alcoholPercent = alcoholPercent;
        this.milliLiter = milliLiter;
    }

    public Alcohol(String spiritName, double alcoholPercent, double milliLiter) {
        this.spiritName = spiritName;
        this.alcoholPercent = alcoholPercent;
        this.milliLiter = milliLiter;
    }

    public String getSpiritName() {
        return spiritName;
    }

    public void setSpiritName(String spiritName) {
        this.spiritName = spiritName;
    }

    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }

    public double getMilliLiter() {
        return milliLiter;
    }

    public void setMilliLiter(double milliLiter) {
        this.milliLiter = milliLiter;
    }

    public double findAlcoholInGram() {
        return this.milliLiter * this.alcoholPercent * 0.008;
    }
}
