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

/* renamed from: com.bytedance.ee.bear.list.cache.q */
public final class C8215q implements AbstractC8214p {

    /* renamed from: a */
    public final RoomDatabase f22139a;

    /* renamed from: b */
    private final AbstractC1428c f22140b;

    /* renamed from: c */
    private final AbstractC1440i f22141c;

    /* renamed from: d */
    private final AbstractC1440i f22142d;

    /* renamed from: e */
    private final AbstractC1440i f22143e;

    /* renamed from: f */
    private final AbstractC1440i f22144f;

    /* renamed from: g */
    private final AbstractC1440i f22145g;

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8214p
    /* renamed from: c */
    public LiveData<List<C8213o>> mo32221c() {
        final C1439h a = C1439h.m6573a("SELECT * FROM WikiSpace ORDER BY is_star DESC, browse_time DESC, space_name ASC", 0);
        return new AbstractC1154e<List<C8213o>>(this.f22139a.mo7548i()) {
            /* class com.bytedance.ee.bear.list.cache.C8215q.C82227 */

            /* renamed from: i */
            private C1429d.AbstractC1432b f22154i;

            /* access modifiers changed from: protected */
            public void finalize() {
                a.mo7613a();
            }

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public List<C8213o> mo6021c() {
                boolean z;
                boolean z2;
                if (this.f22154i == null) {
                    this.f22154i = new C1429d.AbstractC1432b("WikiSpace", new String[0]) {
                        /* class com.bytedance.ee.bear.list.cache.C8215q.C82227.C82231 */

                        @Override // androidx.room.C1429d.AbstractC1432b
                        /* renamed from: a */
                        public void mo7606a(Set<String> set) {
                            C82227.this.mo6020b();
                        }
                    };
                    C8215q.this.f22139a.mo7550k().mo7598b(this.f22154i);
                }
                Cursor a = C8215q.this.f22139a.mo7532a(a);
                try {
                    int columnIndexOrThrow = a.getColumnIndexOrThrow("space_id");
                    int columnIndexOrThrow2 = a.getColumnIndexOrThrow("user_id");
                    int columnIndexOrThrow3 = a.getColumnIndexOrThrow("space_name");
                    int columnIndexOrThrow4 = a.getColumnIndexOrThrow("space_icon");
                    int columnIndexOrThrow5 = a.getColumnIndexOrThrow("attr");
                    int columnIndexOrThrow6 = a.getColumnIndexOrThrow("description");
                    int columnIndexOrThrow7 = a.getColumnIndexOrThrow("is_star");
                    int columnIndexOrThrow8 = a.getColumnIndexOrThrow("browse_time");
                    int columnIndexOrThrow9 = a.getColumnIndexOrThrow("wiki_token");
                    int columnIndexOrThrow10 = a.getColumnIndexOrThrow("obj_type");
                    int columnIndexOrThrow11 = a.getColumnIndexOrThrow("obj_token");
                    int columnIndexOrThrow12 = a.getColumnIndexOrThrow("origin");
                    int columnIndexOrThrow13 = a.getColumnIndexOrThrow("thumbnail");
                    int columnIndexOrThrow14 = a.getColumnIndexOrThrow("cover_key");
                    int columnIndexOrThrow15 = a.getColumnIndexOrThrow("is_graph_dark");
                    int columnIndexOrThrow16 = a.getColumnIndexOrThrow("color_value");
                    int columnIndexOrThrow17 = a.getColumnIndexOrThrow("wiki_scope");
                    int columnIndexOrThrow18 = a.getColumnIndexOrThrow("space_type");
                    int i = columnIndexOrThrow14;
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        C8213o oVar = new C8213o();
                        oVar.mo32178a(a.getString(columnIndexOrThrow));
                        oVar.mo32182b(a.getString(columnIndexOrThrow2));
                        oVar.mo32186c(a.getString(columnIndexOrThrow3));
                        oVar.mo32189d(a.getString(columnIndexOrThrow4));
                        oVar.mo32177a(a.getInt(columnIndexOrThrow5));
                        oVar.mo32191e(a.getString(columnIndexOrThrow6));
                        if (a.getInt(columnIndexOrThrow7) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        oVar.mo32179a(z);
                        oVar.mo32193f(a.getString(columnIndexOrThrow8));
                        oVar.mo32194g(a.getString(columnIndexOrThrow9));
                        oVar.mo32181b(a.getInt(columnIndexOrThrow10));
                        oVar.mo32197h(a.getString(columnIndexOrThrow11));
                        oVar.mo32199i(a.getString(columnIndexOrThrow12));
                        oVar.mo32201j(a.getString(columnIndexOrThrow13));
                        oVar.mo32203k(a.getString(i));
                        if (a.getInt(columnIndexOrThrow15) != 0) {
                            columnIndexOrThrow15 = columnIndexOrThrow15;
                            z2 = true;
                        } else {
                            columnIndexOrThrow15 = columnIndexOrThrow15;
                            z2 = false;
                        }
                        oVar.mo32183b(z2);
                        oVar.mo32205l(a.getString(columnIndexOrThrow16));
                        oVar.mo32185c(a.getInt(columnIndexOrThrow17));
                        oVar.mo32188d(a.getInt(columnIndexOrThrow18));
                        arrayList = arrayList;
                        arrayList.add(oVar);
                        columnIndexOrThrow18 = columnIndexOrThrow18;
                        columnIndexOrThrow = columnIndexOrThrow;
                        i = i;
                        columnIndexOrThrow16 = columnIndexOrThrow16;
                        columnIndexOrThrow17 = columnIndexOrThrow17;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        }.mo6019a();
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8214p
    /* renamed from: a */
    public int mo32212a() {
        AbstractC1090f c = this.f22141c.mo7618c();
        this.f22139a.mo7546g();
        try {
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f22139a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f22139a.mo7547h();
            this.f22141c.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8214p
    /* renamed from: b */
    public List<C8213o> mo32220b() {
        C1439h hVar;
        Throwable th;
        boolean z;
        boolean z2;
        C1439h a = C1439h.m6573a("SELECT * FROM WikiSpace ORDER BY is_star DESC, browse_time DESC, space_name ASC", 0);
        Cursor a2 = this.f22139a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("space_id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("user_id");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("space_name");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("space_icon");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("attr");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("description");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("is_star");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("browse_time");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("wiki_token");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("obj_type");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("origin");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("thumbnail");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("cover_key");
            hVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("is_graph_dark");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("color_value");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("wiki_scope");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("space_type");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    C8213o oVar = new C8213o();
                    oVar.mo32178a(a2.getString(columnIndexOrThrow));
                    oVar.mo32182b(a2.getString(columnIndexOrThrow2));
                    oVar.mo32186c(a2.getString(columnIndexOrThrow3));
                    oVar.mo32189d(a2.getString(columnIndexOrThrow4));
                    oVar.mo32177a(a2.getInt(columnIndexOrThrow5));
                    oVar.mo32191e(a2.getString(columnIndexOrThrow6));
                    if (a2.getInt(columnIndexOrThrow7) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    oVar.mo32179a(z);
                    oVar.mo32193f(a2.getString(columnIndexOrThrow8));
                    oVar.mo32194g(a2.getString(columnIndexOrThrow9));
                    oVar.mo32181b(a2.getInt(columnIndexOrThrow10));
                    oVar.mo32197h(a2.getString(columnIndexOrThrow11));
                    oVar.mo32199i(a2.getString(columnIndexOrThrow12));
                    oVar.mo32201j(a2.getString(columnIndexOrThrow13));
                    oVar.mo32203k(a2.getString(i));
                    if (a2.getInt(columnIndexOrThrow15) != 0) {
                        columnIndexOrThrow15 = columnIndexOrThrow15;
                        z2 = true;
                    } else {
                        columnIndexOrThrow15 = columnIndexOrThrow15;
                        z2 = false;
                    }
                    oVar.mo32183b(z2);
                    oVar.mo32205l(a2.getString(columnIndexOrThrow16));
                    oVar.mo32185c(a2.getInt(columnIndexOrThrow17));
                    oVar.mo32188d(a2.getInt(columnIndexOrThrow18));
                    arrayList.add(oVar);
                    columnIndexOrThrow18 = columnIndexOrThrow18;
                    columnIndexOrThrow = columnIndexOrThrow;
                    i = i;
                    arrayList = arrayList;
                    columnIndexOrThrow13 = columnIndexOrThrow13;
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    columnIndexOrThrow17 = columnIndexOrThrow17;
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

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8214p
    /* renamed from: a */
    public long[] mo32217a(List<C8213o> list) {
        this.f22139a.mo7546g();
        try {
            long[] a = this.f22140b.mo7590a((Collection) list);
            this.f22139a.mo7549j();
            return a;
        } finally {
            this.f22139a.mo7547h();
        }
    }

    public C8215q(RoomDatabase roomDatabase) {
        this.f22139a = roomDatabase;
        this.f22140b = new AbstractC1428c<C8213o>(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8215q.C82161 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "INSERT OR REPLACE INTO `WikiSpace`(`space_id`,`user_id`,`space_name`,`space_icon`,`attr`,`description`,`is_star`,`browse_time`,`wiki_token`,`obj_type`,`obj_token`,`origin`,`thumbnail`,`cover_key`,`is_graph_dark`,`color_value`,`wiki_scope`,`space_type`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public void mo7588a(AbstractC1090f fVar, C8213o oVar) {
                if (oVar.mo32176a() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, oVar.mo32176a());
                }
                if (oVar.mo32180b() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, oVar.mo32180b());
                }
                if (oVar.mo32184c() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, oVar.mo32184c());
                }
                if (oVar.mo32187d() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, oVar.mo32187d());
                }
                fVar.bindLong(5, (long) oVar.mo32190e());
                if (oVar.mo32192f() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, oVar.mo32192f());
                }
                fVar.bindLong(7, oVar.mo32195g() ? 1 : 0);
                if (oVar.mo32196h() == null) {
                    fVar.bindNull(8);
                } else {
                    fVar.bindString(8, oVar.mo32196h());
                }
                if (oVar.mo32198i() == null) {
                    fVar.bindNull(9);
                } else {
                    fVar.bindString(9, oVar.mo32198i());
                }
                fVar.bindLong(10, (long) oVar.mo32200j());
                if (oVar.mo32202k() == null) {
                    fVar.bindNull(11);
                } else {
                    fVar.bindString(11, oVar.mo32202k());
                }
                if (oVar.mo32204l() == null) {
                    fVar.bindNull(12);
                } else {
                    fVar.bindString(12, oVar.mo32204l());
                }
                if (oVar.mo32206m() == null) {
                    fVar.bindNull(13);
                } else {
                    fVar.bindString(13, oVar.mo32206m());
                }
                if (oVar.mo32207n() == null) {
                    fVar.bindNull(14);
                } else {
                    fVar.bindString(14, oVar.mo32207n());
                }
                fVar.bindLong(15, oVar.mo32208o() ? 1 : 0);
                if (oVar.mo32209p() == null) {
                    fVar.bindNull(16);
                } else {
                    fVar.bindString(16, oVar.mo32209p());
                }
                fVar.bindLong(17, (long) oVar.mo32210q());
                fVar.bindLong(18, (long) oVar.mo32211r());
            }
        };
        this.f22141c = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8215q.C82172 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM WikiSpace";
            }
        };
        this.f22142d = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8215q.C82183 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM WikiSpace WHERE obj_token =?";
            }
        };
        this.f22143e = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8215q.C82194 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE WikiSpace SET space_name= ? WHERE obj_token= ?";
            }
        };
        this.f22144f = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8215q.C82205 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE WikiSpace SET is_star= ? WHERE obj_token= ?";
            }
        };
        this.f22145g = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8215q.C82216 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE WikiSpace SET is_star= ? WHERE space_id= ?";
            }
        };
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8214p
    /* renamed from: a */
    public int mo32213a(String str) {
        AbstractC1090f c = this.f22142d.mo7618c();
        this.f22139a.mo7546g();
        if (str == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f22139a.mo7547h();
                this.f22142d.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str);
        }
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f22139a.mo7549j();
        this.f22139a.mo7547h();
        this.f22142d.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8214p
    /* renamed from: b */
    public C8213o mo32219b(String str) {
        C1439h hVar;
        Throwable th;
        C8213o oVar;
        boolean z;
        boolean z2;
        C1439h a = C1439h.m6573a("SELECT * FROM WikiSpace WHERE space_id=?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        Cursor a2 = this.f22139a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("space_id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("user_id");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("space_name");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("space_icon");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("attr");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("description");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("is_star");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("browse_time");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("wiki_token");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("obj_type");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("origin");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("thumbnail");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("cover_key");
            hVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("is_graph_dark");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("color_value");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("wiki_scope");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("space_type");
                if (a2.moveToFirst()) {
                    oVar = new C8213o();
                    oVar.mo32178a(a2.getString(columnIndexOrThrow));
                    oVar.mo32182b(a2.getString(columnIndexOrThrow2));
                    oVar.mo32186c(a2.getString(columnIndexOrThrow3));
                    oVar.mo32189d(a2.getString(columnIndexOrThrow4));
                    oVar.mo32177a(a2.getInt(columnIndexOrThrow5));
                    oVar.mo32191e(a2.getString(columnIndexOrThrow6));
                    if (a2.getInt(columnIndexOrThrow7) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    oVar.mo32179a(z);
                    oVar.mo32193f(a2.getString(columnIndexOrThrow8));
                    oVar.mo32194g(a2.getString(columnIndexOrThrow9));
                    oVar.mo32181b(a2.getInt(columnIndexOrThrow10));
                    oVar.mo32197h(a2.getString(columnIndexOrThrow11));
                    oVar.mo32199i(a2.getString(columnIndexOrThrow12));
                    oVar.mo32201j(a2.getString(columnIndexOrThrow13));
                    oVar.mo32203k(a2.getString(columnIndexOrThrow14));
                    if (a2.getInt(columnIndexOrThrow15) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    oVar.mo32183b(z2);
                    oVar.mo32205l(a2.getString(columnIndexOrThrow16));
                    oVar.mo32185c(a2.getInt(columnIndexOrThrow17));
                    oVar.mo32188d(a2.getInt(columnIndexOrThrow18));
                } else {
                    oVar = null;
                }
                a2.close();
                hVar.mo7613a();
                return oVar;
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

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8214p
    /* renamed from: a */
    public List<C8213o> mo32216a(int i) {
        C1439h hVar;
        Throwable th;
        boolean z;
        boolean z2;
        C1439h a = C1439h.m6573a("SELECT * FROM WikiSpace WHERE space_type=? ORDER BY is_star DESC, browse_time DESC, space_name ASC", 1);
        a.bindLong(1, (long) i);
        Cursor a2 = this.f22139a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("space_id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("user_id");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("space_name");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("space_icon");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("attr");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("description");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("is_star");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("browse_time");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("wiki_token");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("obj_type");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("origin");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("thumbnail");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("cover_key");
            hVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("is_graph_dark");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("color_value");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("wiki_scope");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("space_type");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    C8213o oVar = new C8213o();
                    oVar.mo32178a(a2.getString(columnIndexOrThrow));
                    oVar.mo32182b(a2.getString(columnIndexOrThrow2));
                    oVar.mo32186c(a2.getString(columnIndexOrThrow3));
                    oVar.mo32189d(a2.getString(columnIndexOrThrow4));
                    oVar.mo32177a(a2.getInt(columnIndexOrThrow5));
                    oVar.mo32191e(a2.getString(columnIndexOrThrow6));
                    if (a2.getInt(columnIndexOrThrow7) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    oVar.mo32179a(z);
                    oVar.mo32193f(a2.getString(columnIndexOrThrow8));
                    oVar.mo32194g(a2.getString(columnIndexOrThrow9));
                    oVar.mo32181b(a2.getInt(columnIndexOrThrow10));
                    oVar.mo32197h(a2.getString(columnIndexOrThrow11));
                    oVar.mo32199i(a2.getString(columnIndexOrThrow12));
                    oVar.mo32201j(a2.getString(columnIndexOrThrow13));
                    oVar.mo32203k(a2.getString(i2));
                    int i3 = a2.getInt(columnIndexOrThrow15);
                    columnIndexOrThrow15 = columnIndexOrThrow15;
                    if (i3 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    oVar.mo32183b(z2);
                    oVar.mo32205l(a2.getString(columnIndexOrThrow16));
                    oVar.mo32185c(a2.getInt(columnIndexOrThrow17));
                    oVar.mo32188d(a2.getInt(columnIndexOrThrow18));
                    arrayList.add(oVar);
                    columnIndexOrThrow18 = columnIndexOrThrow18;
                    columnIndexOrThrow = columnIndexOrThrow;
                    i2 = i2;
                    arrayList = arrayList;
                    columnIndexOrThrow13 = columnIndexOrThrow13;
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    columnIndexOrThrow17 = columnIndexOrThrow17;
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

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8214p
    /* renamed from: b */
    public int mo32218b(String str, boolean z) {
        int i;
        AbstractC1090f c = this.f22145g.mo7618c();
        this.f22139a.mo7546g();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            c.bindLong(1, (long) i);
            if (str == null) {
                c.bindNull(2);
            } else {
                c.bindString(2, str);
            }
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f22139a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f22139a.mo7547h();
            this.f22145g.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8214p
    /* renamed from: a */
    public int mo32214a(String str, String str2) {
        AbstractC1090f c = this.f22143e.mo7618c();
        this.f22139a.mo7546g();
        if (str2 == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f22139a.mo7547h();
                this.f22143e.mo7616a(c);
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
        this.f22139a.mo7549j();
        this.f22139a.mo7547h();
        this.f22143e.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8214p
    /* renamed from: a */
    public int mo32215a(String str, boolean z) {
        int i;
        AbstractC1090f c = this.f22144f.mo7618c();
        this.f22139a.mo7546g();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            c.bindLong(1, (long) i);
            if (str == null) {
                c.bindNull(2);
            } else {
                c.bindString(2, str);
            }
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f22139a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f22139a.mo7547h();
            this.f22144f.mo7616a(c);
        }
    }
}
