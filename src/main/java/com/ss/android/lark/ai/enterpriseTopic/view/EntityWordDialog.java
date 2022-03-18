package com.ss.android.lark.ai.enterpriseTopic.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p028b.C0745a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.DialogC22179a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ai.enterpriseTopic.C28551a;
import com.ss.android.lark.utils.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\u0012\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u000fH\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/ai/enterpriseTopic/view/EntityWordDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "theme", "", "(Landroid/content/Context;I)V", "ratingLayout", "Landroid/view/View;", "getRatingLayout", "()Landroid/view/View;", "checkContext", "", "dismiss", "", "initFloatView", "initMaxHeight", "initPeekHeight", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setEntityWordComponent", "component", "Lcom/ss/android/lark/ai/enterpriseTopic/view/NewEntityWordComponent;", "show", "Companion", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ai.enterpriseTopic.view.c */
public final class EntityWordDialog extends DialogC22179a {

    /* renamed from: c */
    public static final Companion f71895c = new Companion(null);

    /* renamed from: d */
    private final View f71896d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ai/enterpriseTopic/view/EntityWordDialog$Companion;", "", "()V", "TAG", "", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.enterpriseTopic.view.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: e */
    public final View mo101734e() {
        return this.f71896d;
    }

    @Override // androidx.appcompat.app.DialogC0259b
    public void dismiss() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        if (m104787a(context)) {
            super.dismiss();
        }
    }

    public void show() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        if (m104787a(context)) {
            super.show();
        }
    }

    /* renamed from: g */
    private final void m104789g() {
        int screenHeight = (int) (((float) UIUtils.getScreenHeight(getContext())) * 0.8f);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, screenHeight);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setGravity(80);
        }
    }

    /* renamed from: f */
    private final void m104788f() {
        FrameLayout frameLayout;
        View decorView;
        Window window = getWindow();
        ViewGroup.LayoutParams layoutParams = null;
        if (window == null || (decorView = window.getDecorView()) == null) {
            frameLayout = null;
        } else {
            frameLayout = (FrameLayout) decorView.findViewById(R.id.design_bottom_sheet);
        }
        if (frameLayout != null) {
            frameLayout.scrollTo(0, 0);
        }
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
        }
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof BottomSheetBehavior) {
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) behavior;
                bottomSheetBehavior.mo76702a((int) (((float) UIUtils.getScreenHeight(getContext())) * 0.8f));
                bottomSheetBehavior.mo76706a(new C28576b(this));
            }
        }
    }

    /* renamed from: h */
    private final void m104790h() {
        FrameLayout frameLayout;
        View decorView;
        Window window = getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            frameLayout = null;
        } else {
            frameLayout = (FrameLayout) decorView.findViewById(R.id.container);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, UIUtils.dp2px(getContext(), 36.0f));
        layoutParams.gravity = 8388693;
        layoutParams.setMarginEnd(UIUtils.dp2px(getContext(), 12.0f));
        layoutParams.bottomMargin = UIUtils.dp2px(getContext(), 34.0f);
        if (frameLayout != null) {
            frameLayout.addView(this.f71896d, layoutParams);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u001a\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"com/ss/android/lark/ai/enterpriseTopic/view/EntityWordDialog$initPeekHeight$1", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "isDownward", "", "()Z", "setDownward", "(Z)V", "lastSlideOffset", "", "getLastSlideOffset", "()F", "setLastSlideOffset", "(F)V", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "onStateChanged", "newState", "", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.enterpriseTopic.view.c$b */
    public static final class C28576b extends BottomSheetBehavior.AbstractC22177a {

        /* renamed from: a */
        final /* synthetic */ EntityWordDialog f71897a;

        /* renamed from: b */
        private float f71898b;

        /* renamed from: c */
        private boolean f71899c;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C28576b(EntityWordDialog cVar) {
            this.f71897a = cVar;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC22177a
        /* renamed from: a */
        public void mo24937a(View view, float f) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
            float a = C0745a.m3626a(f, -1.0f, (float) BitmapDescriptorFactory.HUE_RED);
            if (a < this.f71898b) {
                z = true;
            } else {
                z = false;
            }
            this.f71899c = z;
            this.f71898b = a;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC22177a
        /* renamed from: a */
        public void mo24938a(View view, int i) {
            Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
            if (i == 5) {
                this.f71897a.dismiss();
            } else if (i == 2 && this.f71899c && Math.abs(this.f71898b) >= 0.3f) {
                this.f71897a.dismiss();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EntityWordDialog(Context context) {
        this(context, R.style.BottomSheetDialog);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final boolean m104787a(Context context) {
        return C28551a.m104696a(ViewUtils.m224141a(context));
    }

    /* renamed from: a */
    public final void mo101733a(NewEntityWordComponent eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "component");
        eVar.mo101722e();
        super.setContentView(eVar.mo101721d());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.DialogC0259b, com.google.android.material.bottomsheet.DialogC22179a
    public void onCreate(Bundle bundle) {
        View findViewById;
        super.onCreate(bundle);
        m104788f();
        m104789g();
        m104790h();
        Window window = getWindow();
        if (window != null) {
            window.setDimAmount(0.4f);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setWindowAnimations(R.style.BottomDialogAnim);
        }
        Window window3 = getWindow();
        if (window3 != null && (findViewById = window3.findViewById(R.id.design_bottom_sheet)) != null) {
            findViewById.setBackgroundColor(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EntityWordDialog(Context context, int i) {
        super(context, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.abbr_rating_layout, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…abbr_rating_layout, null)");
        this.f71896d = inflate;
    }
}
