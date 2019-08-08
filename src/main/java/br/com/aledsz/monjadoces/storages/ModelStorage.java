package br.com.aledsz.monjadoces.storages;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author aleDsz
 */
public class ModelStorage {

    protected List<String> fields = new ArrayList<>();
    protected String fileName = null;
    protected List fileData = null;

    public ModelStorage() {
        this.fields.clear();
        this.fields.add("id");
        this.fields.add("insertedAt");
        this.fields.add("updatedAt");

        this.fileName = "model.json";
    }
    
    // System.getProperty("user.dir") = H:\Development\Github\aleDsz\monja-doces
    public void saveFile() {
        try {
            String filePath = System.getProperty("user.dir") + File.pathSeparator + this.fileName;
            FileWriter file = new FileWriter(filePath);
            file.write(this.getDataAsJson());
            file.close();
        } catch (IOException ex) {
            System.err.println(
                    "Ocorreu um erro durante o armazenamento do arquivo " +
                    "'" + this.fileName + "', pois " + ex.getMessage()
            );
        }
    }
    
    /*
     * Example JSON:
     * [
     *     {
     *         "id": 123,
     *         "card": null,
     *         "status": true,
     *         "price": 12.50,
     *         "description": "asdasdsa",
     *         "insertedAt": "2019-05-07T01:50:00Z",
     *         "updatedAt": "2019-05-07T01:50:00Z"
     *     }
     * ]
     */
    private String getDataAsJson() {
        String json = "[";
        
        for (Object o : this.fileData) {
            String object = "{";
            
            for (String fieldName : this.fields) {
                object += "\"" + fieldName + "\": ";
                Object value = null;
                
                try {
                    value = o.getClass().getField(fieldName);
                } catch (NoSuchFieldException ex) {
                    System.err.println(
                            "Ocorreu um erro durante a conversão do JSON pro arquivo " +
                            "'" + this.fileName + "', pois " + ex.getMessage()
                    );
                }
                
                if (value == null) {
                    object += "null,";
                } else {
                    switch (value.getClass().getTypeName()) {
                        case "Boolean":
                            if (value.equals(true)) {
                                object += "true,";
                            } else {
                                object += "false,";
                            }
                            break;
                             
                        case "String":
                            object += "\"" + value.toString() + "\",";
                            break;
                            
                        case "Integer":
                        case "Double":
                        case "Float":
                        case "BigInt":
                            object += value.toString() + ",";
                            break;
                            
                        case "Date":
                            DateFormat dateFormat = DateFormat.getDateInstance();
                            Date date = new Date();
                            
                            try {
                                date = dateFormat.parse(value.toString());
                            } catch (Exception ex) {
                                System.err.println(
                                        "Ocorreu um erro durante a conversão do JSON pro arquivo " +
                                        "'" + this.fileName + "', pois " + ex.getMessage()
                                );
                            }
                            
                            SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-ddTHH:mm:ssZ");
                            
                            String dateFormatted = dateFormatter.format(date);
                            object += "\"" + dateFormatted + "\",";
                            break;
                    }
                }
            }
            
            object = object.substring(0, object.length() - 1);
            object += "}";

            json += object + ",";
        }

        json = json.substring(0, json.length() - 1);
        json += "]";
        
        return json;
    }
}