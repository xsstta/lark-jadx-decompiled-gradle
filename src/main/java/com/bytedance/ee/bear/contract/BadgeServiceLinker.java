package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class BadgeServiceLinker implements IInterface, AbstractC10957d {
    private AbstractC5124d mBadgeServiceImp;
    private BinderBadgeService mBinderBadgeService;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderBadgeService.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mBadgeServiceImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mBadgeServiceImp.init(application);
    }

    public BadgeServiceLinker(AbstractC5124d dVar, Application application) {
        this.mBadgeServiceImp = dVar;
        this.mBinderBadgeService = new BinderBadgeServiceImp(this.mBadgeServiceImp, application);
    }
}
