package com.ss.android.lark.audit.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.audit.AbstractC29324f;
import com.ss.android.lark.audit.C29323e;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.audit.db.b */
public class C29313b implements AbstractC29324f.AbstractC29325a {

    /* renamed from: a */
    private C29312a f73359a;

    /* renamed from: b */
    private volatile Context f73360b;

    /* renamed from: c */
    private volatile boolean f73361c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.audit.db.b$a */
    public static class C29315a {

        /* renamed from: a */
        public static final C29313b f73362a = new C29313b();
    }

    private C29313b() {
    }

    /* renamed from: a */
    public static C29313b m107749a() {
        return C29315a.f73362a;
    }

    /* renamed from: b */
    private boolean m107750b() {
        if (this.f73360b == null || !this.f73361c) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public synchronized void mo103891a(Context context) {
        if (!m107750b()) {
            this.f73360b = context;
            ArrayList arrayList = new ArrayList();
            arrayList.add(C29323e.class.getSimpleName());
            C29312a aVar = new C29312a(context, arrayList);
            this.f73359a = aVar;
            this.f73359a.onCreate(aVar.getWritableDatabase());
            this.f73361c = true;
        }
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29325a
    public List<AuditDBData> queryAuditData(String str, int i) {
        if (!m107750b()) {
            return new ArrayList();
        }
        Log.m165389i("WsDB", "[query data]: tableName = " + str + " query count = " + i);
        SQLiteDatabase readableDatabase = this.f73359a.getReadableDatabase();
        String[] strArr = {"time", Constants.ScionAnalytics.MessageType.DATA_MESSAGE};
        Cursor query = readableDatabase.query(str, strArr, null, null, null, null, "time", i + "");
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            arrayList.add(new AuditDBData(query.getLong(query.getColumnIndex("time")), query.getString(query.getColumnIndex(Constants.ScionAnalytics.MessageType.DATA_MESSAGE))));
        }
        query.close();
        return arrayList;
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29325a
    public void recordAuditData(String str, String str2) {
        boolean z;
        if (m107750b()) {
            Log.m165389i("WsDB", "[insert data]: tableName = " + str + " data = " + str2);
            SQLiteDatabase writableDatabase = this.f73359a.getWritableDatabase();
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
            Log.m165389i("WsDB", sb.toString());
        }
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29325a
    public void deleteAuditData(String str, List<AuditDBData> list) {
        if (m107750b()) {
            Log.m165389i("WsDB", "[delete data]: tableName = " + str + " delete count = " + list.size());
            SQLiteDatabase writableDatabase = this.f73359a.getWritableDatabase();
            StringBuilder sb = new StringBuilder();
            for (AuditDBData auditDBData : list) {
                sb.append(auditDBData.f73356a);
                sb.append(",");
            }
            String sb2 = sb.toString();
            if (list.size() > 0) {
                sb2 = sb2.substring(0, sb2.length() - 1);
            }
            writableDatabase.execSQL("delete from " + str + " where " + "time" + " in(" + sb2 + ")");
        }
    }
}
