package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtendComponent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0007J\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/SmartReplyPlugin$onCreate$3", "Landroidx/lifecycle/LifecycleObserver;", "onCreate", "", "onResume", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class SmartReplyPlugin$onCreate$3 implements LifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ SmartReplyPlugin f86897a;

    /* renamed from: b */
    final /* synthetic */ IKeyboardTopExtendComponent f86898b;

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        this.f86897a.mo123844a(System.currentTimeMillis());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        ViewGroup c = this.f86898b.mo121985c();
        this.f86897a.f87139a = (FrameLayout) c.findViewById(R.id.fl_chat_smart_reply_container);
        this.f86897a.mo123847g();
    }

    SmartReplyPlugin$onCreate$3(SmartReplyPlugin oVar, IKeyboardTopExtendComponent eVar) {
        this.f86897a = oVar;
        this.f86898b = eVar;
    }
}
