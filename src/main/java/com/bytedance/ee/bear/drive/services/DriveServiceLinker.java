package com.bytedance.ee.bear.drive.services;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class DriveServiceLinker implements IInterface, AbstractC10957d {
    private BinderDriveService mBinderDriveService;
    private AbstractC7174b mDriveServiceImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderDriveService.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mDriveServiceImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mDriveServiceImp.init(application);
    }

    public DriveServiceLinker(AbstractC7174b bVar, Application application) {
        this.mDriveServiceImp = bVar;
        this.mBinderDriveService = new BinderDriveServiceImp(this.mDriveServiceImp, application);
    }
}
