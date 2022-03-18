package com.tonicartos.superslim;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.tonicartos.superslim.C65671a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;

public class LayoutManager extends RecyclerView.LayoutManager {

    /* renamed from: a */
    private final AbstractC65675d f165431a = new C65673b(this);

    /* renamed from: b */
    private final AbstractC65675d f165432b;

    /* renamed from: c */
    private int f165433c = -1;

    /* renamed from: d */
    private Rect f165434d = new Rect();

    /* renamed from: e */
    private int f165435e = 0;

    /* renamed from: f */
    private HashMap<String, AbstractC65675d> f165436f;

    /* renamed from: g */
    private boolean f165437g = true;

    public enum Direction {
        START,
        END,
        NONE
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return true;
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: a */
        public boolean f165442a;

        /* renamed from: b */
        public int f165443b;

        /* renamed from: c */
        public int f165444c;

        /* renamed from: d */
        public int f165445d;

        /* renamed from: e */
        public boolean f165446e;

        /* renamed from: f */
        public boolean f165447f;

        /* renamed from: g */
        String f165448g;

        /* renamed from: h */
        int f165449h = 1;

        /* renamed from: i */
        private int f165450i;

        @Retention(RetentionPolicy.SOURCE)
        public @interface HeaderDisplayOptions {
        }

        /* renamed from: c */
        public int mo229888c() {
            return this.f165450i;
        }

        /* renamed from: d */
        public int mo229890d() {
            int i = this.f165450i;
            if (i != -1) {
                return i;
            }
            throw new C65667b();
        }

        /* renamed from: e */
        public boolean mo229891e() {
            if ((this.f165443b & 4) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public boolean mo229892f() {
            if ((this.f165443b & 1) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public boolean mo229893g() {
            if ((this.f165443b & 8) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: h */
        public boolean mo229894h() {
            if ((this.f165443b & 2) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: i */
        public boolean mo229895i() {
            if ((this.f165443b & 16) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: com.tonicartos.superslim.LayoutManager$LayoutParams$a */
        private class C65666a extends RuntimeException {
            C65666a() {
                super("Invalid section first position given.");
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: com.tonicartos.superslim.LayoutManager$LayoutParams$b */
        public class C65667b extends RuntimeException {
            C65667b() {
                super("Missing section first position.");
            }
        }

        /* renamed from: c */
        public void mo229889c(int i) {
            this.f165449h = i;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            m257500a(layoutParams);
        }

        /* renamed from: b */
        public void mo229887b(int i) {
            if (i >= 0) {
                this.f165450i = i;
                return;
            }
            throw new C65666a();
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            m257500a(marginLayoutParams);
        }

        /* renamed from: a */
        private void m257500a(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                this.f165442a = layoutParams2.f165442a;
                this.f165443b = layoutParams2.f165443b;
                this.f165450i = layoutParams2.f165450i;
                this.f165448g = layoutParams2.f165448g;
                this.f165449h = layoutParams2.f165449h;
                this.f165444c = layoutParams2.f165444c;
                this.f165445d = layoutParams2.f165445d;
                this.f165447f = layoutParams2.f165447f;
                this.f165446e = layoutParams2.f165446e;
                return;
            }
            this.f165442a = false;
            this.f165443b = 17;
            this.f165444c = -1;
            this.f165445d = -1;
            this.f165446e = true;
            this.f165447f = true;
            this.f165449h = 1;
        }

        /* renamed from: b */
        public static LayoutParams m257501b(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams == null) {
                Log.w("SuperSLiM", "Null value passed in call to LayoutManager.LayoutParams.from().");
                return new LayoutParams(-2, -2);
            } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            } else {
                return new LayoutParams(layoutParams);
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        private void m257499a(TypedArray typedArray, boolean z) {
            if (z) {
                this.f165447f = false;
                this.f165444c = typedArray.getDimensionPixelSize(3, 0);
                return;
            }
            this.f165447f = true;
        }

        /* renamed from: b */
        private void m257502b(TypedArray typedArray, boolean z) {
            if (z) {
                this.f165446e = false;
                this.f165445d = typedArray.getDimensionPixelSize(4, 0);
                return;
            }
            this.f165446e = true;
        }

        /* renamed from: c */
        private void m257503c(TypedArray typedArray, boolean z) {
            if (z) {
                String string = typedArray.getString(5);
                this.f165448g = string;
                if (TextUtils.isEmpty(string)) {
                    this.f165449h = 1;
                } else {
                    this.f165449h = -1;
                }
            } else {
                this.f165449h = typedArray.getInt(5, 1);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5 = true;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.slm_headerDisplay, R.attr.slm_isHeader, R.attr.slm_section_firstPosition, R.attr.slm_section_headerMarginEnd, R.attr.slm_section_headerMarginStart, R.attr.slm_section_sectionManager});
            this.f165442a = obtainStyledAttributes.getBoolean(1, false);
            this.f165443b = obtainStyledAttributes.getInt(0, 17);
            this.f165450i = obtainStyledAttributes.getInt(2, -1);
            if (Build.VERSION.SDK_INT < 21) {
                TypedValue typedValue = new TypedValue();
                obtainStyledAttributes.getValue(4, typedValue);
                if (typedValue.type == 5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                m257502b(obtainStyledAttributes, z3);
                obtainStyledAttributes.getValue(3, typedValue);
                if (typedValue.type == 5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                m257499a(obtainStyledAttributes, z4);
                obtainStyledAttributes.getValue(5, typedValue);
                m257503c(obtainStyledAttributes, typedValue.type != 3 ? false : z5);
            } else {
                if (obtainStyledAttributes.getType(4) == 5) {
                    z = true;
                } else {
                    z = false;
                }
                m257502b(obtainStyledAttributes, z);
                if (obtainStyledAttributes.getType(3) == 5) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                m257499a(obtainStyledAttributes, z2);
                m257503c(obtainStyledAttributes, obtainStyledAttributes.getType(5) != 3 ? false : z5);
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.tonicartos.superslim.LayoutManager.SavedState.C656681 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        public int f165451a;

        /* renamed from: b */
        public int f165452b;

        public int describeContents() {
            return 0;
        }

        protected SavedState() {
        }

        protected SavedState(Parcel parcel) {
            this.f165451a = parcel.readInt();
            this.f165452b = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f165451a);
            parcel.writeInt(this.f165452b);
        }
    }

    /* renamed from: a */
    public View mo229880a() {
        View a;
        C65674c cVar = new C65674c(this, getChildAt(0));
        View a2 = m257471a(cVar).mo229913a(cVar.f165460a, false);
        int position = getPosition(a2);
        if (position > cVar.f165460a + 1 || position == cVar.f165460a || (a = m257467a(cVar.f165460a, 0, Direction.START)) == null) {
            return a2;
        }
        if (getDecoratedBottom(a) <= getDecoratedTop(a2)) {
            return a;
        }
        LayoutParams layoutParams = (LayoutParams) a.getLayoutParams();
        return ((!layoutParams.mo229892f() || layoutParams.mo229893g()) && getDecoratedTop(a) == getDecoratedTop(a2)) ? a : a2;
    }

    /* renamed from: a */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams b = LayoutParams.m257501b(layoutParams);
        b.width = -1;
        b.height = -1;
        return m257470a(b).mo229869a(b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo229879a(View view, Direction direction) {
        if (view == null) {
            if (direction == Direction.START) {
                return getPaddingBottom();
            }
            return getPaddingTop();
        } else if (direction == Direction.START) {
            return getDecoratedBottom(view);
        } else {
            return getDecoratedTop(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo229882a(View view) {
        int i;
        int i2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        if (!layoutParams.mo229893g()) {
            if (layoutParams.mo229894h() && !layoutParams.f165446e) {
                i2 = layoutParams.f165445d;
            } else if (layoutParams.mo229891e() && !layoutParams.f165447f) {
                i2 = layoutParams.f165444c;
            }
            i = width - i2;
            measureChildWithMargins(view, i, 0);
        }
        i = 0;
        measureChildWithMargins(view, i, 0);
    }

    /* renamed from: a */
    private void m257472a(View view, int i, C65674c cVar, C65671a aVar) {
        if (aVar.mo229905b(cVar.f165460a) != null && getDecoratedBottom(view) > i) {
            addView(view, m257484c(cVar.f165460a) + 1);
            aVar.mo229903a(cVar.f165460a);
        }
    }

    /* renamed from: a */
    private View m257468a(int i, Direction direction) {
        if (direction == Direction.END) {
            return m257479b(i);
        }
        return m257480b(0, getChildCount() - 1, i);
    }

    /* renamed from: a */
    private View m257467a(int i, int i2, Direction direction) {
        int i3 = direction == Direction.START ? 1 : -1;
        while (i2 >= 0 && i2 < getChildCount()) {
            View childAt = getChildAt(i2);
            if (getPosition(childAt) == i) {
                return childAt;
            }
            if (((LayoutParams) childAt.getLayoutParams()).mo229890d() != i) {
                return null;
            }
            i2 += i3;
        }
        return null;
    }

    /* renamed from: a */
    public int mo229878a(int i) {
        C65674c cVar = new C65674c(this, getChildAt(0));
        if (i < getPosition(m257471a(cVar).mo229913a(cVar.f165460a, true))) {
            return -1;
        }
        return 1;
    }

    /* renamed from: b */
    private View m257481b(int i, Direction direction, C65671a aVar) {
        int i2;
        if (direction == Direction.START) {
            i2 = 0;
        } else {
            i2 = getChildCount() - 1;
        }
        View a = m257467a(i, i2, direction);
        if (a != null) {
            return a;
        }
        C65671a.C65672a c = aVar.mo229907c(i);
        View view = c.f165457a;
        if (c.mo229908a().f165442a) {
            mo229882a(c.f165457a);
        }
        aVar.mo229904a(i, view);
        return view;
    }

    /* renamed from: a */
    private AbstractC65675d m257469a(int i, String str) {
        if (i == -1) {
            return this.f165436f.get(str);
        }
        if (i == 1) {
            return this.f165431a;
        }
        if (i == 2) {
            return this.f165432b;
        }
        throw new C65669a(i);
    }

    /* renamed from: a */
    private AbstractC65675d m257470a(LayoutParams layoutParams) {
        if (layoutParams.f165449h == -1) {
            return this.f165436f.get(layoutParams.f165448g);
        }
        if (layoutParams.f165449h == 1) {
            return this.f165431a;
        }
        if (layoutParams.f165449h == 2) {
            return this.f165432b;
        }
        throw new C65669a(layoutParams.f165449h);
    }

    /* renamed from: a */
    private AbstractC65675d m257471a(C65674c cVar) {
        AbstractC65675d dVar;
        if (cVar.f165471l.f165449h == -1) {
            dVar = this.f165436f.get(cVar.f165463d);
            if (dVar == null) {
                throw new C65670b(cVar.f165463d);
            }
        } else if (cVar.f165471l.f165449h == 1) {
            dVar = this.f165431a;
        } else if (cVar.f165471l.f165449h == 2) {
            dVar = this.f165432b;
        } else {
            throw new C65669a(cVar.f165471l.f165449h);
        }
        return dVar.mo229873b(cVar);
    }

    /* renamed from: a */
    private boolean m257474a(C65671a aVar) {
        int itemCount = aVar.mo229902a().getItemCount();
        if (getChildCount() == 0) {
            return false;
        }
        View a = mo229880a();
        boolean z = getPosition(a) == 0;
        boolean z2 = getDecoratedTop(a) > getPaddingTop();
        boolean z3 = getDecoratedTop(a) == getPaddingTop();
        if (z && z2) {
            return true;
        }
        if (z && z3) {
            return false;
        }
        View c = mo229884c();
        boolean z4 = getPosition(c) == itemCount - 1;
        boolean z5 = getDecoratedBottom(c) < getHeight() - getPaddingBottom();
        if (!z4 || !z5) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private Rect m257466a(Rect rect, C65674c cVar, C65671a aVar) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (cVar.f165471l.mo229891e()) {
            if (cVar.f165471l.mo229893g() || cVar.f165471l.f165447f || cVar.f165470k <= 0) {
                if (aVar.f165455c) {
                    rect.right = getWidth() - paddingRight;
                    rect.left = rect.right - cVar.f165465f;
                } else {
                    rect.left = paddingLeft;
                    rect.right = rect.left + cVar.f165465f;
                }
            } else if (aVar.f165455c) {
                rect.left = (getWidth() - cVar.f165470k) - paddingRight;
                rect.right = rect.left + cVar.f165465f;
            } else {
                rect.right = cVar.f165470k + paddingLeft;
                rect.left = rect.right - cVar.f165465f;
            }
        } else if (!cVar.f165471l.mo229894h()) {
            rect.left = paddingLeft;
            rect.right = rect.left + cVar.f165465f;
        } else if (cVar.f165471l.mo229893g() || cVar.f165471l.f165446e || cVar.f165469j <= 0) {
            if (aVar.f165455c) {
                rect.left = paddingLeft;
                rect.right = rect.left + cVar.f165465f;
            } else {
                rect.right = getWidth() - paddingRight;
                rect.left = rect.right - cVar.f165465f;
            }
        } else if (aVar.f165455c) {
            rect.right = cVar.f165469j + paddingLeft;
            rect.left = rect.right - cVar.f165465f;
        } else {
            rect.left = (getWidth() - cVar.f165469j) - paddingRight;
            rect.right = rect.left + cVar.f165465f;
        }
        return rect;
    }

    /* renamed from: b */
    private void m257483b(C65671a aVar) {
        int height = getHeight();
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (getDecoratedTop(childAt) >= height) {
                removeAndRecycleView(childAt, aVar.f165453a);
            } else if (!((LayoutParams) childAt.getLayoutParams()).f165442a) {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m257473a(Direction direction, C65671a aVar) {
        if (direction == Direction.START) {
            m257487c(aVar);
        } else {
            m257483b(aVar);
        }
    }

    /* renamed from: b */
    private void m257482b(View view) {
        int c;
        int i;
        int i2;
        C65674c cVar = new C65674c(this, view);
        if (cVar.f165471l.mo229895i() && (c = m257484c(cVar.f165460a)) != -1) {
            AbstractC65675d a = m257471a(cVar);
            int a2 = a.mo229862a(cVar.f165460a, c, getHeight());
            int b = a.mo229914b(cVar.f165460a, 0, 0);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(view);
            if ((cVar.f165471l.mo229892f() && !cVar.f165471l.mo229893g()) || a2 - b >= decoratedMeasuredHeight) {
                int decoratedLeft = getDecoratedLeft(view);
                int decoratedRight = getDecoratedRight(view);
                int i3 = decoratedMeasuredHeight + 0;
                if (i3 > a2) {
                    i = a2;
                    i2 = a2 - decoratedMeasuredHeight;
                } else {
                    i = i3;
                    i2 = 0;
                }
                layoutDecorated(view, decoratedLeft, i2, decoratedRight, i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: b */
    public int mo229883b() {
        View a = mo229880a();
        if (a == null) {
            return -1;
        }
        return getPosition(a);
    }

    /* renamed from: c */
    public View mo229884c() {
        C65674c cVar = new C65674c(this, getChildAt(getChildCount() - 1));
        return m257471a(cVar).mo229917d(cVar.f165460a);
    }

    /* renamed from: d */
    public int mo229885d() {
        C65674c cVar = new C65674c(this, getChildAt(getChildCount() - 1));
        return m257471a(cVar).mo229916c(cVar.f165460a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        View g = m257490g();
        if (g == null) {
            savedState.f165451a = 0;
            savedState.f165452b = 0;
        } else {
            savedState.f165451a = getPosition(g);
            savedState.f165452b = getDecoratedTop(g);
        }
        return savedState;
    }

    /* renamed from: e */
    private View m257488e() {
        if (getChildCount() == 1) {
            return getChildAt(0);
        }
        View childAt = getChildAt(getChildCount() - 1);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        if (!layoutParams.f165442a) {
            return childAt;
        }
        View childAt2 = getChildAt(getChildCount() - 2);
        return ((LayoutParams) childAt2.getLayoutParams()).mo229890d() == layoutParams.mo229890d() ? childAt2 : childAt;
    }

    /* renamed from: f */
    private View m257489f() {
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int d = layoutParams.mo229890d();
        if (layoutParams.f165442a && 1 < getChildCount()) {
            View childAt2 = getChildAt(1);
            if (((LayoutParams) childAt2.getLayoutParams()).mo229890d() == d) {
                return childAt2;
            }
        }
        return childAt;
    }

    /* renamed from: g */
    private View m257490g() {
        if (getChildCount() == 0) {
            return null;
        }
        View childAt = getChildAt(0);
        int d = ((LayoutParams) childAt.getLayoutParams()).mo229890d();
        View a = m257467a(d, 0, Direction.START);
        if (a == null) {
            return childAt;
        }
        LayoutParams layoutParams = (LayoutParams) a.getLayoutParams();
        if (!layoutParams.f165442a) {
            return childAt;
        }
        if (!layoutParams.mo229892f() || layoutParams.mo229893g()) {
            if (getDecoratedTop(childAt) >= getDecoratedTop(a) && d + 1 == getPosition(childAt)) {
                return a;
            }
            return childAt;
        } else if (getDecoratedBottom(a) <= getDecoratedTop(childAt)) {
            return a;
        } else {
            return childAt;
        }
    }

    /* renamed from: c */
    private int m257484c(int i) {
        return m257459a(0, getChildCount() - 1, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        if (!this.f165437g) {
            return state.getItemCount();
        }
        return getHeight();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getDecoratedBottom(View view) {
        return super.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getDecoratedLeft(View view) {
        return super.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getDecoratedRight(View view) {
        return super.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getDecoratedTop(View view) {
        return super.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        this.f165433c = savedState.f165451a;
        this.f165435e = savedState.f165452b;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getDecoratedMeasuredHeight(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return super.getDecoratedMeasuredHeight(view) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getDecoratedMeasuredWidth(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return super.getDecoratedMeasuredWidth(view) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        View g = m257490g();
        if (g == null) {
            this.f165433c = -1;
            this.f165435e = 0;
            return;
        }
        this.f165433c = getPosition(g);
        this.f165435e = getDecoratedTop(g);
    }

    public LayoutManager(Context context) {
        this.f165432b = new GridSLM(this, context);
        this.f165436f = new HashMap<>();
    }

    /* renamed from: b */
    private View m257479b(int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.mo229890d() != i) {
                return null;
            }
            if (layoutParams.f165442a) {
                return childAt;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0 || state.getItemCount() == 0) {
            return 0;
        }
        if (!this.f165437g) {
            return getChildCount();
        }
        return (int) ((((((float) getChildCount()) - m257458a(state, true)) - m257475b(state, true)) / ((float) state.getItemCount())) * ((float) getHeight()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0 || state.getItemCount() == 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (!this.f165437g) {
            return getPosition(childAt);
        }
        return (int) (((((float) getPosition(childAt)) + m257458a(state, false)) / ((float) state.getItemCount())) * ((float) getHeight()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        if (i < 0 || getItemCount() <= i) {
            Log.e("SuperSLiM.LayoutManager", "Ignored scroll to " + i + " as it is not within the item range 0 - " + getItemCount());
            return;
        }
        this.f165433c = i;
        requestLayout();
    }

    /* renamed from: c */
    private void m257487c(C65671a aVar) {
        View view;
        int i = 0;
        while (true) {
            if (i >= getChildCount()) {
                view = null;
                i = 0;
                break;
            }
            view = getChildAt(i);
            if (getDecoratedBottom(view) > 0) {
                break;
            }
            i++;
        }
        if (view == null) {
            detachAndScrapAttachedViews(aVar.f165453a);
            return;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.f165442a) {
            int i2 = i - 1;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i2).getLayoutParams();
                if (layoutParams2.mo229890d() == layoutParams.mo229890d()) {
                    i = i2;
                    layoutParams = layoutParams2;
                    break;
                }
                i2--;
            }
        }
        for (int i3 = 0; i3 < i; i3++) {
            removeAndRecycleViewAt(0, aVar.f165453a);
        }
        View a = m257468a(layoutParams.mo229890d(), Direction.START);
        if (a != null) {
            if (getDecoratedTop(a) < 0) {
                m257482b(a);
            }
            if (getDecoratedBottom(a) <= 0) {
                removeAndRecycleView(a, aVar.f165453a);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tonicartos.superslim.LayoutManager$a */
    public class C65669a extends RuntimeException {
        public C65669a(int i) {
            super("SLM not yet implemented " + i + ".");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tonicartos.superslim.LayoutManager$b */
    public class C65670b extends RuntimeException {
        public C65670b(String str) {
            super("No registered layout for id " + str + ".");
        }
    }

    /* renamed from: a */
    private int m257463a(View view, int i) {
        if (view == null) {
            return i;
        }
        detachView(view);
        attachView(view, -1);
        return Math.max(i, getDecoratedBottom(view));
    }

    /* renamed from: a */
    private int m257462a(int i, C65671a aVar) {
        View e = m257488e();
        C65674c cVar = new C65674c(this, m257481b(((LayoutParams) e.getLayoutParams()).mo229890d(), Direction.END, aVar));
        int a = m257463a(m257479b(cVar.f165460a), m257471a(cVar).mo229865a(i, e, cVar, aVar));
        if (a <= i) {
            return m257460a(i, a, aVar);
        }
        return a;
    }

    /* renamed from: c */
    private void m257486c(int i, C65671a aVar) {
        if (m257474a(aVar)) {
            offsetChildrenVertical((getHeight() - getPaddingBottom()) - i);
            int b = m257477b(0, aVar);
            if (b > getPaddingTop()) {
                offsetChildrenVertical(getPaddingTop() - b);
            }
        }
    }

    /* renamed from: b */
    private int m257477b(int i, C65671a aVar) {
        int b;
        View f = m257489f();
        View b2 = m257481b(((LayoutParams) f.getLayoutParams()).mo229890d(), Direction.START, aVar);
        C65674c cVar = new C65674c(this, b2);
        AbstractC65675d a = m257471a(cVar);
        int position = getPosition(f);
        if (position == cVar.f165460a) {
            b = getDecoratedTop(f);
        } else if (position - 1 != cVar.f165460a || !cVar.f165461b) {
            b = a.mo229872b(i, f, cVar, aVar);
        } else {
            b = getDecoratedTop(f);
        }
        int a2 = m257465a(b2, i, b, cVar, aVar);
        if (a2 > i) {
            return m257476b(i, a2, aVar);
        }
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r1.type == 3) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (r0.getType(5) == 3) goto L_0x0020;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            r0 = 6
            int[] r0 = new int[r0]
            r0 = {x004a: FILL_ARRAY_DATA  , data: [2130970173, 2130970174, 2130970175, 2130970176, 2130970177, 2130970178} // fill-array
            android.content.res.TypedArray r0 = r8.obtainStyledAttributes(r9, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 3
            r4 = 1
            r5 = 5
            r6 = 21
            if (r1 >= r6) goto L_0x0022
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0.getValue(r5, r1)
            int r1 = r1.type
            if (r1 != r3) goto L_0x0029
        L_0x0020:
            r2 = 1
            goto L_0x0029
        L_0x0022:
            int r1 = r0.getType(r5)
            if (r1 != r3) goto L_0x0029
            goto L_0x0020
        L_0x0029:
            r1 = 0
            if (r2 == 0) goto L_0x0039
            java.lang.String r1 = r0.getString(r5)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0037
            goto L_0x003d
        L_0x0037:
            r4 = -1
            goto L_0x003d
        L_0x0039:
            int r4 = r0.getInt(r5, r4)
        L_0x003d:
            r0.recycle()
            com.tonicartos.superslim.d r0 = r7.m257469a(r4, r1)
            com.tonicartos.superslim.LayoutManager$LayoutParams r8 = r0.mo229868a(r8, r9)
            return r8
            fill-array 0x004a: FILL_ARRAY_DATA  , data: [2130970173, 2130970174, 2130970175, 2130970176, 2130970177, 2130970178]
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tonicartos.superslim.LayoutManager.generateLayoutParams(android.content.Context, android.util.AttributeSet):androidx.recyclerview.widget.RecyclerView$LayoutParams");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i;
        int i2;
        int itemCount = state.getItemCount();
        if (itemCount == 0) {
            detachAndScrapAttachedViews(recycler);
            return;
        }
        int i3 = this.f165433c;
        int i4 = 0;
        if (i3 != -1) {
            i2 = Math.min(i3, itemCount - 1);
            this.f165433c = -1;
            i = this.f165435e;
            this.f165435e = 0;
        } else {
            View g = m257490g();
            if (g != null) {
                i4 = Math.min(getPosition(g), itemCount - 1);
            }
            i = mo229879a(g, Direction.END);
            i2 = i4;
        }
        detachAndScrapAttachedViews(recycler);
        C65671a aVar = new C65671a(this, recycler, state);
        m257486c(m257485c(i2, i, aVar), aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float m257458a(androidx.recyclerview.widget.RecyclerView.State r17, boolean r18) {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tonicartos.superslim.LayoutManager.m257458a(androidx.recyclerview.widget.RecyclerView$State, boolean):float");
    }

    /* renamed from: b */
    private float m257475b(RecyclerView.State state, boolean z) {
        float height = (float) getHeight();
        View childAt = getChildAt(getChildCount() - 1);
        int position = getPosition(childAt);
        C65674c cVar = new C65674c(this, childAt);
        SparseArray<Boolean> sparseArray = new SparseArray<>();
        int i = 0;
        float f = BitmapDescriptorFactory.HUE_RED;
        int i2 = -1;
        for (int i3 = 1; i3 <= getChildCount(); i3++) {
            View childAt2 = getChildAt(getChildCount() - i3);
            LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
            if (!cVar.mo229910a(layoutParams)) {
                break;
            }
            int position2 = getPosition(childAt2);
            if (!layoutParams.f165442a && !z && position2 > position) {
                i++;
            }
            float decoratedBottom = (float) getDecoratedBottom(childAt2);
            float decoratedTop = (float) getDecoratedTop(childAt2);
            if (decoratedBottom > height) {
                if (height < decoratedTop) {
                    f += 1.0f;
                } else {
                    f += (decoratedBottom - height) / ((float) getDecoratedMeasuredHeight(childAt2));
                }
                if (!layoutParams.f165442a) {
                    if (i2 == -1) {
                        i2 = position2;
                    }
                    sparseArray.put(position2, true);
                }
            }
        }
        return (f - ((float) i)) - ((float) m257471a(cVar).mo229915b(i2, sparseArray));
    }

    /* renamed from: a */
    private int m257461a(int i, Direction direction, C65671a aVar) {
        if (direction == Direction.START) {
            return m257477b(i, aVar);
        }
        return m257462a(i, aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        super.onItemsUpdated(recyclerView, i, i2);
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(getChildCount() - 1);
        if (i2 + i > getPosition(childAt) && i <= getPosition(childAt2)) {
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(final RecyclerView recyclerView, RecyclerView.State state, final int i) {
        if (i < 0 || getItemCount() <= i) {
            Log.e("SuperSLiM.LayoutManager", "Ignored smooth scroll to " + i + " as it is not within the item range 0 - " + getItemCount());
            return;
        }
        requestLayout();
        recyclerView.getHandler().post(new Runnable() {
            /* class com.tonicartos.superslim.LayoutManager.RunnableC656641 */

            public void run() {
                C656651 r0 = new LinearSmoothScroller(recyclerView.getContext()) {
                    /* class com.tonicartos.superslim.LayoutManager.RunnableC656641.C656651 */

                    /* access modifiers changed from: protected */
                    @Override // androidx.recyclerview.widget.LinearSmoothScroller
                    public int getVerticalSnapPreference() {
                        return -1;
                    }

                    /* access modifiers changed from: protected */
                    @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                    public void onStop() {
                        super.onStop();
                        LayoutManager.this.requestLayout();
                    }

                    /* access modifiers changed from: protected */
                    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
                    public void onChildAttachedToWindow(View view) {
                        super.onChildAttachedToWindow(view);
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
                    public PointF computeScrollVectorForPosition(int i) {
                        if (getChildCount() == 0) {
                            return null;
                        }
                        return new PointF(BitmapDescriptorFactory.HUE_RED, (float) LayoutManager.this.mo229878a(i));
                    }

                    @Override // androidx.recyclerview.widget.LinearSmoothScroller
                    public int calculateDyToMakeVisible(View view, int i) {
                        int i2;
                        RecyclerView.LayoutManager layoutManager = getLayoutManager();
                        if (!layoutManager.canScrollVertically()) {
                            return 0;
                        }
                        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                        int decoratedTop = layoutManager.getDecoratedTop(view) - layoutParams.topMargin;
                        int decoratedBottom = layoutManager.getDecoratedBottom(view) + layoutParams.bottomMargin;
                        if (LayoutManager.this.getPosition(view) == 0) {
                            i2 = layoutManager.getPaddingTop();
                        } else {
                            i2 = 0;
                        }
                        int calculateDtToFit = calculateDtToFit(decoratedTop, decoratedBottom, i2, layoutManager.getHeight() - layoutManager.getPaddingBottom(), i);
                        if (calculateDtToFit == 0) {
                            return 1;
                        }
                        return calculateDtToFit;
                    }
                };
                r0.setTargetPosition(i);
                LayoutManager.this.startSmoothScroll(r0);
            }
        });
    }

    /* renamed from: a */
    private int m257459a(int i, int i2, int i3) {
        if (i2 < i) {
            return -1;
        }
        int i4 = ((i2 - i) / 2) + i;
        LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
        if (layoutParams.mo229890d() < i3) {
            return m257459a(i4 + 1, i2, i3);
        }
        if (layoutParams.mo229890d() > i3 || layoutParams.f165442a) {
            return m257459a(i, i4 - 1, i3);
        }
        if (i4 == getChildCount() - 1) {
            return i4;
        }
        int i5 = i4 + 1;
        LayoutParams layoutParams2 = (LayoutParams) getChildAt(i5).getLayoutParams();
        if (layoutParams2.mo229890d() != i3) {
            return i4;
        }
        if (!layoutParams2.f165442a || (i5 != getChildCount() - 1 && ((LayoutParams) getChildAt(i4 + 2).getLayoutParams()).mo229890d() == i3)) {
            return m257459a(i5, i2, i3);
        }
        return i4;
    }

    /* renamed from: c */
    private int m257485c(int i, int i2, C65671a aVar) {
        int i3;
        int i4;
        int height = getHeight();
        C65671a.C65672a c = aVar.mo229907c(i);
        aVar.mo229904a(i, c.f165457a);
        int d = c.mo229908a().mo229890d();
        C65671a.C65672a c2 = aVar.mo229907c(d);
        mo229882a(c2.f165457a);
        aVar.mo229904a(d, c2.f165457a);
        C65674c cVar = new C65674c(this, c2.f165457a);
        AbstractC65675d a = m257471a(cVar);
        if (!cVar.f165461b || i != cVar.f165460a) {
            i3 = i;
            i4 = i2;
        } else {
            i4 = m257478b(c2.f165457a, i2, cVar, aVar);
            i3 = i + 1;
        }
        int a2 = a.mo229863a(height, i4, i3, cVar, aVar);
        if (!cVar.f165461b || i == cVar.f165460a) {
            a2 = Math.max(a2, getDecoratedBottom(c2.f165457a));
        } else {
            m257464a(c2.f165457a, 0, i2, a.mo229866a(i3, cVar, aVar), a2, cVar, aVar);
        }
        if (cVar.f165461b && getDecoratedBottom(c2.f165457a) > 0) {
            addView(c2.f165457a);
            aVar.mo229903a(cVar.f165460a);
        }
        return m257460a(height, a2, aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        Direction direction;
        boolean z;
        int i2;
        Direction direction2;
        int paddingTop;
        if (getChildCount() == 0) {
            return 0;
        }
        C65671a aVar = new C65671a(this, recycler, state);
        if (i > 0) {
            direction = Direction.END;
        } else {
            direction = Direction.START;
        }
        if (direction == Direction.END) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        if (z) {
            i2 = height + i;
        } else {
            i2 = i;
        }
        if (z) {
            View e = m257488e();
            LayoutParams layoutParams = (LayoutParams) e.getLayoutParams();
            if (m257470a(layoutParams).mo229862a(layoutParams.mo229890d(), getChildCount() - 1, getDecoratedBottom(e)) < height - getPaddingBottom() && getPosition(e) == state.getItemCount() - 1) {
                return 0;
            }
        }
        int a = m257461a(i2, direction, aVar);
        if (!z ? (paddingTop = a - getPaddingTop()) > i : (paddingTop = (a - height) + getPaddingBottom()) < i) {
            i = paddingTop;
        }
        if (i != 0) {
            offsetChildrenVertical(-i);
            if (z) {
                direction2 = Direction.START;
            } else {
                direction2 = Direction.END;
            }
            m257473a(direction2, aVar);
        }
        aVar.mo229906b();
        return i;
    }

    /* renamed from: a */
    private int m257460a(int i, int i2, C65671a aVar) {
        int position;
        if (i2 >= i || (position = getPosition(m257488e()) + 1) >= aVar.mo229902a().getItemCount()) {
            return i2;
        }
        C65671a.C65672a c = aVar.mo229907c(position);
        C65674c cVar = new C65674c(this, c.f165457a);
        if (cVar.f165461b) {
            mo229882a(c.f165457a);
            cVar = new C65674c(this, c.f165457a);
            i2 = m257478b(c.f165457a, i2, cVar, aVar);
            position++;
        } else {
            aVar.mo229904a(position, c.f165457a);
        }
        int i3 = i2;
        if (position < aVar.mo229902a().getItemCount()) {
            i3 = m257471a(cVar).mo229863a(i, i3, position, cVar, aVar);
        }
        if (cVar.f165461b) {
            addView(c.f165457a);
            if (c.f165458b) {
                aVar.mo229903a(cVar.f165460a);
            }
            i3 = Math.max(getDecoratedBottom(c.f165457a), i3);
        }
        return m257460a(i, i3, aVar);
    }

    /* renamed from: b */
    private int m257476b(int i, int i2, C65671a aVar) {
        int i3;
        int i4;
        int i5;
        View a;
        if (i2 < i) {
            return i2;
        }
        View f = m257489f();
        View a2 = m257467a(((LayoutParams) f.getLayoutParams()).mo229888c(), 0, Direction.START);
        if (a2 != null) {
            i3 = getPosition(a2);
        } else {
            i3 = getPosition(f);
        }
        int i6 = i3 - 1;
        if (i6 < 0) {
            return i2;
        }
        View b = m257481b(aVar.mo229907c(i6).mo229908a().mo229890d(), Direction.START, aVar);
        C65674c cVar = new C65674c(this, b);
        if (cVar.f165461b) {
            mo229882a(b);
            cVar = new C65674c(this, b);
        }
        AbstractC65675d a3 = m257471a(cVar);
        if (i6 >= 0) {
            i4 = a3.mo229871b(i, i2, i6, cVar, aVar);
        } else {
            i4 = i2;
        }
        if (cVar.f165461b) {
            if ((!cVar.f165471l.mo229892f() || cVar.f165471l.mo229893g()) && (a = a3.mo229913a(cVar.f165460a, true)) != null) {
                i5 = a3.mo229866a(getPosition(a), cVar, aVar);
            } else {
                i5 = 0;
            }
            i4 = m257464a(b, i, i4, i5, i2, cVar, aVar);
            m257472a(b, i, cVar, aVar);
        }
        return m257476b(i, i4, aVar);
    }

    /* renamed from: b */
    private View m257480b(int i, int i2, int i3) {
        if (i2 < i) {
            return null;
        }
        int i4 = ((i2 - i) / 2) + i;
        View childAt = getChildAt(i4);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        if (layoutParams.mo229890d() != i3) {
            return m257480b(i, i4 - 1, i3);
        }
        if (layoutParams.f165442a) {
            return childAt;
        }
        return m257480b(i4 + 1, i2, i3);
    }

    /* renamed from: b */
    private int m257478b(View view, int i, C65674c cVar, C65671a aVar) {
        Rect a = m257466a(this.f165434d, cVar, aVar);
        a.top = i;
        a.bottom = a.top + cVar.f165466g;
        if (cVar.f165471l.mo229892f() && !cVar.f165471l.mo229893g()) {
            i = a.bottom;
        }
        if (cVar.f165471l.mo229895i() && a.top < 0) {
            a.top = 0;
            a.bottom = a.top + cVar.f165466g;
        }
        layoutDecorated(view, a.left, a.top, a.right, a.bottom);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void layoutDecorated(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        super.layoutDecorated(view, i + marginLayoutParams.leftMargin, i2 + marginLayoutParams.topMargin, i3 - marginLayoutParams.rightMargin, i4 - marginLayoutParams.bottomMargin);
    }

    /* renamed from: a */
    private int m257465a(View view, int i, int i2, C65674c cVar, C65671a aVar) {
        int i3;
        int i4;
        View a;
        if (!cVar.f165461b) {
            return i2;
        }
        AbstractC65675d a2 = m257471a(cVar);
        int c = m257484c(cVar.f165460a);
        int height = getHeight();
        int i5 = 0;
        if (c == -1) {
            i3 = 0;
        } else {
            i3 = c;
        }
        while (true) {
            if (i3 >= getChildCount()) {
                break;
            }
            View childAt = getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.mo229890d() != cVar.f165460a) {
                View a3 = m257467a(layoutParams.mo229890d(), i3, Direction.START);
                if (a3 == null) {
                    height = getDecoratedTop(childAt);
                } else {
                    height = getDecoratedTop(a3);
                }
            } else {
                i3++;
            }
        }
        if (c != -1 || !cVar.f165471l.mo229892f() || cVar.f165471l.mo229893g()) {
            i4 = i2;
        } else {
            i4 = height;
        }
        if ((!cVar.f165471l.mo229892f() || cVar.f165471l.mo229893g()) && (a = a2.mo229913a(cVar.f165460a, true)) != null) {
            i5 = a2.mo229866a(getPosition(a), cVar, aVar);
        }
        int a4 = m257464a(view, i, i4, i5, height, cVar, aVar);
        m257472a(view, i, cVar, aVar);
        return a4;
    }

    /* renamed from: a */
    private int m257464a(View view, int i, int i2, int i3, int i4, C65674c cVar, C65671a aVar) {
        Rect a = m257466a(this.f165434d, cVar, aVar);
        if (cVar.f165471l.mo229892f() && !cVar.f165471l.mo229893g()) {
            a.bottom = i2;
            a.top = a.bottom - cVar.f165466g;
        } else if (i3 <= 0) {
            a.top = i3 + i2;
            a.bottom = a.top + cVar.f165466g;
        } else {
            a.bottom = i;
            a.top = a.bottom - cVar.f165466g;
        }
        if (cVar.f165471l.mo229895i() && a.top < i && cVar.f165460a != aVar.mo229902a().getTargetScrollPosition()) {
            a.top = i;
            a.bottom = a.top + cVar.f165466g;
            if (cVar.f165471l.mo229892f() && !cVar.f165471l.mo229893g()) {
                i2 -= cVar.f165466g;
            }
        }
        if (a.bottom > i4) {
            a.bottom = i4;
            a.top = a.bottom - cVar.f165466g;
        }
        layoutDecorated(view, a.left, a.top, a.right, a.bottom);
        return Math.min(a.top, i2);
    }
}
