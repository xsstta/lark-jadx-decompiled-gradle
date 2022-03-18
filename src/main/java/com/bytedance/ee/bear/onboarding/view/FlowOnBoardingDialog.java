package com.bytedance.ee.bear.onboarding.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.onboarding.export.AbstractC10400d;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.AbstractC10394d;
import com.bytedance.ee.bear.onboarding.export.ui.FlowStyleHollowShape;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.C13655e;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13746i;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 N2\u00020\u0001:\u0001NB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J2\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\b\b\u0002\u0010+\u001a\u00020,H\u0002J0\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020'2\u0006\u00100\u001a\u00020'2\u0006\u00101\u001a\u00020'2\u0006\u00102\u001a\u00020'2\u0006\u0010+\u001a\u00020,H\u0002J\b\u00103\u001a\u00020.H\u0016J\u0010\u00104\u001a\u00020\f2\u0006\u00105\u001a\u000206H\u0016J­\u0001\u00107\u001a\u00020.2\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u0001092\b\u0010;\u001a\u0004\u0018\u00010\u000e2\b\u0010<\u001a\u0004\u0018\u00010\u000e2\u0006\u0010=\u001a\u00020\f2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\b2\b\u0010?\u001a\u0004\u0018\u00010\u000e2\b\u0010@\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010C\u001a\u0004\u0018\u0001092\n\b\u0002\u0010D\u001a\u0004\u0018\u0001092\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010GJ\b\u0010H\u001a\u00020.H\u0002J \u0010I\u001a\u00020.2\u0006\u0010J\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020\u000eH\u0014J\b\u0010M\u001a\u00020.H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/view/FlowOnBoardingDialog;", "Lcom/bytedance/ee/bear/onboarding/view/BaseOnBoardingDialog;", "activity", "Landroidx/fragment/app/FragmentActivity;", "currentActiveWindow", "Landroid/view/Window;", "(Landroidx/fragment/app/FragmentActivity;Landroid/view/Window;)V", "arrowView", "Landroid/view/View;", "confirmButton", "Landroid/widget/Button;", "consumeHighlightRectClickEvent", "", "customHighlightRectRadius", "", "highLightRectF", "Landroid/graphics/RectF;", "hintTv", "Landroid/widget/TextView;", "imageView", "Landroid/widget/ImageView;", "indexTv", "lottieView", "Lcom/bytedance/ee/bear/facade/common/widget/BearLottieView;", "maskView", "Lcom/bytedance/ee/bear/onboarding/view/MaskView;", "onHollowRectClickListener", "Lcom/bytedance/ee/bear/onboarding/export/mission/data/FlowHollowRectOnClickListener;", "getOnHollowRectClickListener", "()Lcom/bytedance/ee/bear/onboarding/export/mission/data/FlowHollowRectOnClickListener;", "setOnHollowRectClickListener", "(Lcom/bytedance/ee/bear/onboarding/export/mission/data/FlowHollowRectOnClickListener;)V", "panel", "skipButton", "titleTv", "touchPoint", "Landroid/graphics/PointF;", "calcHollowRect", "left", "", "top", "width", "height", "styleHollowShape", "Lcom/bytedance/ee/bear/onboarding/export/ui/FlowStyleHollowShape;", "calcOnBoardingPos", "", "originLeft", "originTop", "originWidth", "originHeight", "dismiss", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "initView", "title", "", "hint", "index", "count", "isLast", "targetView", "imageRes", "lottieAnimLoader", "Lcom/bytedance/ee/bear/onboarding/view/lottiestratege/ILottieAnimLoader;", "targetRect", "cancelText", "confirmText", "onBoardingColorStyle", "Lcom/bytedance/ee/bear/onboarding/export/OnBoardingColorStyle;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLandroid/view/View;Ljava/lang/Integer;Lcom/bytedance/ee/bear/onboarding/view/lottiestratege/ILottieAnimLoader;Landroid/graphics/RectF;Lcom/bytedance/ee/bear/onboarding/export/ui/FlowStyleHollowShape;ILjava/lang/String;Ljava/lang/String;Lcom/bytedance/ee/bear/onboarding/export/OnBoardingColorStyle;Z)V", "measurePanel", "setStyleColor", "bgColor", "shadowColor", "maskColor", "show", "Companion", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.onboarding.view.c */
public final class FlowOnBoardingDialog extends AbstractDialogC10436a {

    /* renamed from: g */
    public static final String f28052g;

    /* renamed from: h */
    public static final Companion f28053h = new Companion(null);

    /* renamed from: e */
    public final RectF f28054e = new RectF();

    /* renamed from: f */
    public PointF f28055f = new PointF();

    /* renamed from: i */
    private final TextView f28056i;

    /* renamed from: j */
    private final TextView f28057j;

    /* renamed from: k */
    private final View f28058k;

    /* renamed from: l */
    private final View f28059l;

    /* renamed from: m */
    private final TextView f28060m;

    /* renamed from: n */
    private final Button f28061n;

    /* renamed from: o */
    private final TextView f28062o;

    /* renamed from: p */
    private final MaskView f28063p;

    /* renamed from: q */
    private final ImageView f28064q;

    /* renamed from: r */
    private final BearLottieView f28065r;

    /* renamed from: s */
    private boolean f28066s;

    /* renamed from: t */
    private AbstractC10394d f28067t;

    /* renamed from: u */
    private int f28068u;

    /* renamed from: v */
    private final FragmentActivity f28069v;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/view/FlowOnBoardingDialog$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.view.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final AbstractC10394d mo39712a() {
        return this.f28067t;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.view.c$b */
    static final class RunnableC10445b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FlowOnBoardingDialog f28070a;

        RunnableC10445b(FlowOnBoardingDialog cVar) {
            this.f28070a = cVar;
        }

        public final void run() {
            this.f28070a.dismiss();
        }
    }

    @Override // com.bytedance.ee.bear.onboarding.view.AbstractDialogC10436a
    public void dismiss() {
        this.f28065r.cancelAnimation();
        super.dismiss();
    }

    static {
        String simpleName = FlowOnBoardingDialog.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "FlowOnBoardingDialog::class.java.simpleName");
        f28052g = simpleName;
    }

    /* renamed from: b */
    private final void m43372b() {
        this.f28059l.measure(View.MeasureSpec.makeMeasureSpec(this.f28069v.getResources().getDimensionPixelSize(R.dimen.onBoarding_tips_width), 1073741824), View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
    }

    @Override // com.bytedance.ee.bear.onboarding.view.AbstractDialogC10436a, com.bytedance.ee.bear.widgets.dialog.BaseDialog
    public void show() {
        float y = this.f28059l.getY() + ((float) this.f28059l.getMeasuredHeight());
        float f = (float) 0;
        if (this.f28059l.getY() < f || y > ((float) C13655e.m55413b())) {
            this.f28023b = false;
            AbstractC10400d.AbstractC10402b bVar = this.f28025d;
            if (bVar != null) {
                bVar.mo39602b();
            }
            AbstractC10400d.AbstractC10402b bVar2 = this.f28025d;
            if (bVar2 != null) {
                bVar2.mo39601a(this.f28023b);
            }
            if (this.f28059l.getY() < f) {
                C13479a.m54758a(f28052g, "OnbaordingDialog's top < 0, don't show.");
                return;
            }
            String str = f28052g;
            C13479a.m54758a(str, "OnbaordingDialog's height[" + y + "] > Screen'height[" + C13655e.m55413b() + "], don't show.");
            return;
        }
        super.show();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/onboarding/view/FlowOnBoardingDialog$initView$3", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.view.c$e */
    public static final class C10448e extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ FlowOnBoardingDialog f28073a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/onboarding/view/FlowOnBoardingDialog$initView$3$onClicked$1", "Landroid/content/DialogInterface$OnDismissListener;", "onDismiss", "", "dialog", "Landroid/content/DialogInterface;", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.onboarding.view.c$e$a */
        public static final class DialogInterface$OnDismissListenerC10449a implements DialogInterface.OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ C10448e f28074a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            DialogInterface$OnDismissListenerC10449a(C10448e eVar) {
                this.f28074a = eVar;
            }

            public void onDismiss(DialogInterface dialogInterface) {
                AbstractC10394d a = this.f28074a.f28073a.mo39712a();
                if (a != null) {
                    a.onClick();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10448e(FlowOnBoardingDialog cVar) {
            this.f28073a = cVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            if (this.f28073a.mo39712a() != null && this.f28073a.f28054e.contains(this.f28073a.f28055f.x, this.f28073a.f28055f.y)) {
                this.f28073a.f28023b = true;
                this.f28073a.setOnDismissListener(new DialogInterface$OnDismissListenerC10449a(this));
                this.f28073a.dismiss();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/onboarding/view/FlowOnBoardingDialog$initView$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.view.c$c */
    public static final class C10446c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ FlowOnBoardingDialog f28071a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10446c(FlowOnBoardingDialog cVar) {
            this.f28071a = cVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f28071a.f28023b = true;
            AbstractC10400d.AbstractC10402b bVar = this.f28071a.f28025d;
            if (bVar != null) {
                bVar.mo39602b();
            }
            this.f28071a.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/onboarding/view/FlowOnBoardingDialog$initView$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.view.c$d */
    public static final class C10447d extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ FlowOnBoardingDialog f28072a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10447d(FlowOnBoardingDialog cVar) {
            this.f28072a = cVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f28072a.f28023b = true;
            AbstractC10400d.AbstractC10402b bVar = this.f28072a.f28025d;
            if (bVar != null) {
                bVar.mo39600a();
            }
            this.f28072a.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0017¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/onboarding/view/FlowOnBoardingDialog$initView$4", "Landroid/view/View$OnTouchListener;", "onTouch", "", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.view.c$f */
    public static final class View$OnTouchListenerC10450f implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ FlowOnBoardingDialog f28075a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnTouchListenerC10450f(FlowOnBoardingDialog cVar) {
            this.f28075a = cVar;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent != null && motionEvent.getAction() == 1) {
                this.f28075a.f28055f.x = motionEvent.getX();
                this.f28075a.f28055f.y = motionEvent.getY();
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void mo39713a(AbstractC10394d dVar) {
        this.f28067t = dVar;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        if (!this.f28054e.contains(motionEvent.getX(), motionEvent.getY()) || !this.f28066s) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.f28023b = true;
        boolean dispatchTouchEvent = this.f28069v.dispatchTouchEvent(motionEvent);
        C13742g.m55706a(new RunnableC10445b(this), 500);
        return dispatchTouchEvent;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowOnBoardingDialog(FragmentActivity fragmentActivity, Window window) {
        super(fragmentActivity, window);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(window, "currentActiveWindow");
        this.f28069v = fragmentActivity;
        this.f28022a = LayoutInflater.from(fragmentActivity).inflate(R.layout.onboarding_flow_onboarding, (ViewGroup) null);
        View findViewById = this.f28022a.findViewById(R.id.onBoarding_flow_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "root.findViewById(R.id.onBoarding_flow_title)");
        this.f28056i = (TextView) findViewById;
        View findViewById2 = this.f28022a.findViewById(R.id.onBoarding_flow_hint);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "root.findViewById(R.id.onBoarding_flow_hint)");
        this.f28057j = (TextView) findViewById2;
        View findViewById3 = this.f28022a.findViewById(R.id.onBoarding_flow_arrow);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "root.findViewById(R.id.onBoarding_flow_arrow)");
        this.f28058k = findViewById3;
        View findViewById4 = this.f28022a.findViewById(R.id.onBoarding_flow_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "root.findViewById(R.id.onBoarding_flow_layout)");
        this.f28059l = findViewById4;
        View findViewById5 = this.f28022a.findViewById(R.id.onBoarding_flow_skip_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "root.findViewById(R.id.onBoarding_flow_skip_btn)");
        this.f28060m = (TextView) findViewById5;
        View findViewById6 = this.f28022a.findViewById(R.id.onBoarding_flow_confirm_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "root.findViewById(R.id.o…oarding_flow_confirm_btn)");
        this.f28061n = (Button) findViewById6;
        View findViewById7 = this.f28022a.findViewById(R.id.onBoarding_flow_index);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "root.findViewById(R.id.onBoarding_flow_index)");
        this.f28062o = (TextView) findViewById7;
        View findViewById8 = this.f28022a.findViewById(R.id.onBoarding_flow_image);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "root.findViewById(R.id.onBoarding_flow_image)");
        this.f28064q = (ImageView) findViewById8;
        View findViewById9 = this.f28022a.findViewById(R.id.onBoarding_flow_lottieView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "root.findViewById(R.id.onBoarding_flow_lottieView)");
        this.f28065r = (BearLottieView) findViewById9;
        View findViewById10 = this.f28022a.findViewById(R.id.onBoarding_flow_mask);
        Intrinsics.checkExpressionValueIsNotNull(findViewById10, "root.findViewById(R.id.onBoarding_flow_mask)");
        MaskView maskView = (MaskView) findViewById10;
        this.f28063p = maskView;
        maskView.setMaskColor(C25653b.m91893a(C13749l.m55755c(getContext(), R.color.space_kit_n1000), 0.2f));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.onboarding.view.AbstractDialogC10436a
    /* renamed from: a */
    public void mo39697a(int i, int i2, int i3) {
        this.f28063p.setMaskColor(i3);
        this.f28059l.setBackgroundTintList(ColorStateList.valueOf(i));
        this.f28058k.setBackgroundTintList(ColorStateList.valueOf(i));
        this.f28061n.setTextColor(i);
        if (Build.VERSION.SDK_INT >= 28) {
            this.f28059l.setOutlineSpotShadowColor(i2);
            this.f28059l.setOutlineAmbientShadowColor(i2);
            this.f28058k.setOutlineSpotShadowColor(i2);
            this.f28058k.setOutlineAmbientShadowColor(i2);
            this.f28061n.setOutlineSpotShadowColor(i2);
            this.f28061n.setOutlineAmbientShadowColor(i2);
        }
    }

    /* renamed from: a */
    private final void m43370a(float f, float f2, float f3, float f4, FlowStyleHollowShape flowStyleHollowShape) {
        float f5;
        float f6;
        float f7;
        RectF b = m43371b(f, f2, f3, f4, flowStyleHollowShape);
        float f8 = b.left;
        float f9 = b.top;
        float f10 = b.right;
        float f11 = b.bottom;
        this.f28054e.left = f8;
        this.f28054e.right = f10;
        this.f28054e.top = f9;
        this.f28054e.bottom = f11;
        Window window = this.f28069v.getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
        View decorView = window.getDecorView();
        Intrinsics.checkExpressionValueIsNotNull(decorView, "activity.window.decorView");
        int measuredWidth = decorView.getMeasuredWidth();
        int measuredHeight = decorView.getMeasuredHeight();
        int a = C13746i.m55722a((Context) this.f28069v);
        int dimensionPixelSize = this.f28069v.getResources().getDimensionPixelSize(R.dimen.space_kit_len_8);
        int dimensionPixelSize2 = this.f28069v.getResources().getDimensionPixelSize(R.dimen.onBoarding_arrow_width);
        if (f9 - ((float) a) > ((float) measuredHeight) - f11) {
            float f12 = (float) dimensionPixelSize2;
            f5 = (f9 - f12) - ((float) dimensionPixelSize);
            f6 = ((f12 / ((float) 2)) + f5) - ((float) this.f28059l.getMeasuredHeight());
        } else {
            f5 = ((float) dimensionPixelSize) + f11;
            f6 = (((float) dimensionPixelSize2) / ((float) 2)) + f5;
        }
        float f13 = f8 + f10;
        float f14 = (float) 2;
        float f15 = f13 / f14;
        float dimensionPixelSize3 = (float) this.f28069v.getResources().getDimensionPixelSize(R.dimen.space_kit_len_16);
        if (f15 < dimensionPixelSize3) {
            f7 = dimensionPixelSize3;
        } else {
            float f16 = (float) measuredWidth;
            if (f16 - f15 < dimensionPixelSize3) {
                f7 = f16 - dimensionPixelSize3;
            } else {
                f7 = f15 - ((float) (dimensionPixelSize2 / 2));
            }
        }
        float measuredWidth2 = f15 - ((float) (this.f28059l.getMeasuredWidth() / 2));
        float f17 = dimensionPixelSize3 / f14;
        if (measuredWidth2 < f17) {
            measuredWidth2 = f17;
        } else if (((float) this.f28059l.getMeasuredWidth()) + measuredWidth2 + f17 > ((float) measuredWidth)) {
            measuredWidth2 = ((float) (measuredWidth - this.f28059l.getMeasuredWidth())) - f17;
        }
        this.f28058k.setX(f7);
        this.f28058k.setY(f5);
        this.f28059l.setX(measuredWidth2);
        this.f28059l.setY(f6);
    }

    /* renamed from: b */
    private final RectF m43371b(float f, float f2, float f3, float f4, FlowStyleHollowShape flowStyleHollowShape) {
        float f5;
        float f6;
        int i;
        float f7;
        RectF rectF = new RectF();
        Window window = this.f28069v.getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
        View decorView = window.getDecorView();
        Intrinsics.checkExpressionValueIsNotNull(decorView, "activity.window.decorView");
        int measuredWidth = decorView.getMeasuredWidth();
        int measuredHeight = decorView.getMeasuredHeight();
        int a = C13746i.m55722a((Context) this.f28069v);
        int dimensionPixelSize = this.f28069v.getResources().getDimensionPixelSize(R.dimen.space_kit_len_3);
        int dimensionPixelSize2 = this.f28069v.getResources().getDimensionPixelSize(R.dimen.space_kit_len_8);
        int i2 = C10451d.f28076a[flowStyleHollowShape.ordinal()];
        if (i2 == 1) {
            if (f3 < f4) {
                f3 = f4;
            }
            float f8 = (float) dimensionPixelSize;
            float f9 = f - f8;
            float f10 = f2 - f8;
            f6 = f + f3 + f8;
            f5 = f2 + f3 + f8;
            f = f9;
            f2 = f10;
        } else if (i2 == 2 || !(i2 == 3 || i2 == 4)) {
            float f11 = (float) dimensionPixelSize;
            f6 = f + f3 + f11;
            f5 = f2 + f4 + f11;
            f -= f11;
            f2 -= f11;
        } else {
            f6 = f3 + f;
            f5 = f4 + f2;
        }
        if (f < ((float) 0)) {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        float f12 = (float) measuredWidth;
        if (f6 > f12) {
            f6 = f12;
        }
        float f13 = (float) a;
        if (f2 < f13) {
            f2 = f13;
        }
        float f14 = (float) measuredHeight;
        if (f5 > f14) {
            f5 = f14;
        }
        int i3 = C10451d.f28077b[flowStyleHollowShape.ordinal()];
        if (i3 == 1) {
            f7 = Math.min(Math.min(f6 - f, f5 - f2) / ((float) 2), (float) dimensionPixelSize2);
        } else if (i3 != 2) {
            f7 = Math.min(f6 - f, f5 - f2) / ((float) 2);
        } else {
            i = this.f28068u;
            rectF.set(f, f2, f6, f5);
            this.f28063p.setHighlightRectRadius(i);
            this.f28063p.setHighRect(rectF);
            return rectF;
        }
        i = (int) f7;
        rectF.set(f, f2, f6, f5);
        this.f28063p.setHighlightRectRadius(i);
        this.f28063p.setHighRect(rectF);
        return rectF;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0181  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39714a(java.lang.String r13, java.lang.String r14, java.lang.Integer r15, java.lang.Integer r16, boolean r17, android.view.View r18, java.lang.Integer r19, com.bytedance.ee.bear.onboarding.view.p518a.AbstractC10440b r20, android.graphics.RectF r21, com.bytedance.ee.bear.onboarding.export.ui.FlowStyleHollowShape r22, int r23, java.lang.String r24, java.lang.String r25, com.bytedance.ee.bear.onboarding.export.OnBoardingColorStyle r26, boolean r27) {
        /*
        // Method dump skipped, instructions count: 462
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.onboarding.view.FlowOnBoardingDialog.mo39714a(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, android.view.View, java.lang.Integer, com.bytedance.ee.bear.onboarding.view.a.b, android.graphics.RectF, com.bytedance.ee.bear.onboarding.export.ui.FlowStyleHollowShape, int, java.lang.String, java.lang.String, com.bytedance.ee.bear.onboarding.export.OnBoardingColorStyle, boolean):void");
    }
}
