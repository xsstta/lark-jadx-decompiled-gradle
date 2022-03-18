package com.bytedance.ee.bear.list.cache;

import android.database.Cursor;
import androidx.lifecycle.AbstractC1154e;
import androidx.lifecycle.LiveData;
import androidx.p038g.p039a.AbstractC1090f;
import androidx.room.AbstractC1428c;
import androidx.room.AbstractC1440i;
import androidx.room.C1429d;
import androidx.room.C1439h;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.ee.bear.list.cache.m */
public final class C8204m implements AbstractC8203l {

    /* renamed from: a */
    public final RoomDatabase f22106a;

    /* renamed from: b */
    private final AbstractC1428c f22107b;

    /* renamed from: c */
    private final AbstractC1440i f22108c;

    /* renamed from: d */
    private final AbstractC1440i f22109d;

    /* renamed from: e */
    private final AbstractC1440i f22110e;

    /* renamed from: f */
    private final AbstractC1440i f22111f;

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8203l
    /* renamed from: a */
    public LiveData<List<C8202k>> mo32169a() {
        final C1439h a = C1439h.m6573a("SELECT * FROM RecentWiki", 0);
        return new AbstractC1154e<List<C8202k>>(this.f22106a.mo7548i()) {
            /* class com.bytedance.ee.bear.list.cache.C8204m.C82106 */

            /* renamed from: i */
            private C1429d.AbstractC1432b f22119i;

            /* access modifiers changed from: protected */
            public void finalize() {
                a.mo7613a();
            }

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public List<C8202k> mo6021c() {
                if (this.f22119i == null) {
                    this.f22119i = new C1429d.AbstractC1432b("RecentWiki", new String[0]) {
                        /* class com.bytedance.ee.bear.list.cache.C8204m.C82106.C82111 */

                        @Override // androidx.room.C1429d.AbstractC1432b
                        /* renamed from: a */
                        public void mo7606a(Set<String> set) {
                            C82106.this.mo6020b();
                        }
                    };
                    C8204m.this.f22106a.mo7550k().mo7598b(this.f22119i);
                }
                Cursor a = C8204m.this.f22106a.mo7532a(a);
                try {
                    int columnIndexOrThrow = a.getColumnIndexOrThrow("wiki_token");
                    int columnIndexOrThrow2 = a.getColumnIndexOrThrow("space_id");
                    int columnIndexOrThrow3 = a.getColumnIndexOrThrow("open_time");
                    int columnIndexOrThrow4 = a.getColumnIndexOrThrow("open_count");
                    int columnIndexOrThrow5 = a.getColumnIndexOrThrow("title");
                    int columnIndexOrThrow6 = a.getColumnIndexOrThrow("owner_id");
                    int columnIndexOrThrow7 = a.getColumnIndexOrThrow("creator_cn_name");
                    int columnIndexOrThrow8 = a.getColumnIndexOrThrow("creator_en_name");
                    int columnIndexOrThrow9 = a.getColumnIndexOrThrow("edit_uid");
                    int columnIndexOrThrow10 = a.getColumnIndexOrThrow("edit_time");
                    int columnIndexOrThrow11 = a.getColumnIndexOrThrow("url");
                    int columnIndexOrThrow12 = a.getColumnIndexOrThrow("obj_token");
                    int columnIndexOrThrow13 = a.getColumnIndexOrThrow("obj_type");
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        C8202k kVar = new C8202k();
                        kVar.mo32138a(a.getString(columnIndexOrThrow));
                        kVar.mo32141b(a.getString(columnIndexOrThrow2));
                        kVar.mo32143c(a.getString(columnIndexOrThrow3));
                        kVar.mo32145d(a.getString(columnIndexOrThrow4));
                        kVar.mo32147e(a.getString(columnIndexOrThrow5));
                        kVar.mo32150f(a.getString(columnIndexOrThrow6));
                        kVar.mo32152g(a.getString(columnIndexOrThrow7));
                        kVar.mo32154h(a.getString(columnIndexOrThrow8));
                        kVar.mo32156i(a.getString(columnIndexOrThrow9));
                        kVar.mo32158j(a.getString(columnIndexOrThrow10));
                        kVar.mo32160k(a.getString(columnIndexOrThrow11));
                        kVar.mo32162l(a.getString(columnIndexOrThrow12));
                        kVar.mo32137a(a.getInt(columnIndexOrThrow13));
                        arrayList = arrayList;
                        arrayList.add(kVar);
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        }.mo6019a();
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8203l
    /* renamed from: c */
    public int mo32172c() {
        AbstractC1090f c = this.f22111f.mo7618c();
        this.f22106a.mo7546g();
        try {
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f22106a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f22106a.mo7547h();
            this.f22111f.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8203l
    /* renamed from: b */
    public List<C8202k> mo32171b() {
        C1439h hVar;
        Throwable th;
        C1439h a = C1439h.m6573a("SELECT * FROM RecentWiki ORDER BY open_time DESC", 0);
        Cursor a2 = this.f22106a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("wiki_token");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("space_id");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("open_time");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("open_count");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("title");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("owner_id");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("creator_cn_name");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("creator_en_name");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("edit_uid");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("edit_time");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("url");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("obj_type");
            hVar = a;
            try {
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    C8202k kVar = new C8202k();
                    kVar.mo32138a(a2.getString(columnIndexOrThrow));
                    kVar.mo32141b(a2.getString(columnIndexOrThrow2));
                    kVar.mo32143c(a2.getString(columnIndexOrThrow3));
                    kVar.mo32145d(a2.getString(columnIndexOrThrow4));
                    kVar.mo32147e(a2.getString(columnIndexOrThrow5));
                    kVar.mo32150f(a2.getString(columnIndexOrThrow6));
                    kVar.mo32152g(a2.getString(columnIndexOrThrow7));
                    kVar.mo32154h(a2.getString(columnIndexOrThrow8));
                    kVar.mo32156i(a2.getString(columnIndexOrThrow9));
                    kVar.mo32158j(a2.getString(columnIndexOrThrow10));
                    kVar.mo32160k(a2.getString(columnIndexOrThrow11));
                    kVar.mo32162l(a2.getString(columnIndexOrThrow12));
                    kVar.mo32137a(a2.getInt(columnIndexOrThrow13));
                    arrayList = arrayList;
                    arrayList.add(kVar);
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

    public C8204m(RoomDatabase roomDatabase) {
        this.f22106a = roomDatabase;
        this.f22107b = new AbstractC1428c<C8202k>(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8204m.C82051 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "INSERT OR REPLACE INTO `RecentWiki`(`wiki_token`,`space_id`,`open_time`,`open_count`,`title`,`owner_id`,`creator_cn_name`,`creator_en_name`,`edit_uid`,`edit_time`,`url`,`obj_token`,`obj_type`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public void mo7588a(AbstractC1090f fVar, C8202k kVar) {
                if (kVar.mo32136a() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, kVar.mo32136a());
                }
                if (kVar.mo32139b() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, kVar.mo32139b());
                }
                if (kVar.mo32142c() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, kVar.mo32142c());
                }
                if (kVar.mo32144d() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, kVar.mo32144d());
                }
                if (kVar.mo32146e() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, kVar.mo32146e());
                }
                if (kVar.mo32149f() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, kVar.mo32149f());
                }
                if (kVar.mo32151g() == null) {
                    fVar.bindNull(7);
                } else {
                    fVar.bindString(7, kVar.mo32151g());
                }
                if (kVar.mo32153h() == null) {
                    fVar.bindNull(8);
                } else {
                    fVar.bindString(8, kVar.mo32153h());
                }
                if (kVar.mo32155i() == null) {
                    fVar.bindNull(9);
                } else {
                    fVar.bindString(9, kVar.mo32155i());
                }
                if (kVar.mo32157j() == null) {
                    fVar.bindNull(10);
                } else {
                    fVar.bindString(10, kVar.mo32157j());
                }
                if (kVar.mo32159k() == null) {
                    fVar.bindNull(11);
                } else {
                    fVar.bindString(11, kVar.mo32159k());
                }
                if (kVar.mo32161l() == null) {
                    fVar.bindNull(12);
                } else {
                    fVar.bindString(12, kVar.mo32161l());
                }
                fVar.bindLong(13, (long) kVar.mo32163m());
            }
        };
        this.f22108c = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8204m.C82062 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM RecentWiki WHERE wiki_token =?";
            }
        };
        this.f22109d = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8204m.C82073 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE RecentWiki SET title = ? WHERE obj_token = ?";
            }
        };
        this.f22110e = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8204m.C82084 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE RecentWiki SET title = ?, edit_time = ? WHERE obj_token = ?";
            }
        };
        this.f22111f = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8204m.C82095 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM RecentWiki";
            }
        };
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8203l
    /* renamed from: a */
    public int mo32166a(String str) {
        AbstractC1090f c = this.f22108c.mo7618c();
        this.f22106a.mo7546g();
        if (str == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f22106a.mo7547h();
                this.f22108c.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str);
        }
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f22106a.mo7549j();
        this.f22106a.mo7547h();
        this.f22108c.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8203l
    /* renamed from: a */
    public long[] mo32170a(List<C8202k> list) {
        this.f22106a.mo7546g();
        try {
            long[] a = this.f22107b.mo7590a((Collection) list);
            this.f22106a.mo7549j();
            return a;
        } finally {
            this.f22106a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8203l
    /* renamed from: a */
    public int mo32167a(String str, String str2) {
        AbstractC1090f c = this.f22109d.mo7618c();
        this.f22106a.mo7546g();
        if (str2 == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f22106a.mo7547h();
                this.f22109d.mo7616a(c);
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
        this.f22106a.mo7549j();
        this.f22106a.mo7547h();
        this.f22109d.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8203l
    /* renamed from: a */
    public int mo32168a(String str, String str2, String str3) {
        AbstractC1090f c = this.f22110e.mo7618c();
        this.f22106a.mo7546g();
        if (str2 == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f22106a.mo7547h();
                this.f22110e.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str2);
        }
        if (str3 == null) {
            c.bindNull(2);
        } else {
            c.bindString(2, str3);
        }
        if (str == null) {
            c.bindNull(3);
        } else {
            c.bindString(3, str);
        }
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f22106a.mo7549j();
        this.f22106a.mo7547h();
        this.f22110e.mo7616a(c);
        return executeUpdateDelete;
    }
}
