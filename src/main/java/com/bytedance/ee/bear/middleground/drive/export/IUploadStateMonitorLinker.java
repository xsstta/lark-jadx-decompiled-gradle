package com.bytedance.ee.bear.middleground.drive.export;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class IUploadStateMonitorLinker implements IInterface, AbstractC10957d {
    private BinderIUploadStateMonitor mBinderIUploadStateMonitor;
    private AbstractC9360a mIUploadStateMonitorImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderIUploadStateMonitor.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mIUploadStateMonitorImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mIUploadStateMonitorImp.init(application);
    }

    public IUploadStateMonitorLinker(AbstractC9360a aVar, Application application) {
        this.mIUploadStateMonitorImp = aVar;
        this.mBinderIUploadStateMonitor = new BinderIUploadStateMonitorImp(this.mIUploadStateMonitorImp, application);
    }
}
