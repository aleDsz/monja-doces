package br.com.aledsz.monjadoces.models;

import java.util.Date;

/**
 *
 * @author aleDsz
 */
public class User {

    private int id;
    private String name;
    private String document;
    private String codeAccess;
    private String passwordAccess;
    private Date insertedAt;
    private Date updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getCodeAccess() {
        return codeAccess;
    }

    public void setCodeAccess(String codeAccess) {
        this.codeAccess = codeAccess;
    }

    public String getPasswordAccess() {
        return passwordAccess;
    }

    public void setPasswordAccess(String passwordAccess) {
        this.passwordAccess = passwordAccess;
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
