package com.ss.android.lark.calendar.impl.features.calendars.subscribe.widget;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000eR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/widget/SubscribeButton;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mode", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/widget/SubscribeButton$ButtonMode;", "getViewMinWidth", "", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "switchMode", "buttonMode", "ButtonMode", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SubscribeButton extends RelativeLayout {

    /* renamed from: a */
    public static int f76766a;

    /* renamed from: b */
    public static final Companion f76767b = new Companion(null);

    /* renamed from: c */
    private ButtonMode f76768c;

    /* renamed from: d */
    private HashMap f76769d;

    /* renamed from: a */
    public View mo110606a(int i) {
        if (this.f76769d == null) {
            this.f76769d = new HashMap();
        }
        View view = (View) this.f76769d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f76769d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/widget/SubscribeButton$ButtonMode;", "", ShareHitPoint.f121869d, "", "(Ljava/lang/String;II)V", "getType", "()I", "SUBSCRIBE", "UNSUBSCRIBE", "PRIVATE", "LOADING", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ButtonMode {
        SUBSCRIBE(0),
        UNSUBSCRIBE(1),
        PRIVATE(2),
        LOADING(3);
        
        private final int type;

        public final int getType() {
            return this.type;
        }

        private ButtonMode(int i) {
            this.type = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/widget/SubscribeButton$Companion;", "", "()V", "imageSize", "", "getImageSize", "()I", "setImageSize", "(I)V", "marginSize", "", "minViewSize", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.widget.SubscribeButton$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final float getViewMinWidth() {
        Paint paint = new Paint();
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        paint.setTextSize((float) context.getResources().getDimensionPixelSize(R.dimen.dp_16));
        float a = (float) (C57582a.m223601a(getContext(), 8.0f) * 2);
        float max = Math.max(Math.max(paint.measureText(C32634ae.m125182b(R.string.Calendar_SubscribeCalendar_Subscribe)) + a, paint.measureText(C32634ae.m125182b(R.string.Calendar_SubscribeCalendar_UnsubscribeCalendars)) + a), paint.measureText(C32634ae.m125182b(R.string.Calendar_SubscribeCalendar_Private)) + a);
        float a2 = (float) C57582a.m223601a(getContext(), 60.0f);
        return max < a2 ? a2 : max;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SubscribeButton(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo110607a(ButtonMode buttonMode) {
        Intrinsics.checkParameterIsNotNull(buttonMode, "buttonMode");
        this.f76768c = buttonMode;
        int i = C30653c.f76773a[buttonMode.ordinal()];
        if (i == 1) {
            setBackgroundResource(R.drawable.calendar_widget_bg_button_subscribe);
            TextView textView = (TextView) mo110606a(R.id.tvText);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvText");
            textView.setVisibility(0);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) mo110606a(R.id.ivLoadingCircle);
            Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "ivLoadingCircle");
            lottieAnimationView.setVisibility(8);
            setClickable(true);
            ((TextView) mo110606a(R.id.tvText)).setText(R.string.Calendar_SubscribeCalendar_Subscribe);
            ((TextView) mo110606a(R.id.tvText)).setTextColor(C32634ae.m125178a(R.color.primary_pri_500));
            ((TextView) mo110606a(R.id.tvText)).setCompoundDrawables(null, null, null, null);
        } else if (i == 2) {
            setBackgroundResource(R.drawable.calendar_widget_bg_button_unsubscribe);
            TextView textView2 = (TextView) mo110606a(R.id.tvText);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tvText");
            textView2.setVisibility(0);
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) mo110606a(R.id.ivLoadingCircle);
            Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView2, "ivLoadingCircle");
            lottieAnimationView2.setVisibility(8);
            setClickable(true);
            ((TextView) mo110606a(R.id.tvText)).setText(R.string.Calendar_SubscribeCalendar_UnsubscribeCalendars);
            ((TextView) mo110606a(R.id.tvText)).setTextColor(C32634ae.m125178a(R.color.ud_N700));
            ((TextView) mo110606a(R.id.tvText)).setCompoundDrawables(null, null, null, null);
        } else if (i == 3) {
            setBackgroundColor(0);
            TextView textView3 = (TextView) mo110606a(R.id.tvText);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "tvText");
            textView3.setVisibility(0);
            LottieAnimationView lottieAnimationView3 = (LottieAnimationView) mo110606a(R.id.ivLoadingCircle);
            Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView3, "ivLoadingCircle");
            lottieAnimationView3.setVisibility(8);
            setClickable(false);
            ((TextView) mo110606a(R.id.tvText)).setText(R.string.Calendar_SubscribeCalendar_Private);
            ((TextView) mo110606a(R.id.tvText)).setTextColor(C32634ae.m125178a(R.color.ud_N400));
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            Drawable iconDrawable = UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_lock_outlined, UDColorUtils.getColor(context2, R.color.ud_N400));
            if (iconDrawable != null) {
                int i2 = f76766a;
                iconDrawable.setBounds(0, 0, i2, i2);
            }
            ((TextView) mo110606a(R.id.tvText)).setCompoundDrawables(iconDrawable, null, null, null);
            TextView textView4 = (TextView) mo110606a(R.id.tvText);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "tvText");
            textView4.setCompoundDrawablePadding(UIUtils.dp2px(getContext(), 2.0f));
        } else if (i == 4) {
            TextView textView5 = (TextView) mo110606a(R.id.tvText);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "tvText");
            textView5.setVisibility(8);
            LottieAnimationView lottieAnimationView4 = (LottieAnimationView) mo110606a(R.id.ivLoadingCircle);
            Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView4, "ivLoadingCircle");
            lottieAnimationView4.setVisibility(0);
            setClickable(false);
            ((TextView) mo110606a(R.id.tvText)).setCompoundDrawables(null, null, null, null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SubscribeButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) getViewMinWidth(), View.MeasureSpec.getMode(i)), i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SubscribeButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubscribeButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f76768c = ButtonMode.SUBSCRIBE;
        if (f76766a == 0) {
            f76766a = UIUtils.dp2px(context, 16.0f);
        }
        LayoutInflater.from(context).inflate(R.layout.calendar_widget_button_subscribe, (ViewGroup) this, true);
        mo110607a(ButtonMode.SUBSCRIBE);
    }
}
