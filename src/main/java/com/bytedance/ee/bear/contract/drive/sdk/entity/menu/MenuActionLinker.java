package com.bytedance.ee.bear.contract.drive.sdk.entity.menu;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class MenuActionLinker implements IInterface, AbstractC10957d {
    private BinderMenuAction mBinderMenuAction;
    private AbstractC5144a mMenuActionImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderMenuAction.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mMenuActionImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mMenuActionImp.init(application);
    }

    public MenuActionLinker(AbstractC5144a aVar, Application application) {
        this.mMenuActionImp = aVar;
        this.mBinderMenuAction = new BinderMenuActionImp(this.mMenuActionImp, application);
    }
}
