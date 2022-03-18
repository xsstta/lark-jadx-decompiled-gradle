package com.ss.android.appcenter.engine.vlayout;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.appcenter.engine.vlayout.p1301a.C28273h;
import com.ss.android.lark.log.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* access modifiers changed from: package-private */
public class ExposeLinearLayoutManagerEx extends LinearLayoutManager {
    private static Field vhField;
    private static Method vhSetFlags;
    private Object[] emptyArgs;
    private C28273h layoutChunkResultCache;
    private final C28250a mAnchorInfo;
    private final C28251b mChildHelperWrapper;
    protected Bundle mCurrentPendingSavedState;
    private int mCurrentPendingScrollPosition;
    private final Method mEnsureLayoutStateMethod;
    private boolean mLastStackFromEnd;
    protected C28252c mLayoutState;
    public AbstractC28285g mOrientationHelper;
    private int mPendingScrollPositionOffset;
    public RecyclerView mRecyclerView;
    private boolean mShouldReverseLayoutExpose;
    protected int recycleOffset;

    /* access modifiers changed from: protected */
    public int computeAlignOffset(int i, boolean z, boolean z2) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int computeAlignOffset(View view, boolean z, boolean z2) {
        return 0;
    }

    public boolean isEnableMarginOverLap() {
        return false;
    }

    public void onAnchorReady(RecyclerView.State state, C28250a aVar) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int findFirstVisibleItemPosition() {
        ensureLayoutStateExpose();
        return super.findFirstVisibleItemPosition();
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx$a */
    public class C28250a {

        /* renamed from: a */
        public int f70888a;

        /* renamed from: b */
        public int f70889b;

        /* renamed from: c */
        public boolean f70890c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo100663a() {
            this.f70888a = -1;
            this.f70889b = Integer.MIN_VALUE;
            this.f70890c = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo100666b() {
            int i;
            if (this.f70890c) {
                i = ExposeLinearLayoutManagerEx.this.mOrientationHelper.mo100804d();
            } else {
                i = ExposeLinearLayoutManagerEx.this.mOrientationHelper.mo100802c();
            }
            this.f70889b = i;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f70888a + ", mCoordinate=" + this.f70889b + ", mLayoutFromEnd=" + this.f70890c + '}';
        }

        protected C28250a() {
        }

        /* renamed from: a */
        public void mo100664a(View view) {
            if (this.f70890c) {
                this.f70889b = ExposeLinearLayoutManagerEx.this.mOrientationHelper.mo100801b(view) + ExposeLinearLayoutManagerEx.this.computeAlignOffset(view, this.f70890c, true) + ExposeLinearLayoutManagerEx.this.mOrientationHelper.mo100800b();
            } else {
                this.f70889b = ExposeLinearLayoutManagerEx.this.mOrientationHelper.mo100797a(view) + ExposeLinearLayoutManagerEx.this.computeAlignOffset(view, this.f70890c, true);
            }
            this.f70888a = ExposeLinearLayoutManagerEx.this.getPosition(view);
        }

        /* renamed from: a */
        public boolean mo100665a(View view, RecyclerView.State state) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (layoutParams.isItemRemoved() || layoutParams.getViewPosition() < 0 || layoutParams.getViewPosition() >= state.getItemCount()) {
                return false;
            }
            mo100664a(view);
            return true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public boolean supportsPredictiveItemAnimations() {
        if (this.mCurrentPendingSavedState == null && this.mLastStackFromEnd == getStackFromEnd()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx$d */
    static class C28253d {

        /* renamed from: b */
        private static Method f70917b;

        /* renamed from: c */
        private static Method f70918c;

        /* renamed from: d */
        private static Method f70919d;

        /* renamed from: e */
        private static Method f70920e;

        /* renamed from: f */
        private static Method f70921f;

        /* renamed from: a */
        private RecyclerView.ViewHolder f70922a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo100675a() {
            Method method = f70918c;
            if (method == null) {
                return true;
            }
            try {
                return ((Boolean) method.invoke(this.f70922a, new Object[0])).booleanValue();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return true;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo100676b() {
            Method method = f70919d;
            if (method == null) {
                return true;
            }
            try {
                return ((Boolean) method.invoke(this.f70922a, new Object[0])).booleanValue();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return true;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo100677c() {
            Method method = f70920e;
            if (method == null) {
                return true;
            }
            try {
                return ((Boolean) method.invoke(this.f70922a, new Object[0])).booleanValue();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return true;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return true;
            }
        }

        /* renamed from: d */
        public boolean mo100678d() {
            if (mo100675a() || mo100676b() || mo100677c()) {
                return true;
            }
            return false;
        }

        static {
            try {
                Method declaredMethod = RecyclerView.ViewHolder.class.getDeclaredMethod("shouldIgnore", new Class[0]);
                f70917b = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = RecyclerView.ViewHolder.class.getDeclaredMethod("isInvalid", new Class[0]);
                f70918c = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = RecyclerView.ViewHolder.class.getDeclaredMethod("isRemoved", new Class[0]);
                f70919d = declaredMethod3;
                declaredMethod3.setAccessible(true);
                Method declaredMethod4 = RecyclerView.ViewHolder.class.getDeclaredMethod("setFlags", Integer.TYPE, Integer.TYPE);
                f70921f = declaredMethod4;
                declaredMethod4.setAccessible(true);
                try {
                    f70920e = RecyclerView.ViewHolder.class.getDeclaredMethod("isChanged", new Class[0]);
                } catch (NoSuchMethodException unused) {
                    f70920e = RecyclerView.ViewHolder.class.getDeclaredMethod("isUpdated", new Class[0]);
                }
                f70920e.setAccessible(true);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        public C28253d(RecyclerView.ViewHolder viewHolder) {
            this.f70922a = viewHolder;
        }

        /* renamed from: a */
        public static void m103554a(RecyclerView.ViewHolder viewHolder, int i, int i2) {
            try {
                f70921f.invoke(viewHolder, Integer.valueOf(i), Integer.valueOf(i2));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    private View getChildClosestToEndExpose() {
        int i;
        if (this.mShouldReverseLayoutExpose) {
            i = 0;
        } else {
            i = getChildCount() - 1;
        }
        return getChildAt(i);
    }

    private View getChildClosestToStartExpose() {
        int i;
        if (this.mShouldReverseLayoutExpose) {
            i = getChildCount() - 1;
        } else {
            i = 0;
        }
        return getChildAt(i);
    }

    private void myResolveShouldLayoutReverse() {
        if (getOrientation() == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayoutExpose = getReverseLayout();
        } else {
            this.mShouldReverseLayoutExpose = !getReverseLayout();
        }
    }

    /* renamed from: com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx$c */
    public static class C28252c {

        /* renamed from: a */
        public boolean f70905a;

        /* renamed from: b */
        public boolean f70906b = true;

        /* renamed from: c */
        public int f70907c;

        /* renamed from: d */
        public int f70908d;

        /* renamed from: e */
        public int f70909e;

        /* renamed from: f */
        public int f70910f;

        /* renamed from: g */
        public int f70911g;

        /* renamed from: h */
        public int f70912h;

        /* renamed from: i */
        public int f70913i;

        /* renamed from: j */
        public boolean f70914j;

        /* renamed from: k */
        public List<RecyclerView.ViewHolder> f70915k;

        /* renamed from: l */
        private Method f70916l;

        public C28252c() {
            try {
                Method declaredMethod = RecyclerView.ViewHolder.class.getDeclaredMethod("isRemoved", new Class[0]);
                this.f70916l = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }

        /* renamed from: a */
        private View m103551a() {
            boolean z;
            int size = this.f70915k.size();
            int i = Integer.MAX_VALUE;
            RecyclerView.ViewHolder viewHolder = null;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView.ViewHolder viewHolder2 = this.f70915k.get(i2);
                if (!this.f70914j) {
                    try {
                        z = ((Boolean) this.f70916l.invoke(viewHolder2, new Object[0])).booleanValue();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                    if (!this.f70914j && z) {
                    }
                }
                int position = (viewHolder2.getPosition() - this.f70909e) * this.f70910f;
                if (position >= 0 && position < i) {
                    viewHolder = viewHolder2;
                    if (position == 0) {
                        break;
                    }
                    i = position;
                }
            }
            if (viewHolder == null) {
                return null;
            }
            this.f70909e = viewHolder.getPosition() + this.f70910f;
            return viewHolder.itemView;
            z = false;
        }

        /* renamed from: a */
        public boolean mo100674a(RecyclerView.State state) {
            int i = this.f70909e;
            if (i < 0 || i >= state.getItemCount()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public View mo100673a(RecyclerView.Recycler recycler) {
            if (this.f70915k != null) {
                return m103551a();
            }
            View viewForPosition = recycler.getViewForPosition(this.f70909e);
            this.f70909e += this.f70910f;
            return viewForPosition;
        }
    }

    /* access modifiers changed from: protected */
    public void ensureLayoutStateExpose() {
        if (this.mLayoutState == null) {
            this.mLayoutState = new C28252c();
        }
        if (this.mOrientationHelper == null) {
            this.mOrientationHelper = AbstractC28285g.m103736a(this, getOrientation());
        }
        try {
            this.mEnsureLayoutStateMethod.invoke(this, this.emptyArgs);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
        }
    }

    private void logChildren() {
        Log.m165379d("ExposeLLManagerEx", "internal representation of views on the screen");
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            Log.m165379d("ExposeLLManagerEx", "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.mo100797a(childAt));
        }
        Log.m165379d("ExposeLLManagerEx", "==============");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.mCurrentPendingSavedState != null) {
            return new Bundle(this.mCurrentPendingSavedState);
        }
        Bundle bundle = new Bundle();
        if (getChildCount() > 0) {
            boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayoutExpose;
            bundle.putBoolean("AnchorLayoutFromEnd", z);
            if (z) {
                View childClosestToEndExpose = getChildClosestToEndExpose();
                bundle.putInt("AnchorOffset", this.mOrientationHelper.mo100804d() - this.mOrientationHelper.mo100801b(childClosestToEndExpose));
                bundle.putInt("AnchorPosition", getPosition(childClosestToEndExpose));
            } else {
                View childClosestToStartExpose = getChildClosestToStartExpose();
                bundle.putInt("AnchorPosition", getPosition(childClosestToStartExpose));
                bundle.putInt("AnchorOffset", this.mOrientationHelper.mo100797a(childClosestToStartExpose) - this.mOrientationHelper.mo100802c());
            }
        } else {
            bundle.putInt("AnchorPosition", -1);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx$b */
    public class C28251b {

        /* renamed from: b */
        private Object f70893b;

        /* renamed from: c */
        private Method f70894c;

        /* renamed from: d */
        private Method f70895d;

        /* renamed from: e */
        private Method f70896e;

        /* renamed from: f */
        private Method f70897f;

        /* renamed from: g */
        private Field f70898g;

        /* renamed from: h */
        private Object f70899h;

        /* renamed from: i */
        private Method f70900i;

        /* renamed from: j */
        private Field f70901j;

        /* renamed from: k */
        private List f70902k;

        /* renamed from: l */
        private RecyclerView.LayoutManager f70903l;

        /* renamed from: m */
        private Object[] f70904m = new Object[1];

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo100669a() {
            try {
                if (this.f70893b == null) {
                    Object obj = this.f70901j.get(this.f70903l);
                    this.f70893b = obj;
                    if (obj != null) {
                        Class<?> cls = obj.getClass();
                        Method declaredMethod = cls.getDeclaredMethod("hide", View.class);
                        this.f70894c = declaredMethod;
                        declaredMethod.setAccessible(true);
                        try {
                            Method declaredMethod2 = cls.getDeclaredMethod("findHiddenNonRemovedView", Integer.TYPE, Integer.TYPE);
                            this.f70895d = declaredMethod2;
                            declaredMethod2.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                            Method declaredMethod3 = cls.getDeclaredMethod("findHiddenNonRemovedView", Integer.TYPE);
                            this.f70896e = declaredMethod3;
                            declaredMethod3.setAccessible(true);
                        }
                        Method declaredMethod4 = cls.getDeclaredMethod("isHidden", View.class);
                        this.f70897f = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                        Field declaredField = cls.getDeclaredField("mBucket");
                        declaredField.setAccessible(true);
                        Object obj2 = declaredField.get(this.f70893b);
                        this.f70899h = obj2;
                        Method declaredMethod5 = obj2.getClass().getDeclaredMethod("clear", Integer.TYPE);
                        this.f70900i = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                        Field declaredField2 = cls.getDeclaredField("mHiddenViews");
                        this.f70898g = declaredField2;
                        declaredField2.setAccessible(true);
                        this.f70902k = (List) this.f70898g.get(this.f70893b);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo100670a(View view) {
            try {
                mo100669a();
                if (this.f70902k.indexOf(view) < 0) {
                    Object[] objArr = this.f70904m;
                    objArr[0] = view;
                    this.f70894c.invoke(this.f70893b, objArr);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo100671b(View view) {
            try {
                mo100669a();
                this.f70904m[0] = Integer.valueOf(ExposeLinearLayoutManagerEx.this.mRecyclerView.indexOfChild(view));
                this.f70900i.invoke(this.f70899h, this.f70904m);
                List list = this.f70902k;
                if (list != null) {
                    list.remove(view);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo100672c(View view) {
            try {
                mo100669a();
                Object[] objArr = this.f70904m;
                objArr[0] = view;
                return ((Boolean) this.f70897f.invoke(this.f70893b, objArr)).booleanValue();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return false;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return false;
            } catch (Exception e3) {
                e3.printStackTrace();
                return false;
            }
        }

        C28251b(RecyclerView.LayoutManager layoutManager) {
            this.f70903l = layoutManager;
            try {
                Field declaredField = RecyclerView.LayoutManager.class.getDeclaredField("mChildHelper");
                this.f70901j = declaredField;
                declaredField.setAccessible(true);
                mo100669a();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo100668a(int i, int i2) {
            try {
                mo100669a();
                Method method = this.f70895d;
                if (method != null) {
                    return (View) method.invoke(this.f70893b, Integer.valueOf(i), -1);
                }
                Method method2 = this.f70896e;
                if (method2 == null) {
                    return null;
                }
                return (View) method2.invoke(this.f70893b, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return null;
            } catch (Exception e3) {
                e3.printStackTrace();
                return null;
            }
        }
    }

    private void validateChildOrderExpose() {
        Log.m165379d("ExposeLLManagerEx", "validating child count " + getChildCount());
        boolean z = true;
        if (getChildCount() >= 1) {
            int position = getPosition(getChildAt(0));
            int a = this.mOrientationHelper.mo100797a(getChildAt(0));
            if (this.mShouldReverseLayoutExpose) {
                for (int i = 1; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    int position2 = getPosition(childAt);
                    int a2 = this.mOrientationHelper.mo100797a(childAt);
                    if (position2 < position) {
                        logChildren();
                        StringBuilder sb = new StringBuilder();
                        sb.append("detected invalid position. loc invalid? ");
                        if (a2 >= a) {
                            z = false;
                        }
                        sb.append(z);
                        throw new RuntimeException(sb.toString());
                    } else if (a2 > a) {
                        logChildren();
                        throw new RuntimeException("detected invalid location");
                    }
                }
                return;
            }
            for (int i2 = 1; i2 < getChildCount(); i2++) {
                View childAt2 = getChildAt(i2);
                int position3 = getPosition(childAt2);
                int a3 = this.mOrientationHelper.mo100797a(childAt2);
                if (position3 < position) {
                    logChildren();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("detected invalid position. loc invalid? ");
                    if (a3 >= a) {
                        z = false;
                    }
                    sb2.append(z);
                    throw new RuntimeException(sb2.toString());
                } else if (a3 < a) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int findLastVisibleItemPosition() {
        ensureLayoutStateExpose();
        try {
            return super.findLastVisibleItemPosition();
        } catch (Exception e) {
            Log.m165379d("LastItem", "itemCount: " + getItemCount());
            Log.m165379d("LastItem", "childCount: " + getChildCount());
            Log.m165379d("LastItem", "child: " + getChildAt(getChildCount() + -1));
            Log.m165379d("LastItem", "RV childCount: " + this.mRecyclerView.getChildCount());
            Log.m165379d("LastItem", "RV child: " + this.mRecyclerView.getChildAt(this.mRecyclerView.getChildCount() + -1));
            throw e;
        }
    }

    public void setRecycleOffset(int i) {
        this.recycleOffset = i;
    }

    public ExposeLinearLayoutManagerEx(Context context) {
        this(context, 1, false);
    }

    private void updateLayoutStateToFillEndExpose(C28250a aVar) {
        updateLayoutStateToFillEndExpose(aVar.f70888a, aVar.f70889b);
    }

    private void updateLayoutStateToFillStartExpose(C28250a aVar) {
        updateLayoutStateToFillStartExpose(aVar.f70888a, aVar.f70889b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mCurrentPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* access modifiers changed from: protected */
    public View findHiddenView(int i) {
        return this.mChildHelperWrapper.mo100668a(i, -1);
    }

    /* access modifiers changed from: protected */
    public void hideView(View view) {
        this.mChildHelperWrapper.mo100670a(view);
    }

    /* access modifiers changed from: protected */
    public boolean isHidden(View view) {
        return this.mChildHelperWrapper.mo100672c(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.mRecyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setOrientation(int i) {
        super.setOrientation(i);
        this.mOrientationHelper = null;
    }

    /* access modifiers changed from: protected */
    public void showView(View view) {
        this.mChildHelperWrapper.mo100671b(view);
    }

    protected static boolean isViewHolderUpdated(RecyclerView.ViewHolder viewHolder) {
        return new C28253d(viewHolder).mo100678d();
    }

    private View myFindFirstReferenceChild(int i) {
        return findReferenceChildInternal(0, getChildCount(), i);
    }

    private View myFindLastReferenceChild(int i) {
        return findReferenceChildInternal(getChildCount() - 1, -1, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            this.mCurrentPendingSavedState = (Bundle) parcelable;
            requestLayout();
        }
    }

    private View myFindReferenceChildClosestToEnd(RecyclerView.State state) {
        boolean z = this.mShouldReverseLayoutExpose;
        int itemCount = state.getItemCount();
        if (z) {
            return myFindFirstReferenceChild(itemCount);
        }
        return myFindLastReferenceChild(itemCount);
    }

    private View myFindReferenceChildClosestToStart(RecyclerView.State state) {
        boolean z = this.mShouldReverseLayoutExpose;
        int itemCount = state.getItemCount();
        if (z) {
            return myFindLastReferenceChild(itemCount);
        }
        return myFindFirstReferenceChild(itemCount);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void scrollToPosition(int i) {
        this.mCurrentPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        Bundle bundle = this.mCurrentPendingSavedState;
        if (bundle != null) {
            bundle.putInt("AnchorPosition", -1);
        }
        requestLayout();
    }

    private int convertFocusDirectionToLayoutDirectionExpose(int i) {
        int orientation = getOrientation();
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130 && orientation == 1) {
                        return 1;
                    }
                    return Integer.MIN_VALUE;
                } else if (orientation == 0) {
                    return 1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (orientation == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (orientation == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.AbstractC1331b, androidx.recyclerview.widget.LinearLayoutManager
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < getPosition(getChildAt(0))) {
            z = true;
        }
        if (z != this.mShouldReverseLayoutExpose) {
            i2 = -1;
        }
        if (getOrientation() == 0) {
            return new PointF((float) i2, BitmapDescriptorFactory.HUE_RED);
        }
        return new PointF(BitmapDescriptorFactory.HUE_RED, (float) i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        this.mRecyclerView = null;
    }

    /* access modifiers changed from: protected */
    public void addHiddenView(View view, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = -1;
        }
        addView(view, i);
        this.mChildHelperWrapper.mo100670a(view);
    }

    private void recycleByLayoutStateExpose(RecyclerView.Recycler recycler, C28252c cVar) {
        if (cVar.f70906b) {
            if (cVar.f70911g == -1) {
                recycleViewsFromEndExpose(recycler, cVar.f70912h);
            } else {
                recycleViewsFromStartExpose(recycler, cVar.f70912h);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void scrollToPositionWithOffset(int i, int i2) {
        this.mCurrentPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        Bundle bundle = this.mCurrentPendingSavedState;
        if (bundle != null) {
            bundle.putInt("AnchorPosition", -1);
        }
        requestLayout();
    }

    private void updateAnchorInfoForLayoutExpose(RecyclerView.State state, C28250a aVar) {
        int i;
        if (!updateAnchorFromPendingDataExpose(state, aVar) && !updateAnchorFromChildrenExpose(state, aVar)) {
            aVar.mo100666b();
            if (getStackFromEnd()) {
                i = state.getItemCount() - 1;
            } else {
                i = 0;
            }
            aVar.f70888a = i;
        }
    }

    private void updateLayoutStateToFillEndExpose(int i, int i2) {
        int i3;
        this.mLayoutState.f70908d = this.mOrientationHelper.mo100804d() - i2;
        C28252c cVar = this.mLayoutState;
        if (this.mShouldReverseLayoutExpose) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        cVar.f70910f = i3;
        this.mLayoutState.f70909e = i;
        this.mLayoutState.f70911g = 1;
        this.mLayoutState.f70907c = i2;
        this.mLayoutState.f70912h = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStartExpose(int i, int i2) {
        int i3;
        this.mLayoutState.f70908d = i2 - this.mOrientationHelper.mo100802c();
        this.mLayoutState.f70909e = i;
        C28252c cVar = this.mLayoutState;
        if (this.mShouldReverseLayoutExpose) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        cVar.f70910f = i3;
        this.mLayoutState.f70911g = -1;
        this.mLayoutState.f70907c = i2;
        this.mLayoutState.f70912h = Integer.MIN_VALUE;
    }

    protected static void attachViewHolder(RecyclerView.LayoutParams layoutParams, RecyclerView.ViewHolder viewHolder) {
        try {
            if (vhField == null) {
                vhField = RecyclerView.LayoutParams.class.getDeclaredField("mViewHolder");
            }
            vhField.setAccessible(true);
            vhField.set(layoutParams, viewHolder);
            if (vhSetFlags == null) {
                Method declaredMethod = RecyclerView.ViewHolder.class.getDeclaredMethod("setFlags", Integer.TYPE, Integer.TYPE);
                vhSetFlags = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            vhSetFlags.invoke(viewHolder, 4, 4);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
    }

    private void recycleViewsFromEndExpose(RecyclerView.Recycler recycler, int i) {
        int childCount = getChildCount();
        if (i >= 0) {
            int e = this.mOrientationHelper.mo100806e() - i;
            if (this.mShouldReverseLayoutExpose) {
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (this.mOrientationHelper.mo100797a(getChildAt(i2)) - this.recycleOffset < e) {
                        recycleChildren(recycler, 0, i2);
                        return;
                    }
                }
                return;
            }
            int i3 = childCount - 1;
            for (int i4 = i3; i4 >= 0; i4--) {
                if (this.mOrientationHelper.mo100797a(getChildAt(i4)) - this.recycleOffset < e) {
                    recycleChildren(recycler, i3, i4);
                    return;
                }
            }
        }
    }

    private void recycleViewsFromStartExpose(RecyclerView.Recycler recycler, int i) {
        if (i >= 0) {
            int childCount = getChildCount();
            if (this.mShouldReverseLayoutExpose) {
                int i2 = childCount - 1;
                for (int i3 = i2; i3 >= 0; i3--) {
                    if (this.mOrientationHelper.mo100801b(getChildAt(i3)) + this.recycleOffset > i) {
                        recycleChildren(recycler, i2, i3);
                        return;
                    }
                }
                return;
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                if (this.mOrientationHelper.mo100801b(getChildAt(i4)) + this.recycleOffset > i) {
                    recycleChildren(recycler, 0, i4);
                    return;
                }
            }
        }
    }

    private boolean updateAnchorFromChildrenExpose(RecyclerView.State state, C28250a aVar) {
        View view;
        int i;
        boolean z = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && aVar.mo100665a(focusedChild, state)) {
            return true;
        }
        if (this.mLastStackFromEnd != getStackFromEnd()) {
            return false;
        }
        if (aVar.f70890c) {
            view = myFindReferenceChildClosestToEnd(state);
        } else {
            view = myFindReferenceChildClosestToStart(state);
        }
        if (view == null) {
            return false;
        }
        aVar.mo100664a(view);
        if (!state.isPreLayout() && supportsPredictiveItemAnimations()) {
            if (this.mOrientationHelper.mo100797a(view) >= this.mOrientationHelper.mo100804d() || this.mOrientationHelper.mo100801b(view) < this.mOrientationHelper.mo100802c()) {
                z = true;
            }
            if (z) {
                if (aVar.f70890c) {
                    i = this.mOrientationHelper.mo100804d();
                } else {
                    i = this.mOrientationHelper.mo100802c();
                }
                aVar.f70889b = i;
            }
        }
        return true;
    }

    private boolean updateAnchorFromPendingDataExpose(RecyclerView.State state, C28250a aVar) {
        int i;
        boolean z;
        int i2;
        boolean z2 = false;
        if (!state.isPreLayout() && (i = this.mCurrentPendingScrollPosition) != -1) {
            if (i < 0 || i >= state.getItemCount()) {
                this.mCurrentPendingScrollPosition = -1;
                this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            } else {
                aVar.f70888a = this.mCurrentPendingScrollPosition;
                Bundle bundle = this.mCurrentPendingSavedState;
                if (bundle != null && bundle.getInt("AnchorPosition") >= 0) {
                    aVar.f70890c = this.mCurrentPendingSavedState.getBoolean("AnchorLayoutFromEnd");
                    if (aVar.f70890c) {
                        aVar.f70889b = this.mOrientationHelper.mo100804d() - this.mCurrentPendingSavedState.getInt("AnchorOffset");
                    } else {
                        aVar.f70889b = this.mOrientationHelper.mo100802c() + this.mCurrentPendingSavedState.getInt("AnchorOffset");
                    }
                    return true;
                } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View findViewByPosition = findViewByPosition(this.mCurrentPendingScrollPosition);
                    if (findViewByPosition == null) {
                        if (getChildCount() > 0) {
                            if (this.mCurrentPendingScrollPosition < getPosition(getChildAt(0))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z == this.mShouldReverseLayoutExpose) {
                                z2 = true;
                            }
                            aVar.f70890c = z2;
                        }
                        aVar.mo100666b();
                    } else if (this.mOrientationHelper.mo100803c(findViewByPosition) > this.mOrientationHelper.mo100807f()) {
                        aVar.mo100666b();
                        return true;
                    } else if (this.mOrientationHelper.mo100797a(findViewByPosition) - this.mOrientationHelper.mo100802c() < 0) {
                        aVar.f70889b = this.mOrientationHelper.mo100802c();
                        aVar.f70890c = false;
                        return true;
                    } else if (this.mOrientationHelper.mo100804d() - this.mOrientationHelper.mo100801b(findViewByPosition) < 0) {
                        aVar.f70889b = this.mOrientationHelper.mo100804d();
                        aVar.f70890c = true;
                        return true;
                    } else {
                        if (aVar.f70890c) {
                            i2 = this.mOrientationHelper.mo100801b(findViewByPosition) + this.mOrientationHelper.mo100800b();
                        } else {
                            i2 = this.mOrientationHelper.mo100797a(findViewByPosition);
                        }
                        aVar.f70889b = i2;
                    }
                    return true;
                } else {
                    aVar.f70890c = this.mShouldReverseLayoutExpose;
                    if (this.mShouldReverseLayoutExpose) {
                        aVar.f70889b = this.mOrientationHelper.mo100804d() - this.mPendingScrollPositionOffset;
                    } else {
                        aVar.f70889b = this.mOrientationHelper.mo100802c() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View findViewByPosition;
        int i8;
        int i9;
        Bundle bundle = this.mCurrentPendingSavedState;
        if (bundle != null && bundle.getInt("AnchorPosition") >= 0) {
            this.mCurrentPendingScrollPosition = this.mCurrentPendingSavedState.getInt("AnchorPosition");
        }
        ensureLayoutStateExpose();
        this.mLayoutState.f70906b = false;
        myResolveShouldLayoutReverse();
        this.mAnchorInfo.mo100663a();
        this.mAnchorInfo.f70890c = this.mShouldReverseLayoutExpose ^ getStackFromEnd();
        updateAnchorInfoForLayoutExpose(state, this.mAnchorInfo);
        int extraLayoutSpace = getExtraLayoutSpace(state);
        if (state.getTargetScrollPosition() < this.mAnchorInfo.f70888a) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.mShouldReverseLayoutExpose) {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        } else {
            i = 0;
        }
        int c = extraLayoutSpace + this.mOrientationHelper.mo100802c();
        int g = i + this.mOrientationHelper.mo100808g();
        if (!(!state.isPreLayout() || (i7 = this.mCurrentPendingScrollPosition) == -1 || this.mPendingScrollPositionOffset == Integer.MIN_VALUE || (findViewByPosition = findViewByPosition(i7)) == null)) {
            if (this.mShouldReverseLayoutExpose) {
                i8 = this.mOrientationHelper.mo100804d() - this.mOrientationHelper.mo100801b(findViewByPosition);
                i9 = this.mPendingScrollPositionOffset;
            } else {
                i9 = this.mOrientationHelper.mo100797a(findViewByPosition) - this.mOrientationHelper.mo100802c();
                i8 = this.mPendingScrollPositionOffset;
            }
            int i10 = i8 - i9;
            if (i10 > 0) {
                c += i10;
            } else {
                g -= i10;
            }
        }
        onAnchorReady(state, this.mAnchorInfo);
        detachAndScrapAttachedViews(recycler);
        this.mLayoutState.f70914j = state.isPreLayout();
        this.mLayoutState.f70905a = true;
        if (this.mAnchorInfo.f70890c) {
            updateLayoutStateToFillStartExpose(this.mAnchorInfo);
            this.mLayoutState.f70913i = c;
            fill(recycler, this.mLayoutState, state, false);
            i3 = this.mLayoutState.f70907c;
            if (this.mLayoutState.f70908d > 0) {
                g += this.mLayoutState.f70908d;
            }
            updateLayoutStateToFillEndExpose(this.mAnchorInfo);
            this.mLayoutState.f70913i = g;
            this.mLayoutState.f70909e += this.mLayoutState.f70910f;
            fill(recycler, this.mLayoutState, state, false);
            i2 = this.mLayoutState.f70907c;
        } else {
            updateLayoutStateToFillEndExpose(this.mAnchorInfo);
            this.mLayoutState.f70913i = g;
            fill(recycler, this.mLayoutState, state, false);
            i2 = this.mLayoutState.f70907c;
            if (this.mLayoutState.f70908d > 0) {
                c += this.mLayoutState.f70908d;
            }
            updateLayoutStateToFillStartExpose(this.mAnchorInfo);
            this.mLayoutState.f70913i = c;
            this.mLayoutState.f70909e += this.mLayoutState.f70910f;
            fill(recycler, this.mLayoutState, state, false);
            i3 = this.mLayoutState.f70907c;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayoutExpose ^ getStackFromEnd()) {
                int fixLayoutEndGapExpose = fixLayoutEndGapExpose(i2, recycler, state, true);
                i6 = i3 + fixLayoutEndGapExpose;
                i4 = i2 + fixLayoutEndGapExpose;
                i5 = fixLayoutStartGapExpose(i6, recycler, state, false);
            } else {
                int fixLayoutStartGapExpose = fixLayoutStartGapExpose(i3, recycler, state, true);
                i6 = i3 + fixLayoutStartGapExpose;
                i4 = i2 + fixLayoutStartGapExpose;
                i5 = fixLayoutEndGapExpose(i4, recycler, state, false);
            }
            i3 = i6 + i5;
            i2 = i4 + i5;
        }
        layoutForPredictiveAnimationsExpose(recycler, state, i3, i2);
        if (!state.isPreLayout()) {
            this.mCurrentPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            this.mOrientationHelper.mo100798a();
        }
        this.mLastStackFromEnd = getStackFromEnd();
        this.mCurrentPendingSavedState = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getOrientation() == 1) {
            return 0;
        }
        return scrollInternalBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getOrientation() == 0) {
            return 0;
        }
        return scrollInternalBy(i, recycler, state);
    }

    /* access modifiers changed from: protected */
    public void recycleChildren(RecyclerView.Recycler recycler, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    removeAndRecycleViewAt(i3, recycler);
                }
                return;
            }
            while (i > i2) {
                removeAndRecycleViewAt(i, recycler);
                i--;
            }
        }
    }

    /* access modifiers changed from: protected */
    public int scrollInternalBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i2;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        this.mLayoutState.f70906b = true;
        ensureLayoutStateExpose();
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        updateLayoutStateExpose(i2, abs, true, state);
        int i3 = this.mLayoutState.f70912h;
        this.mLayoutState.f70905a = false;
        int fill = i3 + fill(recycler, this.mLayoutState, state, false);
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i = i2 * fill;
        }
        this.mOrientationHelper.mo100799a(-i);
        return i;
    }

    public ExposeLinearLayoutManagerEx(Context context, int i, boolean z) {
        super(context, i, z);
        this.mCurrentPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.emptyArgs = new Object[0];
        this.layoutChunkResultCache = new C28273h();
        this.mAnchorInfo = new C28250a();
        setOrientation(i);
        setReverseLayout(z);
        this.mChildHelperWrapper = new C28251b(this);
        try {
            Method declaredMethod = LinearLayoutManager.class.getDeclaredMethod("ensureLayoutState", new Class[0]);
            this.mEnsureLayoutStateMethod = declaredMethod;
            declaredMethod.setAccessible(true);
            try {
                Method declaredMethod2 = RecyclerView.LayoutManager.class.getDeclaredMethod("setItemPrefetchEnabled", Boolean.TYPE);
                if (declaredMethod2 != null) {
                    declaredMethod2.invoke(this, false);
                }
            } catch (NoSuchMethodException e) {
                Log.m165391i("ExposeLLManagerEx", e);
            } catch (InvocationTargetException e2) {
                Log.m165391i("ExposeLLManagerEx", e2);
            } catch (IllegalAccessException e3) {
                Log.m165391i("ExposeLLManagerEx", e3);
            }
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
            throw new RuntimeException(e4);
        }
    }

    private View findReferenceChildInternal(int i, int i2, int i3) {
        int i4;
        ensureLayoutStateExpose();
        int c = this.mOrientationHelper.mo100802c();
        int d = this.mOrientationHelper.mo100804d();
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
                } else if (this.mOrientationHelper.mo100797a(childAt) < d && this.mOrientationHelper.mo100801b(childAt) >= c) {
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

    private int fixLayoutEndGapExpose(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int d;
        int d2 = this.mOrientationHelper.mo100804d() - i;
        if (d2 <= 0) {
            return 0;
        }
        int i2 = -scrollInternalBy(-d2, recycler, state);
        int i3 = i + i2;
        if (!z || (d = this.mOrientationHelper.mo100804d() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo100799a(d);
        return d + i2;
    }

    private int fixLayoutStartGapExpose(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int c;
        int c2 = i - this.mOrientationHelper.mo100802c();
        if (c2 <= 0) {
            return 0;
        }
        int i2 = -scrollInternalBy(c2, recycler, state);
        int i3 = i + i2;
        if (!z || (c = i3 - this.mOrientationHelper.mo100802c()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo100799a(-c);
        return i2 - c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int convertFocusDirectionToLayoutDirectionExpose;
        View view2;
        View view3;
        myResolveShouldLayoutReverse();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirectionExpose = convertFocusDirectionToLayoutDirectionExpose(i)) == Integer.MIN_VALUE) {
            return null;
        }
        if (convertFocusDirectionToLayoutDirectionExpose == -1) {
            view2 = myFindReferenceChildClosestToStart(state);
        } else {
            view2 = myFindReferenceChildClosestToEnd(state);
        }
        if (view2 == null) {
            return null;
        }
        ensureLayoutStateExpose();
        updateLayoutStateExpose(convertFocusDirectionToLayoutDirectionExpose, (int) (((float) this.mOrientationHelper.mo100807f()) * 0.33f), false, state);
        this.mLayoutState.f70912h = Integer.MIN_VALUE;
        this.mLayoutState.f70906b = false;
        this.mLayoutState.f70905a = false;
        fill(recycler, this.mLayoutState, state, true);
        if (convertFocusDirectionToLayoutDirectionExpose == -1) {
            view3 = getChildClosestToStartExpose();
        } else {
            view3 = getChildClosestToEndExpose();
        }
        if (view3 == view2 || !view3.isFocusable()) {
            return null;
        }
        return view3;
    }

    private void layoutForPredictiveAnimationsExpose(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        if (state.willRunPredictiveAnimations() && getChildCount() != 0 && !state.isPreLayout() && supportsPredictiveItemAnimations()) {
            List<RecyclerView.ViewHolder> scrapList = recycler.getScrapList();
            int size = scrapList.size();
            int position = getPosition(getChildAt(0));
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                i3 = -1;
                char c = 1;
                if (i5 >= size) {
                    break;
                }
                RecyclerView.ViewHolder viewHolder = scrapList.get(i5);
                if (viewHolder.getPosition() < position) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != this.mShouldReverseLayoutExpose) {
                    c = 65535;
                }
                if (c == 65535) {
                    i6 += this.mOrientationHelper.mo100803c(viewHolder.itemView);
                } else {
                    i7 += this.mOrientationHelper.mo100803c(viewHolder.itemView);
                }
                i5++;
            }
            this.mLayoutState.f70915k = scrapList;
            if (i6 > 0) {
                updateLayoutStateToFillStartExpose(getPosition(getChildClosestToStartExpose()), i);
                this.mLayoutState.f70913i = i6;
                this.mLayoutState.f70908d = 0;
                C28252c cVar = this.mLayoutState;
                int i8 = cVar.f70909e;
                if (this.mShouldReverseLayoutExpose) {
                    i4 = 1;
                } else {
                    i4 = -1;
                }
                cVar.f70909e = i8 + i4;
                this.mLayoutState.f70905a = true;
                fill(recycler, this.mLayoutState, state, false);
            }
            if (i7 > 0) {
                updateLayoutStateToFillEndExpose(getPosition(getChildClosestToEndExpose()), i2);
                this.mLayoutState.f70913i = i7;
                this.mLayoutState.f70908d = 0;
                C28252c cVar2 = this.mLayoutState;
                int i9 = cVar2.f70909e;
                if (!this.mShouldReverseLayoutExpose) {
                    i3 = 1;
                }
                cVar2.f70909e = i9 + i3;
                this.mLayoutState.f70905a = true;
                fill(recycler, this.mLayoutState, state, false);
            }
            this.mLayoutState.f70915k = null;
        }
    }

    /* access modifiers changed from: protected */
    public int fill(RecyclerView.Recycler recycler, C28252c cVar, RecyclerView.State state, boolean z) {
        int i = cVar.f70908d;
        if (cVar.f70912h != Integer.MIN_VALUE) {
            if (cVar.f70908d < 0) {
                cVar.f70912h += cVar.f70908d;
            }
            recycleByLayoutStateExpose(recycler, cVar);
        }
        int i2 = cVar.f70908d + cVar.f70913i + this.recycleOffset;
        while (i2 > 0 && cVar.mo100674a(state)) {
            this.layoutChunkResultCache.mo100754a();
            layoutChunk(recycler, state, cVar, this.layoutChunkResultCache);
            if (!this.layoutChunkResultCache.f71003b) {
                cVar.f70907c += this.layoutChunkResultCache.f71002a * cVar.f70911g;
                if (!this.layoutChunkResultCache.f71004c || this.mLayoutState.f70915k != null || !state.isPreLayout()) {
                    cVar.f70908d -= this.layoutChunkResultCache.f71002a;
                    i2 -= this.layoutChunkResultCache.f71002a;
                }
                if (cVar.f70912h != Integer.MIN_VALUE) {
                    cVar.f70912h += this.layoutChunkResultCache.f71002a;
                    if (cVar.f70908d < 0) {
                        cVar.f70912h += cVar.f70908d;
                    }
                    recycleByLayoutStateExpose(recycler, cVar);
                }
                if (z && this.layoutChunkResultCache.f71005d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f70908d;
    }

    /* access modifiers changed from: protected */
    public void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, C28252c cVar, C28273h hVar) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        View a = cVar.mo100673a(recycler);
        if (a == null) {
            hVar.f71003b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) a.getLayoutParams();
        if (cVar.f70915k == null) {
            boolean z3 = this.mShouldReverseLayoutExpose;
            if (cVar.f70911g == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                addView(a);
            } else {
                addView(a, 0);
            }
        } else {
            boolean z4 = this.mShouldReverseLayoutExpose;
            if (cVar.f70911g == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                addDisappearingView(a);
            } else {
                addDisappearingView(a, 0);
            }
        }
        measureChildWithMargins(a, 0, 0);
        hVar.f71002a = this.mOrientationHelper.mo100803c(a);
        if (getOrientation() == 1) {
            if (isLayoutRTL()) {
                i4 = getWidth() - getPaddingRight();
                i2 = i4 - this.mOrientationHelper.mo100805d(a);
            } else {
                i2 = getPaddingLeft();
                i4 = this.mOrientationHelper.mo100805d(a) + i2;
            }
            if (cVar.f70911g == -1) {
                i3 = cVar.f70907c;
                i = cVar.f70907c - hVar.f71002a;
            } else {
                int i5 = cVar.f70907c;
                i3 = cVar.f70907c + hVar.f71002a;
                i = i5;
            }
        } else {
            int paddingTop = getPaddingTop();
            int d = this.mOrientationHelper.mo100805d(a) + paddingTop;
            if (cVar.f70911g == -1) {
                int i6 = cVar.f70907c;
                i2 = cVar.f70907c - hVar.f71002a;
                i = paddingTop;
                i4 = i6;
                i3 = d;
            } else {
                int i7 = cVar.f70907c;
                i4 = cVar.f70907c + hVar.f71002a;
                i = paddingTop;
                i2 = i7;
                i3 = d;
            }
        }
        layoutDecorated(a, i2 + layoutParams.leftMargin, layoutParams.topMargin + i, i4 - layoutParams.rightMargin, i3 - layoutParams.bottomMargin);
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            hVar.f71004c = true;
        }
        hVar.f71005d = a.isFocusable();
    }

    /* access modifiers changed from: protected */
    public void updateLayoutStateExpose(int i, int i2, boolean z, RecyclerView.State state) {
        int i3;
        this.mLayoutState.f70913i = getExtraLayoutSpace(state);
        this.mLayoutState.f70911g = i;
        int i4 = -1;
        if (i == 1) {
            this.mLayoutState.f70913i += this.mOrientationHelper.mo100808g();
            View childClosestToEndExpose = getChildClosestToEndExpose();
            C28252c cVar = this.mLayoutState;
            if (!this.mShouldReverseLayoutExpose) {
                i4 = 1;
            }
            cVar.f70910f = i4;
            this.mLayoutState.f70909e = getPosition(childClosestToEndExpose) + this.mLayoutState.f70910f;
            this.mLayoutState.f70907c = this.mOrientationHelper.mo100801b(childClosestToEndExpose) + computeAlignOffset(childClosestToEndExpose, true, false);
            i3 = this.mLayoutState.f70907c - this.mOrientationHelper.mo100804d();
        } else {
            View childClosestToStartExpose = getChildClosestToStartExpose();
            this.mLayoutState.f70913i += this.mOrientationHelper.mo100802c();
            C28252c cVar2 = this.mLayoutState;
            if (this.mShouldReverseLayoutExpose) {
                i4 = 1;
            }
            cVar2.f70910f = i4;
            this.mLayoutState.f70909e = getPosition(childClosestToStartExpose) + this.mLayoutState.f70910f;
            this.mLayoutState.f70907c = this.mOrientationHelper.mo100797a(childClosestToStartExpose) + computeAlignOffset(childClosestToStartExpose, false, false);
            i3 = (-this.mLayoutState.f70907c) + this.mOrientationHelper.mo100802c();
        }
        this.mLayoutState.f70908d = i2;
        if (z) {
            this.mLayoutState.f70908d -= i3;
        }
        this.mLayoutState.f70912h = i3;
    }
}
