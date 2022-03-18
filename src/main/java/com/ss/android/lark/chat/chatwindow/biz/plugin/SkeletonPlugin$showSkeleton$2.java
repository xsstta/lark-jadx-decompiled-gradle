package com.ss.android.lark.chat.chatwindow.biz.plugin;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.p078b.p079a.C2052c;
import com.p078b.p079a.C2057g;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/SkeletonPlugin$showSkeleton$2", "Landroidx/lifecycle/LifecycleObserver;", "onCreate", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class SkeletonPlugin$showSkeleton$2 implements LifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ SkeletonPlugin f85079a;

    /* renamed from: b */
    final /* synthetic */ ITitlebarComponent f85080b;

    /* renamed from: c */
    final /* synthetic */ boolean f85081c;

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        if (!this.f85079a.f85198e) {
            this.f85079a.f85199f = new RunnableC33042a(this);
            UICallbackExecutor.executeDelayed(this.f85079a.f85199f, 100);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.SkeletonPlugin$showSkeleton$2$a */
    static final class RunnableC33042a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SkeletonPlugin$showSkeleton$2 f85082a;

        RunnableC33042a(SkeletonPlugin$showSkeleton$2 skeletonPlugin$showSkeleton$2) {
            this.f85082a = skeletonPlugin$showSkeleton$2;
        }

        public final void run() {
            int i;
            int i2;
            View i3 = this.f85082a.f85080b.mo123681i();
            if (i3 != null) {
                SkeletonPlugin gVar = this.f85082a.f85079a;
                C2057g.C2059a a = C2052c.m8961a(i3);
                if (this.f85082a.f85081c) {
                    i = R.layout.item_skeleton_titlebar_dark;
                } else {
                    i = R.layout.item_skeleton_titlebar;
                }
                C2057g.C2059a d = a.mo10151a(i).mo10152a(true).mo10156d(20);
                if (this.f85082a.f85081c) {
                    i2 = R.color.lkui_N700;
                } else {
                    i2 = R.color.a60_white;
                }
                gVar.f85194a = d.mo10154b(i2).mo10155c(1000).mo10153a();
                this.f85082a.f85079a.f85196c = true;
            }
        }
    }

    SkeletonPlugin$showSkeleton$2(SkeletonPlugin gVar, ITitlebarComponent bVar, boolean z) {
        this.f85079a = gVar;
        this.f85080b = bVar;
        this.f85081c = z;
    }
}
