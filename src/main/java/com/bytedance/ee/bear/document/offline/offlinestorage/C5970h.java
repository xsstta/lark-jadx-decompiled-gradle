package com.bytedance.ee.bear.document.offline.offlinestorage;

import android.database.Cursor;
import androidx.lifecycle.AbstractC1154e;
import androidx.lifecycle.LiveData;
import androidx.p038g.p039a.AbstractC1090f;
import androidx.room.AbstractC1421b;
import androidx.room.AbstractC1428c;
import androidx.room.AbstractC1440i;
import androidx.room.C1429d;
import androidx.room.C1439h;
import androidx.room.RoomDatabase;
import androidx.room.p048b.C1422a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.ee.bear.document.offline.offlinestorage.h */
public final class C5970h implements AbstractC5969g {

    /* renamed from: a */
    public final RoomDatabase f16735a;

    /* renamed from: b */
    private final AbstractC1428c f16736b;

    /* renamed from: c */
    private final AbstractC1428c f16737c;

    /* renamed from: d */
    private final AbstractC1421b f16738d;

    /* renamed from: e */
    private final AbstractC1440i f16739e;

    /* renamed from: f */
    private final AbstractC1440i f16740f;

    /* renamed from: g */
    private final AbstractC1440i f16741g;

    /* renamed from: h */
    private final AbstractC1440i f16742h;

    @Override // com.bytedance.ee.bear.document.offline.offlinestorage.AbstractC5969g
    /* renamed from: a */
    public LiveData<List<String>> mo24161a() {
        final C1439h a = C1439h.m6573a("SELECT DISTINCT obj_token FROM ResourceData WHERE isNeedSync= 1", 0);
        return new AbstractC1154e<List<String>>(this.f16735a.mo7548i()) {
            /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5970h.C59788 */

            /* renamed from: i */
            private C1429d.AbstractC1432b f16752i;

            /* access modifiers changed from: protected */
            public void finalize() {
                a.mo7613a();
            }

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public List<String> mo6021c() {
                if (this.f16752i == null) {
                    this.f16752i = new C1429d.AbstractC1432b("ResourceData", new String[0]) {
                        /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5970h.C59788.C59791 */

                        @Override // androidx.room.C1429d.AbstractC1432b
                        /* renamed from: a */
                        public void mo7606a(Set<String> set) {
                            C59788.this.mo6020b();
                        }
                    };
                    C5970h.this.f16735a.mo7550k().mo7598b(this.f16752i);
                }
                Cursor a = C5970h.this.f16735a.mo7532a(a);
                try {
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        arrayList.add(a.getString(0));
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        }.mo6019a();
    }

    @Override // com.bytedance.ee.bear.document.offline.offlinestorage.AbstractC5969g
    /* renamed from: b */
    public int mo24167b() {
        AbstractC1090f c = this.f16742h.mo7618c();
        this.f16735a.mo7546g();
        try {
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f16735a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f16735a.mo7547h();
            this.f16742h.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.offlinestorage.AbstractC5969g
    /* renamed from: c */
    public List<String> mo24175c() {
        C1439h a = C1439h.m6573a("SELECT obj_token FROM ResourceData group by obj_token", 0);
        Cursor a2 = this.f16735a.mo7532a(a);
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

    @Override // com.bytedance.ee.bear.document.offline.offlinestorage.AbstractC5969g
    /* renamed from: a */
    public long mo24160a(C5968f fVar) {
        this.f16735a.mo7546g();
        try {
            long a = this.f16737c.mo7587a(fVar);
            this.f16735a.mo7549j();
            return a;
        } finally {
            this.f16735a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.offlinestorage.AbstractC5969g
    /* renamed from: b */
    public int mo24168b(C5968f fVar) {
        this.f16735a.mo7546g();
        try {
            int a = this.f16738d.mo7568a(fVar) + 0;
            this.f16735a.mo7549j();
            return a;
        } finally {
            this.f16735a.mo7547h();
        }
    }

    public C5970h(RoomDatabase roomDatabase) {
        this.f16735a = roomDatabase;
        this.f16736b = new AbstractC1428c<C5968f>(roomDatabase) {
            /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5970h.C59711 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "INSERT OR ABORT INTO `ResourceData`(`id`,`reskey`,`resvalue`,`resvalue_filepath`,`update_time`,`access_time`,`isNeedSync`,`config`,`type`,`token`,`obj_token`,`userToken`,`tenantID`,`url`,`subblock_preload_status`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public void mo7588a(AbstractC1090f fVar, C5968f fVar2) {
                fVar.bindLong(1, (long) fVar2.mo24154n());
                if (fVar2.mo24124a() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, fVar2.mo24124a());
                }
                if (fVar2.mo24137d() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, fVar2.mo24137d());
                }
                if (fVar2.mo24157q() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, fVar2.mo24157q());
                }
                if (fVar2.mo24139e() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindLong(5, fVar2.mo24139e().longValue());
                }
                if (fVar2.mo24141f() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindLong(6, fVar2.mo24141f().longValue());
                }
                fVar.bindLong(7, fVar2.mo24148i() ? 1 : 0);
                if (fVar2.mo24149j() == null) {
                    fVar.bindNull(8);
                } else {
                    fVar.bindString(8, fVar2.mo24149j());
                }
                if (fVar2.mo24130b() == null) {
                    fVar.bindNull(9);
                } else {
                    fVar.bindString(9, fVar2.mo24130b());
                }
                if (fVar2.mo24155o() == null) {
                    fVar.bindNull(10);
                } else {
                    fVar.bindString(10, fVar2.mo24155o());
                }
                if (fVar2.mo24134c() == null) {
                    fVar.bindNull(11);
                } else {
                    fVar.bindString(11, fVar2.mo24134c());
                }
                if (fVar2.mo24143g() == null) {
                    fVar.bindNull(12);
                } else {
                    fVar.bindString(12, fVar2.mo24143g());
                }
                if (fVar2.mo24145h() == null) {
                    fVar.bindNull(13);
                } else {
                    fVar.bindString(13, fVar2.mo24145h());
                }
                if (fVar2.mo24153m() == null) {
                    fVar.bindNull(14);
                } else {
                    fVar.bindString(14, fVar2.mo24153m());
                }
                fVar.bindLong(15, (long) fVar2.mo24151k());
            }
        };
        this.f16737c = new AbstractC1428c<C5968f>(roomDatabase) {
            /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5970h.C59722 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "INSERT OR REPLACE INTO `ResourceData`(`id`,`reskey`,`resvalue`,`resvalue_filepath`,`update_time`,`access_time`,`isNeedSync`,`config`,`type`,`token`,`obj_token`,`userToken`,`tenantID`,`url`,`subblock_preload_status`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public void mo7588a(AbstractC1090f fVar, C5968f fVar2) {
                fVar.bindLong(1, (long) fVar2.mo24154n());
                if (fVar2.mo24124a() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, fVar2.mo24124a());
                }
                if (fVar2.mo24137d() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, fVar2.mo24137d());
                }
                if (fVar2.mo24157q() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, fVar2.mo24157q());
                }
                if (fVar2.mo24139e() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindLong(5, fVar2.mo24139e().longValue());
                }
                if (fVar2.mo24141f() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindLong(6, fVar2.mo24141f().longValue());
                }
                fVar.bindLong(7, fVar2.mo24148i() ? 1 : 0);
                if (fVar2.mo24149j() == null) {
                    fVar.bindNull(8);
                } else {
                    fVar.bindString(8, fVar2.mo24149j());
                }
                if (fVar2.mo24130b() == null) {
                    fVar.bindNull(9);
                } else {
                    fVar.bindString(9, fVar2.mo24130b());
                }
                if (fVar2.mo24155o() == null) {
                    fVar.bindNull(10);
                } else {
                    fVar.bindString(10, fVar2.mo24155o());
                }
                if (fVar2.mo24134c() == null) {
                    fVar.bindNull(11);
                } else {
                    fVar.bindString(11, fVar2.mo24134c());
                }
                if (fVar2.mo24143g() == null) {
                    fVar.bindNull(12);
                } else {
                    fVar.bindString(12, fVar2.mo24143g());
                }
                if (fVar2.mo24145h() == null) {
                    fVar.bindNull(13);
                } else {
                    fVar.bindString(13, fVar2.mo24145h());
                }
                if (fVar2.mo24153m() == null) {
                    fVar.bindNull(14);
                } else {
                    fVar.bindString(14, fVar2.mo24153m());
                }
                fVar.bindLong(15, (long) fVar2.mo24151k());
            }
        };
        this.f16738d = new AbstractC1421b<C5968f>(roomDatabase) {
            /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5970h.C59733 */

            @Override // androidx.room.AbstractC1421b, androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE OR ABORT `ResourceData` SET `id` = ?,`reskey` = ?,`resvalue` = ?,`resvalue_filepath` = ?,`update_time` = ?,`access_time` = ?,`isNeedSync` = ?,`config` = ?,`type` = ?,`token` = ?,`obj_token` = ?,`userToken` = ?,`tenantID` = ?,`url` = ?,`subblock_preload_status` = ? WHERE `id` = ?";
            }

            /* renamed from: a */
            public void mo7571a(AbstractC1090f fVar, C5968f fVar2) {
                fVar.bindLong(1, (long) fVar2.mo24154n());
                if (fVar2.mo24124a() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, fVar2.mo24124a());
                }
                if (fVar2.mo24137d() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, fVar2.mo24137d());
                }
                if (fVar2.mo24157q() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, fVar2.mo24157q());
                }
                if (fVar2.mo24139e() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindLong(5, fVar2.mo24139e().longValue());
                }
                if (fVar2.mo24141f() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindLong(6, fVar2.mo24141f().longValue());
                }
                fVar.bindLong(7, fVar2.mo24148i() ? 1 : 0);
                if (fVar2.mo24149j() == null) {
                    fVar.bindNull(8);
                } else {
                    fVar.bindString(8, fVar2.mo24149j());
                }
                if (fVar2.mo24130b() == null) {
                    fVar.bindNull(9);
                } else {
                    fVar.bindString(9, fVar2.mo24130b());
                }
                if (fVar2.mo24155o() == null) {
                    fVar.bindNull(10);
                } else {
                    fVar.bindString(10, fVar2.mo24155o());
                }
                if (fVar2.mo24134c() == null) {
                    fVar.bindNull(11);
                } else {
                    fVar.bindString(11, fVar2.mo24134c());
                }
                if (fVar2.mo24143g() == null) {
                    fVar.bindNull(12);
                } else {
                    fVar.bindString(12, fVar2.mo24143g());
                }
                if (fVar2.mo24145h() == null) {
                    fVar.bindNull(13);
                } else {
                    fVar.bindString(13, fVar2.mo24145h());
                }
                if (fVar2.mo24153m() == null) {
                    fVar.bindNull(14);
                } else {
                    fVar.bindString(14, fVar2.mo24153m());
                }
                fVar.bindLong(15, (long) fVar2.mo24151k());
                fVar.bindLong(16, (long) fVar2.mo24154n());
            }
        };
        this.f16739e = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5970h.C59744 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM ResourceData WHERE obj_token= ?";
            }
        };
        this.f16740f = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5970h.C59755 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM ResourceData WHERE reskey= ?";
            }
        };
        this.f16741g = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5970h.C59766 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM ResourceData WHERE reskey IN(SELECT reskey FROM ResourceData order by access_time asc limit ?)";
            }
        };
        this.f16742h = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5970h.C59777 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM ResourceData";
            }
        };
    }

    @Override // com.bytedance.ee.bear.document.offline.offlinestorage.AbstractC5969g
    /* renamed from: c */
    public int mo24173c(String str) {
        AbstractC1090f c = this.f16739e.mo7618c();
        this.f16735a.mo7546g();
        if (str == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f16735a.mo7547h();
                this.f16739e.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str);
        }
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f16735a.mo7549j();
        this.f16735a.mo7547h();
        this.f16739e.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.document.offline.offlinestorage.AbstractC5969g
    /* renamed from: a */
    public int mo24159a(List<String> list) {
        StringBuilder a = C1422a.m6520a();
        a.append("DELETE FROM ResourceData WHERE obj_token IN (");
        C1422a.m6521a(a, list.size());
        a.append(")");
        AbstractC1090f a2 = this.f16735a.mo7534a(a.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                a2.bindNull(i);
            } else {
                a2.bindString(i, str);
            }
            i++;
        }
        this.f16735a.mo7546g();
        try {
            int executeUpdateDelete = a2.executeUpdateDelete();
            this.f16735a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f16735a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.offlinestorage.AbstractC5969g
    /* renamed from: b */
    public int mo24169b(List<C5968f> list) {
        this.f16735a.mo7546g();
        try {
            int a = this.f16738d.mo7567a((Iterable) list) + 0;
            this.f16735a.mo7549j();
            return a;
        } finally {
            this.f16735a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.offlinestorage.AbstractC5969g
    /* renamed from: c */
    public int mo24174c(List<String> list) {
        StringBuilder a = C1422a.m6520a();
        a.append("DELETE FROM ResourceData WHERE obj_token IN(");
        C1422a.m6521a(a, list.size());
        a.append(")");
        AbstractC1090f a2 = this.f16735a.mo7534a(a.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                a2.bindNull(i);
            } else {
                a2.bindString(i, str);
            }
            i++;
        }
        this.f16735a.mo7546g();
        try {
            int executeUpdateDelete = a2.executeUpdateDelete();
            this.f16735a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f16735a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.offlinestorage.AbstractC5969g
    /* renamed from: b */
    public List<String> mo24172b(boolean z) {
        C1439h a = C1439h.m6573a("SELECT DISTINCT obj_token FROM ResourceData WHERE isNeedSync= ?", 1);
        a.bindLong(1, z ? 1 : 0);
        Cursor a2 = this.f16735a.mo7532a(a);
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

    @Override // com.bytedance.ee.bear.document.offline.offlinestorage.AbstractC5969g
    /* renamed from: b */
    public List<C5968f> mo24171b(String str) {
        C1439h hVar;
        Throwable th;
        Long l;
        boolean z;
        C1439h a = C1439h.m6573a("SELECT * FROM ResourceData WHERE obj_token= ?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        Cursor a2 = this.f16735a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("reskey");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("resvalue");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("resvalue_filepath");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("update_time");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("access_time");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("isNeedSync");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("config");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow(ShareHitPoint.f121869d);
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("token");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("userToken");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("tenantID");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("url");
            hVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("subblock_preload_status");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    C5968f fVar = new C5968f();
                    fVar.mo24131b(a2.getInt(columnIndexOrThrow));
                    fVar.mo24128a(a2.getString(columnIndexOrThrow2));
                    fVar.mo24138d(a2.getString(columnIndexOrThrow3));
                    fVar.mo24150j(a2.getString(columnIndexOrThrow4));
                    Long l2 = null;
                    if (a2.isNull(columnIndexOrThrow5)) {
                        l = null;
                    } else {
                        l = Long.valueOf(a2.getLong(columnIndexOrThrow5));
                    }
                    fVar.mo24127a(l);
                    if (!a2.isNull(columnIndexOrThrow6)) {
                        l2 = Long.valueOf(a2.getLong(columnIndexOrThrow6));
                    }
                    fVar.mo24132b(l2);
                    if (a2.getInt(columnIndexOrThrow7) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    fVar.mo24129a(z);
                    fVar.mo24144g(a2.getString(columnIndexOrThrow8));
                    fVar.mo24133b(a2.getString(columnIndexOrThrow9));
                    fVar.mo24147i(a2.getString(columnIndexOrThrow10));
                    fVar.mo24136c(a2.getString(columnIndexOrThrow11));
                    fVar.mo24140e(a2.getString(columnIndexOrThrow12));
                    fVar.mo24142f(a2.getString(columnIndexOrThrow13));
                    fVar.mo24146h(a2.getString(i));
                    fVar.mo24125a(a2.getInt(columnIndexOrThrow15));
                    arrayList = arrayList;
                    arrayList.add(fVar);
                    columnIndexOrThrow15 = columnIndexOrThrow15;
                    columnIndexOrThrow = columnIndexOrThrow;
                    i = i;
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

    @Override // com.bytedance.ee.bear.document.offline.offlinestorage.AbstractC5969g
    /* renamed from: a */
    public List<C5968f> mo24164a(String str) {
        C1439h hVar;
        Throwable th;
        Long l;
        boolean z;
        C1439h a = C1439h.m6573a("SELECT * FROM ResourceData WHERE obj_token= ?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        Cursor a2 = this.f16735a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("reskey");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("resvalue");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("resvalue_filepath");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("update_time");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("access_time");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("isNeedSync");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("config");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow(ShareHitPoint.f121869d);
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("token");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("userToken");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("tenantID");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("url");
            hVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("subblock_preload_status");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    C5968f fVar = new C5968f();
                    fVar.mo24131b(a2.getInt(columnIndexOrThrow));
                    fVar.mo24128a(a2.getString(columnIndexOrThrow2));
                    fVar.mo24138d(a2.getString(columnIndexOrThrow3));
                    fVar.mo24150j(a2.getString(columnIndexOrThrow4));
                    Long l2 = null;
                    if (a2.isNull(columnIndexOrThrow5)) {
                        l = null;
                    } else {
                        l = Long.valueOf(a2.getLong(columnIndexOrThrow5));
                    }
                    fVar.mo24127a(l);
                    if (!a2.isNull(columnIndexOrThrow6)) {
                        l2 = Long.valueOf(a2.getLong(columnIndexOrThrow6));
                    }
                    fVar.mo24132b(l2);
                    if (a2.getInt(columnIndexOrThrow7) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    fVar.mo24129a(z);
                    fVar.mo24144g(a2.getString(columnIndexOrThrow8));
                    fVar.mo24133b(a2.getString(columnIndexOrThrow9));
                    fVar.mo24147i(a2.getString(columnIndexOrThrow10));
                    fVar.mo24136c(a2.getString(columnIndexOrThrow11));
                    fVar.mo24140e(a2.getString(columnIndexOrThrow12));
                    fVar.mo24142f(a2.getString(columnIndexOrThrow13));
                    fVar.mo24146h(a2.getString(i));
                    fVar.mo24125a(a2.getInt(columnIndexOrThrow15));
                    arrayList = arrayList;
                    arrayList.add(fVar);
                    columnIndexOrThrow15 = columnIndexOrThrow15;
                    columnIndexOrThrow = columnIndexOrThrow;
                    i = i;
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

    @Override // com.bytedance.ee.bear.document.offline.offlinestorage.AbstractC5969g
    /* renamed from: a */
    public List<C5968f> mo24166a(boolean z) {
        C1439h hVar;
        Throwable th;
        Long l;
        boolean z2;
        C1439h a = C1439h.m6573a("SELECT DISTINCT * FROM ResourceData WHERE isNeedSync= ?", 1);
        a.bindLong(1, z ? 1 : 0);
        Cursor a2 = this.f16735a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("reskey");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("resvalue");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("resvalue_filepath");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("update_time");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("access_time");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("isNeedSync");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("config");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow(ShareHitPoint.f121869d);
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("token");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("userToken");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("tenantID");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("url");
            hVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("subblock_preload_status");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    C5968f fVar = new C5968f();
                    fVar.mo24131b(a2.getInt(columnIndexOrThrow));
                    fVar.mo24128a(a2.getString(columnIndexOrThrow2));
                    fVar.mo24138d(a2.getString(columnIndexOrThrow3));
                    fVar.mo24150j(a2.getString(columnIndexOrThrow4));
                    Long l2 = null;
                    if (a2.isNull(columnIndexOrThrow5)) {
                        l = null;
                    } else {
                        l = Long.valueOf(a2.getLong(columnIndexOrThrow5));
                    }
                    fVar.mo24127a(l);
                    if (!a2.isNull(columnIndexOrThrow6)) {
                        l2 = Long.valueOf(a2.getLong(columnIndexOrThrow6));
                    }
                    fVar.mo24132b(l2);
                    if (a2.getInt(columnIndexOrThrow7) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    fVar.mo24129a(z2);
                    fVar.mo24144g(a2.getString(columnIndexOrThrow8));
                    fVar.mo24133b(a2.getString(columnIndexOrThrow9));
                    fVar.mo24147i(a2.getString(columnIndexOrThrow10));
                    fVar.mo24136c(a2.getString(columnIndexOrThrow11));
                    fVar.mo24140e(a2.getString(columnIndexOrThrow12));
                    fVar.mo24142f(a2.getString(columnIndexOrThrow13));
                    fVar.mo24146h(a2.getString(i));
                    fVar.mo24125a(a2.getInt(columnIndexOrThrow15));
                    arrayList.add(fVar);
                    columnIndexOrThrow13 = columnIndexOrThrow13;
                    columnIndexOrThrow15 = columnIndexOrThrow15;
                    columnIndexOrThrow = columnIndexOrThrow;
                    i = i;
                    arrayList = arrayList;
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

    @Override // com.bytedance.ee.bear.document.offline.offlinestorage.AbstractC5969g
    /* renamed from: a */
    public List<C5952a> mo24165a(List<String> list, int i) {
        StringBuilder a = C1422a.m6520a();
        a.append("SELECT resvalue_filepath,obj_token FROM ResourceData WHERE obj_token NOT IN(");
        int size = list.size();
        C1422a.m6521a(a, size);
        a.append(") AND reskey LIKE '%CLIENT_VARS%' order by update_time asc limit ");
        a.append("?");
        int i2 = 1;
        int i3 = size + 1;
        C1439h a2 = C1439h.m6573a(a.toString(), i3);
        for (String str : list) {
            if (str == null) {
                a2.bindNull(i2);
            } else {
                a2.bindString(i2, str);
            }
            i2++;
        }
        a2.bindLong(i3, (long) i);
        Cursor a3 = this.f16735a.mo7532a(a2);
        try {
            int columnIndexOrThrow = a3.getColumnIndexOrThrow("resvalue_filepath");
            int columnIndexOrThrow2 = a3.getColumnIndexOrThrow("obj_token");
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                C5952a aVar = new C5952a();
                aVar.mo24063a(a3.getString(columnIndexOrThrow));
                aVar.mo24065b(a3.getString(columnIndexOrThrow2));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            a3.close();
            a2.mo7613a();
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.offlinestorage.AbstractC5969g
    /* renamed from: a */
    public C5968f mo24162a(String str, String str2) {
        C1439h hVar;
        Throwable th;
        Long l;
        boolean z;
        C1439h a = C1439h.m6573a("SELECT * FROM ResourceData WHERE reskey= ? and obj_token=?", 2);
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
        Cursor a2 = this.f16735a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("reskey");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("resvalue");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("resvalue_filepath");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("update_time");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("access_time");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("isNeedSync");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("config");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow(ShareHitPoint.f121869d);
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("token");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("userToken");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("tenantID");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("url");
            hVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("subblock_preload_status");
                C5968f fVar = null;
                Long valueOf = null;
                if (a2.moveToFirst()) {
                    C5968f fVar2 = new C5968f();
                    fVar2.mo24131b(a2.getInt(columnIndexOrThrow));
                    fVar2.mo24128a(a2.getString(columnIndexOrThrow2));
                    fVar2.mo24138d(a2.getString(columnIndexOrThrow3));
                    fVar2.mo24150j(a2.getString(columnIndexOrThrow4));
                    if (a2.isNull(columnIndexOrThrow5)) {
                        l = null;
                    } else {
                        l = Long.valueOf(a2.getLong(columnIndexOrThrow5));
                    }
                    fVar2.mo24127a(l);
                    if (!a2.isNull(columnIndexOrThrow6)) {
                        valueOf = Long.valueOf(a2.getLong(columnIndexOrThrow6));
                    }
                    fVar2.mo24132b(valueOf);
                    if (a2.getInt(columnIndexOrThrow7) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    fVar2.mo24129a(z);
                    fVar2.mo24144g(a2.getString(columnIndexOrThrow8));
                    fVar2.mo24133b(a2.getString(columnIndexOrThrow9));
                    fVar2.mo24147i(a2.getString(columnIndexOrThrow10));
                    fVar2.mo24136c(a2.getString(columnIndexOrThrow11));
                    fVar2.mo24140e(a2.getString(columnIndexOrThrow12));
                    fVar2.mo24142f(a2.getString(columnIndexOrThrow13));
                    fVar2.mo24146h(a2.getString(columnIndexOrThrow14));
                    fVar2.mo24125a(a2.getInt(columnIndexOrThrow15));
                    fVar = fVar2;
                }
                a2.close();
                hVar.mo7613a();
                return fVar;
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

    @Override // com.bytedance.ee.bear.document.offline.offlinestorage.AbstractC5969g
    /* renamed from: b */
    public C5968f mo24170b(String str, String str2) {
        C1439h hVar;
        Throwable th;
        Long l;
        boolean z;
        C1439h a = C1439h.m6573a("SELECT * FROM ResourceData WHERE obj_token= ? and reskey= ?", 2);
        if (str2 == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str2);
        }
        if (str == null) {
            a.bindNull(2);
        } else {
            a.bindString(2, str);
        }
        Cursor a2 = this.f16735a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("reskey");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("resvalue");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("resvalue_filepath");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("update_time");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("access_time");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("isNeedSync");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("config");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow(ShareHitPoint.f121869d);
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("token");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("userToken");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("tenantID");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("url");
            hVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("subblock_preload_status");
                C5968f fVar = null;
                Long valueOf = null;
                if (a2.moveToFirst()) {
                    C5968f fVar2 = new C5968f();
                    fVar2.mo24131b(a2.getInt(columnIndexOrThrow));
                    fVar2.mo24128a(a2.getString(columnIndexOrThrow2));
                    fVar2.mo24138d(a2.getString(columnIndexOrThrow3));
                    fVar2.mo24150j(a2.getString(columnIndexOrThrow4));
                    if (a2.isNull(columnIndexOrThrow5)) {
                        l = null;
                    } else {
                        l = Long.valueOf(a2.getLong(columnIndexOrThrow5));
                    }
                    fVar2.mo24127a(l);
                    if (!a2.isNull(columnIndexOrThrow6)) {
                        valueOf = Long.valueOf(a2.getLong(columnIndexOrThrow6));
                    }
                    fVar2.mo24132b(valueOf);
                    if (a2.getInt(columnIndexOrThrow7) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    fVar2.mo24129a(z);
                    fVar2.mo24144g(a2.getString(columnIndexOrThrow8));
                    fVar2.mo24133b(a2.getString(columnIndexOrThrow9));
                    fVar2.mo24147i(a2.getString(columnIndexOrThrow10));
                    fVar2.mo24136c(a2.getString(columnIndexOrThrow11));
                    fVar2.mo24140e(a2.getString(columnIndexOrThrow12));
                    fVar2.mo24142f(a2.getString(columnIndexOrThrow13));
                    fVar2.mo24146h(a2.getString(columnIndexOrThrow14));
                    fVar2.mo24125a(a2.getInt(columnIndexOrThrow15));
                    fVar = fVar2;
                }
                a2.close();
                hVar.mo7613a();
                return fVar;
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

    @Override // com.bytedance.ee.bear.document.offline.offlinestorage.AbstractC5969g
    /* renamed from: a */
    public List<C5968f> mo24163a(long j, int i) {
        C1439h hVar;
        Throwable th;
        Long l;
        boolean z;
        C1439h a = C1439h.m6573a("SELECT DISTINCT * FROM ResourceData WHERE reskey LIKE '%CLIENT_VARS%' AND access_time<= ? AND isNeedSync=0 limit ?", 2);
        a.bindLong(1, j);
        a.bindLong(2, (long) i);
        Cursor a2 = this.f16735a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("reskey");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("resvalue");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("resvalue_filepath");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("update_time");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("access_time");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("isNeedSync");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("config");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow(ShareHitPoint.f121869d);
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("token");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("userToken");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("tenantID");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("url");
            hVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("subblock_preload_status");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    C5968f fVar = new C5968f();
                    fVar.mo24131b(a2.getInt(columnIndexOrThrow));
                    fVar.mo24128a(a2.getString(columnIndexOrThrow2));
                    fVar.mo24138d(a2.getString(columnIndexOrThrow3));
                    fVar.mo24150j(a2.getString(columnIndexOrThrow4));
                    Long l2 = null;
                    if (a2.isNull(columnIndexOrThrow5)) {
                        l = null;
                    } else {
                        l = Long.valueOf(a2.getLong(columnIndexOrThrow5));
                    }
                    fVar.mo24127a(l);
                    if (!a2.isNull(columnIndexOrThrow6)) {
                        l2 = Long.valueOf(a2.getLong(columnIndexOrThrow6));
                    }
                    fVar.mo24132b(l2);
                    if (a2.getInt(columnIndexOrThrow7) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    fVar.mo24129a(z);
                    fVar.mo24144g(a2.getString(columnIndexOrThrow8));
                    fVar.mo24133b(a2.getString(columnIndexOrThrow9));
                    fVar.mo24147i(a2.getString(columnIndexOrThrow10));
                    fVar.mo24136c(a2.getString(columnIndexOrThrow11));
                    fVar.mo24140e(a2.getString(columnIndexOrThrow12));
                    fVar.mo24142f(a2.getString(columnIndexOrThrow13));
                    fVar.mo24146h(a2.getString(i2));
                    fVar.mo24125a(a2.getInt(columnIndexOrThrow15));
                    arrayList = arrayList;
                    arrayList.add(fVar);
                    columnIndexOrThrow15 = columnIndexOrThrow15;
                    columnIndexOrThrow13 = columnIndexOrThrow13;
                    i2 = i2;
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
}
