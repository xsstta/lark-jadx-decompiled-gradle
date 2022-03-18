package com.ss.android.lark.appcenter.wrapper.impl.p1362a;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.appcenter.business.dto.AppType;
import com.ss.android.appcenter.p1262a.AbstractC27532a;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27546k;
import com.ss.android.lark.appcenter.wrapper.impl.p1363b.C29169c;

/* renamed from: com.ss.android.lark.appcenter.wrapper.impl.a.l */
public class C29157l implements AbstractC27546k {
    /* renamed from: a */
    public void mo103417a(boolean z) {
        C29145a.f72965a = z;
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27546k
    /* renamed from: a */
    public void mo98210a(String str, AppType appType, final AbstractC27532a<String> aVar) {
        if (!TextUtils.isEmpty(str)) {
            if (appType == null) {
                appType = AppType.fromValue(0);
            }
            C29169c.m107223a(str, appType.getValue(), new IGetDataCallback<String>() {
                /* class com.ss.android.lark.appcenter.wrapper.impl.p1362a.C29157l.C291581 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    AbstractC27532a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo98151a(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    C29157l.this.mo103417a(true);
                    AbstractC27532a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo98152a(str);
                    }
                }
            });
        }
    }
}
