package com.ss.android.lark.chat.chatwindow.biz.plugin.core;

import android.content.Context;
import com.larksuite.framework.callback.CallbackManager;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0017J\b\u0010\u001b\u001a\u00020\u0016H\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/IChatPlugin;", "()V", "callBackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "getCallBackManager", "()Lcom/larksuite/framework/callback/CallbackManager;", "setCallBackManager", "(Lcom/larksuite/framework/callback/CallbackManager;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "hostFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "getHostFragment", "()Lcom/ss/android/lark/base/fragment/BaseFragment;", "setHostFragment", "(Lcom/ss/android/lark/base/fragment/BaseFragment;)V", "onCreate", "", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "onDestroy", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.a.a */
public class BaseChatPlugin implements IChatPlugin {

    /* renamed from: i */
    protected Context f85112i;

    /* renamed from: j */
    protected CallbackManager f85113j;

    /* renamed from: k */
    protected BaseFragment f85114k;

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin
    public void as_() {
        CallbackManager callbackManager = this.f85113j;
        if (callbackManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callBackManager");
        }
        callbackManager.cancelCallbacks();
    }

    /* renamed from: i */
    public final Context mo122128i() {
        Context context = this.f85112i;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return context;
    }

    /* renamed from: j */
    public final CallbackManager mo122129j() {
        CallbackManager callbackManager = this.f85113j;
        if (callbackManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callBackManager");
        }
        return callbackManager;
    }

    /* renamed from: k */
    public final BaseFragment mo122130k() {
        BaseFragment baseFragment = this.f85114k;
        if (baseFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hostFragment");
        }
        return baseFragment;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin
    /* renamed from: a */
    public void mo122127a(ChatBundle chatBundle) {
        Intrinsics.checkParameterIsNotNull(chatBundle, "bundle");
        IChatPlugin.C33052a.m127830a(this, chatBundle);
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        this.f85112i = dVar.mo123135f();
        this.f85113j = new CallbackManager();
        Object o = dVar.mo123193o();
        if (o != null) {
            this.f85114k = (BaseFragment) o;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.base.fragment.BaseFragment");
    }
}
