package co.capitole.inditex.model;

public class ResponseServiceDTO {

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

    public ResponseServiceDTO(ResponseServiceBuilder builder) {
        this.productId = builder.productId;
        this.brandId = builder.brandId;
        this.priceList = builder.priceList;
        this.applicationDates = builder.applicationDates;
        this.price = builder.price;
    }

    public ResponseServiceDTO() {
    }

    public static class ResponseServiceBuilder {

        private int productId;
        private String brandId;
        private int priceList;
        private String applicationDates;
        private double price;

        public ResponseServiceBuilder ProductId(int productId) {
            this.productId = productId;
            return this;
        }

        public ResponseServiceBuilder BrandId(String brandId) {
            this.brandId = brandId;
            return this;
        }

        public ResponseServiceBuilder PriceList(int priceList) {
            this.priceList = priceList;
            return this;
        }

        public ResponseServiceBuilder StartDate(String applicationDates) {
            this.applicationDates = applicationDates;
            return this;
        }

        public ResponseServiceBuilder Price(double price) {
            this.price = price;
            return this;
        }

        public ResponseServiceDTO builder() {
            return new ResponseServiceDTO(this);
        }
    }
}
