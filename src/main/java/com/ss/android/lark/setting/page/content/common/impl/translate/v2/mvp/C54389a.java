package com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp;

import com.larksuite.component.metriclogger_constants.domains.translation.setting.p1099d.C24360a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.content.common.dto.MineTranslateLanguageSetting;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54278b;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54281d;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.C54389a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.a */
public class C54389a extends BasePresenter<AbstractC54282e.AbstractC54283a, AbstractC54282e.AbstractC54285b, AbstractC54282e.AbstractC54285b.AbstractC54286a> {

    /* renamed from: a */
    private AbstractC54282e.AbstractC54285b.AbstractC54286a f134554a;

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f134554a = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC54282e.AbstractC54285b.AbstractC54286a createViewDelegate() {
        C54392b bVar = new C54392b();
        this.f134554a = bVar;
        return bVar;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C54115c.m210080a().mo178279a(C24360a.f60141a, (Map<String, ? extends Object>) null);
        ((AbstractC54282e.AbstractC54283a) getModel()).mo185802a(new UIGetDataCallback(new IGetDataCallback<MineTranslateLanguageSetting>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.C54389a.C543901 */

            /* renamed from: a */
            public void onSuccess(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
                ((AbstractC54282e.AbstractC54285b) C54389a.this.getView()).mo185782b(mineTranslateLanguageSetting.getSupportedLanguageList());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC54282e.AbstractC54285b) C54389a.this.getView()).mo185787e();
                C54115c.m210080a().mo178278a(C24360a.f60142b, errorResult, null);
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.a$a */
    public class C54391a extends C54278b {
        private C54391a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m211156b(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
            ((AbstractC54282e.AbstractC54285b) C54389a.this.getView()).mo185782b(mineTranslateLanguageSetting.getSupportedLanguageList());
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54283a.AbstractC54284a, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54278b
        /* renamed from: a */
        public void mo185773a(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
            UICallbackExecutor.execute(new Runnable(mineTranslateLanguageSetting) {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.$$Lambda$a$a$8_Lq8r8LjsSaZoHwCHNTHZniWDA */
                public final /* synthetic */ MineTranslateLanguageSetting f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C54389a.C54391a.this.m211156b(this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.a$b */
    public class C54392b extends C54281d {
        private C54392b() {
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54281d, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b.AbstractC54286a
        /* renamed from: a */
        public void mo185794a(String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("target_language", str);
            C54115c.m210080a().mo178279a(C24360a.f60143c, hashMap);
            ((AbstractC54282e.AbstractC54283a) C54389a.this.getModel()).mo185805a(str, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.C54389a.C54392b.C543931 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C54115c.m210080a().mo178278a(C24360a.f60144d, errorResult, null);
                    ((AbstractC54282e.AbstractC54285b) C54389a.this.getView()).mo185783b(false);
                }
            }));
        }
    }

    public C54389a(AbstractC54282e.AbstractC54283a aVar, AbstractC54282e.AbstractC54285b bVar) {
        super(aVar, bVar);
        aVar.mo185803a(new C54391a());
    }
}
