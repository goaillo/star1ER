package fr.istic.starproviderER;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by 17009495 on 14/11/17.
 */

public class DatabaseHelper extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "star.db";
    private static final int version = 1;
    private static final String TABLE_BUS_ROUTES = StarContract.BusRoutes.CONTENT_PATH;
    private static final String TABLE_TRIPS = StarContract.Trips.CONTENT_PATH;
    private static final String TABLE_STOPS = StarContract.Stops.CONTENT_PATH;
    private static final String TABLE_STOP_TIMES = StarContract.StopTimes.CONTENT_PATH;
    private static final String TABLE_CALENDAR = StarContract.Calendar.CONTENT_PATH;

    private static final String DATABASE_CREATE_TABLE_BUS_ROUTES =
            "CREATE TABLE if not exists TABLE_BUS_ROUTES" +
                    "(route_id integer primary not null, " +
                    StarContract.BusRoutes.BusRouteColumns.SHORT_NAME + "text, "+
                    StarContract.BusRoutes.BusRouteColumns.LONG_NAME + "text, "+
                    StarContract.BusRoutes.BusRouteColumns.DESCRIPTION + "text, " +
                    StarContract.BusRoutes.BusRouteColumns.TYPE + "";

    String SHORT_NAME = "route_short_name";
    String LONG_NAME = "route_long_name";
    String DESCRIPTION = "route_desc";
    String TYPE = "route_type";
    String COLOR = "route_color";
    String TEXT_COLOR = "route_text_color";



    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
