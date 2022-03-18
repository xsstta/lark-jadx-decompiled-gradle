package com.bytedance.ee.bear.drive.dao;

import androidx.p038g.p039a.AbstractC1082b;
import androidx.p038g.p039a.AbstractC1083c;
import androidx.room.C1419a;
import androidx.room.C1429d;
import androidx.room.C1437g;
import androidx.room.RoomDatabase;
import androidx.room.p048b.C1423b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public final class DriveDatabase_Impl extends DriveDatabase {

    /* renamed from: d */
    private volatile AbstractC6954a f18800d;

    /* renamed from: e */
    private volatile AbstractC6972d f18801e;

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    /* renamed from: c */
    public C1429d mo7542c() {
        return new C1429d(this, "t_drive_cache", "drive_excel_sub_cache");
    }

    @Override // com.bytedance.ee.bear.drive.dao.DriveDatabase
    /* renamed from: m */
    public AbstractC6954a mo16369m() {
        AbstractC6954a aVar;
        if (this.f18800d != null) {
            return this.f18800d;
        }
        synchronized (this) {
            if (this.f18800d == null) {
                this.f18800d = new C6957b(this);
            }
            aVar = this.f18800d;
        }
        return aVar;
    }

    @Override // com.bytedance.ee.bear.drive.dao.DriveDatabase
    /* renamed from: n */
    public AbstractC6972d mo27401n() {
        AbstractC6972d dVar;
        if (this.f18801e != null) {
            return this.f18801e;
        }
        synchronized (this) {
            if (this.f18801e == null) {
                this.f18801e = new C6973e(this);
            }
            dVar = this.f18801e;
        }
        return dVar;
    }

    @Override // androidx.room.RoomDatabase
    /* renamed from: d */
    public void mo7543d() {
        super.mo7545f();
        AbstractC1082b writableDatabase = super.mo7540b().getWritableDatabase();
        try {
            super.mo7546g();
            writableDatabase.execSQL("DELETE FROM `t_drive_cache`");
            writableDatabase.execSQL("DELETE FROM `drive_excel_sub_cache`");
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
        return aVar.f4986a.create(AbstractC1083c.C1085b.m5191a(aVar.f4987b).mo5742a(aVar.f4988c).mo5741a(new C1437g(aVar, new C1437g.AbstractC1438a(6) {
            /* class com.bytedance.ee.bear.drive.dao.DriveDatabase_Impl.C69531 */

            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: a */
            public void mo7608a(AbstractC1082b bVar) {
                bVar.execSQL("DROP TABLE IF EXISTS `t_drive_cache`");
                bVar.execSQL("DROP TABLE IF EXISTS `drive_excel_sub_cache`");
            }

            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: b */
            public void mo7609b(AbstractC1082b bVar) {
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `t_drive_cache` (`cache_key` TEXT NOT NULL, `obj_token` TEXT, `src_ext` TEXT, `preview_ext` TEXT, `data_version` TEXT, `source_from` TEXT, `file_path` TEXT, `partial_file_path` TEXT, `file_size` INTEGER NOT NULL, `type` INTEGER NOT NULL, `last_access_time` INTEGER NOT NULL, `modification_time` INTEGER NOT NULL, `file_name` TEXT, `cache_uid` TEXT, `cache_tenant_id` TEXT, `preview_extra` TEXT, `is_use_partial_file` INTEGER NOT NULL, `cache_host` INTEGER NOT NULL, `sdk_app_id` TEXT, `sdk_extra` TEXT, `flags` INTEGER NOT NULL, `mime_type` TEXT, PRIMARY KEY(`cache_key`))");
                bVar.execSQL("CREATE  INDEX `index_t_drive_cache_last_access_time` ON `t_drive_cache` (`last_access_time`)");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `drive_excel_sub_cache` (`sdk_app_id` TEXT NOT NULL, `obj_token` TEXT NOT NULL, `data_version` TEXT NOT NULL, `sub_id` TEXT NOT NULL, `json_data_file_path` TEXT NOT NULL, `json_data` TEXT NOT NULL, PRIMARY KEY(`sdk_app_id`, `obj_token`, `data_version`, `sub_id`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"8ee011b037696d0bea03a13c256e632b\")");
            }

            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: c */
            public void mo7610c(AbstractC1082b bVar) {
                DriveDatabase_Impl.this.f4965a = bVar;
                DriveDatabase_Impl.this.mo7537a(bVar);
                if (DriveDatabase_Impl.this.f4967c != null) {
                    int size = DriveDatabase_Impl.this.f4967c.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.AbstractC1417b) DriveDatabase_Impl.this.f4967c.get(i)).mo7560b(bVar);
                    }
                }
            }

            /* access modifiers changed from: protected */
            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: d */
            public void mo7611d(AbstractC1082b bVar) {
                if (DriveDatabase_Impl.this.f4967c != null) {
                    int size = DriveDatabase_Impl.this.f4967c.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.AbstractC1417b) DriveDatabase_Impl.this.f4967c.get(i)).mo7559a(bVar);
                    }
                }
            }

            /* access modifiers changed from: protected */
            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: e */
            public void mo7612e(AbstractC1082b bVar) {
                HashMap hashMap = new HashMap(22);
                hashMap.put("cache_key", new C1423b.C1424a("cache_key", "TEXT", true, 1));
                hashMap.put("obj_token", new C1423b.C1424a("obj_token", "TEXT", false, 0));
                hashMap.put("src_ext", new C1423b.C1424a("src_ext", "TEXT", false, 0));
                hashMap.put("preview_ext", new C1423b.C1424a("preview_ext", "TEXT", false, 0));
                hashMap.put("data_version", new C1423b.C1424a("data_version", "TEXT", false, 0));
                hashMap.put("source_from", new C1423b.C1424a("source_from", "TEXT", false, 0));
                hashMap.put("file_path", new C1423b.C1424a("file_path", "TEXT", false, 0));
                hashMap.put("partial_file_path", new C1423b.C1424a("partial_file_path", "TEXT", false, 0));
                hashMap.put("file_size", new C1423b.C1424a("file_size", "INTEGER", true, 0));
                hashMap.put(ShareHitPoint.f121869d, new C1423b.C1424a(ShareHitPoint.f121869d, "INTEGER", true, 0));
                hashMap.put("last_access_time", new C1423b.C1424a("last_access_time", "INTEGER", true, 0));
                hashMap.put("modification_time", new C1423b.C1424a("modification_time", "INTEGER", true, 0));
                hashMap.put("file_name", new C1423b.C1424a("file_name", "TEXT", false, 0));
                hashMap.put("cache_uid", new C1423b.C1424a("cache_uid", "TEXT", false, 0));
                hashMap.put("cache_tenant_id", new C1423b.C1424a("cache_tenant_id", "TEXT", false, 0));
                hashMap.put("preview_extra", new C1423b.C1424a("preview_extra", "TEXT", false, 0));
                hashMap.put("is_use_partial_file", new C1423b.C1424a("is_use_partial_file", "INTEGER", true, 0));
                hashMap.put("cache_host", new C1423b.C1424a("cache_host", "INTEGER", true, 0));
                hashMap.put("sdk_app_id", new C1423b.C1424a("sdk_app_id", "TEXT", false, 0));
                hashMap.put("sdk_extra", new C1423b.C1424a("sdk_extra", "TEXT", false, 0));
                hashMap.put("flags", new C1423b.C1424a("flags", "INTEGER", true, 0));
                hashMap.put("mime_type", new C1423b.C1424a("mime_type", "TEXT", false, 0));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new C1423b.C1427d("index_t_drive_cache_last_access_time", false, Arrays.asList("last_access_time")));
                C1423b bVar2 = new C1423b("t_drive_cache", hashMap, hashSet, hashSet2);
                C1423b a = C1423b.m6523a(bVar, "t_drive_cache");
                if (bVar2.equals(a)) {
                    HashMap hashMap2 = new HashMap(6);
                    hashMap2.put("sdk_app_id", new C1423b.C1424a("sdk_app_id", "TEXT", true, 1));
                    hashMap2.put("obj_token", new C1423b.C1424a("obj_token", "TEXT", true, 2));
                    hashMap2.put("data_version", new C1423b.C1424a("data_version", "TEXT", true, 3));
                    hashMap2.put("sub_id", new C1423b.C1424a("sub_id", "TEXT", true, 4));
                    hashMap2.put("json_data_file_path", new C1423b.C1424a("json_data_file_path", "TEXT", true, 0));
                    hashMap2.put("json_data", new C1423b.C1424a("json_data", "TEXT", true, 0));
                    C1423b bVar3 = new C1423b("drive_excel_sub_cache", hashMap2, new HashSet(0), new HashSet(0));
                    C1423b a2 = C1423b.m6523a(bVar, "drive_excel_sub_cache");
                    if (!bVar3.equals(a2)) {
                        throw new IllegalStateException("Migration didn't properly handle drive_excel_sub_cache(com.bytedance.ee.bear.drive.dao.model.ExcelSubCacheModel).\n Expected:\n" + bVar3 + "\n Found:\n" + a2);
                    }
                    return;
                }
                throw new IllegalStateException("Migration didn't properly handle t_drive_cache(com.bytedance.ee.bear.drive.dao.model.CacheModel).\n Expected:\n" + bVar2 + "\n Found:\n" + a);
            }
        }, "8ee011b037696d0bea03a13c256e632b", "4762912cfee1868517611b3ba2318652")).mo5743a());
    }
}
