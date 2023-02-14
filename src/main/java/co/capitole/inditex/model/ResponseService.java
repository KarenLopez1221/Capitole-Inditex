package co.capitole.inditex.model;

public class ResponseService {

	private int productId;
	private String brandId;
	private int priceList;
	private String applicationDates;
	private double price;

	public int getProductId() {
		return productId;
	}

	public String getBrandId() {
		return brandId;
	}

	public int getPriceList() {
		return priceList;
	}

	public String getApplicationDates() {
		return applicationDates;
	}

	public double getPrice() {
		return price;
	}

	public ResponseService(ResponseServiceBuilder builder) {
		this.productId = builder.productId;
		this.brandId = builder.brandId;
		this.priceList = builder.priceList;
		this.applicationDates = builder.applicationDates;
		this.price = builder.price;
	}

	public ResponseService() {
	}

	public static class ResponseServiceBuilder {

		private int productId;
		private String brandId;
		private int priceList;
		private String applicationDates;
		private double price;

		public ResponseServiceBuilder productId(int productId) {
			this.productId = productId;
			return this;
		}

		public ResponseServiceBuilder brandId(String brandId) {
			this.brandId = brandId;
			return this;
		}

		public ResponseServiceBuilder priceList(int priceList) {
			this.priceList = priceList;
			return this;
		}

		public ResponseServiceBuilder startDate(String applicationDates) {
			this.applicationDates = applicationDates;
			return this;
		}

		public ResponseServiceBuilder price(double price) {
			this.price = price;
			return this;
		}

		public ResponseService builder() {
			return new ResponseService(this);
		}
	}
}
