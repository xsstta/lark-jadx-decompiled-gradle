package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatChatterPushHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/OnCallPlugin$addLifeCycleObserver$1", "Landroidx/lifecycle/LifecycleObserver;", "onCreate", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class OnCallPlugin$addLifeCycleObserver$1 implements LifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ OnCallPlugin f86896a;

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        OnCallPlugin jVar = this.f86896a;
        String id = OnCallPlugin.m130951b(jVar).getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
        jVar.mo123815a(id);
        OnCallPlugin jVar2 = this.f86896a;
        String id2 = OnCallPlugin.m130951b(jVar2).getId();
        Intrinsics.checkExpressionValueIsNotNull(id2, "chat.getId()");
        jVar2.f87056g = new ChatChatterPushHandler(id2, this.f86896a);
        ChatChatterPushHandler cVar = this.f86896a.f87056g;
        if (cVar != null) {
            cVar.mo123055a();
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    OnCallPlugin$addLifeCycleObserver$1(OnCallPlugin jVar) {
        this.f86896a = jVar;
    }
}
