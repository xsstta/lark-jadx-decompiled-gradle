package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.p596a;

import androidx.p038g.p039a.AbstractC1082b;
import androidx.room.p047a.AbstractC1420a;

/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.a.a */
public class C12466a extends AbstractC1420a {
    public C12466a() {
        super(1, 2);
    }

    @Override // androidx.room.p047a.AbstractC1420a
    /* renamed from: a */
    public void mo7566a(AbstractC1082b bVar) {
        bVar.execSQL("DELETE FROM t_wiki_relation");
        bVar.execSQL("ALTER TABLE t_wiki_relation ADD COLUMN has_child INTEGER NOT NULL DEFAULT 0");
    }
}
