package com.ss.android.lark.notification.setting.impl.zen;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.dto.C48444c;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;
import com.ss.android.lark.notification.setting.impl.zen.C48675a;
import com.ss.android.lark.notification.setting.p2388a.p2389a.AbstractC48569d;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.notification.setting.impl.zen.c */
public class C48682c extends BaseModel implements C48675a.AbstractC48676a {

    /* renamed from: a */
    public final AbstractC48407a.AbstractC48427o f122405a = C48398a.m190922a().mo169341d();

    /* renamed from: b */
    public C48675a.AbstractC48676a.AbstractC48677a f122406b;

    /* renamed from: c */
    private final ScheduledExecutorService f122407c = CoreThreadPool.getDefault().getScheduleThreadPool();

    /* renamed from: d */
    private ScheduledFuture<?> f122408d;

    /* renamed from: e */
    private final AbstractC48569d f122409e = new AbstractC48569d() {
        /* class com.ss.android.lark.notification.setting.impl.zen.C48682c.C486831 */

        @Override // com.ss.android.lark.notification.setting.p2388a.p2389a.AbstractC48569d
        /* renamed from: a */
        public void mo169650a(C48444c cVar) {
            Log.m165389i("ZenSettingModel", "push do not disturb setting :" + cVar.toString());
            if (C48682c.this.f122406b != null) {
                C48682c.this.f122406b.mo169895a(cVar);
            }
        }
    };

    @Override // com.ss.android.lark.notification.setting.impl.zen.C48675a.AbstractC48676a
    /* renamed from: a */
    public C48444c mo169888a() {
        return this.f122405a.mo169426g();
    }

    @Override // com.ss.android.lark.notification.setting.impl.zen.C48675a.AbstractC48676a
    /* renamed from: b */
    public boolean mo169892b() {
        return this.f122405a.mo169427h();
    }

    @Override // com.ss.android.lark.notification.setting.impl.zen.C48675a.AbstractC48676a
    /* renamed from: c */
    public boolean mo169893c() {
        return this.f122405a.mo169428i();
    }

    @Override // com.ss.android.lark.notification.setting.impl.zen.C48675a.AbstractC48676a
    /* renamed from: d */
    public void mo169894d() {
        AbstractC48569d dVar = this.f122409e;
        if (dVar != null) {
            this.f122405a.mo169416b(dVar);
        }
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        ScheduledFuture<?> scheduledFuture = this.f122408d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        super.destroy();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f122405a.mo169407a(this.f122409e);
        this.f122408d = this.f122407c.scheduleWithFixedDelay(new RunnableC48684a(), 0, 60, TimeUnit.SECONDS);
    }

    /* renamed from: com.ss.android.lark.notification.setting.impl.zen.c$a */
    private class RunnableC48684a implements Runnable {
        public void run() {
            C48444c g = C48682c.this.f122405a.mo169426g();
            if (g != null) {
                Log.m165389i("ZenSettingModel", "sync do not disturb setting :" + g.toString());
                if (C48682c.this.f122406b != null) {
                    C48682c.this.f122406b.mo169895a(g);
                }
            }
        }

        private RunnableC48684a() {
        }
    }

    @Override // com.ss.android.lark.notification.setting.impl.zen.C48675a.AbstractC48676a
    /* renamed from: a */
    public void mo169891a(C48675a.AbstractC48676a.AbstractC48677a aVar) {
        this.f122406b = aVar;
    }

    @Override // com.ss.android.lark.notification.setting.impl.zen.C48675a.AbstractC48676a
    /* renamed from: a */
    public void mo169890a(IGetDataCallback<Boolean> iGetDataCallback) {
        mo169889a(-TimeUnit.HOURS.toMillis(1), iGetDataCallback);
    }

    @Override // com.ss.android.lark.notification.setting.impl.zen.C48675a.AbstractC48676a
    /* renamed from: a */
    public void mo169889a(long j, IGetDataCallback<Boolean> iGetDataCallback) {
        this.f122405a.mo169401a(j, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }
}
