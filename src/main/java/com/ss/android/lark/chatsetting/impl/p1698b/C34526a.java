package com.ss.android.lark.chatsetting.impl.p1698b;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.TeamChatType;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"isPublicTeamChat", "", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "(Lcom/ss/android/lark/chat/entity/chat/Chat;)Z", "isSelfOwner", "im_chatsetting_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.b.a */
public final class C34526a {
    /* renamed from: b */
    public static final boolean m134091b(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "$this$isPublicTeamChat");
        if (!chat.isTeam() || chat.getTeamChatType() == TeamChatType.TEAM_CHAT_TYPE_PRIVATE) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m134090a(Chat chat) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(chat, "$this$isSelfOwner");
        String groupOwnerId = chat.getGroupOwnerId();
        if (groupOwnerId == null || groupOwnerId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String groupOwnerId2 = chat.getGroupOwnerId();
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            AbstractC34461c.AbstractC34476o g = a.mo127277g();
            Intrinsics.checkExpressionValueIsNotNull(g, "ChatSettingModule.getDependency().loginDependency");
            if (StringsKt.equals$default(groupOwnerId2, g.mo127412a(), false, 2, null)) {
                return true;
            }
        }
        return false;
    }
}
