package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Group extends ConstraintHelper {
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo3803d();
    }

    public Group(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: a */
    public void mo3060a(AttributeSet attributeSet) {
        super.mo3060a(attributeSet);
        this.f2779n = false;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo3803d();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo3803d();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: b */
    public void mo3087b(ConstraintLayout constraintLayout) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.an.mo3579o(0);
        layoutParams.an.mo3581p(0);
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
