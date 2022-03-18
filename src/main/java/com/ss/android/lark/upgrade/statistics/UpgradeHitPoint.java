package com.ss.android.lark.upgrade.statistics;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.lark.upgrade.enity.UpgradePlan;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/upgrade/statistics/UpgradeHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.upgrade.e.a */
public final class UpgradeHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f141994a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0004J\u001c\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0016J\u0016\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\bH\u0016J'\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\bH\u0016¢\u0006\u0002\u0010!J\u0018\u0010\"\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006#"}, d2 = {"Lcom/ss/android/lark/upgrade/statistics/UpgradeHitPoint$Companion;", "Lcom/ss/android/lark/upgrade/statistics/IUpgradeHitPoint;", "()V", "sendCancel", "", "plan", "Lcom/ss/android/lark/upgrade/enity/UpgradePlan;", "mode", "", "sendCheckVersionClick", "sendCheckVersionNewVersion", "sendCheckVersionNewVersionClick", "sendCheckVersionUpToDateEvent", "sendClickAppPermission", "sendClickBestPractice", "sendClickPrivacyPolicy", "sendClickSecurityWhitePaper", "sendClickSpecialFunction", "sendClickThirdPartySdkList", "sendClickUpdateLog", "sendClickUserAgree", "sendEnterAboutLark", "sendLaunchAfterInstall", "lastVersion", "lastChannel", "sendUpgrade", "sendUpgradeAction", "action", "sendUpgradeFinish", UpdateKey.STATUS, "kbPerSec", "", "downloadWay", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "sendUpgradePopup", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.e.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: b */
        public final void mo195629b() {
            Statistics.sendEvent("setting_update_checkversion_uptodate");
        }

        /* renamed from: c */
        public final void mo195631c() {
            Statistics.sendEvent("setting_update_checkversion_newversion");
        }

        /* renamed from: d */
        public final void mo195632d() {
            Statistics.sendEvent("setting_update_checkversion_click");
        }

        /* renamed from: e */
        public final void mo195633e() {
            Statistics.sendEvent("setting_update_checkversion_newversionclick");
        }

        /* renamed from: f */
        public final void mo195634f() {
            Statistics.sendEvent("setting_about_updatelog");
        }

        /* renamed from: g */
        public final void mo195635g() {
            Statistics.sendEvent("setting_about_features");
        }

        /* renamed from: h */
        public final void mo195636h() {
            Statistics.sendEvent("setting_about_bestpract");
        }

        /* renamed from: i */
        public final void mo195637i() {
            Statistics.sendEvent("setting_about_useragree");
        }

        /* renamed from: j */
        public final void mo195638j() {
            Statistics.sendEvent("setting_about_privacypolicy");
        }

        /* renamed from: k */
        public final void mo195639k() {
            Statistics.sendEvent("setting_about_sdk_list");
        }

        /* renamed from: l */
        public final void mo195640l() {
            Statistics.sendEvent("setting_about_white_paper");
        }

        /* renamed from: m */
        public final void mo195641m() {
            Statistics.sendEvent("setting_about_app_permission");
        }

        /* renamed from: a */
        public final void mo195623a() {
            try {
                Statistics.sendEvent("setting_about_title");
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public void mo195625a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "action");
            Statistics.sendEvent("upgrade_action", new JSONObject().put("action", str));
        }

        /* renamed from: a */
        public final void mo195624a(UpgradePlan upgradePlan, String str) {
            String str2;
            Intrinsics.checkParameterIsNotNull(upgradePlan, "plan");
            Intrinsics.checkParameterIsNotNull(str, "mode");
            JSONObject put = new JSONObject().put("click", "upgrade");
            if (upgradePlan.enableSnooze()) {
                str2 = "non_mandatory_upgrade";
            } else {
                str2 = "mandatory_upgrade";
            }
            Statistics.sendEvent("public_upgrade_popup_click", put.put("popup_type", str2).put("popup_mode", str));
        }

        /* renamed from: b */
        public final void mo195630b(UpgradePlan upgradePlan, String str) {
            String str2;
            Intrinsics.checkParameterIsNotNull(upgradePlan, "plan");
            Intrinsics.checkParameterIsNotNull(str, "mode");
            JSONObject put = new JSONObject().put("click", "cancel");
            if (upgradePlan.enableSnooze()) {
                str2 = "non_mandatory_upgrade";
            } else {
                str2 = "mandatory_upgrade";
            }
            Statistics.sendEvent("public_upgrade_popup_click", put.put("popup_type", str2).put("popup_mode", str));
        }

        /* renamed from: a */
        public void mo195626a(String str, UpgradePlan upgradePlan) {
            String str2;
            Intrinsics.checkParameterIsNotNull(str, "mode");
            Intrinsics.checkParameterIsNotNull(upgradePlan, "plan");
            Statistics.sendEvent("upgrade_popup", new JSONObject().put("popup_mode", str));
            JSONObject put = new JSONObject().put("view", "");
            if (upgradePlan.enableSnooze()) {
                str2 = "non_mandatory_upgrade";
            } else {
                str2 = "mandatory_upgrade";
            }
            Statistics.sendEvent("public_upgrade_popup_view", put.put("popup_type", str2).put("popup_mode", str));
        }

        /* renamed from: a */
        public void mo195628a(String str, String str2) {
            Statistics.sendEvent("launch_after_install", new JSONObject().put("last_version", str).put("last_channel", str2));
        }

        /* renamed from: a */
        public void mo195627a(String str, Long l, String str2) {
            Intrinsics.checkParameterIsNotNull(str, UpdateKey.STATUS);
            Intrinsics.checkParameterIsNotNull(str2, "downloadWay");
            Statistics.sendEvent("upgrade_finish", new JSONObject().put(UpdateKey.STATUS, str).put("kb_per_sec", l).put("download_way", str2));
        }
    }
}
