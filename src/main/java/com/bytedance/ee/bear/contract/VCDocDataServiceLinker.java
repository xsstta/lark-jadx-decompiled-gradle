package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class VCDocDataServiceLinker implements IInterface, AbstractC10957d {
    private BinderVCDocDataService mBinderVCDocDataService;
    private AbstractC5232w mVCDocDataServiceImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderVCDocDataService.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mVCDocDataServiceImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mVCDocDataServiceImp.init(application);
    }

    public VCDocDataServiceLinker(AbstractC5232w wVar, Application application) {
        this.mVCDocDataServiceImp = wVar;
        this.mBinderVCDocDataService = new BinderVCDocDataServiceImp(this.mVCDocDataServiceImp, application);
    }
}
