package com.bytedance.ee.bear.todocenter.push;

import android.app.Application;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.bear.todocenter.push.BinderTodoRNService;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderTodoRNServiceImp extends BinderTodoRNService.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC11711d mTodoRNService;

    @Override // com.bytedance.ee.bear.todocenter.push.BinderTodoRNService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.todocenter.push.BinderTodoRNService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.todocenter.push.BinderTodoRNService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    @Override // com.bytedance.ee.bear.todocenter.push.AbstractC11711d
    public void unregisterTodoPushListener() {
        lazyInit();
        this.mTodoRNService.unregisterTodoPushListener();
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mTodoRNService;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderTodoRNServiceImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.todocenter.push.AbstractC11711d
    public void registerTodoPushListener(int i) {
        lazyInit();
        this.mTodoRNService.registerTodoPushListener(i);
    }

    public BinderTodoRNServiceImp(AbstractC11711d dVar, Application application) {
        this.mTodoRNService = dVar;
        this.mApplication = application;
    }
}
