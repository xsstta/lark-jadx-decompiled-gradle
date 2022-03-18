package com.ss.android.lark.wschannelprocess.statistics.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.wschannelprocess.C59307d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.wschannelprocess.statistics.db.a */
public class C59325a {

    /* renamed from: a */
    private C59328b f147297a;

    /* renamed from: com.ss.android.lark.wschannelprocess.statistics.db.a$a */
    private static class C59327a {

        /* renamed from: a */
        public static final C59325a f147298a = new C59325a();
    }

    /* renamed from: a */
    public static C59325a m230337a() {
        return C59327a.f147298a;
    }

    private C59325a() {
        Context a = C59307d.m230286b().mo177782a();
        ArrayList arrayList = new ArrayList();
        arrayList.add("AppLogRecorder");
        arrayList.add("TeaLogRecorder");
        this.f147297a = new C59328b(a, arrayList);
    }

    /* renamed from: a */
    public void mo201650a(String str, String str2) {
        boolean z;
        Log.m165379d("WsDB", "[insert data]: tableName = " + str + " data = " + str2);
        SQLiteDatabase writableDatabase = this.f147297a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("time", Long.valueOf(System.nanoTime()));
        contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str2);
        long insert = writableDatabase.insert(str, null, contentValues);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" background save record ");
        if (insert != -1) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        Log.m165379d("WsDB", sb.toString());
    }

    /* renamed from: a */
    public List<DBData> mo201649a(String str, int i) {
        Log.m165379d("WsDB", "[query data]: tableName = " + str + " query count = " + i);
        SQLiteDatabase readableDatabase = this.f147297a.getReadableDatabase();
        String[] strArr = {"time", Constants.ScionAnalytics.MessageType.DATA_MESSAGE};
        Cursor query = readableDatabase.query(str, strArr, null, null, null, null, "time", i + "");
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            long j = query.getLong(query.getColumnIndex("time"));
            String string = query.getString(query.getColumnIndex(Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
            DBData dBData = new DBData(j, string);
            Log.m165379d("WsDB", "query result: " + string);
            arrayList.add(dBData);
        }
        query.close();
        return arrayList;
    }

    /* renamed from: a */
    public void mo201651a(String str, List<DBData> list) {
        Log.m165379d("WsDB", "[delete data]: tableName = " + str + " delete count = " + list.size());
        SQLiteDatabase writableDatabase = this.f147297a.getWritableDatabase();
        StringBuilder sb = new StringBuilder();
        for (DBData dBData : list) {
            sb.append(dBData.time);
            sb.append(",");
        }
        String sb2 = sb.toString();
        if (list.size() > 0) {
            sb2 = sb2.substring(0, sb2.length() - 1);
        }
        writableDatabase.execSQL("delete from " + str + " where " + "time" + " in(" + sb2 + ")");
    }
}
