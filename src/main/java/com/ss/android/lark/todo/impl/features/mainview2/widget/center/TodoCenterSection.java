package com.ss.android.lark.todo.impl.features.mainview2.widget.center;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IActionDispatcher;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.IAccountChangeDependency;
import com.ss.android.lark.todo.dependency.idependency.IAppLifeCycleDependency;
import com.ss.android.lark.todo.impl.features.badge.TodoBadgeManager;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.features.common.helper.OperationToastHelper;
import com.ss.android.lark.todo.impl.features.common.share.entity.ShareEntity;
import com.ss.android.lark.todo.impl.features.common.share.helper.ShareToastDisplayHelper;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFetchStatus;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoListToastUnit;
import com.ss.android.lark.todo.impl.features.mainview2.entity.ConfirmActionData;
import com.ss.android.lark.todo.impl.features.mainview2.mvvm.IMainFragmentLiveDataStore;
import com.ss.android.lark.todo.impl.features.mainview2.widget.center.listener.IContentAnimateListener;
import com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView;
import com.ss.android.lark.todo.impl.framework.hitpoint.appreciable.TodoAppreciableHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.perf.TodoSlardarPerfHitPoint;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u001e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0011J\b\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016J\u0006\u0010!\u001a\u00020\u001aJ\b\u0010\"\u001a\u00020\u001aH\u0016J\b\u0010#\u001a\u00020\u001aH\u0002J\b\u0010$\u001a\u00020\u001aH\u0002J\b\u0010%\u001a\u00020\u001aH\u0002J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0011H\u0002J\u0006\u0010*\u001a\u00020\u001aJ\u0006\u0010+\u001a\u00020\u001aJ\u0018\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0011H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterSection;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/IMainFragmentLiveDataStore;", "contentView", "Landroid/view/View;", "contentAnimateListener", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/center/listener/IContentAnimateListener;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Landroid/view/View;Lcom/ss/android/lark/todo/impl/features/mainview2/widget/center/listener/IContentAnimateListener;Lcom/larksuite/framework/section/IViewAbility;)V", "accountChangeListener", "Lcom/ss/android/lark/todo/dependency/idependency/IAccountChangeDependency$IAccountChangeListener;", "appStateChangeListener", "Lcom/ss/android/lark/todo/dependency/idependency/IAppLifeCycleDependency$IAppStateChangeListener;", "hideLoadingRunnable", "Ljava/lang/Runnable;", "isContentViewAnimate", "", "isOnTodoPage", "isOpenCreateBtnParam", "isOpenCreateBtnParam$todo_release", "()Z", "setOpenCreateBtnParam$todo_release", "(Z)V", "isTitleBarShow", "clickAppendBtnIfNeed", "", "handlePageSwitch", "preIsTodoTab", "curIsTodoTab", "isFragmentActive", "initViewAction", "initViewObserver", "onCaptured", "onDestroy", "registerAccountChangedPush", "registerAppLifeCycleObserver", "resetContentViewParams", "showToast", "toastUnit", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoListToastUnit;", "startContentAnimation", "unRegisterAccountChangedPush", "unRegisterAppLifeCycleObserver", "updateLoadingViewByStatus", "todoFetchStatus", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFetchStatus;", "isLabelShow", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.b */
public final class TodoCenterSection extends ViewSection<IMainFragmentLiveDataStore> {

    /* renamed from: e */
    public static final Companion f140620e = new Companion(null);

    /* renamed from: k */
    private static final int f140621k = C57582a.m223600a(58);

    /* renamed from: a */
    public boolean f140622a;

    /* renamed from: b */
    public boolean f140623b = true;

    /* renamed from: c */
    public final View f140624c;

    /* renamed from: d */
    public final IContentAnimateListener f140625d;

    /* renamed from: f */
    private final Runnable f140626f = new RunnableC56969c(this);

    /* renamed from: g */
    private IAppLifeCycleDependency.IAppStateChangeListener f140627g;

    /* renamed from: h */
    private IAccountChangeDependency.IAccountChangeListener f140628h;

    /* renamed from: i */
    private boolean f140629i = true;

    /* renamed from: j */
    private boolean f140630j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterSection$Companion;", "", "()V", "ANIMATION_DURATION", "", "LABEL_INVISIBLE_DURATION", "TAG", "", "TITLE_BAR_HEIGHT", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: h */
    public void mo92111h() {
        super.mo92111h();
        UICallbackExecutor.removeCallbacks(this.f140626f);
    }

    /* renamed from: l */
    public final void mo193617l() {
        mo92107d().mo92064a(6);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.b$b */
    public static final class RunnableC56968b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TodoCenterSection f140631a;

        RunnableC56968b(TodoCenterSection bVar) {
            this.f140631a = bVar;
        }

        public final void run() {
            ((ImageView) this.f140631a.f140624c.findViewById(R.id.create_bt)).performClick();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.b$c */
    static final class RunnableC56969c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TodoCenterSection f140632a;

        RunnableC56969c(TodoCenterSection bVar) {
            this.f140632a = bVar;
        }

        public final void run() {
            RelativeLayout relativeLayout = (RelativeLayout) this.f140632a.f140624c.findViewById(R.id.todo_loading_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "contentView.todo_loading_container");
            relativeLayout.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterSection$registerAccountChangedPush$1", "Lcom/ss/android/lark/todo/dependency/idependency/IAccountChangeDependency$IAccountChangeListener;", "onAccountChange", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.b$n */
    public static final class C56982n implements IAccountChangeDependency.IAccountChangeListener {

        /* renamed from: a */
        final /* synthetic */ TodoCenterSection f140639a;

        @Override // com.ss.android.lark.todo.dependency.idependency.IAccountChangeDependency.IAccountChangeListener
        /* renamed from: a */
        public void mo191727a() {
            Log.m165389i("TodoCenterSection", LogMessageUtil.f139260a.mo191772d("onAccountChanged"));
            UICallbackExecutor.post(new RunnableC56983a(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.b$n$a */
        static final class RunnableC56983a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C56982n f140640a;

            RunnableC56983a(C56982n nVar) {
                this.f140640a = nVar;
            }

            public final void run() {
                TodoFilterHeaderView todoFilterHeaderView = (TodoFilterHeaderView) this.f140640a.f140639a.f140624c.findViewById(R.id.todo_classify_view);
                if (todoFilterHeaderView != null) {
                    todoFilterHeaderView.mo193644a(TodoListView.Type.ALL);
                }
                this.f140640a.f140639a.mo92107d().mo92064a(5);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56982n(TodoCenterSection bVar) {
            this.f140639a = bVar;
        }
    }

    /* renamed from: n */
    private final void m221161n() {
        if (this.f140627g == null) {
            this.f140627g = new C56984o(this);
        }
        IAppLifeCycleDependency.IAppStateChangeListener aVar = this.f140627g;
        if (aVar != null) {
            TodoDependencyHolder.f139242a.mo191730a().appLifeCycleDependency().mo145365a(aVar);
        }
    }

    /* renamed from: o */
    private final void m221162o() {
        if (this.f140628h == null) {
            this.f140628h = new C56982n(this);
        }
        IAccountChangeDependency.IAccountChangeListener aVar = this.f140628h;
        if (aVar != null) {
            TodoDependencyHolder.f139242a.mo191730a().accountChangeDependency().mo145357a(aVar);
        }
    }

    /* renamed from: j */
    public final void mo193615j() {
        IAppLifeCycleDependency.IAppStateChangeListener aVar = this.f140627g;
        if (aVar != null) {
            TodoDependencyHolder.f139242a.mo191730a().appLifeCycleDependency().mo145366b(aVar);
        }
    }

    /* renamed from: k */
    public final void mo193616k() {
        IAccountChangeDependency.IAccountChangeListener aVar = this.f140628h;
        if (aVar != null) {
            TodoDependencyHolder.f139242a.mo191730a().accountChangeDependency().mo145358b(aVar);
        }
    }

    /* renamed from: m */
    public final void mo193618m() {
        if (this.f140630j) {
            ((ImageView) this.f140624c.findViewById(R.id.create_bt)).post(new RunnableC56968b(this));
        }
    }

    /* renamed from: p */
    private final void m221163p() {
        RelativeLayout relativeLayout = (RelativeLayout) this.f140624c.findViewById(R.id.todo_content_view);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "contentView.todo_content_view");
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(0, f140621k, 0, 0);
            RelativeLayout relativeLayout2 = (RelativeLayout) this.f140624c.findViewById(R.id.todo_content_view);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "contentView.todo_content_view");
            relativeLayout2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
        ((ImageView) this.f140624c.findViewById(R.id.create_bt)).setOnClickListener(new View$OnClickListenerC56970d(this));
        ((RelativeLayout) this.f140624c.findViewById(R.id.todo_loading_container)).setOnClickListener(new View$OnClickListenerC56971e(this));
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        IMainFragmentLiveDataStore aVar = (IMainFragmentLiveDataStore) mo92096a();
        mo92103a(aVar.mo193565W(), new C56972f(this));
        mo92103a(aVar.mo193563U(), new C56973g(this));
        mo92103a(aVar.mo193559Q(), new C56974h(this));
        mo92103a(aVar.mo193557O(), new C56975i(this));
        mo92103a(aVar.mo193561S(), new C56976j(aVar, this));
        mo92103a(aVar.mo193567Y(), new C56977k(this));
        mo92103a(aVar.aa(), new C56978l(this));
        mo92103a(aVar.ac(), new C56980m(this));
    }

    /* renamed from: a */
    public final void mo193612a(boolean z) {
        this.f140630j = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterSection$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.b$f */
    static final class C56972f extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ TodoCenterSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56972f(TodoCenterSection bVar) {
            super(1);
            this.this$0 = bVar;
        }

        public final void invoke(boolean z) {
            this.this$0.mo193614b(z);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoListToastUnit;", "invoke", "com/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterSection$initViewObserver$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.b$g */
    static final class C56973g extends Lambda implements Function1<TodoListToastUnit, Unit> {
        final /* synthetic */ TodoCenterSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56973g(TodoCenterSection bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TodoListToastUnit dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(TodoListToastUnit dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "it");
            this.this$0.mo193611a(dVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterSection$initViewObserver$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.b$h */
    static final class C56974h extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ TodoCenterSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56974h(TodoCenterSection bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            TextView textView = (TextView) this.this$0.f140624c.findViewById(R.id.tv_empty_list);
            Intrinsics.checkExpressionValueIsNotNull(textView, "contentView.tv_empty_list");
            textView.setText(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFetchStatus;", "invoke", "com/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterSection$initViewObserver$1$5"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.b$j */
    static final class C56976j extends Lambda implements Function1<TodoFetchStatus, Unit> {
        final /* synthetic */ IMainFragmentLiveDataStore $this_apply;
        final /* synthetic */ TodoCenterSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56976j(IMainFragmentLiveDataStore aVar, TodoCenterSection bVar) {
            super(1);
            this.$this_apply = aVar;
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TodoFetchStatus todoFetchStatus) {
            invoke(todoFetchStatus);
            return Unit.INSTANCE;
        }

        public final void invoke(TodoFetchStatus todoFetchStatus) {
            Intrinsics.checkParameterIsNotNull(todoFetchStatus, "it");
            TodoCenterSection bVar = this.this$0;
            Boolean b = this.$this_apply.mo193557O().mo5927b();
            if (b == null) {
                b = false;
            }
            bVar.mo193610a(todoFetchStatus, b.booleanValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/common/share/entity/ShareEntity;", "invoke", "com/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterSection$initViewObserver$1$6"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.b$k */
    static final class C56977k extends Lambda implements Function1<ShareEntity, Unit> {
        final /* synthetic */ TodoCenterSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56977k(TodoCenterSection bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ShareEntity shareEntity) {
            invoke(shareEntity);
            return Unit.INSTANCE;
        }

        public final void invoke(ShareEntity shareEntity) {
            Intrinsics.checkParameterIsNotNull(shareEntity, "it");
            ShareToastDisplayHelper.f139408a.mo192008a(this.this$0.mo92106c(), shareEntity);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "invoke", "com/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterSection$initViewObserver$1$7"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.b$l */
    static final class C56978l extends Lambda implements Function1<Pair<? extends String, ? extends TodoSource>, Unit> {
        final /* synthetic */ TodoCenterSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56978l(TodoCenterSection bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends TodoSource> pair) {
            invoke((Pair<String, ? extends TodoSource>) pair);
            return Unit.INSTANCE;
        }

        public final void invoke(final Pair<String, ? extends TodoSource> pair) {
            Intrinsics.checkParameterIsNotNull(pair, "it");
            MultiCompleteHelper.f139390a.mo191985b(this.this$0.mo92106c(), new MultiCompleteHelper.IMultiCompleteDialogListener(this) {
                /* class com.ss.android.lark.todo.impl.features.mainview2.widget.center.TodoCenterSection.C56978l.C569791 */

                /* renamed from: a */
                final /* synthetic */ C56978l f140635a;

                @Override // com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper.IMultiCompleteDialogListener
                /* renamed from: b */
                public void mo191870b() {
                }

                @Override // com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper.IMultiCompleteDialogListener
                /* renamed from: a */
                public void mo191869a() {
                    this.f140635a.this$0.mo92107d().mo92066a(1504, (IActionData) new ConfirmActionData((String) pair.getFirst(), (TodoSource) pair.getSecond(), true));
                }

                {
                    this.f140635a = r1;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "invoke", "com/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterSection$initViewObserver$1$8"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.b$m */
    static final class C56980m extends Lambda implements Function1<Pair<? extends String, ? extends TodoSource>, Unit> {
        final /* synthetic */ TodoCenterSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56980m(TodoCenterSection bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends TodoSource> pair) {
            invoke((Pair<String, ? extends TodoSource>) pair);
            return Unit.INSTANCE;
        }

        public final void invoke(final Pair<String, ? extends TodoSource> pair) {
            Intrinsics.checkParameterIsNotNull(pair, "it");
            MultiCompleteHelper.f139390a.mo191983a(this.this$0.mo92106c(), new MultiCompleteHelper.IMultiCompleteDialogListener(this) {
                /* class com.ss.android.lark.todo.impl.features.mainview2.widget.center.TodoCenterSection.C56980m.C569811 */

                /* renamed from: a */
                final /* synthetic */ C56980m f140637a;

                @Override // com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper.IMultiCompleteDialogListener
                /* renamed from: b */
                public void mo191870b() {
                }

                @Override // com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper.IMultiCompleteDialogListener
                /* renamed from: a */
                public void mo191869a() {
                    this.f140637a.this$0.mo92107d().mo92066a(1503, (IActionData) new ConfirmActionData((String) pair.getFirst(), (TodoSource) pair.getSecond(), false));
                }

                {
                    this.f140637a = r1;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterSection$registerAppLifeCycleObserver$1", "Lcom/ss/android/lark/todo/dependency/idependency/IAppLifeCycleDependency$IAppStateChangeListener;", "onAppStateChange", "", "isAppFronted", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.b$o */
    public static final class C56984o implements IAppLifeCycleDependency.IAppStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ TodoCenterSection f140641a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56984o(TodoCenterSection bVar) {
            this.f140641a = bVar;
        }

        @Override // com.ss.android.lark.todo.dependency.idependency.IAppLifeCycleDependency.IAppStateChangeListener
        /* renamed from: a */
        public void mo191728a(boolean z) {
            int i;
            IActionDispatcher d = this.f140641a.mo92107d();
            if (!z || !this.f140641a.f140623b) {
                i = 4;
            } else {
                i = 3;
            }
            d.mo92064a(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.b$d */
    static final class View$OnClickListenerC56970d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoCenterSection f140633a;

        View$OnClickListenerC56970d(TodoCenterSection bVar) {
            this.f140633a = bVar;
        }

        public final void onClick(View view) {
            this.f140633a.mo92107d().mo92064a(1501);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.b$e */
    static final class View$OnClickListenerC56971e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoCenterSection f140634a;

        View$OnClickListenerC56971e(TodoCenterSection bVar) {
            this.f140634a = bVar;
        }

        public final void onClick(View view) {
            this.f140634a.mo92107d().mo92064a(1502);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "isListEmpty", "", "invoke", "com/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterSection$initViewObserver$1$4"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.b$i */
    static final class C56975i extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ TodoCenterSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56975i(TodoCenterSection bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            int i;
            if (z) {
                TodoSlardarPerfHitPoint.f141078a.mo194233a(true);
                TodoAppreciableHitPoint.f141058a.mo194133a("ongoing", true);
            }
            RelativeLayout relativeLayout = (RelativeLayout) this.this$0.f140624c.findViewById(R.id.empty_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "contentView.empty_container");
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            relativeLayout.setVisibility(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterSection$startContentAnimation$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.b$q */
    public static final class C56986q implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ TodoCenterSection f140643a;

        /* renamed from: b */
        final /* synthetic */ boolean f140644b;

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f140643a.f140625d.mo193542a(false);
            this.f140643a.f140622a = false;
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f140643a.f140625d.mo193542a(false);
            this.f140643a.f140622a = false;
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f140643a.f140625d.mo193542a(!this.f140644b);
            this.f140643a.f140622a = true;
        }

        C56986q(TodoCenterSection bVar, boolean z) {
            this.f140643a = bVar;
            this.f140644b = z;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.b$p */
    public static final class C56985p implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TodoCenterSection f140642a;

        C56985p(TodoCenterSection bVar) {
            this.f140642a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                RelativeLayout relativeLayout = (RelativeLayout) this.f140642a.f140624c.findViewById(R.id.todo_content_view);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "contentView.todo_content_view");
                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                if (layoutParams != null) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.setMargins(0, intValue, 0, 0);
                    RelativeLayout relativeLayout2 = (RelativeLayout) this.f140642a.f140624c.findViewById(R.id.todo_content_view);
                    Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "contentView.todo_content_view");
                    relativeLayout2.setLayoutParams(layoutParams2);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: a */
    public final void mo193611a(TodoListToastUnit dVar) {
        int i = C56987c.f140646b[dVar.mo193214b().ordinal()];
        if (i == 1) {
            OperationToastHelper.m219774a(OperationToastHelper.f139395a, mo92106c(), dVar.mo193213a(), null, null, null, 28, null);
        } else if (i == 2) {
            OperationToastHelper.m219775a(OperationToastHelper.f139395a, mo92106c(), dVar.mo193213a(), null, null, null, null, 60, null);
        } else if (i == 3) {
            OperationToastHelper.m219777b(OperationToastHelper.f139395a, mo92106c(), dVar.mo193213a(), dVar.mo193215c(), null, null, null, 56, null);
        }
    }

    /* renamed from: b */
    public final void mo193614b(boolean z) {
        int i;
        int i2;
        if (!this.f140622a && this.f140629i != z) {
            this.f140629i = z;
            if (!z) {
                i = f140621k;
            } else {
                i = 0;
            }
            if (!z) {
                i2 = 0;
            } else {
                i2 = f140621k;
            }
            ValueAnimator duration = ValueAnimator.ofInt(i, i2).setDuration(200L);
            duration.addUpdateListener(new C56985p(this));
            duration.addListener(new C56986q(this, z));
            duration.start();
        }
    }

    /* renamed from: a */
    public final void mo193610a(TodoFetchStatus todoFetchStatus, boolean z) {
        long j;
        if (todoFetchStatus == TodoFetchStatus.NONE) {
            RelativeLayout relativeLayout = (RelativeLayout) this.f140624c.findViewById(R.id.todo_loading_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "contentView.todo_loading_container");
            relativeLayout.setVisibility(8);
        } else if (todoFetchStatus == TodoFetchStatus.NEXT_PAGE_FAILED) {
            ((LKUIPtrClassicFrameLayout) this.f140624c.findViewById(R.id.todo_refactor_ptr_layout)).refreshComplete();
        } else if (todoFetchStatus == TodoFetchStatus.SUCCESS) {
            Runnable runnable = this.f140626f;
            if (!z) {
                j = 200;
            } else {
                j = 0;
            }
            UICallbackExecutor.executeDelayed(runnable, j);
        } else {
            RelativeLayout relativeLayout2 = (RelativeLayout) this.f140624c.findViewById(R.id.empty_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "contentView.empty_container");
            relativeLayout2.setVisibility(8);
            RelativeLayout relativeLayout3 = (RelativeLayout) this.f140624c.findViewById(R.id.todo_loading_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "contentView.todo_loading_container");
            relativeLayout3.setVisibility(0);
            int i = C56987c.f140645a[todoFetchStatus.ordinal()];
            if (i == 1) {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f140624c.findViewById(R.id.todo_lottie_loading_anim);
                Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "contentView.todo_lottie_loading_anim");
                lottieAnimationView.setVisibility(0);
                ((LottieAnimationView) this.f140624c.findViewById(R.id.todo_lottie_loading_anim)).playAnimation();
                LinearLayout linearLayout = (LinearLayout) this.f140624c.findViewById(R.id.todo_loading_error_ll);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "contentView.todo_loading_error_ll");
                linearLayout.setVisibility(8);
            } else if (i == 2) {
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f140624c.findViewById(R.id.todo_lottie_loading_anim);
                Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView2, "contentView.todo_lottie_loading_anim");
                lottieAnimationView2.setVisibility(8);
                ((LottieAnimationView) this.f140624c.findViewById(R.id.todo_lottie_loading_anim)).cancelAnimation();
                LinearLayout linearLayout2 = (LinearLayout) this.f140624c.findViewById(R.id.todo_loading_error_ll);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "contentView.todo_loading_error_ll");
                linearLayout2.setVisibility(0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoCenterSection(View view, IContentAnimateListener aVar, IViewAbility<IMainFragmentLiveDataStore> fVar) {
        super(fVar);
        Drawable findDrawableByLayerId;
        Intrinsics.checkParameterIsNotNull(view, "contentView");
        Intrinsics.checkParameterIsNotNull(aVar, "contentAnimateListener");
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f140624c = view;
        this.f140625d = aVar;
        m221161n();
        m221162o();
        View findViewById = ((UDShadowLayout) view.findViewById(R.id.todo_append_view)).findViewById(R.id.create_bt);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "contentView.todo_append_…mageView>(R.id.create_bt)");
        Drawable drawable = ((ImageView) findViewById).getDrawable();
        LayerDrawable layerDrawable = (LayerDrawable) (!(drawable instanceof LayerDrawable) ? null : drawable);
        if (layerDrawable != null && (findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.add_bold)) != null) {
            findDrawableByLayerId.setTint(UIUtils.getColor(mo92106c(), R.color.static_white));
        }
    }

    /* renamed from: a */
    public final void mo193613a(boolean z, boolean z2, boolean z3) {
        LogMessageUtil cVar = LogMessageUtil.f139260a;
        Log.m165389i("TodoCenterSection", cVar.mo191772d("handlePageSwitch preIsTodoTab = " + z + " curIsTodoTab = " + z2));
        if (!z && !z2) {
            return;
        }
        if (!z || !z2) {
            this.f140623b = z2;
            if (z2) {
                TodoHitPoint.m221758k("navigator");
                if (z3) {
                    mo92107d().mo92064a(1);
                    m221163p();
                }
            }
            if (z) {
                mo92107d().mo92064a(2);
                TodoBadgeManager.f139264a.mo191790b();
            }
        }
    }
}
