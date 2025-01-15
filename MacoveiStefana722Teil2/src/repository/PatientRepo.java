package repository;
import model.Medicine;
import model.Patient;
import java.util.*;

public class PatientRepo {
    private List<Patient> Patients;

    /**
     * Singleton instance of the {@code PatientRepo}.
     */
    private static PatientRepo instance;

    /**
     * Constructs a new {@code PatientRepo}.
     * Initializes the internal list for storing {@link Patient} objects.
     */
    public PatientRepo() {
        this.Patients=new ArrayList<>();
    }

    /**
     * Retrieves all Patients managed by the Repo.
     *
     * @return a {@code List} of all {@link Patient} objects
     */

    public List<Patient> getObjects(){
        return Patients;
    }

    /**
     * Saves a new {@link Patient} object to the Repo.
     *
     * @param entity the {@link Patient} object to be saved
     */

    public void save(Patient entity) {
        Patients.add(entity);
    }

    /**
     * Updates an existing {@link Patient} object in the Repo.
     * Replaces the target {@code entity} with the given {@code PatientRepl}.
     *
     * @param entity      the {@link Patient} object to be updated
     * @param PatientRepl the {@link Patient} object to replace the target entity
     */

    public void update(Patient entity, Patient PatientRepl) {
        int index = Patients.indexOf(entity);
        if (index != -1) {
            Patients.set(index, PatientRepl);
        }
    }

    /**
     * Deletes a {@link Patient} object from the Repo.
     *
     * @param object the {@link Patient} object to be deleted
     */

    public void delete(Patient object) {
        Patients.remove(object);
    }

    /**
     * Retrieves a {@link Patient} object by its unique identifier.
     *
     * @param id the unique ID of the {@link Patient}
     * @return the {@link Patient} object with the specified ID, or {@code null} if not found
     */
    public Patient getById(Integer id){
        for (Patient Patient : Patients) {
            if (Patient.getId() == id)
                return Patient;
        }
        return null;
    }

    public static PatientRepo getInstance() {
        if (instance == null) {
            instance = new PatientRepo();
        }
        return instance;
    }
}
