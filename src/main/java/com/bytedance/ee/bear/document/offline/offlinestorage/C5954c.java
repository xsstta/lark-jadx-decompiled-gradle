package com.bytedance.ee.bear.document.offline.offlinestorage;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.p038g.p039a.AbstractC1082b;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.document.offline.offlinestorage.c */
public class C5954c {
    /* renamed from: a */
    public static List<C5968f> m24018a(AbstractC1082b bVar) {
        Long l;
        boolean z;
        Cursor query = bVar.query("SELECT * FROM ResourceData");
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("reskey");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("resvalue");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("resvalue_filepath");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("update_time");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("access_time");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("isNeedSync");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("config");
            int columnIndexOrThrow9 = query.getColumnIndexOrThrow(ShareHitPoint.f121869d);
            int columnIndexOrThrow10 = query.getColumnIndexOrThrow("token");
            int columnIndexOrThrow11 = query.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow12 = query.getColumnIndexOrThrow("userToken");
            int columnIndexOrThrow13 = query.getColumnIndexOrThrow("tenantID");
            int columnIndexOrThrow14 = query.getColumnIndexOrThrow("url");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                C5968f fVar = new C5968f();
                fVar.mo24131b(query.getInt(columnIndexOrThrow));
                fVar.mo24128a(query.getString(columnIndexOrThrow2));
                fVar.mo24138d(query.getString(columnIndexOrThrow3));
                fVar.mo24150j(query.getString(columnIndexOrThrow4));
                Long l2 = null;
                if (query.isNull(columnIndexOrThrow5)) {
                    l = null;
                } else {
                    l = Long.valueOf(query.getLong(columnIndexOrThrow5));
                }
                fVar.mo24127a(l);
                if (!query.isNull(columnIndexOrThrow6)) {
                    l2 = Long.valueOf(query.getLong(columnIndexOrThrow6));
                }
                fVar.mo24132b(l2);
                if (query.getInt(columnIndexOrThrow7) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                fVar.mo24129a(z);
                fVar.mo24144g(query.getString(columnIndexOrThrow8));
                fVar.mo24133b(query.getString(columnIndexOrThrow9));
                fVar.mo24147i(query.getString(columnIndexOrThrow10));
                fVar.mo24136c(query.getString(columnIndexOrThrow11));
                fVar.mo24140e(query.getString(columnIndexOrThrow12));
                fVar.mo24142f(query.getString(columnIndexOrThrow13));
                fVar.mo24146h(query.getString(columnIndexOrThrow14));
                arrayList.add(fVar);
                columnIndexOrThrow = columnIndexOrThrow;
                columnIndexOrThrow14 = columnIndexOrThrow14;
                arrayList = arrayList;
            }
            return arrayList;
        } finally {
            query.close();
        }
    }

    /* renamed from: a */
    public static void m24019a(AbstractC1082b bVar, List<C5968f> list) {
        if (!(list == null || list.size() == 0)) {
            bVar.beginTransaction();
            for (C5968f fVar : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("resvalue", fVar.mo24137d());
                bVar.update("ResourceData", 5, contentValues, "id=?", new String[]{String.valueOf(fVar.mo24154n())});
            }
            bVar.setTransactionSuccessful();
            bVar.endTransaction();
            C13479a.m54764b("OfflineDataDBUtil", "OfflineDataDBUtil  updateResourceDataList update: " + list.size());
        }
    }

    /* renamed from: b */
    public static void m24020b(AbstractC1082b bVar, List<C5968f> list) {
        if (list != null && list.size() != 0) {
            bVar.beginTransaction();
            Iterator<C5968f> it = list.iterator();
            while (it.hasNext()) {
                bVar.delete("ResourceData", "id=?", new String[]{String.valueOf(it.next().mo24154n())});
            }
            bVar.setTransactionSuccessful();
            bVar.endTransaction();
            C13479a.m54764b("OfflineDataDBUtil", "OfflineDataDBUtil  deleteResourceDataList delete: " + list.size());
        }
    }
}
