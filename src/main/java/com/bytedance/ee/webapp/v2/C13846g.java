package com.bytedance.ee.webapp.v2;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.webapp.C13802g;
import com.bytedance.ee.webapp.config.AbstractC13780f;
import com.bytedance.ee.webapp.config.C13772c;
import com.bytedance.ee.webapp.p723d.C13790a;
import com.bytedance.ee.webapp.p724e.C13792a;
import com.ss.android.lark.openapi.jsapi.AbstractC48760b;
import com.ss.android.lark.openapi.jsapi.AbstractC48762d;

/* renamed from: com.bytedance.ee.webapp.v2.g */
public class C13846g {

    /* renamed from: a */
    private boolean f36193a;

    /* renamed from: b */
    private AbstractC48762d f36194b;

    /* renamed from: c */
    private C13792a f36195c;

    /* renamed from: d */
    private IAppContext f36196d;

    /* renamed from: e */
    private LarkWebView f36197e;

    /* renamed from: f */
    private String f36198f = this.f36197e.getUrl();

    /* renamed from: g */
    private String f36199g;

    /* renamed from: h */
    private AbstractC13780f f36200h;

    /* renamed from: i */
    private C13837e f36201i;

    /* renamed from: c */
    public void mo51074c(String str) {
        this.f36198f = str;
    }

    /* renamed from: d */
    public void mo51075d(String str) {
        this.f36201i.mo51057a(str);
    }

    /* renamed from: a */
    public AbstractC48760b mo51070a(String str) {
        if (C13802g.m55926a().mo50866b().mo50838a("lark.webapp.disable.checkttpermission")) {
            return this.f36194b.mo50752a(this.f36197e.getContext(), null, str, this.f36198f);
        } else if (C13772c.m55813a()) {
            return this.f36195c.mo50828a(this.f36198f, this.f36196d, str);
        } else {
            return this.f36200h.mo50785a(str, this.f36199g);
        }
    }

    /* renamed from: b */
    public boolean mo51073b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!this.f36193a || !C13790a.m55889a(str)) {
            return true;
        }
        Logger.m15173i("WebAppOpenApiManager", "handler is ban in tab mode:" + str);
        return false;
    }

    /* renamed from: a */
    public void mo51071a(String str, String str2) {
        this.f36195c.mo50829a(str, str2);
    }

    /* renamed from: a */
    public boolean mo51072a(int i, int i2, Intent intent) {
        return this.f36201i.mo51059a(i, i2, intent);
    }

    public C13846g(IAppContext iAppContext, AbstractC48762d dVar, C13792a aVar, WebAppContainerDelegate webAppContainerDelegate, boolean z) {
        this.f36194b = dVar;
        this.f36195c = aVar;
        this.f36196d = iAppContext;
        this.f36193a = z;
        this.f36197e = webAppContainerDelegate.mo51003d();
        this.f36200h = webAppContainerDelegate.mo51019q();
        this.f36201i = new C13837e(iAppContext, this.f36197e) {
            /* class com.bytedance.ee.webapp.v2.C13846g.C138471 */

            @Override // com.bytedance.ee.webapp.v2.C13837e
            /* renamed from: c */
            public boolean mo51062c(String str) {
                return C13846g.this.mo51073b(str);
            }

            @Override // com.bytedance.ee.webapp.v2.C13837e
            /* renamed from: d */
            public AbstractC48760b mo51063d(String str) {
                return C13846g.this.mo51070a(str);
            }
        };
        this.f36199g = webAppContainerDelegate.mo51008f();
    }
}
