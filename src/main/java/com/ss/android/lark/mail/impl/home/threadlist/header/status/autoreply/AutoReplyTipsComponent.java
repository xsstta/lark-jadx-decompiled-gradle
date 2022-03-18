package com.ss.android.lark.mail.impl.home.threadlist.header.status.autoreply;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
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
import com.larksuite.component.universe_design.notice.UDNotice;
import com.ss.android.lark.mail.impl.home.DelayLoadComponent;
import com.ss.android.lark.mail.impl.home.threadlist.header.status.IStatusHeader;
import com.ss.android.lark.mail.impl.home.threadlist.header.status.IStatusHeaderRefresher;
import com.ss.android.lark.mail.impl.p2165d.C42046g;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.C43277a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/autoreply/AutoReplyTipsComponent;", "Lcom/ss/android/lark/mail/impl/home/DelayLoadComponent;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/autoreply/AutoReplyState;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/autoreply/AutoReplyTipsViewModel;", "Lcom/larksuite/arch/jack/JackView;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/IStatusHeader;", "fragment", "Landroidx/fragment/app/Fragment;", "refresher", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/IStatusHeaderRefresher;", "mCurrentVisibility", "", "(Landroidx/fragment/app/Fragment;Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/IStatusHeaderRefresher;Z)V", "mAutoReplayBinding", "Lcom/ss/android/lark/mail/impl/databinding/MailHomeStatusAutoreplyBinding;", "getMCurrentVisibility", "()Z", "setMCurrentVisibility", "(Z)V", "viewStub", "Landroid/view/ViewStub;", "getInitView", "Landroid/view/View;", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "onDelayInit", "", "setViewVisibility", "show", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.a.b */
public final class AutoReplyTipsComponent extends DelayLoadComponent<AutoReplyState, AutoReplyTipsViewModel> implements JackView, IStatusHeader {

    /* renamed from: b */
    public final Fragment f108542b;

    /* renamed from: c */
    public final IStatusHeaderRefresher f108543c;

    /* renamed from: d */
    private final ViewStub f108544d;

    /* renamed from: e */
    private C42046g f108545e;

    /* renamed from: f */
    private boolean f108546f;

    @Override // com.ss.android.lark.mail.impl.home.threadlist.header.status.IStatusHeader
    /* renamed from: e */
    public boolean mo153243e() {
        return this.f108546f;
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

    @Override // com.ss.android.lark.mail.impl.home.threadlist.header.HeaderComponentViewGetter
    /* renamed from: c */
    public View mo153210c() {
        return this.f108544d;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.f108542b.getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "fragment.lifecycle");
        return lifecycle;
    }

    @Override // com.ss.android.lark.mail.impl.home.DelayLoadComponent
    /* renamed from: d */
    public void mo152510d() {
        ISubscriber.C24024a.m87808a(this, getValue(), (SubscriptionConfig) null, new C42647a(this), 1, (Object) null);
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.header.status.IStatusHeader
    /* renamed from: a */
    public void mo153241a(boolean z) {
        this.f108546f = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/autoreply/AutoReplyState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.a.b$a */
    static final class C42647a extends Lambda implements Function1<AutoReplyState, Unit> {
        final /* synthetic */ AutoReplyTipsComponent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42647a(AutoReplyTipsComponent bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AutoReplyState aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(AutoReplyState aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            long currentTimeMillis = System.currentTimeMillis();
            if (aVar.mo153248d() || !aVar.mo153245a() || aVar.mo153246b() > currentTimeMillis || currentTimeMillis >= aVar.mo153247c()) {
                this.this$0.f108543c.mo153260a(this.this$0, false);
            } else {
                this.this$0.f108543c.mo153260a(this.this$0, true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/mail/impl/home/threadlist/header/status/autoreply/AutoReplyTipsComponent$setViewVisibility$1$1$1", "com/ss/android/lark/mail/impl/home/threadlist/header/status/autoreply/AutoReplyTipsComponent$$special$$inlined$apply$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.a.b$b */
    static final class View$OnClickListenerC42648b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AutoReplyTipsComponent f108547a;

        View$OnClickListenerC42648b(AutoReplyTipsComponent bVar) {
            this.f108547a = bVar;
        }

        public final void onClick(View view) {
            Context context = this.f108547a.f108542b.getContext();
            C43277a a = C43277a.m171921a();
            Intrinsics.checkExpressionValueIsNotNull(a, "AccountService.getInstance()");
            C42699a.m170287g(context, a.mo154950n());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/mail/impl/home/threadlist/header/status/autoreply/AutoReplyTipsComponent$setViewVisibility$1$1$2", "com/ss/android/lark/mail/impl/home/threadlist/header/status/autoreply/AutoReplyTipsComponent$$special$$inlined$apply$lambda$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.a.b$c */
    static final class View$OnClickListenerC42649c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AutoReplyTipsComponent f108548a;

        View$OnClickListenerC42649c(AutoReplyTipsComponent bVar) {
            this.f108548a = bVar;
        }

        public final void onClick(View view) {
            Context context = this.f108548a.f108542b.getContext();
            C43277a a = C43277a.m171921a();
            Intrinsics.checkExpressionValueIsNotNull(a, "AccountService.getInstance()");
            C42699a.m170287g(context, a.mo154950n());
        }
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.header.status.IStatusHeader
    /* renamed from: b */
    public void mo153242b(boolean z) {
        if (z) {
            if (this.f108545e == null) {
                C42046g a = C42046g.m167237a(this.f108544d.inflate());
                Drawable icon = a.mo151061a().getIcon();
                if (icon != null) {
                    icon.setTintList(null);
                }
                a.mo151061a().setOnClickListener(new View$OnClickListenerC42648b(this));
                a.mo151061a().setTextButtonListener(new View$OnClickListenerC42649c(this));
                this.f108545e = a;
                Unit unit = Unit.INSTANCE;
            }
            C42046g gVar = this.f108545e;
            if (gVar != null) {
                UDNotice a2 = gVar.mo151061a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "it.root");
                a2.setVisibility(0);
                return;
            }
            return;
        }
        C42046g gVar2 = this.f108545e;
        if (gVar2 != null) {
            UDNotice a3 = gVar2.mo151061a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "it.root");
            a3.setVisibility(8);
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

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AutoReplyTipsComponent(androidx.fragment.app.Fragment r12, com.ss.android.lark.mail.impl.home.threadlist.header.status.IStatusHeaderRefresher r13, boolean r14) {
        /*
            r11 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
            java.lang.String r0 = "refresher"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r13, r0)
            androidx.lifecycle.ak r2 = r12.getViewModelStore()
            java.lang.String r0 = "fragment.viewModelStore"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r0)
            androidx.lifecycle.ai$b r3 = r12.getDefaultViewModelProviderFactory()
            java.lang.String r0 = "fragment.defaultViewModelProviderFactory"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r0)
            java.lang.Class<com.ss.android.lark.mail.impl.home.threadlist.header.b.a.c> r0 = com.ss.android.lark.mail.impl.home.threadlist.header.status.autoreply.AutoReplyTipsViewModel.class
            kotlin.reflect.KClass r4 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
            r5 = 0
            r7 = 0
            r9 = 24
            r10 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r7, r9, r10)
            r11.f108542b = r12
            r11.f108543c = r13
            r11.f108546f = r14
            android.view.ViewStub r13 = new android.view.ViewStub
            android.content.Context r12 = r12.getContext()
            r13.<init>(r12)
            r12 = 2131494804(0x7f0c0794, float:1.8613127E38)
            r13.setLayoutResource(r12)
            android.view.ViewGroup$LayoutParams r12 = new android.view.ViewGroup$LayoutParams
            r14 = -1
            r0 = -2
            r12.<init>(r14, r0)
            r13.setLayoutParams(r12)
            r11.f108544d = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.home.threadlist.header.status.autoreply.AutoReplyTipsComponent.<init>(androidx.fragment.app.Fragment, com.ss.android.lark.mail.impl.home.threadlist.header.b.b, boolean):void");
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AutoReplyTipsComponent(Fragment fragment, IStatusHeaderRefresher bVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, bVar, (i & 4) != 0 ? false : z);
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
