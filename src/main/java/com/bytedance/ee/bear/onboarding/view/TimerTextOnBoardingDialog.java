package com.bytedance.ee.bear.onboarding.view;

import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.onboarding.export.AbstractC10400d;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0016\u0018\u0000 62\u00020\u0001:\u00016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006Ja\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0014H\u0002J\u0012\u0010#\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020\u0014H\u0016J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J \u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\bH\u0014J\b\u0010/\u001a\u00020\u0014H\u0002J(\u00100\u001a\u00020\u00142\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u0002022\u0006\u00105\u001a\u000202H\u0002R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/view/TimerTextOnBoardingDialog;", "Lcom/bytedance/ee/bear/onboarding/view/BaseOnBoardingDialog;", "activity", "Landroidx/fragment/app/FragmentActivity;", "currentActiveWindow", "Landroid/view/Window;", "(Landroidx/fragment/app/FragmentActivity;Landroid/view/Window;)V", "DISMISS", "", "arrowLen", "arrowView", "Landroid/view/View;", "duration", "hintTv", "Landroid/widget/TextView;", "mH", "Landroid/os/Handler;", "panel", "titleTv", "initView", "", "title", "", "hint", "targetView", "targetPos", "", "targetRect", "Landroid/graphics/RectF;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lcom/bytedance/ee/bear/onboarding/export/Direction;", "onBoardingColorStyle", "Lcom/bytedance/ee/bear/onboarding/export/OnBoardingColorStyle;", "(Ljava/lang/String;Ljava/lang/String;Landroid/view/View;[ILandroid/graphics/RectF;Lcom/bytedance/ee/bear/onboarding/export/Direction;Ljava/lang/Integer;Lcom/bytedance/ee/bear/onboarding/export/OnBoardingColorStyle;)V", "measurePanel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDetachedFromWindow", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "setStyleColor", "bgColor", "shadowColor", "maskColor", "setupTimer", "updateWindowLocation", "arrowX", "", "arrowY", "panelX", "panelY", "Companion", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.onboarding.view.h */
public class TimerTextOnBoardingDialog extends AbstractDialogC10436a {

    /* renamed from: e */
    public static final String f28112e;

    /* renamed from: f */
    public static final Companion f28113f = new Companion(null);

    /* renamed from: g */
    private final TextView f28114g;

    /* renamed from: h */
    private final TextView f28115h;

    /* renamed from: i */
    private final View f28116i;

    /* renamed from: j */
    private final View f28117j;

    /* renamed from: k */
    private final int f28118k = 2;

    /* renamed from: l */
    private int f28119l = 2000;

    /* renamed from: m */
    private int f28120m;

    /* renamed from: n */
    private final Handler f28121n = new HandlerC10458b(this);

    /* renamed from: o */
    private final FragmentActivity f28122o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/view/TimerTextOnBoardingDialog$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.view.h$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo39734a() {
            return TimerTextOnBoardingDialog.f28112e;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/onboarding/view/TimerTextOnBoardingDialog$mH$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.view.h$b */
    public static final class HandlerC10458b extends Handler {

        /* renamed from: a */
        final /* synthetic */ TimerTextOnBoardingDialog f28123a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.onboarding.view.h$b$a */
        static final class RunnableC10459a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ HandlerC10458b f28124a;

            RunnableC10459a(HandlerC10458b bVar) {
                this.f28124a = bVar;
            }

            public final void run() {
                this.f28124a.f28123a.dismiss();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        HandlerC10458b(TimerTextOnBoardingDialog hVar) {
            this.f28123a = hVar;
        }

        public void handleMessage(Message message) {
            Intrinsics.checkParameterIsNotNull(message, "msg");
            if (this.f28123a.isShowing()) {
                this.f28123a.f28023b = true;
                AbstractC10400d.AbstractC10402b bVar = this.f28123a.f28025d;
                if (bVar != null) {
                    bVar.mo39600a();
                }
                post(new RunnableC10459a(this));
                C13479a.m54764b(TimerTextOnBoardingDialog.f28113f.mo39734a(), "auto dismiss dialog");
            }
        }
    }

    /* renamed from: a */
    private final void m43393a() {
        this.f28117j.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28121n.removeMessages(this.f28118k);
    }

    static {
        String simpleName = TimerTextOnBoardingDialog.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "TimerTextOnBoardingDialog::class.java.simpleName");
        f28112e = simpleName;
    }

    /* renamed from: b */
    private final void m43395b() {
        if (!this.f28121n.hasMessages(this.f28118k)) {
            this.f28121n.sendEmptyMessageDelayed(this.f28118k, (long) this.f28119l);
        } else {
            C13479a.m54764b(f28112e, "already setup timer");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.onboarding.view.AbstractDialogC10436a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(262144);
            window.setGravity(8388659);
            window.setLayout(-2, this.f28120m + this.f28117j.getMeasuredHeight());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        String str = f28112e;
        C13479a.m54772d(str, "onTouchEvent: " + motionEvent);
        if (!isShowing() || this.f28121n.hasMessages(this.f28118k) || motionEvent.getAction() != 4) {
            return false;
        }
        m43395b();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimerTextOnBoardingDialog(FragmentActivity fragmentActivity, Window window) {
        super(fragmentActivity, window, R.style.TimerOnBoardingDialog);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(window, "currentActiveWindow");
        this.f28122o = fragmentActivity;
        this.f28022a = LayoutInflater.from(fragmentActivity).inflate(R.layout.onboarding_timer_text_onboarding, (ViewGroup) null);
        View findViewById = this.f28022a.findViewById(R.id.onBoarding_text_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "root.findViewById(R.id.onBoarding_text_title)");
        this.f28114g = (TextView) findViewById;
        View findViewById2 = this.f28022a.findViewById(R.id.onBoarding_text_hint);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "root.findViewById(R.id.onBoarding_text_hint)");
        this.f28115h = (TextView) findViewById2;
        View findViewById3 = this.f28022a.findViewById(R.id.onBoarding_text_arrow);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "root.findViewById(R.id.onBoarding_text_arrow)");
        this.f28116i = findViewById3;
        View findViewById4 = this.f28022a.findViewById(R.id.onBoarding_text_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "root.findViewById(R.id.onBoarding_text_layout)");
        this.f28117j = findViewById4;
        this.f28120m = fragmentActivity.getResources().getDimensionPixelSize(R.dimen.onBoarding_arrow_width);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.onboarding.view.AbstractDialogC10436a
    /* renamed from: a */
    public void mo39697a(int i, int i2, int i3) {
        this.f28117j.setBackgroundTintList(ColorStateList.valueOf(i));
        this.f28116i.setBackgroundTintList(ColorStateList.valueOf(i));
        if (Build.VERSION.SDK_INT >= 28) {
            this.f28117j.setOutlineSpotShadowColor(i2);
            this.f28117j.setOutlineAmbientShadowColor(i2);
            this.f28116i.setOutlineSpotShadowColor(i2);
            this.f28116i.setOutlineAmbientShadowColor(i2);
        }
    }

    /* renamed from: a */
    private final void m43394a(float f, float f2, float f3, float f4) {
        Window window = getWindow();
        if (window != null) {
            Intrinsics.checkExpressionValueIsNotNull(window, "it");
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.x = (int) f3;
            attributes.y = (int) f4;
            window.setAttributes(attributes);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39731a(java.lang.String r4, java.lang.String r5, android.view.View r6, int[] r7, android.graphics.RectF r8, com.bytedance.ee.bear.onboarding.export.Direction r9, java.lang.Integer r10, com.bytedance.ee.bear.onboarding.export.OnBoardingColorStyle r11) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.onboarding.view.TimerTextOnBoardingDialog.mo39731a(java.lang.String, java.lang.String, android.view.View, int[], android.graphics.RectF, com.bytedance.ee.bear.onboarding.export.Direction, java.lang.Integer, com.bytedance.ee.bear.onboarding.export.OnBoardingColorStyle):void");
    }
}
