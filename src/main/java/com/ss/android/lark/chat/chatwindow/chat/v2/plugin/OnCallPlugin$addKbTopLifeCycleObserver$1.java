package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtendComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.plugin.OnCallPlugin;
import com.ss.android.lark.dependency.IHelpdeskDependency;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0007J\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/OnCallPlugin$addKbTopLifeCycleObserver$1", "Landroidx/lifecycle/LifecycleObserver;", "destroy", "", "onCreate", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class OnCallPlugin$addKbTopLifeCycleObserver$1 implements LifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ OnCallPlugin f86895a;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destroy() {
        String str = this.f86895a.f87050a;
        Log.m165389i(str, "destroy kbExtend,chatId：" + OnCallPlugin.m130951b(this.f86895a).getId());
        IHelpdeskDependency wVar = this.f86895a.f87051b;
        if (wVar != null) {
            wVar.mo134730b();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        OnCallPlugin.OnCallKbExtend bVar = new OnCallPlugin.OnCallKbExtend(OnCallPlugin.m130952c(this.f86895a), this.f86895a.f87051b);
        IKeyboardTopExtendComponent eVar = this.f86895a.f87053d;
        if (eVar != null) {
            eVar.mo123271a(bVar);
        }
        String str = this.f86895a.f87050a;
        Log.m165389i(str, "initial kbExtend，chatId：" + OnCallPlugin.m130951b(this.f86895a).getId() + " onCallId:" + OnCallPlugin.m130951b(this.f86895a).getOnCallId());
        if (this.f86895a.f87051b == null) {
            String str2 = this.f86895a.f87050a;
            Log.m165383e(str2, "helpdeskDependency is null chatId：" + OnCallPlugin.m130951b(this.f86895a).getId() + " onCallId:" + OnCallPlugin.m130951b(this.f86895a).getOnCallId());
            return;
        }
        IHelpdeskDependency wVar = this.f86895a.f87051b;
        if (wVar != null) {
            OnCallPlugin jVar = this.f86895a;
            wVar.mo134728a(jVar, OnCallPlugin.m130952c(jVar).mo123135f());
        }
        IHelpdeskDependency wVar2 = this.f86895a.f87051b;
        if (wVar2 != null) {
            Context f = OnCallPlugin.m130952c(this.f86895a).mo123135f();
            String id = OnCallPlugin.m130951b(this.f86895a).getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
            wVar2.mo134727a(f, id);
        }
        IHelpdeskDependency wVar3 = this.f86895a.f87051b;
        if (wVar3 != null) {
            wVar3.mo134726a();
        }
        IHelpdeskDependency wVar4 = this.f86895a.f87051b;
        if (wVar4 != null) {
            String id2 = OnCallPlugin.m130951b(this.f86895a).getId();
            Intrinsics.checkExpressionValueIsNotNull(id2, "chat.getId()");
            wVar4.mo134729a(id2, (String) null);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    OnCallPlugin$addKbTopLifeCycleObserver$1(OnCallPlugin jVar) {
        this.f86895a = jVar;
    }
}
