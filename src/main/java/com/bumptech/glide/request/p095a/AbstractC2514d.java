package com.bumptech.glide.request.p095a;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.request.AbstractC2533d;
import com.bumptech.glide.util.C2567j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bumptech.glide.request.a.d */
public abstract class AbstractC2514d<T extends View, Z> implements AbstractC2522j<Z> {

    /* renamed from: b */
    private static final int f8172b = 2131299779;

    /* renamed from: a */
    protected final T f8173a;

    /* renamed from: c */
    private final C2515a f8174c;

    /* renamed from: d */
    private View.OnAttachStateChangeListener f8175d;

    /* renamed from: e */
    private boolean f8176e;

    /* renamed from: f */
    private boolean f8177f;

    /* access modifiers changed from: protected */
    public abstract void a_(Drawable drawable);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo11177d(Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.AbstractC2500i
    /* renamed from: f */
    public void mo10427f() {
    }

    @Override // com.bumptech.glide.manager.AbstractC2500i
    /* renamed from: g */
    public void mo10428g() {
    }

    @Override // com.bumptech.glide.manager.AbstractC2500i
    /* renamed from: h */
    public void mo10429h() {
    }

    /* renamed from: com.bumptech.glide.request.a.d$a */
    static final class C2515a {

        /* renamed from: a */
        static Integer f8178a;

        /* renamed from: b */
        boolean f8179b;

        /* renamed from: c */
        private final View f8180c;

        /* renamed from: d */
        private final List<AbstractC2521i> f8181d = new ArrayList();

        /* renamed from: e */
        private ViewTreeObserver$OnPreDrawListenerC2516a f8182e;

        /* renamed from: a */
        private boolean m10684a(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* access modifiers changed from: private */
        /* renamed from: com.bumptech.glide.request.a.d$a$a */
        public static final class ViewTreeObserver$OnPreDrawListenerC2516a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            private final WeakReference<C2515a> f8183a;

            public boolean onPreDraw() {
                C2515a aVar = this.f8183a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.mo11179a();
                return true;
            }

            ViewTreeObserver$OnPreDrawListenerC2516a(C2515a aVar) {
                this.f8183a = new WeakReference<>(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo11181b() {
            ViewTreeObserver viewTreeObserver = this.f8180c.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f8182e);
            }
            this.f8182e = null;
            this.f8181d.clear();
        }

        /* renamed from: c */
        private int m10686c() {
            int i;
            int paddingTop = this.f8180c.getPaddingTop() + this.f8180c.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f8180c.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.height;
            } else {
                i = 0;
            }
            return m10681a(this.f8180c.getHeight(), i, paddingTop);
        }

        /* renamed from: d */
        private int m10687d() {
            int i;
            int paddingLeft = this.f8180c.getPaddingLeft() + this.f8180c.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f8180c.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = 0;
            }
            return m10681a(this.f8180c.getWidth(), i, paddingLeft);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo11179a() {
            if (!this.f8181d.isEmpty()) {
                int d = m10687d();
                int c = m10686c();
                if (m10685b(d, c)) {
                    m10683a(d, c);
                    mo11181b();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo11182b(AbstractC2521i iVar) {
            this.f8181d.remove(iVar);
        }

        C2515a(View view) {
            this.f8180c = view;
        }

        /* renamed from: a */
        private static int m10682a(Context context) {
            if (f8178a == null) {
                Display defaultDisplay = ((WindowManager) C2567j.m10894a((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f8178a = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f8178a.intValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo11180a(AbstractC2521i iVar) {
            int d = m10687d();
            int c = m10686c();
            if (m10685b(d, c)) {
                iVar.mo11187a(d, c);
                return;
            }
            if (!this.f8181d.contains(iVar)) {
                this.f8181d.add(iVar);
            }
            if (this.f8182e == null) {
                ViewTreeObserver viewTreeObserver = this.f8180c.getViewTreeObserver();
                ViewTreeObserver$OnPreDrawListenerC2516a aVar = new ViewTreeObserver$OnPreDrawListenerC2516a(this);
                this.f8182e = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* renamed from: b */
        private boolean m10685b(int i, int i2) {
            if (!m10684a(i) || !m10684a(i2)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private void m10683a(int i, int i2) {
            Iterator it = new ArrayList(this.f8181d).iterator();
            while (it.hasNext()) {
                ((AbstractC2521i) it.next()).mo11187a(i, i2);
            }
        }

        /* renamed from: a */
        private int m10681a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f8179b && this.f8180c.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f8180c.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m10682a(this.f8180c.getContext());
        }
    }

    /* renamed from: b */
    private Object m10668b() {
        return this.f8173a.getTag(f8172b);
    }

    /* renamed from: c */
    private void m10669c() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f8175d;
        if (onAttachStateChangeListener != null && !this.f8177f) {
            this.f8173a.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f8177f = true;
        }
    }

    /* renamed from: d */
    private void m10670d() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f8175d;
        if (onAttachStateChangeListener != null && this.f8177f) {
            this.f8173a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f8177f = false;
        }
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: a */
    public final AbstractC2533d mo11170a() {
        Object b = m10668b();
        if (b == null) {
            return null;
        }
        if (b instanceof AbstractC2533d) {
            return (AbstractC2533d) b;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    public String toString() {
        return "Target for: " + this.f8173a;
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: a */
    public final void mo11171a(AbstractC2533d dVar) {
        m10667a((Object) dVar);
    }

    /* renamed from: a */
    private void m10667a(Object obj) {
        this.f8173a.setTag(f8172b, obj);
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: b */
    public final void mo11176b(AbstractC2521i iVar) {
        this.f8174c.mo11182b(iVar);
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: c */
    public final void mo11172c(Drawable drawable) {
        m10669c();
        mo11177d(drawable);
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: a */
    public final void mo11036a(Drawable drawable) {
        this.f8174c.mo11181b();
        a_(drawable);
        if (!this.f8176e) {
            m10670d();
        }
    }

    public AbstractC2514d(T t) {
        this.f8173a = (T) ((View) C2567j.m10894a(t));
        this.f8174c = new C2515a(t);
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: a */
    public final void mo11175a(AbstractC2521i iVar) {
        this.f8174c.mo11180a(iVar);
    }
}
