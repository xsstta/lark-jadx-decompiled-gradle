package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db;

import android.database.Cursor;
import androidx.p038g.p039a.AbstractC1090f;
import androidx.room.AbstractC1421b;
import androidx.room.AbstractC1428c;
import androidx.room.AbstractC1440i;
import androidx.room.C1439h;
import androidx.room.RoomDatabase;
import androidx.room.p048b.C1422a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.c */
public final class C12468c extends AbstractC12467b {

    /* renamed from: a */
    private final RoomDatabase f33413a;

    /* renamed from: b */
    private final AbstractC1428c f33414b;

    /* renamed from: c */
    private final AbstractC1428c f33415c;

    /* renamed from: d */
    private final AbstractC1421b f33416d;

    /* renamed from: e */
    private final AbstractC1440i f33417e;

    /* renamed from: f */
    private final AbstractC1440i f33418f;

    /* renamed from: g */
    private final AbstractC1440i f33419g;

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.AbstractC12467b
    /* renamed from: a */
    public void mo47451a(List<C12465a> list) {
        this.f33413a.mo7546g();
        try {
            this.f33416d.mo7567a((Iterable) list);
            this.f33413a.mo7549j();
        } finally {
            this.f33413a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.AbstractC12467b
    /* renamed from: a */
    public List<String> mo47445a() {
        C1439h a = C1439h.m6573a("SELECT DISTINCT space_id FROM t_wiki_relation WHERE wiki_node_type = 2", 0);
        Cursor a2 = this.f33413a.mo7532a(a);
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

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.AbstractC12467b
    /* renamed from: b */
    public void mo47454b(List<C12465a> list) {
        this.f33413a.mo7546g();
        try {
            this.f33414b.mo7589a((Iterable) list);
            this.f33413a.mo7549j();
        } finally {
            this.f33413a.mo7547h();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.AbstractC12467b
    /* renamed from: c */
    public void mo47457c(List<C12465a> list) {
        this.f33413a.mo7546g();
        try {
            this.f33414b.mo7589a((Iterable) list);
            this.f33413a.mo7549j();
        } finally {
            this.f33413a.mo7547h();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.AbstractC12467b
    /* renamed from: d */
    public void mo47458d(List<C12465a> list) {
        this.f33413a.mo7546g();
        try {
            this.f33415c.mo7589a((Iterable) list);
            this.f33413a.mo7549j();
        } finally {
            this.f33413a.mo7547h();
        }
    }

    public C12468c(RoomDatabase roomDatabase) {
        this.f33413a = roomDatabase;
        this.f33414b = new AbstractC1428c<C12465a>(roomDatabase) {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.C12468c.C124691 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "INSERT OR REPLACE INTO `t_wiki_relation`(`wiki_token`,`space_id`,`obj_token`,`obj_type`,`title`,`parent_wiki_token`,`sort_id`,`wiki_node_type`,`origin_wiki_token`,`origin_space_id`,`is_star`,`children`,`space_name`,`has_child`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public void mo7588a(AbstractC1090f fVar, C12465a aVar) {
                if (aVar.f33399a == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, aVar.f33399a);
                }
                if (aVar.f33400b == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, aVar.f33400b);
                }
                if (aVar.f33401c == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, aVar.f33401c);
                }
                fVar.bindLong(4, (long) aVar.f33402d);
                if (aVar.f33403e == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, aVar.f33403e);
                }
                if (aVar.f33404f == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, aVar.f33404f);
                }
                fVar.bindDouble(7, aVar.f33405g);
                fVar.bindLong(8, (long) aVar.f33406h);
                if (aVar.f33407i == null) {
                    fVar.bindNull(9);
                } else {
                    fVar.bindString(9, aVar.f33407i);
                }
                if (aVar.f33408j == null) {
                    fVar.bindNull(10);
                } else {
                    fVar.bindString(10, aVar.f33408j);
                }
                fVar.bindLong(11, aVar.f33409k ? 1 : 0);
                if (aVar.f33410l == null) {
                    fVar.bindNull(12);
                } else {
                    fVar.bindString(12, aVar.f33410l);
                }
                if (aVar.f33411m == null) {
                    fVar.bindNull(13);
                } else {
                    fVar.bindString(13, aVar.f33411m);
                }
                fVar.bindLong(14, aVar.f33412n ? 1 : 0);
            }
        };
        this.f33415c = new AbstractC1428c<C12465a>(roomDatabase) {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.C12468c.C124702 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "INSERT OR IGNORE INTO `t_wiki_relation`(`wiki_token`,`space_id`,`obj_token`,`obj_type`,`title`,`parent_wiki_token`,`sort_id`,`wiki_node_type`,`origin_wiki_token`,`origin_space_id`,`is_star`,`children`,`space_name`,`has_child`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public void mo7588a(AbstractC1090f fVar, C12465a aVar) {
                if (aVar.f33399a == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, aVar.f33399a);
                }
                if (aVar.f33400b == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, aVar.f33400b);
                }
                if (aVar.f33401c == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, aVar.f33401c);
                }
                fVar.bindLong(4, (long) aVar.f33402d);
                if (aVar.f33403e == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, aVar.f33403e);
                }
                if (aVar.f33404f == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, aVar.f33404f);
                }
                fVar.bindDouble(7, aVar.f33405g);
                fVar.bindLong(8, (long) aVar.f33406h);
                if (aVar.f33407i == null) {
                    fVar.bindNull(9);
                } else {
                    fVar.bindString(9, aVar.f33407i);
                }
                if (aVar.f33408j == null) {
                    fVar.bindNull(10);
                } else {
                    fVar.bindString(10, aVar.f33408j);
                }
                fVar.bindLong(11, aVar.f33409k ? 1 : 0);
                if (aVar.f33410l == null) {
                    fVar.bindNull(12);
                } else {
                    fVar.bindString(12, aVar.f33410l);
                }
                if (aVar.f33411m == null) {
                    fVar.bindNull(13);
                } else {
                    fVar.bindString(13, aVar.f33411m);
                }
                fVar.bindLong(14, aVar.f33412n ? 1 : 0);
            }
        };
        this.f33416d = new AbstractC1421b<C12465a>(roomDatabase) {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.C12468c.C124713 */

            @Override // androidx.room.AbstractC1421b, androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE OR ABORT `t_wiki_relation` SET `wiki_token` = ?,`space_id` = ?,`obj_token` = ?,`obj_type` = ?,`title` = ?,`parent_wiki_token` = ?,`sort_id` = ?,`wiki_node_type` = ?,`origin_wiki_token` = ?,`origin_space_id` = ?,`is_star` = ?,`children` = ?,`space_name` = ?,`has_child` = ? WHERE `wiki_token` = ? AND `space_id` = ?";
            }

            /* renamed from: a */
            public void mo7571a(AbstractC1090f fVar, C12465a aVar) {
                if (aVar.f33399a == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, aVar.f33399a);
                }
                if (aVar.f33400b == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, aVar.f33400b);
                }
                if (aVar.f33401c == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, aVar.f33401c);
                }
                fVar.bindLong(4, (long) aVar.f33402d);
                if (aVar.f33403e == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, aVar.f33403e);
                }
                if (aVar.f33404f == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, aVar.f33404f);
                }
                fVar.bindDouble(7, aVar.f33405g);
                fVar.bindLong(8, (long) aVar.f33406h);
                if (aVar.f33407i == null) {
                    fVar.bindNull(9);
                } else {
                    fVar.bindString(9, aVar.f33407i);
                }
                if (aVar.f33408j == null) {
                    fVar.bindNull(10);
                } else {
                    fVar.bindString(10, aVar.f33408j);
                }
                fVar.bindLong(11, aVar.f33409k ? 1 : 0);
                if (aVar.f33410l == null) {
                    fVar.bindNull(12);
                } else {
                    fVar.bindString(12, aVar.f33410l);
                }
                if (aVar.f33411m == null) {
                    fVar.bindNull(13);
                } else {
                    fVar.bindString(13, aVar.f33411m);
                }
                fVar.bindLong(14, aVar.f33412n ? 1 : 0);
                if (aVar.f33399a == null) {
                    fVar.bindNull(15);
                } else {
                    fVar.bindString(15, aVar.f33399a);
                }
                if (aVar.f33400b == null) {
                    fVar.bindNull(16);
                } else {
                    fVar.bindString(16, aVar.f33400b);
                }
            }
        };
        this.f33417e = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.C12468c.C124724 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE t_wiki_relation set title = ? WHERE (space_id = ? AND wiki_token =?)";
            }
        };
        this.f33418f = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.C12468c.C124735 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM t_wiki_relation";
            }
        };
        this.f33419g = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.C12468c.C124746 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM t_wiki_relation WHERE space_id = ?";
            }
        };
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.AbstractC12467b
    /* renamed from: c */
    public int mo47456c(String str) {
        AbstractC1090f c = this.f33419g.mo7618c();
        this.f33413a.mo7546g();
        if (str == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f33413a.mo7547h();
                this.f33419g.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str);
        }
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f33413a.mo7549j();
        this.f33413a.mo7547h();
        this.f33419g.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.AbstractC12467b
    /* renamed from: b */
    public C12465a mo47453b(String str) {
        C1439h hVar;
        Throwable th;
        C12465a aVar;
        boolean z;
        boolean z2;
        C1439h a = C1439h.m6573a("SELECT * FROM t_wiki_relation WHERE space_id = ? AND wiki_node_type = 2 LIMIT 1", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        Cursor a2 = this.f33413a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("wiki_token");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("space_id");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("obj_type");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("title");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("parent_wiki_token");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("sort_id");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("wiki_node_type");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("origin_wiki_token");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("origin_space_id");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("is_star");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("children");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("space_name");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("has_child");
            if (a2.moveToFirst()) {
                hVar = a;
                try {
                    aVar = new C12465a();
                    aVar.f33399a = a2.getString(columnIndexOrThrow);
                    aVar.f33400b = a2.getString(columnIndexOrThrow2);
                    aVar.f33401c = a2.getString(columnIndexOrThrow3);
                    aVar.f33402d = a2.getInt(columnIndexOrThrow4);
                    aVar.f33403e = a2.getString(columnIndexOrThrow5);
                    aVar.f33404f = a2.getString(columnIndexOrThrow6);
                    aVar.f33405g = a2.getDouble(columnIndexOrThrow7);
                    aVar.f33406h = a2.getInt(columnIndexOrThrow8);
                    aVar.f33407i = a2.getString(columnIndexOrThrow9);
                    aVar.f33408j = a2.getString(columnIndexOrThrow10);
                    if (a2.getInt(columnIndexOrThrow11) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.f33409k = z;
                    aVar.f33410l = a2.getString(columnIndexOrThrow12);
                    aVar.f33411m = a2.getString(columnIndexOrThrow13);
                    if (a2.getInt(columnIndexOrThrow14) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    aVar.f33412n = z2;
                } catch (Throwable th2) {
                    th = th2;
                    a2.close();
                    hVar.mo7613a();
                    throw th;
                }
            } else {
                hVar = a;
                aVar = null;
            }
            a2.close();
            hVar.mo7613a();
            return aVar;
        } catch (Throwable th3) {
            th = th3;
            hVar = a;
            a2.close();
            hVar.mo7613a();
            throw th;
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.AbstractC12467b
    /* renamed from: a */
    public List<C12465a> mo47446a(String str) {
        C1439h hVar;
        Throwable th;
        boolean z;
        C1439h a = C1439h.m6573a("SELECT * FROM t_wiki_relation WHERE space_id = ?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        Cursor a2 = this.f33413a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("wiki_token");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("space_id");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("obj_type");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("title");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("parent_wiki_token");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("sort_id");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("wiki_node_type");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("origin_wiki_token");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("origin_space_id");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("is_star");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("children");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("space_name");
            hVar = a;
            try {
                int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("has_child");
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    C12465a aVar = new C12465a();
                    aVar.f33399a = a2.getString(columnIndexOrThrow);
                    aVar.f33400b = a2.getString(columnIndexOrThrow2);
                    aVar.f33401c = a2.getString(columnIndexOrThrow3);
                    aVar.f33402d = a2.getInt(columnIndexOrThrow4);
                    aVar.f33403e = a2.getString(columnIndexOrThrow5);
                    aVar.f33404f = a2.getString(columnIndexOrThrow6);
                    aVar.f33405g = a2.getDouble(columnIndexOrThrow7);
                    aVar.f33406h = a2.getInt(columnIndexOrThrow8);
                    aVar.f33407i = a2.getString(columnIndexOrThrow9);
                    aVar.f33408j = a2.getString(columnIndexOrThrow10);
                    boolean z2 = false;
                    if (a2.getInt(columnIndexOrThrow11) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.f33409k = z;
                    aVar.f33410l = a2.getString(columnIndexOrThrow12);
                    aVar.f33411m = a2.getString(columnIndexOrThrow13);
                    if (a2.getInt(columnIndexOrThrow14) != 0) {
                        z2 = true;
                    }
                    aVar.f33412n = z2;
                    arrayList = arrayList;
                    arrayList.add(aVar);
                    columnIndexOrThrow14 = columnIndexOrThrow14;
                    columnIndexOrThrow = columnIndexOrThrow;
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

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.AbstractC12467b
    /* renamed from: b */
    public boolean mo47455b(String str, String str2) {
        this.f33413a.mo7546g();
        try {
            boolean b = super.mo47455b(str, str2);
            this.f33413a.mo7549j();
            return b;
        } finally {
            this.f33413a.mo7547h();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.AbstractC12467b
    /* renamed from: b */
    public int mo47452b(String str, List<String> list) {
        StringBuilder a = C1422a.m6520a();
        a.append("DELETE FROM t_wiki_relation WHERE space_id = ");
        a.append("?");
        a.append(" AND wiki_token IN (");
        C1422a.m6521a(a, list.size());
        a.append(")");
        AbstractC1090f a2 = this.f33413a.mo7534a(a.toString());
        if (str == null) {
            a2.bindNull(1);
        } else {
            a2.bindString(1, str);
        }
        int i = 2;
        for (String str2 : list) {
            if (str2 == null) {
                a2.bindNull(i);
            } else {
                a2.bindString(i, str2);
            }
            i++;
        }
        this.f33413a.mo7546g();
        try {
            int executeUpdateDelete = a2.executeUpdateDelete();
            this.f33413a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f33413a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.AbstractC12467b
    /* renamed from: a */
    public C12465a mo47444a(String str, String str2) {
        C1439h hVar;
        Throwable th;
        C12465a aVar;
        boolean z;
        boolean z2;
        C1439h a = C1439h.m6573a("SELECT * FROM t_wiki_relation WHERE space_id = ? AND wiki_token = ?", 2);
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
        Cursor a2 = this.f33413a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("wiki_token");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("space_id");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("obj_type");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("title");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("parent_wiki_token");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("sort_id");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("wiki_node_type");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("origin_wiki_token");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("origin_space_id");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("is_star");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("children");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("space_name");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("has_child");
            if (a2.moveToFirst()) {
                hVar = a;
                try {
                    aVar = new C12465a();
                    aVar.f33399a = a2.getString(columnIndexOrThrow);
                    aVar.f33400b = a2.getString(columnIndexOrThrow2);
                    aVar.f33401c = a2.getString(columnIndexOrThrow3);
                    aVar.f33402d = a2.getInt(columnIndexOrThrow4);
                    aVar.f33403e = a2.getString(columnIndexOrThrow5);
                    aVar.f33404f = a2.getString(columnIndexOrThrow6);
                    aVar.f33405g = a2.getDouble(columnIndexOrThrow7);
                    aVar.f33406h = a2.getInt(columnIndexOrThrow8);
                    aVar.f33407i = a2.getString(columnIndexOrThrow9);
                    aVar.f33408j = a2.getString(columnIndexOrThrow10);
                    if (a2.getInt(columnIndexOrThrow11) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.f33409k = z;
                    aVar.f33410l = a2.getString(columnIndexOrThrow12);
                    aVar.f33411m = a2.getString(columnIndexOrThrow13);
                    if (a2.getInt(columnIndexOrThrow14) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    aVar.f33412n = z2;
                } catch (Throwable th2) {
                    th = th2;
                    a2.close();
                    hVar.mo7613a();
                    throw th;
                }
            } else {
                hVar = a;
                aVar = null;
            }
            a2.close();
            hVar.mo7613a();
            return aVar;
        } catch (Throwable th3) {
            th = th3;
            hVar = a;
            a2.close();
            hVar.mo7613a();
            throw th;
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.AbstractC12467b
    /* renamed from: a */
    public void mo47449a(String str, List<C12465a> list) {
        this.f33413a.mo7546g();
        try {
            super.mo47449a(str, list);
            this.f33413a.mo7549j();
        } finally {
            this.f33413a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.AbstractC12467b
    /* renamed from: a */
    public void mo47447a(String str, C12465a aVar, List<C12465a> list) {
        this.f33413a.mo7546g();
        try {
            super.mo47447a(str, aVar, list);
            this.f33413a.mo7549j();
        } finally {
            this.f33413a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.AbstractC12467b
    /* renamed from: a */
    public void mo47448a(String str, String str2, String str3) {
        AbstractC1090f c = this.f33417e.mo7618c();
        this.f33413a.mo7546g();
        if (str3 == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f33413a.mo7547h();
                this.f33417e.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str3);
        }
        if (str == null) {
            c.bindNull(2);
        } else {
            c.bindString(2, str);
        }
        if (str2 == null) {
            c.bindNull(3);
        } else {
            c.bindString(3, str2);
        }
        c.executeUpdateDelete();
        this.f33413a.mo7549j();
        this.f33413a.mo7547h();
        this.f33417e.mo7616a(c);
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.AbstractC12467b
    /* renamed from: a */
    public void mo47450a(String str, List<String> list, List<C12465a> list2) {
        this.f33413a.mo7546g();
        try {
            super.mo47450a(str, list, list2);
            this.f33413a.mo7549j();
        } finally {
            this.f33413a.mo7547h();
        }
    }
}
