package com.ss.android.lark.wschannelprocess.statistics.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.log.Log;
import java.util.List;

/* renamed from: com.ss.android.lark.wschannelprocess.statistics.db.b */
public class C59328b extends SQLiteOpenHelper {

    /* renamed from: a */
    private List<String> f147299a;

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        for (String str : this.f147299a) {
            Log.m165389i("WsDB", "create table: " + str);
            sQLiteDatabase.execSQL("create table if not exists " + str + " ( " + "time" + " long primary key, " + Constants.ScionAnalytics.MessageType.DATA_MESSAGE + " vchar(255) )");
        }
    }

    public C59328b(Context context, List<String> list) {
        super(context, "wschannel_log", (SQLiteDatabase.CursorFactory) null, 1);
        this.f147299a = list;
    }
}
