package com.ss.android.lark.browser.biz.basic.jsapi.device;

import android.content.Context;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.biz.basic.jsapi.device.p1417b.C29700b;

/* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.device.a */
public class C29682a implements C29700b.AbstractC29701a {

    /* renamed from: b */
    private static C29682a f74369b;

    /* renamed from: a */
    public AbstractC25832c f74370a;

    /* renamed from: c */
    private C29700b f74371c;

    /* renamed from: a */
    public void mo106992a() {
        this.f74371c.mo107017a();
    }

    /* renamed from: b */
    public void mo106994b() {
        this.f74370a = null;
        f74369b = null;
        this.f74371c.mo107018b();
    }

    /* renamed from: a */
    public static C29682a m109837a(AbstractC25832c cVar) {
        if (f74369b == null) {
            f74369b = new C29682a(C29638a.m109622a().getContext(), cVar);
        }
        return f74369b;
    }

    private C29682a(Context context, AbstractC25832c cVar) {
        this.f74371c = new C29700b(this, context);
        this.f74370a = cVar;
    }

    @Override // com.ss.android.lark.browser.biz.basic.jsapi.device.p1417b.C29700b.AbstractC29701a
    /* renamed from: a */
    public void mo106993a(String str, long j) {
        if (this.f74370a != null) {
            UICallbackExecutor.post(new Runnable() {
                /* class com.ss.android.lark.browser.biz.basic.jsapi.device.C29682a.RunnableC296831 */

                public void run() {
                    C29682a.this.f74370a.mo91902a("{}");
                }
            });
        }
    }
}
