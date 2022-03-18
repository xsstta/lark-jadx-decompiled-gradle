package com.bytedance.ee.bear.document.rendergone;

import android.app.KeyguardManager;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.contract.AbstractC5238z;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.document.reloadwebview.C6083a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.p701d.C13613a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.lynx.webview.internal.C20011y;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.rendergone.a */
public class C6087a {

    /* renamed from: a */
    private static C10917c f16967a = new C10917c(new C10929e());

    /* renamed from: b */
    private static boolean f16968b = false;

    /* renamed from: c */
    private static boolean f16969c = false;

    /* renamed from: d */
    private static boolean f16970d = false;

    /* renamed from: a */
    public static boolean m24612a() {
        return f16968b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m24608a(Throwable th) throws Exception {
        C13479a.m54761a("RenderGoneHelper", th);
        C13606d.m55245a("RenderGoneHelper", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m24607a(Boolean bool) throws Exception {
        C13479a.m54764b("RenderGoneHelper", "***reportPreloadHtml*** preloadTemplate：onRenderProcessGone result = " + bool);
    }

    /* renamed from: a */
    public static void m24609a(boolean z) {
        f16968b = z;
        C13479a.m54764b("RenderGoneHelper", "setkillRenderProcess:" + z);
    }

    /* renamed from: a */
    public static void m24610a(boolean z, int i) {
        f16969c = true;
        m24614c(z, i);
        AbstractC5238z j = C5102ai.m20872j();
        boolean d = j.mo20212d();
        C13479a.m54764b("RenderGoneHelper", "onRenderProcessGone====== appVisible = " + d + ", hasRegisterObserver: " + f16970d);
        if (d) {
            m24613b(z, i);
        } else if (!f16970d) {
            j.mo20208a().mo5925a(new AbstractC1178x(z, i) {
                /* class com.bytedance.ee.bear.document.rendergone.$$Lambda$a$1NBYJPfEabzb_0ZjCrkq6Z4frd8 */
                public final /* synthetic */ boolean f$0;
                public final /* synthetic */ int f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C6087a.m24611a(this.f$0, this.f$1, (Boolean) obj);
                }
            });
            f16970d = true;
        }
    }

    /* renamed from: b */
    private static void m24613b(boolean z, int i) {
        f16969c = false;
        C13479a.m54764b("RenderGoneHelper", "reloadWebView====== didCrash = " + z + ", rendererPriority = " + i);
        try {
            ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20182a(false).mo238001b($$Lambda$a$wSbY2DpVMJsvZtxedFfCrRN8.INSTANCE, $$Lambda$a$ckWwQcmi7PjSKi1dBVF3Ws9LtQ.INSTANCE);
        } catch (Throwable th) {
            C13479a.m54758a("RenderGoneHelper", "reLoadWebView()... e = " + th);
        }
    }

    /* renamed from: c */
    private static void m24614c(boolean z, int i) {
        String str;
        try {
            HashMap hashMap = new HashMap();
            if (z) {
                str = "0";
            } else {
                str = "1";
            }
            hashMap.put("didCrash", str);
            hashMap.put("rendererPriorityAtExit", String.valueOf(i));
            hashMap.put("app_visible", String.valueOf(C5102ai.m20872j().mo20212d()));
            hashMap.put("APP_VISIBLE_1", String.valueOf(C13613a.m55256b().mo50550c()));
            hashMap.put("screen_status", String.valueOf(((KeyguardManager) C13615c.f35773a.getSystemService("keyguard")).inKeyguardRestrictedInputMode()));
            boolean z2 = false;
            hashMap.put("doc_sdk", String.valueOf(false));
            hashMap.put("enable_x5", Boolean.valueOf(C20011y.m73013k()));
            if (C6083a.f16962c != 0) {
                z2 = true;
            }
            hashMap.put("DOCACTIVITY_ACTIVE", Boolean.valueOf(z2));
            C5234y.m21391b().mo21079a("dev_performance_webview_error", hashMap);
        } catch (Throwable th) {
            C13479a.m54758a("RenderGoneHelper", "reportOnRenderProcessGone()... e = " + th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m24611a(boolean z, int i, Boolean bool) {
        C13479a.m54764b("RenderGoneHelper", "app visible change, visible: " + bool + ", needRestartSandbox:" + f16969c);
        if (bool.booleanValue() && f16969c) {
            m24613b(z, i);
        }
    }
}
