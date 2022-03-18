package androidx.transition;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import com.larksuite.suite.R;

/* access modifiers changed from: package-private */
/* renamed from: androidx.transition.i */
public class C1541i extends ViewGroup implements AbstractC1538f {

    /* renamed from: a */
    ViewGroup f5409a;

    /* renamed from: b */
    View f5410b;

    /* renamed from: c */
    final View f5411c;

    /* renamed from: d */
    int f5412d;

    /* renamed from: e */
    private Matrix f5413e;

    /* renamed from: f */
    private final ViewTreeObserver.OnPreDrawListener f5414f = new ViewTreeObserver.OnPreDrawListener() {
        /* class androidx.transition.C1541i.ViewTreeObserver$OnPreDrawListenerC15421 */

        public boolean onPreDraw() {
            ViewCompat.m4073e(C1541i.this);
            if (C1541i.this.f5409a == null || C1541i.this.f5410b == null) {
                return true;
            }
            C1541i.this.f5409a.endViewTransition(C1541i.this.f5410b);
            ViewCompat.m4073e(C1541i.this.f5409a);
            C1541i.this.f5409a = null;
            C1541i.this.f5410b = null;
            return true;
        }
    };

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m7096a(this.f5411c, this);
        this.f5411c.getViewTreeObserver().addOnPreDrawListener(this.f5414f);
        aj.m6997a(this.f5411c, 4);
        if (this.f5411c.getParent() != null) {
            ((View) this.f5411c.getParent()).invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f5411c.getViewTreeObserver().removeOnPreDrawListener(this.f5414f);
        aj.m6997a(this.f5411c, 0);
        m7096a(this.f5411c, (C1541i) null);
        if (this.f5411c.getParent() != null) {
            ((View) this.f5411c.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8007a(Matrix matrix) {
        this.f5413e = matrix;
    }

    /* renamed from: a */
    static C1541i m7093a(View view) {
        return (C1541i) view.getTag(R.id.ghost_view);
    }

    C1541i(View view) {
        super(view.getContext());
        this.f5411c = view;
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    /* renamed from: b */
    static void m7098b(View view) {
        C1541i a = m7093a(view);
        if (a != null) {
            int i = a.f5412d - 1;
            a.f5412d = i;
            if (i <= 0) {
                ((C1539g) a.getParent()).removeView(a);
            }
        }
    }

    @Override // androidx.transition.AbstractC1538f
    public void setVisibility(int i) {
        int i2;
        super.setVisibility(i);
        if (m7093a(this.f5411c) == this) {
            if (i == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            aj.m6997a(this.f5411c, i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C1528b.m7042a(canvas, true);
        canvas.setMatrix(this.f5413e);
        aj.m6997a(this.f5411c, 0);
        this.f5411c.invalidate();
        aj.m6997a(this.f5411c, 4);
        drawChild(canvas, this.f5411c, getDrawingTime());
        C1528b.m7042a(canvas, false);
    }

    /* renamed from: a */
    static void m7096a(View view, C1541i iVar) {
        view.setTag(R.id.ghost_view, iVar);
    }

    /* renamed from: a */
    static void m7094a(View view, View view2) {
        aj.m6998a(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    @Override // androidx.transition.AbstractC1538f
    /* renamed from: a */
    public void mo8001a(ViewGroup viewGroup, View view) {
        this.f5409a = viewGroup;
        this.f5410b = view;
    }

    /* renamed from: a */
    static void m7095a(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        aj.m6999a(viewGroup2, matrix);
        matrix.preTranslate((float) (-viewGroup2.getScrollX()), (float) (-viewGroup2.getScrollY()));
        aj.m7001b(viewGroup, matrix);
    }

    /* renamed from: b */
    static C1541i m7097b(View view, ViewGroup viewGroup, Matrix matrix) {
        C1539g gVar;
        if (view.getParent() instanceof ViewGroup) {
            C1539g a = C1539g.m7081a(viewGroup);
            C1541i a2 = m7093a(view);
            int i = 0;
            if (!(a2 == null || (gVar = (C1539g) a2.getParent()) == a)) {
                i = a2.f5412d;
                gVar.removeView(a2);
                a2 = null;
            }
            if (a2 == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    m7095a(view, viewGroup, matrix);
                }
                a2 = new C1541i(view);
                a2.mo8007a(matrix);
                if (a == null) {
                    a = new C1539g(viewGroup);
                } else {
                    a.mo8003a();
                }
                m7094a((View) viewGroup, (View) a);
                m7094a((View) viewGroup, (View) a2);
                a.mo8004a(a2);
                a2.f5412d = i;
            } else if (matrix != null) {
                a2.mo8007a(matrix);
            }
            a2.f5412d++;
            return a2;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }
}
