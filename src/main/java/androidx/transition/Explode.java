package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class Explode extends Visibility {

    /* renamed from: a */
    private static final TimeInterpolator f5244a = new DecelerateInterpolator();

    /* renamed from: i */
    private static final TimeInterpolator f5245i = new AccelerateInterpolator();

    /* renamed from: j */
    private int[] f5246j;

    public Explode() {
        this.f5246j = new int[2];
        mo7892a(new C1529c());
    }

    @Override // androidx.transition.Transition, androidx.transition.Visibility
    /* renamed from: a */
    public void mo7807a(C1562y yVar) {
        super.mo7807a(yVar);
        m6778d(yVar);
    }

    @Override // androidx.transition.Transition, androidx.transition.Visibility
    /* renamed from: b */
    public void mo7810b(C1562y yVar) {
        super.mo7810b(yVar);
        m6778d(yVar);
    }

    /* renamed from: d */
    private void m6778d(C1562y yVar) {
        View view = yVar.f5459b;
        view.getLocationOnScreen(this.f5246j);
        int[] iArr = this.f5246j;
        int i = iArr[0];
        int i2 = iArr[1];
        yVar.f5458a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    /* renamed from: a */
    private static float m6775a(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5246j = new int[2];
        mo7892a(new C1529c());
    }

    /* renamed from: a */
    private static float m6776a(View view, int i, int i2) {
        return m6775a((float) Math.max(i, view.getWidth() - i), (float) Math.max(i2, view.getHeight() - i2));
    }

    /* renamed from: a */
    private void m6777a(View view, Rect rect, int[] iArr) {
        int i;
        int i2;
        view.getLocationOnScreen(this.f5246j);
        int[] iArr2 = this.f5246j;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        Rect o = mo7922o();
        if (o == null) {
            i2 = (view.getWidth() / 2) + i3 + Math.round(view.getTranslationX());
            i = (view.getHeight() / 2) + i4 + Math.round(view.getTranslationY());
        } else {
            int centerX = o.centerX();
            i = o.centerY();
            i2 = centerX;
        }
        float centerX2 = (float) (rect.centerX() - i2);
        float centerY = (float) (rect.centerY() - i);
        if (centerX2 == BitmapDescriptorFactory.HUE_RED && centerY == BitmapDescriptorFactory.HUE_RED) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float a = m6775a(centerX2, centerY);
        float a2 = m6776a(view, i2 - i3, i - i4);
        iArr[0] = Math.round((centerX2 / a) * a2);
        iArr[1] = Math.round(a2 * (centerY / a));
    }

    @Override // androidx.transition.Visibility
    /* renamed from: a */
    public Animator mo7869a(ViewGroup viewGroup, View view, C1562y yVar, C1562y yVar2) {
        if (yVar2 == null) {
            return null;
        }
        Rect rect = (Rect) yVar2.f5458a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        m6777a(viewGroup, rect, this.f5246j);
        int[] iArr = this.f5246j;
        return C1513aa.m6959a(view, yVar2, rect.left, rect.top, translationX + ((float) iArr[0]), translationY + ((float) iArr[1]), translationX, translationY, f5244a, this);
    }

    @Override // androidx.transition.Visibility
    /* renamed from: b */
    public Animator mo7870b(ViewGroup viewGroup, View view, C1562y yVar, C1562y yVar2) {
        float f;
        float f2;
        if (yVar == null) {
            return null;
        }
        Rect rect = (Rect) yVar.f5458a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) yVar.f5459b.getTag(R.id.transition_position);
        if (iArr != null) {
            f2 = ((float) (iArr[0] - rect.left)) + translationX;
            f = ((float) (iArr[1] - rect.top)) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f2 = translationX;
            f = translationY;
        }
        m6777a(viewGroup, rect, this.f5246j);
        int[] iArr2 = this.f5246j;
        return C1513aa.m6959a(view, yVar, i, i2, translationX, translationY, f2 + ((float) iArr2[0]), f + ((float) iArr2[1]), f5245i, this);
    }
}
