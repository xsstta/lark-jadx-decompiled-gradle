package com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard;

import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardPluginFactory;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.plugin.AtPlugin;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.plugin.FacePlugin;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.plugin.FilePlusItemPlugin;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.plugin.MorePlugin;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.plugin.PhotoPlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.plugin.AaStylePlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.plugin.ChatTextInputSupportPlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.plugin.PostInputSupportPlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.plugin.RichTextInputExpandPlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.plugin.RichTextInputShrinkPlugin;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/ChatKeyboardPluginFactory;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardPluginFactory;", "pluginContext", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "callbacks", "", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "(Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;Ljava/util/List;)V", "morePlugin", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "getMorePlugin", "()Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "setMorePlugin", "(Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;)V", "collectInnerPlugins", "", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.a */
public final class ChatKeyboardPluginFactory extends KeyboardPluginFactory {

    /* renamed from: b */
    public static final Companion f86406b = new Companion(null);

    /* renamed from: c */
    private IKeyboardCreator.IPlugin<IKeyBoardPlugin> f86407c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/ChatKeyboardPluginFactory$Companion;", "", "()V", "DARK_STYLE", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.a$a */
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
        return this.f86407c;
    }

    /* renamed from: a */
    public void mo123233a(IKeyboardCreator.IPlugin<IKeyBoardPlugin> bVar) {
        this.f86407c = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatKeyboardPluginFactory(IKeyboardCreator.PluginContext cVar, List<? extends IKeyboardComponent.IKeyboardComponentCallbacks> list) {
        super(cVar, list);
        Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
        Intrinsics.checkParameterIsNotNull(list, "callbacks");
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardPluginFactory
    /* renamed from: a */
    public void mo122100a(IKeyboardCreator.PluginContext cVar, List<? extends IKeyboardComponent.IKeyboardComponentCallbacks> list) {
        Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
        Intrinsics.checkParameterIsNotNull(list, "callbacks");
        mo123233a(new MorePlugin(false, cVar));
        ArrayList<IKeyboardCreator.IPlugin<IKeyBoardPlugin>> arrayList = new ArrayList();
        arrayList.add(new AaStylePlugin());
        arrayList.add(new AtPlugin(false, cVar));
        arrayList.add(new FacePlugin(true, false, cVar));
        arrayList.add(new PhotoPlugin(false, cVar));
        IKeyboardCreator.IPlugin<IKeyBoardPlugin> b = mo122101b();
        if (b == null) {
            Intrinsics.throwNpe();
        }
        arrayList.add(b);
        for (IKeyboardCreator.IPlugin<IKeyBoardPlugin> bVar : arrayList) {
            mo122073a(bVar.mo122012a(), bVar);
        }
        ArrayList<IKeyboardCreator.IPlugin<IInputSupportPlugin>> arrayList2 = new ArrayList();
        arrayList2.add(new RichTextInputShrinkPlugin(cVar, list));
        arrayList2.add(new RichTextInputExpandPlugin(cVar));
        arrayList2.add(new ChatTextInputSupportPlugin(cVar, list));
        arrayList2.add(new PostInputSupportPlugin(cVar));
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
