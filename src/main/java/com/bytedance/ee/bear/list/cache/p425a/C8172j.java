package com.bytedance.ee.bear.list.cache.p425a;

import androidx.p038g.p039a.AbstractC1082b;
import androidx.room.p047a.AbstractC1420a;

/* renamed from: com.bytedance.ee.bear.list.cache.a.j */
public class C8172j extends AbstractC1420a {
    public C8172j() {
        super(50, 51);
    }

    @Override // androidx.room.p047a.AbstractC1420a
    /* renamed from: a */
    public void mo7566a(AbstractC1082b bVar) {
        bVar.execSQL("ALTER TABLE `WikiSpace` ADD COLUMN wiki_scope INTEGER NOT NULL DEFAULT 0");
    }
}
