package com.bytedance.ee.bear.document.offline.file.p319a;

import android.database.Cursor;
import androidx.p038g.p039a.AbstractC1090f;
import androidx.room.AbstractC1421b;
import androidx.room.AbstractC1428c;
import androidx.room.AbstractC1440i;
import androidx.room.C1439h;
import androidx.room.RoomDatabase;
import androidx.room.p048b.C1422a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.document.offline.file.a.b */
public final class C5931b implements AbstractC5930a {

    /* renamed from: a */
    private final RoomDatabase f16623a;

    /* renamed from: b */
    private final AbstractC1428c f16624b;

    /* renamed from: c */
    private final AbstractC1428c f16625c;

    /* renamed from: d */
    private final AbstractC1421b f16626d;

    /* renamed from: e */
    private final AbstractC1440i f16627e;

    /* renamed from: f */
    private final AbstractC1440i f16628f;

    @Override // com.bytedance.ee.bear.document.offline.file.p319a.AbstractC5930a
    /* renamed from: a */
    public List<String> mo23940a() {
        C1439h a = C1439h.m6573a("SELECT name FROM file_model group by name", 0);
        Cursor a2 = this.f16623a.mo7532a(a);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.getString(0));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo7613a();
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.file.p319a.AbstractC5930a
    /* renamed from: a */
    public long mo23939a(C5937c cVar) {
        this.f16623a.mo7546g();
        try {
            long a = this.f16625c.mo7587a(cVar);
            this.f16623a.mo7549j();
            return a;
        } finally {
            this.f16623a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.file.p319a.AbstractC5930a
    /* renamed from: b */
    public int mo23944b(C5937c cVar) {
        this.f16623a.mo7546g();
        try {
            int a = this.f16626d.mo7568a(cVar) + 0;
            this.f16623a.mo7549j();
            return a;
        } finally {
            this.f16623a.mo7547h();
        }
    }

    public C5931b(RoomDatabase roomDatabase) {
        this.f16623a = roomDatabase;
        this.f16624b = new AbstractC1428c<C5937c>(roomDatabase) {
            /* class com.bytedance.ee.bear.document.offline.file.p319a.C5931b.C59321 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "INSERT OR ABORT INTO `file_model`(`name`,`token`,`doc_url`,`path`,`uri`,`local_url`,`net_url`,`file_modified_time`,`new_upload_key`,`upload_key`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public void mo7588a(AbstractC1090f fVar, C5937c cVar) {
                if (cVar.mo23954a() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, cVar.mo23954a());
                }
                if (cVar.mo23957b() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, cVar.mo23957b());
                }
                if (cVar.mo23959c() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, cVar.mo23959c());
                }
                if (cVar.mo23961d() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, cVar.mo23961d());
                }
                if (cVar.mo23973j() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, cVar.mo23973j());
                }
                if (cVar.mo23963e() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, cVar.mo23963e());
                }
                if (cVar.mo23965f() == null) {
                    fVar.bindNull(7);
                } else {
                    fVar.bindString(7, cVar.mo23965f());
                }
                if (cVar.mo23971i() == null) {
                    fVar.bindNull(8);
                } else {
                    fVar.bindLong(8, cVar.mo23971i().longValue());
                }
                if (cVar.mo23969h() == null) {
                    fVar.bindNull(9);
                } else {
                    fVar.bindString(9, cVar.mo23969h());
                }
                if (cVar.mo23967g() == null) {
                    fVar.bindNull(10);
                } else {
                    fVar.bindString(10, cVar.mo23967g());
                }
            }
        };
        this.f16625c = new AbstractC1428c<C5937c>(roomDatabase) {
            /* class com.bytedance.ee.bear.document.offline.file.p319a.C5931b.C59332 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "INSERT OR REPLACE INTO `file_model`(`name`,`token`,`doc_url`,`path`,`uri`,`local_url`,`net_url`,`file_modified_time`,`new_upload_key`,`upload_key`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public void mo7588a(AbstractC1090f fVar, C5937c cVar) {
                if (cVar.mo23954a() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, cVar.mo23954a());
                }
                if (cVar.mo23957b() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, cVar.mo23957b());
                }
                if (cVar.mo23959c() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, cVar.mo23959c());
                }
                if (cVar.mo23961d() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, cVar.mo23961d());
                }
                if (cVar.mo23973j() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, cVar.mo23973j());
                }
                if (cVar.mo23963e() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, cVar.mo23963e());
                }
                if (cVar.mo23965f() == null) {
                    fVar.bindNull(7);
                } else {
                    fVar.bindString(7, cVar.mo23965f());
                }
                if (cVar.mo23971i() == null) {
                    fVar.bindNull(8);
                } else {
                    fVar.bindLong(8, cVar.mo23971i().longValue());
                }
                if (cVar.mo23969h() == null) {
                    fVar.bindNull(9);
                } else {
                    fVar.bindString(9, cVar.mo23969h());
                }
                if (cVar.mo23967g() == null) {
                    fVar.bindNull(10);
                } else {
                    fVar.bindString(10, cVar.mo23967g());
                }
            }
        };
        this.f16626d = new AbstractC1421b<C5937c>(roomDatabase) {
            /* class com.bytedance.ee.bear.document.offline.file.p319a.C5931b.C59343 */

            @Override // androidx.room.AbstractC1421b, androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE OR ABORT `file_model` SET `name` = ?,`token` = ?,`doc_url` = ?,`path` = ?,`uri` = ?,`local_url` = ?,`net_url` = ?,`file_modified_time` = ?,`new_upload_key` = ?,`upload_key` = ? WHERE `name` = ? AND `token` = ?";
            }

            /* renamed from: a */
            public void mo7571a(AbstractC1090f fVar, C5937c cVar) {
                if (cVar.mo23954a() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, cVar.mo23954a());
                }
                if (cVar.mo23957b() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, cVar.mo23957b());
                }
                if (cVar.mo23959c() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, cVar.mo23959c());
                }
                if (cVar.mo23961d() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, cVar.mo23961d());
                }
                if (cVar.mo23973j() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, cVar.mo23973j());
                }
                if (cVar.mo23963e() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, cVar.mo23963e());
                }
                if (cVar.mo23965f() == null) {
                    fVar.bindNull(7);
                } else {
                    fVar.bindString(7, cVar.mo23965f());
                }
                if (cVar.mo23971i() == null) {
                    fVar.bindNull(8);
                } else {
                    fVar.bindLong(8, cVar.mo23971i().longValue());
                }
                if (cVar.mo23969h() == null) {
                    fVar.bindNull(9);
                } else {
                    fVar.bindString(9, cVar.mo23969h());
                }
                if (cVar.mo23967g() == null) {
                    fVar.bindNull(10);
                } else {
                    fVar.bindString(10, cVar.mo23967g());
                }
                if (cVar.mo23954a() == null) {
                    fVar.bindNull(11);
                } else {
                    fVar.bindString(11, cVar.mo23954a());
                }
                if (cVar.mo23957b() == null) {
                    fVar.bindNull(12);
                } else {
                    fVar.bindString(12, cVar.mo23957b());
                }
            }
        };
        this.f16627e = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.document.offline.file.p319a.C5931b.C59354 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM file_model WHERE token= ?";
            }
        };
        this.f16628f = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.document.offline.file.p319a.C5931b.C59365 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM file_model WHERE path= ?";
            }
        };
    }

    @Override // com.bytedance.ee.bear.document.offline.file.p319a.AbstractC5930a
    /* renamed from: d */
    public int mo23949d(String str) {
        AbstractC1090f c = this.f16627e.mo7618c();
        this.f16623a.mo7546g();
        if (str == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f16623a.mo7547h();
                this.f16627e.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str);
        }
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f16623a.mo7549j();
        this.f16623a.mo7547h();
        this.f16627e.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.document.offline.file.p319a.AbstractC5930a
    /* renamed from: e */
    public int mo23950e(String str) {
        AbstractC1090f c = this.f16628f.mo7618c();
        this.f16623a.mo7546g();
        if (str == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f16623a.mo7547h();
                this.f16628f.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str);
        }
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f16623a.mo7549j();
        this.f16623a.mo7547h();
        this.f16628f.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.document.offline.file.p319a.AbstractC5930a
    /* renamed from: a */
    public List<String> mo23941a(int i) {
        C1439h a = C1439h.m6573a("SELECT path FROM file_model WHERE net_url is NOT NULL order by file_modified_time asc limit ?", 1);
        a.bindLong(1, (long) i);
        Cursor a2 = this.f16623a.mo7532a(a);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.getString(0));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo7613a();
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.file.p319a.AbstractC5930a
    /* renamed from: b */
    public int mo23945b(List<String> list) {
        StringBuilder a = C1422a.m6520a();
        a.append("DELETE FROM file_model WHERE token IN(");
        C1422a.m6521a(a, list.size());
        a.append(")");
        AbstractC1090f a2 = this.f16623a.mo7534a(a.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                a2.bindNull(i);
            } else {
                a2.bindString(i, str);
            }
            i++;
        }
        this.f16623a.mo7546g();
        try {
            int executeUpdateDelete = a2.executeUpdateDelete();
            this.f16623a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f16623a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.file.p319a.AbstractC5930a
    /* renamed from: c */
    public int mo23947c(List<String> list) {
        StringBuilder a = C1422a.m6520a();
        a.append("DELETE FROM file_model WHERE path IN(");
        C1422a.m6521a(a, list.size());
        a.append(")");
        AbstractC1090f a2 = this.f16623a.mo7534a(a.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                a2.bindNull(i);
            } else {
                a2.bindString(i, str);
            }
            i++;
        }
        this.f16623a.mo7546g();
        try {
            int executeUpdateDelete = a2.executeUpdateDelete();
            this.f16623a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f16623a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.file.p319a.AbstractC5930a
    /* renamed from: a */
    public List<C5937c> mo23942a(String str) {
        Long l;
        C1439h a = C1439h.m6573a("SELECT * FROM file_model WHERE token = ?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        Cursor a2 = this.f16623a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("name");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("token");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("doc_url");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("path");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("uri");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("local_url");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("net_url");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("file_modified_time");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("new_upload_key");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("upload_key");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C5937c cVar = new C5937c();
                cVar.mo23956a(a2.getString(columnIndexOrThrow));
                cVar.mo23958b(a2.getString(columnIndexOrThrow2));
                cVar.mo23960c(a2.getString(columnIndexOrThrow3));
                cVar.mo23962d(a2.getString(columnIndexOrThrow4));
                cVar.mo23972i(a2.getString(columnIndexOrThrow5));
                cVar.mo23964e(a2.getString(columnIndexOrThrow6));
                cVar.mo23966f(a2.getString(columnIndexOrThrow7));
                if (a2.isNull(columnIndexOrThrow8)) {
                    l = null;
                } else {
                    l = Long.valueOf(a2.getLong(columnIndexOrThrow8));
                }
                cVar.mo23955a(l);
                cVar.mo23970h(a2.getString(columnIndexOrThrow9));
                cVar.mo23968g(a2.getString(columnIndexOrThrow10));
                arrayList.add(cVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo7613a();
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.file.p319a.AbstractC5930a
    /* renamed from: b */
    public C5937c mo23946b(String str) {
        C1439h a = C1439h.m6573a("SELECT * FROM file_model WHERE local_url = ?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        Cursor a2 = this.f16623a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("name");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("token");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("doc_url");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("path");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("uri");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("local_url");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("net_url");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("file_modified_time");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("new_upload_key");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("upload_key");
            C5937c cVar = null;
            Long l = null;
            if (a2.moveToFirst()) {
                C5937c cVar2 = new C5937c();
                cVar2.mo23956a(a2.getString(columnIndexOrThrow));
                cVar2.mo23958b(a2.getString(columnIndexOrThrow2));
                cVar2.mo23960c(a2.getString(columnIndexOrThrow3));
                cVar2.mo23962d(a2.getString(columnIndexOrThrow4));
                cVar2.mo23972i(a2.getString(columnIndexOrThrow5));
                cVar2.mo23964e(a2.getString(columnIndexOrThrow6));
                cVar2.mo23966f(a2.getString(columnIndexOrThrow7));
                if (!a2.isNull(columnIndexOrThrow8)) {
                    l = Long.valueOf(a2.getLong(columnIndexOrThrow8));
                }
                cVar2.mo23955a(l);
                cVar2.mo23970h(a2.getString(columnIndexOrThrow9));
                cVar2.mo23968g(a2.getString(columnIndexOrThrow10));
                cVar = cVar2;
            }
            return cVar;
        } finally {
            a2.close();
            a.mo7613a();
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.file.p319a.AbstractC5930a
    /* renamed from: c */
    public C5937c mo23948c(String str) {
        C1439h a = C1439h.m6573a("SELECT * FROM file_model WHERE net_url = ?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        Cursor a2 = this.f16623a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("name");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("token");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("doc_url");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("path");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("uri");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("local_url");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("net_url");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("file_modified_time");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("new_upload_key");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("upload_key");
            C5937c cVar = null;
            Long l = null;
            if (a2.moveToFirst()) {
                C5937c cVar2 = new C5937c();
                cVar2.mo23956a(a2.getString(columnIndexOrThrow));
                cVar2.mo23958b(a2.getString(columnIndexOrThrow2));
                cVar2.mo23960c(a2.getString(columnIndexOrThrow3));
                cVar2.mo23962d(a2.getString(columnIndexOrThrow4));
                cVar2.mo23972i(a2.getString(columnIndexOrThrow5));
                cVar2.mo23964e(a2.getString(columnIndexOrThrow6));
                cVar2.mo23966f(a2.getString(columnIndexOrThrow7));
                if (!a2.isNull(columnIndexOrThrow8)) {
                    l = Long.valueOf(a2.getLong(columnIndexOrThrow8));
                }
                cVar2.mo23955a(l);
                cVar2.mo23970h(a2.getString(columnIndexOrThrow9));
                cVar2.mo23968g(a2.getString(columnIndexOrThrow10));
                cVar = cVar2;
            }
            return cVar;
        } finally {
            a2.close();
            a.mo7613a();
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.file.p319a.AbstractC5930a
    /* renamed from: a */
    public long[] mo23943a(List<C5937c> list) {
        this.f16623a.mo7546g();
        try {
            long[] a = this.f16624b.mo7590a((Collection) list);
            this.f16623a.mo7549j();
            return a;
        } finally {
            this.f16623a.mo7547h();
        }
    }
}
