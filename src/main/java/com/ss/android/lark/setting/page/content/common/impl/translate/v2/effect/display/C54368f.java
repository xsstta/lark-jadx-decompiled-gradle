package com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display;

import com.larksuite.component.metriclogger_constants.domains.translation.setting.p1097b.C24358a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.AbstractC54376b;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.LanguageDisplayRule;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.f */
public class C54368f extends BasePresenter<AbstractC54318a.AbstractC54322c, AbstractC54318a.AbstractC54324d<AbstractC54318a.AbstractC54324d.AbstractC54325a, LanguageDisplayRule>, AbstractC54318a.AbstractC54324d.AbstractC54325a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC54318a.AbstractC54324d.AbstractC54325a createViewDelegate() {
        return new AbstractC54318a.AbstractC54324d.AbstractC54325a() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.C54368f.C543702 */

            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54324d.AbstractC54325a
            /* renamed from: a */
            public void mo185859a() {
                C54115c.m210080a().mo178279a(C24358a.f60137e, (Map<String, ? extends Object>) null);
                ((AbstractC54318a.AbstractC54322c) C54368f.this.getModel()).mo185855a(new IGetDataCallback<List<AbstractC54376b<LanguageDisplayRule>>>() {
                    /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.C54368f.C543702.C543711 */

                    /* renamed from: a */
                    public void onSuccess(List<AbstractC54376b<LanguageDisplayRule>> list) {
                        ((AbstractC54318a.AbstractC54324d) C54368f.this.getView()).mo185838a(list);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        C54115c.m210080a().mo178278a(C24358a.f60138f, errorResult, null);
                        Log.m165383e("TAG_TRANSLATE_DISPLAY_SETTING_FACADE_PRESENTER", "init load settings failed; err= " + errorResult);
                        ((AbstractC54318a.AbstractC54324d) C54368f.this.getView()).mo185837a(errorResult.getDisplayMsg());
                    }
                });
            }

            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54324d.AbstractC54325a
            /* renamed from: a */
            public void mo185860a(String str) {
                ((AbstractC54318a.AbstractC54322c) C54368f.this.getModel()).mo185857a(str, new IGetDataCallback<List<AbstractC54376b<LanguageDisplayRule>>>() {
                    /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.C54368f.C543702.C543722 */

                    /* renamed from: a */
                    public void onSuccess(List<AbstractC54376b<LanguageDisplayRule>> list) {
                        ((AbstractC54318a.AbstractC54324d) C54368f.this.getView()).mo185838a(list);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("TAG_TRANSLATE_DISPLAY_SETTING_FACADE_PRESENTER", "clickSearch failed; err= " + errorResult);
                        ((AbstractC54318a.AbstractC54324d) C54368f.this.getView()).mo185837a(errorResult.getDisplayMsg());
                    }
                });
            }
        };
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC54318a.AbstractC54322c) getModel()).mo185856a(new AbstractC54318a.AbstractC54322c.AbstractC54323a() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.$$Lambda$f$0A2_ATVa0Z9mlBeC9yClV708hYs */

            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54322c.AbstractC54323a
            public final void onSettingUpdated(List list) {
                C54368f.this.m211063a(list);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m211063a(final List list) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.C54368f.RunnableC543691 */

            public void run() {
                if (list != null) {
                    ((AbstractC54318a.AbstractC54324d) C54368f.this.getView()).mo185838a(list);
                }
            }
        });
    }

    public C54368f(AbstractC54318a.AbstractC54322c<LanguageDisplayRule> cVar, AbstractC54318a.AbstractC54324d dVar) {
        super(cVar, dVar);
    }
}
