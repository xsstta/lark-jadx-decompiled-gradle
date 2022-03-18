package com.bytedance.ee.bear.document.at;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.at.AbstractC4241h;
import com.bytedance.ee.bear.at.AbstractC4242i;
import com.bytedance.ee.bear.at.AbstractC4247k;
import com.bytedance.ee.bear.at.C4227b;
import com.bytedance.ee.bear.atfinder.AbstractC4271f;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.bean.C4519b;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.p376e.p377a.AbstractC7588a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.at.d */
public class C5664d {

    /* renamed from: a */
    public static Context f16022a;

    /* renamed from: b */
    public static C10917c f16023b;

    /* renamed from: c */
    private static AbstractC4242i f16024c;

    /* renamed from: d */
    private static AbstractC4242i.AbstractC4244b f16025d;

    /* renamed from: a */
    public static void m22980a() {
        m22983b();
        m22984c();
    }

    /* renamed from: d */
    private static AbstractC4242i.AbstractC4244b m22985d() {
        return new AbstractC4242i.AbstractC4244b() {
            /* class com.bytedance.ee.bear.document.at.C5664d.C56651 */

            @Override // com.bytedance.ee.bear.at.AbstractC4242i.AbstractC4244b
            /* renamed from: a */
            public AbstractC4242i.AbstractC4245c mo16657a() {
                return new AbstractC4242i.AbstractC4245c() {
                    /* class com.bytedance.ee.bear.document.at.C5664d.C56651.C56661 */

                    @Override // com.bytedance.ee.bear.at.AbstractC4242i.AbstractC4245c
                    /* renamed from: a */
                    public String mo16660a(Context context, int i) {
                        return ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31517c(context, i);
                    }
                };
            }

            @Override // com.bytedance.ee.bear.at.AbstractC4242i.AbstractC4244b
            /* renamed from: b */
            public AbstractC4242i.AbstractC4243a mo16659b() {
                return new AbstractC4242i.AbstractC4243a() {
                    /* class com.bytedance.ee.bear.document.at.C5664d.C56651.C56672 */

                    @Override // com.bytedance.ee.bear.at.AbstractC4242i.AbstractC4243a
                    /* renamed from: a */
                    public Drawable mo16661a(Context context, String str, String str2, int i) {
                        return ((AbstractC7588a) KoinJavaComponent.m268610a(AbstractC7588a.class)).mo29852a(context, str, str2, i);
                    }
                };
            }

            @Override // com.bytedance.ee.bear.at.AbstractC4242i.AbstractC4244b
            /* renamed from: a */
            public void mo16658a(FrameLayout frameLayout) {
                ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40646a(frameLayout);
            }
        };
    }

    /* renamed from: e */
    private static AbstractC4242i m22986e() {
        return new AbstractC4242i() {
            /* class com.bytedance.ee.bear.document.at.C5664d.C56682 */

            @Override // com.bytedance.ee.bear.at.AbstractC4242i
            /* renamed from: e */
            public AbstractC4247k mo16666e() {
                return new AbstractC4247k() {
                    /* class com.bytedance.ee.bear.document.at.C5664d.C56682.C56691 */

                    @Override // com.bytedance.ee.bear.at.AbstractC4247k
                    /* renamed from: a */
                    public boolean mo16668a() {
                        C10917c cVar = C5664d.f16023b;
                        AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
                        if (f == null || f.mo19681c()) {
                            return false;
                        }
                        return true;
                    }
                };
            }

            @Override // com.bytedance.ee.bear.at.AbstractC4242i
            /* renamed from: a */
            public boolean mo16662a() {
                return C4211a.m17514a().mo16536a("spacekit.mobile.docs_diy_icon", false);
            }

            @Override // com.bytedance.ee.bear.at.AbstractC4242i
            /* renamed from: b */
            public AbstractC4271f mo16663b() {
                return C5662b.m22968a(C5664d.f16023b, C5664d.f16022a);
            }

            @Override // com.bytedance.ee.bear.at.AbstractC4242i
            /* renamed from: d */
            public AbstractC4241h mo16665d() {
                return new C5661a(C5234y.m21391b());
            }

            @Override // com.bytedance.ee.bear.at.AbstractC4242i
            /* renamed from: c */
            public C4519b mo16664c() {
                C10917c cVar = C5664d.f16023b;
                return new C4519b(C4484g.m18494b().mo17252c(), new C5661a(C5234y.m21391b()));
            }
        };
    }

    /* renamed from: c */
    public static void m22984c() {
        C4227b.m17588a(f16024c);
        C4227b.m17587a(f16025d);
    }

    /* renamed from: b */
    public static void m22983b() {
        if (f16024c == null) {
            synchronized (C5664d.class) {
                if (f16024c == null) {
                    f16024c = m22986e();
                    f16025d = m22985d();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m22981a(Context context) {
        f16022a = context;
    }

    /* renamed from: a */
    public static void m22982a(C10917c cVar) {
        f16023b = cVar;
    }
}
