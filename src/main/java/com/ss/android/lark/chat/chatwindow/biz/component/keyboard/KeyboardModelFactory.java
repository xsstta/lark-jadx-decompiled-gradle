package com.ss.android.lark.chat.chatwindow.biz.component.keyboard;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import com.ss.android.lark.chat.entity.chat.Chat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J'\u0010\u000b\u001a\u0002H\f\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016¢\u0006\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "initChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "dependency", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardComponentDependency;", "(Lcom/ss/android/lark/chat/entity/chat/Chat;Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardComponentDependency;)V", "getDependency", "()Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardComponentDependency;", "getInitChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.i */
public final class KeyboardModelFactory implements C1144ai.AbstractC1146b {

    /* renamed from: a */
    private final Chat f85066a;

    /* renamed from: b */
    private final KeyboardComponentDependency f85067b;

    @Override // androidx.lifecycle.C1144ai.AbstractC1146b
    public <T extends AbstractC1142af> T create(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "modelClass");
        return cls.getConstructor(Chat.class, KeyboardComponentDependency.class).newInstance(this.f85066a, this.f85067b);
    }

    public KeyboardModelFactory(Chat chat, KeyboardComponentDependency fVar) {
        Intrinsics.checkParameterIsNotNull(chat, "initChat");
        Intrinsics.checkParameterIsNotNull(fVar, "dependency");
        this.f85066a = chat;
        this.f85067b = fVar;
    }
}
