package com.ss.android.lark.calendar.impl.features.calendarview.timezone.widget;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\b\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u0004J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0006\u0010\u001d\u001a\u00020\u0014J\u0006\u0010\u001e\u001a\u00020\u0014J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\b\u0010 \u001a\u00020\u0014H\u0016J\u0006\u0010!\u001a\u00020\u0014J\u0006\u0010\"\u001a\u00020\u0014J\b\u0010#\u001a\u00020\u0014H\u0016R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006$"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/widget/DragShrinkDialog;", "Lcom/larksuite/framework/ui/BaseDialog;", "context", "Landroid/content/Context;", "themeResId", "", "(Landroid/content/Context;I)V", "mDialogDismissAnimatorListener", "com/ss/android/lark/calendar/impl/features/calendarview/timezone/widget/DragShrinkDialog$mDialogDismissAnimatorListener$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/widget/DragShrinkDialog$mDialogDismissAnimatorListener$1;", "mDialogShowAnimatorListener", "Landroid/animation/Animator$AnimatorListener;", "getMDialogShowAnimatorListener", "()Landroid/animation/Animator$AnimatorListener;", "topMargin", "getTopMargin", "()I", "setTopMargin", "(I)V", "initDialog", "", "contentResId", "initListener", "initView", "initWindow", "middleStatus", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "scrollToMiddle", "scrollToTop", "setTranslucentStatus", "show", "showWithoutAnimation", "smoothDismiss", "topStatus", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.b.a */
public class DragShrinkDialog extends BaseDialog {

    /* renamed from: a */
    private int f78390a;

    /* renamed from: b */
    private final C31075b f78391b = new C31075b(this);

    /* renamed from: c */
    private final Animator.AnimatorListener f78392c = new C31076c(this);

    public void am_() {
    }

    /* renamed from: i */
    public void mo112531i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Animator.AnimatorListener mo112527e() {
        return this.f78392c;
    }

    /* renamed from: d */
    private final void mo112227d() {
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).setListener(new C31074a(this));
    }

    /* renamed from: g */
    public final void mo112529g() {
        VerticalDragLayout verticalDragLayout = (VerticalDragLayout) findViewById(R.id.dragLayout);
        Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout, "dragLayout");
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).mo115976a(verticalDragLayout.getTranslationY(), BitmapDescriptorFactory.HUE_RED, this.f78392c);
    }

    /* renamed from: a */
    private final void mo112221a() {
        Window window = getWindow();
        if (window != null) {
            Intrinsics.checkExpressionValueIsNotNull(window, "window ?: return");
            View decorView = window.getDecorView();
            Intrinsics.checkExpressionValueIsNotNull(decorView, "window.decorView");
            decorView.setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        }
    }

    /* renamed from: f */
    public final void mo112528f() {
        VerticalDragLayout verticalDragLayout = (VerticalDragLayout) findViewById(R.id.dragLayout);
        Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout, "dragLayout");
        float translationY = verticalDragLayout.getTranslationY();
        VerticalDragLayout verticalDragLayout2 = (VerticalDragLayout) findViewById(R.id.dragLayout);
        Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout2, "dragLayout");
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).mo115976a(translationY, (float) verticalDragLayout2.getHeight(), this.f78391b);
    }

    /* renamed from: h */
    public final void mo112530h() {
        VerticalDragLayout verticalDragLayout = (VerticalDragLayout) findViewById(R.id.dragLayout);
        Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout, "dragLayout");
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).mo115976a(verticalDragLayout.getTranslationY(), (float) UIHelper.dp2px(250.0f), this.f78392c);
    }

    @Override // com.larksuite.framework.ui.BaseDialog
    public void show() {
        View findViewById = findViewById(R.id.shadowView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
        findViewById.setBackground(new ColorDrawable(UIHelper.getColor(R.color.static_black)));
        super.show();
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).mo115976a((float) DeviceUtils.getScreenHeight(getContext()), (float) UIHelper.dp2px(250.0f), this.f78392c);
    }

    /* renamed from: b */
    private final void mo112225b() {
        VerticalDragLayout verticalDragLayout = (VerticalDragLayout) findViewById(R.id.dragLayout);
        Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout, "dragLayout");
        ViewGroup.LayoutParams layoutParams = verticalDragLayout.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = this.f78390a;
            VerticalDragLayout verticalDragLayout2 = (VerticalDragLayout) findViewById(R.id.dragLayout);
            Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout2, "dragLayout");
            verticalDragLayout2.setLayoutParams(layoutParams2);
            VerticalDragLayout verticalDragLayout3 = (VerticalDragLayout) findViewById(R.id.dragLayout);
            Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout3, "dragLayout");
            verticalDragLayout3.setVisibility(8);
            View findViewById = findViewById(R.id.shadowView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
            findViewById.setBackground(new ColorDrawable(0));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo112524a(int i) {
        this.f78390a = i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/timezone/widget/DragShrinkDialog$mDialogShowAnimatorListener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.b.a$c */
    public static final class C31076c implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ DragShrinkDialog f78395a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.b.a$c$b */
        static final class View$OnClickListenerC31078b implements View.OnClickListener {

            /* renamed from: a */
            public static final View$OnClickListenerC31078b f78397a = new View$OnClickListenerC31078b();

            View$OnClickListenerC31078b() {
            }

            public final void onClick(View view) {
            }
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.b.a$c$a */
        static final class View$OnClickListenerC31077a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C31076c f78396a;

            View$OnClickListenerC31077a(C31076c cVar) {
                this.f78396a = cVar;
            }

            public final void onClick(View view) {
                this.f78396a.f78395a.mo112528f();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31076c(DragShrinkDialog aVar) {
            this.f78395a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f78395a.findViewById(R.id.shadowView).setOnClickListener(new View$OnClickListenerC31077a(this));
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            VerticalDragLayout verticalDragLayout = (VerticalDragLayout) this.f78395a.findViewById(R.id.dragLayout);
            Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout, "dragLayout");
            verticalDragLayout.setVisibility(0);
            this.f78395a.findViewById(R.id.shadowView).setOnClickListener(View$OnClickListenerC31078b.f78397a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/timezone/widget/DragShrinkDialog$initListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/VerticalDragLayout$ShrinkLayoutChangeListener;", "dragOffset", "", "totalOffset", "", "currentOffset", "onLayoutAnimCancel", "start", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/VerticalDragLayout$POSITION;", "end", "onLayoutAnimEnd", "onLayoutAnimStart", "startDrag", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.b.a$a */
    public static final class C31074a implements VerticalDragLayout.ShrinkLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ DragShrinkDialog f78393a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout.ShrinkLayoutChangeListener
        /* renamed from: a */
        public void mo110178a() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout.ShrinkLayoutChangeListener
        /* renamed from: a */
        public void mo110180a(VerticalDragLayout.POSITION position, VerticalDragLayout.POSITION position2) {
            Intrinsics.checkParameterIsNotNull(position, "start");
            Intrinsics.checkParameterIsNotNull(position2, "end");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31074a(DragShrinkDialog aVar) {
            this.f78393a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout.ShrinkLayoutChangeListener
        /* renamed from: a */
        public void mo110179a(float f, float f2) {
            if (f == BitmapDescriptorFactory.HUE_RED) {
                View findViewById = this.f78393a.findViewById(R.id.shadowView);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
                findViewById.setAlpha(0.7f);
                return;
            }
            View findViewById2 = this.f78393a.findViewById(R.id.shadowView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "shadowView");
            findViewById2.setAlpha(((f - f2) / f) * 0.7f);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout.ShrinkLayoutChangeListener
        /* renamed from: b */
        public void mo110181b(VerticalDragLayout.POSITION position, VerticalDragLayout.POSITION position2) {
            Intrinsics.checkParameterIsNotNull(position, "start");
            Intrinsics.checkParameterIsNotNull(position2, "end");
            if (VerticalDragLayout.POSITION.TOP == position2) {
                this.f78393a.mo112531i();
            } else if (VerticalDragLayout.POSITION.MIDDLE == position2) {
                this.f78393a.am_();
            } else if (VerticalDragLayout.POSITION.BOTTOM == position2) {
                this.f78393a.dismiss();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/timezone/widget/DragShrinkDialog$mDialogDismissAnimatorListener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.b.a$b */
    public static final class C31075b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ DragShrinkDialog f78394a;

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31075b(DragShrinkDialog aVar) {
            this.f78394a = aVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f78394a.dismiss();
        }

        public void onAnimationEnd(Animator animator) {
            this.f78394a.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo112526b(int i) {
        m115970c(i);
        mo112221a();
        mo112225b();
        mo112227d();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(50);
        }
        super.onCreate(bundle);
    }

    /* renamed from: c */
    private final void m115970c(int i) {
        WindowManager.LayoutParams layoutParams;
        setContentView(i);
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        if (layoutParams != null) {
            layoutParams.height = -1;
        }
        if (window != null) {
            window.setAttributes(layoutParams);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragShrinkDialog(Context context, int i) {
        super(context, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f78390a = UIUtils.dp2px(context, 44.0f);
    }
}
