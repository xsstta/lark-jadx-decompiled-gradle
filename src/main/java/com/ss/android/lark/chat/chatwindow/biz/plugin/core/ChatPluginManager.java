package com.ss.android.lark.chat.chatwindow.biz.plugin.core;

import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.plugin.ChatPluginFactory;
import com.ss.android.lark.chat.chatwindow.secretchat.plugin.SecretChatPluginFactory;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\nJ%\u0010\u0012\u001a\u0004\u0018\u0001H\u0013\"\b\b\u0000\u0010\u0013*\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0015¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/ChatPluginManager;", "", "()V", "isInit", "", "plugins", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/IChatPlugin;", "Lkotlin/collections/ArrayList;", "create", "", "chatWindowApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "activity", "Landroidx/fragment/app/FragmentActivity;", "destroy", "getPlugin", "T", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/IChatPlugin;", "onNewIntent", "bundle", "Lcom/ss/android/lark/biz/im/api/ChatBundle;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.a.b */
public final class ChatPluginManager {

    /* renamed from: a */
    private boolean f85115a;

    /* renamed from: b */
    private ArrayList<IChatPlugin> f85116b = new ArrayList<>(10);

    /* renamed from: a */
    public final void mo122132a() {
        if (this.f85115a) {
            Iterator<IChatPlugin> it = this.f85116b.iterator();
            while (it.hasNext()) {
                it.next().as_();
            }
        }
    }

    /* renamed from: a */
    public final <T extends IChatPlugin> T mo122131a(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Iterator<IChatPlugin> it = this.f85116b.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (Intrinsics.areEqual(t.getClass(), cls)) {
                if (t != null) {
                    return t;
                }
                throw new TypeCastException("null cannot be cast to non-null type T");
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo122133a(ChatBundle chatBundle) {
        Intrinsics.checkParameterIsNotNull(chatBundle, "bundle");
        if (this.f85115a) {
            Iterator<IChatPlugin> it = this.f85116b.iterator();
            while (it.hasNext()) {
                it.next().mo122127a(chatBundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo122134a(IChatWindowApp dVar, C35219b bVar, FragmentActivity fragmentActivity) {
        PluginFactory dVar2;
        Intrinsics.checkParameterIsNotNull(dVar, "chatWindowApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        if (bVar.f90956f.isSecret()) {
            dVar2 = new SecretChatPluginFactory();
        } else {
            Chat chat = bVar.f90956f;
            Intrinsics.checkExpressionValueIsNotNull(chat, "initData.chat");
            dVar2 = new ChatPluginFactory(chat);
        }
        this.f85116b.addAll(dVar2.mo122135a(fragmentActivity));
        Iterator<IChatPlugin> it = this.f85116b.iterator();
        while (it.hasNext()) {
            it.next().mo122114a(dVar, bVar);
        }
        this.f85115a = true;
    }
}
