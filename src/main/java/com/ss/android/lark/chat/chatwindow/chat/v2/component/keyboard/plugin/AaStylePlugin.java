package com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.plugin;

import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.aa.AaStyleKBPlugin;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\b\u001a\u00020\tH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/plugin/AaStylePlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "()V", "item", "getName", "", "getPlugin", "isEnable", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.a.a */
public final class AaStylePlugin implements IKeyboardCreator.IPlugin<IKeyBoardPlugin> {

    /* renamed from: a */
    private IKeyBoardPlugin f86408a;

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: a */
    public String mo122012a() {
        return "aa_editor";
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: d */
    public boolean mo122015d() {
        return ChatKBPluginUtil.f86409a.mo123237a();
    }

    /* renamed from: b */
    public IKeyBoardPlugin mo122014c() {
        if (this.f86408a == null) {
            this.f86408a = new AaStyleKBPlugin();
        }
        return this.f86408a;
    }
}
