package com.huawei.hms.locationSdk;

import android.content.Context;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;

/* renamed from: com.huawei.hms.locationSdk.d */
public class C23645d extends AbstractClientBuilder<C23660o, C23668s> {
    @Override // com.huawei.hms.common.internal.AbstractClientBuilder
    public C23660o buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new C23660o(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
