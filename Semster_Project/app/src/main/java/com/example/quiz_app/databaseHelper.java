//package com.example.quiz_app;
//
////Database helper class for accessing the database.
////SQLiteAssetHelper library is used for accessing the database from assets folder.
//
//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//import android.database.sqlite.SQLiteQueryBuilder;
//import android.util.Log;
//import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;
//
//public class databaseHelper extends SQLiteOpenHelper {
//
//    //The database name stored in assets folder.
//    private static final String DATABASE_NAME = "questionsDB.db";
//    private static final int DATABASE_VERSION = 1;
//
//    public databaseHelper(Context context) {
//        super(context, DATABASE_NAME, null, DATABASE_VERSION);
//    }
//
//    //method for accessing the questions and options from the database.
//    public Cursor getSetQuestions(String setDetails){
//
//        SQLiteDatabase db=getReadableDatabase();
//        SQLiteQueryBuilder qb=new SQLiteQueryBuilder();
//        String table="queTable";
//        String[] columns={"question", "optionA", "optionB", "optionC", "optionD", "answerKey"};
//        String[] key={setDetails};
//        qb.setTables(table);
//        Cursor cursor=qb.query(db, columns, "setDetails=?", key, null,null,null);
//        cursor.moveToFirst();
//        return cursor;
//    }
//}
