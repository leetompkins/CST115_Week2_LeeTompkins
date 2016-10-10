import javafx.scene.image.Image;

public class Drink extends Product{
	private int calories;
	private int caffiene;
	private int sugar;
	private Image image; 
	
	
	public Drink(Drink drink) {
		this.calories = drink.calories;
		this.caffiene = drink.caffiene;
		this.sugar = drink.sugar;
		this.image = drink.image; 
		
	}
	
	
	
	
	public Drink(int calories, int caffiene, int sugar, Image image) {
		super();
		this.calories = calories;
		this.caffiene = caffiene;
		this.sugar = sugar;
		this.image = image;
	}
	/**
	 * @return the calories
	 */
	public int getCalories() {
		return calories;
	}
	/**
	 * @param calories the calories to set
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
	/**
	 * @return the caffiene
	 */
	public int getCaffiene() {
		return caffiene;
	}
	/**
	 * @param caffiene the caffiene to set
	 */
	public void setCaffiene(int caffiene) {
		this.caffiene = caffiene;
	}
	/**
	 * @return the sugar
	 */
	public int getSugar() {
		return sugar;
	}
	/**
	 * @param sugar the sugar to set
	 */
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	/**
	 * @return the image
	 */
	public Image getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(Image image) {
		this.image = image;
	}
	

	
	
	
	
	Drink(){
		
	}
	@Override
	public String toString(){
		return "Drink Class";
	}
}
