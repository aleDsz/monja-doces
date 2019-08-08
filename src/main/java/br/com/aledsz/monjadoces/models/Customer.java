package br.com.aledsz.monjadoces.models;

/**
 *
 * @author aleDsz
 */
public class Customer extends Model {

    private String name;
    private String businessName;
    private String document;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
