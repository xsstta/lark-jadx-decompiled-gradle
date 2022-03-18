package com.ss.android.lark.chat.chatwindow.biz.plugin;

import android.app.Activity;
import android.content.Context;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/plugin/WaterMarkPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/IChatPlugin;", "()V", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "mLoginDependency", "Lcom/ss/android/lark/dependency/ILoginDependency;", "clearWatermark", "", "activity", "Landroid/app/Activity;", "initWaterBg", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onCreate", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "onDestroy", "setupWatermark", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.i */
public final class WaterMarkPlugin implements IChatPlugin {

    /* renamed from: a */
    public final AbstractC36450aa f85212a;

    /* renamed from: b */
    public IChatWindowApp f85213b;

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin
    public void as_() {
    }

    public WaterMarkPlugin() {
        AbstractC36450aa N = C29990c.m110930b().mo134515N();
        Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…cy().getLoginDependency()");
        this.f85212a = N;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.i$a */
    static final class RunnableC33082a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WaterMarkPlugin f85214a;

        /* renamed from: b */
        final /* synthetic */ Chat f85215b;

        RunnableC33082a(WaterMarkPlugin iVar, Chat chat) {
            this.f85214a = iVar;
            this.f85215b = chat;
        }

        public final void run() {
            Context f = WaterMarkPlugin.m127912a(this.f85214a).mo123135f();
            if ((f instanceof Activity) && !this.f85214a.f85212a.mo134402e()) {
                if (!this.f85215b.isCrossTenant()) {
                    this.f85214a.mo122211b((Activity) f);
                } else if (!this.f85215b.isHasWatermark()) {
                    this.f85214a.mo122211b((Activity) f);
                } else {
                    this.f85214a.mo122209a((Activity) f);
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IChatWindowApp m127912a(WaterMarkPlugin iVar) {
        IChatWindowApp dVar = iVar.f85213b;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatApp");
        }
        return dVar;
    }

    /* renamed from: a */
    public final void mo122209a(Activity activity) {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.aq().mo134479a(activity);
    }

    /* renamed from: b */
    public final void mo122211b(Activity activity) {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.aq().mo134480b(activity);
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin
    /* renamed from: a */
    public void mo122127a(ChatBundle chatBundle) {
        Intrinsics.checkParameterIsNotNull(chatBundle, "bundle");
        IChatPlugin.C33052a.m127830a(this, chatBundle);
    }

    /* renamed from: a */
    public final void mo122210a(Chat chat) {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getUIExecutor().execute(new RunnableC33082a(this, chat));
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        this.f85213b = dVar;
        ((IMessageListComponent) dVar.mo123122a(IMessageListComponent.class)).getLifecycle().addObserver(new WaterMarkPlugin$onCreate$1(this, bVar));
    }
}
