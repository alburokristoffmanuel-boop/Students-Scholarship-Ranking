package student.shocalarship.ranking;

/**
 * Need-heavy scholar. Family income carries most of the score.
 */
public class FinancialGrantee extends ScholarshipApplicant {

    private static final double AVERAGE_WEIGHT = 0.35;
    private static final double INCOME_WEIGHT = 0.50;
    private static final double ACTIVITY_WEIGHT = 0.15;
    private static final double QUALIFIED_AT = 80;
    private static final double WAITLIST_AT = 70;

  
