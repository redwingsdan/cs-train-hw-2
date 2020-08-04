/**
 * Dan Peterson
 * 109091561
 * daniel.peterson@stonybrook.edu
 * Homework #2
 * CSE 214 Recitation #5
 * Sun Lin
 * @author Dan
 */

public class ProductLoad {

	private String name;
	private double weight;
	private double value;
	private boolean isDangerous;

	public ProductLoad()
	{
		this.name = null;
		this.weight = 0.0;
		this.value = 0.0;
		this.isDangerous = false;
	}
	
	/**
	 * Creates an instance of <code>ProductLoad</code> - Constructor
	 * @param name = The name of the product - String
	 * @param weight = The weight of the product in tons - Double
	 * @param value = The value of the product in dollars - Double
	 * @param isDangerous = The dangerousness of the product - Boolean
	 * @exception IllegalArgumentException = Indicates that <code>weight</code> is less than 0.
	 * @exception IllegalArgumentException = Indicates that <code>value</code> is less than 0.
	 */
	public ProductLoad(String name, double weight, double value, boolean isDangerous) throws IllegalArgumentException
	{
		if(weight < 0.0)
		{
			throw new IllegalArgumentException ("This ProductLoad could not be created due to an invalid weight.");
		}
		if(value < 0.0)
		{
			throw new IllegalArgumentException ("This ProductLoad could not be created due to an invalid dollar value.");
		}
		this.name = name;
		this.weight = weight;
		this.value = value;
		this.isDangerous = isDangerous;
	}
	
	/**
	 * Sets the value of <code>name</code> to the String value passed in.
	 * @param name = The name of the product - String
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Sets the value of <code>weight</code> to the double value passed in.
	 * @param weight = The weight of the product in tons - Double
	 * @throws IllegalArgumentException - Indicates that <code>weight</code> is an invalid value.
	 */
	public void setWeight(double weight) throws IllegalArgumentException
	{
		if(weight < 0.0)
		{
			throw new IllegalArgumentException ("This is an invalid weight.");
		}
		this.weight = weight;
	}
	
	/**
	 * Sets the value of <code>value</code> to the double value passed in.
	 * @param value = The value of the product in dollars - Double
	 * @throws IllegalArgumentException - Indicates that <code>value</code> is an invalid value.
	 */
	public void setValue(double value) throws IllegalArgumentException
	{
		if(value < 0.0)
		{
			throw new IllegalArgumentException ("This is an invalid dollar value.");
		}
		this.value = value;
	}
	
	/**
	 * Sets the value of <code>isDangerous</code> to the boolean value passed in.
	 * @param isDangerous = The dangerousness of the product - Booleam
	 */
	public void setisDangerous(boolean isDangerous)
	{
		this.isDangerous = isDangerous;
	}
	
	/**
	 * Returns the value of <code>name</code> - String
	 * @return name - String
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Returns the value of <code>weight</code> - Double
	 * @return weight - Double
	 */
	public double getWeight()
	{
		return this.weight;
	}

	/**
	 * Returns the value of <code>value</code> - Double
	 * @return value - Double
	 */
	public double getValue()
	{
		return this.value;
	}

	/**
	 * Returns the value of <code>isDangerous</code> - Boolean
	 * @return isDangerous - Boolean
	 */
	public boolean getisDangerous()
	{
		return this.isDangerous;
	}	
}
