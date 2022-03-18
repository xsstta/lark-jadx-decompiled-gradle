package com.ss.android.lark.todo.impl.features.mainview.widget.sort;

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
import com.ss.android.lark.todo.impl.features.mainview.widget.sort.VerticalDragLayout;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0004J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\u0012\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\u0006\u0010\u0019\u001a\u00020\u000fR\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/DragShrinkDialog;", "Lcom/larksuite/framework/ui/BaseDialog;", "context", "Landroid/content/Context;", "themeResId", "", "(Landroid/content/Context;I)V", "mDialogDismissAnimatorListener", "com/ss/android/lark/todo/impl/features/mainview/widget/sort/DragShrinkDialog$mDialogDismissAnimatorListener$1", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/DragShrinkDialog$mDialogDismissAnimatorListener$1;", "mDialogShowAnimatorListener", "com/ss/android/lark/todo/impl/features/mainview/widget/sort/DragShrinkDialog$mDialogShowAnimatorListener$1", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/DragShrinkDialog$mDialogShowAnimatorListener$1;", "topMargin", "initDialog", "", "contentResId", "initListener", "initView", "initWindow", "middleStatus", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "show", "smoothDismiss", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.sort.a */
public class DragShrinkDialog extends BaseDialog {

    /* renamed from: a */
    private int f140539a;

    /* renamed from: b */
    private final C56943b f140540b = new C56943b(this);

    /* renamed from: c */
    private final C56944c f140541c = new C56944c(this);

    /* renamed from: b */
    public void mo193471b() {
    }

    /* renamed from: d */
    private final void m221041d() {
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).setListener(new C56942a(this));
    }

    /* renamed from: a */
    public final void mo193469a() {
        VerticalDragLayout verticalDragLayout = (VerticalDragLayout) findViewById(R.id.dragLayout);
        Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout, "dragLayout");
        float translationY = verticalDragLayout.getTranslationY();
        VerticalDragLayout verticalDragLayout2 = (VerticalDragLayout) findViewById(R.id.dragLayout);
        Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout2, "dragLayout");
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).mo193455a(translationY, (float) verticalDragLayout2.getHeight(), this.f140540b);
    }

    /* renamed from: c */
    private final void m221040c() {
        VerticalDragLayout verticalDragLayout = (VerticalDragLayout) findViewById(R.id.dragLayout);
        Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout, "dragLayout");
        ViewGroup.LayoutParams layoutParams = verticalDragLayout.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = this.f140539a;
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

    @Override // com.larksuite.framework.ui.BaseDialog
    public void show() {
        View findViewById = findViewById(R.id.shadowView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
        findViewById.setBackground(new ColorDrawable(UIHelper.getColor(R.color.lkui_N900)));
        super.show();
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).mo193455a((float) DeviceUtils.getScreenHeight(getContext()), (float) UIHelper.dp2px(250.0f), this.f140541c);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/widget/sort/DragShrinkDialog$mDialogShowAnimatorListener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.sort.a$c */
    public static final class C56944c implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ DragShrinkDialog f140544a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.sort.a$c$b */
        static final class View$OnClickListenerC56946b implements View.OnClickListener {

            /* renamed from: a */
            public static final View$OnClickListenerC56946b f140546a = new View$OnClickListenerC56946b();

            View$OnClickListenerC56946b() {
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
        /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.sort.a$c$a */
        static final class View$OnClickListenerC56945a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C56944c f140545a;

            View$OnClickListenerC56945a(C56944c cVar) {
                this.f140545a = cVar;
            }

            public final void onClick(View view) {
                this.f140545a.f140544a.mo193469a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56944c(DragShrinkDialog aVar) {
            this.f140544a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f140544a.findViewById(R.id.shadowView).setOnClickListener(new View$OnClickListenerC56945a(this));
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            VerticalDragLayout verticalDragLayout = (VerticalDragLayout) this.f140544a.findViewById(R.id.dragLayout);
            Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout, "dragLayout");
            verticalDragLayout.setVisibility(0);
            this.f140544a.findViewById(R.id.shadowView).setOnClickListener(View$OnClickListenerC56946b.f140546a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/widget/sort/DragShrinkDialog$initListener$1", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/VerticalDragLayout$ShrinkLayoutChangeListener;", "dragOffset", "", "totalOffset", "", "currentOffset", "onLayoutAnimCancel", "start", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/VerticalDragLayout$POSITION;", "end", "onLayoutAnimEnd", "onLayoutAnimStart", "startDrag", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.sort.a$a */
    public static final class C56942a implements VerticalDragLayout.ShrinkLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ DragShrinkDialog f140542a;

        @Override // com.ss.android.lark.todo.impl.features.mainview.widget.sort.VerticalDragLayout.ShrinkLayoutChangeListener
        /* renamed from: a */
        public void mo193459a() {
        }

        @Override // com.ss.android.lark.todo.impl.features.mainview.widget.sort.VerticalDragLayout.ShrinkLayoutChangeListener
        /* renamed from: a */
        public void mo193461a(VerticalDragLayout.POSITION position, VerticalDragLayout.POSITION position2) {
            Intrinsics.checkParameterIsNotNull(position, "start");
            Intrinsics.checkParameterIsNotNull(position2, "end");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56942a(DragShrinkDialog aVar) {
            this.f140542a = aVar;
        }

        @Override // com.ss.android.lark.todo.impl.features.mainview.widget.sort.VerticalDragLayout.ShrinkLayoutChangeListener
        /* renamed from: b */
        public void mo193462b(VerticalDragLayout.POSITION position, VerticalDragLayout.POSITION position2) {
            Intrinsics.checkParameterIsNotNull(position, "start");
            Intrinsics.checkParameterIsNotNull(position2, "end");
            if (VerticalDragLayout.POSITION.MIDDLE == position2) {
                this.f140542a.mo193471b();
            } else if (VerticalDragLayout.POSITION.BOTTOM == position2) {
                this.f140542a.dismiss();
            }
        }

        @Override // com.ss.android.lark.todo.impl.features.mainview.widget.sort.VerticalDragLayout.ShrinkLayoutChangeListener
        /* renamed from: a */
        public void mo193460a(float f, float f2) {
            if (f == BitmapDescriptorFactory.HUE_RED) {
                View findViewById = this.f140542a.findViewById(R.id.shadowView);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
                findViewById.setAlpha(0.6f);
                return;
            }
            View findViewById2 = this.f140542a.findViewById(R.id.shadowView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "shadowView");
            findViewById2.setAlpha(((f - f2) / f) * 0.6f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/widget/sort/DragShrinkDialog$mDialogDismissAnimatorListener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.sort.a$b */
    public static final class C56943b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ DragShrinkDialog f140543a;

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56943b(DragShrinkDialog aVar) {
            this.f140543a = aVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f140543a.dismiss();
        }

        public void onAnimationEnd(Animator animator) {
            this.f140543a.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo193470a(int i) {
        m221039b(i);
        m221040c();
        m221041d();
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
    private final void m221039b(int i) {
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
        this.f140539a = UIUtils.dp2px(context, 44.0f);
    }
}
