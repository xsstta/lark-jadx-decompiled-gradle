package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.internal.o */
public class C22361o implements AbstractC22364q {

    /* renamed from: a */
    protected C22362a f54783a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.o$a */
    public static class C22362a extends ViewGroup {

        /* renamed from: a */
        static Method f54784a;

        /* renamed from: b */
        ViewGroup f54785b;

        /* renamed from: c */
        View f54786c;

        /* renamed from: d */
        ArrayList<Drawable> f54787d;

        /* renamed from: e */
        C22361o f54788e;

        /* renamed from: f */
        private boolean f54789f;

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        private void m81011a() {
            if (this.f54789f) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        static {
            try {
                f54784a = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        /* renamed from: b */
        private void m81013b() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f54787d;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f54789f = true;
                    this.f54785b.removeView(this);
                }
            }
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* renamed from: a */
        private void m81012a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f54785b.getLocationOnScreen(iArr2);
            this.f54786c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* access modifiers changed from: protected */
        public boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            if (super.verifyDrawable(drawable) || ((arrayList = this.f54787d) != null && arrayList.contains(drawable))) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public void mo77866a(Drawable drawable) {
            m81011a();
            if (this.f54787d == null) {
                this.f54787d = new ArrayList<>();
            }
            if (!this.f54787d.contains(drawable)) {
                this.f54787d.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void mo77867b(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f54787d;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                m81013b();
            }
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int i;
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f54785b.getLocationOnScreen(iArr);
            this.f54786c.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f54786c.getWidth(), this.f54786c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f54787d;
            if (arrayList == null) {
                i = 0;
            } else {
                i = arrayList.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                this.f54787d.get(i2).draw(canvas);
            }
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f54785b == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f54785b != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                m81012a(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        C22362a(Context context, ViewGroup viewGroup, View view, C22361o oVar) {
            super(context);
            this.f54785b = viewGroup;
            this.f54786c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f54788e = oVar;
        }
    }

    @Override // com.google.android.material.internal.AbstractC22364q
    /* renamed from: a */
    public void mo77864a(Drawable drawable) {
        this.f54783a.mo77866a(drawable);
    }

    @Override // com.google.android.material.internal.AbstractC22364q
    /* renamed from: b */
    public void mo77865b(Drawable drawable) {
        this.f54783a.mo77867b(drawable);
    }

    /* renamed from: a */
    static C22361o m81008a(View view) {
        ViewGroup f = C22365r.m81029f(view);
        if (f == null) {
            return null;
        }
        int childCount = f.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = f.getChildAt(i);
            if (childAt instanceof C22362a) {
                return ((C22362a) childAt).f54788e;
            }
        }
        return new C22359m(f.getContext(), f, view);
    }

    C22361o(Context context, ViewGroup viewGroup, View view) {
        this.f54783a = new C22362a(context, viewGroup, view, this);
    }
}
