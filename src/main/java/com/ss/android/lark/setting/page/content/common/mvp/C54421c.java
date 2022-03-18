package com.ss.android.lark.setting.page.content.common.mvp;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.page.content.common.mvp.AbstractC54411a;
import com.ss.android.lark.setting.page.content.common.statistics.LanguageSettingHitPoint;
import com.ss.android.lark.setting.service.usersetting.msgalignmentstyle.MessageAlignModeService;

/* renamed from: com.ss.android.lark.setting.page.content.common.mvp.c */
public class C54421c extends BasePresenter<AbstractC54411a.AbstractC54412a, AbstractC54411a.AbstractC54413b, AbstractC54411a.AbstractC54413b.AbstractC54414a> {
    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    /* renamed from: e */
    public void mo186061e() {
        mo186059c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC54411a.AbstractC54413b.AbstractC54414a createViewDelegate() {
        return new AbstractC54411a.AbstractC54413b.AbstractC54414a() {
            /* class com.ss.android.lark.setting.page.content.common.mvp.C54421c.C544221 */

            @Override // com.ss.android.lark.setting.page.content.common.mvp.AbstractC54411a.AbstractC54413b.AbstractC54414a
            /* renamed from: a */
            public void mo186050a(final boolean z) {
                ((AbstractC54411a.AbstractC54412a) C54421c.this.getModel()).mo186046a(z, new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.lark.setting.page.content.common.mvp.C54421c.C544221.C544231 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((AbstractC54411a.AbstractC54413b) C54421c.this.getView()).mo186036a(!z);
                        Log.m165382e(errorResult.toString());
                    }
                });
            }

            @Override // com.ss.android.lark.setting.page.content.common.mvp.AbstractC54411a.AbstractC54413b.AbstractC54414a
            /* renamed from: a */
            public void mo186049a(Context context) {
                final Context applicationContext = context.getApplicationContext();
                ((AbstractC54411a.AbstractC54413b) C54421c.this.getView()).mo186031a();
                ((AbstractC54411a.AbstractC54412a) C54421c.this.getModel()).mo186047b(new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.lark.setting.page.content.common.mvp.C54421c.C544221.C544242 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        C54421c.this.mo186059c();
                    }

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                        if (bool.booleanValue()) {
                            ((AbstractC54411a.AbstractC54413b) C54421c.this.getView()).mo186035a(applicationContext.getString(R.string.Lark_Legacy_ClearCacheDone));
                            LanguageSettingHitPoint.f134054a.mo185347c();
                        }
                        C54421c.this.mo186059c();
                    }
                }));
            }
        };
    }

    /* renamed from: b */
    public void mo186058b() {
        ((AbstractC54411a.AbstractC54412a) getModel()).mo186045a(new IGetDataCallback<InitData>() {
            /* class com.ss.android.lark.setting.page.content.common.mvp.C54421c.C544252 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e(errorResult.toString());
            }

            /* renamed from: a */
            public void onSuccess(InitData initData) {
                ((AbstractC54411a.AbstractC54413b) C54421c.this.getView()).mo186032a(initData);
            }
        });
    }

    /* renamed from: d */
    public void mo186060d() {
        ((AbstractC54411a.AbstractC54413b) getView()).mo186034a(MessageAlignModeService.f135136a.mo186841c());
    }

    /* renamed from: c */
    public void mo186059c() {
        ((AbstractC54411a.AbstractC54412a) getModel()).mo186048c(new UIGetDataCallback(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.setting.page.content.common.mvp.C54421c.C544263 */

            /* renamed from: a */
            public void onSuccess(String str) {
                ((AbstractC54411a.AbstractC54413b) C54421c.this.getView()).mo186038b(str);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC54411a.AbstractC54413b) C54421c.this.getView()).mo186038b("");
            }
        }));
    }

    public C54421c(AbstractC54411a.AbstractC54412a aVar, AbstractC54411a.AbstractC54413b bVar) {
        super(aVar, bVar);
    }
}
