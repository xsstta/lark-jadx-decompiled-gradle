package com.bytedance.ee.lark.component.p607a.p613f;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.lark.component.AbstractC12716a;
import com.bytedance.ee.lark.component.p607a.p612e.AbstractC12724a;
import com.bytedance.ee.lark.component.p607a.p612e.C12725b;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.ee.lark.component.a.f.a */
public class C12730a extends ViewGroup {

    /* renamed from: a */
    public Set<String> f34087a = new HashSet();

    /* renamed from: b */
    public Map<String, View> f34088b = new HashMap();

    /* renamed from: c */
    AbstractC12724a f34089c = new AbstractC12724a() {
        /* class com.bytedance.ee.lark.component.p607a.p613f.C12730a.C127311 */

        @Override // com.bytedance.ee.lark.component.p607a.p612e.AbstractC12724a
        /* renamed from: a */
        public void mo48184a(AbstractC12716a aVar) {
            if (aVar == null) {
                Log.m165383e("NativeViewLayout", "onDataRemoved, nativeComponent is null");
                return;
            }
            String viewId = aVar.getViewId();
            View a = C12730a.this.mo48205a(viewId);
            aVar.onRemove();
            C12730a.this.f34088b.remove(viewId);
            if (a != null) {
                C12730a.this.detachViewFromParent((C12730a) a);
                C12730a.this.requestLayout();
            }
        }

        @Override // com.bytedance.ee.lark.component.p607a.p612e.AbstractC12724a
        /* renamed from: c */
        public void mo48186c(AbstractC12716a aVar) {
            if (aVar == null) {
                Log.m165383e("NativeViewLayout", "onDataUpdated, nativeComponent is null");
                return;
            }
            String viewId = aVar.getViewId();
            Log.m165379d("NativeViewLayout", "onDataUpdated, viewId = " + aVar.getViewId());
            View a = C12730a.this.mo48205a(viewId);
            if (a != null) {
                aVar.onUpdateView(a, aVar.getData());
            }
        }

        @Override // com.bytedance.ee.lark.component.p607a.p612e.AbstractC12724a
        /* renamed from: b */
        public void mo48185b(AbstractC12716a aVar) {
            if (aVar == null) {
                Log.m165383e("NativeViewLayout", "onDataAdded, nativeComponent is null");
                return;
            }
            String viewId = aVar.getViewId();
            Log.m165379d("NativeViewLayout", "onDataAdded, viewId = " + viewId);
            if (C12730a.this.f34087a.contains(viewId)) {
                if (!C12730a.this.f34088b.containsKey(viewId) || C12730a.this.f34088b.get(viewId) == null) {
                    C12730a.this.f34088b.put(viewId, aVar.onCreateView(C12730a.this.getContext(), aVar.getData()));
                } else {
                    Log.m165379d("NativeViewLayout", "onDataAdded, view has already created, viewId = " + viewId);
                }
                int width = aVar.getWidth();
                int height = aVar.getHeight();
                if (width <= 0 || height <= 0) {
                    Log.m165379d("NativeViewLayout", "onDataAdded, invalid width = " + width + " height = " + height);
                    return;
                }
                C12730a.this.mo48207a(viewId, 0, 0, width, height);
            }
        }
    };

    /* renamed from: d */
    private C12725b f34090d;

    /* renamed from: e */
    private Map<String, Rect> f34091e = new HashMap();

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C12732a(-2, -2, 0, 0);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C12732a;
    }

    /* renamed from: a */
    private int m52694a(View view) {
        if (view == null) {
            return 0;
        }
        return ((C12732a) view.getLayoutParams()).f34095c;
    }

    /* renamed from: b */
    public void mo48208b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f34087a.add(str);
        }
    }

    public C12730a(Context context) {
        super(context);
    }

    /* renamed from: a */
    private int m52693a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return size;
        }
        return 0;
    }

    /* renamed from: b */
    private int m52699b(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return size;
        }
        return 0;
    }

    /* renamed from: c */
    private Rect m52701c(AbstractC12716a aVar) {
        if (aVar == null) {
            return null;
        }
        return this.f34091e.get(aVar.getViewId());
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Log.m165379d("NativeViewLayout", "dispatchTouchEvent, ev = " + motionEvent.getAction());
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Log.m165379d("NativeViewLayout", "onInterceptTouchEvent, ev = " + motionEvent.getAction());
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Log.m165379d("NativeViewLayout", "onTouchEvent, ev = " + motionEvent.getAction());
        return super.onTouchEvent(motionEvent);
    }

    public void setNativeComponentProvider(C12725b bVar) {
        C12725b bVar2 = this.f34090d;
        if (bVar2 != null) {
            bVar2.mo48192b(this.f34089c);
        }
        this.f34090d = bVar;
        bVar.mo48189a(this.f34089c);
    }

    /* renamed from: d */
    private int m52702d(AbstractC12716a aVar) {
        int zIndex = aVar.getZIndex();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            if (m52694a(getChildAt(i2)) >= zIndex) {
                childCount = i2 - 1;
            } else {
                i = i2 + 1;
            }
        }
        return i;
    }

    /* renamed from: b */
    private void m52700b(AbstractC12716a aVar) {
        if (aVar == null) {
            Log.m165383e("NativeViewLayout", "relayoutView component is null");
            return;
        }
        Rect c = m52701c(aVar);
        if (c == null) {
            Log.m165383e("NativeViewLayout", "relayoutView location is null");
            return;
        }
        String viewId = aVar.getViewId();
        View view = this.f34088b.get(viewId);
        if (view == null) {
            Log.m165383e("NativeViewLayout", "relayoutView view has not created, viewId: " + viewId);
            view = aVar.onCreateView(getContext(), aVar.getData());
            this.f34088b.put(viewId, view);
        }
        if (view.isLayoutRequested()) {
            Log.m165379d("NativeViewLayout", "relayoutView, measure and layout");
            view.measure(View.MeasureSpec.makeMeasureSpec(c.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(c.height(), 1073741824));
            view.layout(c.left, c.top, c.right, c.bottom);
            return;
        }
        cleanupLayoutState(view);
        m52698a(aVar, view);
    }

    /* renamed from: a */
    public View mo48205a(String str) {
        C12732a aVar;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt == null || (aVar = (C12732a) childAt.getLayoutParams()) == null || !str.equals(aVar.f34096d))) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m52697a(AbstractC12716a aVar) {
        if (aVar == null) {
            Log.m165383e("NativeViewLayout", "makeAndAddView component is null");
            return;
        }
        Rect c = m52701c(aVar);
        if (c == null) {
            Log.m165383e("NativeViewLayout", "makeAndAddView location is null");
            return;
        }
        int d = m52702d(aVar);
        C12732a a = m52695a(aVar, c);
        String viewId = aVar.getViewId();
        View view = this.f34088b.get(viewId);
        if (view == null) {
            Log.m165383e("NativeViewLayout", "makeAndAddView view has not created, viewId: " + viewId);
            view = aVar.onCreateView(getContext(), aVar.getData());
            this.f34088b.put(viewId, view);
        }
        addViewInLayout(view, d, a);
        if (view.isLayoutRequested()) {
            Log.m165379d("NativeViewLayout", "makeAndAddView, measure and layout");
            view.measure(View.MeasureSpec.makeMeasureSpec(c.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(c.height(), 1073741824));
            view.layout(c.left, c.top, c.right, c.bottom);
            return;
        }
        cleanupLayoutState(view);
        m52698a(aVar, view);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int a = m52693a(i);
        int b = m52699b(i2);
        measureChildren(i, i2);
        setMeasuredDimension(a, b);
    }

    /* renamed from: a */
    private C12732a m52695a(AbstractC12716a aVar, Rect rect) {
        C12732a aVar2 = new C12732a(rect.width(), rect.height(), rect.left, rect.top);
        aVar2.f34095c = aVar.getZIndex();
        aVar2.f34096d = aVar.getViewId();
        aVar2.f34097e = aVar.getViewType();
        return aVar2;
    }

    /* renamed from: a */
    private void m52698a(AbstractC12716a aVar, View view) {
        Rect c = m52701c(aVar);
        if (c == null) {
            Log.m165383e("NativeViewLayout", "scrollToNewLocation location is null, viewId= " + aVar.getViewId());
            return;
        }
        int top = view.getTop();
        int left = c.left - view.getLeft();
        int i = c.top - top;
        view.offsetLeftAndRight(left);
        view.offsetTopAndBottom(i);
        C12732a aVar2 = (C12732a) view.getLayoutParams();
        aVar2.f34093a = c.left;
        aVar2.f34094b = c.top;
        aVar2.width = c.width();
        aVar2.height = c.height();
        Log.m165379d("NativeViewLayout", "scrollToNewLocation id: " + aVar.getViewId() + "offsetY: " + i + " newtop: " + view.getTop() + " oldTop: " + top);
    }

    /* renamed from: a */
    public void mo48206a(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("NativeViewLayout", "updateScroll with empty viewId");
            return;
        }
        Log.m165379d("NativeViewLayout", "updateScroll, viewId = " + str + " scrollX: " + i + " scrollY: " + i2);
        AbstractC12716a a = this.f34090d.mo48188a(str);
        if (a == null) {
            Log.m165383e("NativeViewLayout", "updateScroll, viewId: " + str + " has not added");
        } else if (mo48205a(str) != null) {
            Log.m165379d("NativeViewLayout", "updateScroll, view not null, do nothing");
        } else {
            Log.m165379d("NativeViewLayout", "updateScroll, view is null, need make, viewId = " + str);
            m52697a(a);
        }
    }

    /* renamed from: com.bytedance.ee.lark.component.a.f.a$a */
    public static class C12732a extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public int f34093a;

        /* renamed from: b */
        public int f34094b;

        /* renamed from: c */
        public int f34095c;

        /* renamed from: d */
        public String f34096d;

        /* renamed from: e */
        public String f34097e;

        public C12732a(int i, int i2, int i3, int i4) {
            super(i, i2);
            this.f34093a = i3;
            this.f34094b = i4;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Log.m165379d("NativeViewLayout", "onLayout changed= " + z + "left= " + i + "top= " + i2 + "right= " + i3 + "bottom= " + i4);
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            childAt.layout(i, i5, measuredWidth, measuredHeight);
            i5 += measuredHeight;
        }
    }

    /* renamed from: a */
    public void mo48207a(String str, int i, int i2, int i3, int i4) {
        Log.m165379d("NativeViewLayout", "updateBounds, viewId = " + str + " x: " + i + " y: " + i2 + " width: " + i3 + " height: " + i4);
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("NativeViewLayout", "updateBounds with empty viewId");
            return;
        }
        AbstractC12716a a = this.f34090d.mo48188a(str);
        if (a == null) {
            this.f34091e.put(str, new Rect(0, 0, i3, i4));
            Log.m165383e("NativeViewLayout", "updateBounds, viewId: " + str + " has not added");
            return;
        }
        this.f34091e.put(str, new Rect(0, 0, i3, i4));
        if (mo48205a(str) != null) {
            Log.m165379d("NativeViewLayout", "updateBounds, view not null, relayout");
            m52700b(a);
            return;
        }
        Log.m165379d("NativeViewLayout", "updateBounds, view is null, need make, viewId = " + str);
        a.setWidthAndHeight(i3, i4);
        m52697a(a);
    }
}
