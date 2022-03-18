package com.bytedance.ee.util.db;

import androidx.p038g.p039a.AbstractC1082b;
import androidx.p038g.p039a.AbstractC1083c;
import androidx.room.C1419a;
import androidx.room.C1429d;
import androidx.room.C1437g;
import androidx.room.RoomDatabase;
import androidx.room.p048b.C1423b;
import java.util.HashMap;
import java.util.HashSet;

public final class KeyValueDatabase_Impl extends KeyValueDatabase {

    /* renamed from: d */
    private volatile AbstractC13637c f35809d;

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    /* renamed from: c */
    public C1429d mo7542c() {
        return new C1429d(this, "key_value_model");
    }

    @Override // com.bytedance.ee.util.db.KeyValueDatabase
    /* renamed from: m */
    public AbstractC13637c mo16369m() {
        AbstractC13637c cVar;
        if (this.f35809d != null) {
            return this.f35809d;
        }
        synchronized (this) {
            if (this.f35809d == null) {
                this.f35809d = new C13638d(this);
            }
            cVar = this.f35809d;
        }
        return cVar;
    }

    @Override // androidx.room.RoomDatabase
    /* renamed from: d */
    public void mo7543d() {
        super.mo7545f();
        AbstractC1082b writableDatabase = super.mo7540b().getWritableDatabase();
        try {
            super.mo7546g();
            writableDatabase.execSQL("DELETE FROM `key_value_model`");
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
        return aVar.f4986a.create(AbstractC1083c.C1085b.m5191a(aVar.f4987b).mo5742a(aVar.f4988c).mo5741a(new C1437g(aVar, new C1437g.AbstractC1438a(1) {
            /* class com.bytedance.ee.util.db.KeyValueDatabase_Impl.C136341 */

            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: a */
            public void mo7608a(AbstractC1082b bVar) {
                bVar.execSQL("DROP TABLE IF EXISTS `key_value_model`");
            }

            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: b */
            public void mo7609b(AbstractC1082b bVar) {
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `key_value_model` (`key` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`key`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"06b304a6a53ebec229b882249c8292a5\")");
            }

            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: c */
            public void mo7610c(AbstractC1082b bVar) {
                KeyValueDatabase_Impl.this.f4965a = bVar;
                KeyValueDatabase_Impl.this.mo7537a(bVar);
                if (KeyValueDatabase_Impl.this.f4967c != null) {
                    int size = KeyValueDatabase_Impl.this.f4967c.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.AbstractC1417b) KeyValueDatabase_Impl.this.f4967c.get(i)).mo7560b(bVar);
                    }
                }
            }

            /* access modifiers changed from: protected */
            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: d */
            public void mo7611d(AbstractC1082b bVar) {
                if (KeyValueDatabase_Impl.this.f4967c != null) {
                    int size = KeyValueDatabase_Impl.this.f4967c.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.AbstractC1417b) KeyValueDatabase_Impl.this.f4967c.get(i)).mo7559a(bVar);
                    }
                }
            }

            /* access modifiers changed from: protected */
            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: e */
            public void mo7612e(AbstractC1082b bVar) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("key", new C1423b.C1424a("key", "TEXT", true, 1));
                hashMap.put("value", new C1423b.C1424a("value", "TEXT", false, 0));
                C1423b bVar2 = new C1423b("key_value_model", hashMap, new HashSet(0), new HashSet(0));
                C1423b a = C1423b.m6523a(bVar, "key_value_model");
                if (!bVar2.equals(a)) {
                    throw new IllegalStateException("Migration didn't properly handle key_value_model(com.bytedance.ee.util.db.KeyValueModel).\n Expected:\n" + bVar2 + "\n Found:\n" + a);
                }
            }
        }, "06b304a6a53ebec229b882249c8292a5", "46a0183d47a89038d6cacedb2e6492b7")).mo5743a());
    }
}
