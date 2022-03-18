package com.bytedance.ee.bear.list.cache.p425a;

import androidx.p038g.p039a.AbstractC1082b;
import androidx.room.p047a.AbstractC1420a;

/* renamed from: com.bytedance.ee.bear.list.cache.a.l */
public class C8174l extends AbstractC1420a {
    public C8174l() {
        super(52, 53);
    }

    @Override // androidx.room.p047a.AbstractC1420a
    /* renamed from: a */
    public void mo7566a(AbstractC1082b bVar) {
        bVar.execSQL("ALTER TABLE `DocMetaInfo` ADD COLUMN wiki_version TEXT");
        bVar.execSQL("UPDATE FolderSortStrategy SET type = -1 WHERE type = 20");
    }
}
