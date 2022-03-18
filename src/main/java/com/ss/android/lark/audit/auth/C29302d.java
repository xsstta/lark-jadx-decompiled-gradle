package com.ss.android.lark.audit.auth;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.audit.AbstractC29324f;
import com.ss.android.lark.audit.p1377a.C29287d;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.audit.auth.d */
public class C29302d extends SQLiteOpenHelper implements AbstractC29324f.AbstractC29326b {
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public C29302d(Context context) {
        super(context, "audit_sdk_permission.db", (SQLiteDatabase.CursorFactory) null, 1);
        onCreate(getWritableDatabase());
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(String.format("create table if not exists %s (%s TEXT primary key, %s TEXT, %s BLOB, %s BLOB)", "audit_permission_data", "user_id", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "iv", Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
        } catch (Throwable th) {
            C29287d.m107656a("AuditPerm_DBHelper", th);
        }
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29326b
    public void deletePermissionData(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                Log.m165383e("AuditPerm_DBHelper", "[From DB]: delete permission data failed for empty userId!");
                return;
            }
            boolean z = true;
            long delete = (long) getWritableDatabase().delete("audit_permission_data", "user_id=?", new String[]{str});
            StringBuilder sb = new StringBuilder();
            sb.append("audit_permission_data delete permission data result: ");
            if (delete == -1) {
                z = false;
            }
            sb.append(z);
            Log.m165389i("AuditPerm_DBHelper", sb.toString());
        } catch (Throwable th) {
            C29287d.m107656a("AuditPerm_DBHelper", th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067 A[EDGE_INSN: B:20:0x0067->B:14:0x0067 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003d A[Catch:{ all -> 0x0070 }] */
    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29326b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.lark.audit.auth.TransactionalPermData queryPermissionData(java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.audit.auth.C29302d.queryPermissionData(java.lang.String):com.ss.android.lark.audit.auth.TransactionalPermData");
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29326b
    public void savePermissionData(String str, String str2, byte[] bArr, byte[] bArr2) {
        try {
            if (TextUtils.isEmpty(str)) {
                Log.m165383e("AuditPerm_DBHelper", "[To DB]: save permission data failed for empty userId!");
                return;
            }
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("user_id", str);
            contentValues.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, str2);
            contentValues.put("iv", bArr);
            contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bArr2);
            if (writableDatabase.replace("audit_permission_data", null, contentValues) == -1) {
                Log.m165383e("AuditPerm_DBHelper", "audit_permission_data save permission data failed!");
            } else {
                Log.m165389i("AuditPerm_DBHelper", "audit_permission_data save permission data successfully");
            }
        } catch (Throwable th) {
            C29287d.m107656a("AuditPerm_DBHelper", th);
        }
    }
}
