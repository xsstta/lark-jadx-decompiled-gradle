package com.ss.android.lark.forward.impl.statistics.chat;

import android.text.TextUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/forward/impl/statistics/chat/ChatHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.forward.impl.statistics.a.a */
public final class ChatHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f98831a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ&\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/forward/impl/statistics/chat/ChatHitPoint$Companion;", "", "()V", "CHAT_ID", "", "KEY_B_NAME", "KEY_INVITE_SOURCE", "KEY_SHARE_GROUP_DESCRIBE", "KEY_TYPE", "sendShareEduGroup", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "sendShareGroup", "hasDescription", "", "sendShareGroupCard", "isGroupOwner", "inputMsg", "selectChatCount", "", "sendShareGroupConfirm", "isPublic", "isExternal", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.forward.impl.statistics.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo141010a(Chat chat) {
            if (chat != null && chat.isEdu()) {
                Statistics.sendEvent("im_chat_home_school_group_share_type", new JSONObject().put("b_name", 1).put("invite_source", 1));
            }
        }

        /* renamed from: a */
        public final void mo141012a(boolean z) {
            Statistics.sendEvent("share_group", new JSONObject().put("describe", String.valueOf(z)));
        }

        /* renamed from: a */
        public final void mo141013a(boolean z, boolean z2) {
            String str;
            if (z2) {
                str = "external";
            } else if (z) {
                str = "public";
            } else {
                str = "private";
            }
            Statistics.sendEvent("chat_config_share_confirmed", new JSONObject().put(ShareHitPoint.f121869d, str));
        }

        /* renamed from: a */
        public final void mo141011a(Chat chat, boolean z, String str, int i) {
            String str2;
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(str, "inputMsg");
            if (z) {
                str2 = "admin";
            } else {
                str2 = "member";
            }
            Statistics.sendEvent("im_chat_setting_chat_forward_click", new JSONObject().put("member_type", str2).put("input_msg", !TextUtils.isEmpty(str) ? 1 : 0).put("msg_char_count", str.length()).put("chat_count", i).put("chat_id", chat.getId()));
        }
    }
}
