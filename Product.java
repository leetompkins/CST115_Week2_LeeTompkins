public abstract class Product{
	protected String name;
	protected double price;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	Product(){
		
	}
	Product(Product product) {
		this.name = product.name;
		this.price = product.price;
	}
	
	@Override
	public String toString(){
		return "Product Class";
	}
	
}