package com.ss.android.lark.mail.impl.home.threadlist.header.outbox;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
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
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.home.DelayLoadComponent;
import com.ss.android.lark.mail.impl.home.threadlist.header.HeaderComponentViewGetter;
import com.ss.android.lark.mail.impl.p2165d.C42044e;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.utils.C43819s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001\u001fB\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0002H\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/outbox/OutboxHeaderComponent;", "Lcom/ss/android/lark/mail/impl/home/DelayLoadComponent;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/outbox/OutboxState;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/outbox/OutboxHeaderViewModel;", "Lcom/larksuite/arch/jack/JackView;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/HeaderComponentViewGetter;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "mBinding", "Lcom/ss/android/lark/mail/impl/databinding/MailHomeOutboxTipLayoutBinding;", "outboxClickListener", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/outbox/IOutboxClickListener;", "getOutboxClickListener", "()Lcom/ss/android/lark/mail/impl/home/threadlist/header/outbox/IOutboxClickListener;", "setOutboxClickListener", "(Lcom/ss/android/lark/mail/impl/home/threadlist/header/outbox/IOutboxClickListener;)V", "viewStub", "Landroid/view/ViewStub;", "getInitView", "Landroid/view/View;", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "isPrimaryLabel", "", "labelId", "", "isShow", "outboxStatus", "onDelayInit", "", "Companion", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.a.b */
public final class OutboxHeaderComponent extends DelayLoadComponent<OutboxState, OutboxHeaderViewModel> implements JackView, HeaderComponentViewGetter {

    /* renamed from: e */
    public static final Companion f108518e = new Companion(null);

    /* renamed from: b */
    public C42044e f108519b;

    /* renamed from: c */
    public final ViewStub f108520c;

    /* renamed from: d */
    public final Fragment f108521d;

    /* renamed from: f */
    private IOutboxClickListener f108522f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/outbox/OutboxHeaderComponent$Companion;", "", "()V", "COMPONENT_HEIGHT", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: e */
    public final IOutboxClickListener mo153214e() {
        return this.f108522f;
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
        return this.f108520c;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.f108521d.getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "fragment.lifecycle");
        return lifecycle;
    }

    @Override // com.ss.android.lark.mail.impl.home.DelayLoadComponent
    /* renamed from: d */
    public void mo152510d() {
        ISubscriber.C24024a.m87808a(this, getValue(), (SubscriptionConfig) null, new C42639b(this), 1, (Object) null);
        C43374f f = C43374f.m172264f();
        Intrinsics.checkExpressionValueIsNotNull(f, "MailAggregationService.getInstance()");
        f.mo155131s().mo5923a(this.f108521d, new C42642c(this));
        C43374f f2 = C43374f.m172264f();
        Intrinsics.checkExpressionValueIsNotNull(f2, "MailAggregationService.getInstance()");
        String q = f2.mo155129q();
        Intrinsics.checkExpressionValueIsNotNull(q, "MailAggregationService.g…nstance().currentEntityId");
        ((OutboxHeaderViewModel) getValue()).setLabelId(q);
    }

    /* renamed from: a */
    public final void mo153211a(IOutboxClickListener aVar) {
        this.f108522f = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/outbox/OutboxState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.a.b$b */
    static final class C42639b extends Lambda implements Function1<OutboxState, Unit> {
        final /* synthetic */ OutboxHeaderComponent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42639b(OutboxHeaderComponent bVar) {
            super(1);
            this.this$0 = bVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/lark/mail/impl/home/threadlist/header/outbox/OutboxHeaderComponent$onDelayInit$1$1$1$2", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "mail_release", "com/ss/android/lark/mail/impl/home/threadlist/header/outbox/OutboxHeaderComponent$onDelayInit$1$$special$$inlined$apply$lambda$2"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.a.b$b$b */
        public static final class View$OnClickListenerC42641b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C42639b f108524a;

            View$OnClickListenerC42641b(C42639b bVar) {
                this.f108524a = bVar;
            }

            public void onClick(View view) {
                IOutboxClickListener e = this.f108524a.this$0.mo153214e();
                if (e != null) {
                    e.mo152998g();
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OutboxState dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/mail/impl/home/threadlist/header/outbox/OutboxHeaderComponent$onDelayInit$1$1$1$1", "com/ss/android/lark/mail/impl/home/threadlist/header/outbox/OutboxHeaderComponent$onDelayInit$1$$special$$inlined$apply$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.a.b$b$a */
        public static final class View$OnClickListenerC42640a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C42639b f108523a;

            View$OnClickListenerC42640a(C42639b bVar) {
                this.f108523a = bVar;
            }

            public final void onClick(View view) {
                IOutboxClickListener e = this.f108523a.this$0.mo153214e();
                if (e != null) {
                    e.mo152991a("OUTBOX");
                }
            }
        }

        public final void invoke(OutboxState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            if (!dVar.mo153227a() || !this.this$0.mo153213a(dVar.mo153231e()) || !this.this$0.mo153212a(dVar) || dVar.mo153228b() <= 0) {
                C42044e eVar = this.this$0.f108519b;
                if (eVar != null) {
                    UDNotice a = eVar.mo151059a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "it.root");
                    a.setVisibility(8);
                    return;
                }
                return;
            }
            if (this.this$0.f108519b == null) {
                OutboxHeaderComponent bVar = this.this$0;
                C42044e a2 = C42044e.m167233a(bVar.f108520c.inflate());
                a2.mo151059a().setOnClickListener(new View$OnClickListenerC42640a(this));
                a2.mo151059a().setTextButtonListener(new View$OnClickListenerC42641b(this));
                bVar.f108519b = a2;
                Unit unit = Unit.INSTANCE;
            }
            C42044e eVar2 = this.this$0.f108519b;
            if (eVar2 != null) {
                UDNotice a3 = eVar2.mo151059a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "it.root");
                a3.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C43819s.m173684a((int) R.string.Mail_Outbox_Ribbon_Description));
                SpannableString spannableString = new SpannableString(C43819s.m173684a((int) R.string.Mail_Outbox_Outbox));
                spannableString.setSpan(new ForegroundColorSpan(this.this$0.f108521d.getResources().getColor(R.color.lkui_B500)), 0, spannableString.length(), 0);
                spannableStringBuilder.append((CharSequence) spannableString);
                eVar2.mo151059a().setText(spannableStringBuilder);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mail/impl/entity/MailLabelEntity;", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.a.b$c */
    static final class C42642c<T> implements AbstractC1178x<MailLabelEntity> {

        /* renamed from: a */
        final /* synthetic */ OutboxHeaderComponent f108525a;

        C42642c(OutboxHeaderComponent bVar) {
            this.f108525a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(MailLabelEntity mailLabelEntity) {
            String str;
            OutboxHeaderViewModel cVar = (OutboxHeaderViewModel) this.f108525a.getValue();
            if (mailLabelEntity == null || (str = mailLabelEntity.mo151527k()) == null) {
                str = "";
            }
            cVar.setLabelId(str);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OutboxHeaderComponent(androidx.fragment.app.Fragment r12) {
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
            java.lang.Class<com.ss.android.lark.mail.impl.home.threadlist.header.a.c> r0 = com.ss.android.lark.mail.impl.home.threadlist.header.outbox.OutboxHeaderViewModel.class
            kotlin.reflect.KClass r4 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
            r5 = 0
            r7 = 0
            r9 = 24
            r10 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r7, r9, r10)
            r11.f108521d = r12
            android.view.ViewStub r0 = new android.view.ViewStub
            android.content.Context r12 = r12.getContext()
            r0.<init>(r12)
            r12 = 2131494801(0x7f0c0791, float:1.861312E38)
            r0.setLayoutResource(r12)
            android.view.ViewGroup$LayoutParams r12 = new android.view.ViewGroup$LayoutParams
            r1 = 1110704128(0x42340000, float:45.0)
            int r1 = com.ss.android.lark.utils.UIHelper.dp2px(r1)
            r2 = -1
            r12.<init>(r2, r1)
            r0.setLayoutParams(r12)
            r11.f108520c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.home.threadlist.header.outbox.OutboxHeaderComponent.<init>(androidx.fragment.app.Fragment):void");
    }

    /* renamed from: a */
    public final boolean mo153212a(OutboxState dVar) {
        if (dVar.mo153229c() <= 0 || dVar.mo153229c() <= dVar.mo153230d()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo153213a(String str) {
        if (Intrinsics.areEqual("INBOX", str) || Intrinsics.areEqual("IMPORTANT", str)) {
            return true;
        }
        return false;
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
