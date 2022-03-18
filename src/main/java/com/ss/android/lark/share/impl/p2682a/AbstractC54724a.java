package com.ss.android.lark.share.impl.p2682a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.ss.android.lark.share.impl.AbstractC54723a;

/* renamed from: com.ss.android.lark.share.impl.a.a */
public abstract class AbstractC54724a extends AbstractC54723a {

    /* renamed from: d */
    protected Uri f135147d;

    /* renamed from: e */
    protected String f135148e;

    public AbstractC54724a(Activity activity) {
        super(activity);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.share.impl.AbstractC54723a
    /* renamed from: b */
    public void mo186864b(Intent intent) {
        String str;
        Uri data = intent.getData();
        this.f135147d = data;
        if (data == null) {
            str = "";
        } else {
            str = data.getHost();
        }
        this.f135148e = str;
    }
}
