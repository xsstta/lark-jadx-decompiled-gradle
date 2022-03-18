package com.bytedance.ee.bear.list.cache.p425a;

import androidx.p038g.p039a.AbstractC1082b;
import androidx.room.p047a.AbstractC1420a;

/* renamed from: com.bytedance.ee.bear.list.cache.a.h */
public class C8170h extends AbstractC1420a {
    public C8170h() {
        super(48, 49);
    }

    @Override // androidx.room.p047a.AbstractC1420a
    /* renamed from: a */
    public void mo7566a(AbstractC1082b bVar) {
        bVar.execSQL("DROP TABLE IF EXISTS `RecentWiki`");
        bVar.execSQL("CREATE TABLE IF NOT EXISTS `RecentWiki` (`wiki_token` TEXT NOT NULL PRIMARY KEY, `space_id` TEXT, `open_time` TEXT,`open_count` TEXT,`title` TEXT,`owner_id` TEXT,`creator_cn_name` TEXT,`creator_en_name` TEXT,`edit_uid` TEXT,`edit_time` TEXT,`url` TEXT,`obj_type` INTEGER NOT NULL DEFAULT 0, `obj_token` TEXT)");
    }
}
