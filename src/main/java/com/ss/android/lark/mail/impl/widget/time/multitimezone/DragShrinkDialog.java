package com.ss.android.lark.mail.impl.widget.time.multitimezone;

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
import com.ss.android.lark.mail.impl.widget.time.multitimezone.VerticalDragLayout;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0004J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0006\u0010\u0017\u001a\u00020\u000eJ\u0006\u0010\u0018\u001a\u00020\u000eJ\b\u0010\u0019\u001a\u00020\u000eH\u0016J\u0006\u0010\u001a\u001a\u00020\u000eJ\u0006\u0010\u001b\u001a\u00020\u000eJ\b\u0010\u001c\u001a\u00020\u000eH\u0016R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/DragShrinkDialog;", "Lcom/larksuite/framework/ui/BaseDialog;", "context", "Landroid/content/Context;", "themeResId", "", "(Landroid/content/Context;I)V", "mDialogDismissAnimatorListener", "com/ss/android/lark/mail/impl/widget/time/multitimezone/DragShrinkDialog$mDialogDismissAnimatorListener$1", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/DragShrinkDialog$mDialogDismissAnimatorListener$1;", "mDialogShowAnimatorListener", "com/ss/android/lark/mail/impl/widget/time/multitimezone/DragShrinkDialog$mDialogShowAnimatorListener$1", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/DragShrinkDialog$mDialogShowAnimatorListener$1;", "initDialog", "", "contentResId", "initListener", "initView", "initWindow", "middleStatus", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "scrollToMiddle", "scrollToTop", "show", "showWithoutAnimation", "smoothDismiss", "topStatus", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.a */
public class DragShrinkDialog extends BaseDialog {

    /* renamed from: a */
    private final C44104b f111992a = new C44104b(this);

    /* renamed from: b */
    private final C44105c f111993b = new C44105c(this);

    /* renamed from: d */
    public void mo156941d() {
    }

    /* renamed from: e */
    public void mo156942e() {
    }

    /* renamed from: g */
    private final void mo157041g() {
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).setListener(new C44103a(this));
    }

    /* renamed from: a */
    public final void mo156937a() {
        VerticalDragLayout verticalDragLayout = (VerticalDragLayout) findViewById(R.id.dragLayout);
        Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout, "dragLayout");
        float translationY = verticalDragLayout.getTranslationY();
        VerticalDragLayout verticalDragLayout2 = (VerticalDragLayout) findViewById(R.id.dragLayout);
        Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout2, "dragLayout");
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).mo156921a(translationY, (float) verticalDragLayout2.getHeight(), this.f111992a);
    }

    /* renamed from: c */
    public final void mo156940c() {
        VerticalDragLayout verticalDragLayout = (VerticalDragLayout) findViewById(R.id.dragLayout);
        Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout, "dragLayout");
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).mo156921a(verticalDragLayout.getTranslationY(), (float) UIHelper.dp2px(250.0f), this.f111993b);
    }

    /* renamed from: f */
    private final void mo157040f() {
        VerticalDragLayout verticalDragLayout = (VerticalDragLayout) findViewById(R.id.dragLayout);
        Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout, "dragLayout");
        ViewGroup.LayoutParams layoutParams = verticalDragLayout.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = UIUtils.dp2px(getContext(), 44.0f);
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

    /* renamed from: b */
    public final void mo156939b() {
        VerticalDragLayout verticalDragLayout = (VerticalDragLayout) findViewById(R.id.dragLayout);
        Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout, "dragLayout");
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).mo156921a(verticalDragLayout.getTranslationY(), BitmapDescriptorFactory.HUE_RED, this.f111993b);
    }

    @Override // com.larksuite.framework.ui.BaseDialog
    public void show() {
        View findViewById = findViewById(R.id.shadowView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
        findViewById.setBackground(new ColorDrawable(UIHelper.getColor(R.color.lkui_N900)));
        super.show();
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).mo156921a((float) DeviceUtils.getScreenHeight(getContext()), (float) UIHelper.dp2px(250.0f), this.f111993b);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mail/impl/widget/time/multitimezone/DragShrinkDialog$mDialogShowAnimatorListener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.a$c */
    public static final class C44105c implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ DragShrinkDialog f111996a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.a$c$b */
        static final class View$OnClickListenerC44107b implements View.OnClickListener {

            /* renamed from: a */
            public static final View$OnClickListenerC44107b f111998a = new View$OnClickListenerC44107b();

            View$OnClickListenerC44107b() {
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
        /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.a$c$a */
        static final class View$OnClickListenerC44106a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C44105c f111997a;

            View$OnClickListenerC44106a(C44105c cVar) {
                this.f111997a = cVar;
            }

            public final void onClick(View view) {
                this.f111997a.f111996a.mo156937a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44105c(DragShrinkDialog aVar) {
            this.f111996a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f111996a.findViewById(R.id.shadowView).setOnClickListener(new View$OnClickListenerC44106a(this));
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            VerticalDragLayout verticalDragLayout = (VerticalDragLayout) this.f111996a.findViewById(R.id.dragLayout);
            Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout, "dragLayout");
            verticalDragLayout.setVisibility(0);
            this.f111996a.findViewById(R.id.shadowView).setOnClickListener(View$OnClickListenerC44107b.f111998a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/mail/impl/widget/time/multitimezone/DragShrinkDialog$initListener$1", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/VerticalDragLayout$ShrinkLayoutChangeListener;", "dragOffset", "", "totalOffset", "", "currentOffset", "onLayoutAnimCancel", "start", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/VerticalDragLayout$POSITION;", "end", "onLayoutAnimEnd", "onLayoutAnimStart", "startDrag", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.a$a */
    public static final class C44103a implements VerticalDragLayout.ShrinkLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ DragShrinkDialog f111994a;

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.VerticalDragLayout.ShrinkLayoutChangeListener
        /* renamed from: a */
        public void mo156927a() {
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.VerticalDragLayout.ShrinkLayoutChangeListener
        /* renamed from: a */
        public void mo156929a(VerticalDragLayout.POSITION position, VerticalDragLayout.POSITION position2) {
            Intrinsics.checkParameterIsNotNull(position, "start");
            Intrinsics.checkParameterIsNotNull(position2, "end");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44103a(DragShrinkDialog aVar) {
            this.f111994a = aVar;
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.VerticalDragLayout.ShrinkLayoutChangeListener
        /* renamed from: a */
        public void mo156928a(float f, float f2) {
            if (f == BitmapDescriptorFactory.HUE_RED) {
                View findViewById = this.f111994a.findViewById(R.id.shadowView);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
                findViewById.setAlpha(0.6f);
                return;
            }
            View findViewById2 = this.f111994a.findViewById(R.id.shadowView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "shadowView");
            findViewById2.setAlpha(((f - f2) / f) * 0.6f);
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.VerticalDragLayout.ShrinkLayoutChangeListener
        /* renamed from: b */
        public void mo156930b(VerticalDragLayout.POSITION position, VerticalDragLayout.POSITION position2) {
            Intrinsics.checkParameterIsNotNull(position, "start");
            Intrinsics.checkParameterIsNotNull(position2, "end");
            if (VerticalDragLayout.POSITION.TOP == position2) {
                this.f111994a.mo156941d();
            } else if (VerticalDragLayout.POSITION.MIDDLE == position2) {
                this.f111994a.mo156942e();
            } else if (VerticalDragLayout.POSITION.BOTTOM == position2) {
                this.f111994a.dismiss();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mail/impl/widget/time/multitimezone/DragShrinkDialog$mDialogDismissAnimatorListener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.a$b */
    public static final class C44104b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ DragShrinkDialog f111995a;

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44104b(DragShrinkDialog aVar) {
            this.f111995a = aVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f111995a.dismiss();
        }

        public void onAnimationEnd(Animator animator) {
            this.f111995a.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo156938a(int i) {
        m174689b(i);
        mo157040f();
        mo157041g();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(50);
        }
        super.onCreate(bundle);
    }

    /* renamed from: b */
    private final void m174689b(int i) {
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
    }
}
