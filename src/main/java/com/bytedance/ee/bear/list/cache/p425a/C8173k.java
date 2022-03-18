package com.bytedance.ee.bear.list.cache.p425a;

import androidx.p038g.p039a.AbstractC1082b;
import androidx.room.p047a.AbstractC1420a;

/* renamed from: com.bytedance.ee.bear.list.cache.a.k */
public class C8173k extends AbstractC1420a {
    public C8173k() {
        super(51, 52);
    }

    @Override // androidx.room.p047a.AbstractC1420a
    /* renamed from: a */
    public void mo7566a(AbstractC1082b bVar) {
        bVar.execSQL("ALTER TABLE `WikiSpace` ADD COLUMN space_type INTEGER NOT NULL DEFAULT -1");
    }
}
