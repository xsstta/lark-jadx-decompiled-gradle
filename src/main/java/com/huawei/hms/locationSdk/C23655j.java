package com.huawei.hms.locationSdk;

import android.content.Context;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;

/* renamed from: com.huawei.hms.locationSdk.j */
public class C23655j extends AbstractClientBuilder<C23666q, C23668s> {
    @Override // com.huawei.hms.common.internal.AbstractClientBuilder
    public C23666q buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new C23666q(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
