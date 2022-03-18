package com.ss.android.lark.mine.impl.info.mvp;

import android.text.TextUtils;
import com.larksuite.framework.callback.C25975i;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.biz.core.api.AbstractC29545ai;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.dto.C45427e;
import com.ss.android.lark.mine.dto.TenantCertificationInfo;
import com.ss.android.lark.mine.impl.info.mvp.C45778a;
import com.ss.android.lark.mine.impl.p2273b.p2275b.AbstractC45434a;

/* renamed from: com.ss.android.lark.mine.impl.info.mvp.b */
public class C45783b extends BaseModel implements C45778a.AbstractC45779a {

    /* renamed from: a */
    public Chatter f115550a;

    /* renamed from: b */
    private C45778a.AbstractC45779a.AbstractC45780a f115551b;

    /* renamed from: c */
    private AbstractC29545ai f115552c = new AbstractC29545ai() {
        /* class com.ss.android.lark.mine.impl.info.mvp.C45783b.C457841 */

        @Override // com.ss.android.lark.biz.core.api.AbstractC29545ai
        /* renamed from: a */
        public void mo105590a(Chatter chatter) {
            C45783b.this.mo161001a(chatter);
        }
    };

    /* renamed from: d */
    private AbstractC45434a f115553d = new AbstractC45434a() {
        /* class com.ss.android.lark.mine.impl.info.mvp.C45783b.C457852 */

        @Override // com.ss.android.lark.mine.impl.p2273b.p2275b.AbstractC45434a
        /* renamed from: a */
        public void mo160320a(Chatter chatter) {
            C45783b.this.mo161003b(chatter);
        }
    };

    @Override // com.ss.android.lark.mine.impl.info.mvp.C45778a.AbstractC45779a
    /* renamed from: a */
    public Chatter mo160990a() {
        return this.f115550a;
    }

    @Override // com.ss.android.lark.mine.impl.info.mvp.C45778a.AbstractC45779a
    /* renamed from: c */
    public String mo160996c() {
        return C45421b.m180420a().mo133458q().mo133504e();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C45421b.m180420a().mo133460s().mo133514a(this.f115552c);
        C45421b.m180420a().mo133460s().mo133515a(this.f115553d);
    }

    @Override // com.ss.android.lark.mine.impl.info.mvp.C45778a.AbstractC45779a
    /* renamed from: b */
    public boolean mo160995b() {
        return C45421b.m180420a().mo133458q().mo133501b();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        C45421b.m180420a().mo133460s().mo133517b(this.f115552c);
        C45421b.m180420a().mo133460s().mo133518b(this.f115553d);
        this.f115551b = null;
    }

    /* renamed from: a */
    public void mo161002a(C45778a.AbstractC45779a.AbstractC45780a aVar) {
        this.f115551b = aVar;
    }

    @Override // com.ss.android.lark.mine.impl.info.mvp.C45778a.AbstractC45779a
    /* renamed from: b */
    public void mo160994b(IGetDataCallback<TenantCertificationInfo> iGetDataCallback) {
        C45797d.m181463a(getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.mine.impl.info.mvp.C45778a.AbstractC45779a
    /* renamed from: a */
    public void mo160991a(final IGetDataCallback<Boolean> iGetDataCallback) {
        C45421b.m180420a().mo133459r().mo133513b((IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.mine.impl.info.mvp.C45783b.C457885 */

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

    /* renamed from: b */
    public void mo161003b(Chatter chatter) {
        if (chatter != null && TextUtils.equals(chatter.getId(), mo160996c())) {
            this.f115550a = chatter;
            C45778a.AbstractC45779a.AbstractC45780a aVar = this.f115551b;
            if (aVar != null) {
                aVar.mo160998b(chatter);
                this.f115551b.mo160997a(chatter);
            }
        }
    }

    @Override // com.ss.android.lark.mine.impl.info.mvp.C45778a.AbstractC45779a
    /* renamed from: a */
    public void mo160992a(final UIGetDataCallback<Chatter> uIGetDataCallback) {
        C45421b.m180420a().mo133459r().mo133509a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Chatter>() {
            /* class com.ss.android.lark.mine.impl.info.mvp.C45783b.C457874 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                UIGetDataCallback uIGetDataCallback = uIGetDataCallback;
                if (uIGetDataCallback != null) {
                    uIGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Chatter chatter) {
                C45783b.this.f115550a = chatter;
                UIGetDataCallback uIGetDataCallback = uIGetDataCallback;
                if (uIGetDataCallback != null) {
                    uIGetDataCallback.onSuccess(chatter);
                }
            }
        }));
    }

    @Override // com.ss.android.lark.mine.impl.info.mvp.C45778a.AbstractC45779a
    /* renamed from: a */
    public void mo160993a(final C25975i<C45427e> iVar) {
        C45421b.m180420a().mo133463v().mo133531a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<C45427e>() {
            /* class com.ss.android.lark.mine.impl.info.mvp.C45783b.C457863 */

            /* renamed from: a */
            public void onSuccess(C45427e eVar) {
                C25975i iVar = iVar;
                if (iVar != null) {
                    iVar.onSuccess(eVar);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C25975i iVar = iVar;
                if (iVar != null) {
                    iVar.onError(errorResult);
                }
            }
        }));
    }

    /* renamed from: a */
    public void mo161001a(Chatter chatter) {
        if (chatter != null && chatter.getId().equals(mo160996c())) {
            this.f115550a = chatter;
            C45778a.AbstractC45779a.AbstractC45780a aVar = this.f115551b;
            if (aVar != null) {
                aVar.mo160997a(chatter);
            }
        }
    }
}
