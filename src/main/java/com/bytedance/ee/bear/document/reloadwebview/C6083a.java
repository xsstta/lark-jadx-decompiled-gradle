package com.bytedance.ee.bear.document.reloadwebview;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.doc.C5130a;
import com.bytedance.ee.bear.doc.resupdate.AbstractC5469i;
import com.bytedance.ee.bear.doc.resupdate.ResUpdateListener;
import com.bytedance.ee.bear.document.offline.sync.sync.C6027a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.p718t.C13748k;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.reloadwebview.a */
public class C6083a {

    /* renamed from: b */
    public static int f16961b;

    /* renamed from: c */
    public static int f16962c;

    /* renamed from: a */
    protected C10917c f16963a;

    /* renamed from: d */
    private boolean f16964d;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.reloadwebview.a$a */
    public static class C6085a {

        /* renamed from: a */
        static C6083a f16965a = new C6083a();
    }

    /* renamed from: a */
    public static C6083a m24591a() {
        return C6085a.f16965a;
    }

    private C6083a() {
        m24597c();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m24600d() {
        C5102ai.m20872j().mo20215g().mo5925a(new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.reloadwebview.$$Lambda$a$MA0QZkScxN9elvU2ooYit56m_A */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C6083a.this.m24598c((C6083a) ((Boolean) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m24603e() {
        ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20182a(true).mo238001b($$Lambda$a$GXVnWp65Ou6OM5Rp3BuLQj2WEHM.INSTANCE, $$Lambda$a$O6V_GyzmI8YoFiqpSPUekR3IfaI.INSTANCE);
    }

    /* renamed from: c */
    private void m24597c() {
        this.f16963a = new C10917c(new C10929e());
        ((AbstractC5469i) KoinJavaComponent.m268610a(AbstractC5469i.class)).mo21874a("DOC_CHANNEL", new ResUpdateListener() {
            /* class com.bytedance.ee.bear.document.reloadwebview.$$Lambda$a$yP9rQPoD1vrlBvAx9KAYhjyfhqU */

            @Override // com.bytedance.ee.bear.doc.resupdate.ResUpdateListener
            public final void onResourceUpdate(String str) {
                C6083a.this.m24593a((C6083a) str);
            }
        });
        C13748k.m55732a(new Runnable() {
            /* class com.bytedance.ee.bear.document.reloadwebview.$$Lambda$a$xWyIVN4lIPLPc7YS_pZwPYZJgQ */

            public final void run() {
                C6083a.this.m24600d();
            }
        });
    }

    /* renamed from: b */
    public void mo24582b() {
        if (f16962c == 0) {
            ((AbstractC5469i) KoinJavaComponent.m268610a(AbstractC5469i.class)).mo21875b("DOC_CHANNEL");
            if (this.f16964d && !C6027a.m24403a().mo24365i()) {
                C13479a.m54764b("ReloadManager", "checkReload reload: ");
                this.f16964d = false;
                ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20182a(true).mo238001b($$Lambda$a$dQLVut8Yr2tglYqyfDN58Cy3s.INSTANCE, $$Lambda$a$t9JaGMN0i60XaMe7k14H6OTVM4.INSTANCE);
            } else if (f16961b > 100) {
                C13479a.m54764b("ReloadManager", "onDetachFromHost sOpenNum: " + f16961b + "    sReferenceCount: " + f16962c + "    MAX_NUM: " + 100);
                f16961b = 0;
                ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20182a(false).mo238001b($$Lambda$a$ajM5jF6Cds5VYmKU57VhltERnfM.INSTANCE, $$Lambda$a$cJ36md16wsSGTjJR5hChNEJF90.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m24594a(Throwable th) throws Exception {
        C13479a.m54761a("ReloadManager", th);
        C13606d.m55245a("ReloadManager", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m24596b(Throwable th) throws Exception {
        C13479a.m54761a("ReloadManager", th);
        C13606d.m55245a("ReloadManager", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m24599c(Throwable th) throws Exception {
        C13479a.m54761a("ReloadManager", th);
        C13606d.m55245a("ReloadManager", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m24602d(Throwable th) throws Exception {
        C13479a.m54761a("ReloadManager", th);
        C13606d.m55245a("ReloadManager", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m24592a(Boolean bool) throws Exception {
        C13479a.m54764b("ReloadManager", "***reportPreloadHtml*** preloadTemplate：ReloadManager MAX_NUM result = " + bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m24595b(Boolean bool) throws Exception {
        C13479a.m54764b("ReloadManager", "***reportPreloadHtml*** preloadTemplate：ReloadManager checkReload result = " + bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m24601d(Boolean bool) throws Exception {
        C13479a.m54764b("ReloadManager", "***reportPreloadHtml*** preloadTemplate：ReloadManager AppVisibleService result = " + bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m24604e(Boolean bool) throws Exception {
        C13479a.m54764b("ReloadManager", "***reportPreloadHtml*** preloadTemplate：resupdate result = " + bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24593a(String str) {
        C13479a.m54764b("ReloadManager", "lastVersion = " + str + ", currentVersion = " + C5130a.m20992a());
        if (!TextUtils.equals(C5130a.m20992a(), str)) {
            boolean d = C5102ai.m20872j().mo20212d();
            C13479a.m54764b("ReloadManager", "init appIsVisible: " + d + "   sReferenceCount: " + f16962c);
            if (!d || f16962c != 0 || C6027a.m24403a().mo24365i()) {
                this.f16964d = true;
            } else {
                C13748k.m55732a($$Lambda$a$6ZHkp9kzmKY_BBwgBCRzNnHAmo.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m24598c(Boolean bool) {
        if (bool == Boolean.TRUE && this.f16964d && f16962c == 0) {
            C13479a.m54764b("ReloadManager", "AppVisibleService reload: ");
            this.f16964d = false;
            ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20182a(true).mo238001b($$Lambda$a$VOZSKZrtrX9J14GcOjdBTZyvxLY.INSTANCE, $$Lambda$a$l0Twyv4ugfRGW68LQJ44LAWg9c.INSTANCE);
        }
    }
}
