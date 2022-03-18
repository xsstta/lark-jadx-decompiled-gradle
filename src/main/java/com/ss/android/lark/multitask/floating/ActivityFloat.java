package com.ss.android.lark.multitask.floating;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.larksuite.suite.R;
import com.ss.android.lark.floating.LKUIFloat;
import com.ss.android.lark.floating.enums.ShowPattern;
import com.ss.android.lark.floating.enums.SidePattern;
import com.ss.android.lark.floating.p1896c.AbstractC38339g;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J$\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/multitask/floating/ActivityFloat;", "", "()V", "attachContentView", "", "view", "Landroid/view/View;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "attachContentViewImpl", "rootView", "Lcom/ss/android/lark/multitask/floating/ActivityFloat$SingleView;", "createAppFloatWindowIfNeed", "callback", "Lkotlin/Function1;", "detachContentView", "tryDismiss", "Companion", "SingleView", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.floating.a */
public final class ActivityFloat {

    /* renamed from: a */
    public static final Companion f121610a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/multitask/floating/ActivityFloat$Companion;", "", "()V", "DEFAULT_POSITION_Y_CONTENT_EXIST", "", "FLOAT_ACTIVITY_TAG", "", "TAG", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.floating.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/multitask/floating/ActivityFloat$SingleView;", "", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "container", "Landroid/widget/FrameLayout;", "getContainer", "()Landroid/widget/FrameLayout;", "setContainer", "(Landroid/widget/FrameLayout;)V", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.floating.a$b */
    public static final class SingleView {

        /* renamed from: a */
        private FrameLayout f121611a;

        /* renamed from: a */
        public final FrameLayout mo168928a() {
            return this.f121611a;
        }

        public SingleView(View view) {
            FrameLayout frameLayout;
            if (view != null) {
                frameLayout = (FrameLayout) view.findViewById(R.id.vc_container);
            } else {
                frameLayout = null;
            }
            this.f121611a = frameLayout;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "rootView", "Lcom/ss/android/lark/multitask/floating/ActivityFloat$SingleView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.floating.a$c */
    public static final class C48294c extends Lambda implements Function1<SingleView, Unit> {
        final /* synthetic */ View $view;
        final /* synthetic */ ActivityFloat this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48294c(ActivityFloat aVar, View view) {
            super(1);
            this.this$0 = aVar;
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SingleView bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(SingleView bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "rootView");
            this.this$0.mo168926a(bVar, this.$view);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "rootView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke", "com/ss/android/lark/multitask/floating/ActivityFloat$createAppFloatWindowIfNeed$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.floating.a$d */
    public static final class C48295d implements AbstractC38339g {

        /* renamed from: a */
        final /* synthetic */ Function1 f121612a;

        /* renamed from: b */
        final /* synthetic */ AppCompatActivity f121613b;

        C48295d(Function1 function1, AppCompatActivity appCompatActivity) {
            this.f121612a = function1;
            this.f121613b = appCompatActivity;
        }

        @Override // com.ss.android.lark.floating.p1896c.AbstractC38339g
        /* renamed from: a */
        public final void mo140249a(View view) {
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.vc_container);
            this.f121612a.invoke(new SingleView(view));
        }
    }

    /* renamed from: a */
    private final void m190519a(AppCompatActivity appCompatActivity) {
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        if (LKUIFloat.f98419d.mo140151b(appCompatActivity2, appCompatActivity.getClass().getName())) {
            LKUIFloat.f98419d.mo140143a(appCompatActivity2, appCompatActivity.getClass().getName());
        }
    }

    /* renamed from: b */
    public final void mo168927b(View view, AppCompatActivity appCompatActivity) {
        FrameLayout frameLayout;
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "activity");
        View c = LKUIFloat.f98419d.mo140152c(appCompatActivity, appCompatActivity.getClass().getName());
        if (c != null) {
            frameLayout = (FrameLayout) c.findViewById(R.id.vc_container);
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        m190519a(appCompatActivity);
    }

    /* renamed from: a */
    private final void m190520a(AppCompatActivity appCompatActivity, Function1<? super SingleView, Unit> function1) {
        LKUIFloat.f98419d.mo140141a((Context) appCompatActivity).mo140129a(R.layout.container_single, new C48295d(function1, appCompatActivity)).mo140133a(appCompatActivity.getClass().getName()).mo140135a(true).mo140132a(SidePattern.RESULT_HORIZONTAL).mo140128a(8388613, 0, UIHelper.dp2px(44.0f)).mo140131a(ShowPattern.CURRENT_ACTIVITY).mo140137a();
    }

    /* renamed from: a */
    public final void mo168925a(View view, AppCompatActivity appCompatActivity) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "activity");
        m190520a(appCompatActivity, new C48294c(this, view));
        View e = LKUIFloat.f98419d.mo140155e(appCompatActivity.getClass().getSimpleName());
        if (e != null) {
            mo168926a(new SingleView(e), view);
        }
    }

    /* renamed from: a */
    public final void mo168926a(SingleView bVar, View view) {
        if (view.getParent() != null) {
            Log.m165383e("FloatCreator", "fatal error: attached view has parent already!");
            return;
        }
        FrameLayout a = bVar.mo168928a();
        if (a != null) {
            a.removeAllViews();
        }
        FrameLayout a2 = bVar.mo168928a();
        if (a2 != null) {
            a2.addView(view, new FrameLayout.LayoutParams(-2, -2));
        }
    }
}
