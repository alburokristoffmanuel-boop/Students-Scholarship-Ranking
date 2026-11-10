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

    /**
     * Lower income produces a higher need score, clamped to 0..100.
     * An income of 0 scores 100. An income of 30,000 or more scores 0.
     */
    protected final double incomeNeedScore() {
        double score = 100.0 - (monthlyFamilyIncome / 300.0);
        if (score < 0) {
            return 0;
        }
        if (score > 100) {
            return 100;
        }
        return score;
    }

    protected final double weightedScore(double averageWeight, double incomeWeight, double activityWeight) {
        return (generalAverage * averageWeight)
                + (incomeNeedScore() * incomeWeight)
                + (activityPoints * activityWeight);
    }

    protected final String statusFor(double qualifiedAt, double waitlistAt) {
        double score = computeTotalScore();
        if (score >= qualifiedAt) {
            return "Qualified";
        }
        if (score >= waitlistAt) {
            return "Waitlisted";
        }
        return "Not Qualified";
    }

    /**
     * Negative when this applicant should be listed above the other one.
     * Order: higher total score, then higher average, then lower student ID.
     */
    public final int compareForRanking(ScholarshipApplicant other) {
        int byScore = compareDouble(other.computeTotalScore(), this.computeTotalScore());
        if (byScore != 0) {
            return byScore;
        }
        int byAverage = compareDouble(other.generalAverage, this.generalAverage);
        if (byAverage != 0) {
            return byAverage;
        }
        return this.studentId.compareToIgnoreCase(other.studentId);
    }

    public abstract double computeTotalScore();

    public abstract String determineStatus();

    public abstract String getScholarType();

    @Override
    public String toString() {
        return getScholarType() + " [" + studentId + "] " + studentName;
    }

    private static int compareDouble(double left, double right) {
        double gap = left - right;
        if (gap > 0.0000001) {
            return 1;
        }
        if (gap < -0.0000001) {
            return -1;
        }
        return 0;
    }

    private static String validateName(String studentName) {
        if (studentName == null) {
            throw new IllegalArgumentException("Student name is required.");
        }
        String name = studentName.trim();
        if (name.length() < 2) {
            throw new IllegalArgumentException("Student name must be at least 2 characters.");
        }
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (!(Character.isLetter(c) || c == ' ' || c == '-' || c == '\'' || c == '.')) {
                throw new IllegalArgumentException(
                        "Student name may contain only letters, spaces, hyphens, apostrophes, and periods.");
            }
        }
        return name;
    }

    private static String validateId(String studentId) {
        if (studentId == null) {
            throw new IllegalArgumentException("Student ID is required.");
        }
        String id = studentId.trim();
        if (id.length() < 3 || id.length() > 20) {
            throw new IllegalArgumentException("Student ID must be 3 to 20 characters.");
        }
        for (int i = 0; i < id.length(); i++) {
            char c = id.charAt(i);
            if (!(Character.isLetterOrDigit(c) || c == '-')) {
                throw new IllegalArgumentException(
                        "Student ID may contain only letters, digits, and hyphens.");
            }
        }
        return id;
    }
