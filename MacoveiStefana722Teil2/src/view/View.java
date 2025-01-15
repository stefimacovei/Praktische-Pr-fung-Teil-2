package view;

import java.util.*;

import model.*;
import repository.MedicineRepo;
import repository.PatientRepo;
import controller.Controller;

public class View {
    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.print("Select an option:\n\n1. Enter a new pacient \n2. Update a pacient\n3. Delete pacient\n4. Show all pacients\n5. Add a medication\n6. Update a medication\n7. Delete a medication\n8. SHow all medications\n0. Exit\n");

            String option = scanner.nextLine();
            Medicine med1=new Medicine("Nume1", 122, "ligma");
            Medicine med2=new Medicine("Nume2", 112, "raceala");
            Medicine med3=new Medicine("Caletra", 555, "ebola(neironic)");
            List<Medicine> medListProv=List.of(med1, med2, med3);
            switch (option) {
                case "0":
                    continueLoop = false;
                    break;
                case "1":
                    controller.addPatient(readInt(scanner), readString(scanner), readInt(scanner), readString(scanner), medListProv);
                    break;
                case "2":
                    controller.updatePatient(readInt(scanner), readString(scanner), readInt(scanner), readString(scanner), medListProv);
                    break;
                case "3":
                    controller.deletePatient(readInt(scanner));
                    break;
                case "4":
                    controller.showAllPatients();
                    break;
                case "5":
                    controller.addMedicine(readString(scanner), readInt(scanner), readString(scanner));
                    break;
                case "6":
                    controller.updateMedication(readString(scanner),readString(scanner), readInt(scanner), readString(scanner));
                    break;
                case "7":
                    controller.deleteMedication( readString(scanner));
                    break;
                case "8":
                    controller.showAllMedications();
                    break;
                default:
            }
        }

    }
    private static int readInt(Scanner scanner) {
        System.out.println("Enter student ID: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static String readString(Scanner scanner) {
        System.out.println("Enter student name: ");
        return scanner.nextLine();
    }
}
