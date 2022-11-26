public class Therapy extends Hospital {
    private String treatment;
    private int duration;

    public Therapy(String startName, String startAddress, String startTreatment, int startDuration){
        super(startName, startAddress);
        treatment = startTreatment;
        duration = startDuration;
    }

    public String toString () {
        return treatment + " " + duration;
    }

    public String getTreatment(){
        return treatment;
    }

    public void setTreatment(String treatment){
        this.treatment = treatment;
    }

    public int getDuration(){
        return duration;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }


}
