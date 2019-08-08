package br.com.aledsz.monjadoces.models;


/**
 *
 * @author aleDsz
 */
public class PaymentMethod extends Model {

    private String slug;
    private String name;
    private boolean status;

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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
