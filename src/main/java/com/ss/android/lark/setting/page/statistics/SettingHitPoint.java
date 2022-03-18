package com.ss.android.lark.setting.page.statistics;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilter;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/setting/page/statistics/SettingHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.statistics.a */
public final class SettingHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f134851a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m211618a() {
        f134851a.mo186411k();
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m211619b() {
        f134851a.mo186412l();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u0015J\u0006\u0010\u001a\u001a\u00020\u0015J\u0006\u0010\u001b\u001a\u00020\u0015J\u0006\u0010\u001c\u001a\u00020\u0015J\u0006\u0010\u001d\u001a\u00020\u0015J\u0006\u0010\u001e\u001a\u00020\u0015J\u0006\u0010\u001f\u001a\u00020\u0015J\u0006\u0010 \u001a\u00020\u0015J\u000e\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0017J\u0014\u0010#\u001a\u00020\u00152\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040%J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u0017H\u0007J\u0006\u0010(\u001a\u00020\u0015J\b\u0010)\u001a\u00020\u0015H\u0007J\u000e\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0017J\u0006\u0010,\u001a\u00020\u0015J\u000e\u0010-\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u0017J\u0006\u00100\u001a\u00020\u0015J\b\u00101\u001a\u00020\u0015H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/lark/setting/page/statistics/SettingHitPoint$Companion;", "", "()V", "CLICK", "", "FEED_MORE_EDIT_MOBILE", "FEED_TYPE_LIST", "FEED_TYPE_NUMBER", "IS_CLOSED", "NO", "OFF", "ON", "PERSONAL_STATUS", "SETTING_PERSONAL_STATUS_DETAIL_VIEW", "SET_EFFICIENCY_EDIT", "SOURCE", "STATUS", "TAG", "TARGET", "YES", "sendAddressBookAccess", "", "enable", "", "sendCalendarSetting", "sendCleanCache", "sendClickPrivacySetting", "sendEnterEmailSetting", "sendEnterGeneralSetting", "sendEnterInternalSetting", "sendEnterPrivacySetting", "sendEnterSystemSetting", "sendFeedGroupingEditClose", "sendFeedGroupingEditFilterToggle", "isChecked", "sendFeedGroupingEditSave", "myFilterSelections", "", "sendLogoutAllAccountEvent", "isConfirm", "sendLogoutClick", "sendPersonalStatusClick", "sendSmartReplyEvent", "isOn", "sendStartPrivacySetting", "sendSwitchAudio2TextEvent", "sendUpdateAutoUpdateWorkStatusEvent", "isClosed", "sendVideoChatSetting", "sendViewSettingDetail", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.statistics.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: i */
        public final void mo186409i() {
            Statistics.sendEvent("setting_privacytab_click");
        }

        /* renamed from: j */
        public final void mo186410j() {
            Statistics.sendEvent("feed_grouping_edit_close");
        }

        @JvmStatic
        /* renamed from: k */
        public final void mo186411k() {
            Statistics.sendEvent("setting_detail_view");
        }

        /* renamed from: a */
        public final void mo186394a() {
            try {
                Statistics.sendEvent("setting_entry_profile");
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        /* renamed from: b */
        public final void mo186397b() {
            try {
                Statistics.sendEvent("setting_getconfig");
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        /* renamed from: c */
        public final void mo186399c() {
            try {
                Statistics.sendEvent("setting_general_title");
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        /* renamed from: d */
        public final void mo186401d() {
            try {
                Statistics.sendEvent("setting_calendar_title");
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        /* renamed from: e */
        public final void mo186403e() {
            try {
                Statistics.sendEvent("setting_vc_title");
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        /* renamed from: f */
        public final void mo186405f() {
            try {
                Statistics.sendEvent("setting_email_title");
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        /* renamed from: g */
        public final void mo186407g() {
            try {
                Statistics.sendEvent("setting_logout");
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        /* renamed from: h */
        public final void mo186408h() {
            Statistics.sendEvent("Visited_Privacy_Setting", new JSONObject().put("origination", "directly_from_system_settings"));
        }

        @JvmStatic
        /* renamed from: l */
        public final void mo186412l() {
            Statistics.sendEvent("setting_detail_click", new JSONObject().put("click", "personal_status").put("target", "setting_personal_status_detail_view"));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final void mo186398b(boolean z) {
            String str;
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "open";
            } else {
                str = "close";
            }
            Statistics.sendEvent("set_audio_to_text", jSONObject.put("action", str));
        }

        /* renamed from: c */
        public final void mo186400c(boolean z) {
            String str;
            if (z) {
                str = "是";
            } else {
                str = "否";
            }
            Statistics.sendEvent("onleave_status_setting", new JSONObject().put("is_closed", str));
        }

        /* renamed from: d */
        public final void mo186402d(boolean z) {
            String str;
            if (z) {
                str = "setting_efficiency_aisuggestions_on";
            } else {
                str = "setting_efficiency_aisuggestions_off";
            }
            Statistics.sendEvent(str);
        }

        /* renamed from: e */
        public final void mo186404e(boolean z) {
            String str;
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "on";
            } else {
                str = "off";
            }
            Statistics.sendEvent("feed_grouping_edit_filter_toggle", jSONObject.put(UpdateKey.STATUS, str));
        }

        /* renamed from: a */
        public final void mo186396a(boolean z) {
            String str;
            if (z) {
                str = "agree";
            } else {
                str = "refuse";
            }
            try {
                Statistics.sendEvent("addressbook_access", new JSONObject().put("feedback", str));
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        @JvmStatic
        /* renamed from: f */
        public final void mo186406f(boolean z) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("click", "logout_all_account");
                jSONObject.put("target", "none");
                jSONObject.put("is_confirm", String.valueOf(z));
                Statistics.sendEvent("setting_detail_click", jSONObject);
            } catch (Exception unused) {
                Log.m165397w("SettingHitPoint", "send logout all account hitpoint faild!");
            }
        }

        /* renamed from: a */
        public final void mo186395a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "myFilterSelections");
            try {
                List<String> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    String name = FeedFilter.Companion.mo186304a(Integer.parseInt(it.next())).name();
                    Locale locale = Locale.ROOT;
                    Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ROOT");
                    if (name != null) {
                        String lowerCase = name.toLowerCase(locale);
                        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        arrayList.add(lowerCase);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                Statistics.sendEvent("feed_grouping_edit_save", new JSONObject().put("feed_type_list", arrayList).put("feed_type_number", list.size()));
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }
    }
}
