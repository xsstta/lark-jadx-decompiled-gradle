package com.ss.android.lark.chat.chatwindow.chat.v2.component;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.am;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0007J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/ChatErrorInterceptor;", "", "()V", "delayExitChatCodeSet", "", "", "removeFeedCardSet", "interceptDelayExitChat", "", "errCode", "interceptHideFeedCard", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.a */
public final class ChatErrorInterceptor {

    /* renamed from: a */
    public static final ChatErrorInterceptor f86334a = new ChatErrorInterceptor();

    /* renamed from: b */
    private static final Set<Integer> f86335b = am.m265689a((Object[]) new Integer[]{4051, 4});

    /* renamed from: c */
    private static final Set<Integer> f86336c = am.m265686a((Object) 4);

    private ChatErrorInterceptor() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m129809a(int i) {
        return f86335b.contains(Integer.valueOf(i));
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m129810b(int i) {
        return f86336c.contains(Integer.valueOf(i));
    }
}
