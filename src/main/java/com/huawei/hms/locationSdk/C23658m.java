package com.huawei.hms.locationSdk;

import android.content.Context;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;

/* renamed from: com.huawei.hms.locationSdk.m */
public class C23658m extends AbstractClientBuilder<C23667r, C23668s> {
    @Override // com.huawei.hms.common.internal.AbstractClientBuilder
    public C23667r buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new C23667r(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
