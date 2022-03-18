package com.bytedance.ee.bear.contract;

import android.app.Application;
import com.bytedance.ee.bear.contract.BinderListDataChangeCallback;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.contract.offline.OfflineRenameData;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderListDataChangeCallbackImp extends BinderListDataChangeCallback.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private am.AbstractC5112e mListDataChangeCallback;

    @Override // com.bytedance.ee.bear.contract.BinderListDataChangeCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.contract.BinderListDataChangeCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.BinderListDataChangeCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5112e
    public void onFileClose() {
        lazyInit();
        this.mListDataChangeCallback.onFileClose();
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5112e
    public void onFileOpen() {
        lazyInit();
        this.mListDataChangeCallback.onFileOpen();
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mListDataChangeCallback;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderListDataChangeCallbackImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5112e
    public void onDelete(String str) {
        lazyInit();
        this.mListDataChangeCallback.onDelete(str);
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5112e
    public void onRename(List<OfflineRenameData> list) {
        lazyInit();
        this.mListDataChangeCallback.onRename(list);
    }

    public BinderListDataChangeCallbackImp(am.AbstractC5112e eVar, Application application) {
        this.mListDataChangeCallback = eVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5112e
    public void onPin(String str, boolean z) {
        lazyInit();
        this.mListDataChangeCallback.onPin(str, z);
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5112e
    public void onRename(String str, String str2) {
        lazyInit();
        this.mListDataChangeCallback.onRename(str, str2);
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5112e
    public void onStar(String str, boolean z) {
        lazyInit();
        this.mListDataChangeCallback.onStar(str, z);
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5112e
    public void onSubscribe(String str, boolean z) {
        lazyInit();
        this.mListDataChangeCallback.onSubscribe(str, z);
    }
}
