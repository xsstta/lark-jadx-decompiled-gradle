package com.bytedance.ee.bear.list.cache.p425a;

import androidx.p038g.p039a.AbstractC1082b;
import androidx.room.p047a.AbstractC1420a;

/* renamed from: com.bytedance.ee.bear.list.cache.a.b */
public class C8164b extends AbstractC1420a {
    public C8164b() {
        super(41, 42);
    }

    @Override // androidx.room.p047a.AbstractC1420a
    /* renamed from: a */
    public void mo7566a(AbstractC1082b bVar) {
        bVar.execSQL("ALTER TABLE ListTypes ADD COLUMN has_perm_folder INTEGER NOT NULL DEFAULT 1");
        bVar.execSQL("ALTER TABLE ListTypes ADD COLUMN show_external_hint_folder INTEGER NOT NULL DEFAULT 0");
    }
}
