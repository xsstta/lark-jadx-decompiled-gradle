package com.bytedance.ee.bear.drive.services;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class IDriveOpenMonitorLinker implements IInterface, AbstractC10957d {
    private BinderIDriveOpenMonitor mBinderIDriveOpenMonitor;
    private AbstractC7177e mIDriveOpenMonitorImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderIDriveOpenMonitor.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mIDriveOpenMonitorImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mIDriveOpenMonitorImp.init(application);
    }

    public IDriveOpenMonitorLinker(AbstractC7177e eVar, Application application) {
        this.mIDriveOpenMonitorImp = eVar;
        this.mBinderIDriveOpenMonitor = new BinderIDriveOpenMonitorImp(this.mIDriveOpenMonitorImp, application);
    }
}
