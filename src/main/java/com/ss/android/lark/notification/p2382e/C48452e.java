package com.ss.android.lark.notification.p2382e;

import android.content.Context;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.offline.C48545b;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;
import com.ss.android.lark.notification.p2385g.AbstractC48512b;
import com.ss.android.lark.utils.p2908e.C57823a;
import com.ss.lark.android.module.offlinepush.C64266c;

/* renamed from: com.ss.android.lark.notification.e.e */
public class C48452e implements AbstractC48449b {

    /* renamed from: a */
    private C48457f f121928a;

    /* renamed from: b */
    private C48545b f121929b;

    /* renamed from: c */
    private AbstractC48407a.AbstractC48422k f121930c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.notification.e.e$a */
    public static class C48456a {

        /* renamed from: a */
        static C48452e f121934a = new C48452e();
    }

    /* renamed from: b */
    public static C48452e m191122b() {
        return C48456a.f121934a;
    }

    /* renamed from: c */
    public AbstractC48512b mo169519c() {
        return this.f121928a.mo169522a();
    }

    @Override // com.ss.android.lark.notification.p2382e.AbstractC48449b
    /* renamed from: a */
    public void mo169511a() {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.notification.p2382e.C48452e.RunnableC484552 */

            public void run() {
                Context a = C48398a.m190922a().mo169335a();
                C57823a.m224448a(a).mo196173a();
                C64266c.m252725a(a);
            }
        });
    }

    private C48452e() {
        this.f121928a = new C48457f();
        this.f121929b = new C48545b();
        AbstractC48407a.AbstractC48422k h = C48398a.m190922a().mo169345h();
        this.f121930c = h;
        h.mo169391a(new AbstractC48407a.AbstractC48422k.AbstractC48423a() {
            /* class com.ss.android.lark.notification.p2382e.C48452e.C484531 */

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48422k.AbstractC48423a
            /* renamed from: a */
            public void mo169393a(String str) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.notification.p2382e.C48452e.C484531.RunnableC484541 */

                    public void run() {
                        C48452e.this.mo169511a();
                    }
                });
            }
        });
    }

    @Override // com.ss.android.lark.notification.p2382e.AbstractC48449b
    /* renamed from: a */
    public void mo169512a(Notice notice) {
        this.f121928a.mo169523a(notice);
    }
}
