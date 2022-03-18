package com.bytedance.bdturing.localstorage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.bytedance.bdturing.LogUtil;
import com.huawei.hms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004J\u0018\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010\u00042\u0006\u0010 \u001a\u00020\u0004H\u0002J\u0010\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010 \u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u00008FX\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R(\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00048F@FX\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006%"}, d2 = {"Lcom/bytedance/bdturing/localstorage/DbManager;", "", "()V", "KEY_SEAL_EVENT", "", "KEY_SETTINGS", "KEY_TURING_EVENT", "TAG", "instance", "instance$annotations", "getInstance", "()Lcom/bytedance/bdturing/localstorage/DbManager;", "mOpenHelper", "Lcom/bytedance/bdturing/localstorage/DbHelper;", "value", "settingsStr", "getSettingsStr", "()Ljava/lang/String;", "setSettingsStr", "(Ljava/lang/String;)V", "closeDB", "", "delete", "", "id", "getDb", "Landroid/database/sqlite/SQLiteDatabase;", "init", "context", "Landroid/content/Context;", "insert", "", "key", "content", "insertOrUpdate", SearchIntents.EXTRA_QUERY, "queryAndDelete", "setting_i18nRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.bdturing.b.b */
public final class DbManager {

    /* renamed from: a */
    public static final DbManager f11148a = new DbManager();

    /* renamed from: b */
    private static DbHelper f11149b;

    private DbManager() {
    }

    /* renamed from: a */
    public final String mo14298a() {
        return m14864b("settings");
    }

    /* renamed from: b */
    private final SQLiteDatabase m14863b() {
        SQLiteDatabase sQLiteDatabase = null;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            DbHelper aVar = f11149b;
            if (aVar != null) {
                sQLiteDatabase = aVar.getWritableDatabase();
            }
            return sQLiteDatabase;
        } catch (SQLiteException e) {
            LogUtil.m14894a(e);
            return sQLiteDatabase2;
        }
    }

    /* renamed from: a */
    public final void mo14300a(String str) {
        if (str != null) {
            m14862a("settings", str);
        }
    }

    /* renamed from: a */
    public final void mo14299a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        synchronized (this) {
            f11149b = new DbHelper(context);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    private final String m14864b(String str) {
        Cursor cursor;
        String str2;
        synchronized (this) {
            LogUtil.m14899d("DbManager", SearchIntents.EXTRA_QUERY);
            SQLiteDatabase b = f11148a.m14863b();
            if (b != null) {
                cursor = b.query("h5_storage", new String[]{"content"}, "primary_key=?", new String[]{str}, null, null, null, "1");
            } else {
                cursor = null;
            }
            str2 = null;
            if (cursor != null && cursor.moveToFirst()) {
                str2 = cursor.getString(0);
            }
            if (cursor != null) {
                cursor.close();
            }
        }
        return str2;
    }

    /* renamed from: a */
    private final long m14862a(String str, String str2) {
        long j;
        synchronized (this) {
            LogUtil.m14895a("DbManager", "insertOrUpdate: " + str);
            LogUtil.m14899d("DbManager", "content: " + str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("primary_key", str);
            contentValues.put("time_stamp", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("content", str2);
            SQLiteDatabase b = f11148a.m14863b();
            Long l = null;
            Long l2 = null;
            j = 0;
            if (b != null) {
                try {
                    l2 = Long.valueOf((long) b.update("h5_storage", contentValues, "primary_key=?", new String[]{str}));
                } catch (SQLException unused) {
                    LogUtil.m14898c("DbManager", "insertOrUpdate fail!");
                }
            } else {
                l2 = null;
            }
            if (l2 != null) {
                if (l2.longValue() == 0) {
                    if (b != null) {
                        l = Long.valueOf(b.insert("h5_storage", null, contentValues));
                    }
                    l2 = l;
                }
            }
            if (l2 != null) {
                j = l2.longValue();
            }
        }
        return j;
    }
}
