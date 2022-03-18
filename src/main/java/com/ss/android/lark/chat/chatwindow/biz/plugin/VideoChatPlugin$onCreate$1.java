package com.ss.android.lark.chat.chatwindow.biz.plugin;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/VideoChatPlugin$onCreate$1", "Landroidx/lifecycle/LifecycleObserver;", "onCreate", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class VideoChatPlugin$onCreate$1 implements LifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ VideoChatPlugin f85083a;

    /* renamed from: b */
    final /* synthetic */ C35219b f85084b;

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        VideoChatPlugin hVar = this.f85083a;
        ITitlebarComponent b = hVar.mo122205b();
        Chat chat = this.f85084b.f90956f;
        Intrinsics.checkExpressionValueIsNotNull(chat, "initData.chat");
        hVar.mo122203a(b, chat, this.f85084b.f90957g);
    }

    VideoChatPlugin$onCreate$1(VideoChatPlugin hVar, C35219b bVar) {
        this.f85083a = hVar;
        this.f85084b = bVar;
    }
}
