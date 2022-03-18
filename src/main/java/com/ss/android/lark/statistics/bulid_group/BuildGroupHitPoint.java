package com.ss.android.lark.statistics.bulid_group;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/statistics/bulid_group/BuildGroupHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.c.a */
public final class BuildGroupHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f135647a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ&\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/statistics/bulid_group/BuildGroupHitPoint$Companion;", "", "()V", "sendP2PBuildGroupSelectMessageConfirm", "", "messageCount", "", "chatId", "", "cancelLastMsg", "", "sendP2PCreateGroupSuccessEvent", "isPublic", "isExternal", "mode", "Lcom/ss/android/lark/chat/entity/chat/Chat$ChatMode;", "initialGroupCount", "sendPutChatSuccess", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", ShareHitPoint.f121868c, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo187342a(int i, String str, boolean z) {
            boolean z2;
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("msg_count", i);
            if (i > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            jSONObject.put("msg_sync", z2);
            jSONObject.put("add_group_name", false);
            jSONObject.put("group_name_count", 0);
            jSONObject.put("chat_id", str);
            jSONObject.put("cancel_last_message", z);
            Statistics.sendEvent("single_to_group_select_message_confirm", jSONObject);
        }

        /* renamed from: a */
        public final void mo187343a(boolean z, boolean z2, Chat.ChatMode chatMode, int i) {
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
            Statistics.sendEvent("direct_message_to_group_chat_confirmed", new JSONObject().put(ShareHitPoint.f121869d, str).put("mode", str2).put("members_number", i));
        }
    }
}
