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

    /**
     * Appends one applicant. Returns false when the student ID is already stored.
     */
    public boolean add(ScholarshipApplicant applicant) {
        if (applicant == null) {
            throw new IllegalArgumentException("Cannot add an empty student record.");
        }
        if (indexOfId(applicant.getStudentId()) >= 0) {
            return false;
        }
        ensureCapacity();
        applicants[count] = applicant;
        count++;
        return true;
    }

    /**
     * Insertion sort, highest rank first. The comparison calls the overridden score.
     */
    public void rankByScoreDescending() {
        for (int i = 1; i < count; i++) {
            ScholarshipApplicant key = applicants[i];
            int j = i - 1;
            while (j >= 0 && applicants[j].compareForRanking(key) > 0) {
                applicants[j + 1] = applicants[j];
                j--;
            }
            applicants[j + 1] = key;
        }
    }

    /**
     * 1-based rank using the same ordering as the sort. Does not rearrange the array.
     */
   