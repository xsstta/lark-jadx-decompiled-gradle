package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0007J\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TabPlugin$onCreate$1", "Landroidx/lifecycle/LifecycleObserver;", "onCreate", "", "onDestroy", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class TabPlugin$onCreate$1 implements LifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ TabPlugin f86899a;

    /* renamed from: b */
    final /* synthetic */ IKeyboardComponent f86900b;

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        this.f86900b.mo121976a(this.f86899a.mo123866e());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.f86900b.mo121984b(this.f86899a.mo123866e());
    }

    TabPlugin$onCreate$1(TabPlugin rVar, IKeyboardComponent cVar) {
        this.f86899a = rVar;
        this.f86900b = cVar;
    }
}
