package hr.fer.zemris.optjava.dz2;

public interface IFunction {

	public int getNumberOfVariables();
	public double getFunctionValue(double[] x);
	public double[] getGradientValue(double[] x);
	
}
