package br.com.aledsz.monjadoces.models;

import br.com.aledsz.monjadoces.enums.StockMovementTypes;

/**
 *
 * @author aleDsz
 */
public class StockItem extends Model {

    private int userId;
    private int stockId;
    private int productId;
    private int unityId;
    private int stockMovementType;
    private double oldQuantity;
    private double movementQuantity;
    private double actualQuantity;
    
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getUnityId() {
        return unityId;
    }

    public void setUnityId(int unityId) {
        this.unityId = unityId;
    }
    
    public int getStockMovementType() {
        return this.stockMovementType;
    }

    public void setStockMovementType(StockMovementTypes stockMovementType) {
        if (stockMovementType == StockMovementTypes.ENTRADA) {
            this.stockMovementType = 0;
        } else if (stockMovementType == StockMovementTypes.SAIDA) {
            this.stockMovementType = 1;
        } else if (stockMovementType == StockMovementTypes.INVENTARIO) {
            this.stockMovementType = 2;
        } else {
            this.stockMovementType = 0;
        }
    }

    public double getOldQuantity() {
        return oldQuantity;
    }

    public void setOldQuantity(double oldQuantity) {
        this.oldQuantity = oldQuantity;
    }

    public double getMovementQuantity() {
        return movementQuantity;
    }

    public void setMovementQuantity(double movementQuantity) {
        this.movementQuantity = movementQuantity;
    }

    public double getActualQuantity() {
        return actualQuantity;
    }

    public void setActualQuantity(double actualQuantity) {
        this.actualQuantity = actualQuantity;
    }
}
