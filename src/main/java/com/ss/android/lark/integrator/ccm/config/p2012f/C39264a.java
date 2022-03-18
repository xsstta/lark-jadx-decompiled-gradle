package com.ss.android.lark.integrator.ccm.config.p2012f;

import android.content.Context;
import com.bytedance.ee.bear.doc.resupdate.C5472l;
import com.bytedance.ee.bear.doc.resupdate.ResourceCallback;
import com.bytedance.ee.bear.thread.C11678b;
import com.ss.android.lark.log.Log;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;

/* renamed from: com.ss.android.lark.integrator.ccm.config.f.a */
public class C39264a {
    /* renamed from: c */
    public static synchronized void m154874c(Context context) {
        synchronized (C39264a.class) {
            C5472l.m22202b().mo21895b(context);
        }
    }

    /* renamed from: a */
    public static void m154868a(final Context context) {
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48477a()).mo238020d(new Function<String, String>() {
            /* class com.ss.android.lark.integrator.ccm.config.p2012f.C39264a.C392651 */

            /* renamed from: a */
            public String apply(String str) throws Exception {
                C5472l.m22202b().mo21886a(context);
                C39264a.m154874c(context);
                C5472l.m22202b().mo21887a(new ResourceCallback() {
                    /* class com.ss.android.lark.integrator.ccm.config.p2012f.C39264a.C392651.C392661 */

                    @Override // com.bytedance.ee.bear.doc.resupdate.ResourceCallback
                    /* renamed from: a */
                    public void mo21850a() {
                        Log.m165389i("DocResourceDownload", "downloadFullResource onReady(): ");
                    }

                    @Override // com.bytedance.ee.bear.doc.resupdate.ResourceCallback
                    /* renamed from: b */
                    public void mo21852b() {
                        Log.m165389i("DocResourceDownload", "downloadFullResource onFail(): ");
                    }
                });
                return "";
            }
        }).mo238001b($$Lambda$a$SKpEQNl3zOSs9rocUPQYpHjFjE0.INSTANCE, $$Lambda$a$YAsT99FTdb92ISPVsDwPVLaNk8.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m154869a(Boolean bool) throws Exception {
        Log.m165389i("DocResourceDownload", "accept(): asyncCheckResource " + bool);
    }

    /* renamed from: b */
    public static void m154872b(Context context) {
        AbstractC68307f.m265083a((Object) false).mo237985a(C11678b.m48477a()).mo238020d(new Function(context) {
            /* class com.ss.android.lark.integrator.ccm.config.p2012f.$$Lambda$a$SY_P91I0lyRL4weEd3aR7o1qPE */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C39264a.m154867a(this.f$0, (Boolean) obj);
            }
        }).mo238001b($$Lambda$a$qQIh3g8UkgzkLGwMazjsfj2igQk.INSTANCE, $$Lambda$a$k0Rnc4AxgdWdMCOmiXzHS3tZh0.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m154867a(Context context, Boolean bool) throws Exception {
        C5472l.m22202b().mo21886a(context);
        m154874c(context);
        return true;
    }
}
