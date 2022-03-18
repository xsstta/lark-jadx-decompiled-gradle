package com.ss.android.lark.chat.chatwindow.biz.component.keyboard.plugin;

import android.content.Context;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.keyboard.plugin.tool.more.DocPlusItemWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/plugin/SendDocPlusItemPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "pluginContext", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "(Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;)V", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "item", "getItem", "()Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "setItem", "(Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;)V", "getPluginContext", "()Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "getName", "", "getPlugin", "isEnable", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.a.h */
public final class SendDocPlusItemPlugin implements IKeyboardCreator.IPlugin<IPlusItem> {

    /* renamed from: a */
    private final Chat f85033a;

    /* renamed from: b */
    private IPlusItem f85034b;

    /* renamed from: c */
    private final IKeyboardCreator.PluginContext f85035c;

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: a */
    public String mo122012a() {
        return "plus_doc";
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: d */
    public boolean mo122015d() {
        return !this.f85033a.isCrossTenant();
    }

    /* renamed from: b */
    public IPlusItem mo122014c() {
        DocPlusItemWrapper aVar;
        if (this.f85034b == null) {
            Context requireContext = this.f85035c.mo122076a().requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "pluginContext.host.requireContext()");
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            IPlusItem a = b.mo134513L().mo134668a(requireContext, this.f85033a);
            if (a != null) {
                aVar = new DocPlusItemWrapper(this.f85033a, a);
            } else {
                aVar = null;
            }
            this.f85034b = aVar;
        }
        return this.f85034b;
    }

    public SendDocPlusItemPlugin(IKeyboardCreator.PluginContext cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
        this.f85035c = cVar;
        this.f85033a = cVar.mo122078c();
    }
}
