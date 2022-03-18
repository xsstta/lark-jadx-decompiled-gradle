package com.lynx.tasm.animation.p1218b;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.p1216a.C26546b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.lynx.tasm.animation.b.c */
public class C26575c {

    /* renamed from: a */
    public boolean f65733a = false;

    /* renamed from: b */
    private WeakReference<LynxUI> f65734b;

    /* renamed from: c */
    private int f65735c;

    /* renamed from: d */
    private int f65736d;

    /* renamed from: e */
    private int f65737e;

    /* renamed from: f */
    private int f65738f;

    /* renamed from: g */
    private int f65739g;

    /* renamed from: h */
    private int f65740h;

    /* renamed from: i */
    private int f65741i;

    /* renamed from: j */
    private int f65742j;

    /* renamed from: k */
    private int f65743k;

    /* renamed from: l */
    private int f65744l;

    /* renamed from: m */
    private int f65745m;

    /* renamed from: n */
    private int f65746n;

    /* renamed from: o */
    private int f65747o;

    /* renamed from: p */
    private int f65748p;

    /* renamed from: q */
    private int f65749q;

    /* renamed from: r */
    private int f65750r;

    /* renamed from: s */
    private Rect f65751s;

    /* renamed from: t */
    private AbstractC26573a f65752t;

    /* renamed from: u */
    private AbstractC26573a f65753u;

    /* renamed from: v */
    private AbstractC26573a f65754v;

    /* renamed from: w */
    private final SparseArray<AbstractC26580f> f65755w = new SparseArray<>(0);

    /* renamed from: x */
    private float f65756x = -1.0f;

    /* renamed from: b */
    public SparseArray<AbstractC26580f> mo94442b() {
        return this.f65755w;
    }

    /* renamed from: com.lynx.tasm.animation.b.c$b */
    private static class C26577b {

        /* renamed from: a */
        private static Map<String, Object> f65759a;

        static {
            HashMap hashMap = new HashMap();
            f65759a = hashMap;
            hashMap.put("animation_type", "");
        }

        /* renamed from: a */
        public static void m96378a(LynxUI lynxUI, String str, String str2) {
            if (lynxUI != null && lynxUI.mo94578s() != null && lynxUI.mo94578s().containsKey(str)) {
                f65759a.put("animation_type", str2);
                lynxUI.mo95039u().mo94687i().mo94075a(new C26546b(lynxUI.mo94576q(), str, f65759a));
            }
        }
    }

    /* renamed from: a */
    public LynxUI mo94438a() {
        WeakReference<LynxUI> weakReference = this.f65734b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: d */
    public AbstractC26573a mo94444d() {
        if (this.f65752t == null) {
            this.f65752t = new C26578d();
        }
        return this.f65752t;
    }

    /* renamed from: e */
    public AbstractC26573a mo94445e() {
        if (this.f65753u == null) {
            this.f65753u = new C26581g();
        }
        return this.f65753u;
    }

    /* renamed from: f */
    public AbstractC26573a mo94446f() {
        if (this.f65754v == null) {
            this.f65754v = new C26579e();
        }
        return this.f65754v;
    }

    /* renamed from: g */
    public boolean mo94447g() {
        AbstractC26573a aVar;
        AbstractC26573a aVar2;
        AbstractC26573a aVar3 = this.f65752t;
        if ((aVar3 == null || !aVar3.mo94434a()) && (((aVar = this.f65754v) == null || !aVar.mo94434a()) && ((aVar2 = this.f65753u) == null || !aVar2.mo94434a()))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo94443c() {
        WeakReference<LynxUI> weakReference = this.f65734b;
        if (weakReference != null && weakReference.get() != null) {
            this.f65734b.get().mo53590a(this.f65735c, this.f65736d, this.f65737e, this.f65738f, this.f65739g, this.f65740h, this.f65741i, this.f65742j, this.f65747o, this.f65748p, this.f65749q, this.f65750r, this.f65743k, this.f65744l, this.f65745m, this.f65746n, this.f65751s);
        }
    }

    /* renamed from: a */
    public void mo94439a(float f) {
        this.f65756x = f;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.animation.b.c$a  reason: invalid class name */
    public static class animationAnimation$AnimationListenerC26576a implements Animation.AnimationListener {

        /* renamed from: a */
        private WeakReference<C26575c> f65757a;

        /* renamed from: b */
        private String f65758b;

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationEnd(Animation animation) {
            LynxUI a;
            C26575c cVar = this.f65757a.get();
            if (cVar != null && (a = cVar.mo94438a()) != null) {
                View av = a.av();
                C26577b.m96378a(a, "animationend", this.f65758b);
                String str = this.f65758b;
                if (str == "layout-animation-create" || str == "layout-animation-update") {
                    if (animation instanceof AbstractC26580f) {
                        cVar.mo94442b().remove(a.mo94576q());
                    } else if ((animation instanceof C26582h) && cVar.f65733a) {
                        av.setLayerType(0, null);
                        cVar.f65733a = false;
                    }
                } else if (str == "layout-animation-delete") {
                    if ((animation instanceof C26582h) && cVar.f65733a) {
                        av.setLayerType(0, null);
                        cVar.f65733a = false;
                    }
                    a.mo53590a(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, new Rect());
                }
            }
        }

        public void onAnimationStart(Animation animation) {
            LynxUI a;
            C26575c cVar = this.f65757a.get();
            if (cVar != null && (a = cVar.mo94438a()) != null) {
                View av = a.av();
                C26577b.m96378a(a, "animationstart", this.f65758b);
                String str = this.f65758b;
                if (str == "layout-animation-create" || str == "layout-animation-update") {
                    if (animation instanceof AbstractC26580f) {
                        cVar.mo94442b().put(a.mo94576q(), (AbstractC26580f) animation);
                    } else if ((animation instanceof C26582h) && av.getLayerType() == 0) {
                        cVar.f65733a = true;
                        av.setLayerType(2, null);
                    }
                } else if (str == "layout-animation-delete" && (animation instanceof C26582h) && av.getLayerType() == 0) {
                    cVar.f65733a = true;
                    av.setLayerType(2, null);
                }
            }
        }

        public animationAnimation$AnimationListenerC26576a(C26575c cVar, String str) {
            this.f65757a = new WeakReference<>(cVar);
            this.f65758b = str;
        }
    }

    /* renamed from: a */
    public void mo94440a(LynxUI lynxUI) {
        View av = lynxUI.av();
        this.f65734b = new WeakReference<>(lynxUI);
        Animation b = this.f65754v.mo94435b(lynxUI, av.getLeft(), av.getTop(), av.getWidth(), av.getHeight(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, new Rect(), this.f65756x);
        if (b == null) {
            lynxUI.mo53590a(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, new Rect());
            return;
        }
        b.setAnimationListener(new animationAnimation$AnimationListenerC26576a(this, "layout-animation-delete"));
        av.startAnimation(b);
    }

    /* renamed from: a */
    public void mo94441a(LynxUI lynxUI, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        AbstractC26573a aVar;
        View av = lynxUI.av();
        if (this.f65756x == -1.0f) {
            this.f65756x = av.getAlpha();
        }
        AbstractC26580f fVar = this.f65755w.get(lynxUI.mo94576q());
        if (fVar != null) {
            fVar.mo94451a(i, i2, i3, i4);
            return;
        }
        if (lynxUI.mo94937T() == 0 && lynxUI.mo94938U() == 0) {
            aVar = this.f65752t;
        } else {
            aVar = this.f65753u;
        }
        Animation animation = null;
        AbstractC26573a aVar2 = this.f65754v;
        if (aVar2 == null || !aVar2.mo94434a() || i3 != 0 || i4 != 0) {
            AbstractC26573a aVar3 = this.f65754v;
            if ((aVar3 == null || !aVar3.mo94434a()) && i3 == 0 && i4 == 0) {
                lynxUI.mo53590a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
                return;
            }
            if (aVar != null) {
                animation = aVar.mo94435b(lynxUI, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect, this.f65756x);
            }
            if ((animation instanceof TranslateAnimation) && (lynxUI.mo94920C() instanceof UIShadowProxy)) {
                av = ((LynxUI) lynxUI.mo94920C()).av();
            }
            if (animation == null) {
                float f = this.f65756x;
                if (f != -1.0f) {
                    av.setAlpha(f);
                }
                WeakReference<LynxUI> weakReference = this.f65734b;
                if (weakReference != null) {
                    weakReference.clear();
                }
                lynxUI.mo53590a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
                return;
            }
            this.f65734b = new WeakReference<>(lynxUI);
            this.f65735c = i;
            this.f65736d = i2;
            this.f65737e = i3;
            this.f65738f = i4;
            this.f65739g = i5;
            this.f65740h = i6;
            this.f65741i = i7;
            this.f65742j = i8;
            this.f65747o = i9;
            this.f65748p = i10;
            this.f65749q = i11;
            this.f65750r = i12;
            this.f65743k = i13;
            this.f65744l = i14;
            this.f65745m = i15;
            this.f65746n = i16;
            this.f65751s = rect;
            if (lynxUI.mo94937T() == 0 && lynxUI.mo94938U() == 0) {
                animation.setAnimationListener(new animationAnimation$AnimationListenerC26576a(this, "layout-animation-create"));
            } else {
                animation.setAnimationListener(new animationAnimation$AnimationListenerC26576a(this, "layout-animation-update"));
            }
            if (animation instanceof AbstractC26580f) {
                lynxUI.mo95040v();
            } else {
                lynxUI.mo53590a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
            }
            lynxUI.mo94948a(i, i2, i3, i4, i5, i6, i7, i8);
            av.startAnimation(animation);
            return;
        }
        mo94440a(lynxUI);
    }
}
