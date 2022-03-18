package com.bytedance.ee.bear.onboarding.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.Window;
import com.bytedance.ee.bear.onboarding.export.Direction;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13746i;
import com.larksuite.suite.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ8\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J6\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/view/TextLocationCalculator;", "", "activity", "Landroid/app/Activity;", "panelWidth", "", "panelHeight", "_arrowLen", "(Landroid/app/Activity;IILjava/lang/Integer;)V", "Ljava/lang/Integer;", "calcOnBoardingPos", "", "", "left", "top", "right", "bottom", "suggestedDirection", "Lcom/bytedance/ee/bear/onboarding/export/Direction;", "calculationLocation", "targetView", "Landroid/view/View;", "targetPos", "", "targetRect", "Landroid/graphics/RectF;", "Companion", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.onboarding.view.e */
public final class TextLocationCalculator {

    /* renamed from: a */
    public static final String f28078a;

    /* renamed from: b */
    public static final Companion f28079b = new Companion(null);

    /* renamed from: c */
    private final Activity f28080c;

    /* renamed from: d */
    private final int f28081d;

    /* renamed from: e */
    private final int f28082e;

    /* renamed from: f */
    private final Integer f28083f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/view/TextLocationCalculator$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.view.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String simpleName = TextOnBoardingDialog.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "TextOnBoardingDialog::class.java.simpleName");
        f28078a = simpleName;
    }

    public TextLocationCalculator(Activity activity, int i, int i2, Integer num) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f28080c = activity;
        this.f28081d = i;
        this.f28082e = i2;
        this.f28083f = num;
    }

    /* renamed from: a */
    public final List<Float> mo39719a(View view, int[] iArr, RectF rectF, Direction direction) {
        if (view != null) {
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            return m43380a(iArr2[0], iArr2[1], iArr2[0] + view.getWidth(), iArr2[1] + view.getHeight(), direction);
        } else if (iArr != null && iArr.length >= 2) {
            return m43380a(iArr[0], iArr[1], iArr[0], iArr[1], direction);
        } else {
            if (rectF != null) {
                return m43380a((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, direction);
            }
            C13479a.m54758a(f28078a, "No TargetView or targetPos is set!!");
            return null;
        }
    }

    /* renamed from: a */
    private final List<Float> m43380a(int i, int i2, int i3, int i4, Direction direction) {
        int i5;
        float f;
        float f2;
        float f3;
        Window window = this.f28080c.getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
        View decorView = window.getDecorView();
        Intrinsics.checkExpressionValueIsNotNull(decorView, "activity.window.decorView");
        int measuredWidth = decorView.getMeasuredWidth();
        int measuredHeight = decorView.getMeasuredHeight();
        int a = C13746i.m55722a((Context) this.f28080c);
        int dimensionPixelSize = this.f28080c.getResources().getDimensionPixelSize(R.dimen.space_kit_len_8);
        Integer num = this.f28083f;
        if (num != null) {
            i5 = num.intValue();
        } else {
            i5 = this.f28080c.getResources().getDimensionPixelSize(R.dimen.onBoarding_arrow_width);
        }
        int i6 = i2 - a;
        int i7 = measuredHeight - i4;
        if (i6 > i7) {
            float f4 = (float) i5;
            f2 = (((float) i2) - f4) - ((float) dimensionPixelSize);
            f = ((f4 / ((float) 2)) + f2) - ((float) this.f28082e);
        } else {
            f2 = ((float) i4) + ((float) dimensionPixelSize);
            f = (((float) i5) / ((float) 2)) + f2;
        }
        if (i6 > i7 && Direction.DOWN == direction) {
            String str = f28078a;
            C13479a.m54772d(str, "remindBottom " + i7 + ", panel.measuredHeight " + this.f28082e + ", arrowLen " + i5);
            if (i7 > this.f28082e + i5) {
                C13479a.m54772d(str, "change by down suggestedDirection");
                f2 = ((float) i4) + ((float) dimensionPixelSize);
                f = f2 + (((float) i5) / ((float) 2));
            }
        } else if (i6 < i7 && Direction.UP == direction) {
            String str2 = f28078a;
            C13479a.m54772d(str2, "remindTop " + i7 + ", panel.measuredHeight " + this.f28082e + ", arrowLen " + i5);
            if (i6 > this.f28082e + i5) {
                C13479a.m54764b(str2, "change by up suggestedDirection");
                float f5 = (float) i5;
                f2 = (((float) i2) - f5) - ((float) dimensionPixelSize);
                f = ((f5 / ((float) 2)) + f2) - ((float) this.f28082e);
            }
        }
        int dimensionPixelSize2 = this.f28080c.getResources().getDimensionPixelSize(R.dimen.space_kit_len_16);
        int dimensionPixelSize3 = this.f28080c.getResources().getDimensionPixelSize(R.dimen.space_kit_len_16) + this.f28080c.getResources().getDimensionPixelSize(R.dimen.onBoarding_arrow_width);
        int i8 = (i + i3) / 2;
        if (i8 < dimensionPixelSize2) {
            f3 = (float) dimensionPixelSize2;
        } else if (measuredWidth - i8 < dimensionPixelSize3) {
            f3 = ((float) measuredWidth) - ((float) dimensionPixelSize3);
        } else {
            f3 = ((float) i8) - ((float) (i5 / 2));
        }
        int i9 = this.f28081d;
        float f6 = ((float) i8) - ((float) (i9 / 2));
        float f7 = ((float) dimensionPixelSize2) / ((float) 2);
        if (f6 < f7) {
            f6 = f7;
        } else if (((float) i9) + f6 + f7 > ((float) measuredWidth)) {
            f6 = ((float) (measuredWidth - i9)) - f7;
        }
        return CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(f3), Float.valueOf(f2), Float.valueOf(f6), Float.valueOf(f)});
    }
}
