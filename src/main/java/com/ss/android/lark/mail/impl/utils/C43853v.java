package com.ss.android.lark.mail.impl.utils;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.entity.TranslationSetting;
import com.ss.android.lark.mail.impl.message.plugin.translation.Language;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.service.C43350d;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.utils.v */
public class C43853v {

    /* renamed from: a */
    public static final String f111297a = new JSONArray().put("unknown").toString();

    /* renamed from: b */
    public static TranslationSetting f111298b;

    /* renamed from: c */
    public static volatile boolean f111299c = false;

    /* renamed from: d */
    private static final boolean f111300d = C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.autotranslation");

    /* renamed from: e */
    private static final boolean f111301e = C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.translaterecommend");

    /* renamed from: f */
    private static volatile boolean f111302f = false;

    /* renamed from: com.ss.android.lark.mail.impl.utils.v$a */
    public interface AbstractC43859a {
        /* renamed from: a */
        void mo156227a();
    }

    /* renamed from: h */
    public static TranslationSetting m173850h() {
        return f111298b;
    }

    /* renamed from: b */
    public static final void m173843b() {
        Log.m165389i("TranslationUtil", "invalidateSetting");
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.utils.C43853v.RunnableC438541 */

            public void run() {
                C43853v.f111299c = false;
            }
        });
    }

    /* renamed from: e */
    public static Language m173847e() {
        TranslationSetting translationSetting = f111298b;
        if (translationSetting != null) {
            return translationSetting.mo151791d();
        }
        return TranslationSetting.f107011b;
    }

    /* renamed from: f */
    public static boolean m173848f() {
        TranslationSetting translationSetting = f111298b;
        if (translationSetting == null || !translationSetting.mo151789b()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static List<Language> m173851i() {
        TranslationSetting translationSetting = f111298b;
        if (translationSetting == null) {
            return null;
        }
        return translationSetting.mo151794f();
    }

    /* renamed from: c */
    public static boolean m173845c() {
        if (!C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.hide_ai_point")) {
            return true;
        }
        Log.m165383e("TranslationUtil", "showTranslateButton ai fg abort");
        return false;
    }

    /* renamed from: j */
    private static void m173852j() {
        if (!f111302f) {
            Log.m165389i("TranslationUtil", "observeTranslationSetting");
            f111302f = true;
            C41816b.m166115a().mo150127a(new AbstractC43859a() {
                /* class com.ss.android.lark.mail.impl.utils.C43853v.C438552 */

                @Override // com.ss.android.lark.mail.impl.utils.C43853v.AbstractC43859a
                /* renamed from: a */
                public void mo156227a() {
                    Log.m165389i("TranslationUtil", "onSettingChanged");
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.utils.C43853v.C438552.RunnableC438561 */

                        public void run() {
                            C43853v.f111299c = false;
                        }
                    });
                }
            });
        }
    }

    /* renamed from: k */
    private static void m173853k() {
        Log.m165389i("TranslationUtil", "updateTranslationSetting");
        C42176e.m168344a().mo152252f(new IGetDataCallback<TranslationSetting>() {
            /* class com.ss.android.lark.mail.impl.utils.C43853v.C438573 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("TranslationUtil", "updateTranslationSetting onError");
            }

            /* renamed from: a */
            public void onSuccess(final TranslationSetting translationSetting) {
                Log.m165389i("TranslationUtil", "updateTranslationSetting onSuccess");
                if (translationSetting == null) {
                    Log.m165383e("TranslationUtil", "updateTranslationSetting empty data");
                } else {
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.utils.C43853v.C438573.RunnableC438581 */

                        public void run() {
                            C43853v.f111299c = true;
                            C43853v.f111298b = translationSetting;
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    public static final void m173839a() {
        Log.m165389i("TranslationUtil", "init");
        if (!f111299c) {
            m173853k();
            m173852j();
        }
    }

    /* renamed from: g */
    public static boolean m173849g() {
        if (!f111300d) {
            Log.m165389i("TranslationUtil", "isAutoTranslationEnabled fg abort");
            return false;
        } else if (C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.hide_ai_point")) {
            Log.m165389i("TranslationUtil", "isAutoTranslationEnabled ai fg abort");
            return false;
        } else {
            TranslationSetting translationSetting = f111298b;
            if (translationSetting == null || !translationSetting.mo151786a()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: d */
    public static List<String> m173846d() {
        TranslationSetting translationSetting = f111298b;
        if (translationSetting == null || CollectionUtils.isEmpty(translationSetting.mo151790c())) {
            Log.m165383e("TranslationUtil", "getIgnoringLanguages empty setting");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (TranslationSetting.LanguageSetting languageSetting : f111298b.mo151790c()) {
            if (languageSetting != null && !TextUtils.isEmpty(languageSetting.f107019a) && !languageSetting.mo151800a()) {
                arrayList.add(languageSetting.f107019a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m173840a(TranslationSetting translationSetting) {
        f111298b = translationSetting;
    }

    /* renamed from: a */
    private static String m173837a(MailMessage mailMessage) {
        List<String> F = mailMessage.mo151553F();
        if (CollectionUtils.isEmpty(F)) {
            return "unknown";
        }
        String str = F.get(0);
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        return str;
    }

    /* renamed from: a */
    private static boolean m173841a(String str) {
        if (str.equals("unsupported") || str.equals("not_lang")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String m173842b(List<MailMessage> list) {
        Log.m165389i("TranslationUtil", "extractTranslationRecommendationInfo");
        if (CollectionUtils.isEmpty(list) || f111298b == null) {
            Log.m165383e("TranslationUtil", "extractTranslationRecommendationInfo invalid parameter");
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (MailMessage mailMessage : list) {
                if (mailMessage != null) {
                    if (!TextUtils.isEmpty(mailMessage.mo151581b())) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("messageID", mailMessage.mo151581b());
                        jSONObject.put("show", true);
                        String b = f111298b.mo151788b(m173837a(mailMessage));
                        if (!TextUtils.isEmpty(b)) {
                            jSONObject.put("displayText", C43819s.m173684a((int) R.string.Mail_Translations_LanguageDetectedMobile).replace("{{language}}", b));
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            }
            return jSONArray.toString();
        } catch (Exception e) {
            Log.m165384e("TranslationUtil", "extractTranslationRecommendationInfo", e);
            return null;
        }
    }

    /* renamed from: c */
    public static List<MailMessage> m173844c(List<MailMessage> list) {
        TranslationSetting translationSetting;
        TranslationSetting translationSetting2;
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MailMessage mailMessage : list) {
            if (mailMessage != null && !mailMessage.mo151621u()) {
                String a = m173837a(mailMessage);
                if ("unknown".equals(a)) {
                    arrayList.add(mailMessage);
                } else if (!m173841a(a) && (((translationSetting = f111298b) == null || !translationSetting.mo151787a(a)) && ((translationSetting2 = f111298b) == null || !a.equals(translationSetting2.mo151793e())))) {
                    arrayList.add(mailMessage);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<MailMessage> m173838a(List<MailMessage> list) {
        if (!f111301e || !f111299c || m173849g() || CollectionUtils.isEmpty(list)) {
            Log.m165389i("TranslationUtil", "showTranslationRecommendation abort");
            return null;
        } else if (C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.hide_ai_point")) {
            Log.m165389i("TranslationUtil", "showTranslationRecommendation ai fg abort");
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (MailMessage mailMessage : list) {
                if (mailMessage != null) {
                    String a = m173837a(mailMessage);
                    if (TextUtils.isEmpty(a)) {
                        Log.m165389i("TranslationUtil", "showTranslationRecommendation empty identifier");
                    } else if (a.equals("unknown")) {
                        Log.m165389i("TranslationUtil", "showTranslationRecommendation unknown");
                    } else {
                        Locale m = C41816b.m166115a().mo150146m();
                        if (m == null || !a.equals(m.getLanguage())) {
                            TranslationSetting translationSetting = f111298b;
                            if (translationSetting != null && a.equals(translationSetting.mo151793e())) {
                                Log.m165389i("TranslationUtil", "showTranslationRecommendation translation language");
                            } else if (C43350d.m172098a().mo155039c(a)) {
                                Log.m165389i("TranslationUtil", "showTranslationRecommendation skip");
                            } else {
                                arrayList.add(mailMessage);
                            }
                        } else {
                            Log.m165389i("TranslationUtil", "showTranslationRecommendation showing language");
                        }
                    }
                }
            }
            return arrayList;
        }
    }
}
