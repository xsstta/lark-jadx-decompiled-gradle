package com.ss.android.lark.create.groupchat.impl.statistics;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/statistics/GroupHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.statistics.b */
public final class GroupHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f93889a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\fJ\u0006\u0010\u0011\u001a\u00020\fJ\u0006\u0010\u0012\u001a\u00020\fJ\u0006\u0010\u0013\u001a\u00020\fJ\u0006\u0010\u0014\u001a\u00020\fJ\u0006\u0010\u0015\u001a\u00020\fJ\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0004J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u001a\u001a\u00020\f¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/statistics/GroupHitPoint$Companion;", "", "()V", "getGroupCreateMode", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getGroupCreateName", "getGroupCreateType", "getGroupType", "", "sendCreateGroupCancel", "", "sendGroupCreate", "sendGroupSelectIM", "sendGroupSelectPrivate", "sendGroupSelectPublic", "sendGroupSelectSecret", "sendGroupSelectThread", "sendGroupTypeSelect", "sendGroupTypeSelectCancel", "sendGroupTypeSelectConfirm", "sendPickerView", "scenario", "sendPutChatSuccess", ShareHitPoint.f121868c, "sendSelectGroupBtn", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.statistics.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo134207a() {
            Statistics.sendEvent("group_create_cancel");
        }

        /* renamed from: b */
        public final void mo134211b() {
            Statistics.sendEvent("group_create_select_group_view");
        }

        /* renamed from: c */
        public final void mo134212c() {
            Statistics.sendEvent("group_grouptype");
        }

        /* renamed from: d */
        public final void mo134213d() {
            Statistics.sendEvent("group_grouptype_confirm");
        }

        /* renamed from: e */
        public final void mo134214e() {
            Statistics.sendEvent("group_grouptype_cancel");
        }

        /* renamed from: f */
        public final void mo134215f() {
            Statistics.sendEvent("group_grouptype_mode_classic");
        }

        /* renamed from: g */
        public final void mo134216g() {
            Statistics.sendEvent("group_grouptype_mode_topic");
        }

        /* renamed from: h */
        public final void mo134217h() {
            Statistics.sendEvent("group_grouptype_mode_secret");
        }

        /* renamed from: i */
        public final void mo134218i() {
            Statistics.sendEvent("group_grouptype_type_private");
        }

        /* renamed from: j */
        public final void mo134219j() {
            Statistics.sendEvent("group_grouptype_type_public");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        private final String m143472d(Chat chat) {
            if (chat.isPublic()) {
                return "custom";
            }
            return "default";
        }

        /* renamed from: b */
        private final String m143470b(Chat chat) {
            if (chat.isPublic()) {
                return "public";
            }
            if (chat.isCrossTenant()) {
                return "external";
            }
            return "private";
        }

        /* renamed from: c */
        private final String m143471c(Chat chat) {
            if (chat.isThread()) {
                return ChatTypeStateKeeper.f135670e;
            }
            if (chat.isSecret()) {
                return "secret";
            }
            return "classic";
        }

        /* renamed from: a */
        public final void mo134210a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "scenario");
            Statistics.sendEvent("larkw_picker_view", new JSONObject().put("scenario", str));
        }

        /* renamed from: a */
        public final void mo134208a(Chat chat) {
            if (chat != null) {
                Statistics.sendEvent("group_create", new JSONObject().put("members_number", chat.getMemberCount()).put("chat_id", chat.getId()).put(ShareHitPoint.f121869d, GroupHitPoint.f93889a.m143470b(chat)).put("mode", GroupHitPoint.f93889a.m143471c(chat)).put("group_name", GroupHitPoint.f93889a.m143472d(chat)));
            }
        }

        /* renamed from: e */
        private final List<String> m143473e(Chat chat) {
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
        public final void mo134209a(Chat chat, String str) {
            String str2;
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            List<String> e = m143473e(chat);
            if (chat.isPublic()) {
                str2 = "public";
            } else {
                str2 = "private";
            }
            boolean isCrossTenant = chat.isCrossTenant();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121868c, str);
            jSONObject.put(ShareHitPoint.f121869d, e);
            jSONObject.put("mode", str2);
            jSONObject.put("is_external", isCrossTenant ? 1 : 0);
            Statistics.sendEvent("im_chat_create_success", jSONObject);
        }
    }
}
