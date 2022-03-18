package com.bytedance.ee.bear.drive.services;

import android.app.Application;
import com.bytedance.ee.bear.drive.services.AbstractC7197n;
import com.bytedance.ee.bear.drive.services.BinderIPluginUpdateCallback;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderIPluginUpdateCallbackImp extends BinderIPluginUpdateCallback.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC7197n.AbstractC7198a mIPluginUpdateCallback;

    @Override // com.bytedance.ee.bear.drive.services.BinderIPluginUpdateCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.drive.services.BinderIPluginUpdateCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.drive.services.BinderIPluginUpdateCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7197n.AbstractC7198a
    public void onStart() {
        lazyInit();
        this.mIPluginUpdateCallback.onStart();
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7197n.AbstractC7198a
    public void onSuccess() {
        lazyInit();
        this.mIPluginUpdateCallback.onSuccess();
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mIPluginUpdateCallback;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderIPluginUpdateCallbackImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7197n.AbstractC7198a
    public void onProgressUpdate(int i) {
        lazyInit();
        this.mIPluginUpdateCallback.onProgressUpdate(i);
    }

    public BinderIPluginUpdateCallbackImp(AbstractC7197n.AbstractC7198a aVar, Application application) {
        this.mIPluginUpdateCallback = aVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7197n.AbstractC7198a
    public void onFailed(int i, String str) {
        lazyInit();
        this.mIPluginUpdateCallback.onFailed(i, str);
    }
}
