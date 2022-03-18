package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class ListDataChangeCallbackLinker implements IInterface, AbstractC10957d {
    private BinderListDataChangeCallback mBinderListDataChangeCallback;
    private AbstractC5213q mListDataChangeCallbackImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderListDataChangeCallback.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mListDataChangeCallbackImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mListDataChangeCallbackImp.init(application);
    }

    public ListDataChangeCallbackLinker(AbstractC5213q qVar, Application application) {
        this.mListDataChangeCallbackImp = qVar;
        this.mBinderListDataChangeCallback = new BinderListDataChangeCallbackImp(this.mListDataChangeCallbackImp, application);
    }
}
