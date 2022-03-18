package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.C0767f;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import org.xmlpull.v1.XmlPullParser;

public class Fade extends Visibility {
    public Fade() {
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.transition.Fade$a */
    public static class C1489a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f5249a;

        /* renamed from: b */
        private boolean f5250b;

        C1489a(View view) {
            this.f5249a = view;
        }

        public void onAnimationEnd(Animator animator) {
            aj.m6996a(this.f5249a, 1.0f);
            if (this.f5250b) {
                this.f5249a.setLayerType(0, null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (ViewCompat.m4111z(this.f5249a) && this.f5249a.getLayerType() == 0) {
                this.f5250b = true;
                this.f5249a.setLayerType(2, null);
            }
        }
    }

    public Fade(int i) {
        mo7947c(i);
    }

    @Override // androidx.transition.Transition, androidx.transition.Visibility
    /* renamed from: a */
    public void mo7807a(C1562y yVar) {
        super.mo7807a(yVar);
        yVar.f5458a.put("android:fade:transitionAlpha", Float.valueOf(aj.m7002c(yVar.f5459b)));
    }

    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1553s.f5436f);
        mo7947c(C0767f.m3693a(obtainStyledAttributes, (XmlPullParser) ((XmlResourceParser) attributeSet), "fadingMode", 0, mo7944s()));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static float m6783a(C1562y yVar, float f) {
        Float f2;
        if (yVar == null || (f2 = (Float) yVar.f5458a.get("android:fade:transitionAlpha")) == null) {
            return f;
        }
        return f2.floatValue();
    }

    /* renamed from: a */
    private Animator m6784a(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        aj.m6996a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, aj.f5360a, f2);
        ofFloat.addListener(new C1489a(view));
        mo7880a(new C1555u() {
            /* class androidx.transition.Fade.C14881 */

            @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
            /* renamed from: b */
            public void mo7816b(Transition transition) {
                aj.m6996a(view, 1.0f);
                aj.m7005e(view);
                transition.mo7898b(this);
            }
        });
        return ofFloat;
    }

    @Override // androidx.transition.Visibility
    /* renamed from: b */
    public Animator mo7870b(ViewGroup viewGroup, View view, C1562y yVar, C1562y yVar2) {
        aj.m7004d(view);
        return m6784a(view, m6783a(yVar, 1.0f), BitmapDescriptorFactory.HUE_RED);
    }

    @Override // androidx.transition.Visibility
    /* renamed from: a */
    public Animator mo7869a(ViewGroup viewGroup, View view, C1562y yVar, C1562y yVar2) {
        float f = BitmapDescriptorFactory.HUE_RED;
        float a = m6783a(yVar, (float) BitmapDescriptorFactory.HUE_RED);
        if (a != 1.0f) {
            f = a;
        }
        return m6784a(view, f, 1.0f);
    }
}
