package com.bytedance.ee.bear.contract.drive.sdk.entity.menu;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderProxyDownloadCallBack;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class ProxyDownloadCallBackProxy implements AbstractC10952a<AbstractC5150g.AbstractC5151a> {
    /* renamed from: a */
    public AbstractC5150g.AbstractC5151a mo16349b(IBinder iBinder) {
        return BinderProxyDownloadCallBack.Stub.asInterface(iBinder);
    }
}
