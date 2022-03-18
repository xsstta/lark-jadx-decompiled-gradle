package androidx.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: androidx.transition.ag */
public class C1521ag implements AbstractC1524ai {

    /* renamed from: a */
    protected C1522a f5352a;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.transition.ag$a */
    public static class C1522a extends ViewGroup {

        /* renamed from: a */
        static Method f5353a;

        /* renamed from: b */
        ViewGroup f5354b;

        /* renamed from: c */
        View f5355c;

        /* renamed from: d */
        ArrayList<Drawable> f5356d;

        /* renamed from: e */
        C1521ag f5357e;

        /* renamed from: f */
        private boolean f5358f;

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        private void m6984a() {
            if (this.f5358f) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        static {
            try {
                f5353a = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        /* renamed from: b */
        private void m6986b() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f5356d;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f5358f = true;
                    this.f5354b.removeView(this);
                }
            }
        }

        /* renamed from: b */
        public void mo7965b(View view) {
            super.removeView(view);
            m6986b();
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* renamed from: a */
        private void m6985a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f5354b.getLocationOnScreen(iArr2);
            this.f5355c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* access modifiers changed from: protected */
        public boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            if (super.verifyDrawable(drawable) || ((arrayList = this.f5356d) != null && arrayList.contains(drawable))) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public void mo7962a(Drawable drawable) {
            m6984a();
            if (this.f5356d == null) {
                this.f5356d = new ArrayList<>();
            }
            if (!this.f5356d.contains(drawable)) {
                this.f5356d.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void mo7964b(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f5356d;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                m6986b();
            }
        }

        /* renamed from: a */
        public void mo7963a(View view) {
            m6984a();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f5354b || viewGroup.getParent() == null || !ViewCompat.m4015I(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f5354b.getLocationOnScreen(iArr2);
                    ViewCompat.m4089j(view, iArr[0] - iArr2[0]);
                    ViewCompat.m4087i(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int i;
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f5354b.getLocationOnScreen(iArr);
            this.f5355c.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f5355c.getWidth(), this.f5355c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f5356d;
            if (arrayList == null) {
                i = 0;
            } else {
                i = arrayList.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                this.f5356d.get(i2).draw(canvas);
            }
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f5354b == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f5354b instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                m6985a(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        C1522a(Context context, ViewGroup viewGroup, View view, C1521ag agVar) {
            super(context);
            this.f5354b = viewGroup;
            this.f5355c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f5357e = agVar;
        }
    }

    @Override // androidx.transition.AbstractC1524ai
    /* renamed from: a */
    public void mo7959a(Drawable drawable) {
        this.f5352a.mo7962a(drawable);
    }

    @Override // androidx.transition.AbstractC1524ai
    /* renamed from: b */
    public void mo7960b(Drawable drawable) {
        this.f5352a.mo7964b(drawable);
    }

    /* renamed from: c */
    static ViewGroup m6980c(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: d */
    static C1521ag m6981d(View view) {
        ViewGroup c = m6980c(view);
        if (c == null) {
            return null;
        }
        int childCount = c.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c.getChildAt(i);
            if (childAt instanceof C1522a) {
                return ((C1522a) childAt).f5357e;
            }
        }
        return new C1515ab(c.getContext(), c, view);
    }

    C1521ag(Context context, ViewGroup viewGroup, View view) {
        this.f5352a = new C1522a(context, viewGroup, view, this);
    }
}
