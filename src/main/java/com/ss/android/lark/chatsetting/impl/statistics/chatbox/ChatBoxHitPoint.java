package com.ss.android.lark.chatsetting.impl.statistics.chatbox;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/chatbox/ChatBoxHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.statistics.d.a */
public final class ChatBoxHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f90518a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nJ \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/chatbox/ChatBoxHitPoint$Companion;", "", "()V", "sendMoveToChatBoxEvent", "", ShareHitPoint.f121869d, "", "from", "chatId", "isMute", "", "sendRemoveFromChatBoxEvent", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.statistics.d.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo129201a(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
            Intrinsics.checkParameterIsNotNull(str2, "from");
            Statistics.sendEvent("remove_from_chatbox", new JSONObject().put("chat_type", str).put("set_from", str2).put("chat_id", str3));
        }

        /* renamed from: a */
        public final void mo129202a(String str, String str2, String str3, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
            Intrinsics.checkParameterIsNotNull(str2, "from");
            Statistics.sendEvent("move_to_chatbox", new JSONObject().put("chat_type", str).put("set_from", str2).put("chat_id", str3).put("is_mute", z));
        }
    }
}
