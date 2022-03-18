package com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6905a;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.a */
public class C6800a extends AbstractC6905a<AbstractC6805b> {

    /* renamed from: a */
    private Bundle f18487a;

    /* renamed from: a */
    public void mo26779a() {
        if (mo27153l()) {
            ((AbstractC6805b) mo27154m()).a_(this.f18487a);
        }
    }

    public C6800a(Context context) {
        super(context);
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6908d, com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6905a
    /* renamed from: a */
    public void mo25880a(Bundle bundle, Bundle bundle2) {
        super.mo25880a(bundle, bundle2);
        this.f18487a = bundle2;
    }
}
