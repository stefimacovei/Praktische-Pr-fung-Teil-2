package controller;


import java.util.*;

import model.*;
import repository.MedicineRepo;
import repository.PatientRepo;

public class Controller {
    private MedicineRepo medRepo;
    private PatientRepo patRepo;

    public Controller( MedicineRepo medRepo, PatientRepo patRepo){
        this.medRepo=medRepo;
        this.patRepo=patRepo;
    }
    public void addMedicine(String name, int price, String illness){
        Medicine med=new Medicine(name, price, illness);
        medRepo.save(med);
    }
    public void updateMedication(String name, String newname, int price, String illness){
        List<Medicine> medList=medRepo.getObjects();
        for (Medicine med : medList){
            if(med.getName().equals(name)){
                med.setName(name);
                med.setPrice(price);
                med.setIllness(illness);
            }
        }
        System.out.println("Updated medicine.");
    }
    public void deleteMedication(String name){
        Medicine med2=medRepo.getByName(name);
        medRepo.delete(med2);
    }
    public List<Medicine> showAllMedications(){
        List<Medicine> medList=medRepo.getObjects();
        return medList;
    }


    public void addPatient(int id, String name, int age, String diagnosis,List<Medicine> medicineList ){
       Patient pat=new Patient(id, name, age, diagnosis, medicineList);
        patRepo.save(pat);
    }
    public void updatePatient(int id, String name, int age, String diagnosis,List<Medicine> medicineList){
        List<Patient> patList=patRepo.getObjects();
        for (Patient pat : patList){
            if(pat.getId()==id){
                pat.setName(name);
                pat.setId(id);
                pat.setDiagnosis(diagnosis);
                pat.setAge(age);
                pat.setMedicines(medicineList);
            }
        }
        System.out.println("Updated medicine.");
    }
    public List<Patient> showAllPatients(){
        List<Patient> patients=patRepo.getObjects();
        return patients;
    }
    public void deletePatient(int id){
        Patient pat2=patRepo.getById(id);
        patRepo.delete(pat2);
    }
}
