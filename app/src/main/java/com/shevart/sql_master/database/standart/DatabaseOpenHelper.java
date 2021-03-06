package com.shevart.sql_master.database.standart;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.shevart.sql_master.core.AppConfiguration;
import com.shevart.sql_master.database.standart.contract.MessageContract;
import com.shevart.sql_master.database.standart.contract.UserContract;
import com.shevart.sql_master.database.standart.contract.UserMessagesRelationContract;

class DatabaseOpenHelper extends SQLiteOpenHelper {
    DatabaseOpenHelper(Context context) {
        super(context, AppConfiguration.Database.DATABASE_NAME, null,
                AppConfiguration.Database.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // create tables
        sqLiteDatabase.execSQL(UserContract.Script.Create.CREATE);
        sqLiteDatabase.execSQL(MessageContract.Script.Create.CREATE);
        sqLiteDatabase.execSQL(UserMessagesRelationContract.Script.Create.CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }
}