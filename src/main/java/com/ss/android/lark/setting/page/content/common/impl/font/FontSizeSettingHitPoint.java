package com.ss.android.lark.setting.page.content.common.impl.font;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.lark.util.share_preference.C57744a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/font/FontSizeSettingHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.c */
public final class FontSizeSettingHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f134143a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0013J\u0006\u0010\u0018\u001a\u00020\u0013J\u0006\u0010\u0019\u001a\u00020\u0013J\u0006\u0010\u001a\u001a\u00020\u0013J\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/font/FontSizeSettingHitPoint$Companion;", "", "()V", "CANCEL", "", "DISPLAY_ZOOM", "LARGE1", "LARGE2", "LARGE3", "LARGE4", "NORMAL", "RESTART", "SIZE_KEY", "SMALL", "STATUS_KEY", "getGearByPosition", "position", "", "sendClickBack", "", "sendClickConfirm", "sendClickDialog", UpdateKey.STATUS, "sendFontSettingClick", "sendInitGear", "sendShowFontSettingPage", "sendShowGeneralSettingPage", "sendSlideBarUse", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.c$a */
    public static final class Companion {
        /* renamed from: b */
        private final String m210357b(int i) {
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "M" : "3XL" : "2XL" : "XL" : "L" : "M" : "S";
        }

        private Companion() {
        }

        /* renamed from: a */
        public final void mo185455a() {
            try {
                Statistics.sendEvent("setting_general_show");
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        /* renamed from: b */
        public final void mo185458b() {
            try {
                Statistics.sendEvent("setting_general_textsize_click");
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        /* renamed from: c */
        public final void mo185459c() {
            try {
                Statistics.sendEvent("setting_textsize_show");
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        /* renamed from: d */
        public final void mo185460d() {
            try {
                Statistics.sendEvent("setting_textsize_done_click");
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        /* renamed from: e */
        public final void mo185461e() {
            try {
                Statistics.sendEvent("setting_textsize_return_click");
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        /* renamed from: f */
        public final void mo185462f() {
            try {
                Statistics.sendEvent("init_textsize", new JSONObject().put("size", m210357b(C57744a.m224104a().getInt("display_zoom") + 1)));
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo185457a(String str) {
            Intrinsics.checkParameterIsNotNull(str, UpdateKey.STATUS);
            try {
                Statistics.sendEvent("setting_textsize_restartwindow_click", new JSONObject().put(UpdateKey.STATUS, str));
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        /* renamed from: a */
        public final void mo185456a(int i) {
            try {
                Statistics.sendEvent("setting_textsize_slidebar_using", new JSONObject().put("size", m210357b(i)));
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }
    }
}
