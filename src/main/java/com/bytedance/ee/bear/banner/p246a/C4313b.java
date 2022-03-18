package com.bytedance.ee.bear.banner.p246a;

import android.view.View;
import com.bytedance.ee.bear.banner.AbstractC4339e;
import com.bytedance.ee.bear.banner.p248c.AbstractC4336b;
import com.bytedance.ee.bear.banner.p248c.AbstractC4337c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import java.util.List;
import org.koin.core.p3520e.C70042b;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.banner.a.b */
public class C4313b extends C4312a {
    @Override // com.bytedance.ee.bear.banner.p246a.C4312a, com.ss.android.lark.ug.banner.BannerHandler
    /* renamed from: a */
    public boolean mo16911a(View view, String str) {
        final AbstractC4339e eVar = (AbstractC4339e) KoinJavaComponent.m268611a(AbstractC4339e.class, C70042b.m268676a("space"));
        List<AbstractC4336b> e = eVar.mo16921e();
        if (e != null && e.size() > 0) {
            for (AbstractC4336b bVar : e) {
                C13479a.m54764b(this.f12913a, "beginGuide...");
                bVar.beginGuide(new AbstractC4337c() {
                    /* class com.bytedance.ee.bear.banner.p246a.C4313b.C43141 */

                    @Override // com.bytedance.ee.bear.banner.p248c.AbstractC4337c
                    /* renamed from: a */
                    public void mo16912a() {
                        C13479a.m54764b(C4313b.this.f12913a, "finish guide ...");
                        AbstractC4339e eVar = eVar;
                        eVar.getClass();
                        C13742g.m55706a(new Runnable() {
                            /* class com.bytedance.ee.bear.banner.p246a.$$Lambda$mAxhQxfalah0bMO1TCYKwRulvM */

                            public final void run() {
                                AbstractC4339e.this.mo16918b();
                            }
                        }, 1000);
                    }
                });
            }
        }
        return super.mo16911a(view, str);
    }
}
