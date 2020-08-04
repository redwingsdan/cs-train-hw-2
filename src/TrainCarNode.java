/**
 * Dan Peterson
 * 109091561
 * daniel.peterson@stonybrook.edu
 * Homework #2
 * CSE 214 Recitation #5
 * Sun Lin
 * @author Dan
 */
public class TrainCarNode {

	private TrainCarNode nextNode;
	private TrainCarNode prevNode;
	private TrainCar car;
	
	public TrainCarNode()
	{
		nextNode = null;
		prevNode = null;
		car = null;
	}
	/**
	 * Creates an instance of <code>TrainCarNode</code> - Constructor
	 * @param car = The car which will be referenced by a particular <code>TrainCarNode</code> - TrainCar
	 */
	public TrainCarNode(TrainCar car)
	{
		this.car = car;
	}
	
	/**
	 * Sets the value of <code>nextNode</code> to the value passed in.
	 * @param nextNode = The next node which this TrainCarNode will point to - TrainCarNode
	 */
	public void setNextNode(TrainCarNode nextNode)
	{
		this.nextNode = nextNode;
	}
	
	/**
	 * Sets the value of <code>prevNode</code> to the value passed in.
	 * @param prevNode = The previous node which this TrainCarNode will point to - TrainCarNode
	 */
	public void setPrevNode(TrainCarNode prevNode)
	{
		this.prevNode = prevNode;
	}
	
	/**
	 * Sets the value of <code>car</code> to the value passed in.
	 * @param car = The train car which this TrainCarNode will point to - TrainCar
	 */
	public void setCar(TrainCar car)
	{
		this.car = car;
	}
	
	/**
	 * Returns the value of <code>nextNode</code> - TrainCarNode
	 * @return nextNode - TrainCarNode
	 */
	public TrainCarNode getNextNode()
	{
		return this.nextNode;
	}
	
	/**
	 * Returns the value of <code>prevNode</code> - TrainCarNode
	 * @return prevNode - TrainCarNode
	 */
	public TrainCarNode getPrevNode()
	{
		return this.prevNode;
	}
	
	/**
	 * Returns the value of <code>car</code> - TrainCar
	 * @return car - TrainCar
	 */
	public TrainCar getCar()
	{
		return this.car;
	}
	
	/**
	 * Returns the string representation of the current TrainCar - String
	 * @return msg - String
	 */
	public String toString()
	{
		String msg = "Num \tLength (m) \tWeight (t) \t|\tName \tWeight (t) \tValue ($) \tDangerous\n============================================================================\n";
		int i = 1; 
		if(car.isEmpty() == false)
		{
		//msg = msg + String.format("%3s%4s%6s", i, car.getCarLength(), car.getCarWeight());
		//msg = msg + "\n";
			msg = "TrainCar #" + i + "\t" + car.getCarLength() + "\t" + car.getCarWeight() + "\t" + car.getLoad().getName() + "\t" + car.getLoad().getWeight() + "\t" + car.getLoad().getValue() + "\t" + car.getLoad().getisDangerous();
		}
		return msg;
	}
	
}