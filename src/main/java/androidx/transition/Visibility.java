package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.C0767f;
import androidx.transition.C1511a;
import androidx.transition.Transition;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

public abstract class Visibility extends Transition {

    /* renamed from: a */
    private static final String[] f5316a = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: i */
    private int f5317i = 3;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    /* renamed from: a */
    public Animator mo7869a(ViewGroup viewGroup, View view, C1562y yVar, C1562y yVar2) {
        return null;
    }

    /* renamed from: b */
    public Animator mo7870b(ViewGroup viewGroup, View view, C1562y yVar, C1562y yVar2) {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.transition.Visibility$b */
    public static class C1510b {

        /* renamed from: a */
        boolean f5328a;

        /* renamed from: b */
        boolean f5329b;

        /* renamed from: c */
        int f5330c;

        /* renamed from: d */
        int f5331d;

        /* renamed from: e */
        ViewGroup f5332e;

        /* renamed from: f */
        ViewGroup f5333f;

        C1510b() {
        }
    }

    /* renamed from: s */
    public int mo7944s() {
        return this.f5317i;
    }

    public Visibility() {
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public String[] mo7809a() {
        return f5316a;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.transition.Visibility$a */
    public static class C1509a extends AnimatorListenerAdapter implements Transition.AbstractC1505d, C1511a.AbstractC1512a {

        /* renamed from: a */
        boolean f5322a;

        /* renamed from: b */
        private final View f5323b;

        /* renamed from: c */
        private final int f5324c;

        /* renamed from: d */
        private final ViewGroup f5325d;

        /* renamed from: e */
        private final boolean f5326e;

        /* renamed from: f */
        private boolean f5327f;

        @Override // androidx.transition.Transition.AbstractC1505d
        /* renamed from: a */
        public void mo7815a(Transition transition) {
        }

        @Override // androidx.transition.Transition.AbstractC1505d
        /* renamed from: e */
        public void mo7931e(Transition transition) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        /* renamed from: a */
        private void m6949a() {
            if (!this.f5322a) {
                aj.m6997a(this.f5323b, this.f5324c);
                ViewGroup viewGroup = this.f5325d;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m6950a(false);
        }

        public void onAnimationCancel(Animator animator) {
            this.f5322a = true;
        }

        public void onAnimationEnd(Animator animator) {
            m6949a();
        }

        @Override // androidx.transition.Transition.AbstractC1505d
        /* renamed from: b */
        public void mo7816b(Transition transition) {
            m6949a();
            transition.mo7898b(this);
        }

        @Override // androidx.transition.Transition.AbstractC1505d
        /* renamed from: c */
        public void mo7817c(Transition transition) {
            m6950a(false);
        }

        @Override // androidx.transition.Transition.AbstractC1505d
        /* renamed from: d */
        public void mo7818d(Transition transition) {
            m6950a(true);
        }

        @Override // androidx.transition.C1511a.AbstractC1512a
        public void onAnimationPause(Animator animator) {
            if (!this.f5322a) {
                aj.m6997a(this.f5323b, this.f5324c);
            }
        }

        @Override // androidx.transition.C1511a.AbstractC1512a
        public void onAnimationResume(Animator animator) {
            if (!this.f5322a) {
                aj.m6997a(this.f5323b, 0);
            }
        }

        /* renamed from: a */
        private void m6950a(boolean z) {
            ViewGroup viewGroup;
            if (this.f5326e && this.f5327f != z && (viewGroup = this.f5325d) != null) {
                this.f5327f = z;
                C1518ae.m6976a(viewGroup, z);
            }
        }

        C1509a(View view, int i, boolean z) {
            this.f5323b = view;
            this.f5324c = i;
            this.f5325d = (ViewGroup) view.getParent();
            this.f5326e = z;
            m6950a(true);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public void mo7807a(C1562y yVar) {
        m6934d(yVar);
    }

    @Override // androidx.transition.Transition
    /* renamed from: b */
    public void mo7810b(C1562y yVar) {
        m6934d(yVar);
    }

    /* renamed from: c */
    public void mo7947c(int i) {
        if ((i & -4) == 0) {
            this.f5317i = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: d */
    private void m6934d(C1562y yVar) {
        yVar.f5458a.put("android:visibility:visibility", Integer.valueOf(yVar.f5459b.getVisibility()));
        yVar.f5458a.put("android:visibility:parent", yVar.f5459b.getParent());
        int[] iArr = new int[2];
        yVar.f5459b.getLocationOnScreen(iArr);
        yVar.f5458a.put("android:visibility:screenLocation", iArr);
    }

    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1553s.f5435e);
        int a = C0767f.m3693a(obtainStyledAttributes, (XmlPullParser) ((XmlResourceParser) attributeSet), "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (a != 0) {
            mo7947c(a);
        }
    }

    /* renamed from: b */
    private C1510b m6933b(C1562y yVar, C1562y yVar2) {
        C1510b bVar = new C1510b();
        bVar.f5328a = false;
        bVar.f5329b = false;
        if (yVar == null || !yVar.f5458a.containsKey("android:visibility:visibility")) {
            bVar.f5330c = -1;
            bVar.f5332e = null;
        } else {
            bVar.f5330c = ((Integer) yVar.f5458a.get("android:visibility:visibility")).intValue();
            bVar.f5332e = (ViewGroup) yVar.f5458a.get("android:visibility:parent");
        }
        if (yVar2 == null || !yVar2.f5458a.containsKey("android:visibility:visibility")) {
            bVar.f5331d = -1;
            bVar.f5333f = null;
        } else {
            bVar.f5331d = ((Integer) yVar2.f5458a.get("android:visibility:visibility")).intValue();
            bVar.f5333f = (ViewGroup) yVar2.f5458a.get("android:visibility:parent");
        }
        if (yVar == null || yVar2 == null) {
            if (yVar == null && bVar.f5331d == 0) {
                bVar.f5329b = true;
                bVar.f5328a = true;
            } else if (yVar2 == null && bVar.f5330c == 0) {
                bVar.f5329b = false;
                bVar.f5328a = true;
            }
        } else if (bVar.f5330c == bVar.f5331d && bVar.f5332e == bVar.f5333f) {
            return bVar;
        } else {
            if (bVar.f5330c != bVar.f5331d) {
                if (bVar.f5330c == 0) {
                    bVar.f5329b = false;
                    bVar.f5328a = true;
                } else if (bVar.f5331d == 0) {
                    bVar.f5329b = true;
                    bVar.f5328a = true;
                }
            } else if (bVar.f5333f == null) {
                bVar.f5329b = false;
                bVar.f5328a = true;
            } else if (bVar.f5332e == null) {
                bVar.f5329b = true;
                bVar.f5328a = true;
            }
        }
        return bVar;
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public boolean mo7894a(C1562y yVar, C1562y yVar2) {
        if (yVar == null && yVar2 == null) {
            return false;
        }
        if (yVar != null && yVar2 != null && yVar2.f5458a.containsKey("android:visibility:visibility") != yVar.f5458a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C1510b b = m6933b(yVar, yVar2);
        if (!b.f5328a) {
            return false;
        }
        if (b.f5330c == 0 || b.f5331d == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public Animator mo7806a(ViewGroup viewGroup, C1562y yVar, C1562y yVar2) {
        C1510b b = m6933b(yVar, yVar2);
        if (!b.f5328a) {
            return null;
        }
        if (b.f5332e == null && b.f5333f == null) {
            return null;
        }
        if (b.f5329b) {
            return mo7945a(viewGroup, yVar, b.f5330c, yVar2, b.f5331d);
        }
        return mo7946b(viewGroup, yVar, b.f5330c, yVar2, b.f5331d);
    }

    /* renamed from: a */
    public Animator mo7945a(ViewGroup viewGroup, C1562y yVar, int i, C1562y yVar2, int i2) {
        if ((this.f5317i & 1) != 1 || yVar2 == null) {
            return null;
        }
        if (yVar == null) {
            View view = (View) yVar2.f5459b.getParent();
            if (m6933b(mo7899b(view, false), mo7885a(view, false)).f5328a) {
                return null;
            }
        }
        return mo7869a(viewGroup, yVar2.f5459b, yVar, yVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (r17.f5280f != false) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo7946b(final android.view.ViewGroup r18, androidx.transition.C1562y r19, int r20, androidx.transition.C1562y r21, int r22) {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.mo7946b(android.view.ViewGroup, androidx.transition.y, int, androidx.transition.y, int):android.animation.Animator");
    }
}
