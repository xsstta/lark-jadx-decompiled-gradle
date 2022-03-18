package com.bytedance.ee.bear.contract.drive.sdk.entity.menu;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderProxyDownloadUpdater;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class ProxyDownloadUpdaterProxy implements AbstractC10952a<AbstractC5150g.AbstractC5152b> {
    /* renamed from: a */
    public AbstractC5150g.AbstractC5152b mo16349b(IBinder iBinder) {
        return BinderProxyDownloadUpdater.Stub.asInterface(iBinder);
    }
}
