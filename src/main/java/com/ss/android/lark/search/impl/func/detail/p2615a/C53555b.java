package com.ss.android.lark.search.impl.func.detail.p2615a;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53569a;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53579e;

/* renamed from: com.ss.android.lark.search.impl.func.detail.a.b */
public class C53555b extends AbstractC53569a implements AbstractC53579e.AbstractC53581b {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.search.impl.func.detail.base.AbstractC53569a
    /* renamed from: o */
    public boolean mo182798o() {
        return true;
    }

    /* renamed from: b */
    public void mo182797b(String str, final IGetDataCallback<Chat> iGetDataCallback) {
        this.f132312a.mo181794b(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.search.impl.func.detail.p2615a.C53555b.C535561 */

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
