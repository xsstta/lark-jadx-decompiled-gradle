package com.bytedance.ee.bear.list.cache.p425a;

import androidx.p038g.p039a.AbstractC1082b;
import androidx.room.p047a.AbstractC1420a;

/* renamed from: com.bytedance.ee.bear.list.cache.a.c */
public class C8165c extends AbstractC1420a {
    public C8165c() {
        super(42, 43);
    }

    @Override // androidx.room.p047a.AbstractC1420a
    /* renamed from: a */
    public void mo7566a(AbstractC1082b bVar) {
        bVar.execSQL("CREATE INDEX IF NOT EXISTS `index_ListTypes_obj_token_list_type` ON `ListTypes` (`obj_token`, `list_type`)");
    }
}
