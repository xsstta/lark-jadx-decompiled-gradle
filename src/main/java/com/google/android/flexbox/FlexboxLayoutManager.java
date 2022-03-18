package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1401r;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.C21537c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.AbstractC1331b, AbstractC21535a {

    /* renamed from: h */
    static final /* synthetic */ boolean f52239h = true;

    /* renamed from: i */
    private static final Rect f52240i = new Rect();

    /* renamed from: A */
    private int f52241A;

    /* renamed from: B */
    private C21537c.C21539a f52242B;

    /* renamed from: a */
    public int f52243a;

    /* renamed from: b */
    public int f52244b;

    /* renamed from: c */
    public boolean f52245c;

    /* renamed from: d */
    public List<C21536b> f52246d;

    /* renamed from: e */
    public final C21537c f52247e;

    /* renamed from: f */
    public AbstractC1401r f52248f;

    /* renamed from: g */
    public AbstractC1401r f52249g;

    /* renamed from: j */
    private int f52250j;

    /* renamed from: k */
    private int f52251k;

    /* renamed from: l */
    private int f52252l;

    /* renamed from: m */
    private boolean f52253m;

    /* renamed from: n */
    private RecyclerView.Recycler f52254n;

    /* renamed from: o */
    private RecyclerView.State f52255o;

    /* renamed from: p */
    private C21534b f52256p;

    /* renamed from: q */
    private C21533a f52257q;

    /* renamed from: r */
    private SavedState f52258r;

    /* renamed from: s */
    private int f52259s;

    /* renamed from: t */
    private int f52260t;

    /* renamed from: u */
    private int f52261u;

    /* renamed from: v */
    private int f52262v;

    /* renamed from: w */
    private boolean f52263w;

    /* renamed from: x */
    private SparseArray<View> f52264x;

    /* renamed from: y */
    private final Context f52265y;

    /* renamed from: z */
    private View f52266z;

    @Override // com.google.android.flexbox.AbstractC21535a
    /* renamed from: a */
    public void mo72813a(C21536b bVar) {
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    public int getAlignContent() {
        return 5;
    }

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() {
            /* class com.google.android.flexbox.FlexboxLayoutManager.LayoutParams.C215311 */

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
        private float f52267a;

        /* renamed from: b */
        private float f52268b = 1.0f;

        /* renamed from: c */
        private int f52269c = -1;

        /* renamed from: d */
        private float f52270d = -1.0f;

        /* renamed from: e */
        private int f52271e;

        /* renamed from: f */
        private int f52272f;

        /* renamed from: g */
        private int f52273g = 16777215;

        /* renamed from: h */
        private int f52274h = 16777215;

        /* renamed from: i */
        private boolean f52275i;

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: c */
        public int mo72792c() {
            return 1;
        }

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
        /* renamed from: d */
        public float mo72793d() {
            return this.f52267a;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: e */
        public float mo72794e() {
            return this.f52268b;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: f */
        public int mo72795f() {
            return this.f52269c;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: g */
        public int mo72796g() {
            return this.f52271e;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: h */
        public int mo72797h() {
            return this.f52272f;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: i */
        public int mo72798i() {
            return this.f52273g;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: j */
        public int mo72799j() {
            return this.f52274h;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: k */
        public boolean mo72800k() {
            return this.f52275i;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: l */
        public float mo72801l() {
            return this.f52270d;
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

        protected LayoutParams(Parcel parcel) {
            super(-2, -2);
            boolean z;
            this.f52267a = parcel.readFloat();
            this.f52268b = parcel.readFloat();
            this.f52269c = parcel.readInt();
            this.f52270d = parcel.readFloat();
            this.f52271e = parcel.readInt();
            this.f52272f = parcel.readInt();
            this.f52273g = parcel.readInt();
            this.f52274h = parcel.readInt();
            if (parcel.readByte() != 0) {
                z = FlexboxLayoutManager.f52239h;
            } else {
                z = false;
            }
            this.f52275i = z;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f52267a);
            parcel.writeFloat(this.f52268b);
            parcel.writeInt(this.f52269c);
            parcel.writeFloat(this.f52270d);
            parcel.writeInt(this.f52271e);
            parcel.writeInt(this.f52272f);
            parcel.writeInt(this.f52273g);
            parcel.writeInt(this.f52274h);
            parcel.writeByte(this.f52275i ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }
    }

    /* access modifiers changed from: private */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.google.android.flexbox.FlexboxLayoutManager.SavedState.C215321 */

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
        public int f52276a;

        /* renamed from: b */
        public int f52277b;

        /* renamed from: a */
        public void mo72871a() {
            this.f52276a = -1;
        }

        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f52276a + ", mAnchorOffset=" + this.f52277b + '}';
        }

        private SavedState(Parcel parcel) {
            this.f52276a = parcel.readInt();
            this.f52277b = parcel.readInt();
        }

        /* renamed from: a */
        public boolean mo72872a(int i) {
            int i2 = this.f52276a;
            if (i2 < 0 || i2 >= i) {
                return false;
            }
            return FlexboxLayoutManager.f52239h;
        }

        private SavedState(SavedState savedState) {
            this.f52276a = savedState.f52276a;
            this.f52277b = savedState.f52277b;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f52276a);
            parcel.writeInt(this.f52277b);
        }
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    public int getAlignItems() {
        return this.f52251k;
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    public int getFlexDirection() {
        return this.f52243a;
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    public List<C21536b> getFlexLinesInternal() {
        return this.f52246d;
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    public int getFlexWrap() {
        return this.f52244b;
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    public int getMaxLine() {
        return this.f52252l;
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    /* renamed from: a */
    public int mo72808a(View view, int i, int i2) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (mo72814a()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return topDecorationHeight + bottomDecorationHeight;
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    /* renamed from: a */
    public int mo72807a(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (mo72814a()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return leftDecorationWidth + rightDecorationWidth;
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    /* renamed from: a */
    public void mo72812a(View view, int i, int i2, C21536b bVar) {
        calculateItemDecorationsForChild(view, f52240i);
        if (mo72814a()) {
            int leftDecorationWidth = getLeftDecorationWidth(view) + getRightDecorationWidth(view);
            bVar.f52301e += leftDecorationWidth;
            bVar.f52302f += leftDecorationWidth;
            return;
        }
        int topDecorationHeight = getTopDecorationHeight(view) + getBottomDecorationHeight(view);
        bVar.f52301e += topDecorationHeight;
        bVar.f52302f += topDecorationHeight;
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    /* renamed from: a */
    public View mo72809a(int i) {
        View view = this.f52264x.get(i);
        if (view != null) {
            return view;
        }
        return this.f52254n.getViewForPosition(i);
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    /* renamed from: a */
    public int mo72806a(int i, int i2, int i3) {
        return getChildMeasureSpec(getWidth(), getWidthMode(), i2, i3, canScrollHorizontally());
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    /* renamed from: b */
    public int mo72816b(int i, int i2, int i3) {
        return getChildMeasureSpec(getHeight(), getHeightMode(), i2, i3, canScrollVertically());
    }

    /* renamed from: a */
    private void m77912a(RecyclerView.State state, C21533a aVar) {
        if (!m77917a(state, aVar, this.f52258r) && !m77926b(state, aVar)) {
            aVar.mo72882b();
            aVar.f52279a = 0;
            aVar.f52280b = 0;
        }
    }

    /* renamed from: a */
    private boolean m77917a(RecyclerView.State state, C21533a aVar, SavedState savedState) {
        int i;
        int i2;
        if (f52239h || this.f52247e.f52314a != null) {
            boolean z = false;
            if (!state.isPreLayout() && (i = this.f52259s) != -1) {
                if (i < 0 || i >= state.getItemCount()) {
                    this.f52259s = -1;
                    this.f52260t = Integer.MIN_VALUE;
                } else {
                    aVar.f52279a = this.f52259s;
                    aVar.f52280b = this.f52247e.f52314a[aVar.f52279a];
                    SavedState savedState2 = this.f52258r;
                    if (savedState2 != null && savedState2.mo72872a(state.getItemCount())) {
                        aVar.f52281c = this.f52248f.mo7466c() + savedState.f52277b;
                        aVar.f52285g = f52239h;
                        aVar.f52280b = -1;
                        return f52239h;
                    } else if (this.f52260t == Integer.MIN_VALUE) {
                        View findViewByPosition = findViewByPosition(this.f52259s);
                        if (findViewByPosition == null) {
                            if (getChildCount() > 0) {
                                if (this.f52259s < getPosition(getChildAt(0))) {
                                    z = f52239h;
                                }
                                aVar.f52283e = z;
                            }
                            aVar.mo72882b();
                        } else if (this.f52248f.mo7471e(findViewByPosition) > this.f52248f.mo7472f()) {
                            aVar.mo72882b();
                            return f52239h;
                        } else if (this.f52248f.mo7461a(findViewByPosition) - this.f52248f.mo7466c() < 0) {
                            aVar.f52281c = this.f52248f.mo7466c();
                            aVar.f52283e = false;
                            return f52239h;
                        } else if (this.f52248f.mo7468d() - this.f52248f.mo7465b(findViewByPosition) < 0) {
                            aVar.f52281c = this.f52248f.mo7468d();
                            aVar.f52283e = f52239h;
                            return f52239h;
                        } else {
                            if (aVar.f52283e) {
                                i2 = this.f52248f.mo7465b(findViewByPosition) + this.f52248f.mo7464b();
                            } else {
                                i2 = this.f52248f.mo7461a(findViewByPosition);
                            }
                            aVar.f52281c = i2;
                        }
                        return f52239h;
                    } else {
                        if (mo72814a() || !this.f52245c) {
                            aVar.f52281c = this.f52248f.mo7466c() + this.f52260t;
                        } else {
                            aVar.f52281c = this.f52260t - this.f52248f.mo7474g();
                        }
                        return f52239h;
                    }
                }
            }
            return false;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    private boolean m77926b(RecyclerView.State state, C21533a aVar) {
        View view;
        int i;
        boolean z = false;
        if (getChildCount() == 0) {
            return false;
        }
        if (aVar.f52283e) {
            view = m77944j(state.getItemCount());
        } else {
            view = m77942i(state.getItemCount());
        }
        if (view == null) {
            return false;
        }
        aVar.mo72881a(view);
        if (!state.isPreLayout() && supportsPredictiveItemAnimations()) {
            if (this.f52248f.mo7461a(view) >= this.f52248f.mo7468d() || this.f52248f.mo7465b(view) < this.f52248f.mo7466c()) {
                z = f52239h;
            }
            if (z) {
                if (aVar.f52283e) {
                    i = this.f52248f.mo7468d();
                } else {
                    i = this.f52248f.mo7466c();
                }
                aVar.f52281c = i;
            }
        }
        return f52239h;
    }

    /* renamed from: a */
    private void m77911a(RecyclerView.Recycler recycler, C21534b bVar) {
        if (bVar.f52296j) {
            if (bVar.f52295i == -1) {
                m77931c(recycler, bVar);
            } else {
                m77923b(recycler, bVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m77914a(View view, int i) {
        if (mo72814a() || !this.f52245c) {
            if (this.f52248f.mo7465b(view) <= i) {
                return f52239h;
            }
            return false;
        } else if (this.f52248f.mo7470e() - this.f52248f.mo7461a(view) <= i) {
            return f52239h;
        } else {
            return false;
        }
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    /* renamed from: a */
    public boolean mo72814a() {
        int i = this.f52243a;
        if (i == 0 || i == 1) {
            return f52239h;
        }
        return false;
    }

    /* renamed from: a */
    private void m77913a(C21533a aVar, boolean z, boolean z2) {
        if (z2) {
            m77937f();
        } else {
            this.f52256p.f52288b = false;
        }
        if (mo72814a() || !this.f52245c) {
            this.f52256p.f52287a = this.f52248f.mo7468d() - aVar.f52281c;
        } else {
            this.f52256p.f52287a = aVar.f52281c - getPaddingRight();
        }
        this.f52256p.f52290d = aVar.f52279a;
        this.f52256p.f52294h = 1;
        this.f52256p.f52295i = 1;
        this.f52256p.f52291e = aVar.f52281c;
        this.f52256p.f52292f = Integer.MIN_VALUE;
        this.f52256p.f52289c = aVar.f52280b;
        if (z && this.f52246d.size() > 1 && aVar.f52280b >= 0 && aVar.f52280b < this.f52246d.size() - 1) {
            this.f52256p.f52289c++;
            this.f52256p.f52290d += this.f52246d.get(aVar.f52280b).mo72894b();
        }
    }

    /* renamed from: a */
    private boolean m77915a(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        if (view.isLayoutRequested() || !isMeasurementCacheEnabled() || !m77934d(view.getWidth(), i, layoutParams.width) || !m77934d(view.getHeight(), i2, layoutParams.height)) {
            return f52239h;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m77916a(View view, boolean z) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int b = m77919b(view);
        int d = m77932d(view);
        int c = m77927c(view);
        int e = m77935e(view);
        boolean z2 = (paddingLeft > b || width < c) ? false : f52239h;
        boolean z3 = (b >= width || c >= paddingLeft) ? f52239h : false;
        boolean z4 = (paddingTop > d || height < e) ? false : f52239h;
        boolean z5 = (d >= height || e >= paddingTop) ? f52239h : false;
        if (z) {
            if (!z2 || !z4) {
                return false;
            }
            return f52239h;
        } else if (!z3 || !z5) {
            return false;
        } else {
            return f52239h;
        }
    }

    /* renamed from: e */
    private View m77936e() {
        return getChildAt(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    public int getFlexItemCount() {
        return this.f52255o.getItemCount();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$b */
    public static class C21534b {

        /* renamed from: a */
        public int f52287a;

        /* renamed from: b */
        public boolean f52288b;

        /* renamed from: c */
        public int f52289c;

        /* renamed from: d */
        public int f52290d;

        /* renamed from: e */
        public int f52291e;

        /* renamed from: f */
        public int f52292f;

        /* renamed from: g */
        public int f52293g;

        /* renamed from: h */
        public int f52294h;

        /* renamed from: i */
        public int f52295i;

        /* renamed from: j */
        public boolean f52296j;

        private C21534b() {
            this.f52294h = 1;
            this.f52295i = 1;
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f52287a + ", mFlexLinePosition=" + this.f52289c + ", mPosition=" + this.f52290d + ", mOffset=" + this.f52291e + ", mScrollingOffset=" + this.f52292f + ", mLastScrollDelta=" + this.f52293g + ", mItemDirection=" + this.f52294h + ", mLayoutDirection=" + this.f52295i + '}';
        }

        /* renamed from: a */
        public boolean mo72884a(RecyclerView.State state, List<C21536b> list) {
            int i;
            int i2 = this.f52290d;
            if (i2 < 0 || i2 >= state.getItemCount() || (i = this.f52289c) < 0 || i >= list.size()) {
                return false;
            }
            return FlexboxLayoutManager.f52239h;
        }
    }

    /* renamed from: h */
    private void m77940h() {
        if (this.f52256p == null) {
            this.f52256p = new C21534b();
        }
    }

    /* renamed from: i */
    private void m77943i() {
        this.f52246d.clear();
        this.f52257q.mo72880a();
        this.f52257q.f52282d = 0;
    }

    /* renamed from: f */
    private void m77937f() {
        int i;
        boolean z;
        if (mo72814a()) {
            i = getHeightMode();
        } else {
            i = getWidthMode();
        }
        C21534b bVar = this.f52256p;
        if (i == 0 || i == Integer.MIN_VALUE) {
            z = f52239h;
        } else {
            z = false;
        }
        bVar.f52288b = z;
    }

    /* renamed from: b */
    public int mo72859b() {
        View a = m77907a(0, getChildCount(), false);
        if (a == null) {
            return -1;
        }
        return getPosition(a);
    }

    /* renamed from: c */
    public int mo72860c() {
        View a = m77907a(getChildCount() - 1, -1, false);
        if (a == null) {
            return -1;
        }
        return getPosition(a);
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    public int getSumOfCrossSize() {
        int size = this.f52246d.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f52246d.get(i2).f52303g;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        int i;
        if (this.f52244b == 0) {
            return mo72814a();
        }
        if (mo72814a()) {
            int width = getWidth();
            View view = this.f52266z;
            if (view != null) {
                i = view.getWidth();
            } else {
                i = 0;
            }
            if (width > i) {
                return f52239h;
            }
            return false;
        }
        return f52239h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        int i;
        if (this.f52244b == 0) {
            return mo72814a() ^ f52239h;
        }
        if (mo72814a()) {
            return f52239h;
        }
        int height = getHeight();
        View view = this.f52266z;
        if (view != null) {
            i = view.getHeight();
        } else {
            i = 0;
        }
        if (height > i) {
            return f52239h;
        }
        return false;
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    public int getLargestMainSize() {
        if (this.f52246d.size() == 0) {
            return 0;
        }
        int i = Integer.MIN_VALUE;
        int size = this.f52246d.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, this.f52246d.get(i2).f52301e);
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.f52258r;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() > 0) {
            View e = m77936e();
            savedState2.f52276a = getPosition(e);
            savedState2.f52277b = this.f52248f.mo7461a(e) - this.f52248f.mo7466c();
        } else {
            savedState2.mo72871a();
        }
        return savedState2;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$a */
    public class C21533a {

        /* renamed from: h */
        static final /* synthetic */ boolean f52278h = FlexboxLayoutManager.f52239h;

        /* renamed from: a */
        public int f52279a;

        /* renamed from: b */
        public int f52280b;

        /* renamed from: c */
        public int f52281c;

        /* renamed from: d */
        public int f52282d;

        /* renamed from: e */
        public boolean f52283e;

        /* renamed from: f */
        public boolean f52284f;

        /* renamed from: g */
        public boolean f52285g;

        /* renamed from: a */
        public void mo72880a() {
            this.f52279a = -1;
            this.f52280b = -1;
            this.f52281c = Integer.MIN_VALUE;
            boolean z = false;
            this.f52284f = false;
            this.f52285g = false;
            if (FlexboxLayoutManager.this.mo72814a()) {
                if (FlexboxLayoutManager.this.f52244b == 0) {
                    if (FlexboxLayoutManager.this.f52243a == 1) {
                        z = FlexboxLayoutManager.f52239h;
                    }
                    this.f52283e = z;
                    return;
                }
                if (FlexboxLayoutManager.this.f52244b == 2) {
                    z = FlexboxLayoutManager.f52239h;
                }
                this.f52283e = z;
            } else if (FlexboxLayoutManager.this.f52244b == 0) {
                if (FlexboxLayoutManager.this.f52243a == 3) {
                    z = FlexboxLayoutManager.f52239h;
                }
                this.f52283e = z;
            } else {
                if (FlexboxLayoutManager.this.f52244b == 2) {
                    z = FlexboxLayoutManager.f52239h;
                }
                this.f52283e = z;
            }
        }

        /* renamed from: b */
        public void mo72882b() {
            int i;
            int i2;
            if (FlexboxLayoutManager.this.mo72814a() || !FlexboxLayoutManager.this.f52245c) {
                if (this.f52283e) {
                    i = FlexboxLayoutManager.this.f52248f.mo7468d();
                } else {
                    i = FlexboxLayoutManager.this.f52248f.mo7466c();
                }
                this.f52281c = i;
                return;
            }
            if (this.f52283e) {
                i2 = FlexboxLayoutManager.this.f52248f.mo7468d();
            } else {
                i2 = FlexboxLayoutManager.this.getWidth() - FlexboxLayoutManager.this.f52248f.mo7466c();
            }
            this.f52281c = i2;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f52279a + ", mFlexLinePosition=" + this.f52280b + ", mCoordinate=" + this.f52281c + ", mPerpendicularCoordinate=" + this.f52282d + ", mLayoutFromEnd=" + this.f52283e + ", mValid=" + this.f52284f + ", mAssignedFromSavedState=" + this.f52285g + '}';
        }

        private C21533a() {
        }

        /* renamed from: a */
        public void mo72881a(View view) {
            AbstractC1401r rVar;
            if (FlexboxLayoutManager.this.f52244b == 0) {
                rVar = FlexboxLayoutManager.this.f52249g;
            } else {
                rVar = FlexboxLayoutManager.this.f52248f;
            }
            if (FlexboxLayoutManager.this.mo72814a() || !FlexboxLayoutManager.this.f52245c) {
                if (this.f52283e) {
                    this.f52281c = rVar.mo7465b(view) + rVar.mo7464b();
                } else {
                    this.f52281c = rVar.mo7461a(view);
                }
            } else if (this.f52283e) {
                this.f52281c = rVar.mo7461a(view) + rVar.mo7464b();
            } else {
                this.f52281c = rVar.mo7465b(view);
            }
            this.f52279a = FlexboxLayoutManager.this.getPosition(view);
            int i = 0;
            this.f52285g = false;
            if (f52278h || FlexboxLayoutManager.this.f52247e.f52314a != null) {
                int[] iArr = FlexboxLayoutManager.this.f52247e.f52314a;
                int i2 = this.f52279a;
                if (i2 == -1) {
                    i2 = 0;
                }
                int i3 = iArr[i2];
                if (i3 != -1) {
                    i = i3;
                }
                this.f52280b = i;
                if (FlexboxLayoutManager.this.f52246d.size() > this.f52280b) {
                    this.f52279a = FlexboxLayoutManager.this.f52246d.get(this.f52280b).f52311o;
                    return;
                }
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: d */
    private void m77933d() {
        boolean z;
        boolean z2;
        boolean z3;
        int layoutDirection = getLayoutDirection();
        int i = this.f52243a;
        boolean z4 = false;
        if (i == 0) {
            if (layoutDirection == 1) {
                z = f52239h;
            } else {
                z = false;
            }
            this.f52245c = z;
            if (this.f52244b == 2) {
                z4 = f52239h;
            }
            this.f52253m = z4;
        } else if (i == 1) {
            if (layoutDirection != 1) {
                z2 = f52239h;
            } else {
                z2 = false;
            }
            this.f52245c = z2;
            if (this.f52244b == 2) {
                z4 = f52239h;
            }
            this.f52253m = z4;
        } else if (i == 2) {
            if (layoutDirection == 1) {
                z3 = f52239h;
            } else {
                z3 = false;
            }
            this.f52245c = z3;
            if (this.f52244b == 2) {
                this.f52245c = z3 ^ f52239h;
            }
            this.f52253m = false;
        } else if (i != 3) {
            this.f52245c = false;
            this.f52253m = false;
        } else {
            if (layoutDirection == 1) {
                z4 = f52239h;
            }
            this.f52245c = z4;
            if (this.f52244b == 2) {
                this.f52245c = z4 ^ f52239h;
            }
            this.f52253m = f52239h;
        }
    }

    /* renamed from: g */
    private void m77938g() {
        if (this.f52248f == null) {
            if (mo72814a()) {
                if (this.f52244b == 0) {
                    this.f52248f = AbstractC1401r.m6390a(this);
                    this.f52249g = AbstractC1401r.m6392b(this);
                    return;
                }
                this.f52248f = AbstractC1401r.m6392b(this);
                this.f52249g = AbstractC1401r.m6390a(this);
            } else if (this.f52244b == 0) {
                this.f52248f = AbstractC1401r.m6392b(this);
                this.f52249g = AbstractC1401r.m6390a(this);
            } else {
                this.f52248f = AbstractC1401r.m6390a(this);
                this.f52249g = AbstractC1401r.m6392b(this);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    public void setFlexLines(List<C21536b> list) {
        this.f52246d = list;
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    /* renamed from: b */
    public View mo72817b(int i) {
        return mo72809a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return m77905a(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return m77920b(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return m77928c(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return m77905a(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return m77920b(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return m77928c(state);
    }

    /* renamed from: b */
    private int m77919b(View view) {
        return getDecoratedLeft(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
    }

    /* renamed from: c */
    private int m77927c(View view) {
        return getDecoratedRight(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
    }

    /* renamed from: d */
    private int m77932d(View view) {
        return getDecoratedTop(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
    }

    /* renamed from: e */
    private int m77935e(View view) {
        return getDecoratedBottom(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f52266z = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f52258r = (SavedState) parcelable;
            requestLayout();
        }
    }

    /* renamed from: e */
    public void mo72863e(int i) {
        if (this.f52250j != i) {
            this.f52250j = i;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f52258r = null;
        this.f52259s = -1;
        this.f52260t = Integer.MIN_VALUE;
        this.f52241A = -1;
        this.f52257q.mo72880a();
        this.f52264x.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        this.f52259s = i;
        this.f52260t = Integer.MIN_VALUE;
        SavedState savedState = this.f52258r;
        if (savedState != null) {
            savedState.mo72871a();
        }
        requestLayout();
    }

    /* renamed from: i */
    private View m77942i(int i) {
        int i2;
        if (f52239h || this.f52247e.f52314a != null) {
            View c = m77930c(0, getChildCount(), i);
            if (c == null || (i2 = this.f52247e.f52314a[getPosition(c)]) == -1) {
                return null;
            }
            return m77908a(c, this.f52246d.get(i2));
        }
        throw new AssertionError();
    }

    /* renamed from: j */
    private View m77944j(int i) {
        if (f52239h || this.f52247e.f52314a != null) {
            View c = m77930c(getChildCount() - 1, -1, i);
            if (c == null) {
                return null;
            }
            return m77922b(c, this.f52246d.get(this.f52247e.f52314a[getPosition(c)]));
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    public void mo72861c(int i) {
        if (this.f52243a != i) {
            removeAllViews();
            this.f52243a = i;
            this.f52248f = null;
            this.f52249g = null;
            m77943i();
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.AbstractC1331b
    public PointF computeScrollVectorForPosition(int i) {
        int i2;
        if (getChildCount() == 0) {
            return null;
        }
        if (i < getPosition(getChildAt(0))) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        if (mo72814a()) {
            return new PointF(BitmapDescriptorFactory.HUE_RED, (float) i2);
        }
        return new PointF((float) i2, BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: f */
    public void mo72864f(int i) {
        int i2 = this.f52251k;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                removeAllViews();
                m77943i();
            }
            this.f52251k = i;
            requestLayout();
        }
    }

    /* renamed from: c */
    private int m77928c(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View i = m77942i(itemCount);
        View j = m77944j(itemCount);
        if (state.getItemCount() == 0 || i == null || j == null) {
            return 0;
        }
        if (f52239h || this.f52247e.f52314a != null) {
            int b = mo72859b();
            return (int) ((((float) Math.abs(this.f52248f.mo7465b(j) - this.f52248f.mo7461a(i))) / ((float) ((mo72860c() - b) + 1))) * ((float) state.getItemCount()));
        }
        throw new AssertionError();
    }

    /* renamed from: k */
    private int m77945k(int i) {
        int i2;
        int i3;
        int i4;
        boolean z = false;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        m77938g();
        boolean a = mo72814a();
        View view = this.f52266z;
        if (a) {
            i2 = view.getWidth();
        } else {
            i2 = view.getHeight();
        }
        if (a) {
            i3 = getWidth();
        } else {
            i3 = getHeight();
        }
        if (getLayoutDirection() == 1) {
            z = f52239h;
        }
        if (z) {
            int abs = Math.abs(i);
            if (i < 0) {
                i4 = Math.min((i3 + this.f52257q.f52282d) - i2, abs);
            } else if (this.f52257q.f52282d + i <= 0) {
                return i;
            } else {
                i4 = this.f52257q.f52282d;
            }
        } else if (i > 0) {
            return Math.min((i3 - this.f52257q.f52282d) - i2, i);
        } else {
            if (this.f52257q.f52282d + i >= 0) {
                return i;
            }
            i4 = this.f52257q.f52282d;
        }
        return -i4;
    }

    /* renamed from: b */
    private int m77920b(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View i = m77942i(itemCount);
        View j = m77944j(itemCount);
        if (!(state.getItemCount() == 0 || i == null || j == null)) {
            if (f52239h || this.f52247e.f52314a != null) {
                int position = getPosition(i);
                int position2 = getPosition(j);
                int abs = Math.abs(this.f52248f.mo7465b(j) - this.f52248f.mo7461a(i));
                int i2 = this.f52247e.f52314a[position];
                if (!(i2 == 0 || i2 == -1)) {
                    return Math.round((((float) i2) * (((float) abs) / ((float) ((this.f52247e.f52314a[position2] - i2) + 1)))) + ((float) (this.f52248f.mo7466c() - this.f52248f.mo7461a(i))));
                }
            } else {
                throw new AssertionError();
            }
        }
        return 0;
    }

    /* renamed from: g */
    private void m77939g(int i) {
        if (i < mo72860c()) {
            int childCount = getChildCount();
            this.f52247e.mo72916c(childCount);
            this.f52247e.mo72911b(childCount);
            this.f52247e.mo72918d(childCount);
            if (!f52239h && this.f52247e.f52314a == null) {
                throw new AssertionError();
            } else if (i < this.f52247e.f52314a.length) {
                this.f52241A = i;
                View e = m77936e();
                if (e != null) {
                    this.f52259s = getPosition(e);
                    if (mo72814a() || !this.f52245c) {
                        this.f52260t = this.f52248f.mo7461a(e) - this.f52248f.mo7466c();
                    } else {
                        this.f52260t = this.f52248f.mo7465b(e) + this.f52248f.mo7474g();
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo72862d(int i) {
        if (i != 2) {
            int i2 = this.f52244b;
            if (i2 != i) {
                if (i2 == 0 || i == 0) {
                    removeAllViews();
                    m77943i();
                }
                this.f52244b = i;
                this.f52248f = null;
                this.f52249g = null;
                requestLayout();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    /* renamed from: a */
    private int m77905a(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        m77938g();
        View i = m77942i(itemCount);
        View j = m77944j(itemCount);
        if (state.getItemCount() == 0 || i == null || j == null) {
            return 0;
        }
        return Math.min(this.f52248f.mo7472f(), this.f52248f.mo7465b(j) - this.f52248f.mo7461a(i));
    }

    /* renamed from: h */
    private void m77941h(int i) {
        int i2;
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        boolean a = mo72814a();
        boolean z = f52239h;
        if (a) {
            int i4 = this.f52261u;
            if (i4 == Integer.MIN_VALUE || i4 == width) {
                z = false;
            }
            if (this.f52256p.f52288b) {
                i2 = this.f52265y.getResources().getDisplayMetrics().heightPixels;
            } else {
                i2 = this.f52256p.f52287a;
            }
        } else {
            int i5 = this.f52262v;
            if (i5 == Integer.MIN_VALUE || i5 == height) {
                z = false;
            }
            if (this.f52256p.f52288b) {
                i2 = this.f52265y.getResources().getDisplayMetrics().widthPixels;
            } else {
                i2 = this.f52256p.f52287a;
            }
        }
        this.f52261u = width;
        this.f52262v = height;
        int i6 = this.f52241A;
        if (i6 != -1 || (this.f52259s == -1 && !z)) {
            if (i6 != -1) {
                i3 = Math.min(i6, this.f52257q.f52279a);
            } else {
                i3 = this.f52257q.f52279a;
            }
            this.f52242B.mo72920a();
            if (mo72814a()) {
                if (this.f52246d.size() > 0) {
                    this.f52247e.mo72906a(this.f52246d, i3);
                    this.f52247e.mo72904a(this.f52242B, makeMeasureSpec, makeMeasureSpec2, i2, i3, this.f52257q.f52279a, this.f52246d);
                } else {
                    this.f52247e.mo72918d(i);
                    this.f52247e.mo72905a(this.f52242B, makeMeasureSpec, makeMeasureSpec2, i2, 0, this.f52246d);
                }
            } else if (this.f52246d.size() > 0) {
                this.f52247e.mo72906a(this.f52246d, i3);
                this.f52247e.mo72904a(this.f52242B, makeMeasureSpec2, makeMeasureSpec, i2, i3, this.f52257q.f52279a, this.f52246d);
            } else {
                this.f52247e.mo72918d(i);
                this.f52247e.mo72917c(this.f52242B, makeMeasureSpec, makeMeasureSpec2, i2, 0, this.f52246d);
            }
            this.f52246d = this.f52242B.f52319a;
            this.f52247e.mo72900a(makeMeasureSpec, makeMeasureSpec2, i3);
            this.f52247e.mo72898a(i3);
        } else if (!this.f52257q.f52283e) {
            this.f52246d.clear();
            if (f52239h || this.f52247e.f52314a != null) {
                this.f52242B.mo72920a();
                if (mo72814a()) {
                    this.f52247e.mo72914b(this.f52242B, makeMeasureSpec, makeMeasureSpec2, i2, this.f52257q.f52279a, this.f52246d);
                } else {
                    this.f52247e.mo72919d(this.f52242B, makeMeasureSpec, makeMeasureSpec2, i2, this.f52257q.f52279a, this.f52246d);
                }
                this.f52246d = this.f52242B.f52319a;
                this.f52247e.mo72899a(makeMeasureSpec, makeMeasureSpec2);
                this.f52247e.mo72897a();
                this.f52257q.f52280b = this.f52247e.f52314a[this.f52257q.f52279a];
                this.f52256p.f52289c = this.f52257q.f52280b;
                return;
            }
            throw new AssertionError();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    @Override // com.google.android.flexbox.AbstractC21535a
    /* renamed from: a */
    public void mo72811a(int i, View view) {
        this.f52264x.put(i, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public FlexboxLayoutManager(Context context, int i) {
        this(context, i, 1);
    }

    /* renamed from: a */
    private int m77906a(C21536b bVar, C21534b bVar2) {
        if (mo72814a()) {
            return m77921b(bVar, bVar2);
        }
        return m77929c(bVar, bVar2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.f52263w) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    /* renamed from: b */
    private boolean m77925b(View view, int i) {
        if (mo72814a() || !this.f52245c) {
            if (this.f52248f.mo7461a(view) >= this.f52248f.mo7470e() - i) {
                return f52239h;
            }
            return false;
        } else if (this.f52248f.mo7465b(view) <= i) {
            return f52239h;
        } else {
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i;
        int i2;
        this.f52254n = recycler;
        this.f52255o = state;
        int itemCount = state.getItemCount();
        if (itemCount != 0 || !state.isPreLayout()) {
            m77933d();
            m77938g();
            m77940h();
            this.f52247e.mo72916c(itemCount);
            this.f52247e.mo72911b(itemCount);
            this.f52247e.mo72918d(itemCount);
            this.f52256p.f52296j = false;
            SavedState savedState = this.f52258r;
            if (savedState != null && savedState.mo72872a(itemCount)) {
                this.f52259s = this.f52258r.f52276a;
            }
            if (!(this.f52257q.f52284f && this.f52259s == -1 && this.f52258r == null)) {
                this.f52257q.mo72880a();
                m77912a(state, this.f52257q);
                this.f52257q.f52284f = f52239h;
            }
            detachAndScrapAttachedViews(recycler);
            if (this.f52257q.f52283e) {
                m77924b(this.f52257q, false, f52239h);
            } else {
                m77913a(this.f52257q, false, f52239h);
            }
            m77941h(itemCount);
            if (this.f52257q.f52283e) {
                m77904a(recycler, state, this.f52256p);
                i2 = this.f52256p.f52291e;
                m77913a(this.f52257q, f52239h, false);
                m77904a(recycler, state, this.f52256p);
                i = this.f52256p.f52291e;
            } else {
                m77904a(recycler, state, this.f52256p);
                i = this.f52256p.f52291e;
                m77924b(this.f52257q, f52239h, false);
                m77904a(recycler, state, this.f52256p);
                i2 = this.f52256p.f52291e;
            }
            if (getChildCount() <= 0) {
                return;
            }
            if (this.f52257q.f52283e) {
                m77903a(i2 + m77918b(i, recycler, state, f52239h), recycler, state, false);
            } else {
                m77918b(i + m77903a(i2, recycler, state, f52239h), recycler, state, false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e3  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m77921b(com.google.android.flexbox.C21536b r23, com.google.android.flexbox.FlexboxLayoutManager.C21534b r24) {
        /*
        // Method dump skipped, instructions count: 451
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m77921b(com.google.android.flexbox.b, com.google.android.flexbox.FlexboxLayoutManager$b):int");
    }

    /* renamed from: c */
    private void m77931c(RecyclerView.Recycler recycler, C21534b bVar) {
        if (bVar.f52292f >= 0) {
            if (f52239h || this.f52247e.f52314a != null) {
                this.f52248f.mo7470e();
                int i = bVar.f52292f;
                int childCount = getChildCount();
                if (childCount != 0) {
                    int i2 = childCount - 1;
                    int i3 = this.f52247e.f52314a[getPosition(getChildAt(i2))];
                    if (i3 != -1) {
                        C21536b bVar2 = this.f52246d.get(i3);
                        int i4 = i2;
                        while (true) {
                            if (i4 < 0) {
                                break;
                            }
                            View childAt = getChildAt(i4);
                            if (!m77925b(childAt, bVar.f52292f)) {
                                break;
                            }
                            if (bVar2.f52311o == getPosition(childAt)) {
                                if (i3 <= 0) {
                                    childCount = i4;
                                    break;
                                }
                                i3 += bVar.f52295i;
                                bVar2 = this.f52246d.get(i3);
                                childCount = i4;
                            }
                            i4--;
                        }
                        m77910a(recycler, childCount, i2);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private View m77908a(View view, C21536b bVar) {
        boolean a = mo72814a();
        int i = bVar.f52304h;
        for (int i2 = 1; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                if (!this.f52245c || a) {
                    if (this.f52248f.mo7461a(view) <= this.f52248f.mo7461a(childAt)) {
                    }
                } else if (this.f52248f.mo7465b(view) >= this.f52248f.mo7465b(childAt)) {
                }
                view = childAt;
            }
        }
        return view;
    }

    /* renamed from: b */
    private View m77922b(View view, C21536b bVar) {
        boolean a = mo72814a();
        int childCount = (getChildCount() - bVar.f52304h) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                if (!this.f52245c || a) {
                    if (this.f52248f.mo7465b(view) >= this.f52248f.mo7465b(childAt)) {
                    }
                } else if (this.f52248f.mo7461a(view) <= this.f52248f.mo7461a(childAt)) {
                }
                view = childAt;
            }
        }
        return view;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e9  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m77929c(com.google.android.flexbox.C21536b r27, com.google.android.flexbox.FlexboxLayoutManager.C21534b r28) {
        /*
        // Method dump skipped, instructions count: 552
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m77929c(com.google.android.flexbox.b, com.google.android.flexbox.FlexboxLayoutManager$b):int");
    }

    /* renamed from: a */
    private void m77909a(int i, int i2) {
        boolean z;
        int i3;
        if (f52239h || this.f52247e.f52314a != null) {
            this.f52256p.f52295i = i;
            boolean a = mo72814a();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
            int i4 = 0;
            if (a || !this.f52245c) {
                z = false;
            } else {
                z = f52239h;
            }
            if (i == 1) {
                View childAt = getChildAt(getChildCount() - 1);
                this.f52256p.f52291e = this.f52248f.mo7465b(childAt);
                int position = getPosition(childAt);
                View b = m77922b(childAt, this.f52246d.get(this.f52247e.f52314a[position]));
                this.f52256p.f52294h = 1;
                C21534b bVar = this.f52256p;
                bVar.f52290d = position + bVar.f52294h;
                if (this.f52247e.f52314a.length <= this.f52256p.f52290d) {
                    this.f52256p.f52289c = -1;
                } else {
                    this.f52256p.f52289c = this.f52247e.f52314a[this.f52256p.f52290d];
                }
                if (z) {
                    this.f52256p.f52291e = this.f52248f.mo7461a(b);
                    this.f52256p.f52292f = (-this.f52248f.mo7461a(b)) + this.f52248f.mo7466c();
                    C21534b bVar2 = this.f52256p;
                    if (bVar2.f52292f >= 0) {
                        i4 = this.f52256p.f52292f;
                    }
                    bVar2.f52292f = i4;
                } else {
                    this.f52256p.f52291e = this.f52248f.mo7465b(b);
                    this.f52256p.f52292f = this.f52248f.mo7465b(b) - this.f52248f.mo7468d();
                }
                if ((this.f52256p.f52289c == -1 || this.f52256p.f52289c > this.f52246d.size() - 1) && this.f52256p.f52290d <= getFlexItemCount()) {
                    int i5 = i2 - this.f52256p.f52292f;
                    this.f52242B.mo72920a();
                    if (i5 > 0) {
                        if (a) {
                            this.f52247e.mo72905a(this.f52242B, makeMeasureSpec, makeMeasureSpec2, i5, this.f52256p.f52290d, this.f52246d);
                        } else {
                            this.f52247e.mo72917c(this.f52242B, makeMeasureSpec, makeMeasureSpec2, i5, this.f52256p.f52290d, this.f52246d);
                        }
                        this.f52247e.mo72900a(makeMeasureSpec, makeMeasureSpec2, this.f52256p.f52290d);
                        this.f52247e.mo72898a(this.f52256p.f52290d);
                    }
                }
            } else {
                View childAt2 = getChildAt(0);
                this.f52256p.f52291e = this.f52248f.mo7461a(childAt2);
                int position2 = getPosition(childAt2);
                View a2 = m77908a(childAt2, this.f52246d.get(this.f52247e.f52314a[position2]));
                this.f52256p.f52294h = 1;
                int i6 = this.f52247e.f52314a[position2];
                if (i6 == -1) {
                    i6 = 0;
                }
                if (i6 > 0) {
                    this.f52256p.f52290d = position2 - this.f52246d.get(i6 - 1).mo72894b();
                } else {
                    this.f52256p.f52290d = -1;
                }
                C21534b bVar3 = this.f52256p;
                if (i6 > 0) {
                    i3 = i6 - 1;
                } else {
                    i3 = 0;
                }
                bVar3.f52289c = i3;
                if (z) {
                    this.f52256p.f52291e = this.f52248f.mo7465b(a2);
                    this.f52256p.f52292f = this.f52248f.mo7465b(a2) - this.f52248f.mo7468d();
                    C21534b bVar4 = this.f52256p;
                    if (bVar4.f52292f >= 0) {
                        i4 = this.f52256p.f52292f;
                    }
                    bVar4.f52292f = i4;
                } else {
                    this.f52256p.f52291e = this.f52248f.mo7461a(a2);
                    this.f52256p.f52292f = (-this.f52248f.mo7461a(a2)) + this.f52248f.mo7466c();
                }
            }
            C21534b bVar5 = this.f52256p;
            bVar5.f52287a = i2 - bVar5.f52292f;
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    private void m77923b(RecyclerView.Recycler recycler, C21534b bVar) {
        if (bVar.f52292f >= 0) {
            if (f52239h || this.f52247e.f52314a != null) {
                int childCount = getChildCount();
                if (childCount != 0) {
                    int i = this.f52247e.f52314a[getPosition(getChildAt(0))];
                    int i2 = -1;
                    if (i != -1) {
                        C21536b bVar2 = this.f52246d.get(i);
                        int i3 = 0;
                        while (true) {
                            if (i3 >= childCount) {
                                break;
                            }
                            View childAt = getChildAt(i3);
                            if (!m77914a(childAt, bVar.f52292f)) {
                                break;
                            }
                            if (bVar2.f52312p == getPosition(childAt)) {
                                if (i >= this.f52246d.size() - 1) {
                                    i2 = i3;
                                    break;
                                }
                                i += bVar.f52295i;
                                bVar2 = this.f52246d.get(i);
                                i2 = i3;
                            }
                            i3++;
                        }
                        m77910a(recycler, 0, i2);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new AssertionError();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        m77939g(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        m77939g(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        super.onItemsUpdated(recyclerView, i, i2);
        m77939g(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    /* renamed from: a */
    private View m77907a(int i, int i2, boolean z) {
        int i3;
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View childAt = getChildAt(i);
            if (m77916a(childAt, z)) {
                return childAt;
            }
            i += i3;
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m77934d(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return f52239h;
            }
            if (mode == 1073741824 && size == i) {
                return f52239h;
            }
            return false;
        } else if (size >= i) {
            return f52239h;
        } else {
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!mo72814a() || (this.f52244b == 0 && mo72814a())) {
            int a = m77902a(i, recycler, state);
            this.f52264x.clear();
            return a;
        }
        int k = m77945k(i);
        this.f52257q.f52282d += k;
        this.f52249g.mo7463a(-k);
        return k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (mo72814a() || (this.f52244b == 0 && !mo72814a())) {
            int a = m77902a(i, recycler, state);
            this.f52264x.clear();
            return a;
        }
        int k = m77945k(i);
        this.f52257q.f52282d += k;
        this.f52249g.mo7463a(-k);
        return k;
    }

    public FlexboxLayoutManager(Context context, int i, int i2) {
        this.f52252l = -1;
        this.f52246d = new ArrayList();
        this.f52247e = new C21537c(this);
        this.f52257q = new C21533a();
        this.f52259s = -1;
        this.f52260t = Integer.MIN_VALUE;
        this.f52261u = Integer.MIN_VALUE;
        this.f52262v = Integer.MIN_VALUE;
        this.f52264x = new SparseArray<>();
        this.f52241A = -1;
        this.f52242B = new C21537c.C21539a();
        mo72861c(i);
        mo72862d(i2);
        mo72864f(4);
        setAutoMeasureEnabled(f52239h);
        this.f52265y = context;
    }

    /* renamed from: a */
    private int m77902a(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        m77938g();
        int i2 = 1;
        this.f52256p.f52296j = f52239h;
        if (mo72814a() || !this.f52245c) {
            z = false;
        } else {
            z = f52239h;
        }
        if (!z ? i <= 0 : i >= 0) {
            i2 = -1;
        }
        int abs = Math.abs(i);
        m77909a(i2, abs);
        int a = this.f52256p.f52292f + m77904a(recycler, state, this.f52256p);
        if (a < 0) {
            return 0;
        }
        if (z) {
            if (abs > a) {
                i = (-i2) * a;
            }
        } else if (abs > a) {
            i = i2 * a;
        }
        this.f52248f.mo7463a(-i);
        this.f52256p.f52293g = i;
        return i;
    }

    /* renamed from: a */
    private int m77904a(RecyclerView.Recycler recycler, RecyclerView.State state, C21534b bVar) {
        if (bVar.f52292f != Integer.MIN_VALUE) {
            if (bVar.f52287a < 0) {
                bVar.f52292f += bVar.f52287a;
            }
            m77911a(recycler, bVar);
        }
        int i = bVar.f52287a;
        int i2 = bVar.f52287a;
        int i3 = 0;
        boolean a = mo72814a();
        while (true) {
            if ((i2 > 0 || this.f52256p.f52288b) && bVar.mo72884a(state, this.f52246d)) {
                C21536b bVar2 = this.f52246d.get(bVar.f52289c);
                bVar.f52290d = bVar2.f52311o;
                i3 += m77906a(bVar2, bVar);
                if (a || !this.f52245c) {
                    bVar.f52291e += bVar2.mo72892a() * bVar.f52295i;
                } else {
                    bVar.f52291e -= bVar2.mo72892a() * bVar.f52295i;
                }
                i2 -= bVar2.mo72892a();
            }
        }
        bVar.f52287a -= i3;
        if (bVar.f52292f != Integer.MIN_VALUE) {
            bVar.f52292f += i3;
            if (bVar.f52287a < 0) {
                bVar.f52292f += bVar.f52287a;
            }
            m77911a(recycler, bVar);
        }
        return i - bVar.f52287a;
    }

    /* renamed from: c */
    private View m77930c(int i, int i2, int i3) {
        int i4;
        m77938g();
        m77940h();
        int c = this.f52248f.mo7466c();
        int d = this.f52248f.mo7468d();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.f52248f.mo7461a(childAt) >= c && this.f52248f.mo7465b(childAt) <= d) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* renamed from: a */
    private void m77910a(RecyclerView.Recycler recycler, int i, int i2) {
        while (i2 >= i) {
            removeAndRecycleViewAt(i2, recycler);
            i2--;
        }
    }

    /* renamed from: b */
    private void m77924b(C21533a aVar, boolean z, boolean z2) {
        if (z2) {
            m77937f();
        } else {
            this.f52256p.f52288b = false;
        }
        if (mo72814a() || !this.f52245c) {
            this.f52256p.f52287a = aVar.f52281c - this.f52248f.mo7466c();
        } else {
            this.f52256p.f52287a = (this.f52266z.getWidth() - aVar.f52281c) - this.f52248f.mo7466c();
        }
        this.f52256p.f52290d = aVar.f52279a;
        this.f52256p.f52294h = 1;
        this.f52256p.f52295i = -1;
        this.f52256p.f52291e = aVar.f52281c;
        this.f52256p.f52292f = Integer.MIN_VALUE;
        this.f52256p.f52289c = aVar.f52280b;
        if (z && aVar.f52280b > 0 && this.f52246d.size() > aVar.f52280b) {
            this.f52256p.f52289c--;
            this.f52256p.f52290d -= this.f52246d.get(aVar.f52280b).mo72894b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        super.onItemsMoved(recyclerView, i, i2, i3);
        m77939g(Math.min(i, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
        m77939g(i);
    }

    /* renamed from: a */
    private int m77903a(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int i2;
        int c;
        if (mo72814a() || !this.f52245c) {
            int c2 = i - this.f52248f.mo7466c();
            if (c2 <= 0) {
                return 0;
            }
            i2 = -m77902a(c2, recycler, state);
        } else {
            int d = this.f52248f.mo7468d() - i;
            if (d <= 0) {
                return 0;
            }
            i2 = m77902a(-d, recycler, state);
        }
        int i3 = i + i2;
        if (!z || (c = i3 - this.f52248f.mo7466c()) <= 0) {
            return i2;
        }
        this.f52248f.mo7463a(-c);
        return i2 - c;
    }

    /* renamed from: b */
    private int m77918b(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        boolean z2;
        int i2;
        int d;
        if (mo72814a() || !this.f52245c) {
            z2 = false;
        } else {
            z2 = f52239h;
        }
        if (z2) {
            int c = i - this.f52248f.mo7466c();
            if (c <= 0) {
                return 0;
            }
            i2 = m77902a(c, recycler, state);
        } else {
            int d2 = this.f52248f.mo7468d() - i;
            if (d2 <= 0) {
                return 0;
            }
            i2 = -m77902a(-d2, recycler, state);
        }
        int i3 = i + i2;
        if (!z || (d = this.f52248f.mo7468d() - i3) <= 0) {
            return i2;
        }
        this.f52248f.mo7463a(d);
        return d + i2;
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f52252l = -1;
        this.f52246d = new ArrayList();
        this.f52247e = new C21537c(this);
        this.f52257q = new C21533a();
        this.f52259s = -1;
        this.f52260t = Integer.MIN_VALUE;
        this.f52261u = Integer.MIN_VALUE;
        this.f52262v = Integer.MIN_VALUE;
        this.f52264x = new SparseArray<>();
        this.f52241A = -1;
        this.f52242B = new C21537c.C21539a();
        RecyclerView.LayoutManager.C1327b properties = getProperties(context, attributeSet, i, i2);
        int i3 = properties.f4689a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (properties.f4691c) {
                    mo72861c(3);
                } else {
                    mo72861c(2);
                }
            }
        } else if (properties.f4691c) {
            mo72861c(1);
        } else {
            mo72861c(0);
        }
        mo72862d(1);
        mo72864f(4);
        setAutoMeasureEnabled(f52239h);
        this.f52265y = context;
    }
}
