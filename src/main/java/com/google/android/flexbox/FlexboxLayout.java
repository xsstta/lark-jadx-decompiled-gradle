package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.google.android.flexbox.C21537c;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayout extends ViewGroup implements AbstractC21535a {

    /* renamed from: a */
    private int f52212a;

    /* renamed from: b */
    private int f52213b;

    /* renamed from: c */
    private int f52214c;

    /* renamed from: d */
    private int f52215d;

    /* renamed from: e */
    private int f52216e;

    /* renamed from: f */
    private int f52217f;

    /* renamed from: g */
    private Drawable f52218g;

    /* renamed from: h */
    private Drawable f52219h;

    /* renamed from: i */
    private int f52220i;

    /* renamed from: j */
    private int f52221j;

    /* renamed from: k */
    private int f52222k;

    /* renamed from: l */
    private int f52223l;

    /* renamed from: m */
    private int[] f52224m;

    /* renamed from: n */
    private SparseIntArray f52225n;

    /* renamed from: o */
    private C21537c f52226o;

    /* renamed from: p */
    private List<C21536b> f52227p;

    /* renamed from: q */
    private C21537c.C21539a f52228q;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    /* renamed from: a */
    public int mo72807a(View view) {
        return 0;
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    /* renamed from: a */
    public void mo72811a(int i, View view) {
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() {
            /* class com.google.android.flexbox.FlexboxLayout.LayoutParams.C215291 */

            /* renamed from: a */
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }

            /* renamed from: a */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }
        };

        /* renamed from: a */
        private int f52229a = 1;

        /* renamed from: b */
        private float f52230b;

        /* renamed from: c */
        private float f52231c = 1.0f;

        /* renamed from: d */
        private int f52232d = -1;

        /* renamed from: e */
        private float f52233e = -1.0f;

        /* renamed from: f */
        private int f52234f;

        /* renamed from: g */
        private int f52235g;

        /* renamed from: h */
        private int f52236h = 16777215;

        /* renamed from: i */
        private int f52237i = 16777215;

        /* renamed from: j */
        private boolean f52238j;

        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: a */
        public int mo72790a() {
            return this.width;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: b */
        public int mo72791b() {
            return this.height;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: c */
        public int mo72792c() {
            return this.f52229a;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: d */
        public float mo72793d() {
            return this.f52230b;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: e */
        public float mo72794e() {
            return this.f52231c;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: f */
        public int mo72795f() {
            return this.f52232d;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: g */
        public int mo72796g() {
            return this.f52234f;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: h */
        public int mo72797h() {
            return this.f52235g;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: i */
        public int mo72798i() {
            return this.f52236h;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: j */
        public int mo72799j() {
            return this.f52237i;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: k */
        public boolean mo72800k() {
            return this.f52238j;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: l */
        public float mo72801l() {
            return this.f52233e;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: m */
        public int mo72802m() {
            return this.leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: n */
        public int mo72803n() {
            return this.topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: o */
        public int mo72804o() {
            return this.rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: p */
        public int mo72805p() {
            return this.bottomMargin;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        protected LayoutParams(Parcel parcel) {
            super(0, 0);
            boolean z = false;
            this.f52229a = parcel.readInt();
            this.f52230b = parcel.readFloat();
            this.f52231c = parcel.readFloat();
            this.f52232d = parcel.readInt();
            this.f52233e = parcel.readFloat();
            this.f52234f = parcel.readInt();
            this.f52235g = parcel.readInt();
            this.f52236h = parcel.readInt();
            this.f52237i = parcel.readInt();
            this.f52238j = parcel.readByte() != 0 ? true : z;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f52229a = layoutParams.f52229a;
            this.f52230b = layoutParams.f52230b;
            this.f52231c = layoutParams.f52231c;
            this.f52232d = layoutParams.f52232d;
            this.f52233e = layoutParams.f52233e;
            this.f52234f = layoutParams.f52234f;
            this.f52235g = layoutParams.f52235g;
            this.f52236h = layoutParams.f52236h;
            this.f52237i = layoutParams.f52237i;
            this.f52238j = layoutParams.f52238j;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f52229a);
            parcel.writeFloat(this.f52230b);
            parcel.writeFloat(this.f52231c);
            parcel.writeInt(this.f52232d);
            parcel.writeFloat(this.f52233e);
            parcel.writeInt(this.f52234f);
            parcel.writeInt(this.f52235g);
            parcel.writeInt(this.f52236h);
            parcel.writeInt(this.f52237i);
            parcel.writeByte(this.f52238j ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_alignSelf, R.attr.layout_flexBasisPercent, R.attr.layout_flexGrow, R.attr.layout_flexShrink, R.attr.layout_maxHeight, R.attr.layout_maxWidth, R.attr.layout_minHeight, R.attr.layout_minWidth, R.attr.layout_order, R.attr.layout_wrapBefore});
            this.f52229a = obtainStyledAttributes.getInt(8, 1);
            this.f52230b = obtainStyledAttributes.getFloat(2, BitmapDescriptorFactory.HUE_RED);
            this.f52231c = obtainStyledAttributes.getFloat(3, 1.0f);
            this.f52232d = obtainStyledAttributes.getInt(0, -1);
            this.f52233e = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
            this.f52234f = obtainStyledAttributes.getDimensionPixelSize(7, 0);
            this.f52235g = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.f52236h = obtainStyledAttributes.getDimensionPixelSize(5, 16777215);
            this.f52237i = obtainStyledAttributes.getDimensionPixelSize(4, 16777215);
            this.f52238j = obtainStyledAttributes.getBoolean(9, false);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    public int getAlignContent() {
        return this.f52216e;
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    public int getAlignItems() {
        return this.f52215d;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f52218g;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f52219h;
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    public int getFlexDirection() {
        return this.f52212a;
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    public List<C21536b> getFlexLinesInternal() {
        return this.f52227p;
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    public int getFlexWrap() {
        return this.f52213b;
    }

    public int getJustifyContent() {
        return this.f52214c;
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    public int getMaxLine() {
        return this.f52217f;
    }

    public int getShowDividerHorizontal() {
        return this.f52220i;
    }

    public int getShowDividerVertical() {
        return this.f52221j;
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    /* renamed from: a */
    public boolean mo72814a() {
        int i = this.f52212a;
        return i == 0 || i == 1;
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    /* renamed from: a */
    public void mo72813a(C21536b bVar) {
        if (mo72814a()) {
            if ((this.f52221j & 4) > 0) {
                bVar.f52301e += this.f52223l;
                bVar.f52302f += this.f52223l;
            }
        } else if ((this.f52220i & 4) > 0) {
            bVar.f52301e += this.f52222k;
            bVar.f52302f += this.f52222k;
        }
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    /* renamed from: a */
    public void mo72812a(View view, int i, int i2, C21536b bVar) {
        if (!m77867c(i, i2)) {
            return;
        }
        if (mo72814a()) {
            bVar.f52301e += this.f52223l;
            bVar.f52302f += this.f52223l;
            return;
        }
        bVar.f52301e += this.f52222k;
        bVar.f52302f += this.f52222k;
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    public int getFlexItemCount() {
        return getChildCount();
    }

    /* renamed from: b */
    private void m77863b() {
        if (this.f52218g == null && this.f52219h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    public int getLargestMainSize() {
        int i = Integer.MIN_VALUE;
        for (C21536b bVar : this.f52227p) {
            i = Math.max(i, bVar.f52301e);
        }
        return i;
    }

    public List<C21536b> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f52227p.size());
        for (C21536b bVar : this.f52227p) {
            if (bVar.mo72895c() != 0) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    public int getSumOfCrossSize() {
        int i;
        int i2;
        int size = this.f52227p.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C21536b bVar = this.f52227p.get(i4);
            if (m77868d(i4)) {
                if (mo72814a()) {
                    i2 = this.f52222k;
                } else {
                    i2 = this.f52223l;
                }
                i3 += i2;
            }
            if (m77871f(i4)) {
                if (mo72814a()) {
                    i = this.f52222k;
                } else {
                    i = this.f52223l;
                }
                i3 += i;
            }
            i3 += bVar.f52303g;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    public void setFlexLines(List<C21536b> list) {
        this.f52227p = list;
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    /* renamed from: a */
    public View mo72809a(int i) {
        return getChildAt(i);
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    /* renamed from: b */
    public View mo72817b(int i) {
        return mo72818c(i);
    }

    public void setAlignContent(int i) {
        if (this.f52216e != i) {
            this.f52216e = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f52215d != i) {
            this.f52215d = i;
            requestLayout();
        }
    }

    public void setFlexDirection(int i) {
        if (this.f52212a != i) {
            this.f52212a = i;
            requestLayout();
        }
    }

    public void setFlexWrap(int i) {
        if (this.f52213b != i) {
            this.f52213b = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f52214c != i) {
            this.f52214c = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f52217f != i) {
            this.f52217f = i;
            requestLayout();
        }
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.f52220i) {
            this.f52220i = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f52221j) {
            this.f52221j = i;
            requestLayout();
        }
    }

    /* renamed from: e */
    private boolean m77870e(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f52227p.get(i2).mo72895c() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public View mo72818c(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.f52224m;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable != this.f52218g) {
            this.f52218g = drawable;
            if (drawable != null) {
                this.f52222k = drawable.getIntrinsicHeight();
            } else {
                this.f52222k = 0;
            }
            m77863b();
            requestLayout();
        }
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable != this.f52219h) {
            this.f52219h = drawable;
            if (drawable != null) {
                this.f52223l = drawable.getIntrinsicWidth();
            } else {
                this.f52223l = 0;
            }
            m77863b();
            requestLayout();
        }
    }

    /* renamed from: d */
    private boolean m77868d(int i) {
        if (i < 0 || i >= this.f52227p.size()) {
            return false;
        }
        if (m77870e(i)) {
            if (mo72814a()) {
                if ((this.f52220i & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.f52221j & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (mo72814a()) {
            if ((this.f52220i & 2) != 0) {
                return true;
            }
            return false;
        } else if ((this.f52221j & 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f */
    private boolean m77871f(int i) {
        if (i < 0 || i >= this.f52227p.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.f52227p.size(); i2++) {
            if (this.f52227p.get(i2).mo72895c() > 0) {
                return false;
            }
        }
        if (mo72814a()) {
            if ((this.f52220i & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f52221j & 4) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        if (this.f52219h != null || this.f52218g != null) {
            if (this.f52220i != 0 || this.f52221j != 0) {
                int h = ViewCompat.m4082h(this);
                int i = this.f52212a;
                boolean z3 = false;
                boolean z4 = true;
                if (i == 0) {
                    if (h == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.f52213b == 2) {
                        z3 = true;
                    }
                    m77860a(canvas, z, z3);
                } else if (i == 1) {
                    if (h != 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (this.f52213b == 2) {
                        z3 = true;
                    }
                    m77860a(canvas, z2, z3);
                } else if (i == 2) {
                    if (h != 1) {
                        z4 = false;
                    }
                    if (this.f52213b == 2) {
                        z4 = !z4;
                    }
                    m77866b(canvas, z4, false);
                } else if (i == 3) {
                    if (h == 1) {
                        z3 = true;
                    }
                    if (this.f52213b == 2) {
                        z3 = !z3;
                    }
                    m77866b(canvas, z3, true);
                }
            }
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: d */
    private boolean m77869d(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View c = mo72818c(i - i3);
            if (!(c == null || c.getVisibility() == 8)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private void m77864b(int i, int i2) {
        this.f52227p.clear();
        this.f52228q.mo72920a();
        this.f52226o.mo72913b(this.f52228q, i, i2);
        this.f52227p = this.f52228q.f52319a;
        this.f52226o.mo72899a(i, i2);
        this.f52226o.mo72912b(i, i2, getPaddingLeft() + getPaddingRight());
        this.f52226o.mo72897a();
        m77858a(this.f52212a, i, i2, this.f52228q.f52320b);
    }

    /* renamed from: c */
    private boolean m77867c(int i, int i2) {
        if (m77869d(i, i2)) {
            if (mo72814a()) {
                if ((this.f52221j & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.f52220i & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (mo72814a()) {
            if ((this.f52221j & 2) != 0) {
                return true;
            }
            return false;
        } else if ((this.f52220i & 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f52225n == null) {
            this.f52225n = new SparseIntArray(getChildCount());
        }
        if (this.f52226o.mo72915b(this.f52225n)) {
            this.f52224m = this.f52226o.mo72907a(this.f52225n);
        }
        int i3 = this.f52212a;
        if (i3 == 0 || i3 == 1) {
            m77857a(i, i2);
        } else if (i3 == 2 || i3 == 3) {
            m77864b(i, i2);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f52212a);
        }
    }

    /* renamed from: a */
    private void m77857a(int i, int i2) {
        this.f52227p.clear();
        this.f52228q.mo72920a();
        this.f52226o.mo72903a(this.f52228q, i, i2);
        this.f52227p = this.f52228q.f52319a;
        this.f52226o.mo72899a(i, i2);
        if (this.f52215d == 3) {
            for (C21536b bVar : this.f52227p) {
                int i3 = Integer.MIN_VALUE;
                for (int i4 = 0; i4 < bVar.f52304h; i4++) {
                    View c = mo72818c(bVar.f52311o + i4);
                    if (!(c == null || c.getVisibility() == 8)) {
                        LayoutParams layoutParams = (LayoutParams) c.getLayoutParams();
                        if (this.f52213b != 2) {
                            i3 = Math.max(i3, c.getMeasuredHeight() + Math.max(bVar.f52308l - c.getBaseline(), layoutParams.topMargin) + layoutParams.bottomMargin);
                        } else {
                            i3 = Math.max(i3, c.getMeasuredHeight() + layoutParams.topMargin + Math.max((bVar.f52308l - c.getMeasuredHeight()) + c.getBaseline(), layoutParams.bottomMargin));
                        }
                    }
                }
                bVar.f52303g = i3;
            }
        }
        this.f52226o.mo72912b(i, i2, getPaddingTop() + getPaddingBottom());
        this.f52226o.mo72897a();
        m77858a(this.f52212a, i, i2, this.f52228q.f52320b);
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    /* renamed from: a */
    public int mo72806a(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    /* renamed from: b */
    public int mo72816b(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f52225n == null) {
            this.f52225n = new SparseIntArray(getChildCount());
        }
        this.f52224m = this.f52226o.mo72908a(view, i, layoutParams, this.f52225n);
        super.addView(view, i, layoutParams);
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    /* renamed from: a */
    public int mo72808a(View view, int i, int i2) {
        int i3;
        int i4 = 0;
        if (mo72814a()) {
            if (m77867c(i, i2)) {
                i4 = 0 + this.f52223l;
            }
            if ((this.f52221j & 4) <= 0) {
                return i4;
            }
            i3 = this.f52223l;
        } else {
            if (m77867c(i, i2)) {
                i4 = 0 + this.f52222k;
            }
            if ((this.f52220i & 4) <= 0) {
                return i4;
            }
            i3 = this.f52222k;
        }
        return i4 + i3;
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52217f = -1;
        this.f52226o = new C21537c(this);
        this.f52227p = new ArrayList();
        this.f52228q = new C21537c.C21539a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.alignContent, R.attr.alignItems, R.attr.dividerDrawable, R.attr.dividerDrawableHorizontal, R.attr.dividerDrawableVertical, R.attr.flexDirection, R.attr.flexWrap, R.attr.justifyContent, R.attr.maxLine, R.attr.showDivider, R.attr.showDividerHorizontal, R.attr.showDividerVertical}, i, 0);
        this.f52212a = obtainStyledAttributes.getInt(5, 0);
        this.f52213b = obtainStyledAttributes.getInt(6, 0);
        this.f52214c = obtainStyledAttributes.getInt(7, 0);
        this.f52215d = obtainStyledAttributes.getInt(1, 4);
        this.f52216e = obtainStyledAttributes.getInt(0, 5);
        this.f52217f = obtainStyledAttributes.getInt(8, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(9, 0);
        if (i2 != 0) {
            this.f52221j = i2;
            this.f52220i = i2;
        }
        int i3 = obtainStyledAttributes.getInt(11, 0);
        if (i3 != 0) {
            this.f52221j = i3;
        }
        int i4 = obtainStyledAttributes.getInt(10, 0);
        if (i4 != 0) {
            this.f52220i = i4;
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private void m77866b(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f52227p.size();
        for (int i5 = 0; i5 < size; i5++) {
            C21536b bVar = this.f52227p.get(i5);
            for (int i6 = 0; i6 < bVar.f52304h; i6++) {
                int i7 = bVar.f52311o + i6;
                View c = mo72818c(i7);
                if (!(c == null || c.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) c.getLayoutParams();
                    if (m77867c(i7, i6)) {
                        if (z2) {
                            i4 = c.getBottom() + layoutParams.bottomMargin;
                        } else {
                            i4 = (c.getTop() - layoutParams.topMargin) - this.f52222k;
                        }
                        m77865b(canvas, bVar.f52297a, i4, bVar.f52303g);
                    }
                    if (i6 == bVar.f52304h - 1 && (this.f52220i & 4) > 0) {
                        if (z2) {
                            i3 = (c.getTop() - layoutParams.topMargin) - this.f52222k;
                        } else {
                            i3 = c.getBottom() + layoutParams.bottomMargin;
                        }
                        m77865b(canvas, bVar.f52297a, i3, bVar.f52303g);
                    }
                }
            }
            if (m77868d(i5)) {
                if (z) {
                    i2 = bVar.f52299c;
                } else {
                    i2 = bVar.f52297a - this.f52223l;
                }
                m77859a(canvas, i2, paddingTop, max);
            }
            if (m77871f(i5) && (this.f52221j & 4) > 0) {
                if (z) {
                    i = bVar.f52297a - this.f52223l;
                } else {
                    i = bVar.f52299c;
                }
                m77859a(canvas, i, paddingTop, max);
            }
        }
    }

    /* renamed from: a */
    private void m77860a(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f52227p.size();
        for (int i5 = 0; i5 < size; i5++) {
            C21536b bVar = this.f52227p.get(i5);
            for (int i6 = 0; i6 < bVar.f52304h; i6++) {
                int i7 = bVar.f52311o + i6;
                View c = mo72818c(i7);
                if (!(c == null || c.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) c.getLayoutParams();
                    if (m77867c(i7, i6)) {
                        if (z) {
                            i4 = c.getRight() + layoutParams.rightMargin;
                        } else {
                            i4 = (c.getLeft() - layoutParams.leftMargin) - this.f52223l;
                        }
                        m77859a(canvas, i4, bVar.f52298b, bVar.f52303g);
                    }
                    if (i6 == bVar.f52304h - 1 && (this.f52221j & 4) > 0) {
                        if (z) {
                            i3 = (c.getLeft() - layoutParams.leftMargin) - this.f52223l;
                        } else {
                            i3 = c.getRight() + layoutParams.rightMargin;
                        }
                        m77859a(canvas, i3, bVar.f52298b, bVar.f52303g);
                    }
                }
            }
            if (m77868d(i5)) {
                if (z2) {
                    i2 = bVar.f52300d;
                } else {
                    i2 = bVar.f52298b - this.f52222k;
                }
                m77865b(canvas, paddingLeft, i2, max);
            }
            if (m77871f(i5) && (this.f52220i & 4) > 0) {
                if (z2) {
                    i = bVar.f52298b - this.f52222k;
                } else {
                    i = bVar.f52300d;
                }
                m77865b(canvas, paddingLeft, i, max);
            }
        }
    }

    /* renamed from: a */
    private void m77859a(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f52219h;
        if (drawable != null) {
            drawable.setBounds(i, i2, this.f52223l + i, i3 + i2);
            this.f52219h.draw(canvas);
        }
    }

    /* renamed from: b */
    private void m77865b(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f52218g;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3 + i, this.f52222k + i2);
            this.f52218g.draw(canvas);
        }
    }

    /* renamed from: a */
    private void m77858a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            i5 = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            i6 = getLargestMainSize();
        } else if (i == 2 || i == 3) {
            i5 = getLargestMainSize();
            i6 = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + i);
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = i6;
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            i7 = View.resolveSizeAndState(i6, i2, i4);
        } else if (mode == 1073741824) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else {
            throw new IllegalStateException("Unknown width mode is set: " + mode);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, DynamicModule.f58006b);
            } else {
                size2 = i5;
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            i8 = View.resolveSizeAndState(i5, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, DynamicModule.f58006b);
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new IllegalStateException("Unknown height mode is set: " + mode2);
        }
        setMeasuredDimension(i7, i8);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int h = ViewCompat.m4082h(this);
        int i5 = this.f52212a;
        boolean z6 = false;
        if (i5 == 0) {
            if (h == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            m77861a(z2, i, i2, i3, i4);
        } else if (i5 == 1) {
            if (h != 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            m77861a(z3, i, i2, i3, i4);
        } else if (i5 == 2) {
            if (h == 1) {
                z6 = true;
            }
            if (this.f52213b == 2) {
                z4 = !z6;
            } else {
                z4 = z6;
            }
            m77862a(z4, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            if (h == 1) {
                z6 = true;
            }
            if (this.f52213b == 2) {
                z5 = !z6;
            } else {
                z5 = z6;
            }
            m77862a(z5, true, i, i2, i3, i4);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f52212a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01f4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m77861a(boolean r29, int r30, int r31, int r32, int r33) {
        /*
        // Method dump skipped, instructions count: 548
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.m77861a(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01f1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m77862a(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
        // Method dump skipped, instructions count: 537
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.m77862a(boolean, boolean, int, int, int, int):void");
    }
}
