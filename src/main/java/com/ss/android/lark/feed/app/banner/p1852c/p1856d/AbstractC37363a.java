package com.ss.android.lark.feed.app.banner.p1852c.p1856d;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.interfaces.AbstractC38086aa;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.app.banner.c.d.a */
public abstract class AbstractC37363a {

    /* renamed from: a */
    private AbstractC38086aa f95889a;

    /* renamed from: b */
    private final Object f95890b = new Object();

    /* renamed from: a */
    public abstract void mo137199a();

    /* renamed from: e */
    public void mo137218e() {
        mo137199a();
        mo137216c();
    }

    /* renamed from: c */
    public void mo137216c() {
        if (this.f95889a != null) {
            synchronized (this.f95890b) {
                AbstractC38086aa aaVar = this.f95889a;
                if (aaVar != null) {
                    C37262a.m146726a().mo139200s().mo139321b(aaVar);
                    this.f95889a = null;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo137215b() {
        if (this.f95889a == null && C37262a.m146726a().mo139155B().mo139210c()) {
            AbstractC38037a.AbstractC38064x s = C37262a.m146726a().mo139200s();
            C373641 r1 = new AbstractC38086aa() {
                /* class com.ss.android.lark.feed.app.banner.p1852c.p1856d.AbstractC37363a.C373641 */

                @Override // com.ss.android.lark.feed.interfaces.AbstractC38086aa
                /* renamed from: a */
                public void mo137219a(List<TenantInfo> list, List<TenantInfo.PendingUser> list2) {
                    AbstractC37363a.this.mo137217d();
                }
            };
            this.f95889a = r1;
            s.mo139316a(r1);
        }
    }

    /* renamed from: d */
    public void mo137217d() {
        if (C37262a.m146726a().mo139155B().mo139210c()) {
            CoreThreadPool.getNonblockingHandler().postDelayed(new Runnable() {
                /* class com.ss.android.lark.feed.app.banner.p1852c.p1856d.AbstractC37363a.RunnableC373652 */

                public void run() {
                    try {
                        if (!C37262a.m146726a().mo139155B().mo139210c()) {
                            AbstractC37363a.this.mo137218e();
                        }
                    } catch (Exception e) {
                        Log.m165386e("TenantChangedListener", e);
                    }
                }
            }, 660);
        } else {
            mo137218e();
        }
    }
}
