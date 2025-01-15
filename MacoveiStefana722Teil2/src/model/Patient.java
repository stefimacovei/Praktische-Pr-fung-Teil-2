package model;

import java.util.List;

public class Patient {
    private int id;
    private String name;
    private int age;
    private String diagnosis;
    List<Medicine> medicines;

    public Patient(int id, String name, int age, String diagnosis,List<Medicine> medicineList){
        this.id=id;
        this.name=name;
        this.age=age;
        this.diagnosis=diagnosis;
        this.medicines=medicineList;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id){this.id=id;}
    public void setDiagnosis(String diagnosis){this.diagnosis=diagnosis;}

    public int getId(){return  id;}
    public List<Medicine> getMedicines(){return medicines;}
    public void setMedicines(List<Medicine> getMedicines){
        this.medicines=getMedicines;
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
