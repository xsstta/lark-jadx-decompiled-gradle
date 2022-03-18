package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import androidx.fragment.app.Fragment;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.ChatKeyboardFgUtil;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.meego.C44854a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/MeegoPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "()V", "onCreate", "", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "MeegoPlusItemPlugin", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.h */
public final class MeegoPlugin extends BaseChatPlugin {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MeegoPlugin$onCreate$1", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "onKeyboardReady", "", "keyboard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.h$b */
    public static final class C33748b implements IKeyboardComponent.IKeyboardComponentCallbacks {

        /* renamed from: a */
        final /* synthetic */ MeegoPlugin f86964a;

        /* renamed from: b */
        final /* synthetic */ IChatWindowApp f86965b;

        /* renamed from: c */
        final /* synthetic */ Chat f86966c;

        /* renamed from: d */
        final /* synthetic */ ChatChatter f86967d;

        /* renamed from: e */
        final /* synthetic */ IKeyboardComponent f86968e;

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: a */
        public void mo122065a() {
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127734a(this);
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: b */
        public void mo122067b() {
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127736b(this);
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: a */
        public void mo122066a(KeyBoard fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "keyboard");
            Object o = this.f86965b.mo123193o();
            if (o != null) {
                Chat chat = this.f86966c;
                Intrinsics.checkExpressionValueIsNotNull(chat, "chat");
                MeegoPlusItemPlugin aVar = new MeegoPlusItemPlugin(this.f86964a, new IKeyboardCreator.PluginContext((Fragment) o, fVar, chat, this.f86967d, null));
                this.f86968e.mo121977a(aVar.mo122012a(), aVar);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
        }

        C33748b(MeegoPlugin hVar, IChatWindowApp dVar, Chat chat, ChatChatter chatChatter, IKeyboardComponent cVar) {
            this.f86964a = hVar;
            this.f86965b = dVar;
            this.f86966c = chat;
            this.f86967d = chatChatter;
            this.f86968e = cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/MeegoPlugin$MeegoPlusItemPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "pluginContext", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/MeegoPlugin;Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;)V", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "item", "getItem", "()Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "setItem", "(Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;)V", "getPluginContext", "()Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "getName", "", "getPlugin", "isEnable", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.h$a */
    public final class MeegoPlusItemPlugin implements IKeyboardCreator.IPlugin<IPlusItem> {

        /* renamed from: a */
        final /* synthetic */ MeegoPlugin f86960a;

        /* renamed from: b */
        private final Chat f86961b;

        /* renamed from: c */
        private IPlusItem f86962c;

        /* renamed from: d */
        private final IKeyboardCreator.PluginContext f86963d;

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
        /* renamed from: a */
        public String mo122012a() {
            return "plus_project";
        }

        /* renamed from: b */
        public IPlusItem mo122014c() {
            if (this.f86962c == null) {
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                this.f86962c = b.ao().mo134623a(this.f86961b);
            }
            return this.f86962c;
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
        /* renamed from: d */
        public boolean mo122015d() {
            if ((this.f86961b.isP2PChat() || this.f86961b.isGroup()) && C44854a.m177782a()) {
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                AbstractC36474h.AbstractC36483i ao = b.ao();
                Intrinsics.checkExpressionValueIsNotNull(ao, "ChatModuleInstanceHolder…endency().meegoDependency");
                if (ao.mo134625a()) {
                    return true;
                }
            }
            return false;
        }

        public MeegoPlusItemPlugin(MeegoPlugin hVar, IKeyboardCreator.PluginContext cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
            this.f86960a = hVar;
            this.f86963d = cVar;
            this.f86961b = cVar.mo122078c();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        if (ChatKeyboardFgUtil.f85002a.mo122016a()) {
            Chat chat = bVar.f90956f;
            ChatChatter chatChatter = bVar.f90957g;
            IKeyboardComponent cVar = (IKeyboardComponent) dVar.mo123122a(IKeyboardComponent.class);
            cVar.mo121971a(new C33748b(this, dVar, chat, chatChatter, cVar));
        }
    }
}
