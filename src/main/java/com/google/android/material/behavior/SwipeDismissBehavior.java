package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.AbstractC0873g;
import androidx.core.view.p029a.C0864d;
import androidx.customview.p030a.C0959c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    C0959c f53901a;

    /* renamed from: b */
    AbstractC22147a f53902b;

    /* renamed from: c */
    int f53903c = 2;

    /* renamed from: d */
    float f53904d = 0.5f;

    /* renamed from: e */
    float f53905e;

    /* renamed from: f */
    float f53906f = 0.5f;

    /* renamed from: g */
    private boolean f53907g;

    /* renamed from: h */
    private float f53908h;

    /* renamed from: i */
    private boolean f53909i;

    /* renamed from: j */
    private final C0959c.AbstractC0962a f53910j = new C0959c.AbstractC0962a() {
        /* class com.google.android.material.behavior.SwipeDismissBehavior.C221451 */

        /* renamed from: b */
        private int f53912b;

        /* renamed from: c */
        private int f53913c = -1;

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public int mo4889a(View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4891a(int i) {
            if (SwipeDismissBehavior.this.f53902b != null) {
                SwipeDismissBehavior.this.f53902b.mo76524a(i);
            }
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4894a(View view, int i) {
            this.f53913c = i;
            this.f53912b = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: b */
        public boolean mo4900b(View view, int i) {
            int i2 = this.f53913c;
            if ((i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo76522a(view)) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0027 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0038 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m79846a(android.view.View r7, float r8) {
            /*
                r6 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x003a
                int r7 = androidx.core.view.ViewCompat.m4082h(r7)
                if (r7 != r2) goto L_0x000f
                r7 = 1
                goto L_0x0010
            L_0x000f:
                r7 = 0
            L_0x0010:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f53903c
                r5 = 2
                if (r4 != r5) goto L_0x0018
                return r2
            L_0x0018:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f53903c
                if (r4 != 0) goto L_0x0029
                if (r7 == 0) goto L_0x0025
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0028
                goto L_0x0027
            L_0x0025:
                if (r3 <= 0) goto L_0x0028
            L_0x0027:
                r1 = 1
            L_0x0028:
                return r1
            L_0x0029:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f53903c
                if (r4 != r2) goto L_0x0039
                if (r7 == 0) goto L_0x0034
                if (r3 <= 0) goto L_0x0039
                goto L_0x0038
            L_0x0034:
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0039
            L_0x0038:
                r1 = 1
            L_0x0039:
                return r1
            L_0x003a:
                int r8 = r7.getLeft()
                int r0 = r6.f53912b
                int r8 = r8 - r0
                int r7 = r7.getWidth()
                float r7 = (float) r7
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r0 = r0.f53904d
                float r7 = r7 * r0
                int r7 = java.lang.Math.round(r7)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r7) goto L_0x0057
                r1 = 1
            L_0x0057:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C221451.m79846a(android.view.View, float):boolean");
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: b */
        public int mo4897b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public int mo4890a(View view, int i, int i2) {
            boolean z;
            int i3;
            int i4;
            int width;
            if (ViewCompat.m4082h(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (SwipeDismissBehavior.this.f53903c != 0) {
                if (SwipeDismissBehavior.this.f53903c != 1) {
                    i3 = this.f53912b - view.getWidth();
                    i4 = view.getWidth() + this.f53912b;
                } else if (z) {
                    i3 = this.f53912b;
                    width = view.getWidth();
                } else {
                    i3 = this.f53912b - view.getWidth();
                    i4 = this.f53912b;
                }
                return SwipeDismissBehavior.m79837a(i3, i, i4);
            } else if (z) {
                i3 = this.f53912b - view.getWidth();
                i4 = this.f53912b;
                return SwipeDismissBehavior.m79837a(i3, i, i4);
            } else {
                i3 = this.f53912b;
                width = view.getWidth();
            }
            i4 = width + i3;
            return SwipeDismissBehavior.m79837a(i3, i, i4);
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4893a(View view, float f, float f2) {
            boolean z;
            int i;
            this.f53913c = -1;
            int width = view.getWidth();
            if (m79846a(view, f)) {
                int left = view.getLeft();
                int i2 = this.f53912b;
                if (left < i2) {
                    i = i2 - width;
                } else {
                    i = i2 + width;
                }
                z = true;
            } else {
                i = this.f53912b;
                z = false;
            }
            if (SwipeDismissBehavior.this.f53901a.mo4866a(i, view.getTop())) {
                ViewCompat.m4046a(view, new RunnableC22148b(view, z));
            } else if (z && SwipeDismissBehavior.this.f53902b != null) {
                SwipeDismissBehavior.this.f53902b.mo76525a(view);
            }
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4895a(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f53912b) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f53905e);
            float width2 = ((float) this.f53912b) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f53906f);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
            } else {
                view.setAlpha(SwipeDismissBehavior.m79836a((float) BitmapDescriptorFactory.HUE_RED, 1.0f - SwipeDismissBehavior.m79839b(width, width2, f), 1.0f));
            }
        }
    };

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    public interface AbstractC22147a {
        /* renamed from: a */
        void mo76524a(int i);

        /* renamed from: a */
        void mo76525a(View view);
    }

    /* renamed from: b */
    static float m79839b(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: a */
    public boolean mo76522a(View view) {
        return true;
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    private class RunnableC22148b implements Runnable {

        /* renamed from: b */
        private final View f53916b;

        /* renamed from: c */
        private final boolean f53917c;

        public void run() {
            if (SwipeDismissBehavior.this.f53901a != null && SwipeDismissBehavior.this.f53901a.mo4869a(true)) {
                ViewCompat.m4046a(this.f53916b, this);
            } else if (this.f53917c && SwipeDismissBehavior.this.f53902b != null) {
                SwipeDismissBehavior.this.f53902b.mo76525a(this.f53916b);
            }
        }

        RunnableC22148b(View view, boolean z) {
            this.f53916b = view;
            this.f53917c = z;
        }
    }

    /* renamed from: a */
    public void mo76520a(int i) {
        this.f53903c = i;
    }

    /* renamed from: a */
    public void mo76521a(AbstractC22147a aVar) {
        this.f53902b = aVar;
    }

    /* renamed from: b */
    public void mo76523b(float f) {
        this.f53906f = m79836a((float) BitmapDescriptorFactory.HUE_RED, f, 1.0f);
    }

    /* renamed from: b */
    private void m79840b(View view) {
        ViewCompat.m4075e(view, 1048576);
        if (mo76522a(view)) {
            ViewCompat.m4041a(view, C0864d.C0865a.f3389u, null, new AbstractC0873g() {
                /* class com.google.android.material.behavior.SwipeDismissBehavior.C221462 */

                @Override // androidx.core.view.p029a.AbstractC0873g
                /* renamed from: a */
                public boolean mo4640a(View view, AbstractC0873g.AbstractC0874a aVar) {
                    boolean z;
                    boolean z2 = false;
                    if (!SwipeDismissBehavior.this.mo76522a(view)) {
                        return false;
                    }
                    if (ViewCompat.m4082h(view) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((SwipeDismissBehavior.this.f53903c == 0 && z) || (SwipeDismissBehavior.this.f53903c == 1 && !z)) {
                        z2 = true;
                    }
                    int width = view.getWidth();
                    if (z2) {
                        width = -width;
                    }
                    ViewCompat.m4089j(view, width);
                    view.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    if (SwipeDismissBehavior.this.f53902b != null) {
                        SwipeDismissBehavior.this.f53902b.mo76525a(view);
                    }
                    return true;
                }
            });
        }
    }

    /* renamed from: a */
    private void m79838a(ViewGroup viewGroup) {
        C0959c cVar;
        if (this.f53901a == null) {
            if (this.f53909i) {
                cVar = C0959c.m4641a(viewGroup, this.f53908h, this.f53910j);
            } else {
                cVar = C0959c.m4642a(viewGroup, this.f53910j);
            }
            this.f53901a = cVar;
        }
    }

    /* renamed from: a */
    public void mo76519a(float f) {
        this.f53905e = m79836a((float) BitmapDescriptorFactory.HUE_RED, f, 1.0f);
    }

    /* renamed from: a */
    static float m79836a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0959c cVar = this.f53901a;
        if (cVar == null) {
            return false;
        }
        cVar.mo4872b(motionEvent);
        return true;
    }

    /* renamed from: a */
    static int m79837a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v, i);
        if (ViewCompat.m4076f(v) == 0) {
            ViewCompat.m4069d((View) v, 1);
            m79840b(v);
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f53907g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.mo3944a(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f53907g = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f53907g = false;
        }
        if (!z) {
            return false;
        }
        m79838a((ViewGroup) coordinatorLayout);
        return this.f53901a.mo4867a(motionEvent);
    }
}
