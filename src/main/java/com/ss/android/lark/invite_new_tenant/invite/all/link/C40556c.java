package com.ss.android.lark.invite_new_tenant.invite.all.link;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.invite_new_tenant.C40531a;
import com.ss.android.lark.invite_new_tenant.invite.all.link.C40550a;
import com.ss.android.lark.invite_new_tenant.invite.all.p2067a.C40547a;
import com.ss.android.lark.invite_new_tenant.p2064b.C40534a;
import com.ss.android.lark.invite_new_tenant.p2065c.C40536a;
import com.ss.android.lark.utils.rxjava.C57865c;

/* renamed from: com.ss.android.lark.invite_new_tenant.invite.all.link.c */
public class C40556c extends BaseModel implements C40550a.AbstractC40551a {
    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C40534a m160500a() {
        return C40531a.m160431a().mo143861d();
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.all.link.C40550a.AbstractC40551a
    /* renamed from: b */
    public void mo146673b(IGetDataCallback<C40534a> iGetDataCallback) {
        C57865c.m224574a($$Lambda$c$DEDHK_w28QeCHwIsLQ9qtmiBsSc.INSTANCE, new C57865c.AbstractC57871b() {
            /* class com.ss.android.lark.invite_new_tenant.invite.all.link.$$Lambda$c$DVYu6gixbIWNdrhJc93fnIto94o */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                C40556c.m160501a(IGetDataCallback.this, (C40534a) obj);
            }
        });
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.all.link.C40550a.AbstractC40551a
    /* renamed from: a */
    public void mo146672a(IGetDataCallback<C40547a> iGetDataCallback) {
        C40536a.m160445a().mo146648c((IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m160501a(IGetDataCallback iGetDataCallback, C40534a aVar) {
        if (iGetDataCallback != null) {
            if (aVar != null) {
                iGetDataCallback.onSuccess(aVar);
            } else {
                iGetDataCallback.onError(new ErrorResult("the login chatter is null"));
            }
        }
    }
}
