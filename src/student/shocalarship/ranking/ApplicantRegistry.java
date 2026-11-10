package student.shocalarship.ranking;

/**
 * Resizable array of applicants. This class is the project's list, sorter,
 * and searcher. It does not use java.util.
 */
public class ApplicantRegistry {

    private static final int INITIAL_CAPACITY = 10;

    private ScholarshipApplicant[] applicants;
    private int count;

    public ApplicantRegistry() {
        applicants = new ScholarshipApplicant[INITIAL_CAPACITY];
        count = 0;
    }

    public int size() {
        return count;
    }

    public ScholarshipApplicant get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("No student is stored at index " + index + ".");
        }
        return applicants[index];
    }

}