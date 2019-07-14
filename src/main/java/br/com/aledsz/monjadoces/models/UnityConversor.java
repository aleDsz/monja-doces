package br.com.aledsz.monjadoces.models;

import java.util.Date;

/**
 *
 * @author aleDsz
 */
public class UnityConversor {

    private int id;
    private int fromUnityId;
    private int toUnityId;
    private double conversorCoefficient;
    private Date insertedAt;
    private Date updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFromUnityId() {
        return fromUnityId;
    }

    public void setFromUnityId(int fromUnityId) {
        this.fromUnityId = fromUnityId;
    }

    public int getToUnityId() {
        return toUnityId;
    }

    public void setToUnityId(int toUnityId) {
        this.toUnityId = toUnityId;
    }

    public double getConversorCoefficient() {
        return conversorCoefficient;
    }

    public void setConversorCoefficient(double conversorCoefficient) {
        this.conversorCoefficient = conversorCoefficient;
    }

    public Date getInsertedAt() {
        return insertedAt;
    }

    public void setInsertedAt(Date insertedAt) {
        this.insertedAt = insertedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
