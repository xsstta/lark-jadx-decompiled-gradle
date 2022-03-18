package com.ss.android.lark.chat.chatwindow.biz.component.keyboard;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.IKeyboardViewModel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&J!\u0010\b\u001a\u0004\u0018\u0001H\t\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\u0004\u0018\u0001H\t\"\b\b\u0000\u0010\t*\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0003H&¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator;", "", "create", "Lcom/ss/android/lark/keyboard/KeyBoard;", "container", "Landroid/view/ViewGroup;", "factory", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IKeyboardPluginFactory;", "getInputPlugin", "T", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "name", "", "(Ljava/lang/String;)Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "getKBPlugin", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "(Ljava/lang/String;)Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "start", "IKeyboardPluginFactory", "IPlugin", "PluginContext", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.d */
public interface IKeyboardCreator {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u001e\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bH&J\u001e\u0010\r\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH&J0\u0010\u0010\u001a\u00020\u00032\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u00122\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u0012H&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IKeyboardPluginFactory;", "", "attach", "", "registerInputSupport", "name", "", "inputSupport", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "registerKBPlugin", "plugin", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "registerKeyboardPlusPlugin", "plusItem", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "updateKeyboardPlusPlugin", "removed", "", "added", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.d$a */
    public interface IKeyboardPluginFactory {
        /* renamed from: a */
        void mo122072a();

        /* renamed from: a */
        void mo122073a(String str, IPlugin<IKeyBoardPlugin> bVar);

        /* renamed from: a */
        void mo122074a(List<? extends IPlugin<IPlusItem>> list, List<? extends IPlugin<IPlusItem>> list2);

        /* renamed from: b */
        void mo122075b(String str, IPlugin<IPlusItem> bVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u000f\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "T", "", "getName", "", "getPlugin", "()Ljava/lang/Object;", "isEnable", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.d$b */
    public interface IPlugin<T> {

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.d$b$a */
        public static final class C33037a {
            /* renamed from: a */
            public static <T> boolean m127748a(IPlugin<T> bVar) {
                return true;
            }
        }

        /* renamed from: a */
        String mo122012a();

        /* renamed from: c */
        T mo122014c();

        /* renamed from: d */
        boolean mo122015d();
    }

    /* renamed from: a */
    IKeyboardCreator mo122069a(IKeyboardPluginFactory aVar);

    /* renamed from: a */
    KeyBoard mo122070a();

    /* renamed from: a */
    KeyBoard mo122071a(ViewGroup viewGroup);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001$B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "", "host", "Landroidx/fragment/app/Fragment;", "keyBoard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "viewModel", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/IKeyboardViewModel;", "(Landroidx/fragment/app/Fragment;Lcom/ss/android/lark/keyboard/KeyBoard;Lcom/ss/android/lark/chat/entity/chat/Chat;Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/IKeyboardViewModel;)V", "getChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChatter", "()Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "getHost", "()Landroidx/fragment/app/Fragment;", "getKeyBoard", "()Lcom/ss/android/lark/keyboard/KeyBoard;", "getViewModel", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/IKeyboardViewModel;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Builder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.d$c */
    public static final class PluginContext {

        /* renamed from: a */
        private final Fragment f85049a;

        /* renamed from: b */
        private final KeyBoard f85050b;

        /* renamed from: c */
        private final Chat f85051c;

        /* renamed from: d */
        private final ChatChatter f85052d;

        /* renamed from: e */
        private final IKeyboardViewModel f85053e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PluginContext)) {
                return false;
            }
            PluginContext cVar = (PluginContext) obj;
            return Intrinsics.areEqual(this.f85049a, cVar.f85049a) && Intrinsics.areEqual(this.f85050b, cVar.f85050b) && Intrinsics.areEqual(this.f85051c, cVar.f85051c) && Intrinsics.areEqual(this.f85052d, cVar.f85052d) && Intrinsics.areEqual(this.f85053e, cVar.f85053e);
        }

        public int hashCode() {
            Fragment fragment = this.f85049a;
            int i = 0;
            int hashCode = (fragment != null ? fragment.hashCode() : 0) * 31;
            KeyBoard fVar = this.f85050b;
            int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
            Chat chat = this.f85051c;
            int hashCode3 = (hashCode2 + (chat != null ? chat.hashCode() : 0)) * 31;
            ChatChatter chatChatter = this.f85052d;
            int hashCode4 = (hashCode3 + (chatChatter != null ? chatChatter.hashCode() : 0)) * 31;
            IKeyboardViewModel bVar = this.f85053e;
            if (bVar != null) {
                i = bVar.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            return "PluginContext(host=" + this.f85049a + ", keyBoard=" + this.f85050b + ", chat=" + this.f85051c + ", chatter=" + this.f85052d + ", viewModel=" + this.f85053e + ")";
        }

        /* renamed from: a */
        public final Fragment mo122076a() {
            return this.f85049a;
        }

        /* renamed from: b */
        public final KeyBoard mo122077b() {
            return this.f85050b;
        }

        /* renamed from: c */
        public final Chat mo122078c() {
            return this.f85051c;
        }

        /* renamed from: d */
        public final ChatChatter mo122079d() {
            return this.f85052d;
        }

        /* renamed from: e */
        public final IKeyboardViewModel mo122080e() {
            return this.f85053e;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext$Builder;", "", "host", "Landroidx/fragment/app/Fragment;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "(Landroidx/fragment/app/Fragment;Lcom/ss/android/lark/chat/entity/chat/Chat;)V", "getChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "getHost", "()Landroidx/fragment/app/Fragment;", "keyBoard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "viewModel", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/IKeyboardViewModel;", "build", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.d$c$a */
        public static final class Builder {

            /* renamed from: a */
            private ChatChatter f85054a;

            /* renamed from: b */
            private KeyBoard f85055b;

            /* renamed from: c */
            private IKeyboardViewModel f85056c;

            /* renamed from: d */
            private final Fragment f85057d;

            /* renamed from: e */
            private final Chat f85058e;

            /* renamed from: a */
            public final PluginContext mo122087a() {
                return new PluginContext(this.f85057d, this.f85055b, this.f85058e, this.f85054a, this.f85056c);
            }

            /* renamed from: a */
            public final Builder mo122084a(IKeyboardViewModel bVar) {
                Builder aVar = this;
                aVar.f85056c = bVar;
                return aVar;
            }

            /* renamed from: a */
            public final Builder mo122085a(ChatChatter chatChatter) {
                Builder aVar = this;
                aVar.f85054a = chatChatter;
                return aVar;
            }

            /* renamed from: a */
            public final Builder mo122086a(KeyBoard fVar) {
                Builder aVar = this;
                aVar.f85055b = fVar;
                return aVar;
            }

            public Builder(Fragment fragment, Chat chat) {
                Intrinsics.checkParameterIsNotNull(fragment, "host");
                Intrinsics.checkParameterIsNotNull(chat, "chat");
                this.f85057d = fragment;
                this.f85058e = chat;
            }
        }

        public PluginContext(Fragment fragment, KeyBoard fVar, Chat chat, ChatChatter chatChatter, IKeyboardViewModel bVar) {
            Intrinsics.checkParameterIsNotNull(fragment, "host");
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            this.f85049a = fragment;
            this.f85050b = fVar;
            this.f85051c = chat;
            this.f85052d = chatChatter;
            this.f85053e = bVar;
        }
    }
}
