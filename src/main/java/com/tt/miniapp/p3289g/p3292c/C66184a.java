package com.tt.miniapp.p3289g.p3292c;

import android.content.ContentValues;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.p3289g.p3290a.C66181a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapp.g.c.a */
public class C66184a extends C66181a {
    /* renamed from: d */
    public void mo231520d() {
        mo231507a();
        String format = String.format("delete from %s where startTime<=?", "TB_USAGE_RECODR");
        this.f167064b.execSQL(format, new Object[]{Long.valueOf(System.currentTimeMillis() - 172800000)});
        mo231508b();
    }

    public C66184a(SQLiteOpenHelper sQLiteOpenHelper) {
        super(sQLiteOpenHelper);
    }

    /* renamed from: a */
    public void mo231519a(C66186c cVar) {
        mo231507a();
        ContentValues contentValues = new ContentValues();
        if (cVar != null) {
            contentValues.put("appID", cVar.f167066a);
            contentValues.put("startTime", cVar.f167067b);
            contentValues.put("duration", cVar.f167068c);
            contentValues.put("scene", cVar.f167069d);
            contentValues.put("subScene", cVar.f167070e);
        }
        this.f167064b.insert("TB_USAGE_RECODR", null, contentValues);
        mo231508b();
    }

    /* renamed from: a */
    public List<C66186c> mo231518a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null || list.isEmpty()) {
            return arrayList;
        }
        try {
            this.f167064b = this.f167063a.getReadableDatabase();
            String format = String.format("select appID,startTime,duration,scene,subScene from %s where startTime>?", "TB_USAGE_RECODR");
            this.f167065c = this.f167064b.rawQuery(format, new String[]{String.valueOf(System.currentTimeMillis() - 172800000)});
            while (this.f167065c.moveToNext()) {
                String string = this.f167065c.getString(this.f167065c.getColumnIndex("appID"));
                if (list.contains(string)) {
                    C66186c cVar = new C66186c();
                    cVar.f167066a = string;
                    cVar.f167067b = Long.valueOf(this.f167065c.getLong(this.f167065c.getColumnIndex("startTime")));
                    cVar.f167068c = Long.valueOf(this.f167065c.getLong(this.f167065c.getColumnIndex("duration")));
                    cVar.f167069d = this.f167065c.getString(this.f167065c.getColumnIndex("scene"));
                    cVar.f167070e = this.f167065c.getString(this.f167065c.getColumnIndex("subScene"));
                    arrayList.add(cVar);
                }
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("UsageRecordDao", e);
        } catch (Throwable th) {
            mo231509c();
            this.f167064b.close();
            throw th;
        }
        mo231509c();
        this.f167064b.close();
        return arrayList;
    }
}
