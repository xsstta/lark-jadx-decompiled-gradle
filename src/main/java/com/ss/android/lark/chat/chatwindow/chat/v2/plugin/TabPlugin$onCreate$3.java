package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator2;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent;
import com.ss.android.lark.chat.entity.chat.Chat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0007J\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TabPlugin$onCreate$3", "Landroidx/lifecycle/LifecycleObserver;", "onCreate", "", "onDestroy", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class TabPlugin$onCreate$3 implements LifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ TabPlugin f86904a;

    /* renamed from: b */
    final /* synthetic */ ITitlebarComponent f86905b;

    /* renamed from: c */
    final /* synthetic */ ITabComponent f86906c;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        UDTabLayoutCoordinator2 dVar = this.f86904a.f87187c;
        if (dVar != null) {
            dVar.mo91354b();
        }
        this.f86906c.mo123549b(this.f86904a.mo123865d());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        ITitlebarComponent bVar = this.f86905b;
        Chat chat = TabPlugin.m131073a(this.f86904a).f90956f;
        Intrinsics.checkExpressionValueIsNotNull(chat, "mInitData.chat");
        bVar.mo123675a(chat, new C33733a(this));
        this.f86906c.mo123545a(this.f86904a.mo123865d());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "tabLayout", "Lcom/larksuite/component/universe_design/tab/UDTabLayout;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.TabPlugin$onCreate$3$a */
    static final class C33733a extends Lambda implements Function1<UDTabLayout, Unit> {
        final /* synthetic */ TabPlugin$onCreate$3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33733a(TabPlugin$onCreate$3 tabPlugin$onCreate$3) {
            super(1);
            this.this$0 = tabPlugin$onCreate$3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UDTabLayout uDTabLayout) {
            invoke(uDTabLayout);
            return Unit.INSTANCE;
        }

        public final void invoke(UDTabLayout uDTabLayout) {
            Intrinsics.checkParameterIsNotNull(uDTabLayout, "tabLayout");
            TabPlugin rVar = this.this$0.f86904a;
            UDTabLayoutCoordinator2 a = this.this$0.f86906c.mo123541a(uDTabLayout);
            if (a != null) {
                a.mo91353a();
            } else {
                a = null;
            }
            rVar.f87187c = a;
        }
    }

    TabPlugin$onCreate$3(TabPlugin rVar, ITitlebarComponent bVar, ITabComponent gVar) {
        this.f86904a = rVar;
        this.f86905b = bVar;
        this.f86906c = gVar;
    }
}
