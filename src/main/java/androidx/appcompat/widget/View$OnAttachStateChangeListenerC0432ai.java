package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C0917s;
import androidx.core.view.ViewCompat;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.ai */
public class View$OnAttachStateChangeListenerC0432ai implements View.OnAttachStateChangeListener, View.OnHoverListener, View.OnLongClickListener {

    /* renamed from: j */
    private static View$OnAttachStateChangeListenerC0432ai f1571j;

    /* renamed from: k */
    private static View$OnAttachStateChangeListenerC0432ai f1572k;

    /* renamed from: a */
    private final View f1573a;

    /* renamed from: b */
    private final CharSequence f1574b;

    /* renamed from: c */
    private final int f1575c;

    /* renamed from: d */
    private final Runnable f1576d = new Runnable() {
        /* class androidx.appcompat.widget.View$OnAttachStateChangeListenerC0432ai.RunnableC04331 */

        public void run() {
            View$OnAttachStateChangeListenerC0432ai.this.mo2533a(false);
        }
    };

    /* renamed from: e */
    private final Runnable f1577e = new Runnable() {
        /* class androidx.appcompat.widget.View$OnAttachStateChangeListenerC0432ai.RunnableC04342 */

        public void run() {
            View$OnAttachStateChangeListenerC0432ai.this.mo2532a();
        }
    };

    /* renamed from: f */
    private int f1578f;

    /* renamed from: g */
    private int f1579g;

    /* renamed from: h */
    private aj f1580h;

    /* renamed from: i */
    private boolean f1581i;

    public void onViewAttachedToWindow(View view) {
    }

    /* renamed from: c */
    private void m1850c() {
        this.f1573a.removeCallbacks(this.f1576d);
    }

    /* renamed from: d */
    private void m1851d() {
        this.f1578f = Integer.MAX_VALUE;
        this.f1579g = Integer.MAX_VALUE;
    }

    /* renamed from: b */
    private void m1849b() {
        this.f1573a.postDelayed(this.f1576d, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2532a() {
        if (f1572k == this) {
            f1572k = null;
            aj ajVar = this.f1580h;
            if (ajVar != null) {
                ajVar.mo2540a();
                this.f1580h = null;
                m1851d();
                this.f1573a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1571j == this) {
            m1847a((View$OnAttachStateChangeListenerC0432ai) null);
        }
        this.f1573a.removeCallbacks(this.f1577e);
    }

    public void onViewDetachedFromWindow(View view) {
        mo2532a();
    }

    /* renamed from: a */
    private static void m1847a(View$OnAttachStateChangeListenerC0432ai aiVar) {
        View$OnAttachStateChangeListenerC0432ai aiVar2 = f1571j;
        if (aiVar2 != null) {
            aiVar2.m1850c();
        }
        f1571j = aiVar;
        if (aiVar != null) {
            aiVar.m1849b();
        }
    }

    public boolean onLongClick(View view) {
        this.f1578f = view.getWidth() / 2;
        this.f1579g = view.getHeight() / 2;
        mo2533a(true);
        return true;
    }

    /* renamed from: a */
    private boolean m1848a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f1578f) <= this.f1575c && Math.abs(y - this.f1579g) <= this.f1575c) {
            return false;
        }
        this.f1578f = x;
        this.f1579g = y;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2533a(boolean z) {
        long j;
        int i;
        long j2;
        if (ViewCompat.m4015I(this.f1573a)) {
            m1847a((View$OnAttachStateChangeListenerC0432ai) null);
            View$OnAttachStateChangeListenerC0432ai aiVar = f1572k;
            if (aiVar != null) {
                aiVar.mo2532a();
            }
            f1572k = this;
            this.f1581i = z;
            aj ajVar = new aj(this.f1573a.getContext());
            this.f1580h = ajVar;
            ajVar.mo2541a(this.f1573a, this.f1578f, this.f1579g, this.f1581i, this.f1574b);
            this.f1573a.addOnAttachStateChangeListener(this);
            if (this.f1581i) {
                j = 2500;
            } else {
                if ((ViewCompat.m4107v(this.f1573a) & 1) == 1) {
                    j2 = 3000;
                    i = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    i = ViewConfiguration.getLongPressTimeout();
                }
                j = j2 - ((long) i);
            }
            this.f1573a.removeCallbacks(this.f1577e);
            this.f1573a.postDelayed(this.f1577e, j);
        }
    }

    private View$OnAttachStateChangeListenerC0432ai(View view, CharSequence charSequence) {
        this.f1573a = view;
        this.f1574b = charSequence;
        this.f1575c = C0917s.m4406a(ViewConfiguration.get(view.getContext()));
        m1851d();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: a */
    public static void m1846a(View view, CharSequence charSequence) {
        View$OnAttachStateChangeListenerC0432ai aiVar = f1571j;
        if (aiVar != null && aiVar.f1573a == view) {
            m1847a((View$OnAttachStateChangeListenerC0432ai) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            View$OnAttachStateChangeListenerC0432ai aiVar2 = f1572k;
            if (aiVar2 != null && aiVar2.f1573a == view) {
                aiVar2.mo2532a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new View$OnAttachStateChangeListenerC0432ai(view, charSequence);
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1580h != null && this.f1581i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1573a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m1851d();
                mo2532a();
            }
        } else if (this.f1573a.isEnabled() && this.f1580h == null && m1848a(motionEvent)) {
            m1847a(this);
        }
        return false;
    }
}
