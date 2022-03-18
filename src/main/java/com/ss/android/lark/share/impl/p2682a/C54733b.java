package com.ss.android.lark.share.impl.p2682a;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.ss.android.lark.share.impl.a.b */
public class C54733b extends AbstractC54724a {

    /* renamed from: f */
    private String f135167f = "";

    @Override // com.ss.android.lark.share.impl.AbstractC54744b
    /* renamed from: c */
    public void mo186867c(Intent intent) {
    }

    @Override // com.ss.android.lark.share.impl.AbstractC54744b
    /* renamed from: d */
    public void mo186869d(Intent intent) {
    }

    @Override // com.ss.android.lark.share.impl.AbstractC54744b
    /* renamed from: c */
    public boolean mo186868c() {
        if (!"share.lark.com".equals(this.f135148e) || !"/im/send_auth.html".equals(this.f135167f)) {
            return false;
        }
        return true;
    }

    public C54733b(Activity activity) {
        super(activity);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.share.impl.p2682a.AbstractC54724a, com.ss.android.lark.share.impl.AbstractC54723a
    /* renamed from: b */
    public void mo186864b(Intent intent) {
        String str;
        super.mo186864b(intent);
        if (this.f135147d == null) {
            str = "";
        } else {
            str = this.f135147d.getPath();
        }
        this.f135167f = str;
    }
}
