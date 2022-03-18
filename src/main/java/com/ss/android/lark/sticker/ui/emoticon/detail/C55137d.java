package com.ss.android.lark.sticker.ui.emoticon.detail;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.sticker.api.C55054b;
import com.ss.android.lark.sticker.api.C55063h;
import com.ss.android.lark.sticker.p2714a.C55044n;
import com.ss.android.lark.sticker.ui.emoticon.detail.C55130a;
import com.ss.android.lark.sticker.ui.p2717b.C55094b;
import java.util.Collections;

/* renamed from: com.ss.android.lark.sticker.ui.emoticon.detail.d */
public class C55137d extends BaseModel implements C55130a.AbstractC55131a {
    @Override // com.ss.android.lark.sticker.ui.emoticon.detail.C55130a.AbstractC55131a
    /* renamed from: a */
    public void mo188066a(String str, final IGetDataCallback<C55094b> iGetDataCallback) {
        if (iGetDataCallback != null) {
            C55054b bVar = new C55054b(Collections.singletonList(str), str);
            C55044n.m213720a().mo187875a(bVar, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<C55094b>() {
                /* class com.ss.android.lark.sticker.ui.emoticon.detail.C55137d.C551381 */

                /* renamed from: a */
                public void onSuccess(C55094b bVar) {
                    iGetDataCallback.onSuccess(bVar);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    iGetDataCallback.onError(errorResult);
                }
            }));
        }
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.detail.C55130a.AbstractC55131a
    /* renamed from: b */
    public void mo188067b(String str, final IGetDataCallback<Boolean> iGetDataCallback) {
        if (iGetDataCallback != null) {
            C55063h hVar = new C55063h();
            hVar.mo187911a(Collections.singletonList(str));
            C55044n.m213720a().mo187878a(hVar, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.sticker.ui.emoticon.detail.C55137d.C551392 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    iGetDataCallback.onSuccess(bool);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    iGetDataCallback.onError(errorResult);
                }
            }));
        }
    }
}
