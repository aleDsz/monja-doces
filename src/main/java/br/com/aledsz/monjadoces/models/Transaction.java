package br.com.aledsz.monjadoces.models;

import java.util.Date;

/**
 *
 * @author aleDsz
 */
public class Transaction {

    private int id;
    private int paymentMethodId;
    private int machineId;
    private int acquirerId;
    private double amount;
    private String customer;
    private String machineNSU;
    private String acquirerNSU;
    private String acquirerCode;
    private String acquirerMessage;
    private Date insertedAt;
    private Date updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(int paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public int getMachineId() {
        return machineId;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public int getAcquirerId() {
        return acquirerId;
    }

    public void setAcquirerId(int acquirerId) {
        this.acquirerId = acquirerId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getMachineNSU() {
        return machineNSU;
    }

    public void setMachineNSU(String machineNSU) {
        this.machineNSU = machineNSU;
    }

    public String getAcquirerNSU() {
        return acquirerNSU;
    }

    public void setAcquirerNSU(String acquirerNSU) {
        this.acquirerNSU = acquirerNSU;
    }

    public String getAcquirerCode() {
        return acquirerCode;
    }

    public void setAcquirerCode(String acquirerCode) {
        this.acquirerCode = acquirerCode;
    }

    public String getAcquirerMessage() {
        return acquirerMessage;
    }

    public void setAcquirerMessage(String acquirerMessage) {
        this.acquirerMessage = acquirerMessage;
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
