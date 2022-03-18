package com.ss.android.lark.setting.page.content.general;

import ai.v1.MobileComposerSetting;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.content.general.IGeneralSettingContract;
import com.ss.android.lark.setting.service.usersetting.base.SmartReplySetting;

/* renamed from: com.ss.android.lark.setting.page.content.general.f */
public class C54455f extends BasePresenter<C54444e, GeneralSettingView, IGeneralSettingContract.AbstractC54432b.AbstractC54433a> {

    /* renamed from: a */
    public boolean f134666a;

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IGeneralSettingContract.AbstractC54432b.AbstractC54433a createViewDelegate() {
        return new IGeneralSettingContract.AbstractC54432b.AbstractC54433a() {
            /* class com.ss.android.lark.setting.page.content.general.C54455f.C544572 */

            @Override // com.ss.android.lark.setting.page.content.general.IGeneralSettingContract.AbstractC54432b.AbstractC54433a
            /* renamed from: a */
            public void mo186086a(MobileComposerSetting mobileComposerSetting) {
                ((C54444e) C54455f.this.getModel()).mo186114a(mobileComposerSetting);
            }

            @Override // com.ss.android.lark.setting.page.content.general.IGeneralSettingContract.AbstractC54432b.AbstractC54433a
            /* renamed from: a */
            public void mo186087a(boolean z) {
                ((C54444e) C54455f.this.getModel()).mo186121b(z, new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.lark.setting.page.content.general.C54455f.C544572.C544581 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }
                });
            }

            @Override // com.ss.android.lark.setting.page.content.general.IGeneralSettingContract.AbstractC54432b.AbstractC54433a
            /* renamed from: b */
            public void mo186089b(boolean z) {
                ((C54444e) C54455f.this.getModel()).mo186123c(z, new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.lark.setting.page.content.general.C54455f.C544572.C544592 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }
                });
            }

            @Override // com.ss.android.lark.setting.page.content.general.IGeneralSettingContract.AbstractC54432b.AbstractC54433a
            /* renamed from: c */
            public void mo186090c(boolean z) {
                ((C54444e) C54455f.this.getModel()).mo186124d(z, new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.lark.setting.page.content.general.C54455f.C544572.C544603 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }
                });
            }

            @Override // com.ss.android.lark.setting.page.content.general.IGeneralSettingContract.AbstractC54432b.AbstractC54433a
            /* renamed from: a */
            public void mo186088a(boolean z, boolean z2) {
                ((C54444e) C54455f.this.getModel()).mo186118a(z, z2);
            }
        };
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((C54444e) getModel()).mo186117a(false, (IGetDataCallback<C54434a>) new IGetDataCallback<C54434a>() {
            /* class com.ss.android.lark.setting.page.content.general.C54455f.C544613 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C53241h.m205894a("GeneralSettingPresenter", "load local UserSetting error!");
            }

            /* renamed from: a */
            public void onSuccess(C54434a aVar) {
                if (!C54455f.this.f134666a) {
                    ((GeneralSettingView) C54455f.this.getView()).mo186079a(aVar);
                }
            }
        });
        ((C54444e) getModel()).mo186117a(true, (IGetDataCallback<C54434a>) new IGetDataCallback<C54434a>() {
            /* class com.ss.android.lark.setting.page.content.general.C54455f.C544624 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C53241h.m205894a("GeneralSettingPresenter", "loadUserSetting error!");
            }

            /* renamed from: a */
            public void onSuccess(C54434a aVar) {
                C54455f.this.f134666a = true;
                ((GeneralSettingView) C54455f.this.getView()).mo186079a(aVar);
            }
        });
        ((GeneralSettingView) getView()).mo186080a(((C54444e) getModel()).mo186119a());
        ((GeneralSettingView) getView()).mo186083b(((C54444e) getModel()).mo186122b());
        if (C54115c.m210080a().mo178268D()) {
            ((C54444e) getModel()).mo186120b(new IGetDataCallback<MobileComposerSetting>() {
                /* class com.ss.android.lark.setting.page.content.general.C54455f.C544635 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccess(MobileComposerSetting mobileComposerSetting) {
                    boolean z;
                    boolean z2;
                    boolean z3 = false;
                    if (mobileComposerSetting.is_mail_enabled != null) {
                        z = mobileComposerSetting.is_mail_enabled.booleanValue();
                    } else {
                        z = false;
                    }
                    if (mobileComposerSetting.is_docs_enabled != null) {
                        z2 = mobileComposerSetting.is_docs_enabled.booleanValue();
                    } else {
                        z2 = false;
                    }
                    if (mobileComposerSetting.is_messenger_enabled != null) {
                        z3 = mobileComposerSetting.is_messenger_enabled.booleanValue();
                    }
                    ((GeneralSettingView) C54455f.this.getView()).mo186082a(z3, z, z2);
                }
            });
        }
        if (C54115c.m210080a().mo178269E()) {
            ((C54444e) getModel()).mo186115a(new UIGetDataCallback<SmartReplySetting>() {
                /* class com.ss.android.lark.setting.page.content.general.C54455f.C544646 */

                @Override // com.larksuite.framework.callback.UIGetDataCallback
                public void onErrored(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccessed(SmartReplySetting smartReplySetting) {
                    ((GeneralSettingView) C54455f.this.getView()).mo186081a(smartReplySetting.isSmartReplyEnable(), smartReplySetting.isSmartActionEnable());
                }
            });
        }
    }

    public C54455f(C54444e eVar, GeneralSettingView generalSettingView) {
        super(eVar, generalSettingView);
        eVar.mo186116a(new IGeneralSettingContract.AbstractC54430a.AbstractC54431a() {
            /* class com.ss.android.lark.setting.page.content.general.C54455f.C544561 */
        });
    }
}
