package com.ss.android.lark.member_manage.impl.statistics.group;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0002\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/statistics/group/GroupHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "GroupMemberAction", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class GroupHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final String f114611a;

    /* renamed from: b */
    public static final Companion f114612b = new Companion(null);

    /* renamed from: c */
    private static final IGroupMemberManageModuleDependency.AbstractC44878a f114613c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004J&\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u0015J\u001e\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0004J\u000e\u0010#\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010$\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!J\u0016\u0010%\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!J\u0006\u0010&\u001a\u00020\u0015J\u0016\u0010'\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!J\u000e\u0010(\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010)\u001a\u00020\u0015J\u0006\u0010*\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \f*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/statistics/group/GroupHitPoint$Companion;", "", "()V", "CLICK", "", "CONFIRM", "CONFIRM_TYPE", "IM_GROUP_CONFIRM_VIEW", "NONE", "TARGET", "loginDependency", "Lcom/ss/android/lark/member_manage/dependency/IGroupMemberManageModuleDependency$IAccountDependency;", "kotlin.jvm.PlatformType", "selfUserId", "getGroupType", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isGroupOwner", "", "sendAddGroupMemberConfirmClick", "", ShareHitPoint.f121868c, "sendCreateExternalGroupFromExistingChatEvent", "isPublic", "isExternal", "mode", "Lcom/ss/android/lark/chat/entity/chat/Chat$ChatMode;", "initialGroupCount", "", "sendFilterNonTeamMembers", "sendGroupAdminClick", "action", "Lcom/ss/android/lark/member_manage/impl/statistics/group/GroupHitPoint$GroupMemberAction;", "target", "sendGroupAdminView", "sendGroupConfirmClick", "sendGroupConfirmView", "sendGroupFindMemberClick", "sendGroupMemberClick", "sendGroupMemberView", "sendGroupRemoveMemberClick", "sendInviteMemberEvent", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.statistics.group.GroupHitPoint$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo159950a() {
            Statistics.sendEvent("chat_config_remove_member_click");
        }

        /* renamed from: b */
        public final void mo159956b() {
            Statistics.sendEvent("chat_config_find_member_click");
        }

        /* renamed from: c */
        public final void mo159959c() {
            Statistics.sendEvent("filter_non_team_members");
        }

        /* renamed from: d */
        public final void mo159961d() {
            Statistics.sendEvent("im_chat_config_group_member_remind_click");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        private final boolean m179757d(Chat chat) {
            if (chat == null || chat.isP2PChat() || !Intrinsics.areEqual(chat.getOwnerId(), GroupHitPoint.f114611a)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final void mo159951a(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_group_member_view", new JSONObject(ChatParamUtils.m133137a(chat, GroupHitPoint.f114611a, (Chatter) null, 4, (Object) null)));
        }

        /* renamed from: b */
        public final void mo159957b(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_group_admin_view", new JSONObject(ChatParamUtils.m133137a(chat, GroupHitPoint.f114611a, (Chatter) null, 4, (Object) null)));
        }

        /* renamed from: c */
        private final List<String> m179756c(Chat chat) {
            if (chat == null) {
                return CollectionsKt.emptyList();
            }
            Map mapOf = MapsKt.mapOf(TuplesKt.to(Boolean.valueOf(chat.isThread()), "circle"), TuplesKt.to(Boolean.valueOf(chat.isSecret()), "off_the_record"), TuplesKt.to(Boolean.valueOf(true ^ chat.isCrossTenant()), "internal"), TuplesKt.to(Boolean.valueOf(chat.isCrossTenant()), "external"), TuplesKt.to(Boolean.valueOf(chat.isEdu()), "school_parent"), TuplesKt.to(Boolean.valueOf(chat.is_department()), "department"), TuplesKt.to(Boolean.valueOf(chat.isTenant()), "all_staff"), TuplesKt.to(Boolean.valueOf(chat.isOnCall()), "on_call"), TuplesKt.to(Boolean.valueOf(chat.isCustomerService()), "customer_service"), TuplesKt.to(Boolean.valueOf(chat.isMeeting()), "meeting"));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapOf.entrySet()) {
                ((Boolean) entry.getKey()).booleanValue();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            return CollectionsKt.toList(linkedHashMap.values());
        }

        /* renamed from: a */
        public final void mo159952a(Chat chat, GroupMemberAction groupMemberAction) {
            String str;
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(groupMemberAction, "action");
            JSONObject put = new JSONObject(ChatParamUtils.m133137a(chat, GroupHitPoint.f114611a, (Chatter) null, 4, (Object) null)).put("click", groupMemberAction.toString());
            int i = C45270a.f114614a[groupMemberAction.ordinal()];
            if (i == 1 || i == 2) {
                str = "im_group_confirm_view";
            } else {
                str = "none";
            }
            Statistics.sendEvent("im_group_member_click", put.put("target", str));
        }

        /* renamed from: b */
        public final void mo159958b(Chat chat, GroupMemberAction groupMemberAction) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(groupMemberAction, "action");
            Statistics.sendEvent("im_group_confirm_view", new JSONObject(ChatParamUtils.m133137a(chat, GroupHitPoint.f114611a, (Chatter) null, 4, (Object) null)).put("confirm_type", groupMemberAction.toString()));
        }

        /* renamed from: c */
        public final void mo159960c(Chat chat, GroupMemberAction groupMemberAction) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(groupMemberAction, "action");
            Statistics.sendEvent("im_group_confirm_click", new JSONObject(ChatParamUtils.m133137a(chat, GroupHitPoint.f114611a, (Chatter) null, 4, (Object) null)).put("click", "confirm").put("confirm_type", groupMemberAction.toString()).put("target", "none"));
        }

        /* renamed from: a */
        public final void mo159954a(Chat chat, String str) {
            String str2;
            String str3;
            if (chat != null) {
                List<String> c = m179756c(chat);
                if (chat.isPublic()) {
                    str2 = "public";
                } else {
                    str2 = "private";
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("chat_id", chat.getId());
                jSONObject.put(ShareHitPoint.f121869d, c);
                jSONObject.put("mode", str2);
                jSONObject.put(ShareHitPoint.f121868c, str);
                if (GroupHitPoint.f114612b.m179757d(chat)) {
                    str3 = "admin";
                } else {
                    str3 = "member";
                }
                jSONObject.put("member_type", str3);
                Statistics.sendEvent("im_chat_setting_add_member_click", jSONObject);
            }
        }

        /* renamed from: a */
        public final void mo159953a(Chat chat, GroupMemberAction groupMemberAction, String str) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(groupMemberAction, "action");
            Intrinsics.checkParameterIsNotNull(str, "target");
            Statistics.sendEvent("im_group_admin_click", new JSONObject(ChatParamUtils.m133137a(chat, GroupHitPoint.f114611a, (Chatter) null, 4, (Object) null)).put("click", groupMemberAction.toString()).put("target", str));
        }

        /* renamed from: a */
        public final void mo159955a(boolean z, boolean z2, Chat.ChatMode chatMode, int i) {
            String str;
            String str2;
            Intrinsics.checkParameterIsNotNull(chatMode, "mode");
            if (z2) {
                str = "external";
            } else if (z) {
                str = "public";
            } else {
                str = "private";
            }
            if (chatMode == Chat.ChatMode.DEFAULT) {
                str2 = "classic";
            } else {
                str2 = ChatTypeStateKeeper.f135670e;
            }
            Statistics.sendEvent("create_external_group_from_existing_chat", new JSONObject().put(ShareHitPoint.f121869d, str).put("mode", str2).put("members_number", i));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/statistics/group/GroupHitPoint$GroupMemberAction;", "", "(Ljava/lang/String;I)V", "toString", "", "TRANSFER_OWNER", "ASSIGN_ADMIN", "DELETE_ADMIN", "DELETE_GROUP_MEMBERS", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum GroupMemberAction {
        TRANSFER_OWNER,
        ASSIGN_ADMIN,
        DELETE_ADMIN,
        DELETE_GROUP_MEMBERS;

        public String toString() {
            String str = super.toString();
            Locale locale = Locale.ROOT;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ROOT");
            if (str != null) {
                String lowerCase = str.toLowerCase(locale);
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                return lowerCase;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    static {
        IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
        IGroupMemberManageModuleDependency.AbstractC44878a accountDependency = a.getAccountDependency();
        f114613c = accountDependency;
        Intrinsics.checkExpressionValueIsNotNull(accountDependency, "loginDependency");
        f114611a = accountDependency.mo143795b();
    }
}
