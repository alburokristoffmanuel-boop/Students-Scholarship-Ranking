package student.shocalarship.ranking;

/**
 * Merit-heavy scholar. The general average carries most of the score.
 */
public class AcademicScholar extends ScholarshipApplicant {

    private static final double AVERAGE_WEIGHT = 0.70;
    private static final double INCOME_WEIGHT = 0.10;
    private static final double ACTIVITY_WEIGHT = 0.20;
    private static final double QUALIFIED_AT = 85;
    private static final double WAITLIST_AT = 75;

    public AcademicScholar(String studentName, String studentId,
            double generalAverage, double monthlyFamilyIncome, double activityPoints) {
        super(studentName, studentId, generalAverage, monthlyFamilyIncome, activityPoints);
    }

    @Override
    public double computeTotalScore() {
        return weightedScore(AVERAGE_WEIGHT, INCOME_WEIGHT, ACTIVITY_WEIGHT);
    }

    @Override
    public String determineStatus() {
        return statusFor(QUALIFIED_AT, WAITLIST_AT);
    }

    @Override
    public String getScholarType() {
        return "Academic Scholar";
    }
}

