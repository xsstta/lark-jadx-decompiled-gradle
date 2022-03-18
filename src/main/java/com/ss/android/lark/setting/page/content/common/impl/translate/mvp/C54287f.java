package com.ss.android.lark.setting.page.content.common.impl.translate.mvp;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.setting.page.content.common.dto.MineTranslateLanguageSetting;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54287f;
import java.util.Set;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.mvp.f */
public class C54287f extends BasePresenter<AbstractC54282e.AbstractC54283a, AbstractC54282e.AbstractC54285b, AbstractC54282e.AbstractC54285b.AbstractC54286a> {

    /* renamed from: a */
    private AbstractC54282e.AbstractC54285b.AbstractC54286a f134353a;

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f134353a = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC54282e.AbstractC54285b.AbstractC54286a createViewDelegate() {
        C54290b bVar = new C54290b();
        this.f134353a = bVar;
        return bVar;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC54282e.AbstractC54283a) getModel()).mo185802a(new UIGetDataCallback(new IGetDataCallback<MineTranslateLanguageSetting>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54287f.C542881 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m210822a() {
                if (C54287f.this.getView() != null) {
                    ((AbstractC54282e.AbstractC54285b) C54287f.this.getView()).mo185763a();
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC54282e.AbstractC54285b) C54287f.this.getView()).mo185786d();
                UICallbackExecutor.executeDelayed(new Runnable() {
                    /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.$$Lambda$f$1$z7L5sAxgq98DZLU8RX1mh4F7K0 */

                    public final void run() {
                        C54287f.C542881.this.m210822a();
                    }
                }, 500);
            }

            /* renamed from: a */
            public void onSuccess(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
                ((AbstractC54282e.AbstractC54285b) C54287f.this.getView()).mo185766a(mineTranslateLanguageSetting.getDefaultDisplayRule(), mineTranslateLanguageSetting.getSupportedLanguageList());
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.mvp.f$a */
    public class C54289a extends C54278b {
        private C54289a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m210825b(boolean z) {
            ((AbstractC54282e.AbstractC54285b) C54287f.this.getView()).mo185765a(z);
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54283a.AbstractC54284a, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54278b
        /* renamed from: a */
        public void mo185773a(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
            UICallbackExecutor.execute(new Runnable(mineTranslateLanguageSetting) {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.$$Lambda$f$a$lQ9jphhCiUZXaEz2A9AwBZXKDk */
                public final /* synthetic */ MineTranslateLanguageSetting f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C54287f.C54289a.this.m210824b((C54287f.C54289a) this.f$1);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m210824b(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
            ((AbstractC54282e.AbstractC54285b) C54287f.this.getView()).mo185766a(mineTranslateLanguageSetting.getDefaultDisplayRule(), mineTranslateLanguageSetting.getSupportedLanguageList());
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54283a.AbstractC54284a, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54278b
        /* renamed from: a */
        public void mo185774a(boolean z) {
            UICallbackExecutor.execute(new Runnable(z) {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.$$Lambda$f$a$JT7aJb7LbkzvyVyKIL5e1fN3nc */
                public final /* synthetic */ boolean f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C54287f.C54289a.this.m210825b((C54287f.C54289a) this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.mvp.f$b */
    public class C54290b extends C54281d {
        private C54290b() {
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54281d, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b.AbstractC54286a
        /* renamed from: a */
        public void mo185793a(int i, Set<String> set) {
            super.mo185793a(i, set);
            ((AbstractC54282e.AbstractC54283a) C54287f.this.getModel()).mo185800a(i, set);
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54281d, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b.AbstractC54286a
        /* renamed from: b */
        public void mo185797b(int i, Set<String> set) {
            super.mo185797b(i, set);
            ((AbstractC54282e.AbstractC54285b) C54287f.this.getView()).mo185765a(false);
            ((AbstractC54282e.AbstractC54285b) C54287f.this.getView()).mo185780b();
            ((AbstractC54282e.AbstractC54283a) C54287f.this.getModel()).mo185801a(i, set, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54287f.C54290b.C542911 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC54282e.AbstractC54285b) C54287f.this.getView()).mo185784c();
                    ((AbstractC54282e.AbstractC54285b) C54287f.this.getView()).mo185783b(false);
                }

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    ((AbstractC54282e.AbstractC54285b) C54287f.this.getView()).mo185784c();
                    ((AbstractC54282e.AbstractC54285b) C54287f.this.getView()).mo185783b(bool.booleanValue());
                    ((AbstractC54282e.AbstractC54285b) C54287f.this.getView()).mo185763a();
                }
            }));
        }
    }

    public C54287f(AbstractC54282e.AbstractC54283a aVar, AbstractC54282e.AbstractC54285b bVar) {
        super(aVar, bVar);
        aVar.mo185803a(new C54289a());
    }
}
