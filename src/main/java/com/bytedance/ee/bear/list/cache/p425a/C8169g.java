package com.bytedance.ee.bear.list.cache.p425a;

import androidx.p038g.p039a.AbstractC1082b;
import androidx.room.p047a.AbstractC1420a;

/* renamed from: com.bytedance.ee.bear.list.cache.a.g */
public class C8169g extends AbstractC1420a {
    public C8169g() {
        super(47, 48);
    }

    @Override // androidx.room.p047a.AbstractC1420a
    /* renamed from: a */
    public void mo7566a(AbstractC1082b bVar) {
        bVar.execSQL("ALTER TABLE `FilterCache` ADD COLUMN id INTEGER NOT NULL DEFAULT 0");
    }
}
