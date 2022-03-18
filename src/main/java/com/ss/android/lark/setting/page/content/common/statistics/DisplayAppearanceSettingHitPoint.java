package com.ss.android.lark.setting.page.content.common.statistics;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J(\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u0005H\u0007J \u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001fH\u0007J\u0010\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020\u001dH\u0007J\u0018\u0010,\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u001dH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/statistics/DisplayAppearanceSettingHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "PARAMS_APP_MODE", "", "PARAMS_CLICK", "PARAMS_CLICK_TYPE", "PARAMS_IS_CONFIRM", "PARAMS_IS_MODE", "PARAMS_OS_MODE", "PARAMS_REAL_MODE", "PARAMS_TARGET", "PARAMS_UPLOAD_TYPE", "PARAMS_VIEW_TYPE", "VALUE_APPEARANCE_DARK_MODE", "VALUE_DARK", "VALUE_DEFAULT", "VALUE_DEFAULT_DARK", "VALUE_DEFAULT_LIGHT", "VALUE_FALSE", "VALUE_LIGHT", "VALUE_LOGOUT_SINGLE_ACCOUNT", "VALUE_NONE", "VALUE_OPEN", "VALUE_TRUE", "VALUE_USER", "getModeValue", "isNight", "", "mode", "", "sendAppAppearanceMode", "", "isRealModeNight", "isOsModeNight", "appMode", "uploadType", "sendClickAppearanceSetting", "isBeforeFollowSystem", "isBeforeNight", "afterMode", "sendLogoutSingleAccountEvent", "isConfirm", "sendOsAppearanceMode", "hasNight", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.common.b.a */
public final class DisplayAppearanceSettingHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final DisplayAppearanceSettingHitPoint f134053a = new DisplayAppearanceSettingHitPoint();

    /* renamed from: a */
    private final String m210248a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "default" : "light" : "dark" : "default";
    }

    /* renamed from: b */
    private final String m210253b(boolean z) {
        return z ? "dark" : "light";
    }

    private DisplayAppearanceSettingHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m210249a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "logout_single_account");
        jSONObject.put("target", "none");
        jSONObject.put("is_confirm", String.valueOf(z));
        Statistics.sendEvent("setting_detail_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m210250a(boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("os_mode", f134053a.m210253b(z));
        if (z2) {
            jSONObject.put("is_mode", "true");
        } else {
            jSONObject.put("is_mode", "false");
        }
        Statistics.sendEvent("setting_os_appr_mode_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m210251a(boolean z, boolean z2, int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "appearance_dark_mode");
        jSONObject.put("target", "none");
        DisplayAppearanceSettingHitPoint aVar = f134053a;
        jSONObject.put("click_type", aVar.m210248a(i));
        if (!z) {
            jSONObject.put("view_type", aVar.m210253b(z2));
        } else if (z2) {
            jSONObject.put("view_type", "default_dark");
        } else {
            jSONObject.put("view_type", "default_light");
        }
        Statistics.sendEvent("setting_detail_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m210252a(boolean z, boolean z2, int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "uploadType");
        JSONObject jSONObject = new JSONObject();
        DisplayAppearanceSettingHitPoint aVar = f134053a;
        jSONObject.put("real_mode", aVar.m210253b(z));
        jSONObject.put("os_mode", aVar.m210253b(z2));
        jSONObject.put("app_mode", aVar.m210248a(i));
        jSONObject.put("upload_type", str);
        Statistics.sendEvent("setting_app_appr_mode_view", jSONObject);
    }
}
