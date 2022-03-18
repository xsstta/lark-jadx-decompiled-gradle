package com.ss.android.lark.chatsetting.impl.statistics;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.extensions.C54952a;
import com.ss.android.lark.statistics.extensions.IParam;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003234B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\u0016\u001a\u00020\tH\u0007J\b\u0010\u0017\u001a\u00020\tH\u0007J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\u0019\u001a\u00020\tH\u0007J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\u001b\u001a\u00020\tH\u0007J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\u001d\u001a\u00020\tH\u0007J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010 \u001a\u00020\tH\u0007J\u001c\u0010!\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010%\u001a\u00020\tH\u0007J\u0010\u0010&\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010'\u001a\u00020\tH\u0007J\u0010\u0010(\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010)\u001a\u00020\tH\u0007J\u0010\u0010*\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010+\u001a\u00020\tH\u0007J\u0010\u0010,\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010-\u001a\u00020\tH\u0007J\u0010\u0010.\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010/\u001a\u00020\tH\u0007J\u0010\u00100\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u00101\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/ChatSettingHitPointNew;", "", "()V", "CLICK", "", "NONE", "STATUS", "TARGET", "sendAddGroupMemberActionEvent", "", "extraParam", "Lcom/ss/android/lark/statistics/extensions/IParam;", "sendChatMainClick", "sendChatSettingClick", "param", "Lcom/ss/android/lark/chatsetting/impl/statistics/ChatSettingHitPointNew$ChatSettingClickParams;", "sendChatSettingView", "action", "sendDisbandTeamEvent", "confirmUnbind", "", "sendDismissGroupActionEvent", "sendDismissGroupConfirmPageDisplayEvent", "sendEnterOnGroupInfoDisplayEvent", "sendGroupAliasEditorActionEvent", "sendGroupAliasEditorDisplayEvent", "sendGroupAvatarEditActionEvent", "sendGroupAvatarEditorDisplayEvent", "sendGroupDescEditorActionEvent", "sendGroupDescEditorDisplayEvent", "sendGroupInfoViewActionEvent", "sendGroupLinkActionEvent", "sendGroupLinkPageDisplayEvent", "sendGroupManageClick", "Lcom/ss/android/lark/chatsetting/impl/statistics/ChatSettingHitPointNew$GroupManageParam;", "statusParam", "Lcom/ss/android/lark/chatsetting/impl/statistics/ChatSettingHitPointNew$ManagePermissionParams;", "sendGroupManageView", "sendGroupNameEditorActionEvent", "sendGroupNameEditorDisplayEvent", "sendGroupQRCodePageActionEvent", "sendGroupQRCodePageDisplayEvent", "sendGroupQRCodeSharePopupActionEvent", "sendGroupQRCodeSharePopupDisplayEvent", "sendMemberTopLimitApplyClick", "sendMemberTopLimitApplyView", "sendQuitGroupActionEvent", "sendQuitGroupPageDisplayEvent", "sendShareGroupActionEvent", "sendShareGroupPageDisplayEvent", "ChatSettingClickParams", "GroupManageParam", "ManagePermissionParams", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatSettingHitPointNew {

    /* renamed from: a */
    public static final ChatSettingHitPointNew f90511a = new ChatSettingHitPointNew();

    @JvmStatic
    /* renamed from: a */
    public static final void m136623a(GroupManageParam groupManageParam) {
        m136625a(groupManageParam, null, 2, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/ChatSettingHitPointNew$ChatSettingClickParams;", "", "action", "", "target", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getTarget", "IM_GROUP_MEMBER_VIEW", "IM_GROUP_MANAGE_VIEW", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ChatSettingClickParams {
        IM_GROUP_MEMBER_VIEW("group_member", "im_group_member_view"),
        IM_GROUP_MANAGE_VIEW("group_manage", "im_group_manage_view");
        
        private final String action;
        private final String target;

        public final String getAction() {
            return this.action;
        }

        public final String getTarget() {
            return this.target;
        }

        private ChatSettingClickParams(String str, String str2) {
            this.action = str;
            this.target = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/ChatSettingHitPointNew$GroupManageParam;", "", "action", "", "target", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getTarget", "TRANSFER_GROUP_OWNER", "GROUP_SHARE_HISTORY", "MEMBER_INOUT_HISTORY", "LEAVE_GROUP_SYSTEM_MESSAGE", "JOIN_GROUP_SYSTEM_MESSAGE", "JOIN_GROUP_RESTRICTION", "MAIL_RESTRICTION", "MESSAGE_RESTRICTION", "ADD_MEMBER_SHARE_GROUP", "MENTION_ALL_MEMBER", "EDIT_GROUP_INFO", "GROUP_ADMIN_MEMBER", "UNBINDING_TEAM", "PIN_RESTRICTION", "VC_RESTRICTION", "DING_RESTRICTION", "IS_HISTORY_MESSAGE_VIEW", "PIN_TO_TOP_RESTRICTION", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum GroupManageParam {
        TRANSFER_GROUP_OWNER("transfer_group_owner", "none"),
        GROUP_SHARE_HISTORY("group_share_history", "none"),
        MEMBER_INOUT_HISTORY("member_inout_history", "none"),
        LEAVE_GROUP_SYSTEM_MESSAGE("leave_group_system_message", "none"),
        JOIN_GROUP_SYSTEM_MESSAGE("join_group_system_message", "none"),
        JOIN_GROUP_RESTRICTION("join_group_restriction", "none"),
        MAIL_RESTRICTION("mail_restriction", "none"),
        MESSAGE_RESTRICTION("message_restriction", "none"),
        ADD_MEMBER_SHARE_GROUP("add_member_share_group", "none"),
        MENTION_ALL_MEMBER("mention_all_member", "none"),
        EDIT_GROUP_INFO("edit_group_info", "none"),
        GROUP_ADMIN_MEMBER("group_admin_member", "im_group_admin_view"),
        UNBINDING_TEAM("unbundling", "im_group_unbundling_view"),
        PIN_RESTRICTION("pin_restriction", "none"),
        VC_RESTRICTION("vc_restriction", "none"),
        DING_RESTRICTION("ding_restriction", "none"),
        IS_HISTORY_MESSAGE_VIEW("is_history_message_view", "none"),
        PIN_TO_TOP_RESTRICTION("pin_to_top_restriction", "none");
        
        private final String action;
        private final String target;

        public final String getAction() {
            return this.action;
        }

        public final String getTarget() {
            return this.target;
        }

        private GroupManageParam(String str, String str2) {
            this.action = str;
            this.target = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/ChatSettingHitPointNew$ManagePermissionParams;", "", UpdateKey.STATUS, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "ONLY_GROUP_OWNER_AND_ADMIN", "ALL", "NOBODY", "ON_TO_OFF", "OFF_TO_ON", "ONLY_GROUP_MEMBER", "ONLY_TEAM_MEMBER", "SOME_MEMBER", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ManagePermissionParams {
        ONLY_GROUP_OWNER_AND_ADMIN("only_group_owner_and_admin"),
        ALL("all"),
        NOBODY("nobody"),
        ON_TO_OFF("on_to_off"),
        OFF_TO_ON("off_to_on"),
        ONLY_GROUP_MEMBER("only_group_member"),
        ONLY_TEAM_MEMBER("only_team_member"),
        SOME_MEMBER("some_member");
        
        private final String status;

        public final String getStatus() {
            return this.status;
        }

        private ManagePermissionParams(String str) {
            this.status = str;
        }
    }

    private ChatSettingHitPointNew() {
    }

    @JvmStatic
    /* renamed from: m */
    public static final void m136651m() {
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null) {
            Statistics.sendEvent("im_chat_member_toplimit_apply_view", C54952a.m213207a(b));
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m136621a() {
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null) {
            Statistics.sendEvent("im_group_manage_view", new JSONObject(b));
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m136629b() {
        JSONObject a;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null && (a = C54952a.m213207a(b)) != null) {
            Statistics.sendEvent("im_edit_group_info_view", a);
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m136631c() {
        JSONObject a;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null && (a = C54952a.m213207a(b)) != null) {
            Statistics.sendEvent("im_edit_group_avatar_view", a);
        }
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m136633d() {
        JSONObject a;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null && (a = C54952a.m213207a(b)) != null) {
            Statistics.sendEvent("im_edit_group_name_view", a);
        }
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m136635e() {
        JSONObject a;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null && (a = C54952a.m213207a(b)) != null) {
            Statistics.sendEvent("im_edit_group_description_view", a);
        }
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m136637f() {
        JSONObject a;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null && (a = C54952a.m213207a(b)) != null) {
            Statistics.sendEvent("im_edit_alias_view", a);
        }
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m136639g() {
        JSONObject a;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null && (a = C54952a.m213207a(b)) != null) {
            Statistics.sendEvent("im_group_QR_view", a);
        }
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m136641h() {
        JSONObject a;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null && (a = C54952a.m213207a(b)) != null) {
            Statistics.sendEvent("im_group_QR_link_share_to_view", a);
        }
    }

    @JvmStatic
    /* renamed from: i */
    public static final void m136643i() {
        JSONObject a;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null && (a = C54952a.m213207a(b)) != null) {
            Statistics.sendEvent("im_share_group_view", a);
        }
    }

    @JvmStatic
    /* renamed from: j */
    public static final void m136645j() {
        JSONObject a;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null && (a = C54952a.m213207a(b)) != null) {
            Statistics.sendEvent("im_group_link_view", a);
        }
    }

    @JvmStatic
    /* renamed from: k */
    public static final void m136647k() {
        JSONObject a;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null && (a = C54952a.m213207a(b)) != null) {
            Statistics.sendEvent("im_quit_group_confirm_view", a);
        }
    }

    @JvmStatic
    /* renamed from: l */
    public static final void m136649l() {
        JSONObject a;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null && (a = C54952a.m213207a(b)) != null) {
            Statistics.sendEvent("im_dismiss_group_confirm_view", a);
        }
    }

    @JvmStatic
    /* renamed from: m */
    public static final void m136652m(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_quit_group_confirm_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
    }

    @JvmStatic
    /* renamed from: n */
    public static final void m136653n(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_dismiss_group_confirm_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
    }

    @JvmStatic
    /* renamed from: o */
    public static final void m136654o(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_chat_main_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
    }

    @JvmStatic
    /* renamed from: p */
    public static final void m136655p(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_chat_member_toplimit_apply_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m136622a(ChatSettingClickParams chatSettingClickParams) {
        Intrinsics.checkParameterIsNotNull(chatSettingClickParams, "param");
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null) {
            Statistics.sendEvent("im_chat_setting_click", new JSONObject(b).put("click", chatSettingClickParams.getAction()).put("target", chatSettingClickParams.getTarget()));
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m136630b(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_chat_setting_click", C54952a.m213204a(cVar, ChatParamUtils.m133148b()).toJson());
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m136632c(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_edit_group_info_click", C54952a.m213204a(cVar, ChatParamUtils.m133148b()).toJson());
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m136634d(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_edit_group_avatar_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m136636e(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_edit_group_name_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m136638f(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_edit_alias_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m136640g(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_edit_group_description_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m136642h(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_group_QR_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
    }

    @JvmStatic
    /* renamed from: i */
    public static final void m136644i(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_group_QR_link_share_to_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
    }

    @JvmStatic
    /* renamed from: j */
    public static final void m136646j(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_group_member_add_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
    }

    @JvmStatic
    /* renamed from: k */
    public static final void m136648k(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_share_group_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
    }

    @JvmStatic
    /* renamed from: l */
    public static final void m136650l(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_group_link_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m136626a(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_group_manage_click", C54952a.m213204a(cVar, ChatParamUtils.m133148b()).toJson());
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m136627a(String str) {
        boolean z;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null) {
            JSONObject jSONObject = new JSONObject(b);
            if (str != null) {
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    jSONObject.put("action", str);
                }
            }
            Statistics.sendEvent("im_chat_setting_view", jSONObject);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m136628a(boolean z) {
        JSONObject a;
        String str;
        long j;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null && (a = C54952a.m213207a(b)) != null) {
            if (z) {
                str = "unbundling";
            } else {
                str = "cancel";
            }
            Chat d = ChatParamUtils.m133151d();
            if (d != null) {
                j = d.getTeamId();
            } else {
                j = 0;
            }
            a.put("click", str);
            a.put("target", "none");
            a.put("team_id", j);
            Statistics.sendEvent("im_group_unbundling_click", a);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m136624a(GroupManageParam groupManageParam, ManagePermissionParams managePermissionParams) {
        Intrinsics.checkParameterIsNotNull(groupManageParam, "param");
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null) {
            JSONObject put = new JSONObject(b).put("click", groupManageParam.getAction()).put("target", groupManageParam.getTarget());
            if (managePermissionParams != null) {
                put.put(UpdateKey.STATUS, managePermissionParams.getStatus());
            }
            Statistics.sendEvent("im_group_manage_click", put);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m136625a(GroupManageParam groupManageParam, ManagePermissionParams managePermissionParams, int i, Object obj) {
        if ((i & 2) != 0) {
            managePermissionParams = null;
        }
        m136624a(groupManageParam, managePermissionParams);
    }
}
