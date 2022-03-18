package com.ss.android.vc.net.service;

import com.google.firebase.messaging.Constants;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/net/service/SingleInstanceSettingsService$getSettings$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class SingleInstanceSettingsService$getSettings$1 implements AbstractC63598b<String> {
    @Override // com.ss.android.vc.net.request.AbstractC63598b
    public void onError(C63602e eVar) {
    }

    SingleInstanceSettingsService$getSettings$1() {
    }

    public void onSuccess(String str) {
        SingleInstanceSettingsService.INSTANCE.updateConfig(str);
    }
}
