package com.bytedance.ee.bear.banner.p247b;

import android.view.View;
import com.bytedance.ee.bear.banner.AbstractC4339e;
import com.bytedance.ee.bear.banner.p247b.C4320b;
import com.bytedance.ee.bear.banner.p248c.AbstractC4336b;
import com.bytedance.ee.bear.banner.p248c.AbstractC4337c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.ss.android.lark.banner.export.broadcast.C29481a;
import java.util.List;
import org.koin.core.p3520e.C70042b;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.banner.b.b */
public class C4320b extends C4319a {
    @Override // com.bytedance.ee.bear.banner.p247b.C4319a, com.ss.android.lark.banner.export.AbstractC29483d
    /* renamed from: a */
    public boolean mo16930a(final View view, String str) {
        List<AbstractC4336b> e = ((AbstractC4339e) KoinJavaComponent.m268611a(AbstractC4339e.class, C70042b.m268676a("space"))).mo16921e();
        if (e != null && e.size() > 0) {
            for (AbstractC4336b bVar : e) {
                C13479a.m54764b(this.f12924a, "beginGuide...");
                bVar.beginGuide(new AbstractC4337c() {
                    /* class com.bytedance.ee.bear.banner.p247b.C4320b.C43211 */

                    @Override // com.bytedance.ee.bear.banner.p248c.AbstractC4337c
                    /* renamed from: a */
                    public void mo16912a() {
                        C13479a.m54764b(C4320b.this.f12924a, "finish guide ...");
                        C13742g.m55706a(new Runnable(view) {
                            /* class com.bytedance.ee.bear.banner.p247b.$$Lambda$b$1$VSgT1oczDlezsqOhvJL1gWtNwXY */
                            public final /* synthetic */ View f$0;

                            {
                                this.f$0 = r1;
                            }

                            public final void run() {
                                C4320b.C43211.m17855a(this.f$0);
                            }
                        }, 1000);
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public static /* synthetic */ void m17855a(View view) {
                        C29481a.m108561a(view.getContext(), "NewUserNavigation");
                    }
                });
            }
        }
        return super.mo16930a(view, str);
    }
}
