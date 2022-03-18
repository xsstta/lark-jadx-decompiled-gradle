package com.bytedance.ee.bear.onboarding.view;

import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.onboarding.export.AbstractC10400d;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 )2\u00020\u0001:\u0001)B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006Ja\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0014H\u0002J\b\u0010#\u001a\u00020\u0014H\u0016J \u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0014J\b\u0010(\u001a\u00020\u0014H\u0016R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/view/TextOnBoardingDialog;", "Lcom/bytedance/ee/bear/onboarding/view/BaseOnBoardingDialog;", "activity", "Landroidx/fragment/app/FragmentActivity;", "currentActiveWindow", "Landroid/view/Window;", "(Landroidx/fragment/app/FragmentActivity;Landroid/view/Window;)V", "MESSAGE_DISMISS", "", "arrowLen", "arrowView", "Landroid/view/View;", "autoDismissDelayTime", "hintTv", "Landroid/widget/TextView;", "mH", "Landroid/os/Handler;", "panel", "titleTv", "initView", "", "title", "", "hint", "targetView", "targetPos", "", "targetRect", "Landroid/graphics/RectF;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lcom/bytedance/ee/bear/onboarding/export/Direction;", "onBoardingColorStyle", "Lcom/bytedance/ee/bear/onboarding/export/OnBoardingColorStyle;", "(Ljava/lang/String;Ljava/lang/String;Landroid/view/View;[ILandroid/graphics/RectF;Lcom/bytedance/ee/bear/onboarding/export/Direction;Ljava/lang/Integer;Lcom/bytedance/ee/bear/onboarding/export/OnBoardingColorStyle;)V", "measurePanel", "onDetachedFromWindow", "setStyleColor", "bgColor", "shadowColor", "maskColor", "show", "Companion", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.onboarding.view.f */
public class TextOnBoardingDialog extends AbstractDialogC10436a {

    /* renamed from: e */
    public static final String f28084e;

    /* renamed from: f */
    public static final Companion f28085f = new Companion(null);

    /* renamed from: g */
    private final TextView f28086g;

    /* renamed from: h */
    private final TextView f28087h;

    /* renamed from: i */
    private final View f28088i;

    /* renamed from: j */
    private final View f28089j;

    /* renamed from: k */
    private int f28090k;

    /* renamed from: l */
    private int f28091l;

    /* renamed from: m */
    private final int f28092m = 1;

    /* renamed from: n */
    private final Handler f28093n = new HandlerC10453c(this);

    /* renamed from: o */
    private final FragmentActivity f28094o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/view/TextOnBoardingDialog$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.view.f$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo39722a() {
            return TextOnBoardingDialog.f28084e;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/onboarding/view/TextOnBoardingDialog$mH$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.view.f$c */
    public static final class HandlerC10453c extends Handler {

        /* renamed from: a */
        final /* synthetic */ TextOnBoardingDialog f28096a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.onboarding.view.f$c$a */
        static final class RunnableC10454a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ HandlerC10453c f28097a;

            RunnableC10454a(HandlerC10453c cVar) {
                this.f28097a = cVar;
            }

            public final void run() {
                this.f28097a.f28096a.dismiss();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        HandlerC10453c(TextOnBoardingDialog fVar) {
            this.f28096a = fVar;
        }

        public void handleMessage(Message message) {
            Intrinsics.checkParameterIsNotNull(message, "msg");
            if (this.f28096a.isShowing()) {
                this.f28096a.f28023b = true;
                AbstractC10400d.AbstractC10402b bVar = this.f28096a.f28025d;
                if (bVar != null) {
                    bVar.mo39600a();
                }
                post(new RunnableC10454a(this));
                C13479a.m54764b(TextOnBoardingDialog.f28085f.mo39722a(), "auto dismiss dialog");
            }
        }
    }

    /* renamed from: a */
    private final void m43382a() {
        this.f28089j.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28093n.removeMessages(this.f28092m);
    }

    static {
        String simpleName = TextOnBoardingDialog.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "TextOnBoardingDialog::class.java.simpleName");
        f28084e = simpleName;
    }

    @Override // com.bytedance.ee.bear.onboarding.view.AbstractDialogC10436a, com.bytedance.ee.bear.widgets.dialog.BaseDialog
    public void show() {
        super.show();
        if (this.f28091l > 0 && !this.f28093n.hasMessages(this.f28092m)) {
            this.f28093n.sendEmptyMessageDelayed(this.f28092m, (long) this.f28091l);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/onboarding/view/TextOnBoardingDialog$initView$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.view.f$b */
    public static final class C10452b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ TextOnBoardingDialog f28095a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10452b(TextOnBoardingDialog fVar) {
            this.f28095a = fVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f28095a.f28023b = true;
            AbstractC10400d.AbstractC10402b bVar = this.f28095a.f28025d;
            if (bVar != null) {
                bVar.mo39600a();
            }
            this.f28095a.dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextOnBoardingDialog(FragmentActivity fragmentActivity, Window window) {
        super(fragmentActivity, window);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(window, "currentActiveWindow");
        this.f28094o = fragmentActivity;
        this.f28022a = LayoutInflater.from(fragmentActivity).inflate(R.layout.onboarding_text_onboarding, (ViewGroup) null);
        View findViewById = this.f28022a.findViewById(R.id.onBoarding_text_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "root.findViewById(R.id.onBoarding_text_title)");
        this.f28086g = (TextView) findViewById;
        View findViewById2 = this.f28022a.findViewById(R.id.onBoarding_text_hint);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "root.findViewById(R.id.onBoarding_text_hint)");
        this.f28087h = (TextView) findViewById2;
        View findViewById3 = this.f28022a.findViewById(R.id.onBoarding_text_arrow);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "root.findViewById(R.id.onBoarding_text_arrow)");
        this.f28088i = findViewById3;
        View findViewById4 = this.f28022a.findViewById(R.id.onBoarding_text_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "root.findViewById(R.id.onBoarding_text_layout)");
        this.f28089j = findViewById4;
        this.f28090k = fragmentActivity.getResources().getDimensionPixelSize(R.dimen.onBoarding_arrow_width);
        this.f28091l = -1;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.onboarding.view.AbstractDialogC10436a
    /* renamed from: a */
    public void mo39697a(int i, int i2, int i3) {
        this.f28089j.setBackgroundTintList(ColorStateList.valueOf(i));
        this.f28088i.setBackgroundTintList(ColorStateList.valueOf(i));
        if (Build.VERSION.SDK_INT >= 28) {
            this.f28089j.setOutlineSpotShadowColor(i2);
            this.f28089j.setOutlineAmbientShadowColor(i2);
            this.f28088i.setOutlineSpotShadowColor(i2);
            this.f28088i.setOutlineAmbientShadowColor(i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39720a(java.lang.String r5, java.lang.String r6, android.view.View r7, int[] r8, android.graphics.RectF r9, com.bytedance.ee.bear.onboarding.export.Direction r10, java.lang.Integer r11, com.bytedance.ee.bear.onboarding.export.OnBoardingColorStyle r12) {
        /*
        // Method dump skipped, instructions count: 239
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.onboarding.view.TextOnBoardingDialog.mo39720a(java.lang.String, java.lang.String, android.view.View, int[], android.graphics.RectF, com.bytedance.ee.bear.onboarding.export.Direction, java.lang.Integer, com.bytedance.ee.bear.onboarding.export.OnBoardingColorStyle):void");
    }
}
