package com.bytedance.ee.bear.contract.darkmode;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class DarkModeServiceLinker implements IInterface, AbstractC10957d {
    private BinderDarkModeService mBinderDarkModeService;
    private AbstractC5126a mDarkModeServiceImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderDarkModeService.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mDarkModeServiceImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mDarkModeServiceImp.init(application);
    }

    public DarkModeServiceLinker(AbstractC5126a aVar, Application application) {
        this.mDarkModeServiceImp = aVar;
        this.mBinderDarkModeService = new BinderDarkModeServiceImp(this.mDarkModeServiceImp, application);
    }
}
