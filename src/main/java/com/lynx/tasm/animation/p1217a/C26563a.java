package com.lynx.tasm.animation.p1217a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Build;
import android.view.View;
import com.bytedance.kit.nglynx.log.LynxKitALogDelegate;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.animation.C26562a;
import com.lynx.tasm.animation.C26570b;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import com.lynx.tasm.behavior.ui.utils.C26828a;
import com.lynx.tasm.behavior.ui.utils.C26834g;
import com.lynx.tasm.behavior.ui.utils.C26836h;
import com.lynx.tasm.p1216a.C26546b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.lynx.tasm.animation.a.a */
public class C26563a {

    /* renamed from: A */
    private ArrayList<Keyframe> f65693A;

    /* renamed from: B */
    private ArrayList<Keyframe> f65694B;

    /* renamed from: C */
    private ArrayList<Keyframe> f65695C;

    /* renamed from: D */
    private ArrayList<Keyframe> f65696D;

    /* renamed from: a */
    public ObjectAnimator[] f65697a;

    /* renamed from: b */
    public C26562a f65698b;

    /* renamed from: c */
    private boolean f65699c;

    /* renamed from: d */
    private ReadableMap f65700d;

    /* renamed from: e */
    private WeakReference<LynxUI> f65701e;

    /* renamed from: f */
    private WeakReference<View> f65702f;

    /* renamed from: g */
    private C26562a f65703g;

    /* renamed from: h */
    private boolean f65704h;

    /* renamed from: i */
    private boolean[] f65705i;

    /* renamed from: j */
    private boolean[] f65706j;

    /* renamed from: k */
    private float f65707k;

    /* renamed from: l */
    private float f65708l;

    /* renamed from: m */
    private float f65709m;

    /* renamed from: n */
    private float f65710n;

    /* renamed from: o */
    private float f65711o;

    /* renamed from: p */
    private float f65712p;

    /* renamed from: q */
    private float f65713q;

    /* renamed from: r */
    private float f65714r;

    /* renamed from: s */
    private float f65715s;

    /* renamed from: t */
    private int f65716t;

    /* renamed from: u */
    private ArrayList<Keyframe> f65717u;

    /* renamed from: v */
    private ArrayList<Keyframe> f65718v;

    /* renamed from: w */
    private ArrayList<Keyframe> f65719w;

    /* renamed from: x */
    private ArrayList<Keyframe> f65720x;

    /* renamed from: y */
    private ArrayList<Keyframe> f65721y;

    /* renamed from: z */
    private ArrayList<Keyframe> f65722z;

    /* renamed from: com.lynx.tasm.animation.a.a$b */
    public interface AbstractC26566b {
        /* renamed from: a */
        void mo94426a(String str);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.animation.a.a$c */
    public static class C26567c extends AnimatorListenerAdapter {
        private C26567c() {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            animator.cancel();
        }
    }

    /* renamed from: a */
    public boolean mo94408a(String str) {
        if (str == null) {
            ObjectAnimator[] objectAnimatorArr = this.f65697a;
            if (objectAnimatorArr != null) {
                for (ObjectAnimator objectAnimator : objectAnimatorArr) {
                    objectAnimator.end();
                }
            }
            m96322j();
            return false;
        }
        this.f65698b.mo94377a(str);
        return true;
    }

    /* renamed from: h */
    public void mo94419h() {
        mo94406a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.animation.a.a$a */
    public static class C26565a extends AnimatorListenerAdapter {

        /* renamed from: b */
        private static Map<String, Object> f65724b;

        /* renamed from: a */
        WeakReference<C26563a> f65725a;

        static {
            HashMap hashMap = new HashMap();
            f65724b = hashMap;
            hashMap.put("animation_type", "keyframe-animation");
        }

        public C26565a(C26563a aVar) {
            this.f65725a = new WeakReference<>(aVar);
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C26563a aVar = this.f65725a.get();
            if (aVar != null) {
                m96354a(aVar.mo94409b(), "animationiteration");
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            C26563a aVar = this.f65725a.get();
            if (aVar != null) {
                m96354a(aVar.mo94409b(), "animationstart");
            }
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C26563a aVar = this.f65725a.get();
            if (aVar != null) {
                LynxUI b = aVar.mo94409b();
                m96354a(b, "animationend");
                if (!aVar.mo94415d()) {
                    aVar.mo94416e();
                }
                C26568b.m96356a(aVar.f65698b.mo94373a());
                if (b != null) {
                    b.mo95072c(aVar.f65698b.mo94373a());
                }
                aVar.f65697a = null;
            }
        }

        /* renamed from: a */
        private static void m96354a(LynxUI lynxUI, String str) {
            if (lynxUI != null && lynxUI.mo94578s() != null && lynxUI.mo94578s().containsKey(str)) {
                lynxUI.mo95039u().mo94687i().mo94075a(new C26546b(lynxUI.mo94576q(), str, f65724b));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public LynxUI mo94409b() {
        return this.f65701e.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo94412c() {
        return this.f65702f.get();
    }

    /* renamed from: j */
    private void m96322j() {
        this.f65699c = false;
        this.f65697a = null;
        this.f65698b = new C26562a();
        this.f65703g = null;
        this.f65704h = false;
    }

    /* renamed from: k */
    private boolean m96323k() {
        if (this.f65698b.mo94399m() == 1 || this.f65698b.mo94399m() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private boolean m96324l() {
        if (this.f65698b.mo94399m() == 2 || this.f65698b.mo94399m() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private boolean m96325m() {
        if (this.f65698b.mo94398l() == 2 || this.f65698b.mo94398l() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private void m96330r() {
        ObjectAnimator[] objectAnimatorArr = this.f65697a;
        if (objectAnimatorArr != null) {
            for (ObjectAnimator objectAnimator : objectAnimatorArr) {
                objectAnimator.end();
            }
            this.f65697a = null;
        }
    }

    /* renamed from: s */
    private void m96331s() {
        ObjectAnimator[] objectAnimatorArr = this.f65697a;
        if (objectAnimatorArr != null) {
            for (ObjectAnimator objectAnimator : objectAnimatorArr) {
                objectAnimator.cancel();
            }
            this.f65697a = null;
        }
    }

    /* renamed from: u */
    private BackgroundDrawable m96333u() {
        C26828a aA;
        LynxUI b = mo94409b();
        if (b == null || (aA = b.aA()) == null) {
            return null;
        }
        return aA.mo95533c();
    }

    /* renamed from: d */
    public boolean mo94415d() {
        if (this.f65698b.mo94398l() == 1 || this.f65698b.mo94398l() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void mo94417f() {
        ObjectAnimator[] objectAnimatorArr = this.f65697a;
        if (objectAnimatorArr != null && objectAnimatorArr.length > 0) {
            objectAnimatorArr[0].addListener(new C26565a(this));
        }
    }

    /* renamed from: g */
    public void mo94418g() {
        ObjectAnimator[] objectAnimatorArr = this.f65697a;
        if (objectAnimatorArr != null) {
            for (ObjectAnimator objectAnimator : objectAnimatorArr) {
                objectAnimator.removeAllListeners();
            }
        }
    }

    /* renamed from: i */
    public boolean mo94420i() {
        ObjectAnimator[] objectAnimatorArr = this.f65697a;
        if (objectAnimatorArr != null) {
            for (ObjectAnimator objectAnimator : objectAnimatorArr) {
                if (objectAnimator.isRunning()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    private boolean m96326n() {
        if (this.f65697a != null && this.f65698b.mo94400n() == 0) {
            if (Build.VERSION.SDK_INT >= 19) {
                for (ObjectAnimator objectAnimator : this.f65697a) {
                    objectAnimator.pause();
                }
            }
            this.f65699c = true;
            this.f65703g = new C26562a(this.f65698b);
            return true;
        } else if (this.f65697a == null || !this.f65699c || this.f65698b.mo94400n() != 1) {
            return false;
        } else {
            if (Build.VERSION.SDK_INT >= 19) {
                for (ObjectAnimator objectAnimator2 : this.f65697a) {
                    objectAnimator2.resume();
                }
            }
            this.f65699c = false;
            this.f65703g = new C26562a(this.f65698b);
            return true;
        }
    }

    /* renamed from: o */
    private void m96327o() {
        this.f65705i = new boolean[10];
        this.f65706j = new boolean[10];
        this.f65717u = new ArrayList<>();
        this.f65718v = new ArrayList<>();
        this.f65719w = new ArrayList<>();
        this.f65720x = new ArrayList<>();
        this.f65721y = new ArrayList<>();
        this.f65722z = new ArrayList<>();
        this.f65693A = new ArrayList<>();
        this.f65694B = new ArrayList<>();
        this.f65695C = new ArrayList<>();
        this.f65696D = new ArrayList<>();
    }

    /* renamed from: p */
    private void m96328p() {
        View c = mo94412c();
        if (c != null) {
            this.f65707k = c.getAlpha();
            this.f65708l = c.getTranslationX();
            this.f65709m = c.getTranslationY();
            if (Build.VERSION.SDK_INT >= 21) {
                this.f65710n = c.getTranslationZ();
            }
            this.f65711o = c.getRotation();
            this.f65712p = c.getRotationX();
            this.f65713q = c.getRotationY();
            this.f65714r = c.getScaleX();
            this.f65715s = c.getScaleY();
            LynxUI b = mo94409b();
            if (b != null) {
                this.f65716t = b.az();
            }
        }
    }

    /* renamed from: e */
    public void mo94416e() {
        View c = mo94412c();
        if (c != null) {
            c.setAlpha(this.f65707k);
            c.setTranslationX(this.f65708l);
            c.setTranslationY(this.f65709m);
            c.setTranslationY(this.f65710n);
            c.setRotation(this.f65711o);
            c.setRotationX(this.f65712p);
            c.setRotationY(this.f65713q);
            c.setScaleX(this.f65714r);
            c.setScaleY(this.f65715s);
            BackgroundDrawable u = m96333u();
            if (u != null) {
                u.mo95474a(this.f65716t);
            } else {
                c.setBackgroundColor(this.f65716t);
            }
        }
    }

    /* renamed from: q */
    private boolean m96329q() {
        boolean z = false;
        this.f65704h = false;
        ReadableMapKeySetIterator keySetIterator = this.f65700d.keySetIterator();
        loop0:
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            float parseFloat = Float.parseFloat(nextKey) / 100.0f;
            if (m96323k()) {
                parseFloat = 1.0f - parseFloat;
            }
            ReadableMap map = this.f65700d.getMap(nextKey);
            ReadableMapKeySetIterator keySetIterator2 = map.keySetIterator();
            while (true) {
                if (keySetIterator2.hasNextKey()) {
                    String nextKey2 = keySetIterator2.nextKey();
                    if (nextKey2.equals("opacity")) {
                        int i = z ? 1 : 0;
                        int i2 = z ? 1 : 0;
                        int i3 = z ? 1 : 0;
                        int i4 = z ? 1 : 0;
                        m96319a(parseFloat, i);
                        float f = (float) map.getDouble(nextKey2);
                        if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
                            return z;
                        }
                        this.f65717u.add(Keyframe.ofFloat(parseFloat, f));
                    } else if (nextKey2.equals("transform")) {
                        List<C26836h> a = C26836h.m97577a(map.getArray(nextKey2));
                        LynxUI b = mo94409b();
                        C26834g a2 = C26834g.m97548a(a, b.mo95039u().mo94692n().ad(), b.ad(), (float) b.mo95039u().mo94692n().mo94937T(), (float) b.mo95039u().mo94692n().mo94938U(), (float) b.mo94937T(), (float) b.mo94938U());
                        if (a2 == null) {
                            return z;
                        }
                        if (C26836h.m97578a(a)) {
                            this.f65704h = true;
                        }
                        for (C26836h hVar : a) {
                            int a3 = hVar.mo95581a();
                            if (a3 != 1) {
                                if (a3 == 2) {
                                    m96319a(parseFloat, 1);
                                    this.f65718v.add(Keyframe.ofFloat(parseFloat, a2.mo95559b()));
                                } else if (a3 == 4) {
                                    m96319a(parseFloat, 2);
                                    this.f65719w.add(Keyframe.ofFloat(parseFloat, a2.mo95562c()));
                                } else if (a3 != 8) {
                                    if (a3 != 16) {
                                        if (a3 != 32) {
                                            if (a3 == 64) {
                                                m96319a(parseFloat, 5);
                                                this.f65722z.add(Keyframe.ofFloat(parseFloat, a2.mo95568f()));
                                            } else if (a3 == 128) {
                                                m96319a(parseFloat, 6);
                                                this.f65693A.add(Keyframe.ofFloat(parseFloat, a2.mo95570g()));
                                            } else if (a3 == 512) {
                                                m96319a(parseFloat, 7);
                                                this.f65694B.add(Keyframe.ofFloat(parseFloat, a2.mo95572h()));
                                                m96319a(parseFloat, 8);
                                                this.f65695C.add(Keyframe.ofFloat(parseFloat, a2.mo95574i()));
                                            } else if (a3 == 1024) {
                                                m96319a(parseFloat, 7);
                                                this.f65694B.add(Keyframe.ofFloat(parseFloat, a2.mo95572h()));
                                            } else if (a3 == 2048) {
                                                m96319a(parseFloat, 8);
                                                this.f65695C.add(Keyframe.ofFloat(parseFloat, a2.mo95574i()));
                                            }
                                        }
                                        m96319a(parseFloat, 4);
                                        this.f65721y.add(Keyframe.ofFloat(parseFloat, a2.mo95566e()));
                                    }
                                } else if (Build.VERSION.SDK_INT >= 21) {
                                    m96319a(parseFloat, 3);
                                    this.f65720x.add(Keyframe.ofFloat(parseFloat, a2.mo95564d()));
                                }
                            }
                            m96319a(parseFloat, 1);
                            this.f65718v.add(Keyframe.ofFloat(parseFloat, a2.mo95559b()));
                            m96319a(parseFloat, 2);
                            this.f65719w.add(Keyframe.ofFloat(parseFloat, a2.mo95562c()));
                            if (Build.VERSION.SDK_INT >= 21) {
                                m96319a(parseFloat, 3);
                                this.f65720x.add(Keyframe.ofFloat(parseFloat, a2.mo95564d()));
                            }
                            m96319a(parseFloat, 4);
                            this.f65721y.add(Keyframe.ofFloat(parseFloat, a2.mo95566e()));
                        }
                    } else if (nextKey2.equals("background-color")) {
                        m96319a(parseFloat, 9);
                        this.f65696D.add(Keyframe.ofInt(parseFloat, map.getInt(nextKey2)));
                    }
                    z = false;
                }
            }
            return z;
        }
        return true;
    }

    /* renamed from: t */
    private void m96332t() {
        C26562a aVar;
        C26562a aVar2;
        C26562a aVar3;
        if (this.f65697a != null && (aVar2 = this.f65703g) != null && (aVar3 = this.f65698b) != null && m96320a(aVar3, aVar2)) {
            View c = mo94412c();
            if (c != null) {
                if (!mo94415d()) {
                    c.setAlpha(this.f65707k);
                    c.setTranslationX(this.f65708l);
                    c.setTranslationY(this.f65709m);
                    if (Build.VERSION.SDK_INT >= 21) {
                        c.setTranslationZ(this.f65710n);
                    }
                    c.setRotation(this.f65711o);
                    c.setRotationX(this.f65712p);
                    c.setRotationY(this.f65713q);
                    c.setScaleX(this.f65714r);
                    c.setScaleY(this.f65715s);
                    c.setBackgroundColor(this.f65716t);
                } else if (this.f65703g.mo94399m() == 1 || ((this.f65703g.mo94399m() == 3 && this.f65703g.mo94401o() % 2 != 0) || (this.f65703g.mo94399m() == 2 && this.f65703g.mo94401o() % 2 == 0))) {
                    if (this.f65717u.size() > 0) {
                        c.setAlpha(((Float) this.f65717u.get(0).getValue()).floatValue());
                    }
                    if (this.f65718v.size() > 0) {
                        c.setTranslationX(((Float) this.f65718v.get(0).getValue()).floatValue());
                    }
                    if (this.f65719w.size() > 0) {
                        c.setTranslationY(((Float) this.f65719w.get(0).getValue()).floatValue());
                    }
                    if (this.f65720x.size() > 0 && Build.VERSION.SDK_INT >= 21) {
                        c.setTranslationZ(((Float) this.f65720x.get(0).getValue()).floatValue());
                    }
                    if (this.f65721y.size() > 0) {
                        c.setRotation(((Float) this.f65721y.get(0).getValue()).floatValue());
                    }
                    if (this.f65722z.size() > 0) {
                        c.setRotationX(((Float) this.f65722z.get(0).getValue()).floatValue());
                    }
                    if (this.f65693A.size() > 0) {
                        c.setRotationY(((Float) this.f65693A.get(0).getValue()).floatValue());
                    }
                    if (this.f65694B.size() > 0) {
                        c.setScaleX(((Float) this.f65694B.get(0).getValue()).floatValue());
                    }
                    if (this.f65695C.size() > 0) {
                        c.setScaleX(((Float) this.f65695C.get(0).getValue()).floatValue());
                    }
                    if (this.f65696D.size() > 0) {
                        c.setBackgroundColor(((Integer) this.f65696D.get(0).getValue()).intValue());
                    }
                } else {
                    if (this.f65717u.size() > 0) {
                        ArrayList<Keyframe> arrayList = this.f65717u;
                        c.setAlpha(((Float) arrayList.get(arrayList.size() - 1).getValue()).floatValue());
                    }
                    if (this.f65718v.size() > 0) {
                        ArrayList<Keyframe> arrayList2 = this.f65718v;
                        c.setTranslationX(((Float) arrayList2.get(arrayList2.size() - 1).getValue()).floatValue());
                    }
                    if (this.f65719w.size() > 0) {
                        ArrayList<Keyframe> arrayList3 = this.f65719w;
                        c.setTranslationY(((Float) arrayList3.get(arrayList3.size() - 1).getValue()).floatValue());
                    }
                    if (this.f65720x.size() > 0 && Build.VERSION.SDK_INT >= 21) {
                        ArrayList<Keyframe> arrayList4 = this.f65720x;
                        c.setTranslationZ(((Float) arrayList4.get(arrayList4.size() - 1).getValue()).floatValue());
                    }
                    if (this.f65721y.size() > 0) {
                        ArrayList<Keyframe> arrayList5 = this.f65721y;
                        c.setRotation(((Float) arrayList5.get(arrayList5.size() - 1).getValue()).floatValue());
                    }
                    if (this.f65722z.size() > 0) {
                        c.setRotationX(((Float) this.f65722z.get(this.f65721y.size() - 1).getValue()).floatValue());
                    }
                    if (this.f65693A.size() > 0) {
                        ArrayList<Keyframe> arrayList6 = this.f65693A;
                        c.setRotationY(((Float) arrayList6.get(arrayList6.size() - 1).getValue()).floatValue());
                    }
                    if (this.f65694B.size() > 0) {
                        ArrayList<Keyframe> arrayList7 = this.f65694B;
                        c.setScaleX(((Float) arrayList7.get(arrayList7.size() - 1).getValue()).floatValue());
                    }
                    if (this.f65695C.size() > 0) {
                        ArrayList<Keyframe> arrayList8 = this.f65695C;
                        c.setScaleX(((Float) arrayList8.get(arrayList8.size() - 1).getValue()).floatValue());
                    }
                    if (this.f65696D.size() > 0) {
                        ArrayList<Keyframe> arrayList9 = this.f65696D;
                        c.setBackgroundColor(((Integer) arrayList9.get(arrayList9.size() - 1).getValue()).intValue());
                    }
                }
                m96330r();
            }
        } else if (this.f65697a != null && this.f65703g != null && (aVar = this.f65698b) != null && aVar.mo94373a().equals(this.f65703g.mo94373a())) {
            m96331s();
        }
    }

    /* renamed from: a */
    public boolean mo94407a() {
        return this.f65704h;
    }

    /* renamed from: a */
    public void mo94405a(C26562a aVar) {
        this.f65698b = aVar;
    }

    /* renamed from: a */
    public void mo94402a(int i) {
        this.f65698b.mo94387d(i - 1);
    }

    /* renamed from: b */
    public void mo94410b(int i) {
        this.f65698b.mo94391f(i);
    }

    /* renamed from: c */
    public void mo94413c(int i) {
        this.f65698b.mo94389e(i);
    }

    /* renamed from: d */
    public void mo94414d(int i) {
        this.f65698b.mo94393g(i);
    }

    /* renamed from: a */
    public void mo94404a(ReadableArray readableArray) {
        this.f65698b.mo94372a(readableArray, 0);
    }

    /* renamed from: b */
    public void mo94411b(long j) {
        this.f65698b.mo94381b(j);
    }

    /* renamed from: a */
    public void mo94403a(long j) {
        if (j <= 0) {
            ObjectAnimator[] objectAnimatorArr = this.f65697a;
            if (objectAnimatorArr != null) {
                for (ObjectAnimator objectAnimator : objectAnimatorArr) {
                    objectAnimator.end();
                }
            }
            m96322j();
        }
        this.f65698b.mo94376a(j);
    }

    /* renamed from: a */
    public void mo94406a(boolean z) {
        C26562a aVar;
        int i;
        View view;
        View c = mo94412c();
        LynxUI b = mo94409b();
        if (c != null && b != null && (aVar = this.f65698b) != null) {
            if (m96320a(aVar, this.f65703g) || (this.f65697a != null && z)) {
                this.f65700d = b.mo95068b(this.f65698b.mo94373a());
                if (!m96326n() && this.f65700d != null) {
                    long j = 0;
                    if (this.f65698b.mo94378b() != 0 && this.f65698b.mo94400n() != 0) {
                        m96332t();
                        m96327o();
                        m96328p();
                        this.f65703g = new C26562a(this.f65698b);
                        if (!m96329q()) {
                            LLog.m96429e(LynxKitALogDelegate.f38587a, "Keyframes input error.");
                        }
                        BackgroundDrawable u = m96333u();
                        int i2 = 2;
                        if (u != null) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                        ObjectAnimator[] objectAnimatorArr = new ObjectAnimator[i];
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < i) {
                            PropertyValuesHolder[] a = m96321a(i3, i);
                            if (a != null) {
                                if (i3 == 1) {
                                    view = u;
                                } else {
                                    view = c;
                                }
                                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, a);
                                objectAnimatorArr[i3] = ofPropertyValuesHolder;
                                ofPropertyValuesHolder.setDuration(this.f65698b.mo94378b());
                                ofPropertyValuesHolder.setRepeatCount(this.f65698b.mo94397k());
                                if (m96324l()) {
                                    ofPropertyValuesHolder.setRepeatMode(i2);
                                } else {
                                    ofPropertyValuesHolder.setRepeatMode(1);
                                }
                                ofPropertyValuesHolder.setInterpolator(C26570b.m96358a(this.f65698b));
                                if (this.f65698b.mo94382c() != j && m96325m()) {
                                    ObjectAnimator clone = ofPropertyValuesHolder.clone();
                                    clone.setDuration(10000000L);
                                    clone.addListener(new C26567c());
                                    clone.start();
                                }
                                if (i4 == 0) {
                                    ofPropertyValuesHolder.addListener(new C26565a(this));
                                }
                                i4++;
                                ofPropertyValuesHolder.setStartDelay(this.f65698b.mo94382c());
                                ofPropertyValuesHolder.start();
                            }
                            i3++;
                            i2 = 2;
                            j = 0;
                        }
                        m96330r();
                        if (i4 == 0) {
                            this.f65697a = null;
                        } else if (i4 == i) {
                            this.f65697a = objectAnimatorArr;
                        } else {
                            this.f65697a = new ObjectAnimator[i4];
                            int i5 = 0;
                            for (int i6 = 0; i6 < i; i6++) {
                                ObjectAnimator objectAnimator = objectAnimatorArr[i6];
                                if (objectAnimator != null) {
                                    this.f65697a[i5] = objectAnimator;
                                    i5++;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public C26563a(View view, LynxUI lynxUI) {
        this.f65701e = new WeakReference<>(lynxUI);
        this.f65702f = new WeakReference<>(view);
        m96322j();
    }

    /* renamed from: a */
    private PropertyValuesHolder m96318a(ArrayList<Keyframe> arrayList, String str) {
        return PropertyValuesHolder.ofKeyframe(str, (Keyframe[]) arrayList.toArray(new Keyframe[arrayList.size()]));
    }

    /* renamed from: a */
    private void m96319a(float f, int i) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            this.f65705i[i] = true;
        }
        if (f == 1.0f) {
            this.f65706j[i] = true;
        }
    }

    /* renamed from: a */
    private boolean m96320a(C26562a aVar, C26562a aVar2) {
        if (aVar == null && aVar2 == null) {
            return false;
        }
        if (aVar != null && aVar2 == null) {
            return true;
        }
        if ((aVar != null || aVar2 == null) && aVar.mo94373a().equals(aVar2.mo94373a()) && aVar.mo94378b() == aVar2.mo94378b() && aVar.mo94382c() == aVar2.mo94382c() && aVar.mo94388e() == aVar2.mo94388e() && aVar.mo94397k() == aVar2.mo94397k() && aVar.mo94398l() == aVar2.mo94398l() && aVar.mo94399m() == aVar2.mo94399m() && aVar.mo94400n() == aVar2.mo94400n()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private PropertyValuesHolder[] m96321a(int i, int i2) {
        PropertyValuesHolder propertyValuesHolder;
        ArrayList arrayList = new ArrayList();
        C265641 r1 = new Comparator<Keyframe>() {
            /* class com.lynx.tasm.animation.p1217a.C26563a.C265641 */

            /* renamed from: a */
            public int compare(Keyframe keyframe, Keyframe keyframe2) {
                return (int) ((keyframe.getFraction() - keyframe2.getFraction()) * 100.0f);
            }
        };
        if (this.f65717u.size() != 0 && i == 0) {
            if (!this.f65705i[0]) {
                this.f65717u.add(Keyframe.ofFloat(BitmapDescriptorFactory.HUE_RED, this.f65707k));
            }
            if (!this.f65706j[0]) {
                this.f65717u.add(Keyframe.ofFloat(1.0f, this.f65707k));
            }
            Collections.sort(this.f65717u, r1);
            arrayList.add(m96318a(this.f65717u, "Alpha"));
        }
        if (this.f65718v.size() != 0 && i == 0) {
            if (!this.f65705i[1]) {
                this.f65718v.add(Keyframe.ofFloat(BitmapDescriptorFactory.HUE_RED, this.f65708l));
            }
            if (!this.f65706j[1]) {
                this.f65718v.add(Keyframe.ofFloat(1.0f, this.f65708l));
            }
            Collections.sort(this.f65718v, r1);
            arrayList.add(m96318a(this.f65718v, "TranslationX"));
        }
        if (this.f65719w.size() != 0 && i == 0) {
            if (!this.f65705i[2]) {
                this.f65719w.add(Keyframe.ofFloat(BitmapDescriptorFactory.HUE_RED, this.f65709m));
            }
            if (!this.f65706j[2]) {
                this.f65719w.add(Keyframe.ofFloat(1.0f, this.f65709m));
            }
            Collections.sort(this.f65719w, r1);
            arrayList.add(m96318a(this.f65719w, "TranslationY"));
        }
        if (this.f65720x.size() != 0 && i == 0) {
            if (!this.f65705i[3]) {
                this.f65720x.add(Keyframe.ofFloat(BitmapDescriptorFactory.HUE_RED, this.f65710n));
            }
            if (!this.f65706j[3]) {
                this.f65720x.add(Keyframe.ofFloat(1.0f, this.f65710n));
            }
            Collections.sort(this.f65720x, r1);
            arrayList.add(m96318a(this.f65720x, "TranslationZ"));
        }
        if (this.f65721y.size() != 0 && i == 0) {
            if (!this.f65705i[4]) {
                this.f65721y.add(Keyframe.ofFloat(BitmapDescriptorFactory.HUE_RED, this.f65711o));
            }
            if (!this.f65706j[4]) {
                this.f65721y.add(Keyframe.ofFloat(1.0f, this.f65711o));
            }
            Collections.sort(this.f65721y, r1);
            arrayList.add(m96318a(this.f65721y, "Rotation"));
        }
        if (this.f65722z.size() != 0 && i == 0) {
            if (!this.f65705i[5]) {
                this.f65722z.add(Keyframe.ofFloat(BitmapDescriptorFactory.HUE_RED, this.f65712p));
            }
            if (!this.f65706j[5]) {
                this.f65722z.add(Keyframe.ofFloat(1.0f, this.f65712p));
            }
            Collections.sort(this.f65722z, r1);
            arrayList.add(m96318a(this.f65722z, "RotationX"));
        }
        if (this.f65693A.size() != 0 && i == 0) {
            if (!this.f65705i[6]) {
                this.f65693A.add(Keyframe.ofFloat(BitmapDescriptorFactory.HUE_RED, this.f65713q));
            }
            if (!this.f65706j[6]) {
                this.f65693A.add(Keyframe.ofFloat(1.0f, this.f65713q));
            }
            Collections.sort(this.f65693A, r1);
            arrayList.add(m96318a(this.f65693A, "RotationY"));
        }
        if (this.f65694B.size() != 0 && i == 0) {
            if (!this.f65705i[7]) {
                this.f65694B.add(Keyframe.ofFloat(BitmapDescriptorFactory.HUE_RED, this.f65714r));
            }
            if (!this.f65706j[7]) {
                this.f65694B.add(Keyframe.ofFloat(1.0f, this.f65714r));
            }
            Collections.sort(this.f65694B, r1);
            arrayList.add(m96318a(this.f65694B, "ScaleX"));
        }
        if (this.f65695C.size() != 0 && i == 0) {
            if (!this.f65705i[8]) {
                this.f65695C.add(Keyframe.ofFloat(BitmapDescriptorFactory.HUE_RED, this.f65715s));
            }
            if (!this.f65706j[8]) {
                this.f65695C.add(Keyframe.ofFloat(1.0f, this.f65715s));
            }
            Collections.sort(this.f65695C, r1);
            arrayList.add(m96318a(this.f65695C, "ScaleY"));
        }
        if (this.f65696D.size() != 0 && i + 1 == i2) {
            if (!this.f65705i[9]) {
                this.f65696D.add(Keyframe.ofInt(BitmapDescriptorFactory.HUE_RED, this.f65716t));
            }
            if (!this.f65706j[9]) {
                this.f65696D.add(Keyframe.ofInt(1.0f, this.f65716t));
            }
            Collections.sort(this.f65696D, r1);
            if (i == 0) {
                propertyValuesHolder = m96318a(this.f65696D, "BackgroundColor");
            } else {
                propertyValuesHolder = m96318a(this.f65696D, "Color");
            }
            propertyValuesHolder.setEvaluator(new ArgbEvaluator());
            arrayList.add(propertyValuesHolder);
        }
        if (arrayList.size() != 0) {
            return (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[arrayList.size()]);
        }
        return null;
    }
}
