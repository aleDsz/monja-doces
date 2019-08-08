package br.com.aledsz.monjadoces.models;

/**
 *
 * @author aleDsz
 */
public class Stock extends Model {

    private int machineId;
    private String name;

    public int getMachineId() {
        return machineId;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
