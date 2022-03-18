package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.suite.R;

public class MotionHelper extends ConstraintHelper implements MotionLayout.AbstractC0545g {

    /* renamed from: a */
    protected View[] f1990a;

    /* renamed from: b */
    private boolean f1991b;

    /* renamed from: c */
    private boolean f1992c;

    /* renamed from: d */
    private float f1993d;

    /* renamed from: a */
    public void mo3137a(View view, float f) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.AbstractC0545g
    /* renamed from: a */
    public void mo3138a(MotionLayout motionLayout, int i) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.AbstractC0545g
    /* renamed from: a */
    public void mo3139a(MotionLayout motionLayout, int i, int i2) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.AbstractC0545g
    /* renamed from: a */
    public void mo3140a(MotionLayout motionLayout, int i, int i2, float f) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.AbstractC0545g
    /* renamed from: a */
    public void mo3141a(MotionLayout motionLayout, int i, boolean z, float f) {
    }

    /* renamed from: b */
    public boolean mo3143b() {
        return this.f1992c;
    }

    public float getProgress() {
        return this.f1993d;
    }

    /* renamed from: a */
    public boolean mo3142a() {
        return this.f1991b;
    }

    public MotionHelper(Context context) {
        super(context);
    }

    public void setProgress(float f) {
        this.f1993d = f;
        int i = 0;
        if (this.f2776k > 0) {
            this.f1990a = mo3805e((ConstraintLayout) getParent());
            while (i < this.f2776k) {
                mo3137a(this.f1990a[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof MotionHelper)) {
                mo3137a(childAt, f);
            }
            i++;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: a */
    public void mo3060a(AttributeSet attributeSet) {
        super.mo3060a(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.onHide, R.attr.onShow});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f1991b = obtainStyledAttributes.getBoolean(index, this.f1991b);
                } else if (index == 0) {
                    this.f1992c = obtainStyledAttributes.getBoolean(index, this.f1992c);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo3060a(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo3060a(attributeSet);
    }
}
