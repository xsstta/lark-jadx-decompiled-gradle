package com.bytedance.ee.bear.onboarding.view;

import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.ee.bear.onboarding.export.AbstractC10400d;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 .2\u00020\u0001:\u0001.B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016JZ\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&J\u0012\u0010'\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J \u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/view/TimerTextAndTapOnBoardingDialog;", "Lcom/bytedance/ee/bear/onboarding/view/BaseOnBoardingDialog;", "activity", "Landroidx/fragment/app/FragmentActivity;", "currentActiveWindow", "Landroid/view/Window;", "(Landroidx/fragment/app/FragmentActivity;Landroid/view/Window;)V", "arrowLen", "", "arrowView", "Landroid/view/View;", "hintTv", "Landroid/widget/TextView;", "lottie", "Lcom/airbnb/lottie/LottieAnimationView;", "panel", "panelX", "", "panelY", "titleTv", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "initView", "", "title", "", "hint", "lottieFileName", "targetView", "targetPos", "", "targetRect", "Landroid/graphics/RectF;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lcom/bytedance/ee/bear/onboarding/export/Direction;", "onBoardingColorStyle", "Lcom/bytedance/ee/bear/onboarding/export/OnBoardingColorStyle;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setStyleColor", "bgColor", "shadowColor", "maskColor", "Companion", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.onboarding.view.g */
public class TimerTextAndTapOnBoardingDialog extends AbstractDialogC10436a {

    /* renamed from: e */
    public static final String f28098e = f28098e;

    /* renamed from: f */
    public static final Companion f28099f = new Companion(null);

    /* renamed from: g */
    private final TextView f28100g;

    /* renamed from: h */
    private final TextView f28101h;

    /* renamed from: i */
    private final View f28102i;

    /* renamed from: j */
    private final LottieAnimationView f28103j;

    /* renamed from: k */
    private final View f28104k;

    /* renamed from: l */
    private int f28105l;

    /* renamed from: m */
    private float f28106m;

    /* renamed from: n */
    private float f28107n;

    /* renamed from: o */
    private final FragmentActivity f28108o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "accept", "(Lkotlin/Unit;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.view.g$c */
    static final class C10456c<T> implements Consumer<Unit> {

        /* renamed from: a */
        public static final C10456c f28110a = new C10456c();

        C10456c() {
        }

        /* renamed from: a */
        public final void accept(Unit unit) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/view/TimerTextAndTapOnBoardingDialog$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.view.g$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo39727a() {
            return TimerTextAndTapOnBoardingDialog.f28098e;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.view.g$b */
    static final class C10455b<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ TimerTextAndTapOnBoardingDialog f28109a;

        C10455b(TimerTextAndTapOnBoardingDialog gVar) {
            this.f28109a = gVar;
        }

        @Override // io.reactivex.functions.Function
        public /* synthetic */ Object apply(Object obj) {
            mo39728a((String) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo39728a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            if (this.f28109a.isShowing()) {
                AbstractC10400d.AbstractC10402b bVar = this.f28109a.f28025d;
                if (bVar != null) {
                    bVar.mo39600a();
                }
                this.f28109a.dismiss();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.view.g$d */
    static final class C10457d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C10457d f28111a = new C10457d();

        C10457d() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a(TimerTextAndTapOnBoardingDialog.f28099f.mo39727a(), th);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        this.f28108o.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), this.f28107n + motionEvent.getX(), this.f28106m + motionEvent.getY(), motionEvent.getMetaState()));
        if (motionEvent.getAction() == 1) {
            dismiss();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.onboarding.view.AbstractDialogC10436a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(262144);
            window.setGravity(8388659);
            window.setLayout(-2, -2);
        }
        AbstractC68307f.m265083a("").mo238019d(2, TimeUnit.SECONDS).mo237985a(AndroidSchedulers.mainThread()).mo238020d(new C10455b(this)).mo238001b(C10456c.f28110a, C10457d.f28111a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimerTextAndTapOnBoardingDialog(FragmentActivity fragmentActivity, Window window) {
        super(fragmentActivity, window, R.style.TimerOnBoardingDialog);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(window, "currentActiveWindow");
        this.f28108o = fragmentActivity;
        this.f28022a = LayoutInflater.from(fragmentActivity).inflate(R.layout.onboarding_timer_text_and_top_onboarding, (ViewGroup) null);
        View findViewById = this.f28022a.findViewById(R.id.onBoarding_text_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "root.findViewById(R.id.onBoarding_text_title)");
        this.f28100g = (TextView) findViewById;
        View findViewById2 = this.f28022a.findViewById(R.id.onBoarding_text_hint);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "root.findViewById(R.id.onBoarding_text_hint)");
        this.f28101h = (TextView) findViewById2;
        View findViewById3 = this.f28022a.findViewById(R.id.tap_lottie);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "root.findViewById(R.id.tap_lottie)");
        this.f28103j = (LottieAnimationView) findViewById3;
        View findViewById4 = this.f28022a.findViewById(R.id.onBoarding_text_arrow);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "root.findViewById(R.id.onBoarding_text_arrow)");
        this.f28102i = findViewById4;
        View findViewById5 = this.f28022a.findViewById(R.id.onBoarding_text_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "root.findViewById(R.id.onBoarding_text_layout)");
        this.f28104k = findViewById5;
        this.f28105l = fragmentActivity.getResources().getDimensionPixelSize(R.dimen.onBoarding_arrow_width);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.onboarding.view.AbstractDialogC10436a
    /* renamed from: a */
    public void mo39697a(int i, int i2, int i3) {
        this.f28104k.setBackgroundTintList(ColorStateList.valueOf(i));
        this.f28102i.setBackgroundTintList(ColorStateList.valueOf(i));
        if (Build.VERSION.SDK_INT >= 28) {
            this.f28104k.setOutlineSpotShadowColor(i2);
            this.f28104k.setOutlineAmbientShadowColor(i2);
            this.f28102i.setOutlineSpotShadowColor(i2);
            this.f28102i.setOutlineAmbientShadowColor(i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39725a(java.lang.String r5, java.lang.String r6, java.lang.String r7, android.view.View r8, int[] r9, android.graphics.RectF r10, com.bytedance.ee.bear.onboarding.export.Direction r11, com.bytedance.ee.bear.onboarding.export.OnBoardingColorStyle r12) {
        /*
        // Method dump skipped, instructions count: 292
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.onboarding.view.TimerTextAndTapOnBoardingDialog.mo39725a(java.lang.String, java.lang.String, java.lang.String, android.view.View, int[], android.graphics.RectF, com.bytedance.ee.bear.onboarding.export.Direction, com.bytedance.ee.bear.onboarding.export.OnBoardingColorStyle):void");
    }
}
