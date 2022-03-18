package com.ss.android.lark.banner.statistics;

import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u000b\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/banner/statistics/BannerHitPoint;", "", "()V", "KEY_BANNER_KEY", "", "KEY_SCENE", "sendBannerClick", "", "scene", "bannerKey", "sendBannerClose", "sendBannerShow", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.banner.h.c */
public final class BannerHitPoint {

    /* renamed from: a */
    public static final BannerHitPoint f73691a = new BannerHitPoint();

    private BannerHitPoint() {
    }

    /* renamed from: a */
    public final void mo104469a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scene", str);
        jSONObject.put("banner_key", str2);
        Statistics.sendEvent("ug_banner_show", jSONObject);
    }

    /* renamed from: b */
    public final void mo104470b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scene", str);
        jSONObject.put("banner_key", str2);
        Statistics.sendEvent("ug_banner_closed", jSONObject);
    }

    /* renamed from: c */
    public final void mo104471c(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scene", str);
        jSONObject.put("banner_key", str2);
        Statistics.sendEvent("ug_banner_click", jSONObject);
    }
}
