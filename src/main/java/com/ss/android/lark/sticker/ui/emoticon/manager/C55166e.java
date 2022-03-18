package com.ss.android.lark.sticker.ui.emoticon.manager;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.sticker.api.C55052a;
import com.ss.android.lark.sticker.api.C55057d;
import com.ss.android.lark.sticker.api.C55061g;
import com.ss.android.lark.sticker.p2714a.C55044n;
import com.ss.android.lark.sticker.ui.emoticon.manager.C55157a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.ui.emoticon.manager.e */
public class C55166e extends BaseModel implements C55157a.AbstractC55158a {
    @Override // com.ss.android.lark.sticker.ui.emoticon.manager.C55157a.AbstractC55158a
    /* renamed from: a */
    public void mo188113a(final IGetDataCallback<List<StickerSet>> iGetDataCallback) {
        if (iGetDataCallback != null) {
            C55057d dVar = new C55057d();
            C55044n.m213720a().mo187876a(dVar, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<List<StickerSet>>() {
                /* class com.ss.android.lark.sticker.ui.emoticon.manager.C55166e.C551671 */

                /* renamed from: a */
                public void onSuccess(List<StickerSet> list) {
                    iGetDataCallback.onSuccess(list);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    iGetDataCallback.onError(errorResult);
                }
            }));
        }
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.manager.C55157a.AbstractC55158a
    /* renamed from: a */
    public void mo188114a(String str, final IGetDataCallback<Boolean> iGetDataCallback) {
        if (iGetDataCallback != null) {
            C55052a aVar = new C55052a();
            aVar.mo187891a(Collections.singletonList(str));
            C55044n.m213720a().mo187874a(aVar, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.sticker.ui.emoticon.manager.C55166e.C551693 */

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

    @Override // com.ss.android.lark.sticker.ui.emoticon.manager.C55157a.AbstractC55158a
    /* renamed from: a */
    public void mo188115a(List<String> list, final IGetDataCallback<Boolean> iGetDataCallback) {
        if (iGetDataCallback != null) {
            C55061g gVar = new C55061g();
            gVar.mo187908a(list);
            C55044n.m213720a().mo187877a(gVar, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.sticker.ui.emoticon.manager.C55166e.C551682 */

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
