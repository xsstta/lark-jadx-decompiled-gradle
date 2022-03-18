package com.bytedance.ee.bear.p391g.p392a;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import com.bytedance.ee.bear.basesdk.C4442b;
import com.bytedance.ee.bear.basesdk.apisupport.AbstractC4430p;
import com.bytedance.ee.bear.basesdk.apisupport.AbstractC4433s;
import com.bytedance.ee.bear.basesdk.p253d.AbstractC4471c;
import com.bytedance.ee.bear.basesdk.p253d.C4466a;
import com.bytedance.ee.bear.basesdk.p253d.C4475f;
import com.bytedance.ee.bear.basesdk.p253d.C4479h;
import com.bytedance.ee.bear.domain.C6312h;
import com.bytedance.ee.bear.leanmode.C8132a;
import com.bytedance.ee.bear.middleground.docsdk.C9307b;
import com.bytedance.ee.bear.p391g.C7804b;
import com.bytedance.ee.bear.p391g.p393b.C7807a;
import com.bytedance.ee.bear.p391g.p393b.C7808c;
import com.bytedance.ee.bear.route.AbstractC10738c;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.AbstractC10928d;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.watermark.dto.WatermarkInfo;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.g.a.d */
public class C7801d implements AbstractC4430p {

    /* renamed from: a */
    private C7800c f21093a = new C7800c();

    @Override // com.bytedance.ee.bear.basesdk.apisupport.AbstractC4430p
    /* renamed from: d */
    public List<ILaunchTask> mo17157d() {
        return null;
    }

    @Override // com.bytedance.ee.bear.basesdk.apisupport.AbstractC4430p
    /* renamed from: c */
    public AbstractC10928d mo17156c() {
        return new C7808c();
    }

    /* renamed from: g */
    private void m31275g() {
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17291a(new AbstractC10740f.AbstractC10741a() {
            /* class com.bytedance.ee.bear.p391g.p392a.C7801d.C78032 */

            @Override // com.bytedance.ee.bear.route.AbstractC10740f.AbstractC10741a
            /* renamed from: a */
            public Map<String, AbstractC10740f.AbstractC10742b> mo30547a() {
                return new C7807a(C13615c.f35773a).mo17005a();
            }

            @Override // com.bytedance.ee.bear.route.AbstractC10740f.AbstractC10741a
            /* renamed from: b */
            public List<AbstractC10738c> mo30548b() {
                return new C7798a(C13615c.f35773a).mo17006a();
            }
        });
    }

    /* renamed from: e */
    private void m31273e() {
        if (C26252ad.m94993b(C13615c.f35773a)) {
            C4479h.m18489b().mo17249a(new C4479h.AbstractC4480a() {
                /* class com.bytedance.ee.bear.p391g.p392a.$$Lambda$d$xHdPtWh1OGFPhxD21yF5TBoi7ns */

                @Override // com.bytedance.ee.bear.basesdk.p253d.C4479h.AbstractC4480a
                public final void onWatermarkChange(WatermarkInfo watermarkInfo) {
                    C7801d.this.m31272b((C7801d) watermarkInfo);
                }
            });
            C4466a.m18475b().mo17235a(new C4466a.AbstractC4468b() {
                /* class com.bytedance.ee.bear.p391g.p392a.$$Lambda$d$8pPHg62Gfnd0zokYNiq7Rju1_jc */

                @Override // com.bytedance.ee.bear.basesdk.p253d.C4466a.AbstractC4468b
                public final void onAppUserConfigChange(C4466a.C4467a aVar) {
                    C7801d.this.m31271b((C7801d) aVar);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.basesdk.apisupport.AbstractC4430p
    /* renamed from: b */
    public void mo17155b() {
        C9307b.m38480a();
        m31269a(C4479h.m18489b().mo17247a());
        m31268a(C4466a.m18475b().mo17234a());
        C8132a.m32450a().mo31329a(new C10917c(new C10929e()));
        C4442b.m18367a(C13615c.f35773a);
    }

    /* renamed from: f */
    private void m31274f() {
        try {
            C13479a.m54764b("SdkInitImpl", "registerComponentCallbacks: DarkMode onConfigurationChanged");
            C13615c.f35773a.registerComponentCallbacks(new ComponentCallbacks() {
                /* class com.bytedance.ee.bear.p391g.p392a.C7801d.ComponentCallbacksC78021 */

                public void onLowMemory() {
                }

                public void onConfigurationChanged(Configuration configuration) {
                    C7804b.m31283a().mo17141h().mo17016a(C13615c.f35773a, configuration);
                }
            });
            if (C26252ad.m94993b(C13615c.f35773a)) {
                AbstractC4471c cVar = (AbstractC4471c) KoinJavaComponent.m268610a(AbstractC4471c.class);
                C13479a.m54764b("SdkInitImpl", "registerDarkModeListener, iDarkModeAgent: " + cVar);
                if (cVar != null) {
                    cVar.mo17239a($$Lambda$d$h0mDuUoJovQq9sMWoohFz14Q_4I.INSTANCE);
                }
            }
        } catch (Throwable th) {
            C13479a.m54761a("SdkInitImpl", th);
        }
    }

    @Override // com.bytedance.ee.bear.basesdk.apisupport.AbstractC4430p
    /* renamed from: a */
    public void mo17153a() {
        m31273e();
        C4475f.m18484a().mo17245a($$Lambda$d$Cdyzfkmr3KCCkywXbmpEhe3p3sg.INSTANCE);
        m31274f();
        m31275g();
    }

    @Override // com.bytedance.ee.bear.basesdk.apisupport.AbstractC4430p
    /* renamed from: a */
    public void mo17154a(AbstractC4433s sVar) {
        this.f21093a.mo17089a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m31267a(int i) {
        C7804b.m31283a().mo17141h().mo17015a(C13615c.f35773a, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m31271b(C4466a.C4467a aVar) {
        if (C7804b.m31285c()) {
            m31268a(aVar);
        }
    }

    /* renamed from: a */
    private void m31269a(WatermarkInfo watermarkInfo) {
        if (watermarkInfo != null) {
            C13479a.m54764b("updateWatermarkInfo", "update watermark info to doc editor");
            C7804b.m31283a().mo17152s().mo17082a(watermarkInfo);
            return;
        }
        C13479a.m54764b("updateWatermarkInfo", "watermark info is null, not update to doc editor");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m31272b(WatermarkInfo watermarkInfo) {
        if (C7804b.m31285c()) {
            m31269a(watermarkInfo);
        }
    }

    /* renamed from: a */
    private void m31268a(C4466a.C4467a aVar) {
        if (C26252ad.m94993b(C13615c.f35773a)) {
            if (aVar != null) {
                C6312h.m25323a().mo25380a(aVar.f13143a);
                C6312h.m25323a().mo25379a(aVar.f13144b);
                return;
            }
            C13479a.m54764b("SdkInitImpl", "updateAppUserConfig, appUserConfig is null. ");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m31270a(Locale locale, Locale locale2) {
        C7804b.m31283a().mo17142i().mo17041a();
    }
}
