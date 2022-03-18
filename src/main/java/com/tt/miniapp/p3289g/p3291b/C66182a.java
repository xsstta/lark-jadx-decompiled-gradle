package com.tt.miniapp.p3289g.p3291b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.miniapp.p3289g.p3290a.C66181a;
import com.tt.miniapphost.entity.AppLaunchInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapp.g.b.a */
public class C66182a extends C66181a {
    /* renamed from: e */
    public synchronized void mo231514e() {
        try {
            mo231507a();
            this.f167064b.execSQL(String.format("delete from %s", "TB_RECENT_APPS"));
        } catch (Exception e) {
            AppBrandLogger.m52829e("RecentAppsDao", e);
        } catch (Throwable th) {
            mo231508b();
            throw th;
        }
        mo231508b();
    }

    /* renamed from: d */
    public synchronized List<AppLaunchInfo> mo231513d() {
        ArrayList arrayList;
        SQLiteDatabase sQLiteDatabase;
        boolean z;
        arrayList = new ArrayList();
        try {
            this.f167064b = this.f167063a.getReadableDatabase();
            this.f167065c = this.f167064b.rawQuery(String.format("select * from %s ORDER BY %s DESC", "TB_RECENT_APPS", "timestamp"), null);
            while (this.f167065c.moveToNext()) {
                AppLaunchInfo appLaunchInfo = new AppLaunchInfo();
                appLaunchInfo.appId = this.f167065c.getString(this.f167065c.getColumnIndex("appID"));
                appLaunchInfo.appName = this.f167065c.getString(this.f167065c.getColumnIndex("appName"));
                appLaunchInfo.ttid = this.f167065c.getString(this.f167065c.getColumnIndex("ttid"));
                appLaunchInfo.icon = this.f167065c.getString(this.f167065c.getColumnIndex("icon"));
                appLaunchInfo.type = this.f167065c.getInt(this.f167065c.getColumnIndex(ShareHitPoint.f121869d));
                appLaunchInfo.orientation = this.f167065c.getInt(this.f167065c.getColumnIndex("orientation"));
                appLaunchInfo.mark = this.f167065c.getInt(this.f167065c.getColumnIndex("mark"));
                appLaunchInfo.minJssdk = this.f167065c.getString(this.f167065c.getColumnIndex("minJssdk"));
                appLaunchInfo.schema = this.f167065c.getString(this.f167065c.getColumnIndex("schema"));
                appLaunchInfo.state = this.f167065c.getInt(this.f167065c.getColumnIndex("state"));
                appLaunchInfo.summary = this.f167065c.getString(this.f167065c.getColumnIndex("summary"));
                appLaunchInfo.timestamp = this.f167065c.getLong(this.f167065c.getColumnIndex("timestamp"));
                if (appLaunchInfo.type == 2) {
                    z = true;
                } else {
                    z = false;
                }
                appLaunchInfo.isGame = z;
                arrayList.add(appLaunchInfo);
            }
            mo231509c();
            sQLiteDatabase = this.f167064b;
        } catch (Exception e) {
            AppBrandLogger.m52829e("RecentAppsDao", e);
            mo231509c();
            sQLiteDatabase = this.f167064b;
        } catch (Throwable th) {
            mo231509c();
            this.f167064b.close();
            throw th;
        }
        sQLiteDatabase.close();
        return arrayList;
    }

    public C66182a(SQLiteOpenHelper sQLiteOpenHelper) {
        super(sQLiteOpenHelper);
    }

    /* renamed from: a */
    public synchronized void mo231511a(String str) {
        try {
            mo231507a();
            this.f167064b.execSQL(String.format("delete from %s where appID = '%s'", "TB_RECENT_APPS", str));
        } catch (Exception e) {
            AppBrandLogger.m52829e("RecentAppsDao", e);
        } catch (Throwable th) {
            mo231508b();
            throw th;
        }
        mo231508b();
    }

    /* renamed from: a */
    public synchronized void mo231510a(AppLaunchInfo appLaunchInfo) {
        mo231507a();
        ContentValues contentValues = new ContentValues();
        if (appLaunchInfo != null) {
            contentValues.put("appID", appLaunchInfo.appId);
            contentValues.put("appName", appLaunchInfo.appName);
            contentValues.put("ttid", appLaunchInfo.ttid);
            contentValues.put("icon", appLaunchInfo.icon);
            contentValues.put(ShareHitPoint.f121869d, Integer.valueOf(appLaunchInfo.type));
            contentValues.put("orientation", Integer.valueOf(appLaunchInfo.orientation));
            contentValues.put("mark", Integer.valueOf(appLaunchInfo.mark));
            contentValues.put("minJssdk", appLaunchInfo.minJssdk);
            contentValues.put("schema", appLaunchInfo.schema);
            contentValues.put("state", Integer.valueOf(appLaunchInfo.state));
            contentValues.put("summary", appLaunchInfo.summary);
            contentValues.put("timestamp", Long.valueOf(appLaunchInfo.timestamp));
            AppBrandLogger.m52828d("RecentAppsDao", "appId:", appLaunchInfo.appId, "appName:", appLaunchInfo.appName);
        }
        this.f167064b.replace("TB_RECENT_APPS", null, contentValues);
        mo231508b();
    }

    /* renamed from: a */
    public synchronized void mo231512a(List<AppLaunchInfo> list) {
        if (list != null) {
            if (list.size() != 0) {
                try {
                    mo231507a();
                    SQLiteStatement compileStatement = this.f167064b.compileStatement("replace into TB_RECENT_APPS(appID,appName,ttid,icon,type,orientation,mark,minJssdk,schema,state,summary,timestamp)values(?,?,?,?,?,?,?,?,?,?,?,?)");
                    for (AppLaunchInfo appLaunchInfo : list) {
                        compileStatement.bindString(1, appLaunchInfo.appId);
                        compileStatement.bindString(2, appLaunchInfo.appName);
                        compileStatement.bindString(3, appLaunchInfo.ttid);
                        compileStatement.bindString(4, appLaunchInfo.icon);
                        compileStatement.bindLong(5, (long) appLaunchInfo.type);
                        compileStatement.bindLong(6, (long) appLaunchInfo.orientation);
                        compileStatement.bindLong(7, (long) appLaunchInfo.mark);
                        compileStatement.bindString(8, appLaunchInfo.minJssdk);
                        compileStatement.bindString(9, appLaunchInfo.schema);
                        compileStatement.bindLong(10, (long) appLaunchInfo.state);
                        compileStatement.bindString(11, appLaunchInfo.summary);
                        compileStatement.bindLong(12, appLaunchInfo.timestamp);
                        compileStatement.executeInsert();
                    }
                    AppBrandLogger.m52828d("RecentAppsDao", "data size is " + list.size());
                } catch (Exception e) {
                    AppBrandLogger.m52829e("RecentAppsDao", e);
                } catch (Throwable th) {
                    mo231508b();
                    throw th;
                }
                mo231508b();
                return;
            }
        }
        AppBrandLogger.m52828d("RecentAppsDao", "no data to add");
    }
}
