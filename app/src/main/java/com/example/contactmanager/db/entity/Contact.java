package com.example.contactmanager.db.entity;

import android.media.JetPlayer;

public class Contact {
    // 1-constant for database
    public static final String TABLE_NAME = "contacts";
    public static  final String COLUMN_ID = "contact_id";
        public static final String COLUMN_NAME =    "contact_name";
    public static final String  COLUMN_EMAIL = "contact_email";
    // 2-  variables
    private  String name;
    private String email;
    private  int id;
    // 3-constructor
    private Contact(){


    }
    private Contact(String name, String email, int id){
     this.email = email;
     this.name = name;
     this.id = id;
    }
// getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // SQL Query = creating the table
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME+ "("
            + COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COLUMN_NAME + " TEXT,"
            + COLUMN_EMAIL + " DATETIME DEFAULT CURRENT_TIMESTAMP"
            + ")";
}
