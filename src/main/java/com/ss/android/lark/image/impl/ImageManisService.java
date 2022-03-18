package com.ss.android.lark.image.impl;

import android.content.Context;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.EncryptImageData;
import com.ss.android.lark.image.C38792a;
import com.ss.android.lark.image.service.ErrorResultWrapper;
import com.ss.android.lark.image.service.IImageManisService;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = IImageManisService.class)
public class ImageManisService implements IImageManisService {
    private Context mContext;

    public ImageManisService(Context context) {
        this.mContext = context;
    }

    @Override // com.ss.android.lark.image.service.IImageManisService
    public void uploadEncryptImage(String str, boolean z, boolean z2, final IImageManisService.AbstractC38924a aVar) {
        new C38792a(C38792a.m153106a()).mo142163a(this.mContext, str, z, z2, (AbstractC25974h) null, new IGetDataCallback<EncryptImageData>() {
            /* class com.ss.android.lark.image.impl.ImageManisService.C388271 */

            /* renamed from: a */
            public void onSuccess(EncryptImageData encryptImageData) {
                IImageManisService.AbstractC38924a aVar = aVar;
                if (aVar != null) {
                    aVar.onSuccess(encryptImageData);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IImageManisService.AbstractC38924a aVar = aVar;
                if (aVar != null) {
                    aVar.onError(new ErrorResultWrapper(errorResult));
                }
            }
        });
    }
}
