package com.bytedance.ee.bear.list.cache.p425a;

import androidx.p038g.p039a.AbstractC1082b;
import androidx.room.p047a.AbstractC1420a;

/* renamed from: com.bytedance.ee.bear.list.cache.a.e */
public class C8167e extends AbstractC1420a {
    public C8167e() {
        super(44, 45);
    }

    @Override // androidx.room.p047a.AbstractC1420a
    /* renamed from: a */
    public void mo7566a(AbstractC1082b bVar) {
        bVar.execSQL("ALTER TABLE `DocMetaInfo` ADD COLUMN wiki_real_type INTEGER NOT NULL DEFAULT -1");
        bVar.execSQL("ALTER TABLE `DocMetaInfo` ADD COLUMN is_subscribed INTEGER NOT NULL DEFAULT 0");
    }
}
