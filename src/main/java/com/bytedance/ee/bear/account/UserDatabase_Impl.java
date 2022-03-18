package com.bytedance.ee.bear.account;

import androidx.p038g.p039a.AbstractC1082b;
import androidx.p038g.p039a.AbstractC1083c;
import androidx.room.C1419a;
import androidx.room.C1429d;
import androidx.room.C1437g;
import androidx.room.RoomDatabase;
import androidx.room.p048b.C1423b;
import java.util.HashMap;
import java.util.HashSet;

public final class UserDatabase_Impl extends UserDatabase {

    /* renamed from: d */
    private volatile AbstractC4202n f12623d;

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    /* renamed from: c */
    public C1429d mo7542c() {
        return new C1429d(this, "user");
    }

    @Override // com.bytedance.ee.bear.account.UserDatabase
    /* renamed from: m */
    public AbstractC4202n mo16369m() {
        AbstractC4202n nVar;
        if (this.f12623d != null) {
            return this.f12623d;
        }
        synchronized (this) {
            if (this.f12623d == null) {
                this.f12623d = new C4203o(this);
            }
            nVar = this.f12623d;
        }
        return nVar;
    }

    @Override // androidx.room.RoomDatabase
    /* renamed from: d */
    public void mo7543d() {
        super.mo7545f();
        AbstractC1082b writableDatabase = super.mo7540b().getWritableDatabase();
        try {
            super.mo7546g();
            writableDatabase.execSQL("DELETE FROM `user`");
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
        return aVar.f4986a.create(AbstractC1083c.C1085b.m5191a(aVar.f4987b).mo5742a(aVar.f4988c).mo5741a(new C1437g(aVar, new C1437g.AbstractC1438a(14) {
            /* class com.bytedance.ee.bear.account.UserDatabase_Impl.C41611 */

            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: a */
            public void mo7608a(AbstractC1082b bVar) {
                bVar.execSQL("DROP TABLE IF EXISTS `user`");
            }

            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: b */
            public void mo7609b(AbstractC1082b bVar) {
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `user` (`uid` TEXT NOT NULL, `cn_name` TEXT, `en_name` TEXT, `organization` TEXT, `email` TEXT, `mobile` TEXT, `avatar_url` TEXT, `openid` TEXT, `token` TEXT, `tenant_id` TEXT, `department_id` TEXT, `tenant_name` TEXT, `state` INTEGER NOT NULL, `can_create_sheet` INTEGER NOT NULL, `can_cross` INTEGER NOT NULL, `domain` TEXT, `is_singleproduct` INTEGER NOT NULL, `tenant_tag` TEXT, `is_manager` INTEGER NOT NULL, PRIMARY KEY(`uid`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"04f1b7619a39de7d6ceb6e6020c58f0c\")");
            }

            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: c */
            public void mo7610c(AbstractC1082b bVar) {
                UserDatabase_Impl.this.f4965a = bVar;
                UserDatabase_Impl.this.mo7537a(bVar);
                if (UserDatabase_Impl.this.f4967c != null) {
                    int size = UserDatabase_Impl.this.f4967c.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.AbstractC1417b) UserDatabase_Impl.this.f4967c.get(i)).mo7560b(bVar);
                    }
                }
            }

            /* access modifiers changed from: protected */
            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: d */
            public void mo7611d(AbstractC1082b bVar) {
                if (UserDatabase_Impl.this.f4967c != null) {
                    int size = UserDatabase_Impl.this.f4967c.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.AbstractC1417b) UserDatabase_Impl.this.f4967c.get(i)).mo7559a(bVar);
                    }
                }
            }

            /* access modifiers changed from: protected */
            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: e */
            public void mo7612e(AbstractC1082b bVar) {
                HashMap hashMap = new HashMap(19);
                hashMap.put("uid", new C1423b.C1424a("uid", "TEXT", true, 1));
                hashMap.put("cn_name", new C1423b.C1424a("cn_name", "TEXT", false, 0));
                hashMap.put("en_name", new C1423b.C1424a("en_name", "TEXT", false, 0));
                hashMap.put("organization", new C1423b.C1424a("organization", "TEXT", false, 0));
                hashMap.put("email", new C1423b.C1424a("email", "TEXT", false, 0));
                hashMap.put("mobile", new C1423b.C1424a("mobile", "TEXT", false, 0));
                hashMap.put("avatar_url", new C1423b.C1424a("avatar_url", "TEXT", false, 0));
                hashMap.put("openid", new C1423b.C1424a("openid", "TEXT", false, 0));
                hashMap.put("token", new C1423b.C1424a("token", "TEXT", false, 0));
                hashMap.put("tenant_id", new C1423b.C1424a("tenant_id", "TEXT", false, 0));
                hashMap.put("department_id", new C1423b.C1424a("department_id", "TEXT", false, 0));
                hashMap.put("tenant_name", new C1423b.C1424a("tenant_name", "TEXT", false, 0));
                hashMap.put("state", new C1423b.C1424a("state", "INTEGER", true, 0));
                hashMap.put("can_create_sheet", new C1423b.C1424a("can_create_sheet", "INTEGER", true, 0));
                hashMap.put("can_cross", new C1423b.C1424a("can_cross", "INTEGER", true, 0));
                hashMap.put("domain", new C1423b.C1424a("domain", "TEXT", false, 0));
                hashMap.put("is_singleproduct", new C1423b.C1424a("is_singleproduct", "INTEGER", true, 0));
                hashMap.put("tenant_tag", new C1423b.C1424a("tenant_tag", "TEXT", false, 0));
                hashMap.put("is_manager", new C1423b.C1424a("is_manager", "INTEGER", true, 0));
                C1423b bVar2 = new C1423b("user", hashMap, new HashSet(0), new HashSet(0));
                C1423b a = C1423b.m6523a(bVar, "user");
                if (!bVar2.equals(a)) {
                    throw new IllegalStateException("Migration didn't properly handle user(com.bytedance.ee.bear.account.User).\n Expected:\n" + bVar2 + "\n Found:\n" + a);
                }
            }
        }, "04f1b7619a39de7d6ceb6e6020c58f0c", "618196a142250d1a6419efd2e28314d1")).mo5743a());
    }
}
