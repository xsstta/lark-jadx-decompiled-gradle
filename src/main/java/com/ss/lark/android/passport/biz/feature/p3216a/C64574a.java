package com.ss.lark.android.passport.biz.feature.p3216a;

import android.widget.TextView;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49207r;
import com.ss.android.lark.utils.LarkContext;
import java.util.Locale;

/* renamed from: com.ss.lark.android.passport.biz.feature.a.a */
public class C64574a {
    /* renamed from: a */
    public static void m253733a(TextView textView) {
        Locale languageSetting = ServiceFinder.m193752g().getLanguageSetting();
        String a = C49207r.m193980a(languageSetting);
        String country = languageSetting.getCountry();
        boolean a2 = C26284k.m95185a(LarkContext.getApplication());
        if (C49207r.f123504a.getCountry().equals(country)) {
            textView.setText(R.string.Lark_Login_LanguageCN);
        } else if (C49207r.f123518o.getCountry().equals(country)) {
            if (ServiceFinder.m193748c().isLarkPackage() || a2) {
                textView.setText(R.string.Lark_Legacy_LanguageChineseTraditional);
            } else {
                textView.setText(R.string.Lark_Legacy_LanguageChineseTraditionalFeishu);
            }
        } else if (C49207r.f123519p.getCountry().equals(country)) {
            if (ServiceFinder.m193748c().isLarkPackage() || a2) {
                textView.setText(R.string.Lark_Legacy_LanguageChineseTraditionalTW);
            } else {
                textView.setText(R.string.Lark_Legacy_LanguageChineseTraditionalTWFeishu);
            }
        } else if ("en".equals(a)) {
            textView.setText(R.string.Lark_Login_LanguageEN);
        } else if ("ja".equals(a)) {
            textView.setText(R.string.Lark_Login_LanguageJapanese);
        } else if ("it".equals(a)) {
            textView.setText(R.string.Lark_Legacy_LanguageItaliano);
        } else if ("es".equals(a)) {
            textView.setText(R.string.Lark_Legacy_LanguageEspanol);
        } else if ("de".equals(a)) {
            textView.setText(R.string.Lark_Legacy_LanguageDeutsch);
        } else if ("fr".equals(a)) {
            textView.setText(R.string.Lark_Legacy_LanguageFrancais);
        } else if ("pt".equals(a)) {
            textView.setText(R.string.Lark_Legacy_LanguageBrazilPortugues);
        } else if ("vi".equals(a)) {
            textView.setText(R.string.Lark_Legacy_LanguageTiengviet);
        } else if ("in".equals(a)) {
            textView.setText(R.string.Lark_Legacy_LanguageIndonesia);
        } else if ("th".equals(a)) {
            textView.setText(R.string.Lark_Legacy_LanguageThai);
        } else if ("ko".equals(a)) {
            textView.setText(R.string.Lark_Legacy_LanguageKorean);
        } else if ("ru".equals(a)) {
            textView.setText(R.string.Lark_Legacy_LanguageRussian);
        } else if ("hi".equals(a)) {
            textView.setText(R.string.Lark_Legacy_LanguageHindi);
        } else if (ServiceFinder.m193752g().isOverSeaTenant()) {
            textView.setText(R.string.Lark_Login_LanguageEN);
        } else {
            textView.setText(R.string.Lark_Login_LanguageCN);
        }
    }
}
