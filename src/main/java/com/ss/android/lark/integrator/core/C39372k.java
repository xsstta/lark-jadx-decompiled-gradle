package com.ss.android.lark.integrator.core;

import android.content.Context;
import com.ss.android.lark.core.dependency.AbstractC36125j;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.vc.api.IVCApi;

/* renamed from: com.ss.android.lark.integrator.core.k */
class C39372k implements AbstractC36125j {
    C39372k() {
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36125j
    /* renamed from: a */
    public boolean mo132983a() {
        return ((IVCApi) ApiUtils.getApi(IVCApi.class)).isMmRecording();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36125j
    /* renamed from: a */
    public boolean mo132984a(String str) {
        return ((IVCApi) ApiUtils.getApi(IVCApi.class)).isMMUrl(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36125j
    /* renamed from: a */
    public void mo132982a(Context context, String str, int i) {
        ((IVCApi) ApiUtils.getApi(IVCApi.class)).openMMUrl(context, str, i);
    }
}
