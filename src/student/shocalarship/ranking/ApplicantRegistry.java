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
    public int rankOf(ScholarshipApplicant target) {
        int better = 0;
        for (int i = 0; i < count; i++) {
            if (applicants[i] != target && applicants[i].compareForRanking(target) < 0) {
                better++;
            }
        }
        return better + 1;
    }

    /**
     * Linear search by student ID or name. Fills matches and returns how many were found.
     */
    public int search(String keyword, ScholarshipApplicant[] matches) {
        if (keyword == null || matches == null) {
            throw new IllegalArgumentException("Search needs a keyword and a result array.");
        }
        String key = keyword.trim();
        if (key.length() == 0) {
            return 0;
        }
        int found = 0;
        for (int i = 0; i < count && found < matches.length; i++) {
            ScholarshipApplicant applicant = applicants[i];
            if (containsIgnoreCase(applicant.getStudentId(), key)
                    || containsIgnoreCase(applicant.getStudentName(), key)) {
                matches[found] = applicant;
                found++;
            }
        }
        return found;
    }

    private int indexOfId(String studentId) {
        for (int i = 0; i < count; i++) {
            if (applicants[i].getStudentId().equalsIgnoreCase(studentId)) {
                return i;
            }
        }
        return -1;
    }

