package com.ss.android.appcenter.business.monitor.monitor;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/appcenter/business/monitor/monitor/GroupBotMonitorCode;", "", "()V", "Companion", "GroupBotMonitorCodeInternal", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.business.monitor.a.c */
public final class GroupBotMonitorCode {

    /* renamed from: a */
    public static GroupBotMonitorCodeInternal f69256a = new GroupBotMonitorCodeInternal(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "pull_groupbot_list_success");

    /* renamed from: b */
    public static GroupBotMonitorCodeInternal f69257b = new GroupBotMonitorCodeInternal(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.ERROR, "pull_groupbot_list_fail");

    /* renamed from: c */
    public static GroupBotMonitorCodeInternal f69258c = new GroupBotMonitorCodeInternal(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "pull_groupbot_candidate_success");

    /* renamed from: d */
    public static GroupBotMonitorCodeInternal f69259d = new GroupBotMonitorCodeInternal(10003, OPMonitorLevel.ERROR, "pull_groupbot_candidate_fail");

    /* renamed from: e */
    public static GroupBotMonitorCodeInternal f69260e = new GroupBotMonitorCodeInternal(10004, OPMonitorLevel.NORMAL, "search_groupbot_success");

    /* renamed from: f */
    public static GroupBotMonitorCodeInternal f69261f = new GroupBotMonitorCodeInternal(10005, OPMonitorLevel.ERROR, "search_groupbot_fail");

    /* renamed from: g */
    public static GroupBotMonitorCodeInternal f69262g = new GroupBotMonitorCodeInternal(10008, OPMonitorLevel.NORMAL, "add_groupbot_success");

    /* renamed from: h */
    public static GroupBotMonitorCodeInternal f69263h = new GroupBotMonitorCodeInternal(10009, OPMonitorLevel.ERROR, "add_groupbot_fail");

    /* renamed from: i */
    public static GroupBotMonitorCodeInternal f69264i = new GroupBotMonitorCodeInternal(10018, OPMonitorLevel.NORMAL, "delete_groupbot_success");

    /* renamed from: j */
    public static GroupBotMonitorCodeInternal f69265j = new GroupBotMonitorCodeInternal(10019, OPMonitorLevel.ERROR, "delete_groupbot_fail");

    /* renamed from: k */
    public static final Companion f69266k = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001a\u0010$\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001a\u0010'\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000e¨\u0006*"}, d2 = {"Lcom/ss/android/appcenter/business/monitor/monitor/GroupBotMonitorCode$Companion;", "", "()V", "ADD_TO_CHAT_EVENT", "", "DELETE_BOT_EVENT", "PULL_CAN_DATA_EVENT", "PULL_LIST_DATA_EVENT", "SEARCH_DATA_EVENT", "add_groupbot_fail", "Lcom/ss/android/appcenter/business/monitor/monitor/GroupBotMonitorCode$GroupBotMonitorCodeInternal;", "getAdd_groupbot_fail", "()Lcom/ss/android/appcenter/business/monitor/monitor/GroupBotMonitorCode$GroupBotMonitorCodeInternal;", "setAdd_groupbot_fail", "(Lcom/ss/android/appcenter/business/monitor/monitor/GroupBotMonitorCode$GroupBotMonitorCodeInternal;)V", "add_groupbot_success", "getAdd_groupbot_success", "setAdd_groupbot_success", "delete_groupbot_fail", "getDelete_groupbot_fail", "setDelete_groupbot_fail", "delete_groupbot_success", "getDelete_groupbot_success", "setDelete_groupbot_success", "pull_groupbot_candidate_fail", "getPull_groupbot_candidate_fail", "setPull_groupbot_candidate_fail", "pull_groupbot_candidate_success", "getPull_groupbot_candidate_success", "setPull_groupbot_candidate_success", "pull_groupbot_list_fail", "getPull_groupbot_list_fail", "setPull_groupbot_list_fail", "pull_groupbot_list_success", "getPull_groupbot_list_success", "setPull_groupbot_list_success", "search_groupbot_fail", "getSearch_groupbot_fail", "setSearch_groupbot_fail", "search_groupbot_success", "getSearch_groupbot_success", "setSearch_groupbot_success", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.monitor.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final GroupBotMonitorCodeInternal mo98861a() {
            return GroupBotMonitorCode.f69262g;
        }

        /* renamed from: b */
        public final GroupBotMonitorCodeInternal mo98862b() {
            return GroupBotMonitorCode.f69263h;
        }

        /* renamed from: c */
        public final GroupBotMonitorCodeInternal mo98863c() {
            return GroupBotMonitorCode.f69264i;
        }

        /* renamed from: d */
        public final GroupBotMonitorCodeInternal mo98864d() {
            return GroupBotMonitorCode.f69265j;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/appcenter/business/monitor/monitor/GroupBotMonitorCode$GroupBotMonitorCodeInternal;", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "code", "", "level", "Lcom/ss/android/lark/opmonitor/model/OPMonitorLevel;", "message", "", "(ILcom/ss/android/lark/opmonitor/model/OPMonitorLevel;Ljava/lang/String;)V", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.monitor.a.c$b */
    public static final class GroupBotMonitorCodeInternal extends OPMonitorCode {
        public GroupBotMonitorCodeInternal(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.group_bot", i, oPMonitorLevel, str);
        }
    }
}
