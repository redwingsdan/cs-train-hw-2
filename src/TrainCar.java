/**
 * Dan Peterson
 * 109091561
 * daniel.peterson@stonybrook.edu
 * Homework #2
 * CSE 214 Recitation #5
 * Sun Lin
 * @author Dan
 */
public class TrainCar {

	private double carLength;
	private double carWeight;
	private ProductLoad load;
	
	public TrainCar()
	{
		this.carLength = 0.0;
		this.carWeight = 0.0;
		this.load = null;
	}
	
	/**
	 * Creates an instance of <code>TrainCar</code> - Constructor
	 * @param carLength = The length of the product in in meters - Double
	 * @param carWeight = The weight of the product in tons - Double
	 * @exception IllegalArgumentException = Indicates that <code>length</code> is less than 0.
	 * @exception IllegalArgumentException = Indicates that <code>weight</code> is less than 0.
	 */
	public TrainCar(double carLength, double carWeight) throws IllegalArgumentException
	{
		if(carWeight < 0.0)
		{
			throw new IllegalArgumentException ("This TrainCar could not be created due to an invalid weight.");
		}
		if(carLength < 0.0)
		{
			throw new IllegalArgumentException ("This TrainCar could not be created due to an invalid length.");
		}
		this.carLength = carLength;
		this.carWeight = carWeight;
	}

	/**
	 * Sets the value of <code>load</code> to the value passed in.
	 * @param load = The load which will the car will hold - ProductLoad
	 */
	public void setLoad(ProductLoad load)
	{
		this.load = load;
	}
	
	/**
	 * Returns the value of <code>carLength</code> - Double
	 * @return carLength - Double
	 */
	public double getCarLength() 
	{
	//	if(carLength == 0.0)
	//	{
	//		throw new NullPointerException ("This is an invalid length.");
	//	}
		return this.carLength;
	}
	
	/**
	 * Returns the value of <code>carWeight</code> - Double
	 * @return carWeight - Double
	 */
	public double getCarWeight()
	{
		return this.carWeight;
	}
	
	/**
	 * Returns the value of <code>load</code> - ProductLoad
	 * @return load - Double
	 */
	public ProductLoad getLoad()
	{
		return this.load;
	}
	
	/**
	 * Returns the a boolean value for whether or not the load is empty - Boolean
	 * @returns true if <code>load</code> is null.
	 * @returns false if otherwise.
	 */
	public boolean isEmpty()
	{
		if(this.load == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
}
