package com.ss.android.lark.contact.impl.setting.mvp;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a;
import com.ss.android.lark.contact.impl.setting.service.PrivacyService;
import com.ss.android.lark.contact.impl.setting.service.entity.C36064a;
import com.ss.android.lark.contact.impl.setting.service.entity.C36067c;
import com.ss.android.lark.contact.impl.setting.service.entity.WayToAddMeSettingItem;

/* renamed from: com.ss.android.lark.contact.impl.setting.mvp.b */
public class C36008b extends BaseModel implements AbstractC36004a.AbstractC36005a {

    /* renamed from: a */
    public C36064a f93075a;

    @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36005a
    /* renamed from: a */
    public void mo132435a(IGetDataCallback<C36067c> iGetDataCallback) {
        PrivacyService.m141400a().mo132583b((IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36005a
    /* renamed from: b */
    public void mo132439b(IGetDataCallback<C36067c> iGetDataCallback) {
        PrivacyService.m141400a().mo132575a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36005a
    /* renamed from: c */
    public void mo132440c(final IGetDataCallback<C36064a> iGetDataCallback) {
        PrivacyService.m141400a().mo132585c((IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<C36064a>() {
            /* class com.ss.android.lark.contact.impl.setting.mvp.C36008b.C360091 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(C36064a aVar) {
                C36008b.this.f93075a = aVar;
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(aVar);
                }
            }
        }));
    }

    @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36005a
    /* renamed from: d */
    public void mo132441d(final IGetDataCallback<C36064a> iGetDataCallback) {
        PrivacyService.m141400a().mo132588e((IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<C36064a>() {
            /* class com.ss.android.lark.contact.impl.setting.mvp.C36008b.C360102 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(C36064a aVar) {
                C36008b.this.f93075a = aVar;
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(aVar);
                }
            }
        }));
    }

    @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36005a
    /* renamed from: a */
    public void mo132436a(WayToAddMeSettingItem wayToAddMeSettingItem, IGetDataCallback<Void> iGetDataCallback) {
        PrivacyService.m141400a().mo132576a(wayToAddMeSettingItem, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36005a
    /* renamed from: a */
    public void mo132438a(boolean z, IGetDataCallback<Void> iGetDataCallback) {
        C36064a aVar;
        C36064a aVar2 = this.f93075a;
        if (aVar2 == null) {
            aVar = new C36064a();
        } else {
            aVar = new C36064a(aVar2);
        }
        aVar.mo132611a(z);
        PrivacyService.m141400a().mo132577a(aVar, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36005a
    /* renamed from: a */
    public void mo132437a(String str, String str2, boolean z, IGetDataCallback<Void> iGetDataCallback) {
        PrivacyService.m141400a().mo132579a(str, str2, z, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }
}
