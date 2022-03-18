package com.ss.android.lark.banner.statistics;

import com.bytedance.apm.ApmAgent;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\r\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/banner/statistics/BannerApm;", "", "()V", "KEY_BANNER_KEY", "", "KEY_BIZ_NAME", "KEY_DURATION", "KEY_ERROR", "KEY_TYPE", "sendCheckIsEnableError", "", "bizName", "error", "sendFetchBannerFail", "sendFetchBanners", "duration", "", "sendGetBannerTiming", "sendSetBannerStatusFail", "bannerKey", "sendUnknownBannerType", ShareHitPoint.f121869d, "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.banner.h.a */
public final class BannerApm {

    /* renamed from: a */
    public static final BannerApm f73689a = new BannerApm();

    private BannerApm() {
    }

    /* renamed from: a */
    public final void mo104458a(long j) {
        try {
            ApmAgent.monitorEvent("ug_fetch_banners_timing", null, new JSONObject().put("duration", j), null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo104461b(long j) {
        try {
            ApmAgent.monitorEvent("ug_get_banner_timing", null, new JSONObject().put("duration", j), null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo104459a(String str) {
        try {
            ApmAgent.monitorEvent("ug_fetch_banners_fail", null, null, new JSONObject().put("error", str));
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo104462b(String str) {
        try {
            ApmAgent.monitorEvent("ug_unkonw_banner_type", new JSONObject().put(ShareHitPoint.f121869d, str), null, null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo104460a(String str, String str2) {
        try {
            ApmAgent.monitorEvent("ug_check_is_enable_fail", new JSONObject().put("biz_name", str), null, new JSONObject().put("error", str2));
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo104463b(String str, String str2) {
        try {
            ApmAgent.monitorEvent("ug_set_banner_status_fail", new JSONObject().put("banner_key", str), null, new JSONObject().put("error", str2));
        } catch (Exception unused) {
        }
    }
}
