package com.bytedance.ee.bear.contract.leanmode;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class LeanModeServiceLinker implements IInterface, AbstractC10957d {
    private BinderLeanModeService mBinderLeanModeService;
    private AbstractC5196a mLeanModeServiceImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderLeanModeService.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mLeanModeServiceImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mLeanModeServiceImp.init(application);
    }

    public LeanModeServiceLinker(AbstractC5196a aVar, Application application) {
        this.mLeanModeServiceImp = aVar;
        this.mBinderLeanModeService = new BinderLeanModeServiceImp(this.mLeanModeServiceImp, application);
    }
}
