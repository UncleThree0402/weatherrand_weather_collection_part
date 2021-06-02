package models;

public class EarthquakeData {
    Object earthquakeNo;
    Object reportColour;
    Object reportContent;
    Object originTime;
    Object depth;
    Object magnitude;

    public EarthquakeData(Object earthquakeNo, Object reportColour, Object reportContent, Object originTime, Object depth, Object magnitude) {
        this.earthquakeNo = earthquakeNo;
        this.reportColour = reportColour;
        this.reportContent = reportContent;
        this.originTime = originTime;
        this.depth = depth;
        this.magnitude = magnitude;
    }

    public EarthquakeData() {
    }

    public Object getEarthquakeNo() {
        return earthquakeNo;
    }

    public void setEarthquakeNo(Object earthquakeNo) {
        this.earthquakeNo = earthquakeNo;
    }

    public Object getReportColour() {
        return reportColour;
    }

    public void setReportColour(Object reportColour) {
        this.reportColour = reportColour;
    }

    public Object getReportContent() {
        return reportContent;
    }

    public void setReportContent(Object reportContent) {
        this.reportContent = reportContent;
    }

    public Object getOriginTime() {
        return originTime;
    }

    public void setOriginTime(Object originTime) {
        this.originTime = originTime;
    }

    public Object getDepth() {
        return depth;
    }

    public void setDepth(Object depth) {
        this.depth = depth;
    }

    public Object getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(Object magnitude) {
        this.magnitude = magnitude;
    }
}
