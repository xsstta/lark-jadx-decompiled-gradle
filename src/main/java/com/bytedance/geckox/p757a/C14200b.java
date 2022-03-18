package com.bytedance.geckox.p757a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.statistic.model.StatisticModel;
import com.bytedance.geckox.utils.C14350a;
import com.bytedance.geckox.utils.C14355c;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.geckox.a.b */
class C14200b extends SQLiteOpenHelper {

    /* renamed from: a */
    private static volatile C14200b f37350a;

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<StatisticModel.PackageStatisticModel> mo52080a() {
        Cursor cursor;
        Exception e;
        String str;
        ArrayList arrayList = new ArrayList();
        Cursor cursor2 = null;
        try {
            cursor = getWritableDatabase().query("geckox_clean_statistic", null, null, null, null, null, null);
            if (cursor == null) {
                return arrayList;
            }
            while (cursor.moveToNext()) {
                try {
                    String string = cursor.getString(cursor.getColumnIndex("access_key"));
                    String string2 = cursor.getString(cursor.getColumnIndex("channel"));
                    int i = cursor.getInt(cursor.getColumnIndex("clean_type"));
                    int i2 = cursor.getInt(cursor.getColumnIndex(UpdateKey.STATUS));
                    int i3 = cursor.getInt(cursor.getColumnIndex("err_code"));
                    String string3 = cursor.getString(cursor.getColumnIndex("err_msg"));
                    int i4 = cursor.getInt(cursor.getColumnIndex("clean_strategy"));
                    long j = cursor.getLong(cursor.getColumnIndex("clean_duration"));
                    StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                    packageStatisticModel.accessKey = string;
                    packageStatisticModel.channel = string2;
                    packageStatisticModel.statsType = Integer.valueOf(i2);
                    packageStatisticModel.id = Long.valueOf((long) cursor.getInt(cursor.getColumnIndex("pkg_id")));
                    if (i3 == 0) {
                        str = null;
                    } else {
                        str = i3 + "";
                    }
                    packageStatisticModel.errCode = str;
                    packageStatisticModel.errMsg = string3;
                    packageStatisticModel.cleanType = Integer.valueOf(i);
                    packageStatisticModel.cleanDuration = Long.valueOf(j);
                    packageStatisticModel.cleanStrategy = Integer.valueOf(i4);
                    arrayList.add(packageStatisticModel);
                } catch (Exception e2) {
                    e = e2;
                    cursor2 = cursor;
                    C14276b.m57603a("clean-channel", "get all statistic failed!", e);
                    cursor = cursor2;
                    C14355c.m57818a(cursor);
                    return arrayList;
                }
            }
            getWritableDatabase().delete("geckox_clean_statistic", null, null);
            C14355c.m57818a(cursor);
            return arrayList;
        } catch (Exception e3) {
            e = e3;
            C14276b.m57603a("clean-channel", "get all statistic failed!", e);
            cursor = cursor2;
            C14355c.m57818a(cursor);
            return arrayList;
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists geckox_clean_statistic (id integer primary key autoincrement,access_key text,channel text,clean_type integer,status integer,pkg_id integer,err_code integer,clean_strategy integer,clean_duration integer,err_msg text)");
    }

    /* renamed from: a */
    public static C14200b m57324a(Context context) {
        if (f37350a == null) {
            synchronized (C14200b.class) {
                if (f37350a == null) {
                    Context applicationContext = context.getApplicationContext();
                    f37350a = new C14200b(applicationContext, "geckox_clean_statistic" + C14350a.m57810c(context) + ".db", null, 1);
                }
            }
        }
        return f37350a;
    }

    private C14200b(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52081a(String str, String str2, int i, int i2, long j, int i3, String str3, long j2, int i4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("access_key", str);
        contentValues.put("channel", str2);
        contentValues.put("clean_type", Integer.valueOf(i));
        contentValues.put(UpdateKey.STATUS, Integer.valueOf(i2));
        contentValues.put("pkg_id", Long.valueOf(j));
        contentValues.put("err_code", Integer.valueOf(i3));
        contentValues.put("err_msg", str3);
        contentValues.put("clean_duration", Long.valueOf(j2));
        contentValues.put("clean_strategy", Integer.valueOf(i4));
        try {
            getWritableDatabase().insert("geckox_clean_statistic", null, contentValues);
        } catch (Exception e) {
            C14276b.m57603a("clean-channel", "insert failed", e);
        }
    }
}
