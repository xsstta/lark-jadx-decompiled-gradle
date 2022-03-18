package com.ss.android.lark.setting.page.statistics;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0019\u001a\u001b\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\fJ\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0014H\u0007J \u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/setting/page/statistics/SettingHitPointNew;", "", "()V", "CLICK", "", "CLICK_TYPE", "IS_ON", "NONE", "STATUS", "TARGET", "VIEW_TYPE", "sendFeedFilterSettingEvent", "", "param", "Lcom/ss/android/lark/setting/page/statistics/SettingHitPointNew$FeedGroupingEditClickParam;", "viewStatusType", "Lcom/ss/android/lark/setting/page/statistics/SettingHitPointNew$SettingDetailType;", "sendFeedGroupingEditClick", "sendFeedGroupingEditView", "sendMessageAlignEditClick", "Lcom/ss/android/lark/setting/page/statistics/SettingHitPointNew$MessageAlignTypeClickParam;", "sendSendSettingDetailClick", "Lcom/ss/android/lark/setting/page/statistics/SettingHitPointNew$SettingDetailClickParam;", "clickType", "viewType", "FeedGroupingEditClickParam", "MessageAlignTypeClickParam", "SettingDetailClickParam", "SettingDetailType", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class SettingHitPointNew {

    /* renamed from: a */
    public static final SettingHitPointNew f134850a = new SettingHitPointNew();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/setting/page/statistics/SettingHitPointNew$FeedGroupingEditClickParam;", "", "action", "", "target", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getTarget", "FEED_GROUPING_EDIT_FILTER_TOGGLE", "FEED_GROUPING_EDIT_SAVE", "FEED_GROUPING_EDIT_CLOSE", "FEED_GROUPING_EDIT_MINUS", "FEED_GROUPING_EDIT_PLUS", "FEED_FILTER_TOGGLE", "FEED_MUTE_FILTER_TOGGLE", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum FeedGroupingEditClickParam {
        FEED_GROUPING_EDIT_FILTER_TOGGLE("feed_grouping_edit_filter_toggle", "none"),
        FEED_GROUPING_EDIT_SAVE("feed_grouping_edit_save", "none"),
        FEED_GROUPING_EDIT_CLOSE("feed_grouping_edit_close", "none"),
        FEED_GROUPING_EDIT_MINUS("feed_grouping_edit_minus", "none"),
        FEED_GROUPING_EDIT_PLUS("feed_grouping_edit_plus", "none"),
        FEED_FILTER_TOGGLE("efficiency_feed_grouping_edit_filter_toggle", "none"),
        FEED_MUTE_FILTER_TOGGLE("efficiency_mute_toggle", "none");
        
        private final String action;
        private final String target;

        public final String getAction() {
            return this.action;
        }

        public final String getTarget() {
            return this.target;
        }

        private FeedGroupingEditClickParam(String str, String str2) {
            this.action = str;
            this.target = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/setting/page/statistics/SettingHitPointNew$MessageAlignTypeClickParam;", "", "action", "", "target", "isOn", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V", "getAction", "()Ljava/lang/String;", "()Z", "getTarget", "MSG_LEFT_ALIGN_ON", "MSG_LEFT_ALIGN_OFF", "MSG_LEFT_RIGHT_ALIGN_ON", "MSG_LEFT_RIGHT_ALIGN_OFF", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum MessageAlignTypeClickParam {
        MSG_LEFT_ALIGN_ON("msg_left_align", "none", true),
        MSG_LEFT_ALIGN_OFF("msg_left_align", "none", false),
        MSG_LEFT_RIGHT_ALIGN_ON("msg_leftright_align", "none", true),
        MSG_LEFT_RIGHT_ALIGN_OFF("msg_leftright_align", "none", false);
        
        private final String action;
        private final boolean isOn;
        private final String target;

        public final String getAction() {
            return this.action;
        }

        public final String getTarget() {
            return this.target;
        }

        public final boolean isOn() {
            return this.isOn;
        }

        private MessageAlignTypeClickParam(String str, String str2, boolean z) {
            this.action = str;
            this.target = str2;
            this.isOn = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/setting/page/statistics/SettingHitPointNew$SettingDetailClickParam;", "", "action", "", "target", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getTarget", "CHAT_START_FROM", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum SettingDetailClickParam {
        CHAT_START_FROM("efficiency_chat_start_from", "none");
        
        private final String action;
        private final String target;

        public final String getAction() {
            return this.action;
        }

        public final String getTarget() {
            return this.target;
        }

        private SettingDetailClickParam(String str, String str2) {
            this.action = str;
            this.target = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/setting/page/statistics/SettingHitPointNew$SettingDetailType;", "", ShareHitPoint.f121869d, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "LEFT_OFF", "RECENT_UNREAD", "TOGGLE_ON", "TOGGLE_OFF", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum SettingDetailType {
        LEFT_OFF("left_off"),
        RECENT_UNREAD("most_recent_unread"),
        TOGGLE_ON("on"),
        TOGGLE_OFF("off");
        
        private final String type;

        public final String getType() {
            return this.type;
        }

        private SettingDetailType(String str) {
            this.type = str;
        }
    }

    private SettingHitPointNew() {
    }

    /* renamed from: a */
    public final void mo186383a() {
        Statistics.sendEvent("feed_grouping_edit_view");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m211613a(MessageAlignTypeClickParam messageAlignTypeClickParam) {
        Intrinsics.checkParameterIsNotNull(messageAlignTypeClickParam, "param");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", messageAlignTypeClickParam.getAction());
        jSONObject.put("target", messageAlignTypeClickParam.getTarget());
        jSONObject.put("is_on", messageAlignTypeClickParam.isOn());
        Statistics.sendEvent("setting_detail_click", jSONObject);
    }

    /* renamed from: a */
    public final void mo186384a(FeedGroupingEditClickParam feedGroupingEditClickParam) {
        Intrinsics.checkParameterIsNotNull(feedGroupingEditClickParam, "param");
        Statistics.sendEvent("feed_grouping_edit_click", new JSONObject().put("click", feedGroupingEditClickParam.getAction()).put("target", feedGroupingEditClickParam.getTarget()));
    }

    /* renamed from: a */
    public final void mo186385a(FeedGroupingEditClickParam feedGroupingEditClickParam, SettingDetailType settingDetailType) {
        Intrinsics.checkParameterIsNotNull(feedGroupingEditClickParam, "param");
        Intrinsics.checkParameterIsNotNull(settingDetailType, "viewStatusType");
        Statistics.sendEvent("setting_detail_click", new JSONObject().put("click", feedGroupingEditClickParam.getAction()).put("target", feedGroupingEditClickParam.getTarget()).put(UpdateKey.STATUS, settingDetailType.getType()));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m211614a(SettingDetailClickParam settingDetailClickParam, SettingDetailType settingDetailType, SettingDetailType settingDetailType2) {
        Intrinsics.checkParameterIsNotNull(settingDetailClickParam, "param");
        Intrinsics.checkParameterIsNotNull(settingDetailType, "clickType");
        Intrinsics.checkParameterIsNotNull(settingDetailType2, "viewType");
        Statistics.sendEvent("setting_detail_click", new JSONObject().put("click", settingDetailClickParam.getAction()).put("target", settingDetailClickParam.getTarget()).put("click_type", settingDetailType.getType()).put("view_type", settingDetailType2.getType()));
    }
}
