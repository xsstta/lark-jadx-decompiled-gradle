package com.ss.android.lark.integrator.ccm.config.p2008b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.bear.basesdk.AbstractC4482e;
import com.bytedance.ee.bear.p391g.C7804b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.integrator.ccm.p2006c.C39242e;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.integrator.ccm.config.b.a */
public class C39255a extends AbstractC29186b {
    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return true;
    }

    /* renamed from: a */
    public void mo143133a(String str) {
        C13742g.m55706a(new Runnable(str) {
            /* class com.ss.android.lark.integrator.ccm.config.p2008b.$$Lambda$a$3pi5P7YwVnrXXgZjQWhtxNAtJzs */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                C39255a.m154843b(this.f$0);
            }
        }, 50);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m154843b(String str) {
        boolean a = C39242e.m154771a().mo143097a(str, new HashMap());
        if (a) {
            C13479a.m54764b("DocsAppLinkHandler", "openDocsIfNeeded result= " + a);
        }
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        String a = appLink.mo103435a();
        C13479a.m54764b("DocsAppLinkHandler", "appLink handle url");
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        final String queryParameter = Uri.parse(a).getQueryParameter("url");
        if (TextUtils.isEmpty(queryParameter)) {
            C13479a.m54764b("DocsAppLinkHandler", "DocsAppLinkHandler url is empty");
            return false;
        } else if (C7804b.m31285c()) {
            C13479a.m54764b("DocsAppLinkHandler", "DocsAppLinkHandler docs is init");
            mo143133a(queryParameter);
            return true;
        } else {
            C13479a.m54764b("DocsAppLinkHandler", "DocsAppLinkHandler handle open doc waiting doc init");
            C39242e.m154771a().mo143103b();
            C39242e.m154771a().mo143083a(new AbstractC4482e() {
                /* class com.ss.android.lark.integrator.ccm.config.p2008b.C39255a.C392561 */

                @Override // com.bytedance.ee.bear.basesdk.AbstractC4482e
                public void onInit() {
                    C13479a.m54764b("DocsAppLinkHandler", "DocsAppLinkHandler perform open doc");
                    C39242e.m154771a().mo143105b(this);
                    C39255a.this.mo143133a(queryParameter);
                }
            });
            return true;
        }
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        if (appLink == null || TextUtils.isEmpty(appLink.mo103435a())) {
            C13479a.m54775e("DocsAppLinkHandler", "check params appLink is null");
            return false;
        }
        C13479a.m54772d("DocsAppLinkHandler", "DocsAppLinkHandler can open call from " + Thread.currentThread().getName());
        return !TextUtils.isEmpty(Uri.parse(appLink.mo103435a()).getQueryParameter("url"));
    }
}
