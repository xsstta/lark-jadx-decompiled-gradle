package com.ss.android.lark.mail.impl.home.threadlist.header.status.migration;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.larksuite.component.universe_design.progress.UDProgress;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.client.C41900f;
import com.ss.android.lark.mail.impl.entity.C42087a;
import com.ss.android.lark.mail.impl.entity.MigrationItem;
import com.ss.android.lark.mail.impl.entity.MigrationStage;
import com.ss.android.lark.mail.impl.entity.UserType;
import com.ss.android.lark.mail.impl.home.DelayLoadComponent;
import com.ss.android.lark.mail.impl.home.threadlist.header.status.IStatusHeader;
import com.ss.android.lark.mail.impl.home.threadlist.header.status.IStatusHeaderRefresher;
import com.ss.android.lark.mail.impl.p2165d.C42043d;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43362e;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty1;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001 B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0016J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/migration/MigrationTipsComponent;", "Lcom/ss/android/lark/mail/impl/home/DelayLoadComponent;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/migration/MigrationState;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/migration/MigrationTipsViewModel;", "Lcom/larksuite/arch/jack/JackView;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/IStatusHeader;", "fragment", "Landroidx/fragment/app/Fragment;", "refresher", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/IStatusHeaderRefresher;", "mCurrentVisibility", "", "(Landroidx/fragment/app/Fragment;Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/IStatusHeaderRefresher;Z)V", "getMCurrentVisibility", "()Z", "setMCurrentVisibility", "(Z)V", "mMigrationBinding", "Lcom/ss/android/lark/mail/impl/databinding/MailHomeMigrationTipLayoutBinding;", "viewStub", "Landroid/view/ViewStub;", "bindMigrationHolder", "", "migrationItem", "Lcom/ss/android/lark/mail/impl/entity/MigrationItem;", "getInitView", "Landroid/view/View;", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "onDelayInit", "setViewVisibility", "show", "Companion", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.b.b */
public final class MigrationTipsComponent extends DelayLoadComponent<MigrationState, MigrationTipsViewModel> implements JackView, IStatusHeader {

    /* renamed from: e */
    public static final Companion f108550e = new Companion(null);

    /* renamed from: b */
    public C42043d f108551b;

    /* renamed from: c */
    public final Fragment f108552c;

    /* renamed from: d */
    public final IStatusHeaderRefresher f108553d;

    /* renamed from: f */
    private final ViewStub f108554f;

    /* renamed from: g */
    private boolean f108555g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/migration/MigrationTipsComponent$Companion;", "", "()V", "COMPONENT_HEIGHT", "", "TAG", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.header.status.IStatusHeader
    /* renamed from: e */
    public boolean mo153243e() {
        return this.f108555g;
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
        return this.f108554f;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.f108552c.getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "fragment.lifecycle");
        return lifecycle;
    }

    @Override // com.ss.android.lark.mail.impl.home.DelayLoadComponent
    /* renamed from: d */
    public void mo152510d() {
        ISubscriber.C24024a.m87808a(this, getValue(), (SubscriptionConfig) null, new C42655c(this), 1, (Object) null);
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.header.status.IStatusHeader
    /* renamed from: a */
    public void mo153241a(boolean z) {
        this.f108555g = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/migration/MigrationState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.b.b$c */
    static final class C42655c extends Lambda implements Function1<MigrationState, Unit> {
        final /* synthetic */ MigrationTipsComponent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42655c(MigrationTipsComponent bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MigrationState aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MigrationState aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            if (C41900f.m166387a(aVar.mo153261a())) {
                this.this$0.f108553d.mo153260a(this.this$0, true);
            } else {
                this.this$0.f108553d.mo153260a(this.this$0, false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/migration/MigrationState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.b.b$d */
    static final class C42656d extends Lambda implements Function1<MigrationState, Unit> {
        final /* synthetic */ MigrationTipsComponent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42656d(MigrationTipsComponent bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MigrationState aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MigrationState aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "it");
            if (this.this$0.mo153243e()) {
                this.this$0.mo153266a(aVar.mo153261a());
                return;
            }
            C42043d dVar = this.this$0.f108551b;
            if (dVar != null) {
                ConstraintLayout a = dVar.mo151058a();
                Intrinsics.checkExpressionValueIsNotNull(a, "it.root");
                a.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/mail/impl/home/threadlist/header/status/migration/MigrationTipsComponent$bindMigrationHolder$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.b.b$b */
    public static final class View$OnClickListenerC42653b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MigrationTipsComponent f108556a;

        /* renamed from: b */
        final /* synthetic */ MigrationItem f108557b;

        View$OnClickListenerC42653b(MigrationTipsComponent bVar, MigrationItem mVar) {
            this.f108556a = bVar;
            this.f108557b = mVar;
        }

        public final void onClick(View view) {
            C41900f.m166388b(this.f108556a.f108552c.getContext(), this.f108557b, new OnSingleClickListener() {
                /* class com.ss.android.lark.mail.impl.home.threadlist.header.status.migration.MigrationTipsComponent.View$OnClickListenerC42653b.C426541 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    Log.m165389i("MigrationTipsComponent", "MigrationTipView onSingleClick");
                }
            });
        }
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.header.status.IStatusHeader
    /* renamed from: b */
    public void mo153242b(boolean z) {
        if (z) {
            ((MigrationTipsViewModel) getValue()).withState(new C42656d(this));
            return;
        }
        C42043d dVar = this.f108551b;
        if (dVar != null) {
            ConstraintLayout a = dVar.mo151058a();
            Intrinsics.checkExpressionValueIsNotNull(a, "it.root");
            a.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo153266a(MigrationItem mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "migrationItem");
        if (this.f108551b == null) {
            this.f108551b = C42043d.m167231a(this.f108554f.inflate());
            Unit unit = Unit.INSTANCE;
        }
        C42043d dVar = this.f108551b;
        if (dVar != null) {
            C43362e a = C43362e.m172201a();
            Intrinsics.checkExpressionValueIsNotNull(a, "EngagementSettingService.getInstance()");
            if (!a.mo155093h()) {
                ConstraintLayout a2 = dVar.mo151058a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "it.root");
                a2.setVisibility(8);
            } else if (C43362e.m172201a().mo155084a(mVar)) {
                ConstraintLayout a3 = dVar.mo151058a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "it.root");
                a3.setVisibility(0);
                if (mVar.mo151996b() == MigrationStage.TERMINATED) {
                    UDProgress uDProgress = dVar.f106689b;
                    Intrinsics.checkExpressionValueIsNotNull(uDProgress, "it.mailMigrationProgress");
                    uDProgress.setVisibility(8);
                    TextView textView = dVar.f106688a;
                    Intrinsics.checkExpressionValueIsNotNull(textView, "it.mailMigrationDetail");
                    textView.setVisibility(8);
                    dVar.f106691d.setImageResource(R.drawable.ud_icon_error_colorful);
                    ConstraintLayout a4 = dVar.mo151058a();
                    Context requireContext = this.f108552c.requireContext();
                    Intrinsics.checkExpressionValueIsNotNull(requireContext, "fragment.requireContext()");
                    a4.setBackgroundColor(requireContext.getResources().getColor(R.color.function_danger_100));
                } else {
                    UDProgress uDProgress2 = dVar.f106689b;
                    Intrinsics.checkExpressionValueIsNotNull(uDProgress2, "it.mailMigrationProgress");
                    uDProgress2.setVisibility(0);
                    TextView textView2 = dVar.f106688a;
                    Intrinsics.checkExpressionValueIsNotNull(textView2, "it.mailMigrationDetail");
                    textView2.setVisibility(0);
                    dVar.f106691d.setImageResource(R.drawable.ud_icon_info_colorful);
                    ConstraintLayout a5 = dVar.mo151058a();
                    Context requireContext2 = this.f108552c.requireContext();
                    Intrinsics.checkExpressionValueIsNotNull(requireContext2, "fragment.requireContext()");
                    a5.setBackgroundColor(requireContext2.getResources().getColor(R.color.function_info_100));
                }
                dVar.mo151058a().setOnClickListener(new View$OnClickListenerC42653b(this, mVar));
                int c = mVar.mo151997c();
                if (mVar.mo151996b() == MigrationStage.DONE || mVar.mo151996b() == MigrationStage.DONE_WITH_ERROR) {
                    c = 100;
                }
                C43277a a6 = C43277a.m171921a();
                Intrinsics.checkExpressionValueIsNotNull(a6, "AccountService.getInstance()");
                C42087a m = a6.mo154949m();
                if (m == null || !(UserType.EXCHANGE_API_CLIENT == m.mo151815f() || UserType.GMAIL_API_CLIENT == m.mo151815f())) {
                    TextView textView3 = dVar.f106690c;
                    String a7 = C43819s.m173684a((int) R.string.Mail_Migration_ProgressText);
                    Intrinsics.checkExpressionValueIsNotNull(a7, "StringUtils.getString(R.…l_Migration_ProgressText)");
                    textView3.setText(StringsKt.replace$default(a7, "{{percentage}}", String.valueOf(c), false, 4, (Object) null));
                } else {
                    TextView textView4 = dVar.f106690c;
                    String a8 = C43819s.m173684a((int) R.string.Mail_Migration_MailMovingMobile);
                    Intrinsics.checkExpressionValueIsNotNull(a8, "StringUtils.getString(R.…gration_MailMovingMobile)");
                    textView4.setText(StringsKt.replace$default(a8, "{{Number}}", String.valueOf(c), false, 4, (Object) null));
                }
                UDProgress uDProgress3 = dVar.f106689b;
                Intrinsics.checkExpressionValueIsNotNull(uDProgress3, "it.mailMigrationProgress");
                uDProgress3.setProgress(c);
            } else {
                C41900f.m166381a();
                ConstraintLayout a9 = dVar.mo151058a();
                Intrinsics.checkExpressionValueIsNotNull(a9, "it.root");
                a9.setVisibility(8);
            }
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
    public MigrationTipsComponent(androidx.fragment.app.Fragment r12, com.ss.android.lark.mail.impl.home.threadlist.header.status.IStatusHeaderRefresher r13, boolean r14) {
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
            java.lang.Class<com.ss.android.lark.mail.impl.home.threadlist.header.b.b.c> r0 = com.ss.android.lark.mail.impl.home.threadlist.header.status.migration.MigrationTipsViewModel.class
            kotlin.reflect.KClass r4 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
            r5 = 0
            r7 = 0
            r9 = 24
            r10 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r7, r9, r10)
            r11.f108552c = r12
            r11.f108553d = r13
            r11.f108555g = r14
            android.view.ViewStub r13 = new android.view.ViewStub
            android.content.Context r12 = r12.getContext()
            r13.<init>(r12)
            r12 = 2131494799(0x7f0c078f, float:1.8613117E38)
            r13.setLayoutResource(r12)
            android.view.ViewGroup$LayoutParams r12 = new android.view.ViewGroup$LayoutParams
            r14 = 1111490560(0x42400000, float:48.0)
            int r14 = com.ss.android.lark.utils.UIHelper.dp2px(r14)
            r0 = -1
            r12.<init>(r0, r14)
            r13.setLayoutParams(r12)
            r11.f108554f = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.home.threadlist.header.status.migration.MigrationTipsComponent.<init>(androidx.fragment.app.Fragment, com.ss.android.lark.mail.impl.home.threadlist.header.b.b, boolean):void");
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
    public /* synthetic */ MigrationTipsComponent(Fragment fragment, IStatusHeaderRefresher bVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
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
