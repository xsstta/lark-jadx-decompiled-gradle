package com.ss.android.lark.setting.page.content.common.impl.locale.mvp;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.dependency.ISettingDependency;
import com.ss.android.lark.setting.page.content.common.impl.locale.LanguagePickBean;
import com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c;
import java.util.Locale;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.locale.mvp.d */
public class C54209d {

    /* renamed from: a */
    private AbstractC54204c.AbstractC54205a f134201a;

    /* renamed from: b */
    private AbstractC54204c.AbstractC54207b f134202b;

    /* renamed from: c */
    private ISettingDependency.ILanguageDependency f134203c;

    /* renamed from: b */
    private AbstractC54204c.AbstractC54205a m210481b() {
        return this.f134201a;
    }

    /* renamed from: c */
    private AbstractC54204c.AbstractC54207b m210482c() {
        return this.f134202b;
    }

    /* renamed from: a */
    public void mo185539a() {
        m210481b().mo185527c(m210481b().mo185524b());
    }

    /* renamed from: a */
    public void mo185540a(LanguagePickBean languagePickBean) {
        Locale locale;
        boolean z;
        Locale a = m210481b().mo185517a();
        boolean z2 = false;
        if (languagePickBean == null) {
            if (this.f134203c.mo178349h()) {
                m210482c().mo185497b(false);
            } else {
                m210482c().mo185497b(true);
            }
            locale = null;
        } else {
            if (languagePickBean.mo185469c() == 3) {
                z = true;
            } else {
                z = false;
            }
            Locale a2 = languagePickBean.mo185463a();
            if (a2 == null) {
                m210482c().mo185497b(false);
                return;
            }
            if (a.equals(a2)) {
                m210482c().mo185497b(false);
            } else if (z) {
                m210482c().mo185497b(false);
            } else {
                m210482c().mo185497b(true);
            }
            z2 = z;
            locale = a2;
        }
        m210481b().mo185521a(locale);
        m210481b().mo185519a(languagePickBean);
        C54190a.m210430e();
        if (languagePickBean != null && !"en-US".equals(languagePickBean.mo185463a().toLanguageTag())) {
            boolean d = m210482c().mo185500d();
            if (!z2) {
                return;
            }
            if (d) {
                mo185539a();
                return;
            }
            languagePickBean.mo185464a(4);
            Log.m165389i("DynamicDownloadLanguageHelper", "network status：" + d + ",show retry");
            m210482c().mo185499c();
            m210482c().mo185501e();
        }
    }

    public C54209d(AbstractC54204c.AbstractC54205a aVar, AbstractC54204c.AbstractC54207b bVar, ISettingDependency.ILanguageDependency kVar) {
        this.f134201a = aVar;
        this.f134202b = bVar;
        this.f134203c = kVar;
    }
}
