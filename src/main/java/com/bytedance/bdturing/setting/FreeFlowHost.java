package com.bytedance.bdturing.setting;

import com.bytedance.bdturing.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¨\u0006\n"}, d2 = {"Lcom/bytedance/bdturing/setting/FreeFlowHost;", "", "()V", "init", "", "appId", "", "updateFreeFlowHost", "regionKey", "freeHost", "setting_i18nRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.bdturing.setting.d */
public final class FreeFlowHost {

    /* renamed from: a */
    public static final FreeFlowHost f11292a = new FreeFlowHost();

    private FreeFlowHost() {
    }

    /* renamed from: a */
    public final void mo14392a(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 1508632) {
                if (hashCode == 1509441 && str.equals("1233")) {
                    LogUtil.m14895a("FreeFlowHost", "replace free host");
                    mo14393a(Region.USA_EAST.getValue(), "https://verification-va.tiktokv.com");
                    DefaultSettings.f11289a.mo14391a().optJSONObject("common").optJSONObject("host").put(Region.USA_EAST.getValue(), "https://vcs-va.tiktokv.com");
                }
            } else if (str.equals("1180")) {
                LogUtil.m14895a("FreeFlowHost", "replace free host");
                mo14393a(Region.SINGAPOER.getValue(), "https://verify-sg.tiktokv.com");
                DefaultSettings.f11289a.mo14391a().optJSONObject("common").optJSONObject("host").put(Region.SINGAPOER.getValue(), "https://vcs-sg.tiktokv.com");
            }
        }
    }

    /* renamed from: a */
    public final void mo14393a(String str, String str2) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        Intrinsics.checkParameterIsNotNull(str, "regionKey");
        Intrinsics.checkParameterIsNotNull(str2, "freeHost");
        JSONObject optJSONObject5 = DefaultSettings.f11289a.mo14391a().optJSONObject("sms");
        if (!(optJSONObject5 == null || (optJSONObject4 = optJSONObject5.optJSONObject("host")) == null)) {
            optJSONObject4.put(str, str2);
        }
        JSONObject optJSONObject6 = DefaultSettings.f11289a.mo14391a().optJSONObject("qa");
        if (!(optJSONObject6 == null || (optJSONObject3 = optJSONObject6.optJSONObject("host")) == null)) {
            optJSONObject3.put(str, str2);
        }
        JSONObject optJSONObject7 = DefaultSettings.f11289a.mo14391a().optJSONObject("verify");
        if (!(optJSONObject7 == null || (optJSONObject2 = optJSONObject7.optJSONObject("host")) == null)) {
            optJSONObject2.put(str, str2);
        }
        JSONObject optJSONObject8 = DefaultSettings.f11289a.mo14391a().optJSONObject("self_unpunish");
        if (optJSONObject8 != null && (optJSONObject = optJSONObject8.optJSONObject("host")) != null) {
            optJSONObject.put(str, str2);
        }
    }
}
