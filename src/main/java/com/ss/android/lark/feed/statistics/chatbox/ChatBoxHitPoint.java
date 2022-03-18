package com.ss.android.lark.feed.statistics.chatbox;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/feed/statistics/chatbox/ChatBoxHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "Params", "Value", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.f.b.a */
public final class ChatBoxHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f97733a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/feed/statistics/chatbox/ChatBoxHitPoint$Companion;", "", "()V", "sendChatBoxCount", "", "count", "", "sendChatViewChatBox", ShareHitPoint.f121869d, "", "accessFrom", "sendClickChatBoxEvent", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.f.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo139409a() {
            Statistics.sendEvent("click_chatbox");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo139410a(int i) {
            Statistics.sendEvent("chatbox_chatcount", new JSONObject().put("chat_count", i));
        }

        /* renamed from: a */
        public final void mo139411a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
            Intrinsics.checkParameterIsNotNull(str2, "accessFrom");
            Statistics.sendEvent("chatview_chatbox", new JSONObject().put("chat_type", str).put("access_from", str2));
        }
    }
}
