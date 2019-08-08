package br.com.aledsz.monjadoces.models;

/**
 *
 * @author aleDsz
 */
public class Product extends Model {

    private int categoryId;
    private int unityId;
    private String slug;
    private String name;
    private String description;
    private double price;
    private boolean status;
    
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    
    public int getUnityId() {
        return unityId;
    }

    public void setUnityId(int unityId) {
        this.unityId = unityId;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
