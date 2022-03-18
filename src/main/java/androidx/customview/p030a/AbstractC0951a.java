package androidx.customview.p030a;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.C0525g;
import androidx.core.view.C0859a;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.C0862b;
import androidx.core.view.p029a.C0864d;
import androidx.core.view.p029a.C0869e;
import androidx.core.view.p029a.C0872f;
import androidx.customview.p030a.C0955b;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.customview.a.a */
public abstract class AbstractC0951a extends C0859a {

    /* renamed from: c */
    private static final Rect f3571c = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: l */
    private static final C0955b.AbstractC0956a<C0864d> f3572l = new C0955b.AbstractC0956a<C0864d>() {
        /* class androidx.customview.p030a.AbstractC0951a.C09521 */

        /* renamed from: a */
        public void mo4856a(C0864d dVar, Rect rect) {
            dVar.mo4553a(rect);
        }
    };

    /* renamed from: m */
    private static final C0955b.AbstractC0957b<C0525g<C0864d>, C0864d> f3573m = new C0955b.AbstractC0957b<C0525g<C0864d>, C0864d>() {
        /* class androidx.customview.p030a.AbstractC0951a.C09532 */

        /* renamed from: a */
        public int mo4858a(C0525g<C0864d> gVar) {
            return gVar.mo3049b();
        }

        /* renamed from: a */
        public C0864d mo4860a(C0525g<C0864d> gVar, int i) {
            return gVar.mo3057e(i);
        }
    };

    /* renamed from: a */
    int f3574a = Integer.MIN_VALUE;

    /* renamed from: b */
    int f3575b = Integer.MIN_VALUE;

    /* renamed from: d */
    private final Rect f3576d = new Rect();

    /* renamed from: e */
    private final Rect f3577e = new Rect();

    /* renamed from: f */
    private final Rect f3578f = new Rect();

    /* renamed from: g */
    private final int[] f3579g = new int[2];

    /* renamed from: h */
    private final AccessibilityManager f3580h;

    /* renamed from: i */
    private final View f3581i;

    /* renamed from: j */
    private C0954a f3582j;

    /* renamed from: k */
    private int f3583k = Integer.MIN_VALUE;

    /* renamed from: e */
    private static int m4580e(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo4835a(float f, float f2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4837a(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4838a(int i, C0864d dVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4839a(int i, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4840a(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4841a(C0864d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4842a(List<Integer> list);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo4851b(int i, int i2, Bundle bundle);

    /* renamed from: b */
    public final int mo4848b() {
        return this.f3574a;
    }

    /* renamed from: c */
    public final int mo4852c() {
        return this.f3575b;
    }

    /* renamed from: a */
    public final boolean mo4847a(MotionEvent motionEvent) {
        if (!this.f3580h.isEnabled() || !this.f3580h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int a = mo4835a(motionEvent.getX(), motionEvent.getY());
            m4583f(a);
            if (a != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.f3583k == Integer.MIN_VALUE) {
            return false;
        } else {
            m4583f(Integer.MIN_VALUE);
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo4846a(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int e = m4580e(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && m4575b(e, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m4581e();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return m4575b(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return m4575b(1, (Rect) null);
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void mo4843a(boolean z, int i, Rect rect) {
        int i2 = this.f3575b;
        if (i2 != Integer.MIN_VALUE) {
            mo4854d(i2);
        }
        if (z) {
            m4575b(i, rect);
        }
    }

    /* renamed from: a */
    public final boolean mo4844a(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f3580h.isEnabled() || (parent = this.f3581i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f3581i, m4576c(i, i2));
    }

    @Override // androidx.core.view.C0859a
    /* renamed from: a */
    public void mo4535a(View view, C0864d dVar) {
        super.mo4535a(view, dVar);
        mo4841a(dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4845a(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return m4577c(i, i2, bundle);
        }
        return m4573a(i2, bundle);
    }

    /* renamed from: d */
    private C0525g<C0864d> m4579d() {
        ArrayList arrayList = new ArrayList();
        mo4842a(arrayList);
        C0525g<C0864d> gVar = new C0525g<>();
        for (int i = 0; i < arrayList.size(); i++) {
            gVar.mo3051b(arrayList.get(i).intValue(), m4585h(arrayList.get(i).intValue()));
        }
        return gVar;
    }

    /* renamed from: e */
    private boolean m4581e() {
        int i = this.f3575b;
        if (i == Integer.MIN_VALUE || !mo4851b(i, 16, null)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private C0864d m4582f() {
        C0864d a = C0864d.m4170a(this.f3581i);
        ViewCompat.m4042a(this.f3581i, a);
        ArrayList arrayList = new ArrayList();
        mo4842a(arrayList);
        if (a.mo4570c() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                a.mo4565b(this.f3581i, ((Integer) arrayList.get(i)).intValue());
            }
            return a;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: androidx.customview.a.a$a */
    private class C0954a extends C0869e {
        C0954a() {
        }

        @Override // androidx.core.view.p029a.C0869e
        /* renamed from: a */
        public C0864d mo4629a(int i) {
            return C0864d.m4172a(AbstractC0951a.this.mo4849b(i));
        }

        @Override // androidx.core.view.p029a.C0869e
        /* renamed from: b */
        public C0864d mo4633b(int i) {
            int i2;
            if (i == 2) {
                i2 = AbstractC0951a.this.f3574a;
            } else {
                i2 = AbstractC0951a.this.f3575b;
            }
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo4629a(i2);
        }

        @Override // androidx.core.view.p029a.C0869e
        /* renamed from: a */
        public boolean mo4632a(int i, int i2, Bundle bundle) {
            return AbstractC0951a.this.mo4845a(i, i2, bundle);
        }
    }

    /* renamed from: g */
    private AccessibilityEvent m4584g(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f3581i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0864d mo4849b(int i) {
        if (i == -1) {
            return m4582f();
        }
        return m4585h(i);
    }

    /* renamed from: f */
    private void m4583f(int i) {
        int i2 = this.f3583k;
        if (i2 != i) {
            this.f3583k = i;
            mo4844a(i, SmActions.ACTION_ONTHECALL_EXIT);
            mo4844a(i2, DynamicModule.f58006b);
        }
    }

    /* renamed from: j */
    private boolean m4587j(int i) {
        if (this.f3574a != i) {
            return false;
        }
        this.f3574a = Integer.MIN_VALUE;
        this.f3581i.invalidate();
        mo4844a(i, 65536);
        return true;
    }

    @Override // androidx.core.view.C0859a
    /* renamed from: a */
    public C0869e mo4532a(View view) {
        if (this.f3582j == null) {
            this.f3582j = new C0954a();
        }
        return this.f3582j;
    }

    /* renamed from: d */
    public final boolean mo4854d(int i) {
        if (this.f3575b != i) {
            return false;
        }
        this.f3575b = Integer.MIN_VALUE;
        mo4839a(i, false);
        mo4844a(i, 8);
        return true;
    }

    /* renamed from: i */
    private boolean m4586i(int i) {
        int i2;
        if (!this.f3580h.isEnabled() || !this.f3580h.isTouchExplorationEnabled() || (i2 = this.f3574a) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m4587j(i2);
        }
        this.f3574a = i;
        this.f3581i.invalidate();
        mo4844a(i, 32768);
        return true;
    }

    public AbstractC0951a(View view) {
        if (view != null) {
            this.f3581i = view;
            this.f3580h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (ViewCompat.m4076f(view) == 0) {
                ViewCompat.m4069d(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: a */
    private boolean m4574a(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f3581i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f3581i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= BitmapDescriptorFactory.HUE_RED || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo4853c(int i) {
        int i2;
        if ((!this.f3581i.isFocused() && !this.f3581i.requestFocus()) || (i2 = this.f3575b) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo4854d(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f3575b = i;
        mo4839a(i, true);
        mo4844a(i, 8);
        return true;
    }

    /* renamed from: a */
    public final void mo4836a(int i) {
        mo4850b(i, 0);
    }

    /* renamed from: h */
    private C0864d m4585h(int i) {
        boolean z;
        C0864d b = C0864d.m4176b();
        b.mo4598j(true);
        b.mo4576c(true);
        b.mo4566b("android.view.View");
        Rect rect = f3571c;
        b.mo4563b(rect);
        b.mo4578d(rect);
        b.mo4579d(this.f3581i);
        mo4838a(i, b);
        if (b.mo4615t() == null && b.mo4617u() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        b.mo4553a(this.f3577e);
        if (!this.f3577e.equals(rect)) {
            int d = b.mo4577d();
            if ((d & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((d & SmActions.ACTION_ONTHECALL_EXIT) == 0) {
                b.mo4557a((CharSequence) this.f3581i.getContext().getPackageName());
                b.mo4554a(this.f3581i, i);
                if (this.f3574a == i) {
                    b.mo4586f(true);
                    b.mo4552a(SmActions.ACTION_ONTHECALL_EXIT);
                } else {
                    b.mo4586f(false);
                    b.mo4552a(64);
                }
                if (this.f3575b == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    b.mo4552a(2);
                } else if (b.mo4593h()) {
                    b.mo4552a(1);
                }
                b.mo4580d(z);
                this.f3581i.getLocationOnScreen(this.f3579g);
                b.mo4572c(this.f3576d);
                if (this.f3576d.equals(rect)) {
                    b.mo4553a(this.f3576d);
                    if (b.f3355a != -1) {
                        C0864d b2 = C0864d.m4176b();
                        for (int i2 = b.f3355a; i2 != -1; i2 = b2.f3355a) {
                            b2.mo4574c(this.f3581i, -1);
                            b2.mo4563b(f3571c);
                            mo4838a(i2, b2);
                            b2.mo4553a(this.f3577e);
                            this.f3576d.offset(this.f3577e.left, this.f3577e.top);
                        }
                        b2.mo4618v();
                    }
                    this.f3576d.offset(this.f3579g[0] - this.f3581i.getScrollX(), this.f3579g[1] - this.f3581i.getScrollY());
                }
                if (this.f3581i.getLocalVisibleRect(this.f3578f)) {
                    this.f3578f.offset(this.f3579g[0] - this.f3581i.getScrollX(), this.f3579g[1] - this.f3581i.getScrollY());
                    if (this.f3576d.intersect(this.f3578f)) {
                        b.mo4578d(this.f3576d);
                        if (m4574a(this.f3576d)) {
                            b.mo4583e(true);
                        }
                    }
                }
                return b;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: a */
    private void m4572a(int i, Rect rect) {
        mo4849b(i).mo4553a(rect);
    }

    @Override // androidx.core.view.C0859a
    /* renamed from: d */
    public void mo4540d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo4540d(view, accessibilityEvent);
        mo4840a(accessibilityEvent);
    }

    /* renamed from: a */
    private boolean m4573a(int i, Bundle bundle) {
        return ViewCompat.m4052a(this.f3581i, i, bundle);
    }

    /* renamed from: c */
    private AccessibilityEvent m4576c(int i, int i2) {
        if (i != -1) {
            return m4578d(i, i2);
        }
        return m4584g(i2);
    }

    /* renamed from: b */
    public final void mo4850b(int i, int i2) {
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.f3580h.isEnabled() && (parent = this.f3581i.getParent()) != null) {
            AccessibilityEvent c = m4576c(i, 2048);
            C0862b.m4165a(c, i2);
            parent.requestSendAccessibilityEvent(this.f3581i, c);
        }
    }

    /* renamed from: b */
    private boolean m4575b(int i, Rect rect) {
        C0864d dVar;
        C0864d dVar2;
        boolean z;
        C0525g<C0864d> d = m4579d();
        int i2 = this.f3575b;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            dVar = null;
        } else {
            dVar = d.mo3047a(i2);
        }
        if (i == 1 || i == 2) {
            if (ViewCompat.m4082h(this.f3581i) == 1) {
                z = true;
            } else {
                z = false;
            }
            dVar2 = (C0864d) C0955b.m4621a(d, f3573m, f3572l, dVar, i, z, false);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i4 = this.f3575b;
            if (i4 != Integer.MIN_VALUE) {
                m4572a(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m4571a(this.f3581i, i, rect2);
            }
            dVar2 = (C0864d) C0955b.m4622a(d, f3573m, f3572l, dVar, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (dVar2 != null) {
            i3 = d.mo3056d(d.mo3045a(dVar2));
        }
        return mo4853c(i3);
    }

    /* renamed from: d */
    private AccessibilityEvent m4578d(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C0864d b = mo4849b(i);
        obtain.getText().add(b.mo4615t());
        obtain.setContentDescription(b.mo4617u());
        obtain.setScrollable(b.mo4612q());
        obtain.setPassword(b.mo4611p());
        obtain.setEnabled(b.mo4609o());
        obtain.setChecked(b.mo4590g());
        mo4837a(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(b.mo4614s());
            C0872f.m4266a(obtain, this.f3581i, i);
            obtain.setPackageName(this.f3581i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: a */
    private static Rect m4571a(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: c */
    private boolean m4577c(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return mo4853c(i);
        }
        if (i2 == 2) {
            return mo4854d(i);
        }
        if (i2 == 64) {
            return m4586i(i);
        }
        if (i2 != 128) {
            return mo4851b(i, i2, bundle);
        }
        return m4587j(i);
    }
}
