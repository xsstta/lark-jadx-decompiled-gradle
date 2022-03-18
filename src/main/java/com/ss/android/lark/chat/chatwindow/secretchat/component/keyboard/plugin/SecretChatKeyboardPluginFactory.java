package com.ss.android.lark.chat.chatwindow.secretchat.component.keyboard.plugin;

import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardPluginFactory;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.plugin.AtPlugin;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.plugin.FacePlugin;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.plugin.FilePlusItemPlugin;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.plugin.MorePlugin;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.plugin.PhotoPlugin;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.plugin.TextInputSupportPlugin;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/secretchat/component/keyboard/plugin/SecretChatKeyboardPluginFactory;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardPluginFactory;", "pluginContext", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "callbacks", "", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "(Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;Ljava/util/List;)V", "morePlugin", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "getMorePlugin", "()Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "setMorePlugin", "(Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;)V", "collectInnerPlugins", "", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.component.keyboard.plugin.a */
public final class SecretChatKeyboardPluginFactory extends KeyboardPluginFactory {

    /* renamed from: b */
    public static final Companion f87400b = new Companion(null);

    /* renamed from: c */
    private IKeyboardCreator.IPlugin<IKeyBoardPlugin> f87401c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/secretchat/component/keyboard/plugin/SecretChatKeyboardPluginFactory$Companion;", "", "()V", "DARK_STYLE", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.component.keyboard.plugin.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardPluginFactory
    /* renamed from: b */
    public IKeyboardCreator.IPlugin<IKeyBoardPlugin> mo122101b() {
        return this.f87401c;
    }

    /* renamed from: a */
    public void mo123959a(IKeyboardCreator.IPlugin<IKeyBoardPlugin> bVar) {
        this.f87401c = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SecretChatKeyboardPluginFactory(IKeyboardCreator.PluginContext cVar, List<? extends IKeyboardComponent.IKeyboardComponentCallbacks> list) {
        super(cVar, list);
        Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
        Intrinsics.checkParameterIsNotNull(list, "callbacks");
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardPluginFactory
    /* renamed from: a */
    public void mo122100a(IKeyboardCreator.PluginContext cVar, List<? extends IKeyboardComponent.IKeyboardComponentCallbacks> list) {
        Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
        Intrinsics.checkParameterIsNotNull(list, "callbacks");
        mo123959a(new MorePlugin(true, cVar));
        ArrayList<IKeyboardCreator.IPlugin<IKeyBoardPlugin>> arrayList = new ArrayList();
        arrayList.add(new FacePlugin(false, true, cVar));
        IKeyboardCreator.IPlugin<IKeyBoardPlugin> b = mo122101b();
        if (b == null) {
            Intrinsics.throwNpe();
        }
        arrayList.add(b);
        arrayList.add(new AtPlugin(true, cVar));
        arrayList.add(new PhotoPlugin(true, cVar));
        for (IKeyboardCreator.IPlugin<IKeyBoardPlugin> bVar : arrayList) {
            mo122073a(bVar.mo122012a(), bVar);
        }
        ArrayList<IKeyboardCreator.IPlugin<IInputSupportPlugin>> arrayList2 = new ArrayList();
        arrayList2.add(new TextInputSupportPlugin(cVar, list));
        for (IKeyboardCreator.IPlugin<IInputSupportPlugin> bVar2 : arrayList2) {
            mo122102c(bVar2.mo122012a(), bVar2);
        }
        ArrayList<IKeyboardCreator.IPlugin<IPlusItem>> arrayList3 = new ArrayList();
        arrayList3.add(new FilePlusItemPlugin(cVar));
        for (IKeyboardCreator.IPlugin<IPlusItem> bVar3 : arrayList3) {
            mo122075b(bVar3.mo122012a(), bVar3);
        }
    }
}
