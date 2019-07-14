package br.com.aledsz.monjadoces.enums;

/**
 *
 * @author aleDsz
 */
public enum StockMovementTypes {
    ENTRADA(0), SAIDA(1), INVENTARIO(2);
    
    private final int movementType;
    StockMovementTypes(int movementType){
        this.movementType = movementType;
    }

    public int getMovementType(){
        return movementType;
    }
}
