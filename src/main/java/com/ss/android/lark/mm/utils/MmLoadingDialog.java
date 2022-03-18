package com.ss.android.lark.mm.utils;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001aB#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/mm/utils/MmLoadingDialog;", "Landroidx/fragment/app/DialogFragment;", "mode", "Lcom/ss/android/lark/mm/utils/MmLoadingDialog$Builder$Mode;", "isCancellable", "", "loadingText", "", "(Lcom/ss/android/lark/mm/utils/MmLoadingDialog$Builder$Mode;ZLjava/lang/String;)V", "onDismissCallback", "Lkotlin/Function0;", "", "getOnDismissCallback", "()Lkotlin/jvm/functions/Function0;", "setOnDismissCallback", "(Lkotlin/jvm/functions/Function0;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Builder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmLoadingDialog extends DialogInterface$OnCancelListenerC1021b {

    /* renamed from: c */
    private Function0<Unit> f118587c;

    /* renamed from: d */
    private final Builder.Mode f118588d;

    /* renamed from: e */
    private final boolean f118589e;

    /* renamed from: f */
    private final String f118590f;

    /* renamed from: g */
    private HashMap f118591g;

    /* renamed from: a */
    public View mo165456a(int i) {
        if (this.f118591g == null) {
            this.f118591g = new HashMap();
        }
        View view = (View) this.f118591g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f118591g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: g */
    public void mo165458g() {
        HashMap hashMap = this.f118591g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo165458g();
    }

    /* renamed from: f */
    public final Function0<Unit> mo165457f() {
        return this.f118587c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/mm/utils/MmLoadingDialog$Builder;", "", "mode", "Lcom/ss/android/lark/mm/utils/MmLoadingDialog$Builder$Mode;", "(Lcom/ss/android/lark/mm/utils/MmLoadingDialog$Builder$Mode;)V", "isCancellable", "", "loadingText", "", "getMode", "()Lcom/ss/android/lark/mm/utils/MmLoadingDialog$Builder$Mode;", "build", "Lcom/ss/android/lark/mm/utils/MmLoadingDialog;", "Mode", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Builder {

        /* renamed from: a */
        private String f118592a;

        /* renamed from: b */
        private boolean f118593b;

        /* renamed from: c */
        private final Mode f118594c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/utils/MmLoadingDialog$Builder$Mode;", "", "(Ljava/lang/String;I)V", "Small", "Large", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        public enum Mode {
            Small,
            Large
        }

        public Builder() {
            this(null, 1, null);
        }

        /* renamed from: a */
        public final MmLoadingDialog mo165459a() {
            return new MmLoadingDialog(this.f118594c, this.f118593b, this.f118592a, null);
        }

        public Builder(Mode mode) {
            Intrinsics.checkParameterIsNotNull(mode, "mode");
            this.f118594c = mode;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Builder(Mode mode, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Mode.Small : mode);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.utils.MmLoadingDialog$a */
    static final class C47089a extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmLoadingDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47089a(MmLoadingDialog mmLoadingDialog) {
            super(1);
            this.this$0 = mmLoadingDialog;
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
            C45855f.m181664c("MmLoadingDialog", "click crossIcon");
            Function0<Unit> f = this.this$0.mo165457f();
            if (f != null) {
                f.invoke();
            }
            this.this$0.u_();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        Dialog v_ = v_();
        if (!(v_ == null || (window = v_.getWindow()) == null)) {
            window.setBackgroundDrawableResource(17170445);
        }
        int i = 0;
        if (this.f118588d == Builder.Mode.Small) {
            FrameLayout frameLayout = (FrameLayout) mo165456a(R.id.smallLoadingLayout);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "smallLoadingLayout");
            frameLayout.setVisibility(0);
            ConstraintLayout constraintLayout = (ConstraintLayout) mo165456a(R.id.largeLoadingLayout);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "largeLoadingLayout");
            constraintLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout2 = (FrameLayout) mo165456a(R.id.smallLoadingLayout);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "smallLoadingLayout");
        frameLayout2.setVisibility(8);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) mo165456a(R.id.largeLoadingLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "largeLoadingLayout");
        constraintLayout2.setVisibility(0);
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo165456a(R.id.crossIcon);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "crossIcon");
        if (!this.f118589e) {
            i = 8;
        }
        appCompatImageView.setVisibility(i);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo165456a(R.id.crossIcon);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "crossIcon");
        C47110e.m186572a(appCompatImageView2, UIUtils.dp2px(getContext(), 16.0f));
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) mo165456a(R.id.crossIcon);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView3, "crossIcon");
        C47110e.m186573a(appCompatImageView3, new C47089a(this));
        TextView textView = (TextView) mo165456a(R.id.loadingTextView);
        Intrinsics.checkExpressionValueIsNotNull(textView, "loadingTextView");
        textView.setText(this.f118590f);
    }

    private MmLoadingDialog(Builder.Mode mode, boolean z, String str) {
        this.f118588d = mode;
        this.f118589e = z;
        this.f118590f = str;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        mo5512a(false);
        return layoutInflater.inflate(R.layout.mm_loading_dialog, viewGroup, false);
    }

    public /* synthetic */ MmLoadingDialog(Builder.Mode mode, boolean z, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(mode, z, str);
    }
}
