package com.ss.android.lark.team.util;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.team.C55356a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/team/util/ChatUtil;", "", "()V", "isChatOwner", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isChatOwnerOrAdmin", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.f.b */
public final class ChatUtil {

    /* renamed from: a */
    public static final ChatUtil f136868a = new ChatUtil();

    private ChatUtil() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m215112b(Chat chat) {
        if (m215111a(chat)) {
            return true;
        }
        if (chat == null || !chat.isAdmin()) {
            return false;
        }
        return true;
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m215111a(Chat chat) {
        if (chat == null || chat.isP2PChat() || chat.getOwnerId() == null || !Intrinsics.areEqual(chat.getOwnerId(), C55356a.m214819a().mo144123b().mo144130a())) {
            return false;
        }
        return true;
    }
}
