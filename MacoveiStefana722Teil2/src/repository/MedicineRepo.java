package repository;
import model.Medicine;
import model.Patient;
import java.util.*;

public class MedicineRepo {
    private List<Medicine> Medicines;

    /**
     * Singleton instance of the {@code MedicineRepo}.
     */
    private static MedicineRepo instance;

    /**
     * Constructs a new {@code MedicineRepo}.
     * Initializes the internal list for storing {@link Medicine} objects.
     */
    public MedicineRepo() {
        this.Medicines=new ArrayList<>();
    }

    /**
     * Retrieves all Medicines managed by the Repo.
     *
     * @return a {@code List} of all {@link Medicine} objects
     */

    public List<Medicine> getObjects(){
        return Medicines;
    }

    /**
     * Saves a new {@link Medicine} object to the Repo.
     *
     * @param entity the {@link Medicine} object to be saved
     */

    public void save(Medicine entity) {
        Medicines.add(entity);
    }

    /**
     * Updates an existing {@link Medicine} object in the Repo.
     * Replaces the target {@code entity} with the given {@code MedicineRepl}.
     *
     * @param entity      the {@link Medicine} object to be updated
     * @param MedicineRepl the {@link Medicine} object to replace the target entity
     */

    public void update(Medicine entity, Medicine MedicineRepl) {
        int index = Medicines.indexOf(entity);
        if (index != -1) {
            Medicines.set(index, MedicineRepl);
        }
    }

    /**
     * Deletes a {@link Medicine} object from the Repo.
     *
     * @param object the {@link Medicine} object to be deleted
     */

    public void delete(Medicine object) {
        Medicines.remove(object);
    }

    /**
     * Retrieves a {@link Medicine} object by its unique identifier.
     *
     * @param id the unique ID of the {@link Medicine}
     * @return the {@link Medicine} object with the specified ID, or {@code null} if not found
     */
    public Medicine getById(Integer id){
        for (Medicine Medicine : Medicines) {
            if (Medicine.getId() == id)
                return Medicine;
        }
        return null;
    }

    public Medicine getByName(String Name){
        for (Medicine Medicine : Medicines) {
            if (Objects.equals(Medicine.getName(), Name))
                return Medicine;
        }
        return null;
    }

    public static MedicineRepo getInstance() {
        if (instance == null) {
            instance = new MedicineRepo();
        }
        return instance;
    }
}
