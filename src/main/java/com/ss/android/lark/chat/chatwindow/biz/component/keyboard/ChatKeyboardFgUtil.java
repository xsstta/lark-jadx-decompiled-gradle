package com.ss.android.lark.chat.chatwindow.biz.component.keyboard;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.dependency.AbstractC36474h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/ChatKeyboardFgUtil;", "", "()V", "isChatKeyboardRefactorEnable", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.a */
public final class ChatKeyboardFgUtil {

    /* renamed from: a */
    public static final ChatKeyboardFgUtil f85002a = new ChatKeyboardFgUtil();

    private ChatKeyboardFgUtil() {
    }

    /* renamed from: a */
    public final boolean mo122016a() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        return b.mo134586n().mo134685a("lark.android.secret_chat.v2");
    }
}
