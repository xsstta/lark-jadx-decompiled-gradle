package com.ss.android.lark.doc.statistics.chat;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/doc/statistics/chat/ChatHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "lark-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.doc.a.b.a */
public final class ChatHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f94671a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/doc/statistics/chat/ChatHitPoint$Companion;", "", "()V", "sendChatMute", "", "chatType", "", "chatId", "sendChatUnmute", "lark-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.doc.a.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo135787a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "chatType");
            Statistics.sendEvent("chat_mute", new JSONObject().put("chat_type", str).put("set_from", "chat_setting").put("chat_id", str2));
        }

        /* renamed from: b */
        public final void mo135788b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "chatType");
            Statistics.sendEvent("chat_unmute", new JSONObject().put("chat_type", str).put("set_from", "chat_setting").put("chat_id", str2));
        }
    }
}
