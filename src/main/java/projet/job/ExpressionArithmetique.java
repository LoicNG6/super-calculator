package projet.job;

public interface ExpressionArithmetique {
	public ExpressionArithmetique simplifier();
	public double calculer();
	boolean egaliteAr(ExpressionArithmetique expr2);
}
