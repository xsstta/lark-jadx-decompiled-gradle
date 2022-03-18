package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db;

import androidx.p038g.p039a.AbstractC1082b;
import androidx.p038g.p039a.AbstractC1083c;
import androidx.room.C1419a;
import androidx.room.C1429d;
import androidx.room.C1437g;
import androidx.room.RoomDatabase;
import androidx.room.p048b.C1423b;
import java.util.HashMap;
import java.util.HashSet;

public final class WikiDatabase_Impl extends WikiDatabase {

    /* renamed from: d */
    private volatile AbstractC12467b f33397d;

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    /* renamed from: c */
    public C1429d mo7542c() {
        return new C1429d(this, "t_wiki_relation");
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.WikiDatabase
    /* renamed from: m */
    public AbstractC12467b mo16369m() {
        AbstractC12467b bVar;
        if (this.f33397d != null) {
            return this.f33397d;
        }
        synchronized (this) {
            if (this.f33397d == null) {
                this.f33397d = new C12468c(this);
            }
            bVar = this.f33397d;
        }
        return bVar;
    }

    @Override // androidx.room.RoomDatabase
    /* renamed from: d */
    public void mo7543d() {
        super.mo7545f();
        AbstractC1082b writableDatabase = super.mo7540b().getWritableDatabase();
        try {
            super.mo7546g();
            writableDatabase.execSQL("DELETE FROM `t_wiki_relation`");
            super.mo7549j();
        } finally {
            super.mo7547h();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    /* renamed from: b */
    public AbstractC1083c mo7541b(C1419a aVar) {
        return aVar.f4986a.create(AbstractC1083c.C1085b.m5191a(aVar.f4987b).mo5742a(aVar.f4988c).mo5741a(new C1437g(aVar, new C1437g.AbstractC1438a(2) {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.WikiDatabase_Impl.C124641 */

            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: a */
            public void mo7608a(AbstractC1082b bVar) {
                bVar.execSQL("DROP TABLE IF EXISTS `t_wiki_relation`");
            }

            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: b */
            public void mo7609b(AbstractC1082b bVar) {
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `t_wiki_relation` (`wiki_token` TEXT NOT NULL, `space_id` TEXT NOT NULL, `obj_token` TEXT, `obj_type` INTEGER NOT NULL, `title` TEXT, `parent_wiki_token` TEXT, `sort_id` REAL NOT NULL, `wiki_node_type` INTEGER NOT NULL, `origin_wiki_token` TEXT, `origin_space_id` TEXT, `is_star` INTEGER NOT NULL, `children` TEXT, `space_name` TEXT, `has_child` INTEGER NOT NULL, PRIMARY KEY(`wiki_token`, `space_id`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"cf68ba68e2ba1df73a891c0d310f9d1a\")");
            }

            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: c */
            public void mo7610c(AbstractC1082b bVar) {
                WikiDatabase_Impl.this.f4965a = bVar;
                WikiDatabase_Impl.this.mo7537a(bVar);
                if (WikiDatabase_Impl.this.f4967c != null) {
                    int size = WikiDatabase_Impl.this.f4967c.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.AbstractC1417b) WikiDatabase_Impl.this.f4967c.get(i)).mo7560b(bVar);
                    }
                }
            }

            /* access modifiers changed from: protected */
            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: d */
            public void mo7611d(AbstractC1082b bVar) {
                if (WikiDatabase_Impl.this.f4967c != null) {
                    int size = WikiDatabase_Impl.this.f4967c.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.AbstractC1417b) WikiDatabase_Impl.this.f4967c.get(i)).mo7559a(bVar);
                    }
                }
            }

            /* access modifiers changed from: protected */
            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: e */
            public void mo7612e(AbstractC1082b bVar) {
                HashMap hashMap = new HashMap(14);
                hashMap.put("wiki_token", new C1423b.C1424a("wiki_token", "TEXT", true, 1));
                hashMap.put("space_id", new C1423b.C1424a("space_id", "TEXT", true, 2));
                hashMap.put("obj_token", new C1423b.C1424a("obj_token", "TEXT", false, 0));
                hashMap.put("obj_type", new C1423b.C1424a("obj_type", "INTEGER", true, 0));
                hashMap.put("title", new C1423b.C1424a("title", "TEXT", false, 0));
                hashMap.put("parent_wiki_token", new C1423b.C1424a("parent_wiki_token", "TEXT", false, 0));
                hashMap.put("sort_id", new C1423b.C1424a("sort_id", "REAL", true, 0));
                hashMap.put("wiki_node_type", new C1423b.C1424a("wiki_node_type", "INTEGER", true, 0));
                hashMap.put("origin_wiki_token", new C1423b.C1424a("origin_wiki_token", "TEXT", false, 0));
                hashMap.put("origin_space_id", new C1423b.C1424a("origin_space_id", "TEXT", false, 0));
                hashMap.put("is_star", new C1423b.C1424a("is_star", "INTEGER", true, 0));
                hashMap.put("children", new C1423b.C1424a("children", "TEXT", false, 0));
                hashMap.put("space_name", new C1423b.C1424a("space_name", "TEXT", false, 0));
                hashMap.put("has_child", new C1423b.C1424a("has_child", "INTEGER", true, 0));
                C1423b bVar2 = new C1423b("t_wiki_relation", hashMap, new HashSet(0), new HashSet(0));
                C1423b a = C1423b.m6523a(bVar, "t_wiki_relation");
                if (!bVar2.equals(a)) {
                    throw new IllegalStateException("Migration didn't properly handle t_wiki_relation(com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.DBTreeNode).\n Expected:\n" + bVar2 + "\n Found:\n" + a);
                }
            }
        }, "cf68ba68e2ba1df73a891c0d310f9d1a", "a08141061d69600d5a51a1d15c5eeea8")).mo5743a());
    }
}
