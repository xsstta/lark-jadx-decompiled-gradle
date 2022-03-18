package com.bytedance.ee.bear.contract.drive.sdk.entity.menu;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderProxyDownloadUpdaterContainer;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class ProxyDownloadUpdaterContainerProxy implements AbstractC10952a<AbstractC5150g.AbstractC5153c> {
    /* renamed from: a */
    public AbstractC5150g.AbstractC5153c mo16349b(IBinder iBinder) {
        return BinderProxyDownloadUpdaterContainer.Stub.asInterface(iBinder);
    }
}
