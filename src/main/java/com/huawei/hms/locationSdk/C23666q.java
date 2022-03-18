package com.huawei.hms.locationSdk;

import android.content.Context;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.common.internal.HmsClient;

/* renamed from: com.huawei.hms.locationSdk.q */
public class C23666q extends HmsClient {
    public C23666q(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        super(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }

    @Override // com.huawei.hms.common.internal.BaseHmsClient
    public int getMinApkVersion() {
        return 50000000;
    }

    @Override // com.huawei.hms.common.internal.BaseHmsClient
    public String getServiceAction() {
        return "com.huawei.hms.core.locationaidlservice";
    }
}
