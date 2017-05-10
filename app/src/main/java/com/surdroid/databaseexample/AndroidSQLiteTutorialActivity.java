package com.surdroid.databaseexample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;


public class AndroidSQLiteTutorialActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);

        /**
         * CRUD Operations
         * */

        Log.d("Count Value", "before insertion" + db.getContactsCount());
        // Inserting Contacts
        Log.d("Insert: ", "Inserting ..");
        db.addContact(new Contact("Ravi", "100000000"));
        db.addContact(new Contact("Ram", "9840176139"));
        db.addContact(new Contact("Tommy", "985555555"));
        db.addContact(new Contact("Chris", "98000010000"));

        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");
        List<Contact> contacts = db.getAllContacts();

        for (Contact cn : contacts) {
            String log = "Id: " + cn.getId() + " ,Name: " + cn.getName() + " ,Phone: " + cn.getPhoneNumber();
            // Writing Contacts to log
            Log.d("Name: ", log);

        }

        Log.d("Count Value", "after insertion" + db.getContactsCount());
    }
}