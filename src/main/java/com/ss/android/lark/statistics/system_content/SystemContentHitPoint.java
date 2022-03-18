package com.ss.android.lark.statistics.system_content;

import com.ss.android.lark.chat.export.entity.message.content.SystemMessageType;
import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/statistics/system_content/SystemContentHitPoint;", "", "()V", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.t.a */
public final class SystemContentHitPoint {

    /* renamed from: a */
    public static final Companion f135905a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/statistics/system_content/SystemContentHitPoint$Companion;", "", "()V", "actionUrlClick", "", "systemMessageType", "Lcom/ss/android/lark/chat/export/entity/message/content/SystemMessageType;", "atUserInviteClick", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.t.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo187709a() {
            Statistics.sendEvent("mobile_at_group_invite_click");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo187710a(SystemMessageType systemMessageType) {
            Intrinsics.checkParameterIsNotNull(systemMessageType, "systemMessageType");
            if (systemMessageType == SystemMessageType.USER_JOIN_CHAT_AUTO_MUTE) {
                Statistics.sendEvent("big_group_muted_open_settings");
            }
        }
    }
}
