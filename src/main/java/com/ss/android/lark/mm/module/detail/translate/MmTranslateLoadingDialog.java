package com.ss.android.lark.mm.module.detail.translate;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLoadingDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "onDismissCallback", "Lkotlin/Function0;", "", "getOnDismissCallback", "()Lkotlin/jvm/functions/Function0;", "setOnDismissCallback", "(Lkotlin/jvm/functions/Function0;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.translate.c */
public final class MmTranslateLoadingDialog extends DialogInterface$OnCancelListenerC1021b {

    /* renamed from: c */
    public static final Companion f116646c = new Companion(null);

    /* renamed from: d */
    private Function0<Unit> f116647d;

    /* renamed from: e */
    private HashMap f116648e;

    /* renamed from: a */
    public View mo162762a(int i) {
        if (this.f116648e == null) {
            this.f116648e = new HashMap();
        }
        View view = (View) this.f116648e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f116648e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: g */
    public void mo162765g() {
        HashMap hashMap = this.f116648e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo162765g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLoadingDialog$Companion;", "", "()V", "newInstance", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLoadingDialog;", "isExitTranslate", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.translate.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MmTranslateLoadingDialog mo162766a(boolean z) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isExitTranslate", z);
            MmTranslateLoadingDialog cVar = new MmTranslateLoadingDialog();
            cVar.setArguments(bundle);
            return cVar;
        }
    }

    /* renamed from: f */
    public final Function0<Unit> mo162764f() {
        return this.f116647d;
    }

    /* renamed from: a */
    public final void mo162763a(Function0<Unit> function0) {
        this.f116647d = function0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.translate.c$b */
    static final class C46305b extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmTranslateLoadingDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46305b(MmTranslateLoadingDialog cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C45855f.m181664c("MmTranslateLoadingDialog", "click crossIcon");
            Function0<Unit> f = this.this$0.mo162764f();
            if (f != null) {
                f.invoke();
            }
            this.this$0.u_();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        int i;
        Window window;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        Dialog v_ = v_();
        if (!(v_ == null || (window = v_.getWindow()) == null)) {
            window.setBackgroundDrawableResource(17170445);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("isExitTranslate");
        } else {
            z = true;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) mo162762a(R.id.translatingLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "translatingLayout");
        int i2 = 8;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        constraintLayout.setVisibility(i);
        FrameLayout frameLayout = (FrameLayout) mo162762a(R.id.exitTranslateLayout);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "exitTranslateLayout");
        if (z) {
            i2 = 0;
        }
        frameLayout.setVisibility(i2);
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo162762a(R.id.crossIcon);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "crossIcon");
        C47110e.m186572a(appCompatImageView, UIUtils.dp2px(getContext(), 16.0f));
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo162762a(R.id.crossIcon);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "crossIcon");
        C47110e.m186573a(appCompatImageView2, new C46305b(this));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        mo5512a(false);
        return layoutInflater.inflate(R.layout.mm_translate_loading_dialog, viewGroup, false);
    }
}
