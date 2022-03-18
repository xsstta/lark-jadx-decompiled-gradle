package com.ss.android.lark.search.impl.func.detail.p2618d;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.search.impl.entity.SearchDetailInitData;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53569a;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53579e;

/* renamed from: com.ss.android.lark.search.impl.func.detail.d.a */
public class C53613a extends AbstractC53569a implements AbstractC53579e.AbstractC53583d {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.search.impl.func.detail.base.AbstractC53569a
    /* renamed from: o */
    public boolean mo182798o() {
        return false;
    }

    public C53613a(SearchDetailInitData searchDetailInitData) {
        super(searchDetailInitData);
    }

    /* renamed from: b */
    public void mo182903b(String str, final IGetDataCallback<Chat> iGetDataCallback) {
        this.f132312a.mo181794b(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.search.impl.func.detail.p2618d.C53613a.C536141 */

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(chat);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }));
    }
}
