package com.ss.android.lark.chat.chatwindow.biz.plugin.core;

import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/IChatPlugin;", "", "onCreate", "", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "onDestroy", "onNewIntent", "bundle", "Lcom/ss/android/lark/biz/im/api/ChatBundle;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.a.c */
public interface IChatPlugin {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.a.c$a */
    public static final class C33052a {
        /* renamed from: a */
        public static void m127830a(IChatPlugin cVar, ChatBundle chatBundle) {
            Intrinsics.checkParameterIsNotNull(chatBundle, "bundle");
        }
    }

    /* renamed from: a */
    void mo122127a(ChatBundle chatBundle);

    /* renamed from: a */
    void mo122114a(IChatWindowApp dVar, C35219b bVar);

    void as_();
}
