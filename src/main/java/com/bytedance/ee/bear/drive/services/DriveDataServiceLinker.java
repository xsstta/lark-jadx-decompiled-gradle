package com.bytedance.ee.bear.drive.services;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class DriveDataServiceLinker implements IInterface, AbstractC10957d {
    private BinderDriveDataService mBinderDriveDataService;
    private AbstractC7173a mDriveDataServiceImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderDriveDataService.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mDriveDataServiceImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mDriveDataServiceImp.init(application);
    }

    public DriveDataServiceLinker(AbstractC7173a aVar, Application application) {
        this.mDriveDataServiceImp = aVar;
        this.mBinderDriveDataService = new BinderDriveDataServiceImp(this.mDriveDataServiceImp, application);
    }
}
