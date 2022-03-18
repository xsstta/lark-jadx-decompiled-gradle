package com.ss.android.lark.chat.chatwindow.biz.plugin;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/DesktopPlugin$onCreate$2", "Landroidx/lifecycle/LifecycleObserver;", "onCreate", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class DesktopPlugin$onCreate$2 implements LifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ DesktopPlugin f85075a;

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        View view;
        ViewGroup.LayoutParams layoutParams;
        RelativeLayout b = DesktopPlugin.m127788c(this.f85075a).mo123319b();
        if (b != null) {
            view = b.findViewById(R.id.keyboard_shadow);
        } else {
            view = null;
        }
        if (!(view == null || (layoutParams = view.getLayoutParams()) == null)) {
            layoutParams.height = UIHelper.dp2px(1.0f);
        }
        if (view != null) {
            view.setBackgroundColor(UIHelper.getColor(R.color.lkui_N300));
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    DesktopPlugin$onCreate$2(DesktopPlugin aVar) {
        this.f85075a = aVar;
    }
}
