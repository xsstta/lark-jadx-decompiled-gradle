package com.ss.android.lark.language.service.statistics;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001a\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/language/service/statistics/CoolBootGetLanguageHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "INDONESIA_LANGUAGE_CODE_ANDROID", "", "INDONESIA_LANGUAGE_CODE_OTHER", "PARAMS_APP_LANGUAGE", "PARAMS_IS_DEFAULT", "PARAMS_OS_LANGUAGE", "PARAMS_UPLOAD_TYPE", "TAG", "VALUE_OPEN", "parseLocale", "locale", "Ljava/util/Locale;", "sendCoolBootGetLanguage", "", "currentLocale", "systemLocale", "base_language_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.language.service.a.a */
public final class CoolBootGetLanguageHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final CoolBootGetLanguageHitPoint f104870a = new CoolBootGetLanguageHitPoint();

    private CoolBootGetLanguageHitPoint() {
    }

    /* renamed from: a */
    private final String m163102a(Locale locale) {
        String str = locale.getLanguage() + "_" + locale.getCountry();
        if (Intrinsics.areEqual(str, "in_ID")) {
            return "id_ID";
        }
        return str;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m163103a(Locale locale, Locale locale2) {
        Intrinsics.checkParameterIsNotNull(locale2, "systemLocale");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("os_language", locale2.toString());
        if (locale != null) {
            try {
                if (!Intrinsics.areEqual(locale, locale2)) {
                    jSONObject.put("app_language", f104870a.m163102a(locale));
                    jSONObject.put("is_default", false);
                    jSONObject.put("upload_type", "open");
                    Statistics.sendEvent("setting_app_language_view", jSONObject);
                    Log.m165389i("CoolBootGetLanguageHitPoint", jSONObject.toString());
                }
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }
        jSONObject.put("app_language", f104870a.m163102a(locale2));
        jSONObject.put("is_default", true);
        jSONObject.put("upload_type", "open");
        Statistics.sendEvent("setting_app_language_view", jSONObject);
        Log.m165389i("CoolBootGetLanguageHitPoint", jSONObject.toString());
    }
}
