package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

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
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.util.ChatTabFgUtil;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.dependency.AbstractC36474h;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/StatusBarPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "()V", "chatTitleColorBgRes", "", "mChatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "mCloseChatHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$ICloseChatHandler;", "mCurrentChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "mStatusBarAnimHelper", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/StatusBarAnimHelper;", "getMStatusBarAnimHelper", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/StatusBarAnimHelper;", "mStatusBarAnimHelper$delegate", "Lkotlin/Lazy;", "mTabSwitchListener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabComponent$OnTabSwitchListener;", "getMTabSwitchListener", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabComponent$OnTabSwitchListener;", "mTabSwitchListener$delegate", "onCreate", "", "chatApp", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "onDestroy", "setupStatusBarColor", "statusBarColor", "updateStatusBar", "isTitleHide", "", "updateStatusBarImmediate", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.q */
public final class StatusBarPlugin extends BaseChatPlugin {

    /* renamed from: b */
    public static final Companion f87174b = new Companion(null);

    /* renamed from: a */
    public IChatWindowApp f87175a;

    /* renamed from: c */
    private Chat f87176c;

    /* renamed from: d */
    private IChatWindowApp.ICloseChatHandler f87177d;

    /* renamed from: e */
    private final int f87178e = R.color.imtoken_message_bg_chat;

    /* renamed from: f */
    private final Lazy f87179f = LazyKt.lazy(new C33833b(this));

    /* renamed from: g */
    private final Lazy f87180g = LazyKt.lazy(new C33835c(this));

    /* renamed from: b */
    private final StatusBarAnimHelper m131064b() {
        return (StatusBarAnimHelper) this.f87179f.getValue();
    }

    /* renamed from: c */
    private final ITabComponent.OnTabSwitchListener m131065c() {
        return (ITabComponent.OnTabSwitchListener) this.f87180g.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/StatusBarPlugin$Companion;", "", "()V", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.q$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/chat/chatwindow/chat/v2/plugin/StatusBarPlugin$mTabSwitchListener$2$1", "invoke", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/StatusBarPlugin$mTabSwitchListener$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.q$c */
    static final class C33835c extends Lambda implements Function0<C338361> {
        final /* synthetic */ StatusBarPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33835c(StatusBarPlugin qVar) {
            super(0);
            this.this$0 = qVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C338361 invoke() {
            return new ITabComponent.OnTabSwitchListener(this) {
                /* class com.ss.android.lark.chat.chatwindow.chat.v2.plugin.StatusBarPlugin.C33835c.C338361 */

                /* renamed from: a */
                final /* synthetic */ C33835c f87181a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f87181a = r1;
                }

                @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent.OnTabSwitchListener
                /* renamed from: a */
                public void mo123626a(long j) {
                    this.f87181a.this$0.mo123859a(false);
                }
            };
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/StatusBarAnimHelper;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.q$b */
    public static final class C33833b extends Lambda implements Function0<StatusBarAnimHelper> {
        final /* synthetic */ StatusBarPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33833b(StatusBarPlugin qVar) {
            super(0);
            this.this$0 = qVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final StatusBarAnimHelper invoke() {
            return new StatusBarAnimHelper(new Function1<Integer, Unit>(this) {
                /* class com.ss.android.lark.chat.chatwindow.chat.v2.plugin.StatusBarPlugin.C33833b.C338341 */
                final /* synthetic */ C33833b this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke(int i) {
                    this.this$0.this$0.mo123858a(i);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/StatusBarPlugin$onCreate$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$ICloseChatHandler;", "onCloseChat", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.q$d */
    public static final class C33837d implements IChatWindowApp.ICloseChatHandler {

        /* renamed from: a */
        final /* synthetic */ StatusBarPlugin f87182a;

        /* renamed from: b */
        final /* synthetic */ C35219b f87183b;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp.ICloseChatHandler
        /* renamed from: a */
        public boolean mo123196a() {
            if (TextUtils.isEmpty(this.f87183b.f90963m)) {
                return true;
            }
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134588p().mo134752c(StatusBarPlugin.m131063a(this.f87182a).mo123135f(), this.f87183b.f90963m);
            return true;
        }

        C33837d(StatusBarPlugin qVar, C35219b bVar) {
            this.f87182a = qVar;
            this.f87183b = bVar;
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    public void as_() {
        Chat chat = this.f87176c;
        if (chat != null && ChatTabFgUtil.f86815a.mo123637a(chat)) {
            IChatWindowApp dVar = this.f87175a;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatApp");
            }
            ((ITabComponent) dVar.mo123122a(ITabComponent.class)).mo123548b(m131065c());
        }
        super.as_();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/StatusBarPlugin$onCreate$3", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$OnTitleStateChangeListener;", "onPageTitleChangeState", "", "hide", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.q$e */
    public static final class C33838e implements IChatTabPageSpec.OnTitleStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ StatusBarPlugin f87184a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33838e(StatusBarPlugin qVar) {
            this.f87184a = qVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec.OnTitleStateChangeListener
        /* renamed from: a */
        public void mo123179a(boolean z) {
            this.f87184a.mo123860b(z);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IChatWindowApp m131063a(StatusBarPlugin qVar) {
        IChatWindowApp dVar = qVar.f87175a;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatApp");
        }
        return dVar;
    }

    /* renamed from: a */
    public final void mo123858a(int i) {
        if (C0768a.m3714b(-1, i) <= ((double) 3.0f)) {
            C29517a.m108726b().mo102665a((Activity) mo122128i(), i);
        } else {
            C29517a.m108726b().mo102666b((Activity) mo122128i(), i);
        }
    }

    /* renamed from: b */
    public final void mo123860b(boolean z) {
        Context i = mo122128i();
        if (i instanceof Activity) {
            Chat chat = this.f87176c;
            if (chat == null || !ChatTabFgUtil.f86815a.mo123637a(chat)) {
                mo123858a(UIUtils.getColor(i, this.f87178e));
            } else if (z) {
                m131064b().mo123851a();
            } else {
                m131064b().mo123852b();
            }
        }
    }

    /* renamed from: a */
    public final void mo123859a(boolean z) {
        Chat chat;
        int i;
        Context i2 = mo122128i();
        if ((i2 instanceof Activity) && (chat = this.f87176c) != null) {
            if (ChatTabFgUtil.f86815a.mo123637a(chat)) {
                if (z) {
                    i = UIUtils.getColor(i2, this.f87178e);
                } else {
                    i = UIUtils.getColor(i2, R.color.bg_body_overlay);
                }
                mo123858a(i);
                return;
            }
            mo123858a(UIUtils.getColor(i2, this.f87178e));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        this.f87175a = dVar;
        this.f87176c = bVar.f90956f;
        this.f87177d = new C33837d(this, bVar);
        mo123859a(false);
        IChatWindowApp.ICloseChatHandler cVar = this.f87177d;
        if (cVar != null) {
            dVar.mo123127a(cVar);
        }
        IChatWindowApp dVar2 = this.f87175a;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatApp");
        }
        dVar2.mo123129a(new C33838e(this));
        Chat chat = this.f87176c;
        if (chat != null && ChatTabFgUtil.f86815a.mo123637a(chat)) {
            IChatWindowApp dVar3 = this.f87175a;
            if (dVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatApp");
            }
            ((ITabComponent) dVar3.mo123122a(ITabComponent.class)).mo123544a(m131065c());
        }
    }
}
