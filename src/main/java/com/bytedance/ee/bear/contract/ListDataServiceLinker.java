package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class ListDataServiceLinker implements IInterface, AbstractC10957d {
    private BinderListDataService mBinderListDataService;
    private AbstractC5214r mListDataServiceImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderListDataService.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mListDataServiceImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mListDataServiceImp.init(application);
    }

    public ListDataServiceLinker(AbstractC5214r rVar, Application application) {
        this.mListDataServiceImp = rVar;
        this.mBinderListDataService = new BinderListDataServiceImp(this.mListDataServiceImp, application);
    }
}
