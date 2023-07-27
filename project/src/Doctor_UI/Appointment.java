/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor_UI;

import java.io.Serializable;

/**
 *
 * @author trant
 */
public class Appointment implements Serializable{
    private String ID;
    private String Patientname;
    private int Age;
    private String Gender;
    private String Occupation;
    private String doctor;
    private String date;
    private int clinic;
    private String note;

    public Appointment() {
    }

    public Appointment(String ID, String Patientname, int Age, String Gender, String Occupation, String doctor, String date, int clinic, String note) {
        this.ID = ID;
        this.Patientname = Patientname;
        this.Age = Age;
        this.Gender = Gender;
        this.Occupation = Occupation;
        this.doctor = doctor;
        this.date = date;
        this.clinic = clinic;
        this.note = note;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPatientname() {
        return Patientname;
    }

    public void setPatientname(String Patientname) {
        this.Patientname = Patientname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String Occupation) {
        this.Occupation = Occupation;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getClinic() {
        return clinic;
    }

    public void setClinic(int clinic) {
        this.clinic = clinic;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
