package com.ss.android.vc.lark.setting;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.vc.entity.response.C60987v;
import com.ss.android.vc.lark.setting.AbstractC61183a;

/* renamed from: com.ss.android.vc.lark.setting.f */
public class C61198f extends BasePresenter<C61191e, C61207g, AbstractC61183a.AbstractC61186b.AbstractC61187a> {
    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC61183a.AbstractC61186b.AbstractC61187a createViewDelegate() {
        return new AbstractC61183a.AbstractC61186b.AbstractC61187a() {
            /* class com.ss.android.vc.lark.setting.C61198f.C612002 */

            @Override // com.ss.android.vc.lark.setting.AbstractC61183a.AbstractC61186b.AbstractC61187a
            /* renamed from: a */
            public void mo211571a(boolean z) {
                ((C61191e) C61198f.this.getModel()).mo211586a(z, new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.vc.lark.setting.C61198f.C612002.C612011 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }
                });
            }

            @Override // com.ss.android.vc.lark.setting.AbstractC61183a.AbstractC61186b.AbstractC61187a
            /* renamed from: b */
            public void mo211572b(boolean z) {
                ((C61191e) C61198f.this.getModel()).mo211588b(z, new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.vc.lark.setting.C61198f.C612002.C612022 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }
                });
            }

            @Override // com.ss.android.vc.lark.setting.AbstractC61183a.AbstractC61186b.AbstractC61187a
            /* renamed from: c */
            public void mo211573c(boolean z) {
                ((C61191e) C61198f.this.getModel()).mo211589c(z, new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.vc.lark.setting.C61198f.C612002.C612033 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }
                });
            }

            @Override // com.ss.android.vc.lark.setting.AbstractC61183a.AbstractC61186b.AbstractC61187a
            /* renamed from: d */
            public void mo211574d(boolean z) {
                ((C61191e) C61198f.this.getModel()).mo211590d(z, new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.vc.lark.setting.C61198f.C612002.C612044 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }
                });
            }
        };
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((C61191e) getModel()).mo211583a(new IGetDataCallback<C61188b>() {
            /* class com.ss.android.vc.lark.setting.C61198f.C612053 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C53241h.m205894a("VideoChatSettingPresenter", "loadUserSetting error!");
            }

            /* renamed from: a */
            public void onSuccess(C61188b bVar) {
                ((C61207g) C61198f.this.getView()).mo211601a(bVar);
            }
        });
        ((C61191e) getModel()).mo211587b(new IGetDataCallback<C60987v>() {
            /* class com.ss.android.vc.lark.setting.C61198f.C612064 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(C60987v vVar) {
                ((C61207g) C61198f.this.getView()).mo211599a(vVar);
            }
        });
    }

    public C61198f(C61191e eVar, C61207g gVar) {
        super(eVar, gVar);
        eVar.mo211584a(new AbstractC61183a.AbstractC61184a.AbstractC61185a() {
            /* class com.ss.android.vc.lark.setting.C61198f.C611991 */

            @Override // com.ss.android.vc.lark.setting.AbstractC61183a.AbstractC61184a.AbstractC61185a
            /* renamed from: a */
            public void mo211570a(C61188b bVar) {
            }
        });
    }
}
