package com.ss.android.lark.chat.chatwindow.biz.component.keyboard.plugin;

import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chatbase.keyboard.AtKBPluginDependency;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.at.AtKBPlugin;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/plugin/AtPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "darkStyle", "", "pluginContext", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "(ZLcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;)V", "getDarkStyle", "()Z", "item", "getPluginContext", "()Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "getName", "", "getPlugin", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.a.a */
public final class AtPlugin implements IKeyboardCreator.IPlugin<IKeyBoardPlugin> {

    /* renamed from: a */
    private IKeyBoardPlugin f85003a;

    /* renamed from: b */
    private final boolean f85004b;

    /* renamed from: c */
    private final IKeyboardCreator.PluginContext f85005c;

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: a */
    public String mo122012a() {
        return "at";
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: d */
    public boolean mo122015d() {
        return IKeyboardCreator.IPlugin.C33037a.m127748a(this);
    }

    /* renamed from: b */
    public IKeyBoardPlugin mo122014c() {
        if (this.f85003a == null) {
            String id = this.f85005c.mo122078c().getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "pluginContext.chat.getId()");
            boolean z = this.f85004b;
            FragmentActivity requireActivity = this.f85005c.mo122076a().requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "pluginContext.host.requireActivity()");
            String id2 = this.f85005c.mo122078c().getId();
            Intrinsics.checkExpressionValueIsNotNull(id2, "pluginContext.chat.getId()");
            this.f85003a = new AtKBPlugin(id, z, true, new AtKBPluginDependency(requireActivity, id2, this.f85005c.mo122078c().isP2PChat()));
        }
        return this.f85003a;
    }

    public AtPlugin(boolean z, IKeyboardCreator.PluginContext cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
        this.f85004b = z;
        this.f85005c = cVar;
    }
}
