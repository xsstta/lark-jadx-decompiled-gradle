package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatTimeTipsPushHandler;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.dependency.AbstractC36474h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TimeZonePlugin$onCreate$1", "Landroidx/lifecycle/LifecycleObserver;", "onCreate", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class TimeZonePlugin$onCreate$1 implements LifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ TimeZonePlugin f86907a;

    /* renamed from: b */
    final /* synthetic */ C35219b f86908b;

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        ViewGroup b = TimeZonePlugin.m131085a(this.f86907a).mo123274b();
        this.f86907a.f87202d = b.findViewById(R.id.ll_timezone_container);
        this.f86907a.f87201c = (TextView) b.findViewById(R.id.tv_timezone_tip);
        View view = this.f86907a.f87202d;
        if (view != null) {
            view.setVisibility(8);
        }
        this.f86907a.f87203e = this.f86908b.f90955e;
        C32821b.m126120a().mo121143n(this.f86907a.f87203e);
        TimeZonePlugin tVar = this.f86907a;
        tVar.f87204f = new ChatTimeTipsPushHandler(tVar);
        ChatTimeTipsPushHandler lVar = this.f86907a.f87204f;
        if (lVar != null) {
            lVar.mo123055a();
        }
        AbstractC36474h b2 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
        b2.mo134524W().mo134468a(this.f86907a);
    }

    TimeZonePlugin$onCreate$1(TimeZonePlugin tVar, C35219b bVar) {
        this.f86907a = tVar;
        this.f86908b = bVar;
    }
}
