package com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.plugin;

import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.plugin.TextInputSupportPlugin;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/plugin/ChatTextInputSupportPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/plugin/TextInputSupportPlugin;", "pluginContext", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "callbacks", "", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "(Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;Ljava/util/List;)V", "isEnable", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.a.d */
public final class ChatTextInputSupportPlugin extends TextInputSupportPlugin {
    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.plugin.TextInputSupportPlugin, com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: d */
    public boolean mo122015d() {
        return !ChatKBPluginUtil.f86409a.mo123237a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatTextInputSupportPlugin(IKeyboardCreator.PluginContext cVar, List<? extends IKeyboardComponent.IKeyboardComponentCallbacks> list) {
        super(cVar, list);
        Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
        Intrinsics.checkParameterIsNotNull(list, "callbacks");
    }
}
