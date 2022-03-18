package com.bytedance.ee.bear.drive.biz.importfile.p327a;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ee.bear.drive.biz.importfile.p329c.AbstractC6478a;
import com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6905a;
import com.bytedance.ee.bear.drive.importfile.ImportFileEntity;

/* renamed from: com.bytedance.ee.bear.drive.biz.importfile.a.a */
public class C6472a extends AbstractC6905a<AbstractC6478a> {

    /* renamed from: a */
    private Bundle f17877a;

    public C6472a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo25881a(ImportFileEntity importFileEntity) {
        if (mo27153l()) {
            ((AbstractC6478a) mo27154m()).mo25858a(importFileEntity, this.f17877a);
        }
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6908d, com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6905a
    /* renamed from: a */
    public void mo25880a(Bundle bundle, Bundle bundle2) {
        super.mo25880a(bundle, bundle2);
        this.f17877a = bundle2;
    }
}
