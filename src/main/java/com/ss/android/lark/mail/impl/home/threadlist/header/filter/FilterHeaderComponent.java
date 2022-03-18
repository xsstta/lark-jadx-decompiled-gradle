package com.ss.android.lark.mail.impl.home.threadlist.header.filter;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
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
import com.ss.android.lark.mail.impl.home.DelayLoadComponent;
import com.ss.android.lark.mail.impl.home.threadlist.header.HeaderComponentViewGetter;
import com.ss.android.lark.mail.impl.p2165d.C42042c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001\u0013B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/filter/FilterHeaderComponent;", "Lcom/ss/android/lark/mail/impl/home/DelayLoadComponent;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/filter/FilterState;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/filter/FilterHeaderViewModel;", "Lcom/larksuite/arch/jack/JackView;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/HeaderComponentViewGetter;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "mBinding", "Lcom/ss/android/lark/mail/impl/databinding/MailHomeFilterTipsLayoutBinding;", "viewStub", "Landroid/view/ViewStub;", "getInitView", "Landroid/view/View;", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "onDelayInit", "", "Companion", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.filter.a */
public final class FilterHeaderComponent extends DelayLoadComponent<FilterState, FilterHeaderViewModel> implements JackView, HeaderComponentViewGetter {

    /* renamed from: d */
    public static final Companion f108587d = new Companion(null);

    /* renamed from: b */
    public C42042c f108588b;

    /* renamed from: c */
    public final ViewStub f108589c;

    /* renamed from: e */
    private final Fragment f108590e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/filter/FilterHeaderComponent$Companion;", "", "()V", "COMPONENT_HEIGHT", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.filter.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
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
        return this.f108589c;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.f108590e.getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "fragment.lifecycle");
        return lifecycle;
    }

    @Override // com.ss.android.lark.mail.impl.home.DelayLoadComponent
    /* renamed from: d */
    public void mo152510d() {
        ISubscriber.C24024a.m87808a(this, getValue(), (SubscriptionConfig) null, new C42674b(this), 1, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/filter/FilterState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.filter.a$b */
    static final class C42674b extends Lambda implements Function1<FilterState, Unit> {
        final /* synthetic */ FilterHeaderComponent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42674b(FilterHeaderComponent aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FilterState bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(FilterState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            if (bVar.mo153308a()) {
                C42042c cVar = this.this$0.f108588b;
                if (cVar != null) {
                    FrameLayout a = cVar.mo151057a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "it.root");
                    a.setVisibility(0);
                    return;
                }
                FilterHeaderComponent aVar = this.this$0;
                aVar.f108588b = C42042c.m167229a(aVar.f108589c.inflate());
                return;
            }
            C42042c cVar2 = this.this$0.f108588b;
            if (cVar2 != null) {
                FrameLayout a2 = cVar2.mo151057a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "it.root");
                a2.setVisibility(8);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FilterHeaderComponent(androidx.fragment.app.Fragment r12) {
        /*
            r11 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
            androidx.lifecycle.ak r2 = r12.getViewModelStore()
            java.lang.String r0 = "fragment.viewModelStore"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r0)
            androidx.lifecycle.ai$b r3 = r12.getDefaultViewModelProviderFactory()
            java.lang.String r0 = "fragment.defaultViewModelProviderFactory"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r0)
            java.lang.Class<com.ss.android.lark.mail.impl.home.threadlist.header.filter.FilterHeaderViewModel> r0 = com.ss.android.lark.mail.impl.home.threadlist.header.filter.FilterHeaderViewModel.class
            kotlin.reflect.KClass r4 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
            r5 = 0
            r7 = 0
            r9 = 24
            r10 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r7, r9, r10)
            r11.f108590e = r12
            android.view.ViewStub r0 = new android.view.ViewStub
            android.content.Context r12 = r12.getContext()
            r0.<init>(r12)
            r12 = 2131494797(0x7f0c078d, float:1.8613113E38)
            r0.setLayoutResource(r12)
            android.view.ViewGroup$LayoutParams r12 = new android.view.ViewGroup$LayoutParams
            r1 = 1108344832(0x42100000, float:36.0)
            int r1 = com.ss.android.lark.utils.UIHelper.dp2px(r1)
            r2 = -1
            r12.<init>(r2, r1)
            r0.setLayoutParams(r12)
            r11.f108589c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.home.threadlist.header.filter.FilterHeaderComponent.<init>(androidx.fragment.app.Fragment):void");
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State> Disposable mo86220a(JackViewModel<S> lVar, SubscriptionConfig<S> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87829a(this, lVar, vVar, function1);
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
