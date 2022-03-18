package com.ss.android.lark.mail.impl.home.titlebar.accountcard;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.Disposable;
import com.larksuite.arch.jack.ISubscriber;
import com.larksuite.arch.jack.JackView;
import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.arch.jack.LifecycleOwnerHolder;
import com.larksuite.arch.jack.State;
import com.larksuite.arch.jack.SubscriptionConfig;
import com.larksuite.arch.jack.Tuple1;
import com.larksuite.arch.jack.Tuple2;
import com.larksuite.arch.jack.Tuple3;
import com.larksuite.arch.jack.Tuple4;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.guide.ui.config.TextBubbleConfig;
import com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.home.p2178a.C42361b;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43333t;
import com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43340b;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44549f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u0003:\u000289B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u00192\u0006\u0010&\u001a\u00020'H\u0002J\u0006\u0010(\u001a\u00020$J\b\u0010)\u001a\u0004\u0018\u00010\u0019J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020$H\u0016J\u0006\u0010-\u001a\u00020$J \u0010.\u001a\u00020$2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u001eH\u0016J\u001a\u00104\u001a\u00020$2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u00105\u001a\u0004\u0018\u000106J\b\u00107\u001a\u00020$H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0006R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006:"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/titlebar/accountcard/AccountCardComponent;", "Lcom/larksuite/arch/jack/JackView;", "Lcom/ss/android/lark/mail/impl/service/watchers/rustwatchers/SharedAccountChangeWatcher;", "Lcom/ss/android/lark/mail/impl/service/watchers/uiwatchers/AddAccountWatcher;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "accountCardView", "Lcom/ss/android/lark/mail/impl/home/titlebar/accountcard/AccountCardView;", "accountCardViewModel", "Lcom/ss/android/lark/mail/impl/home/titlebar/accountcard/AccountCardViewModel;", "getAccountCardViewModel", "()Lcom/ss/android/lark/mail/impl/home/titlebar/accountcard/AccountCardViewModel;", "setAccountCardViewModel", "(Lcom/ss/android/lark/mail/impl/home/titlebar/accountcard/AccountCardViewModel;)V", "accountListComponent", "Lcom/ss/android/lark/mail/impl/home/account/AccountListComponent;", "getAccountListComponent", "()Lcom/ss/android/lark/mail/impl/home/account/AccountListComponent;", "setAccountListComponent", "(Lcom/ss/android/lark/mail/impl/home/account/AccountListComponent;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "setFragment", "itemView", "Landroid/view/View;", "titleController", "Lcom/ss/android/lark/maincore/ITitleControllerV2;", "visibleLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getVisibleLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setVisibleLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "enqueueAccountCardOnboarding", "", "anchorView", "accountCardDelegate", "Lcom/ss/android/lark/mail/impl/home/titlebar/accountcard/AccountCardComponent$AccountDelegate;", "ensureVisible", "getItemView", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "onConfirmAddAccount", "onDestroy", "onSharedAccountChange", "sessionKey", "", "account", "Lcom/ss/android/lark/mail/impl/entity/EmailAccount;", "isBind", "setController", "menuController", "Lcom/ss/android/lark/maincore/IMenuController;", "tryToAddBottomView", "AccountDelegate", "Companion", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.d.a.a */
public final class AccountCardComponent implements JackView, AbstractC43333t, AbstractC43340b {

    /* renamed from: c */
    public static final Companion f108127c = new Companion(null);

    /* renamed from: a */
    public AccountCardView f108128a;

    /* renamed from: b */
    public View f108129b;

    /* renamed from: d */
    private AccountCardViewModel f108130d;

    /* renamed from: e */
    private C42361b f108131e = new C42361b(this.f108134h.getContext());

    /* renamed from: f */
    private AbstractC44549f f108132f;

    /* renamed from: g */
    private C1177w<Boolean> f108133g = new C1177w<>();

    /* renamed from: h */
    private Fragment f108134h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/titlebar/accountcard/AccountCardComponent$AccountDelegate;", "", "allowShow", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.d.a.a$a */
    public interface AccountDelegate {
        /* renamed from: a */
        boolean mo152815a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/titlebar/accountcard/AccountCardComponent$Companion;", "", "()V", "TAG", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.d.a.a$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final AccountCardViewModel mo152804c() {
        return this.f108130d;
    }

    /* renamed from: d */
    public final C42361b mo152805d() {
        return this.f108131e;
    }

    /* renamed from: e */
    public final C1177w<Boolean> mo152806e() {
        return this.f108133g;
    }

    /* renamed from: h */
    public final View mo152809h() {
        return this.f108129b;
    }

    /* renamed from: k */
    public final Fragment mo152812k() {
        return this.f108134h;
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public LifecycleOwnerHolder mo86226a() {
        return JackView.C24027a.m87835a(this);
    }

    @Override // com.larksuite.arch.jack.LifecycleOwnerHolder
    public LifecycleOwner aZ_() {
        return JackView.C24027a.m87836b(this);
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43340b
    /* renamed from: f */
    public void mo152807f() {
        C43849u.m173826a(new RunnableC42479e(this));
    }

    /* renamed from: g */
    public final void mo152808g() {
        this.f108131e.mo152521b();
        Watchers.m167209b(this);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.f108134h.getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "fragment.lifecycle");
        return lifecycle;
    }

    /* renamed from: i */
    public final void mo152810i() {
        this.f108130d.withState(new C42478d(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.d.a.a$f */
    static final class RunnableC42483f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AccountCardComponent f108143a;

        RunnableC42483f(AccountCardComponent aVar) {
            this.f108143a = aVar;
        }

        public final void run() {
            if (this.f108143a.mo152805d().mo152520a()) {
                this.f108143a.mo152805d().mo152517a((View) null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.d.a.a$e */
    static final class RunnableC42479e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AccountCardComponent f108140a;

        RunnableC42479e(AccountCardComponent aVar) {
            this.f108140a = aVar;
        }

        public final void run() {
            View b;
            ViewTreeObserver viewTreeObserver;
            if (this.f108140a.f108128a.mo152832b() != null && (b = this.f108140a.f108128a.mo152832b()) != null && (viewTreeObserver = b.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener(this) {
                    /* class com.ss.android.lark.mail.impl.home.titlebar.accountcard.AccountCardComponent.RunnableC42479e.ViewTreeObserver$OnPreDrawListenerC424801 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC42479e f108141a;

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/ss/android/lark/mail/impl/home/titlebar/accountcard/AccountCardComponent$onConfirmAddAccount$1$1$onPreDraw$1$1", "Lcom/ss/android/lark/mail/impl/home/titlebar/accountcard/AccountCardComponent$AccountDelegate;", "allowShow", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
                    /* renamed from: com.ss.android.lark.mail.impl.home.d.a.a$e$1$a */
                    public static final class C42481a implements AccountDelegate {

                        /* renamed from: a */
                        final /* synthetic */ ViewTreeObserver$OnPreDrawListenerC424801 f108142a;

                        @Override // com.ss.android.lark.mail.impl.home.titlebar.accountcard.AccountCardComponent.AccountDelegate
                        /* renamed from: a */
                        public boolean mo152815a() {
                            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                            booleanRef.element = false;
                            this.f108142a.f108141a.f108140a.mo152804c().withState(new Function1<AccountCardState, Unit>() {
                                /* class com.ss.android.lark.mail.impl.home.titlebar.accountcard.AccountCardComponent.RunnableC42479e.ViewTreeObserver$OnPreDrawListenerC424801.C42481a.C424821 */

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(AccountCardState bVar) {
                                    invoke(bVar);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AccountCardState bVar) {
                                    Intrinsics.checkParameterIsNotNull(bVar, "it");
                                    booleanRef.element = bVar.mo152823a();
                                }
                            });
                            return booleanRef.element;
                        }

                        C42481a(ViewTreeObserver$OnPreDrawListenerC424801 r1) {
                            this.f108142a = r1;
                        }
                    }

                    public boolean onPreDraw() {
                        View b = this.f108141a.f108140a.f108128a.mo152832b();
                        if (b == null) {
                            return true;
                        }
                        b.getViewTreeObserver().removeOnPreDrawListener(this);
                        this.f108141a.f108140a.mo152802a(b, new C42481a(this));
                        return true;
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f108141a = r1;
                    }
                });
            }
        }
    }

    /* renamed from: j */
    public final void mo152811j() {
        ViewParent viewParent;
        try {
            View view = this.f108129b;
            if (view != null) {
                viewParent = view.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent == null) {
                Log.m165389i("AccountCardComponent", "addBottomView");
                AbstractC44549f fVar = this.f108132f;
                if (fVar != null) {
                    fVar.mo99190a(this.f108129b);
                }
            }
        } catch (Throwable th) {
            Log.m165384e("AccountCardComponent", "addBottomView error", th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.d.a.a$c */
    public static final class RunnableC42476c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AccountCardComponent f108136a;

        /* renamed from: b */
        final /* synthetic */ View f108137b;

        /* renamed from: c */
        final /* synthetic */ AccountDelegate f108138c;

        RunnableC42476c(AccountCardComponent aVar, View view, AccountDelegate aVar2) {
            this.f108136a = aVar;
            this.f108137b = view;
            this.f108138c = aVar2;
        }

        public final void run() {
            AnchorConfig anchorConfig = new AnchorConfig(new WeakReference(this.f108137b), AnchorConfig.AnchorGravity.BOTTOM);
            MaskConfig maskConfig = new MaskConfig(0, BitmapDescriptorFactory.HUE_RED, MaskConfig.ShapeType.RECTANGLE, null, null);
            WeakReference weakReference = new WeakReference(this.f108138c);
            String a = C43819s.m173684a((int) R.string.Mail_Mailbox_PublicMailbox);
            Intrinsics.checkExpressionValueIsNotNull(a, "StringUtils.getString(st…il_Mailbox_PublicMailbox)");
            C38708a aVar = new C38708a(this.f108136a.mo152812k().getActivity(), new C42477a(weakReference), new TextBubbleConfig(anchorConfig, maskConfig, null, a));
            AbstractC41849c a2 = C41816b.m166115a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "Host.get()");
            a2.mo150118H().mo150197a("all_email_publicinbox", aVar);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/mail/impl/home/titlebar/accountcard/AccountCardComponent$enqueueAccountCardOnboarding$1$config$1", "Lcom/ss/android/lark/guidemgr/engine/callback/IGuideTaskLifecycle;", "onGuideDidAppear", "", "guideKey", "", "onGuideDidClose", "onGuideWillAppear", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mail.impl.home.d.a.a$c$a */
        public static final class C42477a implements AbstractC38707a {

            /* renamed from: a */
            final /* synthetic */ WeakReference f108139a;

            @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
            /* renamed from: a */
            public void mo129837a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "guideKey");
            }

            @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
            /* renamed from: c */
            public void mo129839c(String str) {
                Intrinsics.checkParameterIsNotNull(str, "guideKey");
            }

            C42477a(WeakReference weakReference) {
                this.f108139a = weakReference;
            }

            @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
            /* renamed from: b */
            public void mo129838b(String str) {
                Intrinsics.checkParameterIsNotNull(str, "guideKey");
                AccountDelegate aVar = (AccountDelegate) this.f108139a.get();
                if (aVar != null && !aVar.mo152815a()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str);
                    AbstractC41849c a = C41816b.m166115a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "Host.get()");
                    a.mo150118H().mo150195a(arrayList);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mail/impl/home/titlebar/accountcard/AccountCardState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.d.a.a$d */
    public static final class C42478d extends Lambda implements Function1<AccountCardState, Unit> {
        final /* synthetic */ AccountCardComponent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42478d(AccountCardComponent aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AccountCardState bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(AccountCardState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "it");
            if (bVar.mo152823a()) {
                this.this$0.mo152811j();
            }
        }
    }

    public AccountCardComponent(Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        this.f108134h = fragment;
        Context requireContext = fragment.requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "fragment.requireContext()");
        this.f108128a = new AccountCardView(requireContext);
        AbstractC1142af a = new C1144ai(this.f108134h).mo6005a(AccountCardViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProvider(fragme…ardViewModel::class.java)");
        this.f108130d = (AccountCardViewModel) a;
        this.f108130d.init(this.f108134h);
        ISubscriber.C24024a.m87808a(this, this.f108130d, (SubscriptionConfig) null, new Function1<AccountCardState, Unit>(this) {
            /* class com.ss.android.lark.mail.impl.home.titlebar.accountcard.AccountCardComponent.C424741 */
            final /* synthetic */ AccountCardComponent this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AccountCardState bVar) {
                invoke(bVar);
                return Unit.INSTANCE;
            }

            public final void invoke(AccountCardState bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
                if (bVar.mo152823a()) {
                    if (this.this$0.f108129b == null) {
                        this.this$0.f108128a.mo152830a();
                        AccountCardComponent aVar = this.this$0;
                        aVar.f108129b = aVar.f108128a.mo152832b();
                        View view = this.this$0.f108129b;
                        if (view != null) {
                            view.setOnClickListener(new View.OnClickListener(this) {
                                /* class com.ss.android.lark.mail.impl.home.titlebar.accountcard.AccountCardComponent.C424741.View$OnClickListenerC424751 */

                                /* renamed from: a */
                                final /* synthetic */ C424741 f108135a;

                                {
                                    this.f108135a = r1;
                                }

                                public final void onClick(View view) {
                                    this.f108135a.this$0.mo152805d().mo152517a(this.f108135a.this$0.f108129b);
                                }
                            });
                        }
                    }
                    this.this$0.f108128a.mo152831a(bVar);
                    this.this$0.mo152811j();
                } else {
                    this.this$0.f108128a.mo152831a(bVar);
                }
                this.this$0.mo152806e().mo5929b(Boolean.valueOf(bVar.mo152823a()));
            }
        }, 1, (Object) null);
        Watchers.m167206a(this);
    }

    /* renamed from: a */
    public final void mo152803a(AbstractC44549f fVar, AbstractC44548e eVar) {
        this.f108132f = fVar;
        this.f108131e.mo152518a(eVar);
    }

    /* renamed from: a */
    public final void mo152802a(View view, AccountDelegate aVar) {
        Log.m165389i("AccountCardComponent", "enqueueAccountCardOnboarding");
        if (view == null || view.getParent() == null) {
            Log.m165383e("AccountCardComponent", "enqueueAccountCardOnboarding empty view");
        } else {
            C43849u.m173826a(new RunnableC42476c(this, view, aVar));
        }
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State> Disposable mo86220a(JackViewModel<S> lVar, SubscriptionConfig<S> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87829a(this, lVar, vVar, function1);
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43333t
    public void onSharedAccountChange(String str, C42093e eVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "sessionKey");
        Intrinsics.checkParameterIsNotNull(eVar, "account");
        C43849u.m173826a(new RunnableC42483f(this));
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A> Disposable mo86221a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, SubscriptionConfig<Tuple1<A>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87830a(this, lVar, eVar, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B> Disposable mo86223a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, SubscriptionConfig<Tuple2<A, B>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87832a(this, lVar, eVar, eVar2, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, T> Disposable mo86222a(JackViewModel<S> lVar, KProperty1<S, ? extends Async<? extends T>> eVar, SubscriptionConfig<Tuple1<Async<T>>> vVar, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        return JackView.C24027a.m87831a(this, lVar, eVar, vVar, function1, function0, function12);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B, C> Disposable mo86224a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, SubscriptionConfig<Tuple3<A, B, C>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87833a(this, lVar, eVar, eVar2, eVar3, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B, C, D> Disposable mo86225a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, KProperty1<S, ? extends D> eVar4, SubscriptionConfig<Tuple4<A, B, C, D>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(eVar4, "prop4");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87834a(this, lVar, eVar, eVar2, eVar3, eVar4, vVar, function1);
    }
}
