package br.com.aledsz.monjadoces.models;

/**
 *
 * @author aleDsz
 */
public class UnityConversor extends Model {

    private int fromUnityId;
    private int toUnityId;
    private double conversorCoefficient;

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
}
