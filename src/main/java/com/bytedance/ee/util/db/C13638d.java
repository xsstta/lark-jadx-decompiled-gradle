package com.bytedance.ee.util.db;

import android.database.Cursor;
import androidx.p038g.p039a.AbstractC1090f;
import androidx.room.AbstractC1428c;
import androidx.room.C1439h;
import androidx.room.RoomDatabase;

/* renamed from: com.bytedance.ee.util.db.d */
public final class C13638d implements AbstractC13637c {

    /* renamed from: a */
    private final RoomDatabase f35820a;

    /* renamed from: b */
    private final AbstractC1428c f35821b;

    /* renamed from: c */
    private final AbstractC1428c f35822c;

    public C13638d(RoomDatabase roomDatabase) {
        this.f35820a = roomDatabase;
        this.f35821b = new AbstractC1428c<C13645f>(roomDatabase) {
            /* class com.bytedance.ee.util.db.C13638d.C136391 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "INSERT OR REPLACE INTO `key_value_model`(`key`,`value`) VALUES (?,?)";
            }

            /* renamed from: a */
            public void mo7588a(AbstractC1090f fVar, C13645f fVar2) {
                if (fVar2.mo50609a() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, fVar2.mo50609a());
                }
                if (fVar2.mo50611b() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, fVar2.mo50611b());
                }
            }
        };
        this.f35822c = new AbstractC1428c<C13645f>(roomDatabase) {
            /* class com.bytedance.ee.util.db.C13638d.C136402 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "INSERT OR ABORT INTO `key_value_model`(`key`,`value`) VALUES (?,?)";
            }

            /* renamed from: a */
            public void mo7588a(AbstractC1090f fVar, C13645f fVar2) {
                if (fVar2.mo50609a() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, fVar2.mo50609a());
                }
                if (fVar2.mo50611b() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, fVar2.mo50611b());
                }
            }
        };
    }

    @Override // com.bytedance.ee.util.db.AbstractC13637c
    /* renamed from: a */
    public long mo50599a(C13645f fVar) {
        this.f35820a.mo7546g();
        try {
            long a = this.f35821b.mo7587a(fVar);
            this.f35820a.mo7549j();
            return a;
        } finally {
            this.f35820a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.util.db.AbstractC13637c
    /* renamed from: a */
    public C13645f mo50600a(String str) {
        C13645f fVar;
        C1439h a = C1439h.m6573a("SELECT * FROM key_value_model WHERE `key` = ?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        Cursor a2 = this.f35820a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("key");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("value");
            if (a2.moveToFirst()) {
                fVar = new C13645f();
                fVar.mo50612b(a2.getString(columnIndexOrThrow));
                fVar.mo50610a(a2.getString(columnIndexOrThrow2));
            } else {
                fVar = null;
            }
            return fVar;
        } finally {
            a2.close();
            a.mo7613a();
        }
    }
}
