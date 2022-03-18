package com.bytedance.ee.bear.contract.drive.sdk.entity.menu;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class ProxyDownloadUpdaterContainerLinker implements IInterface, AbstractC10957d {
    private BinderProxyDownloadUpdaterContainer mBinderProxyDownloadUpdaterContainer;
    private AbstractC5147d mProxyDownloadUpdaterContainerImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderProxyDownloadUpdaterContainer.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mProxyDownloadUpdaterContainerImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mProxyDownloadUpdaterContainerImp.init(application);
    }

    public ProxyDownloadUpdaterContainerLinker(AbstractC5147d dVar, Application application) {
        this.mProxyDownloadUpdaterContainerImp = dVar;
        this.mBinderProxyDownloadUpdaterContainer = new BinderProxyDownloadUpdaterContainerImp(this.mProxyDownloadUpdaterContainerImp, application);
    }
}
