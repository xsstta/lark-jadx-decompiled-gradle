package com.bytedance.ee.bear.drive.dao;

import android.database.Cursor;
import androidx.p038g.p039a.AbstractC1090f;
import androidx.room.AbstractC1428c;
import androidx.room.AbstractC1440i;
import androidx.room.C1439h;
import androidx.room.RoomDatabase;
import com.bytedance.ee.bear.drive.dao.p351a.C6956b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.dao.e */
public final class C6973e implements AbstractC6972d {

    /* renamed from: a */
    private final RoomDatabase f18853a;

    /* renamed from: b */
    private final AbstractC1428c f18854b;

    /* renamed from: c */
    private final AbstractC1440i f18855c;

    public C6973e(RoomDatabase roomDatabase) {
        this.f18853a = roomDatabase;
        this.f18854b = new AbstractC1428c<C6956b>(roomDatabase) {
            /* class com.bytedance.ee.bear.drive.dao.C6973e.C69741 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "INSERT OR REPLACE INTO `drive_excel_sub_cache`(`sdk_app_id`,`obj_token`,`data_version`,`sub_id`,`json_data_file_path`,`json_data`) VALUES (?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public void mo7588a(AbstractC1090f fVar, C6956b bVar) {
                if (bVar.mo27474f() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, bVar.mo27474f());
                }
                if (bVar.mo27466b() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, bVar.mo27466b());
                }
                if (bVar.mo27468c() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, bVar.mo27468c());
                }
                if (bVar.mo27464a() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, bVar.mo27464a());
                }
                if (bVar.mo27470d() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, bVar.mo27470d());
                }
                if (bVar.mo27472e() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, bVar.mo27472e());
                }
            }
        };
        this.f18855c = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.drive.dao.C6973e.C69752 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM drive_excel_sub_cache WHERE sdk_app_id = ? AND obj_token = ? AND data_version = ?";
            }
        };
    }

    @Override // com.bytedance.ee.bear.drive.dao.AbstractC6972d
    /* renamed from: a */
    public long mo27480a(C6956b bVar) {
        this.f18853a.mo7546g();
        try {
            long a = this.f18854b.mo7587a(bVar);
            this.f18853a.mo7549j();
            return a;
        } finally {
            this.f18853a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.drive.dao.AbstractC6972d
    /* renamed from: b */
    public int mo27483b(String str, String str2, String str3) {
        AbstractC1090f c = this.f18855c.mo7618c();
        this.f18853a.mo7546g();
        if (str == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f18853a.mo7547h();
                this.f18855c.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str);
        }
        if (str2 == null) {
            c.bindNull(2);
        } else {
            c.bindString(2, str2);
        }
        if (str3 == null) {
            c.bindNull(3);
        } else {
            c.bindString(3, str3);
        }
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f18853a.mo7549j();
        this.f18853a.mo7547h();
        this.f18855c.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.drive.dao.AbstractC6972d
    /* renamed from: a */
    public List<C6956b> mo27482a(String str, String str2, String str3) {
        C1439h a = C1439h.m6573a("SELECT * FROM drive_excel_sub_cache WHERE sdk_app_id = ? AND obj_token = ? AND data_version = ?", 3);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        if (str2 == null) {
            a.bindNull(2);
        } else {
            a.bindString(2, str2);
        }
        if (str3 == null) {
            a.bindNull(3);
        } else {
            a.bindString(3, str3);
        }
        Cursor a2 = this.f18853a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("sdk_app_id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("data_version");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("sub_id");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("json_data_file_path");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("json_data");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C6956b bVar = new C6956b();
                bVar.mo27475f(a2.getString(columnIndexOrThrow));
                bVar.mo27467b(a2.getString(columnIndexOrThrow2));
                bVar.mo27469c(a2.getString(columnIndexOrThrow3));
                bVar.mo27465a(a2.getString(columnIndexOrThrow4));
                bVar.mo27471d(a2.getString(columnIndexOrThrow5));
                bVar.mo27473e(a2.getString(columnIndexOrThrow6));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo7613a();
        }
    }

    @Override // com.bytedance.ee.bear.drive.dao.AbstractC6972d
    /* renamed from: a */
    public C6956b mo27481a(String str, String str2, String str3, String str4) {
        C6956b bVar;
        C1439h a = C1439h.m6573a("SELECT * FROM drive_excel_sub_cache WHERE sdk_app_id = ? AND obj_token = ? AND data_version = ? AND sub_id = ?", 4);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        if (str2 == null) {
            a.bindNull(2);
        } else {
            a.bindString(2, str2);
        }
        if (str3 == null) {
            a.bindNull(3);
        } else {
            a.bindString(3, str3);
        }
        if (str4 == null) {
            a.bindNull(4);
        } else {
            a.bindString(4, str4);
        }
        Cursor a2 = this.f18853a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("sdk_app_id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("data_version");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("sub_id");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("json_data_file_path");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("json_data");
            if (a2.moveToFirst()) {
                bVar = new C6956b();
                bVar.mo27475f(a2.getString(columnIndexOrThrow));
                bVar.mo27467b(a2.getString(columnIndexOrThrow2));
                bVar.mo27469c(a2.getString(columnIndexOrThrow3));
                bVar.mo27465a(a2.getString(columnIndexOrThrow4));
                bVar.mo27471d(a2.getString(columnIndexOrThrow5));
                bVar.mo27473e(a2.getString(columnIndexOrThrow6));
            } else {
                bVar = null;
            }
            return bVar;
        } finally {
            a2.close();
            a.mo7613a();
        }
    }
}
