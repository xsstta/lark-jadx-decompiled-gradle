package com.bytedance.ee.bear.document.offline.offlinestorage;

import androidx.p038g.p039a.AbstractC1082b;
import androidx.p038g.p039a.AbstractC1083c;
import androidx.room.C1419a;
import androidx.room.C1429d;
import androidx.room.C1437g;
import androidx.room.RoomDatabase;
import androidx.room.p048b.C1423b;
import com.bytedance.ee.bear.document.offline.file.p319a.AbstractC5930a;
import com.bytedance.ee.bear.document.offline.file.p319a.C5931b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import java.util.HashSet;

public final class OfflineDatabase_Impl extends OfflineDatabase {

    /* renamed from: d */
    private volatile AbstractC5969g f16672d;

    /* renamed from: e */
    private volatile AbstractC5930a f16673e;

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    /* renamed from: c */
    public C1429d mo7542c() {
        return new C1429d(this, "ResourceData", "file_model", "at_object");
    }

    @Override // com.bytedance.ee.bear.document.offline.offlinestorage.OfflineDatabase
    /* renamed from: m */
    public AbstractC5969g mo16369m() {
        AbstractC5969g gVar;
        if (this.f16672d != null) {
            return this.f16672d;
        }
        synchronized (this) {
            if (this.f16672d == null) {
                this.f16672d = new C5970h(this);
            }
            gVar = this.f16672d;
        }
        return gVar;
    }

    @Override // com.bytedance.ee.bear.document.offline.offlinestorage.OfflineDatabase
    /* renamed from: n */
    public AbstractC5930a mo24061n() {
        AbstractC5930a aVar;
        if (this.f16673e != null) {
            return this.f16673e;
        }
        synchronized (this) {
            if (this.f16673e == null) {
                this.f16673e = new C5931b(this);
            }
            aVar = this.f16673e;
        }
        return aVar;
    }

    @Override // androidx.room.RoomDatabase
    /* renamed from: d */
    public void mo7543d() {
        super.mo7545f();
        AbstractC1082b writableDatabase = super.mo7540b().getWritableDatabase();
        try {
            super.mo7546g();
            writableDatabase.execSQL("DELETE FROM `ResourceData`");
            writableDatabase.execSQL("DELETE FROM `file_model`");
            writableDatabase.execSQL("DELETE FROM `at_object`");
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
            /* class com.bytedance.ee.bear.document.offline.offlinestorage.OfflineDatabase_Impl.C59511 */

            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: a */
            public void mo7608a(AbstractC1082b bVar) {
                bVar.execSQL("DROP TABLE IF EXISTS `ResourceData`");
                bVar.execSQL("DROP TABLE IF EXISTS `file_model`");
                bVar.execSQL("DROP TABLE IF EXISTS `at_object`");
            }

            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: b */
            public void mo7609b(AbstractC1082b bVar) {
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `ResourceData` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `reskey` TEXT, `resvalue` TEXT, `resvalue_filepath` TEXT, `update_time` INTEGER, `access_time` INTEGER, `isNeedSync` INTEGER NOT NULL, `config` TEXT, `type` TEXT, `token` TEXT, `obj_token` TEXT, `userToken` TEXT, `tenantID` TEXT, `url` TEXT, `subblock_preload_status` INTEGER NOT NULL)");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `file_model` (`name` TEXT NOT NULL, `token` TEXT NOT NULL, `doc_url` TEXT NOT NULL, `path` TEXT NOT NULL, `uri` TEXT NOT NULL, `local_url` TEXT, `net_url` TEXT, `file_modified_time` INTEGER NOT NULL, `new_upload_key` TEXT, `upload_key` TEXT, PRIMARY KEY(`name`, `token`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `at_object` (`id` TEXT NOT NULL, `cn_name` TEXT, `en_name` TEXT, `name` TEXT, `title` TEXT, `type` INTEGER NOT NULL, `sub_type` INTEGER NOT NULL, `token` TEXT, `content` TEXT, `edit_time` TEXT, `owner` TEXT, `desc` TEXT, `count` TEXT, `url` TEXT, `department` TEXT, `avatar_url` TEXT, `isExternal` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"a2cebf38fe7872909f0deb7bbfe3e065\")");
            }

            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: c */
            public void mo7610c(AbstractC1082b bVar) {
                OfflineDatabase_Impl.this.f4965a = bVar;
                OfflineDatabase_Impl.this.mo7537a(bVar);
                if (OfflineDatabase_Impl.this.f4967c != null) {
                    int size = OfflineDatabase_Impl.this.f4967c.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.AbstractC1417b) OfflineDatabase_Impl.this.f4967c.get(i)).mo7560b(bVar);
                    }
                }
            }

            /* access modifiers changed from: protected */
            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: d */
            public void mo7611d(AbstractC1082b bVar) {
                if (OfflineDatabase_Impl.this.f4967c != null) {
                    int size = OfflineDatabase_Impl.this.f4967c.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.AbstractC1417b) OfflineDatabase_Impl.this.f4967c.get(i)).mo7559a(bVar);
                    }
                }
            }

            /* access modifiers changed from: protected */
            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: e */
            public void mo7612e(AbstractC1082b bVar) {
                HashMap hashMap = new HashMap(15);
                hashMap.put("id", new C1423b.C1424a("id", "INTEGER", true, 1));
                hashMap.put("reskey", new C1423b.C1424a("reskey", "TEXT", false, 0));
                hashMap.put("resvalue", new C1423b.C1424a("resvalue", "TEXT", false, 0));
                hashMap.put("resvalue_filepath", new C1423b.C1424a("resvalue_filepath", "TEXT", false, 0));
                hashMap.put("update_time", new C1423b.C1424a("update_time", "INTEGER", false, 0));
                hashMap.put("access_time", new C1423b.C1424a("access_time", "INTEGER", false, 0));
                hashMap.put("isNeedSync", new C1423b.C1424a("isNeedSync", "INTEGER", true, 0));
                hashMap.put("config", new C1423b.C1424a("config", "TEXT", false, 0));
                hashMap.put(ShareHitPoint.f121869d, new C1423b.C1424a(ShareHitPoint.f121869d, "TEXT", false, 0));
                hashMap.put("token", new C1423b.C1424a("token", "TEXT", false, 0));
                hashMap.put("obj_token", new C1423b.C1424a("obj_token", "TEXT", false, 0));
                hashMap.put("userToken", new C1423b.C1424a("userToken", "TEXT", false, 0));
                hashMap.put("tenantID", new C1423b.C1424a("tenantID", "TEXT", false, 0));
                hashMap.put("url", new C1423b.C1424a("url", "TEXT", false, 0));
                hashMap.put("subblock_preload_status", new C1423b.C1424a("subblock_preload_status", "INTEGER", true, 0));
                C1423b bVar2 = new C1423b("ResourceData", hashMap, new HashSet(0), new HashSet(0));
                C1423b a = C1423b.m6523a(bVar, "ResourceData");
                if (bVar2.equals(a)) {
                    HashMap hashMap2 = new HashMap(10);
                    hashMap2.put("name", new C1423b.C1424a("name", "TEXT", true, 1));
                    hashMap2.put("token", new C1423b.C1424a("token", "TEXT", true, 2));
                    hashMap2.put("doc_url", new C1423b.C1424a("doc_url", "TEXT", true, 0));
                    hashMap2.put("path", new C1423b.C1424a("path", "TEXT", true, 0));
                    hashMap2.put("uri", new C1423b.C1424a("uri", "TEXT", true, 0));
                    hashMap2.put("local_url", new C1423b.C1424a("local_url", "TEXT", false, 0));
                    hashMap2.put("net_url", new C1423b.C1424a("net_url", "TEXT", false, 0));
                    hashMap2.put("file_modified_time", new C1423b.C1424a("file_modified_time", "INTEGER", true, 0));
                    hashMap2.put("new_upload_key", new C1423b.C1424a("new_upload_key", "TEXT", false, 0));
                    hashMap2.put("upload_key", new C1423b.C1424a("upload_key", "TEXT", false, 0));
                    C1423b bVar3 = new C1423b("file_model", hashMap2, new HashSet(0), new HashSet(0));
                    C1423b a2 = C1423b.m6523a(bVar, "file_model");
                    if (bVar3.equals(a2)) {
                        HashMap hashMap3 = new HashMap(17);
                        hashMap3.put("id", new C1423b.C1424a("id", "TEXT", true, 1));
                        hashMap3.put("cn_name", new C1423b.C1424a("cn_name", "TEXT", false, 0));
                        hashMap3.put("en_name", new C1423b.C1424a("en_name", "TEXT", false, 0));
                        hashMap3.put("name", new C1423b.C1424a("name", "TEXT", false, 0));
                        hashMap3.put("title", new C1423b.C1424a("title", "TEXT", false, 0));
                        hashMap3.put(ShareHitPoint.f121869d, new C1423b.C1424a(ShareHitPoint.f121869d, "INTEGER", true, 0));
                        hashMap3.put("sub_type", new C1423b.C1424a("sub_type", "INTEGER", true, 0));
                        hashMap3.put("token", new C1423b.C1424a("token", "TEXT", false, 0));
                        hashMap3.put("content", new C1423b.C1424a("content", "TEXT", false, 0));
                        hashMap3.put("edit_time", new C1423b.C1424a("edit_time", "TEXT", false, 0));
                        hashMap3.put("owner", new C1423b.C1424a("owner", "TEXT", false, 0));
                        hashMap3.put("desc", new C1423b.C1424a("desc", "TEXT", false, 0));
                        hashMap3.put("count", new C1423b.C1424a("count", "TEXT", false, 0));
                        hashMap3.put("url", new C1423b.C1424a("url", "TEXT", false, 0));
                        hashMap3.put("department", new C1423b.C1424a("department", "TEXT", false, 0));
                        hashMap3.put("avatar_url", new C1423b.C1424a("avatar_url", "TEXT", false, 0));
                        hashMap3.put("isExternal", new C1423b.C1424a("isExternal", "INTEGER", true, 0));
                        C1423b bVar4 = new C1423b("at_object", hashMap3, new HashSet(0), new HashSet(0));
                        C1423b a3 = C1423b.m6523a(bVar, "at_object");
                        if (!bVar4.equals(a3)) {
                            throw new IllegalStateException("Migration didn't properly handle at_object(com.bytedance.ee.bear.at.AtObject).\n Expected:\n" + bVar4 + "\n Found:\n" + a3);
                        }
                        return;
                    }
                    throw new IllegalStateException("Migration didn't properly handle file_model(com.bytedance.ee.bear.document.offline.file.db.FileModel).\n Expected:\n" + bVar3 + "\n Found:\n" + a2);
                }
                throw new IllegalStateException("Migration didn't properly handle ResourceData(com.bytedance.ee.bear.document.offline.offlinestorage.ResourceData).\n Expected:\n" + bVar2 + "\n Found:\n" + a);
            }
        }, "a2cebf38fe7872909f0deb7bbfe3e065", "c79007d12f6d740926e757a1dfa88907")).mo5743a());
    }
}
