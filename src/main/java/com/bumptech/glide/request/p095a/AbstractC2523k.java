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

/* renamed from: com.bumptech.glide.request.a.k */
public abstract class AbstractC2523k<T extends View, Z> extends AbstractC2511a<Z> {

    /* renamed from: b */
    private static boolean f8187b = false;

    /* renamed from: c */
    private static int f8188c = 2131299779;

    /* renamed from: a */
    protected final T f8189a;

    /* renamed from: d */
    private final C2524a f8190d;

    /* renamed from: e */
    private View.OnAttachStateChangeListener f8191e;

    /* renamed from: f */
    private boolean f8192f;

    /* renamed from: g */
    private boolean f8193g;

    /* renamed from: com.bumptech.glide.request.a.k$a */
    static final class C2524a {

        /* renamed from: a */
        static Integer f8194a;

        /* renamed from: b */
        boolean f8195b;

        /* renamed from: c */
        private final View f8196c;

        /* renamed from: d */
        private final List<AbstractC2521i> f8197d = new ArrayList();

        /* renamed from: e */
        private ViewTreeObserver$OnPreDrawListenerC2525a f8198e;

        /* renamed from: a */
        private boolean m10729a(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* access modifiers changed from: private */
        /* renamed from: com.bumptech.glide.request.a.k$a$a */
        public static final class ViewTreeObserver$OnPreDrawListenerC2525a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            private final WeakReference<C2524a> f8199a;

            public boolean onPreDraw() {
                C2524a aVar = this.f8199a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.mo11189a();
                return true;
            }

            ViewTreeObserver$OnPreDrawListenerC2525a(C2524a aVar) {
                this.f8199a = new WeakReference<>(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo11191b() {
            ViewTreeObserver viewTreeObserver = this.f8196c.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f8198e);
            }
            this.f8198e = null;
            this.f8197d.clear();
        }

        /* renamed from: c */
        private int m10731c() {
            int i;
            int paddingTop = this.f8196c.getPaddingTop() + this.f8196c.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f8196c.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.height;
            } else {
                i = 0;
            }
            return m10726a(this.f8196c.getHeight(), i, paddingTop);
        }

        /* renamed from: d */
        private int m10732d() {
            int i;
            int paddingLeft = this.f8196c.getPaddingLeft() + this.f8196c.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f8196c.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = 0;
            }
            return m10726a(this.f8196c.getWidth(), i, paddingLeft);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo11189a() {
            if (!this.f8197d.isEmpty()) {
                int d = m10732d();
                int c = m10731c();
                if (m10730b(d, c)) {
                    m10728a(d, c);
                    mo11191b();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo11192b(AbstractC2521i iVar) {
            this.f8197d.remove(iVar);
        }

        C2524a(View view) {
            this.f8196c = view;
        }

        /* renamed from: a */
        private static int m10727a(Context context) {
            if (f8194a == null) {
                Display defaultDisplay = ((WindowManager) C2567j.m10894a((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f8194a = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f8194a.intValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo11190a(AbstractC2521i iVar) {
            int d = m10732d();
            int c = m10731c();
            if (m10730b(d, c)) {
                iVar.mo11187a(d, c);
                return;
            }
            if (!this.f8197d.contains(iVar)) {
                this.f8197d.add(iVar);
            }
            if (this.f8198e == null) {
                ViewTreeObserver viewTreeObserver = this.f8196c.getViewTreeObserver();
                ViewTreeObserver$OnPreDrawListenerC2525a aVar = new ViewTreeObserver$OnPreDrawListenerC2525a(this);
                this.f8198e = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* renamed from: b */
        private boolean m10730b(int i, int i2) {
            if (!m10729a(i) || !m10729a(i2)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private void m10728a(int i, int i2) {
            Iterator it = new ArrayList(this.f8197d).iterator();
            while (it.hasNext()) {
                ((AbstractC2521i) it.next()).mo11187a(i, i2);
            }
        }

        /* renamed from: a */
        private int m10726a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f8195b && this.f8196c.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f8196c.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m10727a(this.f8196c.getContext());
        }
    }

    /* renamed from: d */
    private Object m10719d() {
        return this.f8189a.getTag(f8188c);
    }

    /* renamed from: b */
    private void m10717b() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f8191e;
        if (onAttachStateChangeListener != null && !this.f8193g) {
            this.f8189a.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f8193g = true;
        }
    }

    /* renamed from: c */
    private void m10718c() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f8191e;
        if (onAttachStateChangeListener != null && this.f8193g) {
            this.f8189a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f8193g = false;
        }
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: a */
    public AbstractC2533d mo11170a() {
        Object d = m10719d();
        if (d == null) {
            return null;
        }
        if (d instanceof AbstractC2533d) {
            return (AbstractC2533d) d;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public String toString() {
        return "Target for: " + this.f8189a;
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: a */
    public void mo11171a(AbstractC2533d dVar) {
        mo11174a((Object) dVar);
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: a */
    public void mo11175a(AbstractC2521i iVar) {
        this.f8190d.mo11190a(iVar);
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: b */
    public void mo11176b(AbstractC2521i iVar) {
        this.f8190d.mo11192b(iVar);
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: c */
    public void mo11172c(Drawable drawable) {
        super.mo11172c(drawable);
        m10717b();
    }

    /* renamed from: a */
    private void mo11174a(Object obj) {
        f8187b = true;
        this.f8189a.setTag(f8188c, obj);
    }

    public AbstractC2523k(T t) {
        this.f8189a = (T) ((View) C2567j.m10894a(t));
        this.f8190d = new C2524a(t);
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: a */
    public void mo11036a(Drawable drawable) {
        super.mo11036a(drawable);
        this.f8190d.mo11191b();
        if (!this.f8192f) {
            m10718c();
        }
    }
}
