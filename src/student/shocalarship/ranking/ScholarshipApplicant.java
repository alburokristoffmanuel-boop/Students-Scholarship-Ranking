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

    public String getStudentName() {
        return studentName;
    }

    public final void setStudentName(String studentName) {
        this.studentName = validateName(studentName);
    }

    public String getStudentId() {
        return studentId;
    }

    public final void setStudentId(String studentId) {
        this.studentId = validateId(studentId);
    }

    public double getGeneralAverage() {
        return generalAverage;
    }

    public final void setGeneralAverage(double generalAverage) {
        this.generalAverage = validateAverage(generalAverage);
    }

    public double getMonthlyFamilyIncome() {
        return monthlyFamilyIncome;
    }

    public final void setMonthlyFamilyIncome(double monthlyFamilyIncome) {
        this.monthlyFamilyIncome = validateIncome(monthlyFamilyIncome);
    }

    public double getActivityPoints() {
        return activityPoints;
    }

    public final void setActivityPoints(double activityPoints) {
        this.activityPoints = validateActivities(activityPoints);
    }


