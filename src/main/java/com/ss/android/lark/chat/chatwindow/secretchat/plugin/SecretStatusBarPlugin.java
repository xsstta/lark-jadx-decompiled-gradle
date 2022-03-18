package com.ss.android.lark.chat.chatwindow.secretchat.plugin;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.core.graphics.C0768a;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.C29517a;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\b\u0010\u0017\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretStatusBarPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "()V", "commonTitleColorBgRes", "", "isHide", "", "mChatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "mCloseChatHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$ICloseChatHandler;", "secretChatTitleColorBgRes", "onCreate", "", "chatApp", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "onDestroy", "resetStatusBar", "setupStatusBarColor", "statusBarColor", "updateStatusBar", "hide", "updateStatusBarImmediate", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.f */
public final class SecretStatusBarPlugin extends BaseChatPlugin {

    /* renamed from: b */
    public static final Companion f87428b = new Companion(null);

    /* renamed from: a */
    public IChatWindowApp f87429a;

    /* renamed from: c */
    private IChatWindowApp.ICloseChatHandler f87430c;

    /* renamed from: d */
    private final int f87431d = R.color.bg_tips;

    /* renamed from: e */
    private final int f87432e = R.color.bg_body;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretStatusBarPlugin$Companion;", "", "()V", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretStatusBarPlugin$onCreate$3", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$OnTitleStateChangeListener;", "onPageTitleChangeState", "", "hide", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.f$c */
    public static final class C33923c implements IChatTabPageSpec.OnTitleStateChangeListener {
        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec.OnTitleStateChangeListener
        /* renamed from: a */
        public void mo123179a(boolean z) {
        }

        C33923c() {
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    public void as_() {
        super.as_();
        m131290b();
    }

    /* renamed from: b */
    private final void m131290b() {
        m131289a(true);
        Log.m165379d("StatusBarPlugin", "finishPage update status bar");
    }

    /* renamed from: c */
    private final void m131291c() {
        Context i = mo122128i();
        if (i instanceof Activity) {
            m131288a(UIUtils.getColor(i, this.f87431d));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretStatusBarPlugin$onCreate$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$ICloseChatHandler;", "onCloseChat", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.f$b */
    public static final class C33922b implements IChatWindowApp.ICloseChatHandler {

        /* renamed from: a */
        final /* synthetic */ SecretStatusBarPlugin f87433a;

        /* renamed from: b */
        final /* synthetic */ C35219b f87434b;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp.ICloseChatHandler
        /* renamed from: a */
        public boolean mo123196a() {
            if (TextUtils.isEmpty(this.f87434b.f90963m)) {
                return true;
            }
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134588p().mo134752c(SecretStatusBarPlugin.m131287a(this.f87433a).mo123135f(), this.f87434b.f90963m);
            return true;
        }

        C33922b(SecretStatusBarPlugin fVar, C35219b bVar) {
            this.f87433a = fVar;
            this.f87434b = bVar;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IChatWindowApp m131287a(SecretStatusBarPlugin fVar) {
        IChatWindowApp dVar = fVar.f87429a;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatApp");
        }
        return dVar;
    }

    /* renamed from: a */
    private final void m131289a(boolean z) {
        Context i = mo122128i();
        if (!(i instanceof Activity)) {
            return;
        }
        if (z) {
            m131288a(UIUtils.getColor(i, this.f87432e));
        } else {
            m131288a(UIUtils.getColor(i, this.f87431d));
        }
    }

    /* renamed from: a */
    private final void m131288a(int i) {
        if (C0768a.m3714b(-1, i) <= ((double) 3.0f)) {
            C29517a.m108726b().mo102665a((Activity) mo122128i(), i);
        } else {
            C29517a.m108726b().mo102666b((Activity) mo122128i(), i);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        this.f87429a = dVar;
        this.f87430c = new C33922b(this, bVar);
        m131291c();
        IChatWindowApp.ICloseChatHandler cVar = this.f87430c;
        if (cVar != null) {
            dVar.mo123127a(cVar);
        }
        IChatWindowApp dVar2 = this.f87429a;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatApp");
        }
        dVar2.mo123129a(new C33923c());
    }
}
