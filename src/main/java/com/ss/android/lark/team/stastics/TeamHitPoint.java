package com.ss.android.lark.team.stastics;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.entity.TeamSetting;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0003J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0003J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0003J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0007J\b\u0010 \u001a\u00020\u001fH\u0007J\b\u0010!\u001a\u00020\u001fH\u0007J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0007J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020'H\u0007J\u001a\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u0004H\u0007J \u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004H\u0007J\u0018\u0010.\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004H\u0007J\b\u0010/\u001a\u00020\u001fH\u0007J\u0010\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020'H\u0007J\b\u00102\u001a\u00020\u001fH\u0007J \u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0007J\b\u00105\u001a\u00020\u001fH\u0007J\b\u00106\u001a\u00020\u001fH\u0007J\b\u00107\u001a\u00020\u001fH\u0007J\u0010\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020'H\u0007J\u0010\u0010:\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010;\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-H\u0007J\b\u0010<\u001a\u00020\u001fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/ss/android/lark/team/stastics/TeamHitPoint;", "", "()V", "KEY_ADD_GROUP_AND_MEMBER_TOGGLE", "", "KEY_CLICK", "KEY_CREATE_GROUP_TOGGLE", "KEY_CREATE_TYPE", "KEY_GROUP_MODE", "KEY_IS_ADD_GROUP_AND_MEMBER_TOGGLE_CHANGED", "KEY_IS_CREATE_GROUP_TOGGLE_CHANGED", "KEY_IS_MEMBER_CHANGED", "KEY_IS_SUCCESS", "KEY_IS_TEAM_OWNER", "KEY_POPUP_TYPE", "KEY_TARGET", "KEY_TEAM_ID", "KEY_VIEW", "VALUE_CANCEL", "VALUE_CLOSE", "VALUE_OPEN", "VALUE_TARGET_NONE", "getAddGroupAndMemberToggle", "team", "Lcom/ss/android/lark/team/entity/Team;", "getCreateGroupToggle", "isAddGroupAndMemberChanged", "initTeam", "latestTeam", "isCreateGroupChanged", "onAddMemberFailedWhileCreating", "", "onCancelCreateTeam", "onCancelCreateTeamChat", "onClickCreateTeamChat", "chatMode", "Lcom/ss/android/lark/chat/entity/chat/Chat$ChatMode;", "onClickDisbandTeamPage", "confirmDisband", "", "onClickExitTeamDialog", "click", "target", "onClickTeamMoreDialog", "teamId", "", "onClickTeamSettingPage", "onClickTransferTeamOwner", "onCreateTeamResult", "isSuccess", "onExitTeamAuthorityPage", "onExitTeamSettingPage", "teamMemberChanged", "onShowCreateTeamChatPage", "onShowCreateTeamPage", "onShowDisbandTeamPage", "onShowExitTeamDialog", "isTeamOwner", "onShowTeamAuthorityPage", "onShowTeamMoreDialog", "onShowTeamSettingPage", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.e.b */
public final class TeamHitPoint {

    /* renamed from: a */
    public static final TeamHitPoint f136854a = new TeamHitPoint();

    private TeamHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m215077a(boolean z, Team team, Team team2) {
        Intrinsics.checkParameterIsNotNull(team, "initTeam");
        Intrinsics.checkParameterIsNotNull(team2, "latestTeam");
        String a = m215068a(team, team2);
        String b = m215078b(team2);
        String b2 = m215079b(team, team2);
        String c = m215083c(team2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "exit");
        jSONObject.put("target", "none");
        jSONObject.put("is_member_changed", String.valueOf(z));
        jSONObject.put("is_add_group_and_member_toggle_changed", a);
        jSONObject.put("add_group_and_member_toggle", b);
        jSONObject.put("is_create_group_toggle_changed", b2);
        jSONObject.put("create_group_toggle", c);
        Statistics.sendEvent("im_team_setting_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m215069a() {
        Statistics.sendEvent("im_create_team_view");
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m215086d() {
        Statistics.sendEvent("im_team_delete_view");
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m215087e() {
        Statistics.sendEvent("im_team_setting_view");
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m215088f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "back");
        Statistics.sendEvent("im_team_authority_management_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m215089g() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "transfer_team_owner");
        jSONObject.put("target", "feed_transfer_team_owner_view");
        Statistics.sendEvent("im_team_authority_management_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m215090h() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("group_mode", ChatTypeStateKeeper.f135670e);
        Statistics.sendEvent("im_team_create_chat_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: i */
    public static final void m215091i() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "cancel");
        jSONObject.put("target", "none");
        Statistics.sendEvent("im_team_create_chat_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m215084c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("popup_type", "add_chat");
        Statistics.sendEvent("im_team_create_fail_popup_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m215080b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "cancel");
        jSONObject.put("target", "none");
        Statistics.sendEvent("im_create_team_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m215070a(long j) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("team_id", j);
        Statistics.sendEvent("feed_team_more_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: b */
    private static final String m215078b(Team team) {
        TeamSetting.AddMemberPermission addMemberPermission;
        TeamSetting teamSetting = team.getTeamSetting();
        if (teamSetting != null) {
            addMemberPermission = teamSetting.getAddMemberPermission();
        } else {
            addMemberPermission = null;
        }
        if (addMemberPermission == TeamSetting.AddMemberPermission.ALL_MEMBERS) {
            return "open";
        }
        return "close";
    }

    @JvmStatic
    /* renamed from: c */
    private static final String m215083c(Team team) {
        TeamSetting.CreateTeamChatPermission createTeamChatPermission;
        TeamSetting teamSetting = team.getTeamSetting();
        if (teamSetting != null) {
            createTeamChatPermission = teamSetting.getCreateTeamChatPermission();
        } else {
            createTeamChatPermission = null;
        }
        if (createTeamChatPermission == TeamSetting.CreateTeamChatPermission.ALL_MEMBERS) {
            return "open";
        }
        return "close";
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m215072a(Chat.ChatMode chatMode) {
        String str;
        Intrinsics.checkParameterIsNotNull(chatMode, "chatMode");
        if (chatMode == Chat.ChatMode.DEFAULT) {
            str = "chat";
        } else {
            str = ChatTypeStateKeeper.f135670e;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "create");
        jSONObject.put("target", "none");
        jSONObject.put("group_mode", str);
        Statistics.sendEvent("im_team_create_chat_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m215085c(boolean z) {
        String str;
        if (z) {
            str = "delete";
        } else {
            str = "cancel";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", str);
        jSONObject.put("target", "none");
        Statistics.sendEvent("im_team_delete_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m215073a(Team team) {
        Intrinsics.checkParameterIsNotNull(team, "team");
        String b = m215078b(team);
        String c = m215083c(team);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("add_group_and_member_toggle", b);
        jSONObject.put("create_group_toggle", c);
        Statistics.sendEvent("im_team_authority_management_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m215082b(boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_team_owner", String.valueOf(z));
        Statistics.sendEvent("feed_team_exit_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m215076a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "create");
        jSONObject.put("target", "none");
        jSONObject.put("is_success", String.valueOf(z));
        Statistics.sendEvent("im_create_team_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    private static final String m215068a(Team team, Team team2) {
        TeamSetting.AddMemberPermission addMemberPermission;
        TeamSetting.AddMemberPermission addMemberPermission2;
        boolean z;
        TeamSetting teamSetting = team.getTeamSetting();
        if (teamSetting == null || (addMemberPermission = teamSetting.getAddMemberPermission()) == null) {
            addMemberPermission = TeamSetting.AddMemberPermission.UNKNOWN;
        }
        TeamSetting teamSetting2 = team2.getTeamSetting();
        if (teamSetting2 == null || (addMemberPermission2 = teamSetting2.getAddMemberPermission()) == null) {
            addMemberPermission2 = TeamSetting.AddMemberPermission.UNKNOWN;
        }
        if (addMemberPermission != addMemberPermission2) {
            z = true;
        } else {
            z = false;
        }
        return String.valueOf(z);
    }

    @JvmStatic
    /* renamed from: b */
    private static final String m215079b(Team team, Team team2) {
        TeamSetting.CreateTeamChatPermission createTeamChatPermission;
        TeamSetting.CreateTeamChatPermission createTeamChatPermission2;
        boolean z;
        TeamSetting teamSetting = team.getTeamSetting();
        if (teamSetting == null || (createTeamChatPermission = teamSetting.getCreateTeamChatPermission()) == null) {
            createTeamChatPermission = TeamSetting.CreateTeamChatPermission.UNKNOWN;
        }
        TeamSetting teamSetting2 = team2.getTeamSetting();
        if (teamSetting2 == null || (createTeamChatPermission2 = teamSetting2.getCreateTeamChatPermission()) == null) {
            createTeamChatPermission2 = TeamSetting.CreateTeamChatPermission.UNKNOWN;
        }
        if (createTeamChatPermission != createTeamChatPermission2) {
            z = true;
        } else {
            z = false;
        }
        return String.valueOf(z);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m215081b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "click");
        Intrinsics.checkParameterIsNotNull(str2, "target");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", str);
        jSONObject.put("target", str2);
        Statistics.sendEvent("im_team_setting_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m215074a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "click");
        Intrinsics.checkParameterIsNotNull(str2, "target");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", str);
        jSONObject.put("target", str2);
        Statistics.sendEvent("feed_team_exit_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m215071a(long j, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "click");
        Intrinsics.checkParameterIsNotNull(str2, "target");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("team_id", j);
        jSONObject.put("click", str);
        jSONObject.put("target", str2);
        Statistics.sendEvent("feed_team_more_click", jSONObject);
    }

    /* renamed from: a */
    public static /* synthetic */ void m215075a(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "none";
        }
        m215074a(str, str2);
    }
}
