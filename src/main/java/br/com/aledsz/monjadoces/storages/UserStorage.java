package br.com.aledsz.monjadoces.storages;

import java.util.ArrayList;

/**
 *
 * @author aleDsz
 */
public class UserStorage extends ModelStorage {

    public UserStorage() {
        this.fields.clear();
        this.fields.add("id");
        this.fields.add("name");
        this.fields.add("document");
        this.fields.add("codeAccess");
        this.fields.add("passwordAccess");
        this.fields.add("insertedAt");
        this.fields.add("updatedAt");

        this.fileName = "users.json";
    }
}