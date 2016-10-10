import javafx.scene.image.Image;

public abstract class Snack extends Product {
	protected int calories;
	protected int sugar;
	protected Image image; 
	
	// No args constructor 
	Snack() {

	}
	
	public Snack(Product product) {
		super(product);
		
	}

	public Snack(int calories, int sugar, Image image) {
		super();
		this.calories = calories;
		this.sugar = sugar;
		this.image = image;
	}

	@Override
	public String toString(){
		return "Snack Class";
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
}
