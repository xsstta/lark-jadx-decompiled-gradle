package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ChangeScroll extends Transition {

    /* renamed from: a */
    private static final String[] f5213a = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public String[] mo7809a() {
        return f5213a;
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public void mo7807a(C1562y yVar) {
        m6746d(yVar);
    }

    @Override // androidx.transition.Transition
    /* renamed from: b */
    public void mo7810b(C1562y yVar) {
        m6746d(yVar);
    }

    /* renamed from: d */
    private void m6746d(C1562y yVar) {
        yVar.f5458a.put("android:changeScroll:x", Integer.valueOf(yVar.f5459b.getScrollX()));
        yVar.f5458a.put("android:changeScroll:y", Integer.valueOf(yVar.f5459b.getScrollY()));
    }

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public Animator mo7806a(ViewGroup viewGroup, C1562y yVar, C1562y yVar2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (yVar == null || yVar2 == null) {
            return null;
        }
        View view = yVar2.f5459b;
        int intValue = ((Integer) yVar.f5458a.get("android:changeScroll:x")).intValue();
        int intValue2 = ((Integer) yVar2.f5458a.get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) yVar.f5458a.get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) yVar2.f5458a.get("android:changeScroll:y")).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", intValue, intValue2);
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", intValue3, intValue4);
        }
        return C1560x.m7140a(objectAnimator, objectAnimator2);
    }
}
