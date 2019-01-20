package com.sportsfantasyindia.akshay_galande;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class dbhelper extends SQLiteOpenHelper {

    public static final String db_name = "ep.db";
    public static final String t_name = "emp";
    public static final String c1 = "eid";
    public static final String c2 = "ename";
    public static final String c3 = "sal";
    public static final String create = "CREATE TABLE emp(eid INTEGER PRIMARY KEY,ename TEXT,sal INTEGER);";

    public static final String drop ="DROP TABLE IF EXISTS emp" ;


    public dbhelper(Context context) {
        super(context,t_name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        sqLiteDatabase.execSQL(create);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {

        sqLiteDatabase.execSQL(drop);
        onCreate(sqLiteDatabase);

    }

    public boolean insertdata(String name, String sal)
    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(c2, name);
        contentValues.put(c3, sal);
        long v = sqLiteDatabase.insert("emp", null, contentValues);
        if (v == -1)
            return false;
        else
            return true;
    }

    public Cursor disp() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor r = sqLiteDatabase.rawQuery("select *from " +t_name, null);
        return r;
    }

    public boolean modifydata(String id, String name, String sal) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(c1, id);
        contentValues.put(c2,name);
        contentValues.put(c3,sal);
        db.update(t_name, contentValues, "eid=?",new String[]{id});
        return true;

    }


}


