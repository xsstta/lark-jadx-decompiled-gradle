package com.bytedance.ee.bear.basesdk;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.document.p310g.C5807a;
import com.bytedance.ee.bear.document.p310g.C5809c;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p699b.C13595b;
import com.bytedance.ee.util.p718t.C13742g;
import java.util.HashSet;
import java.util.Set;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.basesdk.h */
public class C4487h {

    /* renamed from: a */
    private static final Set<String> f13155a = new HashSet();

    /* renamed from: b */
    private static C10917c f13156b;

    /* renamed from: a */
    private static void m18499a() {
        C13479a.m54764b("WebViewLifecycleCompatForMainProc", "doDestroy");
        C13742g.m55711d($$Lambda$h$XphxsLDEDajTAp9P0n76jAcQsqw.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m18503b() {
        ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20191b();
    }

    /* renamed from: a */
    private static void m18500a(Context context) {
        C13479a.m54764b("WebViewLifecycleCompatForMainProc", "doInit");
        Context applicationContext = context.getApplicationContext();
        if (f13156b == null) {
            f13156b = new C10917c(new C10929e());
        }
        C13742g.m55711d(new Runnable(applicationContext) {
            /* class com.bytedance.ee.bear.basesdk.$$Lambda$h$gMiWid2R_TZhDTlKEp2ZGsfNKg */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                C4487h.m18504b(this.f$0);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m18504b(Context context) {
        if (context instanceof Application) {
            new C5809c((Application) context).mo23365a(new C5807a(f13156b)).mo23366a();
        } else {
            C13479a.m54758a("WebViewLifecycleCompatForMainProc", "context is not instanceof Application, do not init editor and rn !!!");
        }
    }

    /* renamed from: a */
    public static void m18502a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("destroy() tag = ");
        sb.append(str);
        sb.append(", p0 merge = ");
        sb.append(C13595b.m55176a());
        sb.append(", bizSetUsingWebView = ");
        Set<String> set = f13155a;
        sb.append(set);
        C13479a.m54764b("WebViewLifecycleCompatForMainProc", sb.toString());
        if (!C13595b.m55176a() && !TextUtils.isEmpty(str)) {
            set.remove(str);
            if (set.isEmpty()) {
                m18499a();
            }
        }
    }

    /* renamed from: a */
    public static void m18501a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("ensureInit() tag = ");
        sb.append(str);
        sb.append(", p0 merge = ");
        sb.append(C13595b.m55176a());
        sb.append(", bizSetUsingWebView = ");
        Set<String> set = f13155a;
        sb.append(set);
        C13479a.m54764b("WebViewLifecycleCompatForMainProc", sb.toString());
        if (!C13595b.m55176a() && !TextUtils.isEmpty(str)) {
            if (set.isEmpty()) {
                m18500a(context);
            }
            set.add(str);
        }
    }
}
