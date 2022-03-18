package com.ss.android.lark.chat.chatwindow.chat.v2.component.message;

import android.content.Context;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ'\u0010\u0019\u001a\u0002H\u001a\"\n\b\u0000\u0010\u001a*\u0004\u0018\u00010\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001dH\u0016¢\u0006\u0002\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "context", "Landroid/content/Context;", "initChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "selfChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "p2pChatter", "showPosition", "", "dependency", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$MessageListComponentDependency;", "(Landroid/content/Context;Lcom/ss/android/lark/chat/entity/chat/Chat;Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;ILcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$MessageListComponentDependency;)V", "getContext", "()Landroid/content/Context;", "getDependency", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$MessageListComponentDependency;", "getInitChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "getP2pChatter", "()Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "getSelfChatter", "getShowPosition", "()I", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.e */
public final class MessageListModelFactory implements C1144ai.AbstractC1146b {

    /* renamed from: a */
    private final Context f86574a;

    /* renamed from: b */
    private final Chat f86575b;

    /* renamed from: c */
    private final ChatChatter f86576c;

    /* renamed from: d */
    private final ChatChatter f86577d;

    /* renamed from: e */
    private final int f86578e;

    /* renamed from: f */
    private final IMessageListComponent.MessageListComponentDependency f86579f;

    @Override // androidx.lifecycle.C1144ai.AbstractC1146b
    public <T extends AbstractC1142af> T create(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "modelClass");
        return cls.getConstructor(Context.class, Chat.class, ChatChatter.class, ChatChatter.class, Integer.TYPE, IMessageListComponent.MessageListComponentDependency.class).newInstance(this.f86574a, this.f86575b, this.f86576c, this.f86577d, Integer.valueOf(this.f86578e), this.f86579f);
    }

    public MessageListModelFactory(Context context, Chat chat, ChatChatter chatChatter, ChatChatter chatChatter2, int i, IMessageListComponent.MessageListComponentDependency gVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(chat, "initChat");
        Intrinsics.checkParameterIsNotNull(chatChatter, "selfChatter");
        Intrinsics.checkParameterIsNotNull(gVar, "dependency");
        this.f86574a = context;
        this.f86575b = chat;
        this.f86576c = chatChatter;
        this.f86577d = chatChatter2;
        this.f86578e = i;
        this.f86579f = gVar;
    }
}
