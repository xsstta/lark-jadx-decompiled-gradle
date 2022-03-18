package com.ss.android.lark.setting.page.content.common.impl.locale.mvp;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.newemoji.EmojiMapManager;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dependency.ISettingDependency;
import com.ss.android.lark.setting.page.content.common.impl.locale.C54183b;
import com.ss.android.lark.setting.page.content.common.impl.locale.LanguagePickBean;
import com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c;
import com.ss.android.lark.setting.page.content.common.statistics.SwitchLanguageHitPoint;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.locale.mvp.f */
public class C54213f extends BasePresenter<AbstractC54204c.AbstractC54205a, AbstractC54204c.AbstractC54207b, AbstractC54204c.AbstractC54207b.AbstractC54208a> {

    /* renamed from: a */
    public final ISettingDependency.ILanguageDependency f134217a = C54115c.m210080a().mo178289d();

    /* renamed from: b */
    private C54219b f134218b;

    /* renamed from: f */
    private AbstractC54204c.AbstractC54205a.AbstractC54206a m210508f() {
        return new C54218a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f134218b = null;
    }

    /* renamed from: e */
    public void mo185546e() {
        C54115c.m210080a().mo178272H();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.locale.mvp.f$b */
    public class C54219b implements AbstractC54204c.AbstractC54207b.AbstractC54208a {
        @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54207b.AbstractC54208a
        /* renamed from: c */
        public Set<String> mo185538c() {
            return ((AbstractC54204c.AbstractC54205a) C54213f.this.getModel()).mo185529e();
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54207b.AbstractC54208a
        /* renamed from: b */
        public void mo185537b() {
            SwitchLanguageHitPoint.m210259a(((AbstractC54204c.AbstractC54205a) C54213f.this.getModel()).mo185517a(), ((AbstractC54204c.AbstractC54205a) C54213f.this.getModel()).mo185524b(), ((AbstractC54204c.AbstractC54205a) C54213f.this.getModel()).mo185526c());
            C54213f.this.mo185543b();
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54207b.AbstractC54208a
        /* renamed from: a */
        public void mo185535a() {
            Locale a = ((AbstractC54204c.AbstractC54205a) C54213f.this.getModel()).mo185517a();
            Locale b = ((AbstractC54204c.AbstractC54205a) C54213f.this.getModel()).mo185524b();
            if (b == null || !a.getLanguage().equals(b.getLanguage()) || !a.getCountry().equals(b.getCountry())) {
                ((AbstractC54204c.AbstractC54207b) C54213f.this.getView()).mo185493a(((AbstractC54204c.AbstractC54205a) C54213f.this.getModel()).mo185528d());
                return;
            }
            ((AbstractC54204c.AbstractC54207b) C54213f.this.getView()).mo185497b(false);
            C54213f.this.mo185543b();
        }

        private C54219b() {
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54207b.AbstractC54208a
        /* renamed from: a */
        public void mo185536a(LanguagePickBean languagePickBean) {
            new C54209d((AbstractC54204c.AbstractC54205a) C54213f.this.getModel(), (AbstractC54204c.AbstractC54207b) C54213f.this.getView(), C54213f.this.f134217a).mo185540a(languagePickBean);
        }
    }

    /* renamed from: g */
    private void m210509g() {
        EmojiMapManager.f136337c.mo188264a(new EmojiMapManager.IResetEmojisCallback() {
            /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.C54213f.C542163 */

            @Override // com.ss.android.lark.newemoji.EmojiMapManager.IResetEmojisCallback
            /* renamed from: a */
            public void mo185549a() {
                C54213f.this.mo185546e();
                C54213f.this.mo185545d();
            }
        });
    }

    /* renamed from: h */
    private void m210510h() {
        UICallbackExecutor.executeDelayed(new Runnable() {
            /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.C54213f.RunnableC542174 */

            public void run() {
                ((AbstractC54204c.AbstractC54207b) C54213f.this.getView()).mo185496b();
                ((AbstractC54204c.AbstractC54207b) C54213f.this.getView()).mo185497b(false);
                ((AbstractC54204c.AbstractC54207b) C54213f.this.getView()).mo185495a(true);
                C53241h.m205898b("MineLanguageSettingPresenter", "hide switch language loading, begin switch app language");
                Locale g = ((AbstractC54204c.AbstractC54205a) C54213f.this.getModel()).mo185531g();
                if (g != null) {
                    C54183b.m210396a().mo185489a(g);
                }
            }
        }, 300);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC54204c.AbstractC54207b.AbstractC54208a createViewDelegate() {
        C54219b bVar = new C54219b();
        this.f134218b = bVar;
        return bVar;
    }

    /* renamed from: c */
    public void mo185544c() {
        m210509g();
        ((AbstractC54204c.AbstractC54205a) getModel()).mo185532h();
        m210510h();
    }

    /* renamed from: d */
    public void mo185545d() {
        C54115c.m210080a().mo178293f().mo178322a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC54204c.AbstractC54205a) getModel()).mo185518a(new IGetDataCallback<List<LanguagePickBean>>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.C54213f.C542141 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(List<LanguagePickBean> list) {
                ((AbstractC54204c.AbstractC54207b) C54213f.this.getView()).mo185494a(list);
            }
        });
    }

    /* renamed from: b */
    public void mo185543b() {
        Locale b = ((AbstractC54204c.AbstractC54205a) getModel()).mo185524b();
        if (((AbstractC54204c.AbstractC54205a) getModel()).mo185525b(b)) {
            this.f134217a.mo178342b(b);
            ((AbstractC54204c.AbstractC54207b) getView()).mo185497b(false);
            return;
        }
        C53241h.m205898b("MineLanguageSettingPresenter", "show switch language loading");
        ((AbstractC54204c.AbstractC54207b) getView()).mo185491a();
        if (((AbstractC54204c.AbstractC54205a) getModel()).mo185530f()) {
            C53241h.m205898b("MineLanguageSettingPresenter", "from login switch");
            this.f134217a.mo178342b(b);
            m210510h();
            SwitchLanguageHitPoint.m210258a(((AbstractC54204c.AbstractC54205a) getModel()).mo185524b(), ((AbstractC54204c.AbstractC54205a) getModel()).mo185526c());
            return;
        }
        ((AbstractC54204c.AbstractC54205a) getModel()).mo185522a(b, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.C54213f.C542152 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                C54213f.this.mo185544c();
                SwitchLanguageHitPoint.m210258a(((AbstractC54204c.AbstractC54205a) C54213f.this.getModel()).mo185524b(), ((AbstractC54204c.AbstractC54205a) C54213f.this.getModel()).mo185526c());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C53241h.m205894a("MineLanguageSettingPresenter", "putMineLanguageSetting failed: " + errorResult.toString());
                ((AbstractC54204c.AbstractC54207b) C54213f.this.getView()).mo185496b();
                C53241h.m205898b("MineLanguageSettingPresenter", "hide switch language loading");
                ((AbstractC54204c.AbstractC54207b) C54213f.this.getView()).mo185495a(false);
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.locale.mvp.f$a */
    public class C54218a implements AbstractC54204c.AbstractC54205a.AbstractC54206a {
        private C54218a() {
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54205a.AbstractC54206a
        /* renamed from: a */
        public void mo185533a(List<LanguagePickBean> list) {
            ((AbstractC54204c.AbstractC54207b) C54213f.this.getView()).mo185494a(list);
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54205a.AbstractC54206a
        /* renamed from: a */
        public void mo185534a(boolean z) {
            if (z) {
                ((AbstractC54204c.AbstractC54207b) C54213f.this.getView()).mo185497b(true);
            } else {
                ((AbstractC54204c.AbstractC54207b) C54213f.this.getView()).mo185497b(false);
            }
            C53241h.m205898b("MineLanguageSettingPresenter", "start updating language list");
            ((AbstractC54204c.AbstractC54207b) C54213f.this.getView()).mo185499c();
        }
    }

    public C54213f(AbstractC54204c.AbstractC54205a aVar, AbstractC54204c.AbstractC54207b bVar, boolean z) {
        super(aVar, bVar);
        aVar.mo185520a(m210508f());
        ((AbstractC54204c.AbstractC54205a) getModel()).mo185523a(z);
    }
}
