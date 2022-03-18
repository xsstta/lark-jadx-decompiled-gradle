package com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto;

import com.larksuite.component.metriclogger_constants.domains.translation.setting.p1096a.C24357a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.AbstractC54376b;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.C54377c;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.C54378d;
import java.util.Map;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.c */
public class C54334c extends BasePresenter<AbstractC54318a.AbstractC54319a<C54378d, C54377c, Void>, AbstractC54318a.AbstractC54320b<C54378d>, AbstractC54318a.AbstractC54320b.AbstractC54321a> {

    /* renamed from: a */
    AbstractC54376b<C54377c> f134427a;

    /* renamed from: b */
    public C54378d f134428b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC54318a.AbstractC54320b.AbstractC54321a<C54378d> createViewDelegate() {
        return new AbstractC54318a.AbstractC54320b.AbstractC54321a<C54378d>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.C54334c.C543351 */

            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54320b.AbstractC54321a
            /* renamed from: a */
            public void mo185853a() {
                C54115c.m210080a().mo178279a(C24357a.f60129e, (Map<String, ? extends Object>) null);
                ((AbstractC54318a.AbstractC54319a) C54334c.this.getModel()).mo185849a((AbstractC54376b) C54334c.this.f134427a, (IGetDataCallback) new IGetDataCallback<C54378d>() {
                    /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.C54334c.C543351.C543361 */

                    /* renamed from: a */
                    public void onSuccess(C54378d dVar) {
                        Log.m165389i("TAG_TRANSLATE_AUTO_TRANSLATE_SETTING_DETAIL_PRESENTER", "initLoadDetailSettings " + C54334c.this.f134427a.mo185939a() + " success");
                        C54334c.this.f134428b = dVar;
                        ((AbstractC54318a.AbstractC54320b) C54334c.this.getView()).mo185851a(dVar);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        C54115c.m210080a().mo178278a(C24357a.f60130f, errorResult, null);
                        Log.m165383e("TAG_TRANSLATE_AUTO_TRANSLATE_SETTING_DETAIL_PRESENTER", "initLoadDetailSettings " + C54334c.this.f134427a.mo185939a() + " failed; err=" + errorResult.getDebugMsg());
                        ((AbstractC54318a.AbstractC54320b) C54334c.this.getView()).mo185852a(errorResult.getDisplayMsg());
                    }
                });
            }

            /* renamed from: a */
            public void mo185854a(final C54378d dVar) {
                Integer num;
                if (dVar != null && dVar.mo185984a() != null) {
                    int g = dVar.mo185984a().mo185982g();
                    if (C54334c.this.f134428b == null) {
                        num = null;
                    } else {
                        num = Integer.valueOf(C54334c.this.f134428b.mo185984a().mo185982g());
                    }
                    if (g != num.intValue()) {
                        ((AbstractC54318a.AbstractC54319a) C54334c.this.getModel()).mo185850a(dVar, new IGetDataCallback<Void>() {
                            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.C54334c.C543351.C543372 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                Log.m165389i("TAG_TRANSLATE_AUTO_TRANSLATE_SETTING_DETAIL_PRESENTER", "onChooseDetailItem " + dVar.mo185986c() + " failed, config=" + dVar.mo185984a());
                                ((AbstractC54318a.AbstractC54320b) C54334c.this.getView()).mo185852a("");
                            }

                            /* renamed from: a */
                            public void onSuccess(Void r2) {
                                C54334c.this.f134428b = dVar;
                                Log.m165389i("TAG_TRANSLATE_AUTO_TRANSLATE_SETTING_DETAIL_PRESENTER", "onChooseDetailItem " + dVar.mo185986c() + " success, config=" + dVar.mo185984a());
                                ((AbstractC54318a.AbstractC54320b) C54334c.this.getView()).mo185851a(C54334c.this.f134428b);
                            }
                        });
                    }
                }
            }
        };
    }

    public C54334c(AbstractC54318a.AbstractC54319a<C54378d, C54377c, Void> aVar, AbstractC54318a.AbstractC54320b<C54378d> bVar, AbstractC54376b<C54377c> bVar2) {
        super(aVar, bVar);
        this.f134427a = bVar2;
    }
}
