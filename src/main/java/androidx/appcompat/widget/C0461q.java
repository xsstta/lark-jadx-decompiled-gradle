package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.graphics.drawable.C0293c;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.view.C0924x;
import androidx.core.widget.C0943f;
import com.larksuite.suite.R;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.q */
public class C0461q extends ListView {

    /* renamed from: a */
    RunnableC0463b f1689a;

    /* renamed from: b */
    private final Rect f1690b = new Rect();

    /* renamed from: c */
    private int f1691c = 0;

    /* renamed from: d */
    private int f1692d = 0;

    /* renamed from: e */
    private int f1693e = 0;

    /* renamed from: f */
    private int f1694f = 0;

    /* renamed from: g */
    private int f1695g;

    /* renamed from: h */
    private Field f1696h;

    /* renamed from: i */
    private C0462a f1697i;

    /* renamed from: j */
    private boolean f1698j;

    /* renamed from: k */
    private boolean f1699k;

    /* renamed from: l */
    private boolean f1700l;

    /* renamed from: m */
    private C0924x f1701m;

    /* renamed from: n */
    private C0943f f1702n;

    /* renamed from: c */
    private boolean m2071c() {
        return this.f1700l;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.q$b */
    public class RunnableC0463b implements Runnable {
        /* renamed from: b */
        public void mo2668b() {
            C0461q.this.post(this);
        }

        /* renamed from: a */
        public void mo2667a() {
            C0461q.this.f1689a = null;
            C0461q.this.removeCallbacks(this);
        }

        public void run() {
            C0461q.this.f1689a = null;
            C0461q.this.drawableStateChanged();
        }

        RunnableC0463b() {
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f1689a = null;
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f1689a == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m2063a();
        }
    }

    public boolean hasFocus() {
        if (this.f1699k || super.hasFocus()) {
            return true;
        }
        return false;
    }

    public boolean hasWindowFocus() {
        if (this.f1699k || super.hasWindowFocus()) {
            return true;
        }
        return false;
    }

    public boolean isFocused() {
        if (this.f1699k || super.isFocused()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m2063a() {
        Drawable selector = getSelector();
        if (selector != null && m2071c() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public boolean isInTouchMode() {
        if ((!this.f1699k || !this.f1698j) && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m2069b() {
        this.f1700l = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1695g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0924x xVar = this.f1701m;
        if (xVar != null) {
            xVar.mo4730b();
            this.f1701m = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.q$a */
    public static class C0462a extends C0293c {

        /* renamed from: a */
        private boolean f1703a = true;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2666a(boolean z) {
            this.f1703a = z;
        }

        C0462a(Drawable drawable) {
            super(drawable);
        }

        @Override // androidx.appcompat.graphics.drawable.C0293c
        public void draw(Canvas canvas) {
            if (this.f1703a) {
                super.draw(canvas);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.C0293c
        public boolean setState(int[] iArr) {
            if (this.f1703a) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.C0293c
        public void setHotspot(float f, float f2) {
            if (this.f1703a) {
                super.setHotspot(f, f2);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.C0293c
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1703a) {
                return super.setVisible(z, z2);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.C0293c
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1703a) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f1698j = z;
    }

    private void setSelectorEnabled(boolean z) {
        C0462a aVar = this.f1697i;
        if (aVar != null) {
            aVar.mo2666a(z);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m2066a(canvas);
        super.dispatchDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1695g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0463b bVar = this.f1689a;
        if (bVar != null) {
            bVar.mo2667a();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0462a aVar;
        if (drawable != null) {
            aVar = new C0462a(drawable);
        } else {
            aVar = null;
        }
        this.f1697i = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1691c = rect.left;
        this.f1692d = rect.top;
        this.f1693e = rect.right;
        this.f1694f = rect.bottom;
    }

    /* renamed from: a */
    private void m2066a(Canvas canvas) {
        Drawable selector;
        if (!this.f1690b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1690b);
            selector.draw(canvas);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1689a == null) {
            RunnableC0463b bVar = new RunnableC0463b();
            this.f1689a = bVar;
            bVar.mo2668b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m2063a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    /* renamed from: a */
    private void m2067a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    C0461q(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f1699k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1696h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m2064a(int i, View view) {
        boolean z;
        Drawable selector = getSelector();
        boolean z2 = true;
        if (selector == null || i == -1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            selector.setVisible(false, false);
        }
        m2070b(i, view);
        if (z) {
            Rect rect = this.f1690b;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z2 = false;
            }
            selector.setVisible(z2, false);
            C0774a.m3765a(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: b */
    private void m2070b(int i, View view) {
        boolean z;
        Rect rect = this.f1690b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1691c;
        rect.top -= this.f1692d;
        rect.right += this.f1693e;
        rect.bottom += this.f1694f;
        try {
            boolean z2 = this.f1696h.getBoolean(this);
            if (view.isEnabled() != z2) {
                Field field = this.f1696h;
                if (!z2) {
                    z = true;
                } else {
                    z = false;
                }
                field.set(this, Boolean.valueOf(z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public int mo2653a(int i, boolean z) {
        int i2;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z) {
                    i2 = Math.max(0, i);
                    while (i2 < count && !adapter.isEnabled(i2)) {
                        i2++;
                    }
                } else {
                    i2 = Math.min(i, count - 1);
                    while (i2 >= 0 && !adapter.isEnabled(i2)) {
                        i2--;
                    }
                }
                if (i2 < 0 || i2 >= count) {
                    return -1;
                }
                return i2;
            } else if (i < 0 || i >= count) {
                return -1;
            } else {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2654a(android.view.MotionEvent r8, int r9) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0461q.mo2654a(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: a */
    private void m2065a(int i, View view, float f, float f2) {
        m2064a(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0774a.m3765a(selector, f, f2);
        }
    }

    /* renamed from: a */
    private void m2068a(View view, int i, float f, float f2) {
        View childAt;
        this.f1700l = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f1695g;
        if (!(i2 == -1 || (childAt = getChildAt(i2 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f1695g = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m2065a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: a */
    public int mo2652a(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                i6 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                return (i5 < 0 || i8 <= i5 || i10 <= 0 || i7 == i4) ? i4 : i10;
            }
            if (i5 >= 0 && i8 >= i5) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }
}
