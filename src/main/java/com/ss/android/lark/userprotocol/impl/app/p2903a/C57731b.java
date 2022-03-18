package com.ss.android.lark.userprotocol.impl.app.p2903a;

import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.userprotocol.impl.app.p2903a.C57727a;
import com.ss.android.lark.userprotocol.impl.p2902a.AbstractC57715a;
import com.ss.android.lark.userprotocol.impl.p2902a.C57717b;

/* renamed from: com.ss.android.lark.userprotocol.impl.app.a.b */
public class C57731b extends BaseModel implements C57727a.AbstractC57728a {

    /* renamed from: a */
    AbstractC57715a f142221a = new C57717b();

    /* renamed from: b */
    private CallbackManager f142222b = new CallbackManager();

    @Override // com.ss.android.lark.userprotocol.impl.app.p2903a.C57727a.AbstractC57728a
    /* renamed from: a */
    public void mo195899a(final IGetDataCallback<AbstractC57715a.C57716a> iGetDataCallback) {
        this.f142221a.mo195872a(this.f142222b.wrapAndAddGetDataCallback(new IGetDataCallback<AbstractC57715a.C57716a>() {
            /* class com.ss.android.lark.userprotocol.impl.app.p2903a.C57731b.C577321 */

            /* renamed from: a */
            public void onSuccess(AbstractC57715a.C57716a aVar) {
                iGetDataCallback.onSuccess(aVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }
        }));
    }

    @Override // com.ss.android.lark.userprotocol.impl.app.p2903a.C57727a.AbstractC57728a
    /* renamed from: a */
    public void mo195900a(String str, final IGetDataCallback<String> iGetDataCallback) {
        this.f142221a.mo195873a(str, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.userprotocol.impl.app.p2903a.C57731b.C577332 */

            /* renamed from: a */
            public void onSuccess(String str) {
                iGetDataCallback.onSuccess(str);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }
        });
    }
}
