package kodlamaio.northwind.entities.concretes;

public class Product {
	private int id;
	private int categoryId;
	private String productName;
	private double unitPrice;
	private short unitsInStock;
	private String quantitiyPerUnit;

	public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock,
			String quantitiyPerUnit) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.quantitiyPerUnit = quantitiyPerUnit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public short getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(short unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getQuantitiyPerUnit() {
		return quantitiyPerUnit;
	}

	public void setQuantitiyPerUnit(String quantitiyPerUnit) {
		this.quantitiyPerUnit = quantitiyPerUnit;
	}

}
