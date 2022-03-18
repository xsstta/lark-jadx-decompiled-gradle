package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.ee.bear.lark.p414b.AbstractC7996i;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.EncryptImageData;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.utils.ApiUtils;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.r */
public class C39323r implements AbstractC7996i {
    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC7996i
    /* renamed from: a */
    public void mo30997a(List<String> list, List<String> list2, int i, int i2, IGetDataCallback<List<Bitmap>> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).downloadImage(list, list2, i, i2, iGetDataCallback);
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC7996i
    /* renamed from: a */
    public void mo30996a(Context context, String str, boolean z, boolean z2, AbstractC25974h hVar, final IGetDataCallback<AbstractC7996i.C7997a> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).uploadEncryptImage(context, str, z, z2, hVar, new IGetDataCallback<EncryptImageData>() {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.C39323r.C393241 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(EncryptImageData encryptImageData) {
                AbstractC7996i.C7997a aVar;
                if (encryptImageData != null) {
                    aVar = new AbstractC7996i.C7997a(encryptImageData.f73837a, encryptImageData.f73838b);
                } else {
                    aVar = null;
                }
                iGetDataCallback.onSuccess(aVar);
            }
        });
    }
}
