package Models.DBModels;

/**
 * Write later
 * @author MinhTD
 */
public class Book {
    private int id;
    private String title;
    private String description;
    private String thumbnail;
    private int salePrice;
    private int price;
    private int discount;
    private int quantity;
    private int soleTotal;
    private boolean isAvailable;
    private int pubisherId;
    private int languageId;

    public Book() {
    }

    public Book(int id, String title, String description, String thumbnail, int salePrice, int price, int discount, int quantity, int soleTotal, boolean isAvailable, int pubisherId, int languageId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.salePrice = salePrice;
        this.price = price;
        this.discount = discount;
        this.quantity = quantity;
        this.soleTotal = soleTotal;
        this.isAvailable = isAvailable;
        this.pubisherId = pubisherId;
        this.languageId = languageId;
    }

    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSoleTotal() {
        return soleTotal;
    }

    public void setSoleTotal(int soleTotal) {
        this.soleTotal = soleTotal;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getPubisherId() {
        return pubisherId;
    }

    public void setPubisherId(int pubisherId) {
        this.pubisherId = pubisherId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }
    
    // </editor-fold>
}

    