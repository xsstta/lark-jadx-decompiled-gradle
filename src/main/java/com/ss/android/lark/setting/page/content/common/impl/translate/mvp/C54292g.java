package com.ss.android.lark.setting.page.content.common.impl.translate.mvp;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.setting.page.content.common.dto.LanguageInfo;
import com.ss.android.lark.setting.page.content.common.dto.MineTranslateLanguageSetting;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54292g;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.mvp.g */
public class C54292g extends BasePresenter<AbstractC54282e.AbstractC54283a, AbstractC54282e.AbstractC54285b, AbstractC54282e.AbstractC54285b.AbstractC54286a> {

    /* renamed from: a */
    public LanguageInfo f134358a;

    /* renamed from: b */
    private AbstractC54282e.AbstractC54285b.AbstractC54286a f134359b;

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f134359b = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC54282e.AbstractC54285b.AbstractC54286a createViewDelegate() {
        C54295b bVar = new C54295b();
        this.f134359b = bVar;
        return bVar;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        LanguageInfo languageInfo = this.f134358a;
        if (languageInfo == null || TextUtils.isEmpty(languageInfo.getKey())) {
            ((AbstractC54282e.AbstractC54285b) getView()).mo185769c(true);
        } else {
            ((AbstractC54282e.AbstractC54285b) getView()).mo185768a(this.f134358a.getDisplayName());
            ((AbstractC54282e.AbstractC54285b) getView()).mo185767a(this.f134358a.getDisplayRule());
            ((AbstractC54282e.AbstractC54285b) getView()).mo185769c(false);
        }
        ((AbstractC54282e.AbstractC54283a) getModel()).mo185802a(new UIGetDataCallback(new IGetDataCallback<MineTranslateLanguageSetting>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54292g.C542931 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m210832a() {
                if (C54292g.this.getView() != null) {
                    ((AbstractC54282e.AbstractC54285b) C54292g.this.getView()).mo185763a();
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (C54292g.this.f134358a == null) {
                    ((AbstractC54282e.AbstractC54285b) C54292g.this.getView()).mo185786d();
                    UICallbackExecutor.executeDelayed(new Runnable() {
                        /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.$$Lambda$g$1$KqmN4Ib66hxgqGDBeVKvQc4V64 */

                        public final void run() {
                            C54292g.C542931.this.m210832a();
                        }
                    }, 500);
                }
            }

            /* renamed from: a */
            public void onSuccess(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
                if (C54292g.this.f134358a == null) {
                    C54292g.this.f134358a = new LanguageInfo("", "global");
                    C54292g.this.f134358a.setDisplayRule(mineTranslateLanguageSetting.getDefaultDisplayRule());
                    ((AbstractC54282e.AbstractC54285b) C54292g.this.getView()).mo185767a(mineTranslateLanguageSetting.getDefaultDisplayRule());
                }
            }
        }));
    }

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.mvp.g$a */
    private class C54294a extends C54278b {
        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54283a.AbstractC54284a, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54278b
        /* renamed from: a */
        public void mo185774a(boolean z) {
        }

        private C54294a() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.mvp.g$b */
    public class C54295b extends C54281d {
        private C54295b() {
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54281d, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b.AbstractC54286a
        /* renamed from: a */
        public void mo185776a(Set<String> set) {
            ArrayList arrayList = new ArrayList(set);
            if (!CollectionUtils.isEmpty(arrayList)) {
                final int intValue = Integer.valueOf((String) arrayList.get(0)).intValue();
                if (C54292g.this.f134358a != null && C54292g.this.f134358a.getDisplayRule() != intValue) {
                    ((AbstractC54282e.AbstractC54285b) C54292g.this.getView()).mo185780b();
                    ((AbstractC54282e.AbstractC54283a) C54292g.this.getModel()).mo185804a(C54292g.this.f134358a.getKey(), intValue, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                        /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54292g.C54295b.C542961 */

                        /* renamed from: a */
                        public void onSuccess(Boolean bool) {
                            C54292g.this.f134358a.setDisplayRule(intValue);
                            ((AbstractC54282e.AbstractC54285b) C54292g.this.getView()).mo185784c();
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            ((AbstractC54282e.AbstractC54285b) C54292g.this.getView()).mo185784c();
                            ((AbstractC54282e.AbstractC54285b) C54292g.this.getView()).mo185786d();
                        }
                    }));
                }
            }
        }
    }

    public C54292g(AbstractC54282e.AbstractC54283a aVar, AbstractC54282e.AbstractC54285b bVar, LanguageInfo languageInfo) {
        super(aVar, bVar);
        aVar.mo185803a(new C54294a());
        this.f134358a = languageInfo;
    }
}
