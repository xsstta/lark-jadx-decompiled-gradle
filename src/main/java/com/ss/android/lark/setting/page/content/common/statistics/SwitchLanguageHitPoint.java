package com.ss.android.lark.setting.page.content.common.statistics;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\"\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\u0017H\u0007J\u001a\u0010\u001d\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\u0017H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/statistics/SwitchLanguageHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "INDONESIA_LANGUAGE_CODE_ANDROID", "", "INDONESIA_LANGUAGE_CODE_OTHER", "PARAMS_APP_LANGUAGE", "PARAMS_CLICK", "PARAMS_CLICK_TYPE", "PARAMS_IS_DEFAULT", "PARAMS_IS_DEFAULT_CLICK", "PARAMS_IS_DEFAULT_VIEW", "PARAMS_OS_LANGUAGE", "PARAMS_TARGET", "PARAMS_UPLOAD_TYPE", "PARAMS_VIEW_TYPE", "TAG", "VALUE_LANGUAGE_SHOW", "VALUE_NONE", "VALUE_USER", "parseLocale", "locale", "Ljava/util/Locale;", "sendClickLanguageSetting", "", "beforeLocale", "selectLocale", "systemLocale", "sendInitiativeChangeLanguage", "currentLocale", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.common.b.c */
public final class SwitchLanguageHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final SwitchLanguageHitPoint f134055a = new SwitchLanguageHitPoint();

    private SwitchLanguageHitPoint() {
    }

    /* renamed from: a */
    private final String m210257a(Locale locale) {
        String str = locale.getLanguage() + "_" + locale.getCountry();
        if (Intrinsics.areEqual(str, "in_ID")) {
            return "id_ID";
        }
        return str;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m210258a(Locale locale, Locale locale2) {
        Intrinsics.checkParameterIsNotNull(locale2, "systemLocale");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("os_language", locale2.toString());
        if (locale != null) {
            try {
                jSONObject.put("app_language", f134055a.m210257a(locale));
                jSONObject.put("is_default", false);
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        } else {
            jSONObject.put("app_language", f134055a.m210257a(locale2));
            jSONObject.put("is_default", true);
        }
        jSONObject.put("upload_type", "user");
        Statistics.sendEvent("setting_app_language_view", jSONObject);
        Log.m165389i("SwitchLanguageHitPoint", jSONObject.toString());
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m210259a(Locale locale, Locale locale2, Locale locale3) {
        Intrinsics.checkParameterIsNotNull(locale, "beforeLocale");
        Intrinsics.checkParameterIsNotNull(locale3, "systemLocale");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "language_show");
        jSONObject.put("target", "none");
        if (locale2 != null) {
            try {
                jSONObject.put("click_type", f134055a.m210257a(locale2));
                jSONObject.put("is_default_click", false);
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        } else {
            jSONObject.put("click_type", f134055a.m210257a(locale3));
            jSONObject.put("is_default_click", true);
        }
        jSONObject.put("view_type", f134055a.m210257a(locale));
        if (Intrinsics.areEqual(locale3, locale)) {
            jSONObject.put("is_default_view", true);
        } else {
            jSONObject.put("is_default_view", false);
        }
        Statistics.sendEvent("setting_detail_click", jSONObject);
        Log.m165389i("SwitchLanguageHitPoint", jSONObject.toString());
    }
}
