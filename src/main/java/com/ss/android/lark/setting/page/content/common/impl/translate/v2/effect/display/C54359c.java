package com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display;

import com.larksuite.component.metriclogger_constants.domains.translation.setting.p1097b.C24358a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.AbstractC54376b;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.C54379e;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.LanguageDisplayRule;
import com.ss.android.lark.setting.page.content.common.statistics.TranslateHitPoint;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.c */
public class C54359c extends BasePresenter<AbstractC54318a.AbstractC54319a<C54379e, LanguageDisplayRule, Void>, AbstractC54318a.AbstractC54320b<C54379e>, AbstractC54318a.AbstractC54320b.AbstractC54321a> {

    /* renamed from: a */
    AbstractC54376b<LanguageDisplayRule> f134474a;

    /* renamed from: b */
    C54379e f134475b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC54318a.AbstractC54320b.AbstractC54321a<C54379e> createViewDelegate() {
        return new AbstractC54318a.AbstractC54320b.AbstractC54321a<C54379e>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.C54359c.C543601 */

            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54320b.AbstractC54321a
            /* renamed from: a */
            public void mo185853a() {
                ((AbstractC54318a.AbstractC54319a) C54359c.this.getModel()).mo185849a((AbstractC54376b) C54359c.this.f134474a, (IGetDataCallback) new IGetDataCallback<C54379e>() {
                    /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.C54359c.C543601.C543611 */

                    /* renamed from: a */
                    public void onSuccess(C54379e eVar) {
                        Log.m165389i("TAG_TRANSLATE_DISPLAY_SETTING_DETAIL_PRESENTER", "initLoadDetailSettings " + C54359c.this.f134474a.mo185939a() + " success");
                        C54359c.this.f134475b = eVar;
                        ((AbstractC54318a.AbstractC54320b) C54359c.this.getView()).mo185851a(eVar);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("TAG_TRANSLATE_DISPLAY_SETTING_DETAIL_PRESENTER", "initLoadDetailSettings " + C54359c.this.f134474a.mo185939a() + " failed; err=" + errorResult.getDebugMsg());
                        ((AbstractC54318a.AbstractC54320b) C54359c.this.getView()).mo185852a(errorResult.getDisplayMsg());
                    }
                });
            }

            /* renamed from: a */
            public void mo185854a(final C54379e eVar) {
                Integer num;
                int i;
                if (eVar != null && eVar.mo185991b() != null) {
                    int value = eVar.mo185991b().getValue();
                    if (C54359c.this.f134475b == null) {
                        num = null;
                    } else {
                        num = Integer.valueOf(C54359c.this.f134475b.mo185991b().getValue());
                    }
                    if (value != num.intValue()) {
                        int i2 = 1;
                        if (eVar.mo185991b() == LanguageDisplayRule.WITH_ORIGINAL) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        String a = eVar.mo185989a();
                        if (C54359c.this.f134475b.mo185992c() != LanguageDisplayRule.WITH_ORIGINAL) {
                            i2 = 2;
                        }
                        TranslateHitPoint.m210263a(a, i, i2);
                        HashMap hashMap = new HashMap();
                        hashMap.put("display_type", Integer.valueOf(i));
                        hashMap.put("language_key", eVar.mo185989a());
                        C54115c.m210080a().mo178279a(C24358a.f60135c, hashMap);
                        ((AbstractC54318a.AbstractC54319a) C54359c.this.getModel()).mo185850a(eVar, new IGetDataCallback<Void>() {
                            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.C54359c.C543601.C543622 */

                            /* renamed from: a */
                            public void onSuccess(Void r2) {
                                C54359c.this.f134475b = eVar;
                                Log.m165389i("TAG_TRANSLATE_DISPLAY_SETTING_DETAIL_PRESENTER", "onItemUpdate " + eVar.mo185989a() + " success");
                                ((AbstractC54318a.AbstractC54320b) C54359c.this.getView()).mo185851a(eVar);
                            }

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                Log.m165383e("TAG_TRANSLATE_DISPLAY_SETTING_DETAIL_PRESENTER", "onItemUpdate " + eVar.mo185989a() + " failed; err=" + errorResult.getDebugMsg());
                                C54115c.m210080a().mo178278a(C24358a.f60136d, errorResult, null);
                                ((AbstractC54318a.AbstractC54320b) C54359c.this.getView()).mo185852a("");
                                if (C54359c.this.f134475b != null) {
                                    ((AbstractC54318a.AbstractC54320b) C54359c.this.getView()).mo185851a(C54359c.this.f134475b);
                                    return;
                                }
                                Log.m165383e("TAG_TRANSLATE_DISPLAY_SETTING_DETAIL_PRESENTER", "onItemUpdate revert " + eVar.mo185989a() + " failed; mCurrentSettingDetail is null");
                            }
                        });
                    }
                }
            }
        };
    }

    public C54359c(AbstractC54318a.AbstractC54319a<C54379e, LanguageDisplayRule, Void> aVar, AbstractC54318a.AbstractC54320b<C54379e> bVar, AbstractC54376b<LanguageDisplayRule> bVar2) {
        super(aVar, bVar);
        this.f134474a = bVar2;
    }
}
