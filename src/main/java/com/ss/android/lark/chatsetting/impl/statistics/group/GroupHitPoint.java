package com.ss.android.lark.chatsetting.impl.statistics.group;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/group/GroupHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.statistics.e.a */
public final class GroupHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f90519a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m136686a() {
        f90519a.mo129262n();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\bF\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rJ\u0010\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\bJ\u001f\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\bJ\u001e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\bJ\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010 \u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\bJ\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\bJ\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bJ\u000e\u0010&\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\bJ\u001e\u0010'\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\bJ\u0006\u0010)\u001a\u00020\u0018J\u0016\u0010*\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bJ\u000e\u0010+\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010,\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010-\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010.\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u000bJ\u0006\u00101\u001a\u00020\u0018J\u000e\u00102\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u00103\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u00104\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\bJ\u0016\u00105\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\bJ\u000e\u00106\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u00107\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\bJ\u0006\u00108\u001a\u00020\u0018J\u0006\u00109\u001a\u00020\u0018J\u000e\u0010:\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010;\u001a\u00020\u0018J\u0006\u0010<\u001a\u00020\u0018J\u0006\u0010=\u001a\u00020\u0018J\u0006\u0010>\u001a\u00020\u0018J\u0006\u0010?\u001a\u00020\u0018J\u000e\u0010@\u001a\u00020\u00182\u0006\u0010A\u001a\u00020\bJ\u0006\u0010B\u001a\u00020\u0018J\u000e\u0010C\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\bJ\u000e\u0010D\u001a\u00020\u00182\u0006\u0010E\u001a\u00020\bJ\b\u0010F\u001a\u00020\u0018H\u0007J>\u0010G\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020\rJ\u001e\u0010N\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010O\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010P\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010Q\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bJ&\u0010R\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010S\u001a\u00020\u000bJ\u0018\u0010T\u001a\u00020\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010$\u001a\u00020\bJ\u000e\u0010U\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\bJ\u0016\u0010V\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\r2\u0006\u0010W\u001a\u00020\rJ\u0016\u0010X\u001a\u00020\u00182\u0006\u0010Y\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\bJ\u0016\u0010Z\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010$\u001a\u00020\bJ\u000e\u0010[\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\bJ\u0006\u0010\\\u001a\u00020\u0018J\u0006\u0010]\u001a\u00020\u0018¨\u0006^"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/group/GroupHitPoint$Companion;", "", "()V", "getChatIdAndMemberTypeExtra", "Lorg/json/JSONObject;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChatType", "", "getGroupInfoExtra", "isModify", "", "charCount", "", "getGroupShareInfoExtra", "initTimeType", "timeType", "getShareChannel", "channel", "getSourceType", "contactMode", "shownTitleBar", "(Ljava/lang/Integer;Ljava/lang/Boolean;)Ljava/lang/String;", "sendAllStaffDelete", "", "sendChatSingleToGroupClick", "chatId", "sendClickCopyLinkEven", "sendClickDisbandGroupEvent", "sendClickGroupInfoEvent", "sendClickLeaveGroupEvent", "sendClickShareLinkEven", "sendClickSingleAddMember", "sendConfirmDisbandGroupEvent", "sendConfirmLeaveGroupEvent", "sendConfirmShareQRCodeEvent", "chatType", ShareHitPoint.f121868c, "sendCopyGroupLinkToWeChatEvent", "sendCreateGroupLinkEvent", "isFromShare", "sendCustomizeAvatarSave", "sendDelMemberEvent", "sendEditGroupAvatarEvent", "sendEditGroupDescEvent", "sendEditGroupNameEvent", "sendEditGroupNickNameEvent", "sendEduGroupShareClick", "fromSetting", "sendEnterCustomizeAvatarFromName", "sendEnterGroupCardEvent", "sendEnterGroupLinkEvent", "sendEnterGroupManageEvent", "sendEnterGroupQrcodeEvent", "sendEnterMemberList", "sendGroupAddMember", "sendGroupAvataClick", "sendGroupDescEditClick", "sendGroupDisband", "sendGroupExitClick", "sendGroupNameEditClick", "sendGroupQrcodeClick", "sendGroupShareClick", "sendGroupTransferOwnerClick", "sendGroupUnreadPositionSet", "positionSet", "sendInvalidateGroupShareHistory", "sendNewGroupTransferOwnerClick", "sendPickerView", "scenario", "sendProfileGroupView", "sendSaveCustomizeAvatar", "isUpload", "isChooseTitle", "titleIndex", "isInput", "isChooseColor", "colorSelect", "sendSaveGroupDescEvent", "sendSaveGroupNameEvent", "sendSaveGroupNickNameEvent", "sendSaveGroupQRCodeEvent", "sendShareAndSaveQRcodeEvent", "isSave", "sendShareGroupLinkEvent", "sendShareGroupQRCodeEvent", "sendShareHomeSchoolGroupEvent", "eventType", "sendShareHomeSchoolGroupShareTo", "fromQrCode", "sendShareQRCodeEvent", "sendShareQRCodeToWeChatEvent", "sendTeamGroupDelete", "sendViewJoinLeaverHistory", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.statistics.e.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo129212a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Statistics.sendEvent("chat_config_add_member_click", new JSONObject().put(ShareHitPoint.f121868c, "config").put("chat_id", str));
        }

        /* renamed from: a */
        public final void mo129215a(boolean z) {
            Statistics.sendEvent("im_chat_home_school_group_share", new JSONObject().put("b_name", z ? 1 : 2));
        }

        /* renamed from: a */
        public final void mo129213a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "chatType");
            Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121868c);
            Statistics.sendEvent("qrcode_save", new JSONObject().put(ShareHitPoint.f121869d, str).put(ShareHitPoint.f121868c, str2));
        }

        /* renamed from: a */
        public final void mo129216a(boolean z, String str) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
            if (Intrinsics.areEqual("share", str)) {
                str = "system";
            }
            Statistics.sendEvent("im_chat_home_school_group_share_to", new JSONObject().put("invite_source", z ? 1 : 2).put("b_name", str));
        }

        /* renamed from: a */
        public final void mo129214a(String str, boolean z, String str2) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
            Intrinsics.checkParameterIsNotNull(str2, "chatType");
            String str3 = z ? "share_" : "add_members_";
            Statistics.sendEvent("chat_link_create", new JSONObject().put(ShareHitPoint.f121868c, str3 + str).put(ShareHitPoint.f121869d, str2));
        }

        /* renamed from: a */
        public final void mo129211a(Chat chat, boolean z, boolean z2, int i, boolean z3, boolean z4, int i2) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_setting_edit_avatar_save_click", mo129223c(chat).put("upload_photo", z ? 1 : 0).put("choose_title", z2 ? 1 : 0).put("title_char_order", i).put("imput_title", z3 ? 1 : 0).put("choose_color", z4 ? 1 : 0).put("color_selection", String.valueOf(i2)));
        }

        /* renamed from: a */
        public final void mo129206a() {
            Statistics.sendEvent("teamgroup_delete");
        }

        /* renamed from: b */
        public final void mo129218b() {
            Statistics.sendEvent("allstaff_delete");
        }

        /* renamed from: c */
        public final void mo129224c() {
            Statistics.sendEvent("chat_config_name_edit_click");
        }

        /* renamed from: d */
        public final void mo129229d() {
            Statistics.sendEvent("chat_config_desc_edit_click");
        }

        /* renamed from: e */
        public final void mo129234e() {
            Statistics.sendEvent("chat_config_avatar_click");
        }

        /* renamed from: f */
        public final void mo129238f() {
            Statistics.sendEvent("chat_config_qrcode_click");
        }

        /* renamed from: g */
        public final void mo129241g() {
            Statistics.sendEvent("chat_config_share_click");
        }

        /* renamed from: h */
        public final void mo129245h() {
            Statistics.sendEvent("chat_config_transfer_click");
        }

        /* renamed from: i */
        public final void mo129247i() {
            Statistics.sendEvent("chat_config_exit_click");
        }

        /* renamed from: k */
        public final void mo129253k() {
            Statistics.sendEvent("invalidate_group_share_history_mobile");
        }

        /* renamed from: l */
        public final void mo129256l() {
            Statistics.sendEvent("view_join_leaver_history");
        }

        /* renamed from: m */
        public final void mo129259m() {
            Statistics.sendEvent("groupprofile_name_enter");
        }

        /* renamed from: j */
        public final void mo129250j() {
            Statistics.sendEvent("chat_config_single_to_group_click", new JSONObject().put(ShareHitPoint.f121868c, "config"));
        }

        @JvmStatic
        /* renamed from: n */
        public final void mo129262n() {
            try {
                Statistics.sendEvent("profile_view", new JSONObject().put("profile_type", "group"));
            } catch (Throwable th) {
                Log.m165382e(th.getMessage());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final String mo129217b(Chat chat) {
            if (chat == null) {
                return "";
            }
            if (chat.isCrossTenant()) {
                return "external";
            }
            if (chat.isPublic()) {
                return "public";
            }
            return "private";
        }

        /* renamed from: d */
        public final void mo129230d(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_setting_info_click", mo129223c(chat));
        }

        /* renamed from: e */
        public final void mo129235e(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_setting_edit_avatar_click", mo129223c(chat));
        }

        /* renamed from: f */
        public final void mo129239f(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_setting_edit_title_click", mo129223c(chat));
        }

        /* renamed from: g */
        public final void mo129242g(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_setting_edit_description_click", mo129223c(chat));
        }

        /* renamed from: h */
        public final void mo129246h(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_setting_chat_link_page_view", mo129223c(chat));
        }

        /* renamed from: i */
        public final void mo129248i(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_setting_chat_forward_page_view", mo129223c(chat));
        }

        /* renamed from: k */
        public final void mo129254k(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_setting_alias_click", mo129223c(chat));
        }

        /* renamed from: l */
        public final void mo129257l(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_setting_leave_click", mo129223c(chat));
        }

        /* renamed from: m */
        public final void mo129260m(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_setting_leave_confirm_click", mo129223c(chat));
        }

        /* renamed from: c */
        public final JSONObject mo129223c(Chat chat) {
            String str;
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("chat_id", chat.getId());
            if (C34501a.m133936b(chat)) {
                str = "admin";
            } else {
                str = "member";
            }
            jSONObject.put("member_type", str);
            return jSONObject;
        }

        /* renamed from: e */
        public final void mo129236e(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatType");
            Statistics.sendEvent("qrcode_share", new JSONObject().put(ShareHitPoint.f121869d, str));
        }

        /* renamed from: f */
        public final void mo129240f(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatType");
            Statistics.sendEvent("chat_link_share_to_wechat", new JSONObject().put(ShareHitPoint.f121869d, str));
        }

        /* renamed from: g */
        public final void mo129243g(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatType");
            Statistics.sendEvent("chat_qrcode_share_to_wechat", new JSONObject().put(ShareHitPoint.f121869d, str));
        }

        /* renamed from: i */
        public final void mo129249i(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Statistics.sendEvent("im_chat_setting_manage_click", new JSONObject().put("chat_id", str));
        }

        /* renamed from: j */
        public final void mo129251j(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_setting_member_list_page_view", mo129223c(chat).put(ShareHitPoint.f121868c, "setting_page"));
        }

        /* renamed from: k */
        public final void mo129255k(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Statistics.sendEvent("im_chat_setting_disband_confirm_click", new JSONObject().put("chat_id", str));
        }

        /* renamed from: l */
        public final void mo129258l(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Statistics.sendEvent("im_chat_setting_add_member_to_p2p_click", new JSONObject().put("chat_id", str));
        }

        /* renamed from: m */
        public final void mo129261m(String str) {
            Intrinsics.checkParameterIsNotNull(str, "scenario");
            Statistics.sendEvent("larkw_picker_view", new JSONObject().put("scenario", str));
        }

        /* renamed from: d */
        public final void mo129232d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Statistics.sendEvent("single_to_group", new JSONObject().put(ShareHitPoint.f121868c, "config").put("chat_id", str));
        }

        /* renamed from: h */
        public final String mo129244h(String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -611185015) {
                    if (hashCode != 2592) {
                        if (hashCode != 2763) {
                            if (hashCode != 2785) {
                                if (hashCode != 82605) {
                                    if (hashCode == 2074485 && str.equals("COPY")) {
                                        return "copy";
                                    }
                                } else if (str.equals("SYS")) {
                                    return "more";
                                }
                            } else if (str.equals("WX")) {
                                return "wechat";
                            }
                        } else if (str.equals("WB")) {
                            return "weibo";
                        }
                    } else if (str.equals("QQ")) {
                        return "qq";
                    }
                } else if (str.equals("LARK_CHAT")) {
                    return "feishu";
                }
            }
            if (str != null) {
                return str;
            }
            return "";
        }

        /* renamed from: j */
        public final void mo129252j(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Statistics.sendEvent("im_chat_setting_disband_click", new JSONObject().put("chat_id", str));
        }

        /* renamed from: b */
        public final void mo129221b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "positionSet");
            Statistics.sendEvent("chat_config_unread_position_set", new JSONObject().put("set_value", str));
        }

        /* renamed from: c */
        public final void mo129227c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Statistics.sendEvent("im_chat_gr_transfer", new JSONObject().put("chat_id", str));
        }

        /* renamed from: a */
        public final void mo129208a(Chat chat) {
            String str;
            String str2;
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            if (chat.isCrossTenant()) {
                str = "external";
            } else if (chat.isPublic()) {
                str = "public";
            } else {
                str = "private";
            }
            if (chat.isSecret()) {
                str2 = "secret";
            } else {
                str2 = "classic";
            }
            if (chat.isThread()) {
                str2 = ChatTypeStateKeeper.f135670e;
            }
            Statistics.sendEvent("group_disband", new JSONObject().put(ShareHitPoint.f121869d, str).put("mode", str2));
        }

        /* renamed from: a */
        public final String mo129203a(Integer num, Boolean bool) {
            if (num == null || bool == null) {
                return "";
            }
            if (bool.booleanValue()) {
                return "qrcodeEntrance";
            }
            if (num.intValue() == 1) {
                return "share";
            }
            return "add_members";
        }

        /* renamed from: e */
        public final void mo129237e(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121868c);
            Statistics.sendEvent("im_chat_setting_del_member_click", new JSONObject().put("chat_id", str).put(ShareHitPoint.f121868c, str2));
        }

        /* renamed from: a */
        public final void mo129207a(int i, int i2) {
            Statistics.sendEvent("im_chat_home_school_group_share_type", new JSONObject().put("invite_source", i).put("b_name", i2));
        }

        /* renamed from: d */
        public final void mo129233d(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "channel");
            Intrinsics.checkParameterIsNotNull(str2, "chatType");
            Statistics.sendEvent("chat_qrcode_share_channel", new JSONObject().put("channel", mo129244h(str)).put(ShareHitPoint.f121869d, str2));
        }

        /* renamed from: b */
        public final void mo129222b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "chatType");
            Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121868c);
            Statistics.sendEvent("qrcode_share_confirmed", new JSONObject().put(ShareHitPoint.f121869d, str).put(ShareHitPoint.f121868c, str2));
        }

        /* renamed from: c */
        public final void mo129228c(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str2, "chatType");
            Statistics.sendEvent("chat_link_share_channel", new JSONObject().put("channel", mo129244h(str)).put(ShareHitPoint.f121869d, str2));
        }

        /* renamed from: a */
        public final void mo129210a(Chat chat, String str) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
            Statistics.sendEvent("im_chat_setting_qrcode_page_view", mo129223c(chat).put(ShareHitPoint.f121868c, str));
        }

        /* renamed from: c */
        public final void mo129225c(Chat chat, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_setting_chat_link_share_click", mo129204a(chat, i, i2));
        }

        /* renamed from: a */
        public final JSONObject mo129204a(Chat chat, int i, int i2) {
            int i3;
            String str;
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            JSONObject c = mo129223c(chat);
            if (i == i2) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            if (i2 == 0) {
                str = "1_week";
            } else if (i2 == 1) {
                str = "1_year";
            } else if (i2 != 2) {
                str = "";
            } else {
                str = "permanent";
            }
            c.put("altered_expiration_period", i3).put("expiration_period", str);
            return c;
        }

        /* renamed from: b */
        public final void mo129219b(Chat chat, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_setting_chat_link_copy_click", mo129204a(chat, i, i2));
        }

        /* renamed from: d */
        public final void mo129231d(Chat chat, boolean z, int i) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_setting_alias_save_click", mo129205a(chat, z, i));
        }

        /* renamed from: a */
        public final JSONObject mo129205a(Chat chat, boolean z, int i) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            JSONObject c = mo129223c(chat);
            c.put("altered", z ? 1 : 0);
            c.put("char_count", i);
            return c;
        }

        /* renamed from: b */
        public final void mo129220b(Chat chat, boolean z, int i) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_setting_edit_title_save_click", mo129205a(chat, z, i));
        }

        /* renamed from: c */
        public final void mo129226c(Chat chat, boolean z, int i) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_setting_edit_description_save_click", mo129205a(chat, z, i));
        }

        /* renamed from: a */
        public final void mo129209a(Chat chat, int i, int i2, boolean z) {
            String str;
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            if (z) {
                str = "im_chat_setting_qrcode_save_click";
            } else {
                str = "im_chat_setting_qrcode_share_click";
            }
            Statistics.sendEvent(str, mo129204a(chat, i, i2));
        }
    }
}
