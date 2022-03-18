package com.bytedance.ee.bear.notification.db;

import androidx.p038g.p039a.AbstractC1082b;
import androidx.p038g.p039a.AbstractC1083c;
import androidx.room.C1419a;
import androidx.room.C1429d;
import androidx.room.C1437g;
import androidx.room.RoomDatabase;
import androidx.room.p048b.C1423b;
import java.util.HashMap;
import java.util.HashSet;

public final class NotificationDatabase_Impl extends NotificationDatabase {

    /* renamed from: d */
    private volatile AbstractC10330b f27831d;

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    /* renamed from: c */
    public C1429d mo7542c() {
        return new C1429d(this, "Notification");
    }

    @Override // com.bytedance.ee.bear.notification.db.NotificationDatabase
    /* renamed from: m */
    public AbstractC10330b mo16369m() {
        AbstractC10330b bVar;
        if (this.f27831d != null) {
            return this.f27831d;
        }
        synchronized (this) {
            if (this.f27831d == null) {
                this.f27831d = new C10331c(this);
            }
            bVar = this.f27831d;
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
            writableDatabase.execSQL("DELETE FROM `Notification`");
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
            /* class com.bytedance.ee.bear.notification.db.NotificationDatabase_Impl.C103261 */

            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: a */
            public void mo7608a(AbstractC1082b bVar) {
                bVar.execSQL("DROP TABLE IF EXISTS `Notification`");
            }

            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: b */
            public void mo7609b(AbstractC1082b bVar) {
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `Notification` (`id` TEXT NOT NULL, `start_time` INTEGER NOT NULL, `end_time` INTEGER NOT NULL, `content` TEXT, `product` TEXT, `close` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"66519bdaf2c8a261f21cc46b74f2a193\")");
            }

            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: c */
            public void mo7610c(AbstractC1082b bVar) {
                NotificationDatabase_Impl.this.f4965a = bVar;
                NotificationDatabase_Impl.this.mo7537a(bVar);
                if (NotificationDatabase_Impl.this.f4967c != null) {
                    int size = NotificationDatabase_Impl.this.f4967c.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.AbstractC1417b) NotificationDatabase_Impl.this.f4967c.get(i)).mo7560b(bVar);
                    }
                }
            }

            /* access modifiers changed from: protected */
            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: d */
            public void mo7611d(AbstractC1082b bVar) {
                if (NotificationDatabase_Impl.this.f4967c != null) {
                    int size = NotificationDatabase_Impl.this.f4967c.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.AbstractC1417b) NotificationDatabase_Impl.this.f4967c.get(i)).mo7559a(bVar);
                    }
                }
            }

            /* access modifiers changed from: protected */
            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: e */
            public void mo7612e(AbstractC1082b bVar) {
                HashMap hashMap = new HashMap(6);
                hashMap.put("id", new C1423b.C1424a("id", "TEXT", true, 1));
                hashMap.put("start_time", new C1423b.C1424a("start_time", "INTEGER", true, 0));
                hashMap.put("end_time", new C1423b.C1424a("end_time", "INTEGER", true, 0));
                hashMap.put("content", new C1423b.C1424a("content", "TEXT", false, 0));
                hashMap.put("product", new C1423b.C1424a("product", "TEXT", false, 0));
                hashMap.put("close", new C1423b.C1424a("close", "INTEGER", true, 0));
                C1423b bVar2 = new C1423b("Notification", hashMap, new HashSet(0), new HashSet(0));
                C1423b a = C1423b.m6523a(bVar, "Notification");
                if (!bVar2.equals(a)) {
                    throw new IllegalStateException("Migration didn't properly handle Notification(com.bytedance.ee.bear.notification.bean.Notification).\n Expected:\n" + bVar2 + "\n Found:\n" + a);
                }
            }
        }, "66519bdaf2c8a261f21cc46b74f2a193", "77411312c8afe5cb1f571a9288c6f395")).mo5743a());
    }
}
