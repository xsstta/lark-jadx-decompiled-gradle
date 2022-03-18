package com.bytedance.ee.bear.list.cache.p425a;

import androidx.p038g.p039a.AbstractC1082b;
import androidx.room.p047a.AbstractC1420a;

/* renamed from: com.bytedance.ee.bear.list.cache.a.f */
public class C8168f extends AbstractC1420a {
    public C8168f() {
        super(46, 47);
    }

    @Override // androidx.room.p047a.AbstractC1420a
    /* renamed from: a */
    public void mo7566a(AbstractC1082b bVar) {
        bVar.execSQL("CREATE TABLE IF NOT EXISTS `FilterCache` (`list_type` INTEGER NOT NULL DEFAULT 0, `filter_type` INTEGER NOT NULL DEFAULT 0, `file_type` TEXT NOT NULL DEFAULT '',`strategy` INTEGER NOT NULL DEFAULT 0, `is_asc` INTEGER NOT NULL DEFAULT 0,`obj_token` TEXT NOT NULL DEFAULT '',`file_path` TEXT NOT NULL DEFAULT '',`token` TEXT,`extra` TEXT, `space_id` TEXT,`add_time_manualoffline` TEXT,`is_need_wifi_download` INTEGER NOT NULL DEFAULT 0,`open_time_recent` TEXT,`my_edit_time_recent` TEXT,`activity_time_recent` TEXT,`has_perm_folder` INTEGER NOT NULL DEFAULT 1,`show_external_hint_folder` INTEGER NOT NULL DEFAULT 0,PRIMARY KEY(`list_type`, `filter_type`, `file_type`, `strategy`, `is_asc`, `obj_token`, `file_path`))");
    }
}
