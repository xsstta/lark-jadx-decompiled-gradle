package com.ss.android.lark.mine.impl.status.mvp;

import android.content.Intent;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.dto.C45423a;
import com.ss.android.lark.mine.impl.status.mvp.AbstractC45819a;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;

/* renamed from: com.ss.android.lark.mine.impl.status.mvp.b */
public class C45823b extends BaseModel implements AbstractC45819a.AbstractC45820a {

    /* renamed from: a */
    public boolean f115615a;

    /* renamed from: b */
    public ChatterDescription f115616b;

    /* renamed from: c */
    private AbstractC45399a.AbstractC45415p f115617c;

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f115615a = false;
        this.f115617c = C45421b.m180420a().mo133463v();
    }

    @Override // com.ss.android.lark.mine.impl.status.mvp.AbstractC45819a.AbstractC45820a
    /* renamed from: a */
    public void mo161063a(Intent intent) {
        ChatterDescription chatterDescription = this.f115616b;
        if (chatterDescription != null) {
            intent.putExtra("user_status", chatterDescription);
        }
    }

    @Override // com.ss.android.lark.mine.impl.status.mvp.AbstractC45819a.AbstractC45820a
    /* renamed from: a */
    public void mo161064a(ChatterDescription chatterDescription, final IGetDataCallback<Boolean> iGetDataCallback) {
        this.f115617c.mo133532a(chatterDescription, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.mine.impl.status.mvp.C45823b.C458263 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(bool);
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

    @Override // com.ss.android.lark.mine.impl.status.mvp.AbstractC45819a.AbstractC45820a
    /* renamed from: a */
    public void mo161062a(int i, int i2, final IGetDataCallback<C45423a> iGetDataCallback) {
        if (!this.f115615a) {
            this.f115615a = true;
            this.f115617c.mo133528a(i, i2, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<C45423a>() {
                /* class com.ss.android.lark.mine.impl.status.mvp.C45823b.C458252 */

                /* renamed from: a */
                public void onSuccess(C45423a aVar) {
                    C45823b.this.f115615a = false;
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(aVar);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C45823b.this.f115615a = false;
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }
            }));
        }
    }

    @Override // com.ss.android.lark.mine.impl.status.mvp.AbstractC45819a.AbstractC45820a
    /* renamed from: a */
    public void mo161065a(String str, ChatterDescription.Type type, final IGetDataCallback<String> iGetDataCallback) {
        final ChatterDescription chatterDescription = new ChatterDescription();
        chatterDescription.description = str;
        chatterDescription.type = type;
        this.f115617c.mo133534b(chatterDescription, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.mine.impl.status.mvp.C45823b.C458241 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                C45823b.this.f115616b = chatterDescription;
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(str);
                }
            }
        }));
    }
}
