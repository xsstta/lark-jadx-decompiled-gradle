package com.lynx.tasm.behavior;

import android.graphics.Rect;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.lynx.tasm.behavior.m */
public class C26685m {

    /* renamed from: a */
    private int f66032a;

    /* renamed from: b */
    private WeakReference<C26689n> f66033b;

    /* renamed from: c */
    private LynxBaseUI f66034c;

    /* renamed from: d */
    private LynxBaseUI f66035d;

    /* renamed from: e */
    private float f66036e;

    /* renamed from: f */
    private float f66037f;

    /* renamed from: g */
    private float f66038g;

    /* renamed from: h */
    private float f66039h;

    /* renamed from: i */
    private ArrayList<Float> f66040i;

    /* renamed from: j */
    private float f66041j;

    /* renamed from: k */
    private boolean f66042k;

    /* renamed from: l */
    private ArrayList<C26688b> f66043l;

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.m$a */
    public static class C26687a {

        /* renamed from: a */
        public Rect f66044a;

        /* renamed from: b */
        public Rect f66045b;

        /* renamed from: c */
        public Rect f66046c;

        /* renamed from: d */
        public float f66047d;

        /* renamed from: e */
        public double f66048e;

        private C26687a() {
        }

        /* renamed from: a */
        public void mo94699a() {
            if (this.f66046c == null) {
                this.f66047d = BitmapDescriptorFactory.HUE_RED;
                return;
            }
            float width = (float) (this.f66045b.width() * this.f66045b.height());
            float width2 = (float) (this.f66046c.width() * this.f66046c.height());
            if (width > BitmapDescriptorFactory.HUE_RED) {
                this.f66047d = width2 / width;
            } else {
                this.f66047d = BitmapDescriptorFactory.HUE_RED;
            }
        }

        /* renamed from: b */
        public JavaOnlyMap mo94700b() {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putMap("relativeRect", m96670a(this.f66044a));
            javaOnlyMap.putMap("boundingClientRect", m96670a(this.f66045b));
            javaOnlyMap.putMap("intersectionRect", m96670a(this.f66046c));
            javaOnlyMap.putDouble("intersectionRatio", (double) this.f66047d);
            javaOnlyMap.putDouble("time", this.f66048e);
            return javaOnlyMap;
        }

        /* renamed from: a */
        private JavaOnlyMap m96670a(Rect rect) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            if (rect != null) {
                javaOnlyMap.putDouble("left", (double) Math.round((float) rect.left));
                javaOnlyMap.putDouble("right", (double) Math.round((float) rect.right));
                javaOnlyMap.putDouble("top", (double) Math.round((float) rect.top));
                javaOnlyMap.putDouble("bottom", (double) Math.round((float) rect.bottom));
            } else {
                javaOnlyMap.putDouble("left", 0.0d);
                javaOnlyMap.putDouble("right", 0.0d);
                javaOnlyMap.putDouble("top", 0.0d);
                javaOnlyMap.putDouble("bottom", 0.0d);
            }
            return javaOnlyMap;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.m$b */
    public static class C26688b {

        /* renamed from: a */
        public LynxBaseUI f66049a;

        /* renamed from: b */
        public int f66050b;

        /* renamed from: c */
        public C26687a f66051c;

        private C26688b() {
        }
    }

    /* renamed from: a */
    public int mo94693a() {
        return this.f66032a;
    }

    /* renamed from: b */
    public void mo94697b() {
        this.f66043l.clear();
        this.f66033b.get().mo94702a(this.f66032a);
    }

    /* renamed from: c */
    public void mo94698c() {
        if (this.f66043l.size() != 0) {
            Rect d = m96663d();
            Iterator<C26688b> it = this.f66043l.iterator();
            while (it.hasNext()) {
                m96660a(it.next(), d, false);
            }
        }
    }

    /* renamed from: d */
    private Rect m96663d() {
        Rect rect;
        LynxBaseUI lynxBaseUI = this.f66035d;
        if (lynxBaseUI != null) {
            rect = lynxBaseUI.mo94929L();
        } else {
            rect = this.f66033b.get().mo94701a().mo94692n().mo94929L();
        }
        rect.left = (int) (((float) rect.left) - this.f66036e);
        rect.right = (int) (((float) rect.right) + this.f66037f);
        rect.top = (int) (((float) rect.top) - this.f66038g);
        rect.bottom = (int) (((float) rect.bottom) + this.f66039h);
        return rect;
    }

    /* renamed from: a */
    public void mo94694a(ReadableMap readableMap) {
        this.f66035d = null;
        m96662b(readableMap);
    }

    /* renamed from: b */
    private void m96662b(ReadableMap readableMap) {
        this.f66036e = (float) readableMap.getDouble("left", 0.0d);
        this.f66037f = (float) readableMap.getDouble("right", 0.0d);
        this.f66038g = (float) readableMap.getDouble("top", 0.0d);
        this.f66039h = (float) readableMap.getDouble("bottom", 0.0d);
    }

    /* renamed from: a */
    public void mo94696a(String str, ReadableMap readableMap) {
        if (str.startsWith("#")) {
            this.f66035d = this.f66033b.get().mo94701a().mo94653a(str.substring(1), this.f66034c);
            m96662b(readableMap);
        }
    }

    /* renamed from: a */
    private boolean m96661a(C26687a aVar, C26687a aVar2) {
        float f;
        boolean z;
        boolean z2;
        float f2 = -1.0f;
        if (aVar == null || aVar.f66046c == null) {
            f = -1.0f;
        } else {
            f = aVar.f66047d;
        }
        if (aVar2.f66046c != null) {
            f2 = aVar2.f66047d;
        }
        if (f == f2) {
            return false;
        }
        Iterator<Float> it = this.f66040i.iterator();
        while (it.hasNext()) {
            float floatValue = it.next().floatValue();
            if (floatValue == f || floatValue == f2) {
                return true;
            }
            if (floatValue < f) {
                z = true;
            } else {
                z = false;
            }
            if (floatValue < f2) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z != z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo94695a(String str, int i) {
        LynxBaseUI a;
        if (str.startsWith("#") && (a = this.f66033b.get().mo94701a().mo94653a(str.substring(1), this.f66034c)) != null) {
            for (int i2 = 0; i2 < this.f66043l.size(); i2++) {
                if (this.f66043l.get(i2).f66049a == a) {
                    return;
                }
            }
            C26688b bVar = new C26688b();
            bVar.f66049a = a;
            bVar.f66050b = i;
            this.f66043l.add(bVar);
            m96660a(bVar, m96663d(), true);
        }
    }

    /* renamed from: a */
    private Rect m96659a(LynxBaseUI lynxBaseUI, Rect rect, Rect rect2) {
        Rect rect3;
        if (!lynxBaseUI.mo95043y()) {
            return null;
        }
        LynxBaseUI lynxBaseUI2 = (LynxBaseUI) lynxBaseUI.mo94920C();
        boolean z = false;
        while (!z && lynxBaseUI2 != null) {
            if (!lynxBaseUI2.mo95043y()) {
                return null;
            }
            if (lynxBaseUI2 == this.f66035d) {
                z = true;
                rect3 = rect2;
            } else if (lynxBaseUI2.mo94930M() == 0) {
                rect3 = lynxBaseUI2.mo94929L();
            } else {
                rect3 = null;
            }
            if (rect3 != null) {
                if (rect3.intersects(rect.left, rect.top, rect.right, rect.bottom)) {
                    rect = new Rect(Math.max(rect3.left, rect.left), Math.max(rect3.top, rect.top), Math.min(rect3.right, rect.right), Math.min(rect3.bottom, rect.bottom));
                } else {
                    rect = null;
                }
            }
            if (rect == null) {
                break;
            }
            lynxBaseUI2 = (LynxBaseUI) lynxBaseUI2.mo94920C();
        }
        return rect;
    }

    /* renamed from: a */
    private void m96660a(C26688b bVar, Rect rect, boolean z) {
        boolean z2;
        C26689n nVar = this.f66033b.get();
        if (this.f66033b != null) {
            Rect L = bVar.f66049a.mo94929L();
            Rect a = m96659a(bVar.f66049a, L, rect);
            C26687a aVar = new C26687a();
            aVar.f66045b = L;
            aVar.f66044a = rect;
            aVar.f66046c = a;
            aVar.f66048e = 0.0d;
            aVar.mo94699a();
            C26687a aVar2 = bVar.f66051c;
            bVar.f66051c = aVar;
            int i = bVar.f66050b;
            if (!z) {
                z2 = m96661a(aVar2, aVar);
            } else if (this.f66041j < aVar.f66047d) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                nVar.mo94703a(this.f66032a, i, aVar.mo94700b());
            }
        }
    }

    public C26685m(C26689n nVar, int i, int i2, ReadableMap readableMap) {
        WeakReference<C26689n> weakReference = new WeakReference<>(nVar);
        this.f66033b = weakReference;
        this.f66032a = i;
        if (i2 != -1) {
            this.f66034c = weakReference.get().mo94701a().mo94652a(i2);
        } else {
            this.f66034c = weakReference.get().mo94701a().mo94692n();
        }
        this.f66040i = new ArrayList<>();
        ReadableArray array = readableMap.getArray("thresholds");
        if (array != null) {
            for (int i3 = 0; i3 < array.size(); i3++) {
                this.f66040i.add(Float.valueOf((float) array.getDouble(i3)));
            }
        } else {
            this.f66040i.add(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
        }
        this.f66041j = (float) readableMap.getDouble("initialRatio", 0.0d);
        this.f66042k = readableMap.getBoolean("observeAll", false);
        this.f66043l = new ArrayList<>();
    }
}
