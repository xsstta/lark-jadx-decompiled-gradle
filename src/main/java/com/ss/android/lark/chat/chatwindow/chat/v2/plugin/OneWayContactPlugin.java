package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.lark.pb.contact.v2.PushContactApplicationBannerAffectEvent;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.C33234e;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33152a;
import com.ss.android.lark.chat.chatwindow.chat.banner.C33154b;
import com.ss.android.lark.chat.chatwindow.chat.banner.component.ApplyAddFriendBanner;
import com.ss.android.lark.chat.chatwindow.chat.banner.component.ApplyMessageBanner;
import com.ss.android.lark.chat.chatwindow.chat.banner.component.BlockOrAddContactBanner;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatOneWayContactPushHandler;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatwindow.C35212a;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.contact.entity.UserRelationResponse;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36493i;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.chat.ChatHitPoint;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u0018\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0016J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0018H\u0002J,\u0010%\u001a\u00020\u00182\u001a\u0010&\u001a\u0016\u0012\u0004\u0012\u00020(\u0018\u00010'j\n\u0012\u0004\u0012\u00020(\u0018\u0001`)2\u0006\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020\u0018H\u0002J\b\u0010-\u001a\u00020\u0018H\u0002J\u0010\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/OneWayContactPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatOneWayContactPushHandler$OneWayContactPush;", "()V", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", BottomDialog.f17198f, "", "latestRequestVersion", "", "messageListComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent;", "oneWayContactPushHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatOneWayContactPushHandler;", "pushHandlerManager", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/PushHandlerManager;", "titlebarComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent;", "userRelationLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/contact/entity/UserRelationResponse;", "fetchUserRelation", "", "initBanners", "onCreate", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "onDestroy", "onPushAddFriend", "onPushExternalContact", "event", "Lcom/bytedance/lark/pb/contact/v2/PushContactApplicationBannerAffectEvent;", "registerBanners", "showApplyCollabDialog", "contacts", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/contact/entity/Contact;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "unblockChatter", "unregisterBanners", "updateMessageList", "block", "", "updateTitleBarBanner", "userRelation", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.k */
public final class OneWayContactPlugin extends BaseChatPlugin implements ChatOneWayContactPushHandler.OneWayContactPush {

    /* renamed from: e */
    public static final Companion f87079e = new Companion(null);

    /* renamed from: a */
    public String f87080a;

    /* renamed from: b */
    public ITitlebarComponent f87081b;

    /* renamed from: c */
    public int f87082c;

    /* renamed from: d */
    public final C1177w<UserRelationResponse> f87083d = new C1177w<>();

    /* renamed from: f */
    private Chatter f87084f;

    /* renamed from: g */
    private Chat f87085g;

    /* renamed from: h */
    private IMessageListComponent f87086h;

    /* renamed from: l */
    private ChatOneWayContactPushHandler f87087l;

    /* renamed from: m */
    private final C33466o f87088m = new C33466o();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/OneWayContactPlugin$Companion;", "", "()V", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.k$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/OneWayContactPlugin$onCreate$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent$OnBannerControllerInitListener;", "init", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.k$c */
    public static final class C33799c implements ITitlebarComponent.OnBannerControllerInitListener {

        /* renamed from: a */
        final /* synthetic */ OneWayContactPlugin f87091a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent.OnBannerControllerInitListener
        /* renamed from: a */
        public void mo123718a() {
            this.f87091a.mo123831b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33799c(OneWayContactPlugin kVar) {
            this.f87091a = kVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "getFragment", "com/ss/android/lark/chat/chatwindow/chat/v2/plugin/OneWayContactPlugin$registerBanners$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.k$f */
    public static final class C33802f implements ApplyAddFriendBanner.AbstractC33159c {

        /* renamed from: a */
        final /* synthetic */ OneWayContactPlugin f87094a;

        C33802f(OneWayContactPlugin kVar) {
            this.f87094a = kVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.banner.component.ApplyAddFriendBanner.AbstractC33159c
        /* renamed from: a */
        public final BaseFragment mo122365a() {
            return this.f87094a.mo122130k();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "getFragment", "com/ss/android/lark/chat/chatwindow/chat/v2/plugin/OneWayContactPlugin$registerBanners$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.k$g */
    public static final class C33803g implements BlockOrAddContactBanner.AbstractC33172c {

        /* renamed from: a */
        final /* synthetic */ OneWayContactPlugin f87095a;

        C33803g(OneWayContactPlugin kVar) {
            this.f87095a = kVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.banner.component.BlockOrAddContactBanner.AbstractC33172c
        /* renamed from: a */
        public final BaseFragment mo122376a() {
            return this.f87095a.mo122130k();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    public void as_() {
        super.as_();
        m130983d();
    }

    /* renamed from: b */
    public final void mo123831b() {
        m130984e();
        m130985f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/OneWayContactPlugin$unblockChatter$1", "Lcom/ss/android/lark/chatwindow/ActionUtils$OnDialogClickListener;", "onCancel", "", "onConfirm", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.k$h */
    public static final class C33804h implements C35212a.AbstractC35215a {

        /* renamed from: a */
        final /* synthetic */ OneWayContactPlugin f87096a;

        @Override // com.ss.android.lark.chatwindow.C35212a.AbstractC35215a
        /* renamed from: b */
        public void mo122373b() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/OneWayContactPlugin$unblockChatter$1$onConfirm$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.k$h$a */
        public static final class C33805a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C33804h f87097a;

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.k$h$a$b */
            public static final class RunnableC33807b implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C33805a f87100a;

                RunnableC33807b(C33805a aVar) {
                    this.f87100a = aVar;
                }

                public final void run() {
                    C35212a.m137534a(this.f87100a.f87097a.f87096a.mo122128i(), true);
                }
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.k$h$a$a */
            public static final class RunnableC33806a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C33805a f87098a;

                /* renamed from: b */
                final /* synthetic */ ErrorResult f87099b;

                RunnableC33806a(C33805a aVar, ErrorResult errorResult) {
                    this.f87098a = aVar;
                    this.f87099b = errorResult;
                }

                public final void run() {
                    C35212a.m137534a(this.f87098a.f87097a.f87096a.mo122128i(), false);
                    Log.m165383e("OneWayContactPlugin", this.f87099b.getDisplayMsg());
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C33805a(C33804h hVar) {
                this.f87097a = hVar;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                UICallbackExecutor.execute(new RunnableC33806a(this, errorResult));
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                UICallbackExecutor.execute(new RunnableC33807b(this));
                ChatHitPoint.f135648a.mo187366d(OneWayContactPlugin.m130981a(this.f87097a.f87096a));
            }
        }

        @Override // com.ss.android.lark.chatwindow.C35212a.AbstractC35215a
        /* renamed from: a */
        public void mo122372a() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.ah().mo134652e(OneWayContactPlugin.m130981a(this.f87096a), (IGetDataCallback) this.f87096a.mo122129j().wrapAndAddCallback(new C33805a(this)));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33804h(OneWayContactPlugin kVar) {
            this.f87096a = kVar;
        }
    }

    /* renamed from: c */
    public final void mo123832c() {
        C35212a.m137544c(mo122128i(), new C33804h(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/OneWayContactPlugin$registerBanners$1$1", "Lcom/ss/android/lark/chat/chatwindow/chat/banner/DefaultBannerListener;", "onClose", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.k$e */
    public static final class C33801e extends C33154b {

        /* renamed from: a */
        final /* synthetic */ OneWayContactPlugin f87093a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.banner.C33154b, com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33186e
        /* renamed from: c */
        public void mo122182c() {
            ITitlebarComponent bVar = this.f87093a.f87081b;
            if (bVar != null) {
                bVar.mo123667a(8, false, null);
            }
            ITitlebarComponent bVar2 = this.f87093a.f87081b;
            if (bVar2 != null) {
                bVar2.mo123667a(16, false, null);
            }
        }

        C33801e(OneWayContactPlugin kVar) {
            this.f87093a = kVar;
        }
    }

    /* renamed from: d */
    private final void m130983d() {
        ITitlebarComponent bVar = this.f87081b;
        if (bVar != null) {
            bVar.mo123664a(16);
            bVar.mo123664a(8);
            bVar.mo123664a(32);
        }
    }

    /* renamed from: f */
    private final void m130985f() {
        int i = this.f87082c + 1;
        this.f87082c = i;
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36493i ah = b.ah();
        String str = this.f87080a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BottomDialog.f17198f);
        }
        ah.mo134648a(str, (IGetDataCallback) mo122129j().wrapAndAddCallback(new C33798b(this, i)));
    }

    /* renamed from: e */
    private final void m130984e() {
        ITitlebarComponent bVar = this.f87081b;
        if (bVar != null) {
            AbstractC33152a.AbstractC33153a b = ApplyMessageBanner.m128160j().mo122355a(2).mo122359b(31);
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            AbstractC33152a a = b.mo122357a(b2.mo134586n().mo134685a("lark.client.contact.opt")).mo122356a(new C33801e(this)).mo122358a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ApplyMessageBanner.newBu…\n                .build()");
            bVar.mo123668a(a);
            AbstractC33152a.AbstractC33153a b3 = ApplyAddFriendBanner.m128150j().mo122364a(new C33802f(this)).mo122355a(3).mo122359b(47);
            AbstractC36474h b4 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b4, "ChatModuleInstanceHolder.getDependency()");
            AbstractC33152a a2 = b3.mo122357a(b4.mo134586n().mo134685a("lark.client.contact.opt")).mo122356a(new C33154b()).mo122358a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "ApplyAddFriendBanner.new…\n                .build()");
            bVar.mo123668a(a2);
            AbstractC33152a.AbstractC33153a b5 = BlockOrAddContactBanner.m128170j().mo122375a(new C33803g(this)).mo122355a(4).mo122359b(55);
            AbstractC36474h b6 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b6, "ChatModuleInstanceHolder.getDependency()");
            AbstractC33152a a3 = b5.mo122357a(b6.mo134586n().mo134685a("lark.client.contact.opt")).mo122356a(new C33154b()).mo122358a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "BlockOrAddContactBanner.…\n                .build()");
            bVar.mo123668a(a3);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/chat/chatwindow/chat/v2/plugin/OneWayContactPlugin$updateMessageList$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.k$i */
    public static final class View$OnClickListenerC33808i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OneWayContactPlugin f87101a;

        /* renamed from: b */
        final /* synthetic */ boolean f87102b;

        /* renamed from: c */
        final /* synthetic */ SpannableStringBuilder f87103c;

        View$OnClickListenerC33808i(OneWayContactPlugin kVar, boolean z, SpannableStringBuilder spannableStringBuilder) {
            this.f87101a = kVar;
            this.f87102b = z;
            this.f87103c = spannableStringBuilder;
        }

        public final void onClick(View view) {
            this.f87101a.mo123832c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/OneWayContactPlugin$fetchUserRelation$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/contact/entity/UserRelationResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.k$b */
    public static final class C33798b implements IGetDataCallback<UserRelationResponse> {

        /* renamed from: a */
        final /* synthetic */ OneWayContactPlugin f87089a;

        /* renamed from: b */
        final /* synthetic */ int f87090b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("OneWayContactPlugin", errorResult.getDisplayMsg());
        }

        /* renamed from: a */
        public void onSuccess(UserRelationResponse userRelationResponse) {
            if (this.f87090b < this.f87089a.f87082c) {
                Log.m165383e("OneWayContactPlugin", "current version " + this.f87090b + " is smaller than " + this.f87089a.f87082c);
                return;
            }
            if (this.f87090b > this.f87089a.f87082c) {
                Log.m165383e("OneWayContactPlugin", "current version " + this.f87090b + " is larger than " + this.f87089a.f87082c);
            }
            this.f87089a.f87083d.mo5926a(userRelationResponse);
        }

        C33798b(OneWayContactPlugin kVar, int i) {
            this.f87089a = kVar;
            this.f87090b = i;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ String m130981a(OneWayContactPlugin kVar) {
        String str = kVar.f87080a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BottomDialog.f17198f);
        }
        return str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/contact/entity/UserRelationResponse;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.k$d */
    static final class C33800d<T> implements AbstractC1178x<UserRelationResponse> {

        /* renamed from: a */
        final /* synthetic */ OneWayContactPlugin f87092a;

        C33800d(OneWayContactPlugin kVar) {
            this.f87092a = kVar;
        }

        /* renamed from: a */
        public final void onChanged(UserRelationResponse userRelationResponse) {
            OneWayContactPlugin kVar = this.f87092a;
            Intrinsics.checkExpressionValueIsNotNull(userRelationResponse, "it");
            kVar.mo123829a(userRelationResponse);
            this.f87092a.mo123830a(userRelationResponse.isHasBlock());
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatOneWayContactPushHandler.OneWayContactPush
    /* renamed from: a */
    public void mo123081a(PushContactApplicationBannerAffectEvent pushContactApplicationBannerAffectEvent) {
        if (pushContactApplicationBannerAffectEvent != null) {
            List<String> list = pushContactApplicationBannerAffectEvent.target_user_ids;
            String str = this.f87080a;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BottomDialog.f17198f);
            }
            if (list.contains(str)) {
                m130985f();
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatOneWayContactPushHandler.OneWayContactPush
    /* renamed from: a */
    public void mo123082a(String str) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        String str2 = this.f87080a;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BottomDialog.f17198f);
        }
        if (!(!Intrinsics.areEqual(str, str2))) {
            ITitlebarComponent bVar = this.f87081b;
            if (bVar != null) {
                bVar.mo123667a(8, false, null);
            }
            ITitlebarComponent bVar2 = this.f87081b;
            if (bVar2 != null) {
                bVar2.mo123667a(16, false, null);
            }
        }
    }

    /* renamed from: a */
    public final void mo123829a(UserRelationResponse userRelationResponse) {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36450aa N = b.mo134515N();
        Chat chat = this.f87085g;
        if (chat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chat");
        }
        boolean a = N.mo134398a(chat.getOwnerId());
        Chat chat2 = this.f87085g;
        if (chat2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chat");
        }
        String id = chat2.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
        Chatter chatter = this.f87084f;
        if (chatter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatter");
        }
        String localizedName = chatter.getLocalizedName();
        Intrinsics.checkExpressionValueIsNotNull(localizedName, "chatter.getLocalizedName()");
        Chatter chatter2 = this.f87084f;
        if (chatter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatter");
        }
        String avatarKey = chatter2.getAvatarKey();
        Intrinsics.checkExpressionValueIsNotNull(avatarKey, "chatter.getAvatarKey()");
        boolean z = !(userRelationResponse.isHasBeApply() | userRelationResponse.isHasApply() | userRelationResponse.isHasBlock() | userRelationResponse.isFriend() | userRelationResponse.isBeCtrlAddContact());
        boolean z2 = (!a) & z & (!userRelationResponse.isInCollaboration());
        boolean z3 = a & z & (!userRelationResponse.isInCollaboration());
        boolean isHasBeApply = userRelationResponse.isHasBeApply() & (!userRelationResponse.isBeCtrlAddContact()) & (!userRelationResponse.isInCollaboration());
        ITitlebarComponent bVar = this.f87081b;
        if (bVar != null) {
            String str = this.f87080a;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BottomDialog.f17198f);
            }
            bVar.mo123667a(32, isHasBeApply, new ApplyMessageBanner.C33164a(str, avatarKey, userRelationResponse.getApplyReason(), userRelationResponse.getContactApplicationId()));
            String str2 = this.f87080a;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BottomDialog.f17198f);
            }
            bVar.mo123667a(16, z3, new ApplyAddFriendBanner.C33157a(id, str2, localizedName, avatarKey));
            String str3 = this.f87080a;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BottomDialog.f17198f);
            }
            bVar.mo123667a(8, z2, new BlockOrAddContactBanner.C33170a(id, str3, localizedName));
        }
    }

    /* renamed from: a */
    public final void mo123830a(boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(UIHelper.getString(R.string.Lark_NewContacts_UnblockGeneral));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(UIHelper.getColor(R.color.lkui_B500)), 0, spannableStringBuilder.length(), 33);
        IMessageListComponent iMessageListComponent = this.f87086h;
        if (iMessageListComponent != null) {
            iMessageListComponent.mo123317a(z, spannableStringBuilder, new View$OnClickListenerC33808i(this, z, spannableStringBuilder));
            C33234e aq_ = iMessageListComponent.aq_();
            if (aq_ != null) {
                aq_.mo122533a(z);
            }
        }
    }

    /* renamed from: a */
    private final void m130982a(ArrayList<Contact> arrayList, Context context) {
        String str;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList.size() == 1) {
                Contact contact = arrayList.get(0);
                Intrinsics.checkExpressionValueIsNotNull(contact, "contacts[0]");
                str = UIHelper.mustacheFormat((int) R.string.Lark_NewContacts_NeedToAddToContactstGroupOneDialogContent, "Name", contact.mo130408c());
            } else {
                str = UIHelper.getString(R.string.Lark_NewContacts_NeedToAddToContactstGroupDialogContent);
            }
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.ah().mo134647a(context, str, "group_confirm", arrayList, null);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        if (!b.mo134586n().mo134685a("lark.client.contact.opt")) {
            Log.m165379d("OneWayContactPlugin", "FG lark.client.contact.opt Disabled");
            return;
        }
        if (bVar.f90966p != null) {
            m130982a(bVar.f90966p.getParcelableArrayList("option_bundle_contacts_to_apply"), dVar.mo123135f());
        }
        Chat chat = bVar.f90956f;
        Intrinsics.checkExpressionValueIsNotNull(chat, "initData.chat");
        this.f87085g = chat;
        if (chat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chat");
        }
        if (chat.isP2PChat()) {
            Chat chat2 = this.f87085g;
            if (chat2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chat");
            }
            if (chat2.isCrossTenant()) {
                ChatChatter chatChatter = bVar.f90957g;
                Intrinsics.checkExpressionValueIsNotNull(chatChatter, "initData.p2pChatter");
                ChatChatter chatChatter2 = chatChatter;
                this.f87084f = chatChatter2;
                if (chatChatter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("chatter");
                }
                if (!chatChatter2.isBot()) {
                    Chatter chatter = this.f87084f;
                    if (chatter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("chatter");
                    }
                    String id = chatter.getId();
                    Intrinsics.checkExpressionValueIsNotNull(id, "chatter.getId()");
                    this.f87080a = id;
                    String id2 = bVar.f90958h.getId();
                    String str = this.f87080a;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(BottomDialog.f17198f);
                    }
                    if (!TextUtils.equals(id2, str)) {
                        this.f87086h = (IMessageListComponent) dVar.mo123122a(IMessageListComponent.class);
                        ITitlebarComponent bVar2 = (ITitlebarComponent) dVar.mo123122a(ITitlebarComponent.class);
                        this.f87081b = bVar2;
                        if (bVar2 != null) {
                            bVar2.mo123672a(new C33799c(this));
                        }
                        this.f87083d.mo5923a(mo122130k(), new C33800d(this));
                        ChatOneWayContactPushHandler fVar = new ChatOneWayContactPushHandler(this);
                        this.f87087l = fVar;
                        C33466o oVar = this.f87088m;
                        if (fVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("oneWayContactPushHandler");
                        }
                        oVar.mo123117a(fVar).mo123118a();
                    }
                }
            }
        }
    }
}
