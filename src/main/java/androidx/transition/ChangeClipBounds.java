package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;

public class ChangeClipBounds extends Transition {

    /* renamed from: a */
    private static final String[] f5206a = {"android:clipBounds:clip"};

    public ChangeClipBounds() {
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public String[] mo7809a() {
        return f5206a;
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public void mo7807a(C1562y yVar) {
        m6728d(yVar);
    }

    @Override // androidx.transition.Transition
    /* renamed from: b */
    public void mo7810b(C1562y yVar) {
        m6728d(yVar);
    }

    /* renamed from: d */
    private void m6728d(C1562y yVar) {
        View view = yVar.f5459b;
        if (view.getVisibility() != 8) {
            Rect H = ViewCompat.m4014H(view);
            yVar.f5458a.put("android:clipBounds:clip", H);
            if (H == null) {
                yVar.f5458a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public Animator mo7806a(ViewGroup viewGroup, C1562y yVar, C1562y yVar2) {
        boolean z;
        ObjectAnimator objectAnimator = null;
        if (yVar != null && yVar2 != null && yVar.f5458a.containsKey("android:clipBounds:clip") && yVar2.f5458a.containsKey("android:clipBounds:clip")) {
            Rect rect = (Rect) yVar.f5458a.get("android:clipBounds:clip");
            Rect rect2 = (Rect) yVar2.f5458a.get("android:clipBounds:clip");
            if (rect2 == null) {
                z = true;
            } else {
                z = false;
            }
            if (rect == null && rect2 == null) {
                return null;
            }
            if (rect == null) {
                rect = (Rect) yVar.f5458a.get("android:clipBounds:bounds");
            } else if (rect2 == null) {
                rect2 = (Rect) yVar2.f5458a.get("android:clipBounds:bounds");
            }
            if (rect.equals(rect2)) {
                return null;
            }
            ViewCompat.m4038a(yVar2.f5459b, rect);
            C1550p pVar = new C1550p(new Rect());
            objectAnimator = ObjectAnimator.ofObject(yVar2.f5459b, aj.f5361b, pVar, rect, rect2);
            if (z) {
                final View view = yVar2.f5459b;
                objectAnimator.addListener(new AnimatorListenerAdapter() {
                    /* class androidx.transition.ChangeClipBounds.C14781 */

                    public void onAnimationEnd(Animator animator) {
                        ViewCompat.m4038a(view, (Rect) null);
                    }
                });
            }
        }
        return objectAnimator;
    }
}
