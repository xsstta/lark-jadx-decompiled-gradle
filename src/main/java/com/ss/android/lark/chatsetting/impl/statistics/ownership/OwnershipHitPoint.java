package com.ss.android.lark.chatsetting.impl.statistics.ownership;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0002\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/ownership/OwnershipHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "GroupManageSwitchSetting", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class OwnershipHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f90525a = new Companion(null);

    @Target({ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/ownership/OwnershipHitPoint$GroupManageSwitchSetting;", "", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface GroupManageSwitchSetting {
        public static final Companion Companion = Companion.f90526a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/ownership/OwnershipHitPoint$GroupManageSwitchSetting$Companion;", "", "()V", "AT_ALL", "", "EDIT_INFO", "MEMBERSHIP_APPROVAL", "SHARE_GROUP", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPoint$GroupManageSwitchSetting$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f90526a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ&\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ&\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fJ&\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010 \u001a\u00020\u0004J\u0006\u0010!\u001a\u00020\u0004J\u0006\u0010\"\u001a\u00020\u0004J-\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00142\b\u0010'\u001a\u0004\u0018\u00010\u00142\u0006\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010(¨\u0006)"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/ownership/OwnershipHitPoint$Companion;", "", "()V", "addNewGroupMemberClick", "", "approveInvitationSetting", "isOpen", "", "groupApplicationPass", "groupApplicationReject", "sendClickMeeting2Group", "createText", "", "chatId", "sendDissolveGroupEvent", "sendEmailPermissionEvent", "enable", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/chat/Chat$GroupMailSendPermissionType;", "memberCount", "", "sendEnterChangeOwner", ShareHitPoint.f121868c, "sendEnterJoinAndLeaveHistory", "sendEnterShareHistory", "sendGroupManageSwitchEvent", "eventType", "checked", "sendJoinAndLeaveMessageEvent", "isLeave", "permissionType", "Lcom/ss/android/lark/chat/entity/chat/Chat$SystemMessageVisible;", "sendOnClickMeeting2Chat", "sendOnMeeting2ChatCancel", "sendOnMeeting2ChatConfirm", "sendPostSettingChangeEvent", "postType", "Lcom/ss/android/lark/chat/entity/chat/Chat$PostType;", "whiteMember", "groupMemberCount", "(Lcom/ss/android/lark/chat/entity/chat/Chat$PostType;ILjava/lang/Integer;Ljava/lang/String;)V", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPoint$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo129282a() {
            Statistics.sendEvent("add_new_group_member_click");
        }

        /* renamed from: b */
        public final void mo129290b() {
            Statistics.sendEvent("group_application_pass");
        }

        /* renamed from: c */
        public final void mo129293c() {
            Statistics.sendEvent("group_application_reject");
        }

        /* renamed from: d */
        public final void mo129295d() {
            Statistics.sendEvent("cal_transform");
        }

        /* renamed from: e */
        public final void mo129296e() {
            Statistics.sendEvent("cal_transform_popup", new JSONObject().put(ShareHitPoint.f121868c, "setting").put("action_type", "yes"));
        }

        /* renamed from: f */
        public final void mo129297f() {
            Statistics.sendEvent("cal_transform_popup", new JSONObject().put(ShareHitPoint.f121868c, "setting").put("action_type", "no"));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo129285a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Statistics.sendEvent("im_chat_gr_disband", new JSONObject().put("chat_id", str));
        }

        /* renamed from: b */
        public final void mo129291b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Statistics.sendEvent("im_chat_manage_join_leave_history_click", new JSONObject().put("chat_id", str));
        }

        /* renamed from: c */
        public final void mo129294c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Statistics.sendEvent("im_chat_manage_sharing_history_click", new JSONObject().put("chat_id", str));
        }

        /* renamed from: a */
        public final void mo129287a(boolean z) {
            String str;
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "open";
            } else {
                str = "close";
            }
            Statistics.sendEvent("approve_invitation_setting", jSONObject.put("action", str));
        }

        /* renamed from: a */
        public final void mo129286a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
            Intrinsics.checkParameterIsNotNull(str2, "chatId");
            Statistics.sendEvent("im_chat_manage_assign_group_owner_page_view", new JSONObject().put(ShareHitPoint.f121868c, str).put("chat_id", str2));
        }

        /* renamed from: b */
        public final void mo129292b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "createText");
            Intrinsics.checkParameterIsNotNull(str2, "chatId");
            Statistics.sendEvent("im_chat_manage_convert_to_standard_group_click", new JSONObject().put("time_lapse_since_group_created", String.valueOf((int) (((System.currentTimeMillis() / ((long) 1000)) - Long.parseLong(str)) / ((long) 3600)))).put("chat_id", str2));
        }

        /* renamed from: a */
        public final void mo129283a(int i, boolean z, int i2, String str) {
            String str2;
            String str3;
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            if (z) {
                str2 = "off_to_on";
            } else {
                str2 = "on_to_off";
            }
            if (i == 0) {
                str3 = "im_chat_manage_edit_group_info_switch";
            } else if (i == 1) {
                str3 = "im_chat_manage_share_group_switch";
            } else if (i == 2) {
                str3 = "im_chat_manage_at_all_switch";
            } else if (i != 3) {
                str3 = "";
            } else {
                str3 = "im_chat_manage_membership_approval_switch";
            }
            Statistics.sendEvent(str3, new JSONObject().put(UpdateKey.STATUS, str2).put("member_count", String.valueOf(i2)).put("chat_id", str));
        }

        /* renamed from: a */
        public final void mo129284a(Chat.PostType postType, int i, Integer num, String str) {
            String str2;
            Intrinsics.checkParameterIsNotNull(postType, "postType");
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            int i2 = C35076a.f90527a[postType.ordinal()];
            int i3 = 1;
            if (i2 == 1) {
                i3 = 1 + i;
                str2 = "few_member";
            } else if (i2 != 2) {
                if (num != null) {
                    i3 = num.intValue();
                } else {
                    i3 = 0;
                }
                str2 = "everyone";
            } else {
                str2 = "admin_only";
            }
            Statistics.sendEvent("im_chat_manage_msg_permission_setting", new JSONObject().put(UpdateKey.STATUS, str2).put("enabled_count", String.valueOf(i3)).put("member_count", String.valueOf(num)).put("chat_id", str));
        }

        /* renamed from: a */
        public final void mo129288a(boolean z, Chat.GroupMailSendPermissionType groupMailSendPermissionType, int i, String str) {
            String str2;
            Intrinsics.checkParameterIsNotNull(groupMailSendPermissionType, ShareHitPoint.f121869d);
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            if (!z) {
                str2 = "no_one";
            } else {
                int i2 = C35076a.f90528b[groupMailSendPermissionType.ordinal()];
                if (i2 == 1) {
                    str2 = "everyone";
                } else if (i2 == 2) {
                    str2 = "admin_only";
                } else if (i2 == 3) {
                    str2 = "group_member";
                } else if (i2 != 4) {
                    str2 = "";
                } else {
                    str2 = "team_member";
                }
            }
            Statistics.sendEvent("im_chat_manage_send_email_permission_setting", new JSONObject().put(UpdateKey.STATUS, str2).put("member_count", String.valueOf(i)).put("chat_id", str));
        }

        /* renamed from: a */
        public final void mo129289a(boolean z, Chat.SystemMessageVisible systemMessageVisible, int i, String str) {
            String str2;
            String str3;
            Intrinsics.checkParameterIsNotNull(systemMessageVisible, "permissionType");
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            if (z) {
                str2 = "im_chat_manage_exit_group_notice_setting";
            } else {
                str2 = "im_chat_manage_enter_group_notice_setting";
            }
            int i2 = C35076a.f90529c[systemMessageVisible.ordinal()];
            if (i2 == 1) {
                str3 = "everyone";
            } else if (i2 == 2) {
                str3 = "admin_only";
            } else if (i2 != 3) {
                str3 = "";
            } else {
                str3 = "no_one";
            }
            Statistics.sendEvent(str2, new JSONObject().put(UpdateKey.STATUS, str3).put("member_count", String.valueOf(i)).put("chat_id", str));
        }
    }
}
