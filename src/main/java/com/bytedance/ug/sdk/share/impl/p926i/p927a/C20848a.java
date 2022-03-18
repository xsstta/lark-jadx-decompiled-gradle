package com.bytedance.ug.sdk.share.impl.p926i.p927a;

import android.app.Activity;
import com.bytedance.ug.sdk.share.api.entity.TokenInfoBean;
import com.bytedance.ug.sdk.share.api.p916c.AbstractC20808c;
import com.bytedance.ug.sdk.share.impl.p919c.C20826a;
import com.bytedance.ug.sdk.share.impl.p921e.C20832c;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ug.sdk.share.impl.i.a.a */
public class C20848a {

    /* renamed from: a */
    public AbstractC20808c f51026a;

    /* renamed from: b */
    public TokenInfoBean f51027b;

    /* renamed from: c */
    public WeakReference<Activity> f51028c;

    /* renamed from: d */
    private AbstractC20808c.AbstractC20809a f51029d;

    /* renamed from: a */
    public void mo70331a() {
        Activity activity = this.f51028c.get();
        if (activity != null && !activity.isFinishing()) {
            if (this.f51026a != null && !C20826a.m75837a().mo70296a(this.f51026a)) {
                this.f51026a.mo70090a();
            }
            C20832c.m75870a(this.f51027b);
            C20826a.m75837a().mo70291a(this.f51026a, this.f51027b);
        }
    }

    public C20848a(Activity activity, TokenInfoBean tokenInfoBean, AbstractC20808c cVar) {
        this.f51026a = cVar;
        this.f51027b = tokenInfoBean;
        this.f51028c = new WeakReference<>(activity);
        C208491 r1 = new AbstractC20808c.AbstractC20809a() {
            /* class com.bytedance.ug.sdk.share.impl.p926i.p927a.C20848a.C208491 */
        };
        this.f51029d = r1;
        AbstractC20808c cVar2 = this.f51026a;
        if (cVar2 != null) {
            cVar2.mo70091a(this.f51027b, r1);
        }
    }
}
