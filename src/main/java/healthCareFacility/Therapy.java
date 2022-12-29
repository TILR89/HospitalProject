package healthCareFacility;

import org.apache.logging.log4j.LogManager;

import java.awt.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.logging.Logger;

public class Therapy {

    org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger(Therapy.class);
    private String treatment;
    private int duration;

    public Therapy() {
    }

    public Therapy(String startTreatment, int startDuration) {
        treatment = startTreatment;
        duration = startDuration;
    }


    public LinkedList<String> drugs = new LinkedList<>();

    public void addDrugs(String newDrugs) {
        drugs.add(newDrugs);
    }

    public void addDrugs(int index, String newDrug) {
        drugs.add(index, newDrug);
    }

    public void removeDrugs(int index) {
        drugs.remove(index);
    }

    public void removeDrugs(String drug) {
        drugs.remove(drug);
    }

    public int drugIndex(String drugName) {
        int drugIndex = drugs.indexOf(drugName);
        return drugIndex;
    }

    public HashSet<String> whoRecommendations = new HashSet<>();

    public void addWhoRecommend(String recommend) {
        whoRecommendations.add(recommend);
    }

    public void getRecommend() {
        Iterator<String> i = whoRecommendations.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String toString() {
        return "Prescribed treatment is " + treatment + " for " + duration + " day(s).";
    }

    public String setTreatment(String prescribedDrug, int duration) {
        treatment = prescribedDrug;
        this.duration = duration;
        return treatment + " for " + duration + " days.";


    }

    public String drugPrescribe(String diagnosis) {
        String prescribedDrug = null;
        try {

            switch (diagnosis) {
                case "Cancer":
                    prescribedDrug = "Morphine";
                    break;
                case "Headache":
                    prescribedDrug = "Ibuprofen";
                    break;
                case "Caries":
                    prescribedDrug = "Aquafresh";
                    break;
                default:
                    prescribedDrug = null;
                    //System.out.println("Take a sleep, at least it won't hurt.");
            }
            return prescribedDrug;
        } catch (Exception e) {
            throw new RuntimeException("To prescribe drug need to get a diagnosis first.");
        } finally {
            if (prescribedDrug != null) {
                LOGGER.info("You received a prescription.");
            } else {
                LOGGER.warn("We couldn't prescribe you any drugs, need to get a diagnosis first.");
            }

        }

    }


}
