package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LinearLayoutCompat extends ViewGroup {
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OrientationMode {
    }

    /* access modifiers changed from: package-private */
    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int getLocationOffset(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int getNextLocationOffset(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int measureNullChild(int i) {
        return 0;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    public int getBaseline() {
        int i;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.mBaselineAlignedChildIndex;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.mBaselineChildTop;
                if (this.mOrientation == 1 && (i = this.mGravity & SmEvents.EVENT_NE_RR) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
                    }
                }
                return i3 + ((LayoutParams) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: package-private */
    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max((float) BitmapDescriptorFactory.HUE_RED, f);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: g */
        public float f1377g;

        /* renamed from: h */
        public int f1378h = -1;

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842931, 16842996, 16842997, 16843137});
            this.f1377g = obtainStyledAttributes.getFloat(3, BitmapDescriptorFactory.HUE_RED);
            this.f1378h = obtainStyledAttributes.getInt(0, -1);
            obtainStyledAttributes.recycle();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.mDivider != null) {
            if (this.mOrientation == 1) {
                drawDividersVertical(canvas);
            } else {
                drawDividersHorizontal(canvas);
            }
        }
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & SmEvents.EVENT_NE_RR) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.mGravity;
        if ((8388615 & i3) != i2) {
            this.mGravity = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & SmEvents.EVENT_NE_RR;
        int i3 = this.mGravity;
        if ((i3 & SmEvents.EVENT_NE_RR) != i2) {
            this.mGravity = i2 | (i3 & -113);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            if ((this.mShowDividers & 1) != 0) {
                return true;
            }
            return false;
        } else if (i == getChildCount()) {
            if ((this.mShowDividers & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.mShowDividers & 2) == 0) {
            return false;
        } else {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.mBaselineAlignedChildIndex = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.mDivider) {
            this.mDivider = drawable;
            boolean z = false;
            if (drawable != null) {
                this.mDividerWidth = drawable.getIntrinsicWidth();
                this.mDividerHeight = drawable.getIntrinsicHeight();
            } else {
                this.mDividerWidth = 0;
                this.mDividerHeight = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void drawDividersHorizontal(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int virtualChildCount = getVirtualChildCount();
        boolean a = al.m1864a(this);
        for (int i5 = 0; i5 < virtualChildCount; i5++) {
            View virtualChildAt = getVirtualChildAt(i5);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i5))) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (a) {
                    i4 = virtualChildAt.getRight() + layoutParams.rightMargin;
                } else {
                    i4 = (virtualChildAt.getLeft() - layoutParams.leftMargin) - this.mDividerWidth;
                }
                drawVerticalDivider(canvas, i4);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                if (a) {
                    i3 = virtualChildAt2.getLeft() - layoutParams2.leftMargin;
                    i2 = this.mDividerWidth;
                } else {
                    i = virtualChildAt2.getRight() + layoutParams2.rightMargin;
                    drawVerticalDivider(canvas, i);
                }
            } else if (a) {
                i = getPaddingLeft();
                drawVerticalDivider(canvas, i);
            } else {
                i3 = getWidth() - getPaddingRight();
                i2 = this.mDividerWidth;
            }
            i = i3 - i2;
            drawVerticalDivider(canvas, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void drawDividersVertical(Canvas canvas) {
        int i;
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View virtualChildAt = getVirtualChildAt(i2);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i2))) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LayoutParams) virtualChildAt.getLayoutParams()).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                i = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                i = virtualChildAt2.getBottom() + ((LayoutParams) virtualChildAt2.getLayoutParams()).bottomMargin;
            }
            drawHorizontalDivider(canvas, i);
        }
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    private void forceUniformHeight(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.height == -1) {
                    int i4 = layoutParams.width;
                    layoutParams.width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i2, 0, makeMeasureSpec, 0);
                    layoutParams.width = i4;
                }
            }
        }
    }

    private void forceUniformWidth(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0327  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void measureVertical(int r34, int r35) {
        /*
        // Method dump skipped, instructions count: 915
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.measureVertical(int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0454  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void measureHorizontal(int r38, int r39) {
        /*
        // Method dump skipped, instructions count: 1298
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.measureHorizontal(int, int):void");
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mGravity = 8388659;
        C0427af a = C0427af.m1778a(context, attributeSet, new int[]{16842927, 16842948, 16843046, 16843047, 16843048, R.attr.divider, R.attr.dividerPadding, R.attr.measureWithLargestChild, R.attr.showDividers}, i, 0);
        ViewCompat.m4034a(this, context, new int[]{16842927, 16842948, 16843046, 16843047, 16843048, R.attr.divider, R.attr.dividerPadding, R.attr.measureWithLargestChild, R.attr.showDividers}, attributeSet, a.mo2475a(), i, 0);
        int a2 = a.mo2474a(1, -1);
        if (a2 >= 0) {
            setOrientation(a2);
        }
        int a3 = a.mo2474a(0, -1);
        if (a3 >= 0) {
            setGravity(a3);
        }
        boolean a4 = a.mo2478a(2, true);
        if (!a4) {
            setBaselineAligned(a4);
        }
        this.mWeightSum = a.mo2473a(4, -1.0f);
        this.mBaselineAlignedChildIndex = a.mo2474a(3, -1);
        this.mUseLargestChild = a.mo2478a(7, false);
        setDividerDrawable(a.mo2477a(5));
        this.mShowDividers = a.mo2474a(8, 0);
        this.mDividerPadding = a.mo2487e(6, 0);
        a.mo2482b();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void layoutVertical(int r18, int r19, int r20, int r21) {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.layoutVertical(int, int, int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void layoutHorizontal(int r25, int r26, int r27, int r28) {
        /*
        // Method dump skipped, instructions count: 320
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.layoutHorizontal(int, int, int, int):void");
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }
}
