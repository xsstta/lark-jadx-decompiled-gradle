package com.tt.miniapp.p3323q;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.data.C67485a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.tt.miniapp.q.g */
public class HandlerC66687g extends Handler {

    /* renamed from: a */
    public List<AbstractC66676a> f168344a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private Runnable f168345b;

    /* renamed from: c */
    private IAppContext f168346c;

    /* renamed from: a */
    public void mo232436a() {
        post(this.f168345b);
    }

    /* renamed from: b */
    public void mo232438b() {
        try {
            AppBrandLogger.m52828d("tma_MonitorHandler", "cancelDownload ", toString());
            removeCallbacks(this.f168345b);
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_MonitorHandler", e.getStackTrace());
        }
    }

    /* renamed from: a */
    public static long m260441a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234280a().f170181h.f166544a;
    }

    /* renamed from: a */
    public void mo232437a(AbstractC66676a aVar) {
        this.f168344a.add(aVar);
    }

    /* renamed from: a */
    public static void m260442a(long j, IAppContext iAppContext) {
        C67485a.m262488a(iAppContext).mo234280a().f170181h.f166544a = j;
    }

    public HandlerC66687g(Looper looper, final IAppContext iAppContext) {
        super(looper);
        this.f168346c = iAppContext;
        this.f168345b = new Runnable() {
            /* class com.tt.miniapp.p3323q.HandlerC66687g.RunnableC666881 */

            public void run() {
                if (!iAppContext.isDestroyed()) {
                    long j = C67485a.m262488a(iAppContext).mo234280a().f170181h.f166544a;
                    ArrayList arrayList = new ArrayList(HandlerC66687g.this.f168344a);
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((AbstractC66676a) arrayList.get(i)).mo232428a();
                    }
                    HandlerC66687g.this.postDelayed(this, j);
                }
            }
        };
        this.f168344a.add(new C66677b(iAppContext));
        this.f168344a.add(new C66681e(iAppContext));
        this.f168344a.add(new C66689h(iAppContext));
    }
}
