package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.tab.service.ChatTabProcessor;
import com.ss.android.lark.tab.service.entity.ChatTab;
import com.ss.android.lark.tab.service.entity.ChatTabsListResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0007J\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TabPlugin$onCreate$2", "Landroidx/lifecycle/LifecycleObserver;", "onCreate", "", "onDestroy", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class TabPlugin$onCreate$2 implements LifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ TabPlugin f86901a;

    /* renamed from: b */
    final /* synthetic */ C35219b f86902b;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        ChatTabProcessor.Companion bVar = ChatTabProcessor.f136407e;
        String str = TabPlugin.m131073a(this.f86901a).f90955e;
        Intrinsics.checkExpressionValueIsNotNull(str, "mInitData.chatId");
        bVar.mo188387a(str).mo188385b(this.f86901a.mo123863b());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        ChatTabProcessor.Companion bVar = ChatTabProcessor.f136407e;
        String str = this.f86902b.f90955e;
        Intrinsics.checkExpressionValueIsNotNull(str, "initData.chatId");
        bVar.mo188387a(str).mo188377a(this.f86901a.mo123863b()).mo188380a(new C33732a(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TabPlugin$onCreate$2$onCreate$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/tab/service/entity/ChatTabsListResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.TabPlugin$onCreate$2$a */
    public static final class C33732a implements IGetDataCallback<ChatTabsListResult> {

        /* renamed from: a */
        final /* synthetic */ TabPlugin$onCreate$2 f86903a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33732a(TabPlugin$onCreate$2 tabPlugin$onCreate$2) {
            this.f86903a = tabPlugin$onCreate$2;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f86903a.f86901a.mo123862a((List<ChatTab>) null);
        }

        /* renamed from: a */
        public void onSuccess(ChatTabsListResult aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f86903a.f86901a.mo123862a(aVar.mo188425a());
        }
    }

    TabPlugin$onCreate$2(TabPlugin rVar, C35219b bVar) {
        this.f86901a = rVar;
        this.f86902b = bVar;
    }
}
