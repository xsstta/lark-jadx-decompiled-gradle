package com.bytedance.ee.bear.drive.dao;

import android.database.Cursor;
import androidx.p038g.p039a.AbstractC1090f;
import androidx.room.AbstractC1421b;
import androidx.room.AbstractC1428c;
import androidx.room.AbstractC1440i;
import androidx.room.C1439h;
import androidx.room.RoomDatabase;
import androidx.room.p048b.C1422a;
import com.bytedance.ee.bear.drive.dao.p351a.C6955a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.dao.b */
public final class C6957b implements AbstractC6954a {

    /* renamed from: a */
    public final RoomDatabase f18831a;

    /* renamed from: b */
    private final AbstractC1428c f18832b;

    /* renamed from: c */
    private final AbstractC1421b f18833c;

    /* renamed from: d */
    private final AbstractC1440i f18834d;

    /* renamed from: e */
    private final AbstractC1440i f18835e;

    /* renamed from: f */
    private final AbstractC1440i f18836f;

    /* renamed from: g */
    private final AbstractC1440i f18837g;

    /* renamed from: h */
    private final AbstractC1440i f18838h;

    @Override // com.bytedance.ee.bear.drive.dao.AbstractC6954a
    /* renamed from: a */
    public List<C6955a> mo27410a(int i, long j, String str, String str2) {
        C1439h hVar;
        Throwable th;
        boolean z;
        C1439h a = C1439h.m6573a("SELECT * FROM t_drive_cache WHERE type = ? AND cache_uid = ? AND cache_tenant_id = ? AND last_access_time <= ? AND modification_time <= ?", 5);
        a.bindLong(1, (long) i);
        if (str == null) {
            a.bindNull(2);
        } else {
            a.bindString(2, str);
        }
        if (str2 == null) {
            a.bindNull(3);
        } else {
            a.bindString(3, str2);
        }
        a.bindLong(4, j);
        a.bindLong(5, j);
        Cursor a2 = this.f18831a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("cache_key");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("src_ext");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("preview_ext");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("data_version");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("source_from");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("file_path");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("partial_file_path");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("file_size");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow(ShareHitPoint.f121869d);
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("last_access_time");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("modification_time");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("file_name");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("cache_uid");
            hVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("cache_tenant_id");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("preview_extra");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("is_use_partial_file");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("cache_host");
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("sdk_app_id");
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("sdk_extra");
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("flags");
                int columnIndexOrThrow22 = a2.getColumnIndexOrThrow("mime_type");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    C6955a aVar = new C6955a();
                    aVar.mo27420a(a2.getString(columnIndexOrThrow));
                    aVar.mo27439h(a2.getString(columnIndexOrThrow2));
                    aVar.mo27425b(a2.getString(columnIndexOrThrow3));
                    aVar.mo27429c(a2.getString(columnIndexOrThrow4));
                    aVar.mo27431d(a2.getString(columnIndexOrThrow5));
                    aVar.mo27433e(a2.getString(columnIndexOrThrow6));
                    aVar.mo27435f(a2.getString(columnIndexOrThrow7));
                    aVar.mo27445k(a2.getString(columnIndexOrThrow8));
                    aVar.mo27419a(a2.getLong(columnIndexOrThrow9));
                    aVar.mo27418a(a2.getInt(columnIndexOrThrow10));
                    aVar.mo27424b(a2.getLong(columnIndexOrThrow11));
                    aVar.mo27428c(a2.getLong(columnIndexOrThrow12));
                    aVar.mo27437g(a2.getString(columnIndexOrThrow13));
                    aVar.mo27441i(a2.getString(i2));
                    aVar.mo27443j(a2.getString(columnIndexOrThrow15));
                    i2 = i2;
                    aVar.mo27451n(a2.getString(columnIndexOrThrow16));
                    if (a2.getInt(columnIndexOrThrow17) != 0) {
                        columnIndexOrThrow16 = columnIndexOrThrow16;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = columnIndexOrThrow16;
                        z = false;
                    }
                    aVar.mo27421a(z);
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    aVar.mo27423b(a2.getInt(columnIndexOrThrow18));
                    columnIndexOrThrow18 = columnIndexOrThrow18;
                    aVar.mo27447l(a2.getString(columnIndexOrThrow19));
                    columnIndexOrThrow19 = columnIndexOrThrow19;
                    aVar.mo27449m(a2.getString(columnIndexOrThrow20));
                    columnIndexOrThrow20 = columnIndexOrThrow20;
                    aVar.mo27427c(a2.getInt(columnIndexOrThrow21));
                    columnIndexOrThrow21 = columnIndexOrThrow21;
                    aVar.mo27453o(a2.getString(columnIndexOrThrow22));
                    arrayList.add(aVar);
                    columnIndexOrThrow22 = columnIndexOrThrow22;
                    columnIndexOrThrow = columnIndexOrThrow;
                    columnIndexOrThrow15 = columnIndexOrThrow15;
                    arrayList = arrayList;
                    columnIndexOrThrow2 = columnIndexOrThrow2;
                }
                a2.close();
                hVar.mo7613a();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                hVar.mo7613a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = a;
            a2.close();
            hVar.mo7613a();
            throw th;
        }
    }

    @Override // com.bytedance.ee.bear.drive.dao.AbstractC6954a
    /* renamed from: a */
    public List<C6955a> mo27411a(List<String> list) {
        C1439h hVar;
        Throwable th;
        boolean z;
        StringBuilder a = C1422a.m6520a();
        a.append("SELECT * FROM t_drive_cache WHERE cache_key in (");
        int size = list.size();
        C1422a.m6521a(a, size);
        a.append(")");
        C1439h a2 = C1439h.m6573a(a.toString(), size + 0);
        int i = 1;
        for (String str : list) {
            if (str == null) {
                a2.bindNull(i);
            } else {
                a2.bindString(i, str);
            }
            i++;
        }
        Cursor a3 = this.f18831a.mo7532a(a2);
        try {
            int columnIndexOrThrow = a3.getColumnIndexOrThrow("cache_key");
            int columnIndexOrThrow2 = a3.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow3 = a3.getColumnIndexOrThrow("src_ext");
            int columnIndexOrThrow4 = a3.getColumnIndexOrThrow("preview_ext");
            int columnIndexOrThrow5 = a3.getColumnIndexOrThrow("data_version");
            int columnIndexOrThrow6 = a3.getColumnIndexOrThrow("source_from");
            int columnIndexOrThrow7 = a3.getColumnIndexOrThrow("file_path");
            int columnIndexOrThrow8 = a3.getColumnIndexOrThrow("partial_file_path");
            int columnIndexOrThrow9 = a3.getColumnIndexOrThrow("file_size");
            int columnIndexOrThrow10 = a3.getColumnIndexOrThrow(ShareHitPoint.f121869d);
            int columnIndexOrThrow11 = a3.getColumnIndexOrThrow("last_access_time");
            int columnIndexOrThrow12 = a3.getColumnIndexOrThrow("modification_time");
            int columnIndexOrThrow13 = a3.getColumnIndexOrThrow("file_name");
            int columnIndexOrThrow14 = a3.getColumnIndexOrThrow("cache_uid");
            hVar = a2;
            try {
                int columnIndexOrThrow15 = a3.getColumnIndexOrThrow("cache_tenant_id");
                int columnIndexOrThrow16 = a3.getColumnIndexOrThrow("preview_extra");
                int columnIndexOrThrow17 = a3.getColumnIndexOrThrow("is_use_partial_file");
                int columnIndexOrThrow18 = a3.getColumnIndexOrThrow("cache_host");
                int columnIndexOrThrow19 = a3.getColumnIndexOrThrow("sdk_app_id");
                int columnIndexOrThrow20 = a3.getColumnIndexOrThrow("sdk_extra");
                int columnIndexOrThrow21 = a3.getColumnIndexOrThrow("flags");
                int columnIndexOrThrow22 = a3.getColumnIndexOrThrow("mime_type");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(a3.getCount());
                while (a3.moveToNext()) {
                    C6955a aVar = new C6955a();
                    aVar.mo27420a(a3.getString(columnIndexOrThrow));
                    aVar.mo27439h(a3.getString(columnIndexOrThrow2));
                    aVar.mo27425b(a3.getString(columnIndexOrThrow3));
                    aVar.mo27429c(a3.getString(columnIndexOrThrow4));
                    aVar.mo27431d(a3.getString(columnIndexOrThrow5));
                    aVar.mo27433e(a3.getString(columnIndexOrThrow6));
                    aVar.mo27435f(a3.getString(columnIndexOrThrow7));
                    aVar.mo27445k(a3.getString(columnIndexOrThrow8));
                    aVar.mo27419a(a3.getLong(columnIndexOrThrow9));
                    aVar.mo27418a(a3.getInt(columnIndexOrThrow10));
                    aVar.mo27424b(a3.getLong(columnIndexOrThrow11));
                    aVar.mo27428c(a3.getLong(columnIndexOrThrow12));
                    aVar.mo27437g(a3.getString(columnIndexOrThrow13));
                    aVar.mo27441i(a3.getString(i2));
                    i2 = i2;
                    aVar.mo27443j(a3.getString(columnIndexOrThrow15));
                    columnIndexOrThrow15 = columnIndexOrThrow15;
                    aVar.mo27451n(a3.getString(columnIndexOrThrow16));
                    if (a3.getInt(columnIndexOrThrow17) != 0) {
                        columnIndexOrThrow16 = columnIndexOrThrow16;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = columnIndexOrThrow16;
                        z = false;
                    }
                    aVar.mo27421a(z);
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    aVar.mo27423b(a3.getInt(columnIndexOrThrow18));
                    columnIndexOrThrow18 = columnIndexOrThrow18;
                    aVar.mo27447l(a3.getString(columnIndexOrThrow19));
                    columnIndexOrThrow19 = columnIndexOrThrow19;
                    aVar.mo27449m(a3.getString(columnIndexOrThrow20));
                    columnIndexOrThrow20 = columnIndexOrThrow20;
                    aVar.mo27427c(a3.getInt(columnIndexOrThrow21));
                    columnIndexOrThrow21 = columnIndexOrThrow21;
                    aVar.mo27453o(a3.getString(columnIndexOrThrow22));
                    arrayList = arrayList;
                    arrayList.add(aVar);
                    columnIndexOrThrow22 = columnIndexOrThrow22;
                    columnIndexOrThrow = columnIndexOrThrow;
                }
                a3.close();
                hVar.mo7613a();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                a3.close();
                hVar.mo7613a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = a2;
            a3.close();
            hVar.mo7613a();
            throw th;
        }
    }

    @Override // com.bytedance.ee.bear.drive.dao.AbstractC6954a
    /* renamed from: b */
    public int mo27412b() {
        AbstractC1090f c = this.f18836f.mo7618c();
        this.f18831a.mo7546g();
        try {
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f18831a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f18831a.mo7547h();
            this.f18836f.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.drive.dao.AbstractC6954a
    /* renamed from: a */
    public List<C6955a> mo27407a() {
        C1439h hVar;
        Throwable th;
        int i;
        boolean z;
        C1439h a = C1439h.m6573a("SELECT * FROM t_drive_cache ORDER BY last_access_time DESC", 0);
        Cursor a2 = this.f18831a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("cache_key");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("src_ext");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("preview_ext");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("data_version");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("source_from");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("file_path");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("partial_file_path");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("file_size");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow(ShareHitPoint.f121869d);
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("last_access_time");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("modification_time");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("file_name");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("cache_uid");
            hVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("cache_tenant_id");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("preview_extra");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("is_use_partial_file");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("cache_host");
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("sdk_app_id");
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("sdk_extra");
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("flags");
                int columnIndexOrThrow22 = a2.getColumnIndexOrThrow("mime_type");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    C6955a aVar = new C6955a();
                    aVar.mo27420a(a2.getString(columnIndexOrThrow));
                    aVar.mo27439h(a2.getString(columnIndexOrThrow2));
                    aVar.mo27425b(a2.getString(columnIndexOrThrow3));
                    aVar.mo27429c(a2.getString(columnIndexOrThrow4));
                    aVar.mo27431d(a2.getString(columnIndexOrThrow5));
                    aVar.mo27433e(a2.getString(columnIndexOrThrow6));
                    aVar.mo27435f(a2.getString(columnIndexOrThrow7));
                    aVar.mo27445k(a2.getString(columnIndexOrThrow8));
                    aVar.mo27419a(a2.getLong(columnIndexOrThrow9));
                    aVar.mo27418a(a2.getInt(columnIndexOrThrow10));
                    aVar.mo27424b(a2.getLong(columnIndexOrThrow11));
                    aVar.mo27428c(a2.getLong(columnIndexOrThrow12));
                    aVar.mo27437g(a2.getString(columnIndexOrThrow13));
                    aVar.mo27441i(a2.getString(i2));
                    aVar.mo27443j(a2.getString(columnIndexOrThrow15));
                    aVar.mo27451n(a2.getString(columnIndexOrThrow16));
                    if (a2.getInt(columnIndexOrThrow17) != 0) {
                        i = columnIndexOrThrow16;
                        z = true;
                    } else {
                        i = columnIndexOrThrow16;
                        z = false;
                    }
                    aVar.mo27421a(z);
                    aVar.mo27423b(a2.getInt(columnIndexOrThrow18));
                    aVar.mo27447l(a2.getString(columnIndexOrThrow19));
                    aVar.mo27449m(a2.getString(columnIndexOrThrow20));
                    aVar.mo27427c(a2.getInt(columnIndexOrThrow21));
                    aVar.mo27453o(a2.getString(columnIndexOrThrow22));
                    arrayList.add(aVar);
                    i2 = i2;
                    columnIndexOrThrow2 = columnIndexOrThrow2;
                    arrayList = arrayList;
                    columnIndexOrThrow13 = columnIndexOrThrow13;
                    columnIndexOrThrow16 = i;
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    columnIndexOrThrow18 = columnIndexOrThrow18;
                    columnIndexOrThrow19 = columnIndexOrThrow19;
                    columnIndexOrThrow20 = columnIndexOrThrow20;
                    columnIndexOrThrow21 = columnIndexOrThrow21;
                    columnIndexOrThrow22 = columnIndexOrThrow22;
                    columnIndexOrThrow = columnIndexOrThrow;
                    columnIndexOrThrow15 = columnIndexOrThrow15;
                    columnIndexOrThrow3 = columnIndexOrThrow3;
                }
                a2.close();
                hVar.mo7613a();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                hVar.mo7613a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = a;
            a2.close();
            hVar.mo7613a();
            throw th;
        }
    }

    @Override // com.bytedance.ee.bear.drive.dao.AbstractC6954a
    /* renamed from: a */
    public long mo27405a(C6955a aVar) {
        this.f18831a.mo7546g();
        try {
            long a = this.f18832b.mo7587a(aVar);
            this.f18831a.mo7549j();
            return a;
        } finally {
            this.f18831a.mo7547h();
        }
    }

    public C6957b(RoomDatabase roomDatabase) {
        this.f18831a = roomDatabase;
        this.f18832b = new AbstractC1428c<C6955a>(roomDatabase) {
            /* class com.bytedance.ee.bear.drive.dao.C6957b.C69581 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "INSERT OR REPLACE INTO `t_drive_cache`(`cache_key`,`obj_token`,`src_ext`,`preview_ext`,`data_version`,`source_from`,`file_path`,`partial_file_path`,`file_size`,`type`,`last_access_time`,`modification_time`,`file_name`,`cache_uid`,`cache_tenant_id`,`preview_extra`,`is_use_partial_file`,`cache_host`,`sdk_app_id`,`sdk_extra`,`flags`,`mime_type`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public void mo7588a(AbstractC1090f fVar, C6955a aVar) {
                if (aVar.mo27417a() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, aVar.mo27417a());
                }
                if (aVar.mo27446l() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, aVar.mo27446l());
                }
                if (aVar.mo27422b() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, aVar.mo27422b());
                }
                if (aVar.mo27426c() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, aVar.mo27426c());
                }
                if (aVar.mo27430d() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, aVar.mo27430d());
                }
                if (aVar.mo27432e() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, aVar.mo27432e());
                }
                if (aVar.mo27434f() == null) {
                    fVar.bindNull(7);
                } else {
                    fVar.bindString(7, aVar.mo27434f());
                }
                if (aVar.mo27452o() == null) {
                    fVar.bindNull(8);
                } else {
                    fVar.bindString(8, aVar.mo27452o());
                }
                fVar.bindLong(9, aVar.mo27436g());
                fVar.bindLong(10, (long) aVar.mo27438h());
                fVar.bindLong(11, aVar.mo27440i());
                fVar.bindLong(12, aVar.mo27442j());
                if (aVar.mo27444k() == null) {
                    fVar.bindNull(13);
                } else {
                    fVar.bindString(13, aVar.mo27444k());
                }
                if (aVar.mo27448m() == null) {
                    fVar.bindNull(14);
                } else {
                    fVar.bindString(14, aVar.mo27448m());
                }
                if (aVar.mo27450n() == null) {
                    fVar.bindNull(15);
                } else {
                    fVar.bindString(15, aVar.mo27450n());
                }
                if (aVar.mo27461v() == null) {
                    fVar.bindNull(16);
                } else {
                    fVar.bindString(16, aVar.mo27461v());
                }
                fVar.bindLong(17, aVar.mo27462w() ? 1 : 0);
                fVar.bindLong(18, (long) aVar.mo27454p());
                if (aVar.mo27455q() == null) {
                    fVar.bindNull(19);
                } else {
                    fVar.bindString(19, aVar.mo27455q());
                }
                if (aVar.mo27456r() == null) {
                    fVar.bindNull(20);
                } else {
                    fVar.bindString(20, aVar.mo27456r());
                }
                fVar.bindLong(21, (long) aVar.mo27457s());
                if (aVar.mo27463x() == null) {
                    fVar.bindNull(22);
                } else {
                    fVar.bindString(22, aVar.mo27463x());
                }
            }
        };
        this.f18833c = new AbstractC1421b<C6955a>(roomDatabase) {
            /* class com.bytedance.ee.bear.drive.dao.C6957b.C69592 */

            @Override // androidx.room.AbstractC1421b, androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE OR ABORT `t_drive_cache` SET `cache_key` = ?,`obj_token` = ?,`src_ext` = ?,`preview_ext` = ?,`data_version` = ?,`source_from` = ?,`file_path` = ?,`partial_file_path` = ?,`file_size` = ?,`type` = ?,`last_access_time` = ?,`modification_time` = ?,`file_name` = ?,`cache_uid` = ?,`cache_tenant_id` = ?,`preview_extra` = ?,`is_use_partial_file` = ?,`cache_host` = ?,`sdk_app_id` = ?,`sdk_extra` = ?,`flags` = ?,`mime_type` = ? WHERE `cache_key` = ?";
            }

            /* renamed from: a */
            public void mo7571a(AbstractC1090f fVar, C6955a aVar) {
                if (aVar.mo27417a() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, aVar.mo27417a());
                }
                if (aVar.mo27446l() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, aVar.mo27446l());
                }
                if (aVar.mo27422b() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, aVar.mo27422b());
                }
                if (aVar.mo27426c() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, aVar.mo27426c());
                }
                if (aVar.mo27430d() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, aVar.mo27430d());
                }
                if (aVar.mo27432e() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, aVar.mo27432e());
                }
                if (aVar.mo27434f() == null) {
                    fVar.bindNull(7);
                } else {
                    fVar.bindString(7, aVar.mo27434f());
                }
                if (aVar.mo27452o() == null) {
                    fVar.bindNull(8);
                } else {
                    fVar.bindString(8, aVar.mo27452o());
                }
                fVar.bindLong(9, aVar.mo27436g());
                fVar.bindLong(10, (long) aVar.mo27438h());
                fVar.bindLong(11, aVar.mo27440i());
                fVar.bindLong(12, aVar.mo27442j());
                if (aVar.mo27444k() == null) {
                    fVar.bindNull(13);
                } else {
                    fVar.bindString(13, aVar.mo27444k());
                }
                if (aVar.mo27448m() == null) {
                    fVar.bindNull(14);
                } else {
                    fVar.bindString(14, aVar.mo27448m());
                }
                if (aVar.mo27450n() == null) {
                    fVar.bindNull(15);
                } else {
                    fVar.bindString(15, aVar.mo27450n());
                }
                if (aVar.mo27461v() == null) {
                    fVar.bindNull(16);
                } else {
                    fVar.bindString(16, aVar.mo27461v());
                }
                fVar.bindLong(17, aVar.mo27462w() ? 1 : 0);
                fVar.bindLong(18, (long) aVar.mo27454p());
                if (aVar.mo27455q() == null) {
                    fVar.bindNull(19);
                } else {
                    fVar.bindString(19, aVar.mo27455q());
                }
                if (aVar.mo27456r() == null) {
                    fVar.bindNull(20);
                } else {
                    fVar.bindString(20, aVar.mo27456r());
                }
                fVar.bindLong(21, (long) aVar.mo27457s());
                if (aVar.mo27463x() == null) {
                    fVar.bindNull(22);
                } else {
                    fVar.bindString(22, aVar.mo27463x());
                }
                if (aVar.mo27417a() == null) {
                    fVar.bindNull(23);
                } else {
                    fVar.bindString(23, aVar.mo27417a());
                }
            }
        };
        this.f18834d = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.drive.dao.C6957b.C69603 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE t_drive_cache set last_access_time = ? WHERE cache_key = ?";
            }
        };
        this.f18835e = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.drive.dao.C6957b.C69614 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM t_drive_cache WHERE cache_key = ?";
            }
        };
        this.f18836f = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.drive.dao.C6957b.C69625 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM t_drive_cache";
            }
        };
        this.f18837g = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.drive.dao.C6957b.C69636 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE t_drive_cache SET type = ?, file_path = ?  WHERE cache_key = ?";
            }
        };
        this.f18838h = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.drive.dao.C6957b.C69647 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE t_drive_cache SET file_name = ? WHERE cache_key = ?";
            }
        };
    }

    @Override // com.bytedance.ee.bear.drive.dao.AbstractC6954a
    /* renamed from: c */
    public long mo27416c(int i) {
        long j;
        C1439h a = C1439h.m6573a("SELECT SUM(file_size) FROM t_drive_cache WHERE type != ?", 1);
        a.bindLong(1, (long) i);
        Cursor a2 = this.f18831a.mo7532a(a);
        try {
            if (a2.moveToFirst()) {
                j = a2.getLong(0);
            } else {
                j = 0;
            }
            return j;
        } finally {
            a2.close();
            a.mo7613a();
        }
    }

    @Override // com.bytedance.ee.bear.drive.dao.AbstractC6954a
    /* renamed from: b */
    public int mo27413b(String str) {
        AbstractC1090f c = this.f18835e.mo7618c();
        this.f18831a.mo7546g();
        if (str == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f18831a.mo7547h();
                this.f18835e.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str);
        }
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f18831a.mo7549j();
        this.f18831a.mo7547h();
        this.f18835e.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.drive.dao.AbstractC6954a
    /* renamed from: b */
    public long mo27414b(int i) {
        long j;
        C1439h a = C1439h.m6573a("SELECT SUM(file_size) FROM t_drive_cache WHERE type = ?", 1);
        a.bindLong(1, (long) i);
        Cursor a2 = this.f18831a.mo7532a(a);
        try {
            if (a2.moveToFirst()) {
                j = a2.getLong(0);
            } else {
                j = 0;
            }
            return j;
        } finally {
            a2.close();
            a.mo7613a();
        }
    }

    @Override // com.bytedance.ee.bear.drive.dao.AbstractC6954a
    /* renamed from: a */
    public C6955a mo27406a(String str) {
        C1439h hVar;
        Throwable th;
        C6955a aVar;
        boolean z;
        C1439h a = C1439h.m6573a("SELECT * FROM t_drive_cache WHERE cache_key = ? LIMIT 1", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        Cursor a2 = this.f18831a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("cache_key");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("src_ext");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("preview_ext");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("data_version");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("source_from");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("file_path");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("partial_file_path");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("file_size");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow(ShareHitPoint.f121869d);
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("last_access_time");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("modification_time");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("file_name");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("cache_uid");
            hVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("cache_tenant_id");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("preview_extra");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("is_use_partial_file");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("cache_host");
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("sdk_app_id");
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("sdk_extra");
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("flags");
                int columnIndexOrThrow22 = a2.getColumnIndexOrThrow("mime_type");
                if (a2.moveToFirst()) {
                    aVar = new C6955a();
                    aVar.mo27420a(a2.getString(columnIndexOrThrow));
                    aVar.mo27439h(a2.getString(columnIndexOrThrow2));
                    aVar.mo27425b(a2.getString(columnIndexOrThrow3));
                    aVar.mo27429c(a2.getString(columnIndexOrThrow4));
                    aVar.mo27431d(a2.getString(columnIndexOrThrow5));
                    aVar.mo27433e(a2.getString(columnIndexOrThrow6));
                    aVar.mo27435f(a2.getString(columnIndexOrThrow7));
                    aVar.mo27445k(a2.getString(columnIndexOrThrow8));
                    aVar.mo27419a(a2.getLong(columnIndexOrThrow9));
                    aVar.mo27418a(a2.getInt(columnIndexOrThrow10));
                    aVar.mo27424b(a2.getLong(columnIndexOrThrow11));
                    aVar.mo27428c(a2.getLong(columnIndexOrThrow12));
                    aVar.mo27437g(a2.getString(columnIndexOrThrow13));
                    aVar.mo27441i(a2.getString(columnIndexOrThrow14));
                    aVar.mo27443j(a2.getString(columnIndexOrThrow15));
                    aVar.mo27451n(a2.getString(columnIndexOrThrow16));
                    if (a2.getInt(columnIndexOrThrow17) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.mo27421a(z);
                    aVar.mo27423b(a2.getInt(columnIndexOrThrow18));
                    aVar.mo27447l(a2.getString(columnIndexOrThrow19));
                    aVar.mo27449m(a2.getString(columnIndexOrThrow20));
                    aVar.mo27427c(a2.getInt(columnIndexOrThrow21));
                    aVar.mo27453o(a2.getString(columnIndexOrThrow22));
                } else {
                    aVar = null;
                }
                a2.close();
                hVar.mo7613a();
                return aVar;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                hVar.mo7613a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = a;
            a2.close();
            hVar.mo7613a();
            throw th;
        }
    }

    @Override // com.bytedance.ee.bear.drive.dao.AbstractC6954a
    /* renamed from: a */
    public List<C6955a> mo27408a(int i) {
        C1439h hVar;
        Throwable th;
        int i2;
        boolean z;
        C1439h a = C1439h.m6573a("SELECT * FROM t_drive_cache WHERE type = ? ORDER BY last_access_time DESC", 1);
        a.bindLong(1, (long) i);
        Cursor a2 = this.f18831a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("cache_key");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("src_ext");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("preview_ext");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("data_version");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("source_from");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("file_path");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("partial_file_path");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("file_size");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow(ShareHitPoint.f121869d);
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("last_access_time");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("modification_time");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("file_name");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("cache_uid");
            hVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("cache_tenant_id");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("preview_extra");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("is_use_partial_file");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("cache_host");
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("sdk_app_id");
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("sdk_extra");
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("flags");
                int columnIndexOrThrow22 = a2.getColumnIndexOrThrow("mime_type");
                int i3 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    C6955a aVar = new C6955a();
                    aVar.mo27420a(a2.getString(columnIndexOrThrow));
                    aVar.mo27439h(a2.getString(columnIndexOrThrow2));
                    aVar.mo27425b(a2.getString(columnIndexOrThrow3));
                    aVar.mo27429c(a2.getString(columnIndexOrThrow4));
                    aVar.mo27431d(a2.getString(columnIndexOrThrow5));
                    aVar.mo27433e(a2.getString(columnIndexOrThrow6));
                    aVar.mo27435f(a2.getString(columnIndexOrThrow7));
                    aVar.mo27445k(a2.getString(columnIndexOrThrow8));
                    aVar.mo27419a(a2.getLong(columnIndexOrThrow9));
                    aVar.mo27418a(a2.getInt(columnIndexOrThrow10));
                    aVar.mo27424b(a2.getLong(columnIndexOrThrow11));
                    aVar.mo27428c(a2.getLong(columnIndexOrThrow12));
                    aVar.mo27437g(a2.getString(columnIndexOrThrow13));
                    aVar.mo27441i(a2.getString(i3));
                    aVar.mo27443j(a2.getString(columnIndexOrThrow15));
                    aVar.mo27451n(a2.getString(columnIndexOrThrow16));
                    if (a2.getInt(columnIndexOrThrow17) != 0) {
                        i2 = columnIndexOrThrow16;
                        z = true;
                    } else {
                        i2 = columnIndexOrThrow16;
                        z = false;
                    }
                    aVar.mo27421a(z);
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    aVar.mo27423b(a2.getInt(columnIndexOrThrow18));
                    columnIndexOrThrow18 = columnIndexOrThrow18;
                    aVar.mo27447l(a2.getString(columnIndexOrThrow19));
                    columnIndexOrThrow19 = columnIndexOrThrow19;
                    aVar.mo27449m(a2.getString(columnIndexOrThrow20));
                    columnIndexOrThrow20 = columnIndexOrThrow20;
                    aVar.mo27427c(a2.getInt(columnIndexOrThrow21));
                    columnIndexOrThrow21 = columnIndexOrThrow21;
                    aVar.mo27453o(a2.getString(columnIndexOrThrow22));
                    arrayList.add(aVar);
                    columnIndexOrThrow22 = columnIndexOrThrow22;
                    columnIndexOrThrow = columnIndexOrThrow;
                    columnIndexOrThrow15 = columnIndexOrThrow15;
                    columnIndexOrThrow3 = columnIndexOrThrow3;
                    arrayList = arrayList;
                    columnIndexOrThrow13 = columnIndexOrThrow13;
                    columnIndexOrThrow16 = i2;
                    i3 = i3;
                    columnIndexOrThrow2 = columnIndexOrThrow2;
                }
                a2.close();
                hVar.mo7613a();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                hVar.mo7613a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = a;
            a2.close();
            hVar.mo7613a();
            throw th;
        }
    }

    @Override // com.bytedance.ee.bear.drive.dao.AbstractC6954a
    /* renamed from: a */
    public int mo27403a(String str, long j) {
        AbstractC1090f c = this.f18834d.mo7618c();
        this.f18831a.mo7546g();
        try {
            c.bindLong(1, j);
            if (str == null) {
                c.bindNull(2);
            } else {
                c.bindString(2, str);
            }
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f18831a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f18831a.mo7547h();
            this.f18834d.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.drive.dao.AbstractC6954a
    /* renamed from: a */
    public int mo27404a(String str, String str2) {
        AbstractC1090f c = this.f18838h.mo7618c();
        this.f18831a.mo7546g();
        if (str2 == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f18831a.mo7547h();
                this.f18838h.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str2);
        }
        if (str == null) {
            c.bindNull(2);
        } else {
            c.bindString(2, str);
        }
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f18831a.mo7549j();
        this.f18831a.mo7547h();
        this.f18838h.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.drive.dao.AbstractC6954a
    /* renamed from: b */
    public List<C6955a> mo27415b(int i, int i2) {
        C1439h hVar;
        Throwable th;
        int i3;
        boolean z;
        C1439h a = C1439h.m6573a("SELECT * FROM t_drive_cache WHERE type = ? ORDER BY last_access_time ASC LIMIT ?", 2);
        a.bindLong(1, (long) i);
        a.bindLong(2, (long) i2);
        Cursor a2 = this.f18831a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("cache_key");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("src_ext");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("preview_ext");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("data_version");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("source_from");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("file_path");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("partial_file_path");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("file_size");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow(ShareHitPoint.f121869d);
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("last_access_time");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("modification_time");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("file_name");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("cache_uid");
            hVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("cache_tenant_id");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("preview_extra");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("is_use_partial_file");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("cache_host");
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("sdk_app_id");
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("sdk_extra");
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("flags");
                int columnIndexOrThrow22 = a2.getColumnIndexOrThrow("mime_type");
                int i4 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    C6955a aVar = new C6955a();
                    aVar.mo27420a(a2.getString(columnIndexOrThrow));
                    aVar.mo27439h(a2.getString(columnIndexOrThrow2));
                    aVar.mo27425b(a2.getString(columnIndexOrThrow3));
                    aVar.mo27429c(a2.getString(columnIndexOrThrow4));
                    aVar.mo27431d(a2.getString(columnIndexOrThrow5));
                    aVar.mo27433e(a2.getString(columnIndexOrThrow6));
                    aVar.mo27435f(a2.getString(columnIndexOrThrow7));
                    aVar.mo27445k(a2.getString(columnIndexOrThrow8));
                    aVar.mo27419a(a2.getLong(columnIndexOrThrow9));
                    aVar.mo27418a(a2.getInt(columnIndexOrThrow10));
                    aVar.mo27424b(a2.getLong(columnIndexOrThrow11));
                    aVar.mo27428c(a2.getLong(columnIndexOrThrow12));
                    aVar.mo27437g(a2.getString(columnIndexOrThrow13));
                    aVar.mo27441i(a2.getString(i4));
                    aVar.mo27443j(a2.getString(columnIndexOrThrow15));
                    aVar.mo27451n(a2.getString(columnIndexOrThrow16));
                    if (a2.getInt(columnIndexOrThrow17) != 0) {
                        i3 = columnIndexOrThrow16;
                        z = true;
                    } else {
                        i3 = columnIndexOrThrow16;
                        z = false;
                    }
                    aVar.mo27421a(z);
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    aVar.mo27423b(a2.getInt(columnIndexOrThrow18));
                    columnIndexOrThrow18 = columnIndexOrThrow18;
                    aVar.mo27447l(a2.getString(columnIndexOrThrow19));
                    columnIndexOrThrow19 = columnIndexOrThrow19;
                    aVar.mo27449m(a2.getString(columnIndexOrThrow20));
                    columnIndexOrThrow20 = columnIndexOrThrow20;
                    aVar.mo27427c(a2.getInt(columnIndexOrThrow21));
                    columnIndexOrThrow21 = columnIndexOrThrow21;
                    aVar.mo27453o(a2.getString(columnIndexOrThrow22));
                    arrayList = arrayList;
                    arrayList.add(aVar);
                    columnIndexOrThrow22 = columnIndexOrThrow22;
                    columnIndexOrThrow13 = columnIndexOrThrow13;
                    columnIndexOrThrow15 = columnIndexOrThrow15;
                    columnIndexOrThrow2 = columnIndexOrThrow2;
                    i4 = i4;
                    columnIndexOrThrow = columnIndexOrThrow;
                    columnIndexOrThrow16 = i3;
                }
                a2.close();
                hVar.mo7613a();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                hVar.mo7613a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = a;
            a2.close();
            hVar.mo7613a();
            throw th;
        }
    }

    @Override // com.bytedance.ee.bear.drive.dao.AbstractC6954a
    /* renamed from: a */
    public List<C6955a> mo27409a(int i, int i2) {
        C1439h hVar;
        Throwable th;
        int i3;
        boolean z;
        C1439h a = C1439h.m6573a("SELECT * FROM t_drive_cache WHERE type = ? AND cache_host = ? ORDER BY last_access_time DESC", 2);
        a.bindLong(1, (long) i2);
        a.bindLong(2, (long) i);
        Cursor a2 = this.f18831a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("cache_key");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("src_ext");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("preview_ext");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("data_version");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("source_from");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("file_path");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("partial_file_path");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("file_size");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow(ShareHitPoint.f121869d);
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("last_access_time");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("modification_time");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("file_name");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("cache_uid");
            hVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("cache_tenant_id");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("preview_extra");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("is_use_partial_file");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("cache_host");
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("sdk_app_id");
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("sdk_extra");
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("flags");
                int columnIndexOrThrow22 = a2.getColumnIndexOrThrow("mime_type");
                int i4 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    C6955a aVar = new C6955a();
                    aVar.mo27420a(a2.getString(columnIndexOrThrow));
                    aVar.mo27439h(a2.getString(columnIndexOrThrow2));
                    aVar.mo27425b(a2.getString(columnIndexOrThrow3));
                    aVar.mo27429c(a2.getString(columnIndexOrThrow4));
                    aVar.mo27431d(a2.getString(columnIndexOrThrow5));
                    aVar.mo27433e(a2.getString(columnIndexOrThrow6));
                    aVar.mo27435f(a2.getString(columnIndexOrThrow7));
                    aVar.mo27445k(a2.getString(columnIndexOrThrow8));
                    aVar.mo27419a(a2.getLong(columnIndexOrThrow9));
                    aVar.mo27418a(a2.getInt(columnIndexOrThrow10));
                    aVar.mo27424b(a2.getLong(columnIndexOrThrow11));
                    aVar.mo27428c(a2.getLong(columnIndexOrThrow12));
                    aVar.mo27437g(a2.getString(columnIndexOrThrow13));
                    aVar.mo27441i(a2.getString(i4));
                    aVar.mo27443j(a2.getString(columnIndexOrThrow15));
                    aVar.mo27451n(a2.getString(columnIndexOrThrow16));
                    if (a2.getInt(columnIndexOrThrow17) != 0) {
                        i3 = columnIndexOrThrow16;
                        z = true;
                    } else {
                        i3 = columnIndexOrThrow16;
                        z = false;
                    }
                    aVar.mo27421a(z);
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    aVar.mo27423b(a2.getInt(columnIndexOrThrow18));
                    columnIndexOrThrow18 = columnIndexOrThrow18;
                    aVar.mo27447l(a2.getString(columnIndexOrThrow19));
                    columnIndexOrThrow19 = columnIndexOrThrow19;
                    aVar.mo27449m(a2.getString(columnIndexOrThrow20));
                    columnIndexOrThrow20 = columnIndexOrThrow20;
                    aVar.mo27427c(a2.getInt(columnIndexOrThrow21));
                    columnIndexOrThrow21 = columnIndexOrThrow21;
                    aVar.mo27453o(a2.getString(columnIndexOrThrow22));
                    arrayList = arrayList;
                    arrayList.add(aVar);
                    columnIndexOrThrow22 = columnIndexOrThrow22;
                    columnIndexOrThrow13 = columnIndexOrThrow13;
                    columnIndexOrThrow15 = columnIndexOrThrow15;
                    columnIndexOrThrow2 = columnIndexOrThrow2;
                    i4 = i4;
                    columnIndexOrThrow = columnIndexOrThrow;
                    columnIndexOrThrow16 = i3;
                }
                a2.close();
                hVar.mo7613a();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                hVar.mo7613a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = a;
            a2.close();
            hVar.mo7613a();
            throw th;
        }
    }

    @Override // com.bytedance.ee.bear.drive.dao.AbstractC6954a
    /* renamed from: a */
    public int mo27402a(String str, int i, String str2) {
        AbstractC1090f c = this.f18837g.mo7618c();
        this.f18831a.mo7546g();
        try {
            c.bindLong(1, (long) i);
            if (str2 == null) {
                c.bindNull(2);
            } else {
                c.bindString(2, str2);
            }
            if (str == null) {
                c.bindNull(3);
            } else {
                c.bindString(3, str);
            }
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f18831a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f18831a.mo7547h();
            this.f18837g.mo7616a(c);
        }
    }
}
