package com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox;

import android.view.View;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
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
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.home.DelayLoadComponent;
import com.ss.android.lark.mail.impl.home.threadlist.header.HeaderComponentViewGetter;
import com.ss.android.lark.mail.impl.p2165d.C42045f;
import com.ss.android.lark.mail.impl.service.C43362e;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43313a;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43335w;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.utils.C57782ag;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001\u001eB\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0007R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/smartinbox/SmartInboxComponent;", "Lcom/ss/android/lark/mail/impl/home/DelayLoadComponent;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/smartinbox/SmartInboxState;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/smartinbox/SmartInboxViewModel;", "Lcom/larksuite/arch/jack/JackView;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/HeaderComponentViewGetter;", "Landroidx/lifecycle/LifecycleObserver;", "Lcom/ss/android/lark/mail/impl/service/watchers/rustwatchers/AccountChangeWatcher;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "mBinding", "Lcom/ss/android/lark/mail/impl/databinding/MailHomeSmartinboxCardLayoutBinding;", "viewStub", "Landroid/view/ViewStub;", "watcher", "Lcom/ss/android/lark/mail/impl/service/watchers/rustwatchers/SmartInboxWatcher;", "getAttachVisibleView", "Landroid/view/View;", "getInitView", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "onAccountChange", "", "account", "Lcom/ss/android/lark/mail/impl/entity/EmailAccount;", "rustPush", "", "onDelayInit", "onDestroy", "Companion", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SmartInboxComponent extends DelayLoadComponent<SmartInboxState, SmartInboxViewModel> implements LifecycleObserver, JackView, HeaderComponentViewGetter, AbstractC43313a {

    /* renamed from: d */
    public static final Companion f108592d = new Companion(null);

    /* renamed from: b */
    public C42045f f108593b;

    /* renamed from: c */
    public final ViewStub f108594c;

    /* renamed from: e */
    private final AbstractC43335w f108595e = new C42684g(this);

    /* renamed from: f */
    private final Fragment f108596f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/smartinbox/SmartInboxComponent$Companion;", "", "()V", "TAG", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxComponent$a */
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
        return this.f108594c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxComponent$b */
    static final class RunnableC42675b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SmartInboxComponent f108597a;

        RunnableC42675b(SmartInboxComponent smartInboxComponent) {
            this.f108597a = smartInboxComponent;
        }

        public final void run() {
            ((SmartInboxViewModel) this.f108597a.getValue()).requestSmartInboxCard();
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.f108596f.getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "fragment.lifecycle");
        return lifecycle;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        Watchers.m167209b(this.f108595e);
        Watchers.m167209b(this);
    }

    /* renamed from: e */
    public final View mo153313e() {
        C42045f fVar = this.f108593b;
        if (fVar == null) {
            return null;
        }
        RelativeLayout a = fVar.mo151060a();
        Intrinsics.checkExpressionValueIsNotNull(a, "it.root");
        if (a.isAttachedToWindow()) {
            return fVar.mo151060a();
        }
        return null;
    }

    @Override // com.ss.android.lark.mail.impl.home.DelayLoadComponent
    /* renamed from: d */
    public void mo152510d() {
        ISubscriber.C24024a.m87808a(this, getValue(), (SubscriptionConfig) null, new C42676c(this), 1, (Object) null);
        Log.m165389i("SmartInboxComponent", "testSmartInbox init observeForever:");
        C43362e a = C43362e.m172201a();
        Intrinsics.checkExpressionValueIsNotNull(a, "EngagementSettingService.getInstance()");
        a.mo155091f().mo5923a(this.f108596f, new C42680e(this));
        C43362e a2 = C43362e.m172201a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "EngagementSettingService.getInstance()");
        a2.mo155092g().mo5923a(this.f108596f, new C42682f(this));
        C43374f f = C43374f.m172264f();
        Intrinsics.checkExpressionValueIsNotNull(f, "MailAggregationService.getInstance()");
        f.mo155131s().mo5923a(this.f108596f, new C42679d(this));
        Lifecycle lifecycle = this.f108596f.getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "fragment.lifecycle");
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            Watchers.m167206a(this.f108595e);
            Watchers.m167206a(this);
            this.f108596f.getLifecycle().addObserver(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/smartinbox/SmartInboxState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxComponent$c */
    static final class C42676c extends Lambda implements Function1<SmartInboxState, Unit> {
        final /* synthetic */ SmartInboxComponent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42676c(SmartInboxComponent smartInboxComponent) {
            super(1);
            this.this$0 = smartInboxComponent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SmartInboxState bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/mail/impl/home/threadlist/header/smartinbox/SmartInboxComponent$onDelayInit$1$2$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxComponent$c$a */
        public static final class View$OnClickListenerC42677a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C42676c f108598a;

            /* renamed from: b */
            final /* synthetic */ SmartInboxState f108599b;

            View$OnClickListenerC42677a(C42676c cVar, SmartInboxState bVar) {
                this.f108598a = cVar;
                this.f108599b = bVar;
            }

            public final void onClick(View view) {
                ((SmartInboxViewModel) this.f108598a.this$0.getValue()).closeSmartInboxCard();
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/mail/impl/home/threadlist/header/smartinbox/SmartInboxComponent$onDelayInit$1$2$2"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxComponent$c$b */
        public static final class View$OnClickListenerC42678b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C42676c f108600a;

            /* renamed from: b */
            final /* synthetic */ SmartInboxState f108601b;

            View$OnClickListenerC42678b(C42676c cVar, SmartInboxState bVar) {
                this.f108600a = cVar;
                this.f108601b = bVar;
            }

            public final void onClick(View view) {
                ((SmartInboxViewModel) this.f108600a.this$0.getValue()).clickCard();
                ((SmartInboxViewModel) this.f108600a.this$0.getValue()).closeSmartInboxCard();
            }
        }

        public final void invoke(SmartInboxState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            if (!bVar.mo153343a() || ((bVar.mo153344b() != 1 || !C57782ag.m224242a(bVar.mo153346d(), "OTHER")) && (bVar.mo153344b() != 2 || !C57782ag.m224242a(bVar.mo153346d(), "IMPORTANT")))) {
                C42045f fVar = this.this$0.f108593b;
                if (fVar != null) {
                    RelativeLayout a = fVar.mo151060a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "it.root");
                    a.setVisibility(8);
                    return;
                }
                return;
            }
            if (this.this$0.f108593b == null) {
                SmartInboxComponent smartInboxComponent = this.this$0;
                smartInboxComponent.f108593b = C42045f.m167235a(smartInboxComponent.f108594c.inflate());
                Unit unit = Unit.INSTANCE;
            }
            Log.m165389i("SmartInboxComponent", "SmartInboxViewModel bindSmartInboxCardViewHolder show " + bVar.mo153344b());
            C42045f fVar2 = this.this$0.f108593b;
            if (fVar2 != null) {
                RelativeLayout a2 = fVar2.mo151060a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "it.root");
                a2.setVisibility(0);
                if (bVar.mo153344b() == 2) {
                    fVar2.f106698e.setImageResource(R.drawable.ud_icon_inbox_outlined);
                    fVar2.f106699f.setText(R.string.Mail_SmartInbox_Others);
                } else {
                    fVar2.f106698e.setImageResource(R.drawable.ud_icon_priority_outlined);
                    fVar2.f106699f.setText(R.string.Mail_SmartInbox_Important);
                }
                TextView textView = fVar2.f106696c;
                Intrinsics.checkExpressionValueIsNotNull(textView, "it.mailSmartinboxCardFrom");
                textView.setText(bVar.mo153345c());
                fVar2.f106694a.setOnClickListener(new View$OnClickListenerC42677a(this, bVar));
                fVar2.mo151060a().setOnClickListener(new View$OnClickListenerC42678b(this, bVar));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxComponent$e */
    static final class C42680e<T> implements AbstractC1178x<Long> {

        /* renamed from: a */
        final /* synthetic */ SmartInboxComponent f108603a;

        C42680e(SmartInboxComponent smartInboxComponent) {
            this.f108603a = smartInboxComponent;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1178x
        public /* synthetic */ void onChanged(Long l) {
            mo153320a(l.longValue());
        }

        /* renamed from: a */
        public final void mo153320a(long j) {
            Log.m165389i("SmartInboxComponent", "testSmartInbox change importantTimeStamp:");
            C43374f f = C43374f.m172264f();
            Intrinsics.checkExpressionValueIsNotNull(f, "MailAggregationService.getInstance()");
            if (Intrinsics.areEqual("OTHER", f.mo155129q())) {
                C43849u.m173827a(new Runnable(this) {
                    /* class com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxComponent.C42680e.RunnableC426811 */

                    /* renamed from: a */
                    final /* synthetic */ C42680e f108604a;

                    {
                        this.f108604a = r1;
                    }

                    public final void run() {
                        ((SmartInboxViewModel) this.f108604a.f108603a.getValue()).requestSmartInboxCard();
                    }
                }, 200);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxComponent$f */
    static final class C42682f<T> implements AbstractC1178x<Long> {

        /* renamed from: a */
        final /* synthetic */ SmartInboxComponent f108605a;

        C42682f(SmartInboxComponent smartInboxComponent) {
            this.f108605a = smartInboxComponent;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1178x
        public /* synthetic */ void onChanged(Long l) {
            mo153322a(l.longValue());
        }

        /* renamed from: a */
        public final void mo153322a(long j) {
            Log.m165389i("SmartInboxComponent", "testSmartInbox change otherTimeStamp:");
            C43374f f = C43374f.m172264f();
            Intrinsics.checkExpressionValueIsNotNull(f, "MailAggregationService.getInstance()");
            if (Intrinsics.areEqual("IMPORTANT", f.mo155129q())) {
                C43849u.m173827a(new Runnable(this) {
                    /* class com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxComponent.C42682f.RunnableC426831 */

                    /* renamed from: a */
                    final /* synthetic */ C42682f f108606a;

                    {
                        this.f108606a = r1;
                    }

                    public final void run() {
                        ((SmartInboxViewModel) this.f108606a.f108605a.getValue()).requestSmartInboxCard();
                    }
                }, 200);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mail/impl/entity/MailLabelEntity;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxComponent$d */
    static final class C42679d<T> implements AbstractC1178x<MailLabelEntity> {

        /* renamed from: a */
        final /* synthetic */ SmartInboxComponent f108602a;

        C42679d(SmartInboxComponent smartInboxComponent) {
            this.f108602a = smartInboxComponent;
        }

        /* renamed from: a */
        public final void onChanged(MailLabelEntity mailLabelEntity) {
            String str;
            SmartInboxViewModel smartInboxViewModel = (SmartInboxViewModel) this.f108602a.getValue();
            if (mailLabelEntity == null || (str = mailLabelEntity.mo151527k()) == null) {
                str = "";
            }
            smartInboxViewModel.setCurrentLabel(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "smart_label", "", "kotlin.jvm.PlatformType", "onPreviewCardChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxComponent$g */
    static final class C42684g implements AbstractC43335w {

        /* renamed from: a */
        final /* synthetic */ SmartInboxComponent f108607a;

        C42684g(SmartInboxComponent smartInboxComponent) {
            this.f108607a = smartInboxComponent;
        }

        @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43335w
        /* renamed from: a */
        public final void mo153324a(String str) {
            Log.m165389i("SmartInboxComponent", "SmartInboxViewModel onPreviewCardChange smart_label:" + str);
            Intrinsics.checkExpressionValueIsNotNull(str, "smart_label");
            ((SmartInboxViewModel) this.f108607a.getValue()).updatePreviewCard(str);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SmartInboxComponent(androidx.fragment.app.Fragment r12) {
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
            java.lang.Class<com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxViewModel> r0 = com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxViewModel.class
            kotlin.reflect.KClass r4 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
            r5 = 0
            r7 = 0
            r9 = 24
            r10 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r7, r9, r10)
            r11.f108596f = r12
            android.view.ViewStub r0 = new android.view.ViewStub
            android.content.Context r12 = r12.getContext()
            r0.<init>(r12)
            r12 = 2131494803(0x7f0c0793, float:1.8613125E38)
            r0.setLayoutResource(r12)
            android.view.ViewGroup$LayoutParams r12 = new android.view.ViewGroup$LayoutParams
            r1 = 2131165989(0x7f070325, float:1.794621E38)
            int r1 = com.ss.android.lark.utils.UIHelper.getDimens(r1)
            r2 = -1
            r12.<init>(r2, r1)
            r0.setLayoutParams(r12)
            r11.f108594c = r0
            com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxComponent$g r12 = new com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxComponent$g
            r12.<init>(r11)
            com.ss.android.lark.mail.impl.service.b.a.w r12 = (com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43335w) r12
            r11.f108595e = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxComponent.<init>(androidx.fragment.app.Fragment):void");
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43313a
    /* renamed from: a */
    public void mo153312a(C42093e eVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(eVar, "account");
        C43849u.m173827a(new RunnableC42675b(this), 200);
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
