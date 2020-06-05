/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;

/**
 *
 * @author Ilham MMR <ilham.mmr@gmail.com>
 * -
 * -
 * -
 * -
 */
public class MedInfo implements Serializable {
    private String diseaseId;
    private String name;
    private String causes;
    private String symptoms;
     private String treatments;
    private String medications;

    public MedInfo(String diseaseId, String name, String causes, String symptomps, String treatments, String medications) {
        this.diseaseId = diseaseId;
        this.name = name;
        this.causes = causes;
        this.symptoms = symptomps;
        this.treatments = treatments;
        this.medications = medications;
    }

    public String getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(String diseaseId) {
        this.diseaseId = diseaseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCauses() {
        return causes;
    }

    public void setCauses(String causes) {
        this.causes = causes;
    }

    public String getSymptomps() {
        return symptoms;
    }

    public void setSymptomps(String symptomps) {
        this.symptoms = symptomps;
    }

    public String getTreatments() {
        return treatments;
    }

    public void setTreatments(String treatments) {
        this.treatments = treatments;
    }

    public String getMedications() {
        return medications;
    }

    public void setMedications(String medications) {
        this.medications = medications;
    }
    
    
}
