package com.ss.android.lark.todo.impl.features.detail.at.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.framework.ui.p1198b.C26198f;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.detail.at.model.TodoAtViewModel;
import com.ss.android.lark.todo.impl.features.detail.at.view.adapter.AtBean;
import com.ss.android.lark.todo.impl.features.detail.at.view.adapter.AtDataBean;
import com.ss.android.lark.todo.impl.features.detail.at.view.adapter.AtSelectAdapter;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.C58996h;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0002&'B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001fJ\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0003J\u0014\u0010#\u001a\u00020\u001f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0%R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006("}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/view/TodoAtView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "viewModel", "Lcom/ss/android/lark/todo/impl/features/detail/at/model/TodoAtViewModel;", "largeMargin", "", "dependency", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/TodoAtView$ITodoViewDependency;", "(Landroid/content/Context;Lcom/ss/android/lark/todo/impl/features/detail/at/model/TodoAtViewModel;ZLcom/ss/android/lark/todo/impl/features/detail/at/view/TodoAtView$ITodoViewDependency;)V", "getDependency", "()Lcom/ss/android/lark/todo/impl/features/detail/at/view/TodoAtView$ITodoViewDependency;", "setDependency", "(Lcom/ss/android/lark/todo/impl/features/detail/at/view/TodoAtView$ITodoViewDependency;)V", "isActive", "()Z", "setActive", "(Z)V", "mAdapter", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtSelectAdapter;", "mAtResultList", "Landroidx/recyclerview/widget/RecyclerView;", "mBack", "Landroid/view/View;", "mEnterAnim", "Landroid/animation/ValueAnimator;", "mExitAnim", "getViewModel", "()Lcom/ss/android/lark/todo/impl/features/detail/at/model/TodoAtViewModel;", "destroy", "", "dismiss", "initAnimator", "initView", "show", "callback", "Lkotlin/Function0;", "Companion", "ITodoViewDependency", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.a */
public final class TodoAtView extends ConstraintLayout {

    /* renamed from: b */
    public static final Companion f139648b = new Companion(null);

    /* renamed from: a */
    public AtSelectAdapter f139649a;

    /* renamed from: c */
    private RecyclerView f139650c;

    /* renamed from: d */
    private View f139651d;

    /* renamed from: e */
    private ValueAnimator f139652e;

    /* renamed from: f */
    private ValueAnimator f139653f;

    /* renamed from: g */
    private boolean f139654g;

    /* renamed from: h */
    private final TodoAtViewModel f139655h;

    /* renamed from: i */
    private final boolean f139656i;

    /* renamed from: j */
    private ITodoViewDependency f139657j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/view/TodoAtView$ITodoViewDependency;", "", "isTodoAtViewShow", "", "isShow", "", "onSelectedItem", BottomDialog.f17198f, "", "displayName", "isOutChatUser", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.a$b */
    public interface ITodoViewDependency {
        /* renamed from: a */
        void mo192244a(String str, String str2, boolean z);

        /* renamed from: a */
        void mo192245a(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/view/TodoAtView$Companion;", "", "()V", "ANIM_DURATION", "", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo192257a() {
        return this.f139654g;
    }

    public final ITodoViewDependency getDependency() {
        return this.f139657j;
    }

    public final TodoAtViewModel getViewModel() {
        return this.f139655h;
    }

    /* renamed from: c */
    public final void mo192259c() {
        ValueAnimator valueAnimator = this.f139652e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f139653f;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    /* renamed from: b */
    public final void mo192258b() {
        this.f139657j.mo192245a(false);
        if (getVisibility() != 8) {
            this.f139654g = false;
            ValueAnimator valueAnimator = this.f139653f;
            if (valueAnimator != null && !valueAnimator.isRunning()) {
                valueAnimator.start();
            }
        }
    }

    /* renamed from: d */
    private final void m220054d() {
        ValueAnimator duration = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(200L);
        duration.addUpdateListener(new C56462c(duration, this));
        duration.addListener(new C56463d(this));
        this.f139652e = duration;
        ValueAnimator duration2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(200L);
        duration2.addUpdateListener(new C56464e(duration2, this));
        duration2.addListener(new C56465f(this));
        this.f139653f = duration2;
    }

    /* renamed from: e */
    private final void m220055e() {
        float f;
        UDShadowLayout uDShadowLayout = (UDShadowLayout) findViewById(R.id.list_container);
        Intrinsics.checkExpressionValueIsNotNull(uDShadowLayout, "this");
        ViewGroup.LayoutParams layoutParams = uDShadowLayout.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (this.f139656i) {
                f = 280.0f;
            } else {
                f = 57.0f;
            }
            marginLayoutParams.topMargin = UIHelper.dp2px(f);
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            C58996h.m228978b(recyclerView);
            AtSelectAdapter eVar = new AtSelectAdapter(new C56466g(this));
            this.f139649a = eVar;
            recyclerView.addItemDecoration(new C26198f(eVar));
            recyclerView.setAdapter(this.f139649a);
            this.f139650c = recyclerView;
            View findViewById = findViewById(R.id.back);
            findViewById.setOnTouchListener(new View$OnTouchListenerC56467h(this));
            this.f139651d = findViewById;
            C1177w<List<AtBean>> todoAtList = this.f139655h.getTodoAtList();
            Context context = getContext();
            if (context != null) {
                todoAtList.mo5923a((FragmentActivity) context, new C56468i(this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void setActive(boolean z) {
        this.f139654g = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/at/view/TodoAtView$initAnimator$1$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.a$d */
    public static final class C56463d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ TodoAtView f139660a;

        C56463d(TodoAtView aVar) {
            this.f139660a = aVar;
        }

        public void onAnimationStart(Animator animator) {
            this.f139660a.setVisibility(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/at/view/TodoAtView$initAnimator$2$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.a$f */
    public static final class C56465f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ TodoAtView f139663a;

        C56465f(TodoAtView aVar) {
            this.f139663a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f139663a.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/at/view/TodoAtView$initView$2$1", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtSelectAdapter$OnItemSelectListener;", "onItemSelected", "", "bean", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtDataBean;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.a$g */
    public static final class C56466g implements AtSelectAdapter.OnItemSelectListener {

        /* renamed from: a */
        final /* synthetic */ TodoAtView f139664a;

        C56466g(TodoAtView aVar) {
            this.f139664a = aVar;
        }

        @Override // com.ss.android.lark.todo.impl.features.detail.at.view.adapter.AtSelectAdapter.OnItemSelectListener
        /* renamed from: a */
        public void mo192268a(AtDataBean aVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(aVar, "bean");
            this.f139664a.mo192258b();
            ITodoViewDependency dependency = this.f139664a.getDependency();
            String d = aVar.mo192276d();
            String e = aVar.mo192277e();
            if (aVar.mo192274c() == 2) {
                z = true;
            } else {
                z = false;
            }
            dependency.mo192244a(d, e, z);
        }
    }

    public final void setDependency(ITodoViewDependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "<set-?>");
        this.f139657j = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/at/view/TodoAtView$show$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.a$j */
    public static final class C56470j extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f139667a;

        /* renamed from: b */
        final /* synthetic */ Function0 f139668b;

        public void onAnimationEnd(Animator animator) {
            this.f139668b.invoke();
            this.f139667a.removeListener(this);
        }

        C56470j(ValueAnimator valueAnimator, Function0 function0) {
            this.f139667a = valueAnimator;
            this.f139668b = function0;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/lark/todo/impl/features/detail/at/view/TodoAtView$initAnimator$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.a$c */
    public static final class C56462c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f139658a;

        /* renamed from: b */
        final /* synthetic */ TodoAtView f139659b;

        C56462c(ValueAnimator valueAnimator, TodoAtView aVar) {
            this.f139658a = valueAnimator;
            this.f139659b = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TodoAtView aVar = this.f139659b;
            aVar.setTranslationY(((float) aVar.getHeight()) - (((float) this.f139659b.getHeight()) * this.f139658a.getAnimatedFraction()));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/lark/todo/impl/features/detail/at/view/TodoAtView$initAnimator$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.a$e */
    public static final class C56464e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f139661a;

        /* renamed from: b */
        final /* synthetic */ TodoAtView f139662b;

        C56464e(ValueAnimator valueAnimator, TodoAtView aVar) {
            this.f139661a = valueAnimator;
            this.f139662b = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TodoAtView aVar = this.f139662b;
            aVar.setTranslationY(((float) aVar.getHeight()) * this.f139661a.getAnimatedFraction());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtBean;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.a$i */
    public static final class C56468i<T> implements AbstractC1178x<List<? extends AtBean>> {

        /* renamed from: a */
        final /* synthetic */ TodoAtView f139666a;

        C56468i(TodoAtView aVar) {
            this.f139666a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(final List<? extends AtBean> list) {
            if (!CollectionUtils.isEmpty(list)) {
                this.f139666a.mo192256a(new Function0<Unit>(this) {
                    /* class com.ss.android.lark.todo.impl.features.detail.at.view.TodoAtView.C56468i.C564691 */
                    final /* synthetic */ C56468i this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final void invoke() {
                        AtSelectAdapter eVar = this.this$0.f139666a.f139649a;
                        if (eVar != null) {
                            eVar.resetAll(list);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo192256a(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "callback");
        this.f139657j.mo192245a(true);
        if (getVisibility() == 0) {
            function0.invoke();
            return;
        }
        this.f139654g = true;
        ValueAnimator valueAnimator = this.f139652e;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            valueAnimator.addListener(new C56470j(valueAnimator, function0));
            valueAnimator.start();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/MotionEvent;", "onTouch", "com/ss/android/lark/todo/impl/features/detail/at/view/TodoAtView$initView$3$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.a$h */
    public static final class View$OnTouchListenerC56467h implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ TodoAtView f139665a;

        View$OnTouchListenerC56467h(TodoAtView aVar) {
            this.f139665a = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f139665a.mo192258b();
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoAtView(Context context, TodoAtViewModel bVar, boolean z, ITodoViewDependency bVar2) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "viewModel");
        Intrinsics.checkParameterIsNotNull(bVar2, "dependency");
        this.f139655h = bVar;
        this.f139656i = z;
        this.f139657j = bVar2;
        LayoutInflater.from(context).inflate(R.layout.todo_detail_at_float, (ViewGroup) this, true);
        m220055e();
        m220054d();
    }
}
