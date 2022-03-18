package com.bytedance.ee.bear.list.cache;

import android.os.Build;
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

public final class BearDatabase_Impl extends BearDatabase {

    /* renamed from: d */
    private volatile AbstractC8178e f21746d;

    /* renamed from: e */
    private volatile AbstractC8203l f21747e;

    /* renamed from: f */
    private volatile AbstractC8214p f21748f;

    /* renamed from: g */
    private volatile AbstractC8183g f21749g;

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    /* renamed from: c */
    public C1429d mo7542c() {
        return new C1429d(this, "FolderSortStrategy", "RecentWiki", "WikiSpace", "ListTypes", "DocMetaInfo", "FilterCache");
    }

    @Override // com.bytedance.ee.bear.list.cache.BearDatabase
    /* renamed from: m */
    public AbstractC8178e mo16369m() {
        AbstractC8178e eVar;
        if (this.f21746d != null) {
            return this.f21746d;
        }
        synchronized (this) {
            if (this.f21746d == null) {
                this.f21746d = new C8179f(this);
            }
            eVar = this.f21746d;
        }
        return eVar;
    }

    @Override // com.bytedance.ee.bear.list.cache.BearDatabase
    /* renamed from: n */
    public AbstractC8203l mo31542n() {
        AbstractC8203l lVar;
        if (this.f21747e != null) {
            return this.f21747e;
        }
        synchronized (this) {
            if (this.f21747e == null) {
                this.f21747e = new C8204m(this);
            }
            lVar = this.f21747e;
        }
        return lVar;
    }

    @Override // com.bytedance.ee.bear.list.cache.BearDatabase
    /* renamed from: o */
    public AbstractC8214p mo31543o() {
        AbstractC8214p pVar;
        if (this.f21748f != null) {
            return this.f21748f;
        }
        synchronized (this) {
            if (this.f21748f == null) {
                this.f21748f = new C8215q(this);
            }
            pVar = this.f21748f;
        }
        return pVar;
    }

    @Override // com.bytedance.ee.bear.list.cache.BearDatabase
    /* renamed from: p */
    public AbstractC8183g mo31544p() {
        AbstractC8183g gVar;
        if (this.f21749g != null) {
            return this.f21749g;
        }
        synchronized (this) {
            if (this.f21749g == null) {
                this.f21749g = new C8184h(this);
            }
            gVar = this.f21749g;
        }
        return gVar;
    }

    @Override // androidx.room.RoomDatabase
    /* renamed from: d */
    public void mo7543d() {
        boolean z;
        super.mo7545f();
        AbstractC1082b writableDatabase = super.mo7540b().getWritableDatabase();
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                writableDatabase.execSQL("PRAGMA foreign_keys = FALSE");
            } catch (Throwable th) {
                super.mo7547h();
                if (!z) {
                    writableDatabase.execSQL("PRAGMA foreign_keys = TRUE");
                }
                writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
                if (!writableDatabase.inTransaction()) {
                    writableDatabase.execSQL("VACUUM");
                }
                throw th;
            }
        }
        super.mo7546g();
        if (z) {
            writableDatabase.execSQL("PRAGMA defer_foreign_keys = TRUE");
        }
        writableDatabase.execSQL("DELETE FROM `FolderSortStrategy`");
        writableDatabase.execSQL("DELETE FROM `RecentWiki`");
        writableDatabase.execSQL("DELETE FROM `WikiSpace`");
        writableDatabase.execSQL("DELETE FROM `ListTypes`");
        writableDatabase.execSQL("DELETE FROM `DocMetaInfo`");
        writableDatabase.execSQL("DELETE FROM `FilterCache`");
        super.mo7549j();
        super.mo7547h();
        if (!z) {
            writableDatabase.execSQL("PRAGMA foreign_keys = TRUE");
        }
        writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
        if (!writableDatabase.inTransaction()) {
            writableDatabase.execSQL("VACUUM");
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    /* renamed from: b */
    public AbstractC1083c mo7541b(C1419a aVar) {
        return aVar.f4986a.create(AbstractC1083c.C1085b.m5191a(aVar.f4987b).mo5742a(aVar.f4988c).mo5741a(new C1437g(aVar, new C1437g.AbstractC1438a(53) {
            /* class com.bytedance.ee.bear.list.cache.BearDatabase_Impl.C81511 */

            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: a */
            public void mo7608a(AbstractC1082b bVar) {
                bVar.execSQL("DROP TABLE IF EXISTS `FolderSortStrategy`");
                bVar.execSQL("DROP TABLE IF EXISTS `RecentWiki`");
                bVar.execSQL("DROP TABLE IF EXISTS `WikiSpace`");
                bVar.execSQL("DROP TABLE IF EXISTS `ListTypes`");
                bVar.execSQL("DROP TABLE IF EXISTS `DocMetaInfo`");
                bVar.execSQL("DROP TABLE IF EXISTS `FilterCache`");
            }

            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: b */
            public void mo7609b(AbstractC1082b bVar) {
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `FolderSortStrategy` (`obj_token` TEXT NOT NULL, `type` INTEGER NOT NULL, `file_type` TEXT, `forbidden_file_type` TEXT, `strategy` INTEGER NOT NULL, `is_asc` INTEGER NOT NULL, `update_time` TEXT, `user_id` TEXT, PRIMARY KEY(`obj_token`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `RecentWiki` (`wiki_token` TEXT NOT NULL, `space_id` TEXT, `open_time` TEXT, `open_count` TEXT, `title` TEXT, `owner_id` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `url` TEXT, `obj_token` TEXT, `obj_type` INTEGER NOT NULL, PRIMARY KEY(`wiki_token`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `WikiSpace` (`space_id` TEXT NOT NULL, `user_id` TEXT, `space_name` TEXT, `space_icon` TEXT, `attr` INTEGER NOT NULL, `description` TEXT, `is_star` INTEGER NOT NULL, `browse_time` TEXT, `wiki_token` TEXT, `obj_type` INTEGER NOT NULL, `obj_token` TEXT, `origin` TEXT, `thumbnail` TEXT, `cover_key` TEXT, `is_graph_dark` INTEGER NOT NULL, `color_value` TEXT, `wiki_scope` INTEGER NOT NULL, `space_type` INTEGER NOT NULL, PRIMARY KEY(`space_id`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `ListTypes` (`obj_token` TEXT NOT NULL, `list_type` INTEGER NOT NULL, `token` TEXT NOT NULL, `extra` TEXT, `space_id` TEXT, `file_path` TEXT NOT NULL, `add_time_manualoffline` TEXT, `is_need_wifi_download` INTEGER NOT NULL, `open_time_recent` TEXT, `my_edit_time_recent` TEXT, `activity_time_recent` TEXT, `has_perm_folder` INTEGER NOT NULL, `show_external_hint_folder` INTEGER NOT NULL, `node_type_folder` INTEGER NOT NULL, `shortcut_name_folder` TEXT, PRIMARY KEY(`obj_token`, `list_type`, `token`), FOREIGN KEY(`obj_token`) REFERENCES `DocMetaInfo`(`obj_token`) ON UPDATE CASCADE ON DELETE NO ACTION )");
                bVar.execSQL("CREATE  INDEX `index_ListTypes_obj_token_list_type` ON `ListTypes` (`obj_token`, `list_type`)");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `DocMetaInfo` (`obj_token` TEXT NOT NULL, `name` TEXT, `type` TEXT, `owner_id` TEXT, `create_tenant_id` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `url` TEXT, `fake_token` TEXT, `is_stared` INTEGER NOT NULL, `is_pined` INTEGER NOT NULL, `is_subscribed` INTEGER NOT NULL, `extra_icon_url` TEXT, `extra_icon_key` TEXT, `extra_icon_nonce` TEXT, `extra_icon_encrypted_type` INTEGER NOT NULL, `extra_copiable` INTEGER NOT NULL, `extra_is_share_root` INTEGER NOT NULL, `extra_is_external` INTEGER NOT NULL, `extra_sub_type` TEXT, `is_visited` INTEGER NOT NULL, `create_time` TEXT, `thumbnail_url` TEXT, `thumbnail_secret` TEXT, `thumbnail_nonce` TEXT, `thumbnail_type` INTEGER NOT NULL, `permission` INTEGER NOT NULL, `share_time` TEXT, `share_version` INTEGER NOT NULL, `is_hidden` INTEGER NOT NULL, `need_sync` INTEGER NOT NULL, `size` TEXT, `thumbnail` TEXT, `document_icon_key` TEXT, `document_icon_type` INTEGER NOT NULL, `document_icon_fsunit` TEXT, `app_id` TEXT, `doc_cache_status` INTEGER NOT NULL, `is_offline_create` INTEGER NOT NULL, `wiki_real_type` INTEGER NOT NULL, `wiki_version` TEXT, `owner_type` INTEGER NOT NULL, `is_share_folder` INTEGER NOT NULL, PRIMARY KEY(`obj_token`))");
                bVar.execSQL("CREATE  INDEX `index_DocMetaInfo_obj_token` ON `DocMetaInfo` (`obj_token`)");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `FilterCache` (`list_type` INTEGER NOT NULL, `filter_type` INTEGER NOT NULL, `file_type` TEXT NOT NULL, `strategy` INTEGER NOT NULL, `is_asc` INTEGER NOT NULL, `obj_token` TEXT NOT NULL, `file_path` TEXT NOT NULL, `token` TEXT, `extra` TEXT, `space_id` TEXT, `add_time_manualoffline` TEXT, `is_need_wifi_download` INTEGER NOT NULL, `open_time_recent` TEXT, `my_edit_time_recent` TEXT, `activity_time_recent` TEXT, `has_perm_folder` INTEGER NOT NULL, `show_external_hint_folder` INTEGER NOT NULL, `node_type_folder` INTEGER NOT NULL, `shortcut_name_folder` TEXT, `id` INTEGER NOT NULL, PRIMARY KEY(`list_type`, `filter_type`, `file_type`, `strategy`, `is_asc`, `obj_token`, `file_path`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"86a70256aaa31262b1d656d1d0fbf225\")");
            }

            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: c */
            public void mo7610c(AbstractC1082b bVar) {
                BearDatabase_Impl.this.f4965a = bVar;
                bVar.execSQL("PRAGMA foreign_keys = ON");
                BearDatabase_Impl.this.mo7537a(bVar);
                if (BearDatabase_Impl.this.f4967c != null) {
                    int size = BearDatabase_Impl.this.f4967c.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.AbstractC1417b) BearDatabase_Impl.this.f4967c.get(i)).mo7560b(bVar);
                    }
                }
            }

            /* access modifiers changed from: protected */
            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: d */
            public void mo7611d(AbstractC1082b bVar) {
                if (BearDatabase_Impl.this.f4967c != null) {
                    int size = BearDatabase_Impl.this.f4967c.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.AbstractC1417b) BearDatabase_Impl.this.f4967c.get(i)).mo7559a(bVar);
                    }
                }
            }

            /* access modifiers changed from: protected */
            @Override // androidx.room.C1437g.AbstractC1438a
            /* renamed from: e */
            public void mo7612e(AbstractC1082b bVar) {
                HashMap hashMap = new HashMap(8);
                hashMap.put("obj_token", new C1423b.C1424a("obj_token", "TEXT", true, 1));
                hashMap.put(ShareHitPoint.f121869d, new C1423b.C1424a(ShareHitPoint.f121869d, "INTEGER", true, 0));
                hashMap.put("file_type", new C1423b.C1424a("file_type", "TEXT", false, 0));
                hashMap.put("forbidden_file_type", new C1423b.C1424a("forbidden_file_type", "TEXT", false, 0));
                hashMap.put("strategy", new C1423b.C1424a("strategy", "INTEGER", true, 0));
                hashMap.put("is_asc", new C1423b.C1424a("is_asc", "INTEGER", true, 0));
                hashMap.put("update_time", new C1423b.C1424a("update_time", "TEXT", false, 0));
                hashMap.put("user_id", new C1423b.C1424a("user_id", "TEXT", false, 0));
                C1423b bVar2 = new C1423b("FolderSortStrategy", hashMap, new HashSet(0), new HashSet(0));
                C1423b a = C1423b.m6523a(bVar, "FolderSortStrategy");
                if (bVar2.equals(a)) {
                    HashMap hashMap2 = new HashMap(13);
                    hashMap2.put("wiki_token", new C1423b.C1424a("wiki_token", "TEXT", true, 1));
                    hashMap2.put("space_id", new C1423b.C1424a("space_id", "TEXT", false, 0));
                    hashMap2.put("open_time", new C1423b.C1424a("open_time", "TEXT", false, 0));
                    hashMap2.put("open_count", new C1423b.C1424a("open_count", "TEXT", false, 0));
                    hashMap2.put("title", new C1423b.C1424a("title", "TEXT", false, 0));
                    hashMap2.put("owner_id", new C1423b.C1424a("owner_id", "TEXT", false, 0));
                    hashMap2.put("creator_cn_name", new C1423b.C1424a("creator_cn_name", "TEXT", false, 0));
                    hashMap2.put("creator_en_name", new C1423b.C1424a("creator_en_name", "TEXT", false, 0));
                    hashMap2.put("edit_uid", new C1423b.C1424a("edit_uid", "TEXT", false, 0));
                    hashMap2.put("edit_time", new C1423b.C1424a("edit_time", "TEXT", false, 0));
                    hashMap2.put("url", new C1423b.C1424a("url", "TEXT", false, 0));
                    hashMap2.put("obj_token", new C1423b.C1424a("obj_token", "TEXT", false, 0));
                    hashMap2.put("obj_type", new C1423b.C1424a("obj_type", "INTEGER", true, 0));
                    C1423b bVar3 = new C1423b("RecentWiki", hashMap2, new HashSet(0), new HashSet(0));
                    C1423b a2 = C1423b.m6523a(bVar, "RecentWiki");
                    if (bVar3.equals(a2)) {
                        HashMap hashMap3 = new HashMap(18);
                        hashMap3.put("space_id", new C1423b.C1424a("space_id", "TEXT", true, 1));
                        hashMap3.put("user_id", new C1423b.C1424a("user_id", "TEXT", false, 0));
                        hashMap3.put("space_name", new C1423b.C1424a("space_name", "TEXT", false, 0));
                        hashMap3.put("space_icon", new C1423b.C1424a("space_icon", "TEXT", false, 0));
                        hashMap3.put("attr", new C1423b.C1424a("attr", "INTEGER", true, 0));
                        hashMap3.put("description", new C1423b.C1424a("description", "TEXT", false, 0));
                        hashMap3.put("is_star", new C1423b.C1424a("is_star", "INTEGER", true, 0));
                        hashMap3.put("browse_time", new C1423b.C1424a("browse_time", "TEXT", false, 0));
                        hashMap3.put("wiki_token", new C1423b.C1424a("wiki_token", "TEXT", false, 0));
                        hashMap3.put("obj_type", new C1423b.C1424a("obj_type", "INTEGER", true, 0));
                        hashMap3.put("obj_token", new C1423b.C1424a("obj_token", "TEXT", false, 0));
                        hashMap3.put("origin", new C1423b.C1424a("origin", "TEXT", false, 0));
                        hashMap3.put("thumbnail", new C1423b.C1424a("thumbnail", "TEXT", false, 0));
                        hashMap3.put("cover_key", new C1423b.C1424a("cover_key", "TEXT", false, 0));
                        hashMap3.put("is_graph_dark", new C1423b.C1424a("is_graph_dark", "INTEGER", true, 0));
                        hashMap3.put("color_value", new C1423b.C1424a("color_value", "TEXT", false, 0));
                        hashMap3.put("wiki_scope", new C1423b.C1424a("wiki_scope", "INTEGER", true, 0));
                        hashMap3.put("space_type", new C1423b.C1424a("space_type", "INTEGER", true, 0));
                        C1423b bVar4 = new C1423b("WikiSpace", hashMap3, new HashSet(0), new HashSet(0));
                        C1423b a3 = C1423b.m6523a(bVar, "WikiSpace");
                        if (bVar4.equals(a3)) {
                            HashMap hashMap4 = new HashMap(15);
                            hashMap4.put("obj_token", new C1423b.C1424a("obj_token", "TEXT", true, 1));
                            hashMap4.put("list_type", new C1423b.C1424a("list_type", "INTEGER", true, 2));
                            hashMap4.put("token", new C1423b.C1424a("token", "TEXT", true, 3));
                            hashMap4.put("extra", new C1423b.C1424a("extra", "TEXT", false, 0));
                            hashMap4.put("space_id", new C1423b.C1424a("space_id", "TEXT", false, 0));
                            hashMap4.put("file_path", new C1423b.C1424a("file_path", "TEXT", true, 0));
                            hashMap4.put("add_time_manualoffline", new C1423b.C1424a("add_time_manualoffline", "TEXT", false, 0));
                            hashMap4.put("is_need_wifi_download", new C1423b.C1424a("is_need_wifi_download", "INTEGER", true, 0));
                            hashMap4.put("open_time_recent", new C1423b.C1424a("open_time_recent", "TEXT", false, 0));
                            hashMap4.put("my_edit_time_recent", new C1423b.C1424a("my_edit_time_recent", "TEXT", false, 0));
                            hashMap4.put("activity_time_recent", new C1423b.C1424a("activity_time_recent", "TEXT", false, 0));
                            hashMap4.put("has_perm_folder", new C1423b.C1424a("has_perm_folder", "INTEGER", true, 0));
                            hashMap4.put("show_external_hint_folder", new C1423b.C1424a("show_external_hint_folder", "INTEGER", true, 0));
                            hashMap4.put("node_type_folder", new C1423b.C1424a("node_type_folder", "INTEGER", true, 0));
                            hashMap4.put("shortcut_name_folder", new C1423b.C1424a("shortcut_name_folder", "TEXT", false, 0));
                            HashSet hashSet = new HashSet(1);
                            hashSet.add(new C1423b.C1425b("DocMetaInfo", "NO ACTION", "CASCADE", Arrays.asList("obj_token"), Arrays.asList("obj_token")));
                            HashSet hashSet2 = new HashSet(1);
                            hashSet2.add(new C1423b.C1427d("index_ListTypes_obj_token_list_type", false, Arrays.asList("obj_token", "list_type")));
                            C1423b bVar5 = new C1423b("ListTypes", hashMap4, hashSet, hashSet2);
                            C1423b a4 = C1423b.m6523a(bVar, "ListTypes");
                            if (bVar5.equals(a4)) {
                                HashMap hashMap5 = new HashMap(45);
                                hashMap5.put("obj_token", new C1423b.C1424a("obj_token", "TEXT", true, 1));
                                hashMap5.put("name", new C1423b.C1424a("name", "TEXT", false, 0));
                                hashMap5.put(ShareHitPoint.f121869d, new C1423b.C1424a(ShareHitPoint.f121869d, "TEXT", false, 0));
                                hashMap5.put("owner_id", new C1423b.C1424a("owner_id", "TEXT", false, 0));
                                hashMap5.put("create_tenant_id", new C1423b.C1424a("create_tenant_id", "TEXT", false, 0));
                                hashMap5.put("creator_cn_name", new C1423b.C1424a("creator_cn_name", "TEXT", false, 0));
                                hashMap5.put("creator_en_name", new C1423b.C1424a("creator_en_name", "TEXT", false, 0));
                                hashMap5.put("edit_uid", new C1423b.C1424a("edit_uid", "TEXT", false, 0));
                                hashMap5.put("edit_time", new C1423b.C1424a("edit_time", "TEXT", false, 0));
                                hashMap5.put("url", new C1423b.C1424a("url", "TEXT", false, 0));
                                hashMap5.put("fake_token", new C1423b.C1424a("fake_token", "TEXT", false, 0));
                                hashMap5.put("is_stared", new C1423b.C1424a("is_stared", "INTEGER", true, 0));
                                hashMap5.put("is_pined", new C1423b.C1424a("is_pined", "INTEGER", true, 0));
                                hashMap5.put("is_subscribed", new C1423b.C1424a("is_subscribed", "INTEGER", true, 0));
                                hashMap5.put("extra_icon_url", new C1423b.C1424a("extra_icon_url", "TEXT", false, 0));
                                hashMap5.put("extra_icon_key", new C1423b.C1424a("extra_icon_key", "TEXT", false, 0));
                                hashMap5.put("extra_icon_nonce", new C1423b.C1424a("extra_icon_nonce", "TEXT", false, 0));
                                hashMap5.put("extra_icon_encrypted_type", new C1423b.C1424a("extra_icon_encrypted_type", "INTEGER", true, 0));
                                hashMap5.put("extra_copiable", new C1423b.C1424a("extra_copiable", "INTEGER", true, 0));
                                hashMap5.put("extra_is_share_root", new C1423b.C1424a("extra_is_share_root", "INTEGER", true, 0));
                                hashMap5.put("extra_is_external", new C1423b.C1424a("extra_is_external", "INTEGER", true, 0));
                                hashMap5.put("extra_sub_type", new C1423b.C1424a("extra_sub_type", "TEXT", false, 0));
                                hashMap5.put("is_visited", new C1423b.C1424a("is_visited", "INTEGER", true, 0));
                                hashMap5.put("create_time", new C1423b.C1424a("create_time", "TEXT", false, 0));
                                hashMap5.put("thumbnail_url", new C1423b.C1424a("thumbnail_url", "TEXT", false, 0));
                                hashMap5.put("thumbnail_secret", new C1423b.C1424a("thumbnail_secret", "TEXT", false, 0));
                                hashMap5.put("thumbnail_nonce", new C1423b.C1424a("thumbnail_nonce", "TEXT", false, 0));
                                hashMap5.put("thumbnail_type", new C1423b.C1424a("thumbnail_type", "INTEGER", true, 0));
                                hashMap5.put("permission", new C1423b.C1424a("permission", "INTEGER", true, 0));
                                hashMap5.put("share_time", new C1423b.C1424a("share_time", "TEXT", false, 0));
                                hashMap5.put("share_version", new C1423b.C1424a("share_version", "INTEGER", true, 0));
                                hashMap5.put("is_hidden", new C1423b.C1424a("is_hidden", "INTEGER", true, 0));
                                hashMap5.put("need_sync", new C1423b.C1424a("need_sync", "INTEGER", true, 0));
                                hashMap5.put("size", new C1423b.C1424a("size", "TEXT", false, 0));
                                hashMap5.put("thumbnail", new C1423b.C1424a("thumbnail", "TEXT", false, 0));
                                hashMap5.put("document_icon_key", new C1423b.C1424a("document_icon_key", "TEXT", false, 0));
                                hashMap5.put("document_icon_type", new C1423b.C1424a("document_icon_type", "INTEGER", true, 0));
                                hashMap5.put("document_icon_fsunit", new C1423b.C1424a("document_icon_fsunit", "TEXT", false, 0));
                                hashMap5.put("app_id", new C1423b.C1424a("app_id", "TEXT", false, 0));
                                hashMap5.put("doc_cache_status", new C1423b.C1424a("doc_cache_status", "INTEGER", true, 0));
                                hashMap5.put("is_offline_create", new C1423b.C1424a("is_offline_create", "INTEGER", true, 0));
                                hashMap5.put("wiki_real_type", new C1423b.C1424a("wiki_real_type", "INTEGER", true, 0));
                                hashMap5.put("wiki_version", new C1423b.C1424a("wiki_version", "TEXT", false, 0));
                                hashMap5.put("owner_type", new C1423b.C1424a("owner_type", "INTEGER", true, 0));
                                hashMap5.put("is_share_folder", new C1423b.C1424a("is_share_folder", "INTEGER", true, 0));
                                HashSet hashSet3 = new HashSet(0);
                                HashSet hashSet4 = new HashSet(1);
                                hashSet4.add(new C1423b.C1427d("index_DocMetaInfo_obj_token", false, Arrays.asList("obj_token")));
                                C1423b bVar6 = new C1423b("DocMetaInfo", hashMap5, hashSet3, hashSet4);
                                C1423b a5 = C1423b.m6523a(bVar, "DocMetaInfo");
                                if (bVar6.equals(a5)) {
                                    HashMap hashMap6 = new HashMap(20);
                                    hashMap6.put("list_type", new C1423b.C1424a("list_type", "INTEGER", true, 1));
                                    hashMap6.put("filter_type", new C1423b.C1424a("filter_type", "INTEGER", true, 2));
                                    hashMap6.put("file_type", new C1423b.C1424a("file_type", "TEXT", true, 3));
                                    hashMap6.put("strategy", new C1423b.C1424a("strategy", "INTEGER", true, 4));
                                    hashMap6.put("is_asc", new C1423b.C1424a("is_asc", "INTEGER", true, 5));
                                    hashMap6.put("obj_token", new C1423b.C1424a("obj_token", "TEXT", true, 6));
                                    hashMap6.put("file_path", new C1423b.C1424a("file_path", "TEXT", true, 7));
                                    hashMap6.put("token", new C1423b.C1424a("token", "TEXT", false, 0));
                                    hashMap6.put("extra", new C1423b.C1424a("extra", "TEXT", false, 0));
                                    hashMap6.put("space_id", new C1423b.C1424a("space_id", "TEXT", false, 0));
                                    hashMap6.put("add_time_manualoffline", new C1423b.C1424a("add_time_manualoffline", "TEXT", false, 0));
                                    hashMap6.put("is_need_wifi_download", new C1423b.C1424a("is_need_wifi_download", "INTEGER", true, 0));
                                    hashMap6.put("open_time_recent", new C1423b.C1424a("open_time_recent", "TEXT", false, 0));
                                    hashMap6.put("my_edit_time_recent", new C1423b.C1424a("my_edit_time_recent", "TEXT", false, 0));
                                    hashMap6.put("activity_time_recent", new C1423b.C1424a("activity_time_recent", "TEXT", false, 0));
                                    hashMap6.put("has_perm_folder", new C1423b.C1424a("has_perm_folder", "INTEGER", true, 0));
                                    hashMap6.put("show_external_hint_folder", new C1423b.C1424a("show_external_hint_folder", "INTEGER", true, 0));
                                    hashMap6.put("node_type_folder", new C1423b.C1424a("node_type_folder", "INTEGER", true, 0));
                                    hashMap6.put("shortcut_name_folder", new C1423b.C1424a("shortcut_name_folder", "TEXT", false, 0));
                                    hashMap6.put("id", new C1423b.C1424a("id", "INTEGER", true, 0));
                                    C1423b bVar7 = new C1423b("FilterCache", hashMap6, new HashSet(0), new HashSet(0));
                                    C1423b a6 = C1423b.m6523a(bVar, "FilterCache");
                                    if (!bVar7.equals(a6)) {
                                        throw new IllegalStateException("Migration didn't properly handle FilterCache(com.bytedance.ee.bear.list.cache.FilterCache).\n Expected:\n" + bVar7 + "\n Found:\n" + a6);
                                    }
                                    return;
                                }
                                throw new IllegalStateException("Migration didn't properly handle DocMetaInfo(com.bytedance.ee.bear.list.cache.DocMetaInfo).\n Expected:\n" + bVar6 + "\n Found:\n" + a5);
                            }
                            throw new IllegalStateException("Migration didn't properly handle ListTypes(com.bytedance.ee.bear.list.cache.ListType).\n Expected:\n" + bVar5 + "\n Found:\n" + a4);
                        }
                        throw new IllegalStateException("Migration didn't properly handle WikiSpace(com.bytedance.ee.bear.list.cache.WikiSpace).\n Expected:\n" + bVar4 + "\n Found:\n" + a3);
                    }
                    throw new IllegalStateException("Migration didn't properly handle RecentWiki(com.bytedance.ee.bear.list.cache.RecentWiki).\n Expected:\n" + bVar3 + "\n Found:\n" + a2);
                }
                throw new IllegalStateException("Migration didn't properly handle FolderSortStrategy(com.bytedance.ee.bear.list.cache.FolderSortStrategy).\n Expected:\n" + bVar2 + "\n Found:\n" + a);
            }
        }, "86a70256aaa31262b1d656d1d0fbf225", "280ee0d16c93f6604bbabef687281278")).mo5743a());
    }
}
