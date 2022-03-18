package com.ss.android.lark.apihandler.basic.jsapi.device;

import android.content.Context;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.apihandler.basic.jsapi.device.p1353b.C28767b;

/* renamed from: com.ss.android.lark.apihandler.basic.jsapi.device.a */
public class C28749a implements C28767b.AbstractC28768a {

    /* renamed from: b */
    private static C28749a f72301b;

    /* renamed from: a */
    public AbstractC25832c f72302a;

    /* renamed from: c */
    private C28767b f72303c;

    /* renamed from: a */
    public void mo102239a() {
        this.f72303c.mo102264a();
    }

    /* renamed from: b */
    public void mo102241b() {
        this.f72302a = null;
        f72301b = null;
        this.f72303c.mo102265b();
    }

    private C28749a(Context context, AbstractC25832c cVar) {
        this.f72303c = new C28767b(this, context);
        this.f72302a = cVar;
    }

    /* renamed from: a */
    public static C28749a m105400a(Context context, AbstractC25832c cVar) {
        if (f72301b == null) {
            f72301b = new C28749a(context, cVar);
        }
        return f72301b;
    }

    @Override // com.ss.android.lark.apihandler.basic.jsapi.device.p1353b.C28767b.AbstractC28768a
    /* renamed from: a */
    public void mo102240a(String str, long j) {
        if (this.f72302a != null) {
            UICallbackExecutor.post(new Runnable() {
                /* class com.ss.android.lark.apihandler.basic.jsapi.device.C28749a.RunnableC287501 */

                public void run() {
                    C28749a.this.f72302a.mo91902a("{}");
                }
            });
        }
    }
}
