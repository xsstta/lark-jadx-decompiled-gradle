package com.ss.android.lark.member_manage.impl.statistics;

import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.member_manage.impl.statistics.GroupMemberManageExtraParams;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.extensions.C54952a;
import com.ss.android.lark.statistics.extensions.IParam;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u000fH\u0007J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0011H\u0007J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\rH\u0007J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0018\u001a\u00020\u000fH\u0007J\b\u0010\u0019\u001a\u00020\u000fH\u0007J\b\u0010\u001a\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/statistics/GroupMemberManageHitPointNew;", "", "()V", "FALSE", "", "IS_CHAT_HISTORY_INCLUDED", "IS_CREATE_CHANNEL", "IS_CREATE_GROUP", "IS_CREATE_SECRET_CHAT", "IS_TRANSFER_INCLUDED", "TRUE", "boolean2Str", "value", "", "sendAddGroupMemberActionEvent", "", "extraParam", "Lcom/ss/android/lark/statistics/extensions/IParam;", "sendAddGroupMemberPageDisplayEvent", "sendChatMemberTopLimitClick", "isPositive", "param", "sendChatMemberTopLimitView", "sendDelGroupMemberActionEvent", "sendDelGroupMemberPageDisplayEvent", "sendGroupCreateView", "sendTransferGroupOwnerEvent", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.statistics.b */
public final class GroupMemberManageHitPointNew {

    /* renamed from: a */
    public static final GroupMemberManageHitPointNew f114607a = new GroupMemberManageHitPointNew();

    /* renamed from: b */
    private final String m179747b(boolean z) {
        return z ? "true" : "false";
    }

    private GroupMemberManageHitPointNew() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m179743a() {
        JSONObject a;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null && (a = C54952a.m213207a(b)) != null) {
            Statistics.sendEvent("im_group_member_add_view", a);
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m179748b() {
        JSONObject a;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null && (a = C54952a.m213207a(b)) != null) {
            Statistics.sendEvent("im_group_member_del_view", a);
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m179750c() {
        Statistics.sendEvent("im_group_manage_click", C54952a.m213205a(ChatParamUtils.m133148b(), GroupMemberManageExtraParams.Click.TRANSFER_GROUP_OWNER.plus(GroupMemberManageExtraParams.Target.NONE)).toJson());
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m179751d() {
        GroupMemberManageHitPointNew bVar = f114607a;
        Statistics.sendEvent("im_group_create_view", C54952a.m213205a(MapsKt.mapOf(TuplesKt.to("is_create_group", bVar.m179747b(true)), TuplesKt.to("is_create_secret_chat", bVar.m179747b(false)), TuplesKt.to("is_create_channel", bVar.m179747b(true)), TuplesKt.to("is_chat_history_included", bVar.m179747b(true)), TuplesKt.to("is_transfer_included", bVar.m179747b(false))), GroupMemberManageExtraParams.Source.FROM_INNER_GROUP).toJson());
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m179744a(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_group_member_add_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m179749b(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_group_member_del_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m179745a(boolean z) {
        GroupMemberManageExtraParams.TextType textType;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (z) {
            textType = GroupMemberManageExtraParams.TextType.MEMBER_JOIN;
        } else {
            textType = GroupMemberManageExtraParams.TextType.ADD_MEMBER;
        }
        Statistics.sendEvent("im_chat_member_toplimit_view", C54952a.m213205a(b, textType).toJson());
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m179746a(boolean z, IParam cVar) {
        GroupMemberManageExtraParams.TextType textType;
        Intrinsics.checkParameterIsNotNull(cVar, "param");
        if (z) {
            textType = GroupMemberManageExtraParams.TextType.MEMBER_JOIN;
        } else {
            textType = GroupMemberManageExtraParams.TextType.ADD_MEMBER;
        }
        Statistics.sendEvent("im_chat_member_toplimit_click", cVar.plus(textType).toJson());
    }
}
