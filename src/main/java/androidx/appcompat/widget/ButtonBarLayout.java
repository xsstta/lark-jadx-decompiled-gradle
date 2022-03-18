package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.larksuite.suite.R;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    private boolean f1364a;

    /* renamed from: b */
    private int f1365b = -1;

    /* renamed from: c */
    private int f1366c;

    /* renamed from: a */
    private boolean m1650a() {
        if (getOrientation() == 1) {
            return true;
        }
        return false;
    }

    public int getMinimumHeight() {
        return Math.max(this.f1366c, super.getMinimumHeight());
    }

    /* renamed from: a */
    private int m1649a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void setAllowStacking(boolean z) {
        if (this.f1364a != z) {
            this.f1364a = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    private void setStacked(boolean z) {
        int i;
        int i2;
        setOrientation(z ? 1 : 0);
        if (z) {
            i = 5;
        } else {
            i = 80;
        }
        setGravity(i);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            if (z) {
                i2 = 8;
            } else {
                i2 = 4;
            }
            findViewById.setVisibility(i2);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.allowStacking});
        ViewCompat.m4034a(this, context, new int[]{R.attr.allowStacking}, attributeSet, obtainStyledAttributes, 0, 0);
        this.f1364a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f1364a) {
            if (size > this.f1365b && m1650a()) {
                setStacked(false);
            }
            this.f1365b = size;
        }
        if (m1650a() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f1364a && !m1650a()) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a = m1649a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m1650a()) {
                int a2 = m1649a(a + 1);
                if (a2 >= 0) {
                    paddingTop += getChildAt(a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i4 = paddingTop;
            } else {
                i4 = paddingTop + getPaddingBottom();
            }
        }
        if (ViewCompat.m4102q(this) != i4) {
            setMinimumHeight(i4);
        }
    }
}
