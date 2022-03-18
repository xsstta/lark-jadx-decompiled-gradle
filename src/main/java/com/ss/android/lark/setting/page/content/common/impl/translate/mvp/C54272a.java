package com.ss.android.lark.setting.page.content.common.impl.translate.mvp;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.setting.page.content.common.dto.MineTranslateLanguageSetting;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54272a;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.mvp.a */
public class C54272a extends BasePresenter<AbstractC54282e.AbstractC54283a, AbstractC54282e.AbstractC54285b, AbstractC54282e.AbstractC54285b.AbstractC54286a> {

    /* renamed from: a */
    private AbstractC54282e.AbstractC54285b.AbstractC54286a f134342a;

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f134342a = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC54282e.AbstractC54285b.AbstractC54286a createViewDelegate() {
        C54276b bVar = new C54276b();
        this.f134342a = bVar;
        return bVar;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC54282e.AbstractC54283a) getModel()).mo185802a(new IGetDataCallback<MineTranslateLanguageSetting>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54272a.C542731 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m210739a() {
                if (C54272a.this.getView() != null) {
                    ((AbstractC54282e.AbstractC54285b) C54272a.this.getView()).mo185763a();
                }
            }

            /* renamed from: a */
            public void onSuccess(final MineTranslateLanguageSetting mineTranslateLanguageSetting) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54272a.C542731.RunnableC542741 */

                    public void run() {
                        ((AbstractC54282e.AbstractC54285b) C54272a.this.getView()).mo185764a(mineTranslateLanguageSetting.getSupportedLanguageList());
                    }
                });
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC54282e.AbstractC54285b) C54272a.this.getView()).mo185786d();
                UICallbackExecutor.executeDelayed(new Runnable() {
                    /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.$$Lambda$a$1$nbfnmt23DDitPag4hNurng_Z2A */

                    public final void run() {
                        C54272a.C542731.this.m210739a();
                    }
                }, 500);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.mvp.a$a */
    public class C54275a extends C54278b {
        private C54275a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m210741b(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
            ((AbstractC54282e.AbstractC54285b) C54272a.this.getView()).mo185764a(mineTranslateLanguageSetting.getSupportedLanguageList());
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54283a.AbstractC54284a, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54278b
        /* renamed from: a */
        public void mo185773a(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
            UICallbackExecutor.execute(new Runnable(mineTranslateLanguageSetting) {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.$$Lambda$a$a$7LODeJ95G0Wa6sfMnXJaF5nwKH8 */
                public final /* synthetic */ MineTranslateLanguageSetting f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C54272a.C54275a.this.m210741b((C54272a.C54275a) this.f$1);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m210742b(boolean z) {
            ((AbstractC54282e.AbstractC54285b) C54272a.this.getView()).mo185765a(z);
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54283a.AbstractC54284a, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54278b
        /* renamed from: a */
        public void mo185774a(boolean z) {
            UICallbackExecutor.execute(new Runnable(z) {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.$$Lambda$a$a$EaKr0OhneO0Gf_KGWbwCqwZC6xY */
                public final /* synthetic */ boolean f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C54272a.C54275a.this.m210742b((C54272a.C54275a) this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.mvp.a$b */
    public class C54276b extends C54281d {
        private C54276b() {
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54281d, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b.AbstractC54286a
        /* renamed from: a */
        public void mo185776a(Set<String> set) {
            ((AbstractC54282e.AbstractC54283a) C54272a.this.getModel()).mo185807a(set);
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54281d, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b.AbstractC54286a
        /* renamed from: a */
        public void mo185775a(List<String> list) {
            super.mo185775a(list);
            ((AbstractC54282e.AbstractC54285b) C54272a.this.getView()).mo185765a(false);
            ((AbstractC54282e.AbstractC54285b) C54272a.this.getView()).mo185780b();
            ((AbstractC54282e.AbstractC54283a) C54272a.this.getModel()).mo185806a(list, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54272a.C54276b.C542771 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC54282e.AbstractC54285b) C54272a.this.getView()).mo185784c();
                    ((AbstractC54282e.AbstractC54285b) C54272a.this.getView()).mo185783b(false);
                }

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    ((AbstractC54282e.AbstractC54285b) C54272a.this.getView()).mo185784c();
                    ((AbstractC54282e.AbstractC54285b) C54272a.this.getView()).mo185783b(bool.booleanValue());
                    ((AbstractC54282e.AbstractC54285b) C54272a.this.getView()).mo185763a();
                }
            }));
        }
    }

    public C54272a(AbstractC54282e.AbstractC54283a aVar, AbstractC54282e.AbstractC54285b bVar) {
        super(aVar, bVar);
        aVar.mo185803a(new C54275a());
    }
}
