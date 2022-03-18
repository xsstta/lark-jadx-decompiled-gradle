package com.bytedance.ee.bear.document.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.util.keyboard.HardKeyboardUtils;
import com.bytedance.ee.log.C13479a;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.larksuite.suite.R;

public class KeyboardPlaceholderView extends View implements AbstractC10549e {

    /* renamed from: a */
    public ValueAnimator f17437a;

    /* renamed from: b */
    public ValueAnimator f17438b;

    /* renamed from: c */
    protected boolean f17439c;

    /* renamed from: d */
    private final String f17440d = ("KeyboardPlaceholder#" + Integer.toHexString(hashCode()));

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo25313d() {
        ValueAnimator valueAnimator = this.f17438b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f17438b = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo25314e() {
        ValueAnimator valueAnimator = this.f17437a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f17437a = null;
        }
    }

    private int getHolderHeight() {
        AbstractC10550f b = AbstractC10550f.AbstractC10551a.m43717b((Activity) getContext());
        if (HardKeyboardUtils.m43693a((Activity) getContext())) {
            return 0;
        }
        return b.mo39934h();
    }

    private int getHolderHeight2() {
        AbstractC10550f b = AbstractC10550f.AbstractC10551a.m43717b((Activity) getContext());
        if (HardKeyboardUtils.m43693a((Activity) getContext())) {
            return 0;
        }
        return b.mo39936j();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C13479a.m54772d(this.f17440d, "onAttachedToWindow");
        AbstractC10550f.AbstractC10551a.m43717b((Activity) getContext()).mo39924a(this);
        mo25309a(getHolderHeight());
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C13479a.m54772d(this.f17440d, "onDetachedFromWindow");
        AbstractC10550f.AbstractC10551a.m43717b((Activity) getContext()).mo39928b(this);
    }

    /* renamed from: a */
    public void mo25308a() {
        C13479a.m54772d(this.f17440d, "ariseIfKeyboardNotShow");
        if (!AbstractC10550f.AbstractC10551a.m43717b((Activity) getContext()).mo39935i()) {
            int holderHeight2 = getHolderHeight2();
            if (this.f17437a == null && getLayoutParams().height != holderHeight2) {
                mo25309a(holderHeight2);
            }
        }
    }

    /* renamed from: b */
    public void mo25311b() {
        C13479a.m54772d(this.f17440d, "ariseIfKeyboardNotShow");
        if (!AbstractC10550f.AbstractC10551a.m43717b((Activity) getContext()).mo39935i()) {
            int holderHeight2 = getHolderHeight2();
            if (this.f17437a == null && getLayoutParams().height != holderHeight2) {
                mo25313d();
                int[] iArr = {0, holderHeight2};
                ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration((long) m25240a(getResources(), R.integer.keyboard_height_duration));
                this.f17437a = duration;
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.bytedance.ee.bear.document.widget.$$Lambda$KeyboardPlaceholderView$5iSTzsrvyvDcPMTtYa760gVFyc */

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        KeyboardPlaceholderView.this.m25242b(valueAnimator);
                    }
                });
                this.f17437a.addListener(new AnimatorListenerAdapter() {
                    /* class com.bytedance.ee.bear.document.widget.KeyboardPlaceholderView.C62911 */

                    public void onAnimationEnd(Animator animator) {
                        KeyboardPlaceholderView.this.f17437a = null;
                    }
                });
                this.f17437a.start();
            }
        }
    }

    /* renamed from: c */
    public void mo25312c() {
        C13479a.m54772d(this.f17440d, "fallIfKeyboardNotShow");
        if (!AbstractC10550f.AbstractC10551a.m43717b((Activity) getContext()).mo39935i()) {
            int holderHeight2 = getHolderHeight2();
            if (this.f17438b == null && getLayoutParams().height != 0) {
                mo25314e();
                int[] iArr = {holderHeight2, 0};
                ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration((long) m25240a(getResources(), R.integer.keyboard_height_duration));
                this.f17438b = duration;
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.bytedance.ee.bear.document.widget.$$Lambda$KeyboardPlaceholderView$zqeKSYUuksanDRdo0ityLCHZxnI */

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        KeyboardPlaceholderView.this.m25241a((KeyboardPlaceholderView) valueAnimator);
                    }
                });
                this.f17438b.addListener(new AnimatorListenerAdapter() {
                    /* class com.bytedance.ee.bear.document.widget.KeyboardPlaceholderView.C62922 */

                    public void onAnimationEnd(Animator animator) {
                        KeyboardPlaceholderView.this.f17438b = null;
                    }
                });
                this.f17438b.start();
            }
        }
    }

    /* renamed from: a */
    public void mo25310a(boolean z) {
        this.f17439c = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25241a(ValueAnimator valueAnimator) {
        mo25309a(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m25242b(ValueAnimator valueAnimator) {
        mo25309a(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.height = getHolderHeight();
        super.setLayoutParams(layoutParams);
    }

    public KeyboardPlaceholderView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25309a(int i) {
        int i2;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams.height != i) {
            layoutParams.height = i;
            requestLayout();
        }
        if (i > 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        if (getVisibility() != i2) {
            setVisibility(i2);
        }
    }

    public KeyboardPlaceholderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public static int m25240a(Resources resources, int i) throws Resources.NotFoundException {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return resources.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i);
        }
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        String str = this.f17440d;
        C13479a.m54772d(str, "onKeyboardHeightChanged:" + i);
        if (!this.f17439c) {
            mo25314e();
            mo25313d();
            mo25309a(getHolderHeight());
        }
    }

    public KeyboardPlaceholderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
