package com.bytedance.ee.bear.contract.drive.sdk.entity.menu;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class ProxyDownloadCallBackLinker implements IInterface, AbstractC10957d {
    private BinderProxyDownloadCallBack mBinderProxyDownloadCallBack;
    private AbstractC5145b mProxyDownloadCallBackImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderProxyDownloadCallBack.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mProxyDownloadCallBackImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mProxyDownloadCallBackImp.init(application);
    }

    public ProxyDownloadCallBackLinker(AbstractC5145b bVar, Application application) {
        this.mProxyDownloadCallBackImp = bVar;
        this.mBinderProxyDownloadCallBack = new BinderProxyDownloadCallBackImp(this.mProxyDownloadCallBackImp, application);
    }
}
