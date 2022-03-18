package com.ss.android.ad.splash.core.p1252g;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.ss.android.ad.splash.core.p1247b.C27270a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ad.splash.core.g.h */
public class C27316h implements AbstractC27315g {

    /* renamed from: a */
    C27270a f68093a;

    /* renamed from: b */
    public static String m99361b() {
        return "CREATE TABLE IF NOT EXISTS " + "trackurl" + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," + "id" + " TEXT UNIQUE," + "url" + " TEXT ," + "replaceholder" + " INTEGER default 0, " + "retry" + " INTEGER default 0, " + ShareHitPoint.f121869d + " INTEGER default 0, " + "cid" + " BIGINT default 0, " + "log_extra" + " TEXT" + ")";
    }

    @Override // com.ss.android.ad.splash.core.p1252g.AbstractC27315g
    /* renamed from: a */
    public List<C27314f> mo97370a() {
        boolean z;
        LinkedList linkedList = new LinkedList();
        Cursor a = this.f68093a.mo97256a().mo97271a("trackurl", null, null, null, null, null, null);
        while (a.moveToNext()) {
            try {
                String string = a.getString(a.getColumnIndex("id"));
                String string2 = a.getString(a.getColumnIndex("url"));
                if (a.getInt(a.getColumnIndex("replaceholder")) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                linkedList.add(new C27314f(a.getLong(a.getColumnIndex("cid")), a.getString(a.getColumnIndex("log_extra")), string, string2, z, a.getInt(a.getColumnIndex("retry")), a.getInt(a.getColumnIndex(ShareHitPoint.f121869d))));
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        }
        a.close();
        return linkedList;
    }

    public C27316h(Context context) {
        this.f68093a = C27270a.m99131a(context.getApplicationContext());
    }

    @Override // com.ss.android.ad.splash.core.p1252g.AbstractC27315g
    /* renamed from: c */
    public void mo97373c(C27314f fVar) {
        this.f68093a.mo97256a().mo97269a("trackurl", "id=?", new String[]{fVar.mo97362a()});
    }

    @Override // com.ss.android.ad.splash.core.p1252g.AbstractC27315g
    /* renamed from: a */
    public void mo97371a(C27314f fVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", fVar.mo97362a());
        contentValues.put("url", fVar.mo97364b());
        contentValues.put("replaceholder", Integer.valueOf(fVar.mo97365c() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(fVar.mo97366d()));
        contentValues.put(ShareHitPoint.f121869d, Integer.valueOf(fVar.mo97369g()));
        contentValues.put("cid", Long.valueOf(fVar.mo97367e()));
        contentValues.put("log_extra", fVar.mo97368f());
        this.f68093a.mo97256a().mo97270a("trackurl", (String) null, contentValues);
    }

    @Override // com.ss.android.ad.splash.core.p1252g.AbstractC27315g
    /* renamed from: b */
    public void mo97372b(C27314f fVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", fVar.mo97362a());
        contentValues.put("url", fVar.mo97364b());
        contentValues.put("replaceholder", Integer.valueOf(fVar.mo97365c() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(fVar.mo97366d()));
        contentValues.put(ShareHitPoint.f121869d, Integer.valueOf(fVar.mo97369g()));
        contentValues.put("cid", Long.valueOf(fVar.mo97367e()));
        contentValues.put("log_extra", fVar.mo97368f());
        this.f68093a.mo97256a().mo97268a("trackurl", contentValues, "id=?", new String[]{fVar.mo97362a()});
    }
}
