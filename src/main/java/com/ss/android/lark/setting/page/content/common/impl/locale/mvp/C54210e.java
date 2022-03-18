package com.ss.android.lark.setting.page.content.common.impl.locale.mvp;

import android.app.Application;
import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dependency.ISettingDependency;
import com.ss.android.lark.setting.page.content.common.dto.MineDeviceSetting;
import com.ss.android.lark.setting.page.content.common.impl.locale.LanguagePickBean;
import com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c;
import com.ss.android.lark.setting.page.content.common.impl.locale.mvp.C54190a;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.C57852m;
import com.ss.android.lark.utils.LarkContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.locale.mvp.e */
public class C54210e extends BaseModel implements AbstractC54204c.AbstractC54205a {

    /* renamed from: a */
    public final ISettingDependency.ILanguageDependency f134204a = C54115c.m210080a().mo178289d();

    /* renamed from: b */
    private Map<String, Integer> f134205b = new HashMap();

    /* renamed from: c */
    private final ISettingDependency.IDeviceDependency f134206c = C54115c.m210080a().mo178286c();

    /* renamed from: d */
    private Locale f134207d;

    /* renamed from: e */
    private Context f134208e;

    /* renamed from: f */
    private AbstractC54204c.AbstractC54205a.AbstractC54206a f134209f;

    /* renamed from: g */
    private boolean f134210g;

    /* renamed from: h */
    private C54190a.AbstractC54201a f134211h = new C54190a.AbstractC54201a() {
        /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.C54210e.C542111 */

        @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.C54190a.AbstractC54201a
        /* renamed from: a */
        public void mo185512a(IGetDataCallback<List<LanguagePickBean>> iGetDataCallback) {
            C54210e.this.mo185518a(iGetDataCallback);
        }
    };

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54205a
    /* renamed from: b */
    public Locale mo185524b() {
        return this.f134207d;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54205a
    /* renamed from: f */
    public boolean mo185530f() {
        return this.f134210g;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54205a
    /* renamed from: a */
    public Locale mo185517a() {
        return this.f134204a.mo178339a();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54205a
    /* renamed from: c */
    public Locale mo185526c() {
        return this.f134204a.mo178348g();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54205a
    /* renamed from: e */
    public Set<String> mo185529e() {
        return C54190a.m210429d();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54205a
    /* renamed from: h */
    public void mo185532h() {
        C54115c.m210080a().mo178271G();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f134209f = null;
        C54190a.m210426b();
        C54190a.m210423a(false);
        super.destroy();
    }

    /* renamed from: j */
    private boolean m210488j() {
        if (!C57824f.m224469c()) {
            return false;
        }
        if (mo185530f()) {
            return C54115c.m210080a().mo178289d().mo178350i();
        }
        return C54115c.m210080a().mo178291e().mo178337a("support.more.language.enable");
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f134208e = C54115c.m210080a().mo178267C();
        if (C54115c.m210080a().mo178291e().mo178336a()) {
            this.f134205b.put("ja_JP", Integer.valueOf((int) R.string.Lark_Legacy_LanguageJapanese));
        }
        m210487i();
        C54190a.m210420a(this.f134211h);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54205a
    /* renamed from: d */
    public String mo185528d() {
        Locale locale = this.f134207d;
        if (locale == null) {
            return null;
        }
        String a = this.f134204a.mo178338a(locale);
        if (this.f134205b.get(a) != null) {
            return this.f134208e.getResources().getString(this.f134205b.get(a).intValue());
        }
        Log.m165382e("Get the language failed");
        return null;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54205a
    /* renamed from: g */
    public Locale mo185531g() {
        if (this.f134204a.mo178340a((Application) C54115c.m210080a().mo178267C(), this.f134204a.mo178339a())) {
            return this.f134204a.mo178339a();
        }
        return null;
    }

    /* renamed from: i */
    private void m210487i() {
        this.f134205b.put("zh_CN", Integer.valueOf((int) R.string.Lark_Legacy_LanguageChineseSimplified));
        this.f134205b.put("en_US", Integer.valueOf((int) R.string.Lark_Legacy_LanguageEnglish));
        boolean a = C54115c.m210080a().mo178291e().mo178337a("lark.i18n.traditional.chinese");
        Integer valueOf = Integer.valueOf((int) R.string.Lark_Legacy_LanguageChineseTraditionalTW);
        Integer valueOf2 = Integer.valueOf((int) R.string.Lark_Legacy_LanguageChineseTraditional);
        if (a || C57744a.m224104a().getBoolean("feature_key_traditional_chinese_enable_gsp", false)) {
            if (C54115c.m210080a().mo178289d().mo178351j()) {
                this.f134205b.put("zh_HK", valueOf2);
                this.f134205b.put("zh_TW", valueOf);
            } else {
                this.f134205b.put("zh_HK", Integer.valueOf((int) R.string.Lark_Legacy_LanguageChineseTraditionalFeishu));
                this.f134205b.put("zh_TW", Integer.valueOf((int) R.string.Lark_Legacy_LanguageChineseTraditionalTWFeishu));
            }
        }
        if (!C54115c.m210080a().mo178289d().mo178351j() && C57852m.m224554a(LarkContext.getApplication())) {
            m210489k();
            this.f134205b.put("sq_", Integer.valueOf((int) R.string.Lark_Legacy_TranslateToKey));
            this.f134205b.put("zh_HK", valueOf2);
            this.f134205b.put("zh_TW", valueOf);
        }
        if (m210488j()) {
            m210489k();
        }
    }

    /* renamed from: k */
    private void m210489k() {
        this.f134205b.put("it_IT", Integer.valueOf((int) R.string.Lark_Legacy_LanguageItaliano));
        this.f134205b.put("es_ES", Integer.valueOf((int) R.string.Lark_Legacy_LanguageEspanol));
        this.f134205b.put("de_DE", Integer.valueOf((int) R.string.Lark_Legacy_LanguageDeutsch));
        this.f134205b.put("fr_FR", Integer.valueOf((int) R.string.Lark_Legacy_LanguageFrancais));
        this.f134205b.put("pt_BR", Integer.valueOf((int) R.string.Lark_Legacy_LanguageBrazilPortugues));
        this.f134205b.put("id_ID", Integer.valueOf((int) R.string.Lark_Legacy_LanguageIndonesia));
        this.f134205b.put("vi_VN", Integer.valueOf((int) R.string.Lark_Legacy_LanguageTiengviet));
        this.f134205b.put("th_TH", Integer.valueOf((int) R.string.Lark_Legacy_LanguageThai));
        this.f134205b.put("ko_KR", Integer.valueOf((int) R.string.Lark_Legacy_LanguageKorean));
        this.f134205b.put("ru_RU", Integer.valueOf((int) R.string.Lark_Legacy_LanguageRussian));
        this.f134205b.put("hi_IN", Integer.valueOf((int) R.string.Lark_Legacy_LanguageHindi));
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54205a
    /* renamed from: a */
    public void mo185519a(LanguagePickBean languagePickBean) {
        C54190a.m210419a(languagePickBean);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54205a
    /* renamed from: c */
    public void mo185527c(Locale locale) {
        C54190a.m210422a(locale);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54205a
    /* renamed from: a */
    public void mo185520a(AbstractC54204c.AbstractC54205a.AbstractC54206a aVar) {
        this.f134209f = aVar;
        C54190a.m210421a(aVar);
        C54190a.m210423a(true);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54205a
    /* renamed from: b */
    public boolean mo185525b(Locale locale) {
        if (locale != null) {
            return this.f134204a.mo178341a(this.f134208e, locale);
        }
        return this.f134204a.mo178341a(this.f134208e, this.f134204a.mo178346e());
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54205a
    /* renamed from: a */
    public void mo185518a(IGetDataCallback<List<LanguagePickBean>> iGetDataCallback) {
        Locale a = this.f134204a.mo178339a();
        Locale e = this.f134204a.mo178346e();
        ArrayList arrayList = new ArrayList();
        List<Locale> f = this.f134204a.mo178347f();
        this.f134204a.mo178348g();
        m210486a(a, e, arrayList);
        for (Locale locale : f) {
            LanguagePickBean a2 = m210485a(locale, a, false);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        iGetDataCallback.onSuccess(arrayList);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54205a
    /* renamed from: a */
    public void mo185521a(Locale locale) {
        this.f134207d = locale;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54205a
    /* renamed from: a */
    public void mo185523a(boolean z) {
        this.f134210g = z;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54205a
    /* renamed from: a */
    public void mo185522a(final Locale locale, final IGetDataCallback<Boolean> iGetDataCallback) {
        String a = this.f134206c.mo178325a();
        if (locale == null) {
            locale = this.f134204a.mo178346e();
        }
        Log.m165389i("MineLanguageSettingMode", "locale: " + locale.toLanguageTag());
        final String a2 = this.f134204a.mo178338a(locale);
        this.f134206c.mo178326a(a, a2, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<MineDeviceSetting>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.C54210e.C542122 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("MineLanguageSettingMode", "save languageSetting failed");
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(MineDeviceSetting mineDeviceSetting) {
                if (mineDeviceSetting == null || mineDeviceSetting.getLocaleIdentifier() == null) {
                    Log.m165383e("MineLanguageSettingMode", "save languageSetting failed");
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(new ErrorResult("put LanguageSetting failed"));
                        return;
                    }
                    return;
                }
                Log.m165389i("MineLanguageSettingMode", "save languageSetting success: " + a2);
                C54210e.this.f134204a.mo178342b(locale);
                IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                if (iGetDataCallback2 != null) {
                    iGetDataCallback2.onSuccess(true);
                }
            }
        }));
    }

    /* renamed from: a */
    private void m210486a(Locale locale, Locale locale2, List<LanguagePickBean> list) {
        LanguagePickBean a = m210485a(locale2, locale, true);
        if (a != null) {
            list.add(a);
        }
    }

    /* renamed from: a */
    private LanguagePickBean m210485a(Locale locale, Locale locale2, boolean z) {
        String a = this.f134204a.mo178338a(locale);
        if (this.f134205b.get(a) == null) {
            Log.m165382e("Get the language failed");
            return null;
        }
        LanguagePickBean languagePickBean = new LanguagePickBean();
        if (z) {
            languagePickBean.mo185467a(true);
        }
        if (z) {
            if (this.f134204a.mo178349h()) {
                languagePickBean.mo185464a(1);
            } else {
                languagePickBean.mo185464a(2);
            }
        } else if (this.f134204a.mo178349h()) {
            languagePickBean.mo185464a(2);
        } else if (!locale.getCountry().equals(locale2.getCountry()) || !locale.getLanguage().equals(locale2.getLanguage())) {
            languagePickBean.mo185464a(2);
        } else {
            languagePickBean.mo185464a(1);
        }
        languagePickBean.mo185466a(locale);
        languagePickBean.mo185465a(this.f134208e.getResources().getString(this.f134205b.get(a).intValue()));
        return languagePickBean;
    }
}
