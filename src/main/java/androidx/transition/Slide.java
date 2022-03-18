package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.core.content.res.C0767f;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

public class Slide extends Visibility {

    /* renamed from: a */
    private static final TimeInterpolator f5254a = new DecelerateInterpolator();

    /* renamed from: i */
    private static final TimeInterpolator f5255i = new AccelerateInterpolator();

    /* renamed from: l */
    private static final AbstractC1496a f5256l = new AbstractC1497b() {
        /* class androidx.transition.Slide.C14901 */

        @Override // androidx.transition.Slide.AbstractC1496a
        /* renamed from: a */
        public float mo7875a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    };

    /* renamed from: m */
    private static final AbstractC1496a f5257m = new AbstractC1497b() {
        /* class androidx.transition.Slide.C14912 */

        @Override // androidx.transition.Slide.AbstractC1496a
        /* renamed from: a */
        public float mo7875a(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (ViewCompat.m4082h(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    };

    /* renamed from: n */
    private static final AbstractC1496a f5258n = new AbstractC1498c() {
        /* class androidx.transition.Slide.C14923 */

        @Override // androidx.transition.Slide.AbstractC1496a
        /* renamed from: b */
        public float mo7876b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    };

    /* renamed from: o */
    private static final AbstractC1496a f5259o = new AbstractC1497b() {
        /* class androidx.transition.Slide.C14934 */

        @Override // androidx.transition.Slide.AbstractC1496a
        /* renamed from: a */
        public float mo7875a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    };

    /* renamed from: p */
    private static final AbstractC1496a f5260p = new AbstractC1497b() {
        /* class androidx.transition.Slide.C14945 */

        @Override // androidx.transition.Slide.AbstractC1496a
        /* renamed from: a */
        public float mo7875a(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (ViewCompat.m4082h(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    };

    /* renamed from: q */
    private static final AbstractC1496a f5261q = new AbstractC1498c() {
        /* class androidx.transition.Slide.C14956 */

        @Override // androidx.transition.Slide.AbstractC1496a
        /* renamed from: b */
        public float mo7876b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    };

    /* renamed from: j */
    private AbstractC1496a f5262j = f5261q;

    /* renamed from: k */
    private int f5263k = 80;

    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.transition.Slide$a */
    public interface AbstractC1496a {
        /* renamed from: a */
        float mo7875a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo7876b(ViewGroup viewGroup, View view);
    }

    /* renamed from: androidx.transition.Slide$b */
    private static abstract class AbstractC1497b implements AbstractC1496a {
        private AbstractC1497b() {
        }

        @Override // androidx.transition.Slide.AbstractC1496a
        /* renamed from: b */
        public float mo7876b(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: androidx.transition.Slide$c */
    private static abstract class AbstractC1498c implements AbstractC1496a {
        private AbstractC1498c() {
        }

        @Override // androidx.transition.Slide.AbstractC1496a
        /* renamed from: a */
        public float mo7875a(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public Slide() {
        mo7874a(80);
    }

    @Override // androidx.transition.Transition, androidx.transition.Visibility
    /* renamed from: a */
    public void mo7807a(C1562y yVar) {
        super.mo7807a(yVar);
        m6793d(yVar);
    }

    @Override // androidx.transition.Transition, androidx.transition.Visibility
    /* renamed from: b */
    public void mo7810b(C1562y yVar) {
        super.mo7810b(yVar);
        m6793d(yVar);
    }

    /* renamed from: d */
    private void m6793d(C1562y yVar) {
        int[] iArr = new int[2];
        yVar.f5459b.getLocationOnScreen(iArr);
        yVar.f5458a.put("android:slide:screenPosition", iArr);
    }

    /* renamed from: a */
    public void mo7874a(int i) {
        if (i == 3) {
            this.f5262j = f5256l;
        } else if (i == 5) {
            this.f5262j = f5259o;
        } else if (i == 48) {
            this.f5262j = f5258n;
        } else if (i == 80) {
            this.f5262j = f5261q;
        } else if (i == 8388611) {
            this.f5262j = f5257m;
        } else if (i == 8388613) {
            this.f5262j = f5260p;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.f5263k = i;
        C1552r rVar = new C1552r();
        rVar.mo8052a(i);
        mo7892a(rVar);
    }

    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1553s.f5438h);
        int a = C0767f.m3693a(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        mo7874a(a);
    }

    @Override // androidx.transition.Visibility
    /* renamed from: a */
    public Animator mo7869a(ViewGroup viewGroup, View view, C1562y yVar, C1562y yVar2) {
        if (yVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) yVar2.f5458a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C1513aa.m6959a(view, yVar2, iArr[0], iArr[1], this.f5262j.mo7875a(viewGroup, view), this.f5262j.mo7876b(viewGroup, view), translationX, translationY, f5254a, this);
    }

    @Override // androidx.transition.Visibility
    /* renamed from: b */
    public Animator mo7870b(ViewGroup viewGroup, View view, C1562y yVar, C1562y yVar2) {
        if (yVar == null) {
            return null;
        }
        int[] iArr = (int[]) yVar.f5458a.get("android:slide:screenPosition");
        return C1513aa.m6959a(view, yVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f5262j.mo7875a(viewGroup, view), this.f5262j.mo7876b(viewGroup, view), f5255i, this);
    }
}
