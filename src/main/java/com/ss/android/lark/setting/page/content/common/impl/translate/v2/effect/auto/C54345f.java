package com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto;

import com.larksuite.component.metriclogger_constants.domains.translation.setting.p1096a.C24357a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.AbstractC54376b;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.C54377c;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.f */
public class C54345f extends BasePresenter<AbstractC54318a.AbstractC54322c, AbstractC54318a.AbstractC54324d<AbstractC54318a.AbstractC54324d.AbstractC54325a, C54377c>, AbstractC54318a.AbstractC54324d.AbstractC54325a> {
    /* renamed from: a */
    public AbstractC54318a.AbstractC54324d.AbstractC54325a createViewDelegate() {
        return new AbstractC54318a.AbstractC54324d.AbstractC54325a() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.C54345f.C543472 */

            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54324d.AbstractC54325a
            /* renamed from: a */
            public void mo185859a() {
                C54115c.m210080a().mo178279a(C24357a.f60131g, (Map<String, ? extends Object>) null);
                ((AbstractC54318a.AbstractC54322c) C54345f.this.getModel()).mo185855a(new IGetDataCallback<List<AbstractC54376b<C54377c>>>() {
                    /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.C54345f.C543472.C543481 */

                    /* renamed from: a */
                    public void onSuccess(List<AbstractC54376b<C54377c>> list) {
                        ((AbstractC54318a.AbstractC54324d) C54345f.this.getView()).mo185838a(list);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        C54115c.m210080a().mo178278a(C24357a.f60132h, errorResult, null);
                        Log.m165383e("TAG_TRANSLATE_AUTO_TRANSLATE_SETTING_FACADE_PRESENTER", "init loadsettings failed; err= " + errorResult);
                        ((AbstractC54318a.AbstractC54324d) C54345f.this.getView()).mo185837a(errorResult.getDisplayMsg());
                    }
                });
            }

            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54324d.AbstractC54325a
            /* renamed from: a */
            public void mo185860a(String str) {
                ((AbstractC54318a.AbstractC54322c) C54345f.this.getModel()).mo185857a(str, new IGetDataCallback<List<AbstractC54376b<C54377c>>>() {
                    /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.C54345f.C543472.C543492 */

                    /* renamed from: a */
                    public void onSuccess(List<AbstractC54376b<C54377c>> list) {
                        ((AbstractC54318a.AbstractC54324d) C54345f.this.getView()).mo185838a(list);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("TAG_TRANSLATE_AUTO_TRANSLATE_SETTING_FACADE_PRESENTER", "clickSearch failed; err= " + errorResult);
                        ((AbstractC54318a.AbstractC54324d) C54345f.this.getView()).mo185837a(errorResult.getDisplayMsg());
                    }
                });
            }
        };
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC54318a.AbstractC54322c) getModel()).mo185856a(new AbstractC54318a.AbstractC54322c.AbstractC54323a() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.$$Lambda$f$hPSg4jL_qk78VAviAexBktInSTg */

            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54322c.AbstractC54323a
            public final void onSettingUpdated(List list) {
                C54345f.lambda$hPSg4jL_qk78VAviAexBktInSTg(C54345f.this, list);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m210984a(final List list) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.C54345f.RunnableC543461 */

            public void run() {
                if (list != null) {
                    ((AbstractC54318a.AbstractC54324d) C54345f.this.getView()).mo185838a(list);
                }
            }
        });
    }

    public C54345f(AbstractC54318a.AbstractC54322c<C54377c> cVar, AbstractC54318a.AbstractC54324d dVar) {
        super(cVar, dVar);
    }
}
