package com.ss.android.lark.statistics.buzz;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/statistics/buzz/BuzzHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.d.a */
public final class BuzzHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f135698a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/statistics/buzz/BuzzHitPoint$Companion;", "", "()V", "sendBuzzCreate", "", "messageId", "", "messageType", "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isBot", "", "sendBuzzSent", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.d.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo187452a(String str, Message.Type type, Chat chat, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            if (type != null) {
                Statistics.sendEvent("buzz_create", new JSONObject().put("message_id", str).put("message_type", type.getNumber()).put("chat_id", chat.getId()).put("chat_type", chat.getType()).put("is_secret_chat", chat.isSecret()).put("is_bot_chat", z).put("is_meeting_chat", chat.isMeeting()));
            }
        }
    }
}
