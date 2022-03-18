package com.ss.android.lark.mail.impl.home.menu;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ee.util.p718t.C13749l;
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
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.framework.ui.p1198b.C26198f;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.guide.ui.config.TextBubbleConfig;
import com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.home.DelayLoadComponent;
import com.ss.android.lark.mail.impl.home.menu.label.C42589a;
import com.ss.android.lark.mail.impl.home.menu.label.MailMenuLabelAdapter;
import com.ss.android.lark.mail.impl.p2165d.C42049j;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.widget.HeaderFooterRecyclerView;
import com.ss.android.lark.utils.DevicePerfUtils;
import com.ss.android.lark.utils.UIHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty1;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007*\u0001\r\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00013B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0012\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0006\u0010\"\u001a\u00020!J\b\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u000bH\u0002J\b\u0010'\u001a\u00020\u001eH\u0002J\b\u0010(\u001a\u00020\u001eH\u0002J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u000bH\u0002J\b\u0010*\u001a\u00020\u001eH\u0016J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-H\u0002J\u0006\u0010.\u001a\u00020\u001eJ\u000e\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u0010J\u0010\u00101\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u000bH\u0002J\b\u00102\u001a\u00020\u001eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u00064"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/menu/MailMenuComponent;", "Lcom/ss/android/lark/mail/impl/home/DelayLoadComponent;", "Lcom/ss/android/lark/mail/impl/home/menu/MailMenuState;", "Lcom/ss/android/lark/mail/impl/home/menu/MailMenuViewModel;", "Lcom/larksuite/arch/jack/JackView;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "mDeviceLevel", "Lcom/ss/android/lark/utils/DevicePerfUtils$DevicePerfLevel;", "mFolderEnable", "", "mFolderManagerOnboadingDelegate", "com/ss/android/lark/mail/impl/home/menu/MailMenuComponent$mFolderManagerOnboadingDelegate$1", "Lcom/ss/android/lark/mail/impl/home/menu/MailMenuComponent$mFolderManagerOnboadingDelegate$1;", "mIMenuCallback", "Lcom/ss/android/lark/mail/impl/home/menu/IMenuCallback;", "mIsInit", "mLKUIStatus", "Lcom/larksuite/component/ui/loading/LKUIStatus;", "mMailMenuLabelAdapter", "Lcom/ss/android/lark/mail/impl/home/menu/label/MailMenuLabelAdapter;", "mShow", "mViewBinding", "Lcom/ss/android/lark/mail/impl/databinding/MailMenuContainerViewBinding;", "getMViewBinding", "()Lcom/ss/android/lark/mail/impl/databinding/MailMenuContainerViewBinding;", "mViewBinding$delegate", "Lkotlin/Lazy;", "clearFolderManagerOnboarding", "", "enqueueFolderManagerOnboarding", "anchorView", "Landroid/view/View;", "getContentView", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "grayBackAlphaAnimate", "isShow", "initLabelMenu", "initView", "menuPopWithAnimate", "onDelayInit", "reportSorting", "labelId", "", "reset", "setMenuCallback", "menuCallback", "showMenu", "updateUI", "Companion", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.menu.c */
public final class MailMenuComponent extends DelayLoadComponent<MailMenuState, MailMenuViewModel> implements JackView {

    /* renamed from: h */
    public static final Companion f108334h = new Companion(null);

    /* renamed from: b */
    public LKUIStatus f108335b;

    /* renamed from: c */
    public MailMenuLabelAdapter f108336c;

    /* renamed from: d */
    public boolean f108337d;

    /* renamed from: e */
    public AbstractC42551b f108338e;

    /* renamed from: f */
    public final C42565m f108339f = new C42565m(this);

    /* renamed from: g */
    public final Fragment f108340g;

    /* renamed from: i */
    private final Lazy f108341i = LazyKt.lazy(new C42566n(this));

    /* renamed from: j */
    private boolean f108342j;

    /* renamed from: k */
    private boolean f108343k;

    /* renamed from: l */
    private final DevicePerfUtils.DevicePerfLevel f108344l;

    /* renamed from: e */
    public final C42049j mo153032e() {
        return (C42049j) this.f108341i.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/menu/MailMenuComponent$Companion;", "", "()V", "LOADING_HEIGHT", "", "TAG", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.mail.impl.home.DelayLoadComponent
    /* renamed from: d */
    public void mo152510d() {
        m169835i();
    }

    /* renamed from: f */
    public final void mo153033f() {
        m169837k();
    }

    /* renamed from: a */
    public final void mo153029a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Label_id", str);
            AbstractC41849c a = C41816b.m166115a();
            Intrinsics.checkExpressionValueIsNotNull(a, "Host.get()");
            a.mo150114D().mo150182b("email_thread_sortmail", jSONObject);
        } catch (Exception e) {
            Log.m165384e("MailMenuComponent", "reportSorting", e);
        }
    }

    /* renamed from: a */
    public final void mo153030a(boolean z) {
        if (this.f108337d != z) {
            this.f108337d = z;
            m169834c(z);
            if (z) {
                boolean z2 = this.f108342j;
                C43374f f = C43374f.m172264f();
                Intrinsics.checkExpressionValueIsNotNull(f, "MailAggregationService.getInstance()");
                if (z2 != f.mo155125m()) {
                    C43374f f2 = C43374f.m172264f();
                    Intrinsics.checkExpressionValueIsNotNull(f2, "MailAggregationService.getInstance()");
                    this.f108342j = f2.mo155125m();
                    m169837k();
                    C43374f.m172264f().mo154944h();
                }
            } else {
                AbstractC42551b bVar = this.f108338e;
                if (bVar != null) {
                    bVar.mo152933b();
                }
            }
            ConstraintLayout constraintLayout = mo153032e().f106706c;
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "mViewBinding.mailMenuContainer");
            if (constraintLayout.getMeasuredHeight() == 0) {
                ConstraintLayout constraintLayout2 = mo153032e().f106706c;
                Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "mViewBinding.mailMenuContainer");
                constraintLayout2.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC42570q(this, z));
                return;
            }
            mo153031b(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/mail/impl/home/menu/MailMenuComponent$mFolderManagerOnboadingDelegate$1", "Lcom/ss/android/lark/mail/impl/home/menu/FolderManagerOnboadingDelegate;", "allowShow", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.c$m */
    public static final class C42565m implements FolderManagerOnboadingDelegate {

        /* renamed from: a */
        final /* synthetic */ MailMenuComponent f108355a;

        @Override // com.ss.android.lark.mail.impl.home.menu.FolderManagerOnboadingDelegate
        /* renamed from: a */
        public boolean mo153026a() {
            return this.f108355a.f108337d;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42565m(MailMenuComponent cVar) {
            this.f108355a = cVar;
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

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.f108340g.getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "fragment.lifecycle");
        return lifecycle;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/databinding/MailMenuContainerViewBinding;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.c$n */
    static final class C42566n extends Lambda implements Function0<C42049j> {
        final /* synthetic */ MailMenuComponent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42566n(MailMenuComponent cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C42049j invoke() {
            return C42049j.m167243a(LayoutInflater.from(this.this$0.f108340g.getContext()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/mail/impl/home/menu/MailMenuComponent$showMenu$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.c$q */
    public static final class ViewTreeObserver$OnPreDrawListenerC42570q implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ MailMenuComponent f108358a;

        /* renamed from: b */
        final /* synthetic */ boolean f108359b;

        public boolean onPreDraw() {
            this.f108358a.mo153031b(this.f108359b);
            ConstraintLayout constraintLayout = this.f108358a.mo153032e().f106706c;
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "mViewBinding.mailMenuContainer");
            constraintLayout.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }

        ViewTreeObserver$OnPreDrawListenerC42570q(MailMenuComponent cVar, boolean z) {
            this.f108358a = cVar;
            this.f108359b = z;
        }
    }

    /* renamed from: g */
    public final View mo153034g() {
        if (!this.f108343k) {
            aO_();
            this.f108343k = true;
        }
        FrameLayout a = mo153032e().mo151064a();
        Intrinsics.checkExpressionValueIsNotNull(a, "mViewBinding.root");
        return a;
    }

    /* renamed from: h */
    public final void mo153035h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("all_email_managefolder");
        AbstractC41849c a = C41816b.m166115a();
        Intrinsics.checkExpressionValueIsNotNull(a, "Host.get()");
        a.mo150118H().mo150195a(arrayList);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0002¨\u0006\n"}, d2 = {"com/ss/android/lark/mail/impl/home/menu/MailMenuComponent$menuPopWithAnimate$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "onFinish", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.c$p */
    public static final class C42568p implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ MailMenuComponent f108356a;

        /* renamed from: b */
        final /* synthetic */ boolean f108357b;

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        /* renamed from: a */
        private final void m169862a() {
            if (!this.f108357b) {
                AbstractC42551b bVar = this.f108356a.f108338e;
                if (bVar != null) {
                    bVar.mo152934c();
                }
                this.f108356a.mo153035h();
                return;
            }
            MailMenuComponent cVar = this.f108356a;
            cVar.mo153027a(cVar.mo153032e().f106709f);
            ((MailMenuViewModel) this.f108356a.getValue()).withState(new C42569a(this));
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mail/impl/home/menu/MailMenuState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mail.impl.home.menu.c$p$a */
        public static final class C42569a extends Lambda implements Function1<MailMenuState, Unit> {
            final /* synthetic */ C42568p this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C42569a(C42568p pVar) {
                super(1);
                this.this$0 = pVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MailMenuState hVar) {
                invoke(hVar);
                return Unit.INSTANCE;
            }

            public final void invoke(MailMenuState hVar) {
                Intrinsics.checkParameterIsNotNull(hVar, "it");
                if (hVar.mo153057b() == 1) {
                    MailMenuComponent.m169832a(this.this$0.f108356a).mo89837a();
                }
            }
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            m169862a();
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            m169862a();
        }

        C42568p(MailMenuComponent cVar, boolean z) {
            this.f108356a = cVar;
            this.f108357b = z;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.c$d */
    public static final class RunnableC42554d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MailMenuComponent f108347a;

        /* renamed from: b */
        final /* synthetic */ View f108348b;

        RunnableC42554d(MailMenuComponent cVar, View view) {
            this.f108347a = cVar;
            this.f108348b = view;
        }

        public final void run() {
            AnchorConfig anchorConfig = new AnchorConfig(new WeakReference(this.f108348b), AnchorConfig.AnchorGravity.TOP);
            MaskConfig maskConfig = new MaskConfig(0, BitmapDescriptorFactory.HUE_RED, MaskConfig.ShapeType.RECTANGLE, null, null);
            WeakReference weakReference = new WeakReference(this.f108347a.f108339f);
            String a = C43819s.m173684a((int) R.string.Mail_Folder_FolderManagement);
            String a2 = C43819s.m173684a((int) R.string.Mail_Folder_FolderManagementDesc);
            Intrinsics.checkExpressionValueIsNotNull(a2, "StringUtils.getString(st…der_FolderManagementDesc)");
            C38708a aVar = new C38708a(this.f108347a.f108340g.getActivity(), new C42555a(this, weakReference), new TextBubbleConfig(anchorConfig, maskConfig, a, a2));
            AbstractC41849c a3 = C41816b.m166115a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "Host.get()");
            a3.mo150118H().mo150197a("all_email_managefolder", aVar);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/mail/impl/home/menu/MailMenuComponent$enqueueFolderManagerOnboarding$1$config$1", "Lcom/ss/android/lark/guidemgr/engine/callback/IGuideTaskLifecycle;", "onGuideDidAppear", "", "guideKey", "", "onGuideDidClose", "onGuideWillAppear", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mail.impl.home.menu.c$d$a */
        public static final class C42555a implements AbstractC38707a {

            /* renamed from: a */
            final /* synthetic */ RunnableC42554d f108349a;

            /* renamed from: b */
            final /* synthetic */ WeakReference f108350b;

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

            @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
            /* renamed from: b */
            public void mo129838b(String str) {
                Intrinsics.checkParameterIsNotNull(str, "guideKey");
                FolderManagerOnboadingDelegate aVar = (FolderManagerOnboadingDelegate) this.f108350b.get();
                if (aVar == null) {
                    return;
                }
                if (!aVar.mo153026a()) {
                    this.f108349a.f108347a.mo153035h();
                } else {
                    Log.m165389i("MailMenuComponent", "enqueueFolderManagerOnboarding show");
                }
            }

            C42555a(RunnableC42554d dVar, WeakReference weakReference) {
                this.f108349a = dVar;
                this.f108350b = weakReference;
            }
        }
    }

    /* renamed from: i */
    private final void m169835i() {
        LKUIStatus a = new LKUIStatus.C25680a(mo153032e().f106707d).mo89856a((float) ((((C13749l.m55748b() - this.f108340g.getResources().getDimensionPixelOffset(R.dimen.mail_menu_margin_bottom)) - UIHelper.dp2px(125.0f)) - UIHelper.getDimens(R.dimen.mail_home_multi_title_bar_height)) / 2)).mo89860b(R.drawable.illustration_placeholder_common_load_failed).mo89859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "Builder(mViewBinding.mai…led)\n            .build()");
        this.f108335b = a;
        mo153032e().f106707d.setOnClickListener(new View$OnClickListenerC42561j(this));
        mo153032e().f106704a.setOnClickListener(new View$OnClickListenerC42563k(this));
        mo153032e().f106711h.setOnClickListener(new View$OnClickListenerC42564l(this));
        m169836j();
        m169837k();
    }

    /* renamed from: k */
    private final void m169837k() {
        C43374f f = C43374f.m172264f();
        Intrinsics.checkExpressionValueIsNotNull(f, "MailAggregationService.getInstance()");
        if (f.mo155125m()) {
            mo153032e().f106708e.setImageResource(R.drawable.mail_icon_label_and_folder_setting_default);
            mo153032e().f106709f.setText(R.string.Mail_Folder_ManageFoldersLabels);
            return;
        }
        mo153032e().f106708e.setImageResource(R.drawable.mail_icon_label_setting_default);
        mo153032e().f106709f.setText(R.string.Mail_CustomLabels_ManageLabels);
    }

    /* renamed from: j */
    private final void m169836j() {
        HeaderFooterRecyclerView headerFooterRecyclerView = mo153032e().f106705b;
        Intrinsics.checkExpressionValueIsNotNull(headerFooterRecyclerView, "mViewBinding.mailLabelList");
        this.f108336c = new MailMenuLabelAdapter(headerFooterRecyclerView.getHeadersCount(), this.f108340g.getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f108340g.getContext(), 1, false);
        HeaderFooterRecyclerView headerFooterRecyclerView2 = mo153032e().f106705b;
        Intrinsics.checkExpressionValueIsNotNull(headerFooterRecyclerView2, "mViewBinding.mailLabelList");
        headerFooterRecyclerView2.setLayoutManager(linearLayoutManager);
        HeaderFooterRecyclerView headerFooterRecyclerView3 = mo153032e().f106705b;
        Intrinsics.checkExpressionValueIsNotNull(headerFooterRecyclerView3, "mViewBinding.mailLabelList");
        MailMenuLabelAdapter mailMenuLabelAdapter = this.f108336c;
        if (mailMenuLabelAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMailMenuLabelAdapter");
        }
        headerFooterRecyclerView3.setAdapter(mailMenuLabelAdapter);
        MailMenuLabelAdapter mailMenuLabelAdapter2 = this.f108336c;
        if (mailMenuLabelAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMailMenuLabelAdapter");
        }
        mailMenuLabelAdapter2.mo153081a(new C42556e(this));
        ISubscriber.C24024a.m87810a(this, getValue(), C42571d.INSTANCE, (SubscriptionConfig) null, new C42557f(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, getValue(), C42572e.INSTANCE, (SubscriptionConfig) null, new C42558g(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, getValue(), C42573f.INSTANCE, (SubscriptionConfig) null, new C42559h(this), 2, (Object) null);
        MailMenuLabelAdapter mailMenuLabelAdapter3 = this.f108336c;
        if (mailMenuLabelAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMailMenuLabelAdapter");
        }
        mo153032e().f106705b.addItemDecoration(new C26198f(mailMenuLabelAdapter3));
        ISubscriber.C24024a.m87810a(this, getValue(), C42574g.INSTANCE, (SubscriptionConfig) null, new C42560i(this), 2, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mail/impl/home/menu/MailMenuComponent$currentEntityObserver$1", "Landroidx/lifecycle/Observer;", "Lcom/ss/android/lark/mail/impl/entity/MailLabelEntity;", "onChanged", "", "currentEntity", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.c$b */
    public static final class C42552b implements AbstractC1178x<MailLabelEntity> {

        /* renamed from: a */
        final /* synthetic */ MailMenuComponent f108345a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42552b(MailMenuComponent cVar) {
            this.f108345a = cVar;
        }

        /* renamed from: a */
        public void onChanged(MailLabelEntity mailLabelEntity) {
            if (mailLabelEntity != null) {
                C43374f f = C43374f.m172264f();
                Intrinsics.checkExpressionValueIsNotNull(f, "MailAggregationService.getInstance()");
                List<MailLabelEntity> j = f.mo155122j();
                C43374f f2 = C43374f.m172264f();
                Intrinsics.checkExpressionValueIsNotNull(f2, "MailAggregationService.getInstance()");
                ((MailMenuViewModel) this.f108345a.getValue()).setData(j, f2.mo155124l());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\"\u0012\u001e\u0012\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0018\u00010\u00020\u0001J*\u0010\u0006\u001a\u00020\u00072 \u0010\b\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mail/impl/home/menu/MailMenuComponent$dataObserver$1", "Landroidx/lifecycle/Observer;", "", "", "", "Lcom/ss/android/lark/mail/impl/entity/MailLabelEntity;", "onChanged", "", "t", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.c$c */
    public static final class C42553c implements AbstractC1178x<Map<Integer, ? extends List<? extends MailLabelEntity>>> {

        /* renamed from: a */
        final /* synthetic */ MailMenuComponent f108346a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42553c(MailMenuComponent cVar) {
            this.f108346a = cVar;
        }

        /* renamed from: a */
        public void onChanged(Map<Integer, ? extends List<? extends MailLabelEntity>> map) {
            List<? extends MailLabelEntity> list;
            MailMenuViewModel iVar = (MailMenuViewModel) this.f108346a.getValue();
            List<? extends MailLabelEntity> list2 = null;
            if (map != null) {
                list = (List) map.get(1);
            } else {
                list = null;
            }
            if (map != null) {
                list2 = (List) map.get(2);
            }
            iVar.setData(list, list2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mail/impl/home/menu/MailMenuState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.c$f */
    public static final class C42557f extends Lambda implements Function1<MailMenuState, Unit> {
        final /* synthetic */ MailMenuComponent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42557f(MailMenuComponent cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MailMenuState hVar) {
            invoke(hVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MailMenuState hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "$receiver");
            int b = hVar.mo153057b();
            if (b == 0) {
                MailMenuComponent.m169832a(this.this$0).mo89847d();
                FrameLayout frameLayout = this.this$0.mo153032e().f106707d;
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mViewBinding.mailMenuLoadingTipsLayout");
                if (frameLayout.getVisibility() != 8) {
                    FrameLayout frameLayout2 = this.this$0.mo153032e().f106707d;
                    Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "mViewBinding.mailMenuLoadingTipsLayout");
                    frameLayout2.setVisibility(8);
                }
            } else if (b == 1) {
                FrameLayout frameLayout3 = this.this$0.mo153032e().f106707d;
                Intrinsics.checkExpressionValueIsNotNull(frameLayout3, "mViewBinding.mailMenuLoadingTipsLayout");
                if (frameLayout3.getVisibility() != 0) {
                    FrameLayout frameLayout4 = this.this$0.mo153032e().f106707d;
                    Intrinsics.checkExpressionValueIsNotNull(frameLayout4, "mViewBinding.mailMenuLoadingTipsLayout");
                    frameLayout4.setVisibility(0);
                }
            } else if (b == 2) {
                MailMenuComponent.m169832a(this.this$0).mo89844b(this.this$0.f108340g.getString(R.string.Mail_ThreadList_NoNetwork));
                FrameLayout frameLayout5 = this.this$0.mo153032e().f106707d;
                Intrinsics.checkExpressionValueIsNotNull(frameLayout5, "mViewBinding.mailMenuLoadingTipsLayout");
                if (frameLayout5.getVisibility() != 0) {
                    FrameLayout frameLayout6 = this.this$0.mo153032e().f106707d;
                    Intrinsics.checkExpressionValueIsNotNull(frameLayout6, "mViewBinding.mailMenuLoadingTipsLayout");
                    frameLayout6.setVisibility(0);
                }
                C42187a.m168571u();
            } else if (b == 3) {
                MailMenuComponent.m169832a(this.this$0).mo89844b(this.this$0.f108340g.getString(R.string.Mail_Common_NetworkError));
                FrameLayout frameLayout7 = this.this$0.mo153032e().f106707d;
                Intrinsics.checkExpressionValueIsNotNull(frameLayout7, "mViewBinding.mailMenuLoadingTipsLayout");
                if (frameLayout7.getVisibility() != 0) {
                    FrameLayout frameLayout8 = this.this$0.mo153032e().f106707d;
                    Intrinsics.checkExpressionValueIsNotNull(frameLayout8, "mViewBinding.mailMenuLoadingTipsLayout");
                    frameLayout8.setVisibility(0);
                }
                C42187a.m168571u();
                C42209j.m168612a("labellist_error_page", "error_page");
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mail/impl/home/menu/MailMenuState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.c$g */
    public static final class C42558g extends Lambda implements Function1<MailMenuState, Unit> {
        final /* synthetic */ MailMenuComponent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42558g(MailMenuComponent cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MailMenuState hVar) {
            invoke(hVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MailMenuState hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "$receiver");
            MailMenuComponent.m169833b(this.this$0).mo153082a(hVar.mo153058c());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mail/impl/home/menu/MailMenuState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.c$h */
    public static final class C42559h extends Lambda implements Function1<MailMenuState, Unit> {
        final /* synthetic */ MailMenuComponent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42559h(MailMenuComponent cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MailMenuState hVar) {
            invoke(hVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MailMenuState hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "$receiver");
            MailMenuComponent.m169833b(this.this$0).mo153083a(hVar.mo153059d());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mail/impl/home/menu/MailMenuState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.c$i */
    public static final class C42560i extends Lambda implements Function1<MailMenuState, Unit> {
        final /* synthetic */ MailMenuComponent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42560i(MailMenuComponent cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MailMenuState hVar) {
            invoke(hVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MailMenuState hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "$receiver");
            this.this$0.mo153030a(hVar.mo153056a());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mail/impl/home/menu/MailMenuState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.c$o */
    public static final class C42567o extends Lambda implements Function1<MailMenuState, Unit> {
        final /* synthetic */ MailMenuComponent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42567o(MailMenuComponent cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MailMenuState hVar) {
            invoke(hVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MailMenuState hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "it");
            if (hVar.mo153057b() == 1) {
                MailMenuComponent.m169832a(this.this$0).mo89837a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.c$k */
    public static final class View$OnClickListenerC42563k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MailMenuComponent f108353a;

        View$OnClickListenerC42563k(MailMenuComponent cVar) {
            this.f108353a = cVar;
        }

        public final void onClick(View view) {
            ((MailMenuViewModel) this.f108353a.getValue()).show(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.c$l */
    public static final class View$OnClickListenerC42564l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MailMenuComponent f108354a;

        View$OnClickListenerC42564l(MailMenuComponent cVar) {
            this.f108354a = cVar;
        }

        public final void onClick(View view) {
            C42699a.m170215a(this.f108354a.f108340g.getContext(), 1);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ LKUIStatus m169832a(MailMenuComponent cVar) {
        LKUIStatus lKUIStatus = cVar.f108335b;
        if (lKUIStatus == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLKUIStatus");
        }
        return lKUIStatus;
    }

    /* renamed from: b */
    public static final /* synthetic */ MailMenuLabelAdapter m169833b(MailMenuComponent cVar) {
        MailMenuLabelAdapter mailMenuLabelAdapter = cVar.f108336c;
        if (mailMenuLabelAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMailMenuLabelAdapter");
        }
        return mailMenuLabelAdapter;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.c$j */
    public static final class View$OnClickListenerC42561j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MailMenuComponent f108352a;

        View$OnClickListenerC42561j(MailMenuComponent cVar) {
            this.f108352a = cVar;
        }

        public final void onClick(View view) {
            ((MailMenuViewModel) this.f108352a.getValue()).withState(new Function1<MailMenuState, Unit>(this) {
                /* class com.ss.android.lark.mail.impl.home.menu.MailMenuComponent.View$OnClickListenerC42561j.C425621 */
                final /* synthetic */ View$OnClickListenerC42561j this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MailMenuState hVar) {
                    invoke(hVar);
                    return Unit.INSTANCE;
                }

                public final void invoke(MailMenuState hVar) {
                    AbstractC42551b bVar;
                    Intrinsics.checkParameterIsNotNull(hVar, "it");
                    int b = hVar.mo153057b();
                    if ((b == 2 || b == 3) && (bVar = this.this$0.f108352a.f108338e) != null) {
                        bVar.mo152931a();
                    }
                    ((MailMenuViewModel) this.this$0.f108352a.getValue()).setLoadingType(1);
                }
            });
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MailMenuComponent(androidx.fragment.app.Fragment r10) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.home.menu.MailMenuComponent.<init>(androidx.fragment.app.Fragment):void");
    }

    /* renamed from: c */
    private final void m169834c(boolean z) {
        float f;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (z) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = 1.0f;
        }
        if (z) {
            f2 = 1.0f;
        }
        if (this.f108344l == DevicePerfUtils.DevicePerfLevel.ULTRALOW || this.f108344l == DevicePerfUtils.DevicePerfLevel.LOW) {
            View view = mo153032e().f106704a;
            Intrinsics.checkExpressionValueIsNotNull(view, "mViewBinding.grayLayer");
            view.setAlpha(f2);
            return;
        }
        ObjectAnimator.ofFloat(mo153032e().mo151064a(), "alpha", f, f2).setDuration(200L).start();
    }

    /* renamed from: b */
    public final void mo153031b(boolean z) {
        float f;
        if (this.f108344l != DevicePerfUtils.DevicePerfLevel.ULTRALOW && this.f108344l != DevicePerfUtils.DevicePerfLevel.LOW) {
            ConstraintLayout constraintLayout = mo153032e().f106706c;
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "mViewBinding.mailMenuContainer");
            int measuredHeight = constraintLayout.getMeasuredHeight();
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (z) {
                f = (float) (-measuredHeight);
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            if (!z) {
                f2 = (float) (-measuredHeight);
            }
            ObjectAnimator duration = ObjectAnimator.ofFloat(mo153032e().f106706c, "translationY", f, f2).setDuration(200L);
            Intrinsics.checkExpressionValueIsNotNull(duration, "ObjectAnimator.ofFloat(m…IL_MENU_ANIMATE_DURATION)");
            duration.addListener(new C42568p(this, z));
            duration.start();
        } else if (!z) {
            AbstractC42551b bVar = this.f108338e;
            if (bVar != null) {
                bVar.mo152934c();
            }
            mo153035h();
        } else {
            mo153027a(mo153032e().f106709f);
            ((MailMenuViewModel) getValue()).withState(new C42567o(this));
        }
    }

    /* renamed from: a */
    public final void mo153027a(View view) {
        Log.m165389i("MailMenuComponent", "enqueueFolderManagerOnboarding");
        if (view == null) {
            Log.m165383e("MailMenuComponent", "enqueueFolderManagerOnboarding empty view");
            return;
        }
        C43374f f = C43374f.m172264f();
        Intrinsics.checkExpressionValueIsNotNull(f, "MailAggregationService.getInstance()");
        if (!f.mo155125m()) {
            Log.m165383e("MailMenuComponent", "enqueueFolderManagerOnboarding folder disable");
        } else {
            C43849u.m173827a(new RunnableC42554d(this, view), 500);
        }
    }

    /* renamed from: a */
    public final void mo153028a(AbstractC42551b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "menuCallback");
        this.f108338e = bVar;
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State> Disposable mo86220a(JackViewModel<S> lVar, SubscriptionConfig<S> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87829a(this, lVar, vVar, function1);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "position", "", "menuItem", "Lcom/ss/android/lark/mail/impl/home/menu/MenuItem;", "onItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.c$e */
    public static final class C42556e implements MailMenuLabelAdapter.AbstractC42588a {

        /* renamed from: a */
        final /* synthetic */ MailMenuComponent f108351a;

        C42556e(MailMenuComponent cVar) {
            this.f108351a = cVar;
        }

        @Override // com.ss.android.lark.mail.impl.home.menu.label.MailMenuLabelAdapter.AbstractC42588a
        /* renamed from: a */
        public final void mo153039a(View view, int i, C42585j jVar) {
            if (jVar != null) {
                MailLabelEntity mailLabelEntity = ((C42589a) jVar).f108382g;
                AbstractC42551b bVar = this.f108351a.f108338e;
                if (bVar != null) {
                    bVar.mo152932a(mailLabelEntity);
                }
                ((MailMenuViewModel) this.f108351a.getValue()).show(false);
                if (mailLabelEntity != null) {
                    MailMenuComponent cVar = this.f108351a;
                    String k = mailLabelEntity.mo151527k();
                    Intrinsics.checkExpressionValueIsNotNull(k, "selectedLabel.id");
                    cVar.mo153029a(k);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mail.impl.home.menu.label.MenuLabelItem");
        }
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
