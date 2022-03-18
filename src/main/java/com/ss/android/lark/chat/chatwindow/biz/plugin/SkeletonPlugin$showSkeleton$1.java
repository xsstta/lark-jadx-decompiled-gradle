package com.ss.android.lark.chat.chatwindow.biz.plugin;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.p078b.p079a.C2052c;
import com.p078b.p079a.C2057g;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/SkeletonPlugin$showSkeleton$1", "Landroidx/lifecycle/LifecycleObserver;", "onCreate", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class SkeletonPlugin$showSkeleton$1 implements LifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ SkeletonPlugin f85076a;

    /* renamed from: b */
    final /* synthetic */ IKeyboardComponent f85077b;

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        if (!this.f85076a.f85198e) {
            this.f85076a.f85200g = new RunnableC33041a(this);
            UICallbackExecutor.executeDelayed(this.f85076a.f85200g, 100);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.SkeletonPlugin$showSkeleton$1$a */
    static final class RunnableC33041a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SkeletonPlugin$showSkeleton$1 f85078a;

        RunnableC33041a(SkeletonPlugin$showSkeleton$1 skeletonPlugin$showSkeleton$1) {
            this.f85078a = skeletonPlugin$showSkeleton$1;
        }

        public final void run() {
            int i;
            View i2 = this.f85078a.f85077b.mo121991i();
            if (i2 != null) {
                SkeletonPlugin gVar = this.f85078a.f85076a;
                C2057g.C2059a a = C2052c.m8961a(i2);
                if (this.f85078a.f85076a.mo122202b()) {
                    i = R.layout.item_skeleton_keyboard_dark;
                } else {
                    i = R.layout.item_skeleton_keyboard;
                }
                gVar.f85195b = a.mo10151a(i).mo10152a(true).mo10156d(20).mo10154b(R.color.a60_white).mo10155c(1000).mo10153a();
                this.f85078a.f85076a.f85197d = true;
            }
        }
    }

    SkeletonPlugin$showSkeleton$1(SkeletonPlugin gVar, IKeyboardComponent cVar) {
        this.f85076a = gVar;
        this.f85077b = cVar;
    }
}
