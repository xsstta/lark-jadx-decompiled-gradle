package com.bytedance.ee.bear.contract.drive.sdk.entity.menu;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class ProxyDownloadUpdaterLinker implements IInterface, AbstractC10957d {
    private BinderProxyDownloadUpdater mBinderProxyDownloadUpdater;
    private AbstractC5146c mProxyDownloadUpdaterImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderProxyDownloadUpdater.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mProxyDownloadUpdaterImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mProxyDownloadUpdaterImp.init(application);
    }

    public ProxyDownloadUpdaterLinker(AbstractC5146c cVar, Application application) {
        this.mProxyDownloadUpdaterImp = cVar;
        this.mBinderProxyDownloadUpdater = new BinderProxyDownloadUpdaterImp(this.mProxyDownloadUpdaterImp, application);
    }
}
