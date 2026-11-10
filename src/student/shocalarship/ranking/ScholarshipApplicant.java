package student.shocalarship.ranking;

/**
 * Parent for every scholarship record. Shared fields and validation live here.
 * Each child supplies its own score and status through the abstract methods.
 */
public abstract class ScholarshipApplicant {

    private String studentName;
    private String studentId;
    private double generalAverage;
    private double monthlyFamilyIncome;
    private double activityPoints;

    public ScholarshipApplicant(String studentName, String studentId,
            double generalAverage, double monthlyFamilyIncome, double activityPoints) {
        this.studentName = validateName(studentName);
        this.studentId = validateId(studentId);
        this.generalAverage = validateAverage(generalAverage);
        this.monthlyFamilyIncome = validateIncome(monthlyFamilyIncome);
        this.activityPoints = validateActivities(activityPoints);
    }


