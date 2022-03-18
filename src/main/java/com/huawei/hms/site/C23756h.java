package com.huawei.hms.site;

import android.content.Context;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;

/* renamed from: com.huawei.hms.site.h */
public class C23756h extends AbstractClientBuilder<C23755g, Object> {
    /* Return type fixed from 'com.huawei.hms.common.internal.AnyClient' to match base method */
    @Override // com.huawei.hms.common.internal.AbstractClientBuilder
    public C23755g buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new C23755g(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
