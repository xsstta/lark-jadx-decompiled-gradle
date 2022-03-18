package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.p024a.C0530c;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0689b;
import androidx.constraintlayout.widget.C0696d;
import androidx.constraintlayout.widget.R$id;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.ttm.player.MediaPlayer;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.motion.widget.q */
public class C0584q {

    /* renamed from: a */
    public final MotionLayout f2293a;

    /* renamed from: b */
    C0696d f2294b;

    /* renamed from: c */
    C0586a f2295c;

    /* renamed from: d */
    public SparseArray<C0689b> f2296d = new SparseArray<>();

    /* renamed from: e */
    public int f2297e = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;

    /* renamed from: f */
    public int f2298f = 0;

    /* renamed from: g */
    float f2299g;

    /* renamed from: h */
    float f2300h;

    /* renamed from: i */
    private boolean f2301i;

    /* renamed from: j */
    private ArrayList<C0586a> f2302j = new ArrayList<>();

    /* renamed from: k */
    private C0586a f2303k = null;

    /* renamed from: l */
    private ArrayList<C0586a> f2304l = new ArrayList<>();

    /* renamed from: m */
    private HashMap<String, Integer> f2305m = new HashMap<>();

    /* renamed from: n */
    private SparseIntArray f2306n = new SparseIntArray();

    /* renamed from: o */
    private boolean f2307o = false;

    /* renamed from: p */
    private MotionEvent f2308p;

    /* renamed from: q */
    private boolean f2309q = false;

    /* renamed from: r */
    private boolean f2310r = false;

    /* renamed from: s */
    private MotionLayout.AbstractC0542d f2311s;

    /* renamed from: t */
    private boolean f2312t;

    /* renamed from: androidx.constraintlayout.motion.widget.q$a */
    public static class C0586a {

        /* renamed from: a */
        public int f2315a = -1;

        /* renamed from: b */
        public boolean f2316b;

        /* renamed from: c */
        public int f2317c = -1;

        /* renamed from: d */
        public int f2318d = -1;

        /* renamed from: e */
        public int f2319e;

        /* renamed from: f */
        public String f2320f;

        /* renamed from: g */
        public int f2321g = -1;

        /* renamed from: h */
        public int f2322h = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;

        /* renamed from: i */
        public float f2323i;

        /* renamed from: j */
        public final C0584q f2324j;

        /* renamed from: k */
        public ArrayList<C0572h> f2325k = new ArrayList<>();

        /* renamed from: l */
        public C0620t f2326l = null;

        /* renamed from: m */
        public ArrayList<View$OnClickListenerC0587a> f2327m = new ArrayList<>();

        /* renamed from: n */
        public int f2328n = 0;

        /* renamed from: o */
        public boolean f2329o = false;

        /* renamed from: p */
        public int f2330p = -1;

        /* renamed from: q */
        private int f2331q = 0;

        /* renamed from: r */
        private int f2332r = 0;

        /* renamed from: a */
        public int mo3335a() {
            return this.f2331q;
        }

        /* renamed from: b */
        public int mo3339b() {
            return this.f2328n;
        }

        /* renamed from: c */
        public int mo3341c() {
            return this.f2317c;
        }

        /* renamed from: d */
        public int mo3342d() {
            return this.f2318d;
        }

        /* renamed from: e */
        public int mo3343e() {
            return this.f2322h;
        }

        /* renamed from: f */
        public C0620t mo3344f() {
            return this.f2326l;
        }

        /* renamed from: g */
        public boolean mo3345g() {
            return !this.f2329o;
        }

        /* renamed from: a */
        public void mo3337a(int i) {
            this.f2322h = i;
        }

        /* renamed from: b */
        public boolean mo3340b(int i) {
            if ((i & this.f2332r) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: androidx.constraintlayout.motion.widget.q$a$a */
        public static class View$OnClickListenerC0587a implements View.OnClickListener {

            /* renamed from: a */
            int f2333a = -1;

            /* renamed from: b */
            int f2334b = 17;

            /* renamed from: c */
            private final C0586a f2335c;

            /* renamed from: a */
            public void mo3346a(MotionLayout motionLayout) {
                int i = this.f2333a;
                if (i != -1) {
                    View findViewById = motionLayout.findViewById(i);
                    if (findViewById == null) {
                        Log.e("MotionScene", " (*)  could not find id " + this.f2333a);
                        return;
                    }
                    findViewById.setOnClickListener(null);
                }
            }

            public void onClick(View view) {
                boolean z;
                boolean z2;
                boolean z3;
                MotionLayout motionLayout = this.f2335c.f2324j.f2293a;
                if (motionLayout.mo3177h()) {
                    if (this.f2335c.f2318d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.mo3149a(this.f2335c.f2317c);
                            return;
                        }
                        C0586a aVar = new C0586a(this.f2335c.f2324j, this.f2335c);
                        aVar.f2318d = currentState;
                        aVar.f2317c = this.f2335c.f2317c;
                        motionLayout.setTransition(aVar);
                        motionLayout.mo3160d();
                        return;
                    }
                    C0586a aVar2 = this.f2335c.f2324j.f2295c;
                    int i = this.f2334b;
                    boolean z4 = false;
                    if ((i & 1) == 0 && (i & DynamicModule.f58006b) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if ((i & 16) == 0 && (i & 4096) == 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z || !z2) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        C0586a aVar3 = this.f2335c.f2324j.f2295c;
                        C0586a aVar4 = this.f2335c;
                        if (aVar3 != aVar4) {
                            motionLayout.setTransition(aVar4);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z4 = z;
                            z2 = false;
                        }
                    } else {
                        z4 = z;
                    }
                    if (!mo3348a(aVar2, motionLayout)) {
                        return;
                    }
                    if (z4 && (this.f2334b & 1) != 0) {
                        motionLayout.setTransition(this.f2335c);
                        motionLayout.mo3160d();
                    } else if (z2 && (this.f2334b & 16) != 0) {
                        motionLayout.setTransition(this.f2335c);
                        motionLayout.mo3159c();
                    } else if (z4 && (this.f2334b & DynamicModule.f58006b) != 0) {
                        motionLayout.setTransition(this.f2335c);
                        motionLayout.setProgress(1.0f);
                    } else if (z2 && (this.f2334b & 4096) != 0) {
                        motionLayout.setTransition(this.f2335c);
                        motionLayout.setProgress(BitmapDescriptorFactory.HUE_RED);
                    }
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo3348a(C0586a aVar, MotionLayout motionLayout) {
                C0586a aVar2 = this.f2335c;
                if (aVar2 == aVar) {
                    return true;
                }
                int i = aVar2.f2317c;
                int i2 = this.f2335c.f2318d;
                if (i2 == -1) {
                    if (motionLayout.f2022f != i) {
                        return true;
                    }
                    return false;
                } else if (motionLayout.f2022f == i2 || motionLayout.f2022f == i) {
                    return true;
                } else {
                    return false;
                }
            }

            public View$OnClickListenerC0587a(Context context, C0586a aVar, XmlPullParser xmlPullParser) {
                this.f2335c = aVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), new int[]{R.attr.clickAction, R.attr.targetId});
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == 1) {
                        this.f2333a = obtainStyledAttributes.getResourceId(index, this.f2333a);
                    } else if (index == 0) {
                        this.f2334b = obtainStyledAttributes.getInt(index, this.f2334b);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* renamed from: a */
            public void mo3347a(MotionLayout motionLayout, int i, C0586a aVar) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                int i2 = this.f2333a;
                View view = motionLayout;
                if (i2 != -1) {
                    view = motionLayout.findViewById(i2);
                }
                if (view == null) {
                    Log.e("MotionScene", "OnClick could not find id " + this.f2333a);
                    return;
                }
                int i3 = aVar.f2318d;
                int i4 = aVar.f2317c;
                if (i3 == -1) {
                    view.setOnClickListener(this);
                    return;
                }
                int i5 = this.f2334b;
                boolean z5 = false;
                if ((i5 & 1) == 0 || i != i3) {
                    z = false;
                } else {
                    z = true;
                }
                if ((i5 & DynamicModule.f58006b) == 0 || i != i3) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                boolean z6 = z | z2;
                if ((i5 & 1) == 0 || i != i3) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                boolean z7 = z3 | z6;
                if ((i5 & 16) == 0 || i != i4) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                boolean z8 = z7 | z4;
                if ((i5 & 4096) != 0 && i == i4) {
                    z5 = true;
                }
                if (z8 || z5) {
                    view.setOnClickListener(this);
                }
            }
        }

        /* renamed from: a */
        public String mo3336a(Context context) {
            String str;
            if (this.f2318d == -1) {
                str = "null";
            } else {
                str = context.getResources().getResourceEntryName(this.f2318d);
            }
            if (this.f2317c == -1) {
                return str + " -> null";
            }
            return str + " -> " + context.getResources().getResourceEntryName(this.f2317c);
        }

        /* renamed from: a */
        public void mo3338a(Context context, XmlPullParser xmlPullParser) {
            this.f2327m.add(new View$OnClickListenerC0587a(context, this, xmlPullParser));
        }

        C0586a(C0584q qVar, C0586a aVar) {
            this.f2324j = qVar;
            if (aVar != null) {
                this.f2330p = aVar.f2330p;
                this.f2319e = aVar.f2319e;
                this.f2320f = aVar.f2320f;
                this.f2321g = aVar.f2321g;
                this.f2322h = aVar.f2322h;
                this.f2325k = aVar.f2325k;
                this.f2323i = aVar.f2323i;
                this.f2331q = aVar.f2331q;
            }
        }

        C0586a(C0584q qVar, Context context, XmlPullParser xmlPullParser) {
            this.f2322h = qVar.f2297e;
            this.f2331q = qVar.f2298f;
            this.f2324j = qVar;
            m2716a(qVar, context, Xml.asAttributeSet(xmlPullParser));
        }

        /* renamed from: a */
        private void m2716a(C0584q qVar, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842960, R.attr.autoTransition, R.attr.constraintSetEnd, R.attr.constraintSetStart, R.attr.duration, R.attr.layoutDuringTransition, R.attr.motionInterpolator, R.attr.pathMotionArc, R.attr.staggered, R.attr.transitionDisable, R.attr.transitionFlags});
            m2715a(qVar, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private void m2715a(C0584q qVar, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                if (index == 2) {
                    this.f2317c = typedArray.getResourceId(index, this.f2317c);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.f2317c))) {
                        C0689b bVar = new C0689b();
                        bVar.mo3900b(context, this.f2317c);
                        qVar.f2296d.append(this.f2317c, bVar);
                    }
                } else if (index == 3) {
                    this.f2318d = typedArray.getResourceId(index, this.f2318d);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.f2318d))) {
                        C0689b bVar2 = new C0689b();
                        bVar2.mo3900b(context, this.f2318d);
                        qVar.f2296d.append(this.f2318d, bVar2);
                    }
                } else if (index == 6) {
                    TypedValue peekValue = typedArray.peekValue(index);
                    if (peekValue.type == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f2321g = resourceId;
                        if (resourceId != -1) {
                            this.f2319e = -2;
                        }
                    } else if (peekValue.type == 3) {
                        String string = typedArray.getString(index);
                        this.f2320f = string;
                        if (string.indexOf("/") > 0) {
                            this.f2321g = typedArray.getResourceId(index, -1);
                            this.f2319e = -2;
                        } else {
                            this.f2319e = -1;
                        }
                    } else {
                        this.f2319e = typedArray.getInteger(index, this.f2319e);
                    }
                } else if (index == 4) {
                    this.f2322h = typedArray.getInt(index, this.f2322h);
                } else if (index == 8) {
                    this.f2323i = typedArray.getFloat(index, this.f2323i);
                } else if (index == 1) {
                    this.f2328n = typedArray.getInteger(index, this.f2328n);
                } else if (index == 0) {
                    this.f2315a = typedArray.getResourceId(index, this.f2315a);
                } else if (index == 9) {
                    this.f2329o = typedArray.getBoolean(index, this.f2329o);
                } else if (index == 7) {
                    this.f2330p = typedArray.getInteger(index, -1);
                } else if (index == 5) {
                    this.f2331q = typedArray.getInteger(index, 0);
                } else if (index == 10) {
                    this.f2332r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f2318d == -1) {
                this.f2316b = true;
            }
        }
    }

    /* renamed from: a */
    public ArrayList<C0586a> mo3306a() {
        return this.f2302j;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r2 != -1) goto L_0x0018;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3309a(int r7, int r8) {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0584q.mo3309a(int, int):void");
    }

    /* renamed from: a */
    public void mo3314a(C0586a aVar) {
        this.f2295c = aVar;
        if (aVar != null && aVar.f2326l != null) {
            this.f2295c.f2326l.mo3373a(this.f2312t);
        }
    }

    /* renamed from: a */
    public void mo3312a(MotionLayout motionLayout, int i) {
        Iterator<C0586a> it = this.f2302j.iterator();
        while (it.hasNext()) {
            C0586a next = it.next();
            if (next.f2327m.size() > 0) {
                Iterator<C0586a.View$OnClickListenerC0587a> it2 = next.f2327m.iterator();
                while (it2.hasNext()) {
                    it2.next().mo3346a(motionLayout);
                }
            }
        }
        Iterator<C0586a> it3 = this.f2304l.iterator();
        while (it3.hasNext()) {
            C0586a next2 = it3.next();
            if (next2.f2327m.size() > 0) {
                Iterator<C0586a.View$OnClickListenerC0587a> it4 = next2.f2327m.iterator();
                while (it4.hasNext()) {
                    it4.next().mo3346a(motionLayout);
                }
            }
        }
        Iterator<C0586a> it5 = this.f2302j.iterator();
        while (it5.hasNext()) {
            C0586a next3 = it5.next();
            if (next3.f2327m.size() > 0) {
                Iterator<C0586a.View$OnClickListenerC0587a> it6 = next3.f2327m.iterator();
                while (it6.hasNext()) {
                    it6.next().mo3347a(motionLayout, i, next3);
                }
            }
        }
        Iterator<C0586a> it7 = this.f2304l.iterator();
        while (it7.hasNext()) {
            C0586a next4 = it7.next();
            if (next4.f2327m.size() > 0) {
                Iterator<C0586a.View$OnClickListenerC0587a> it8 = next4.f2327m.iterator();
                while (it8.hasNext()) {
                    it8.next().mo3347a(motionLayout, i, next4);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3315a(boolean z) {
        this.f2312t = z;
        C0586a aVar = this.f2295c;
        if (aVar != null && aVar.f2326l != null) {
            this.f2295c.f2326l.mo3373a(this.f2312t);
        }
    }

    /* renamed from: a */
    public void mo3313a(C0581n nVar) {
        C0586a aVar = this.f2295c;
        if (aVar == null) {
            C0586a aVar2 = this.f2303k;
            if (aVar2 != null) {
                Iterator<C0572h> it = aVar2.f2325k.iterator();
                while (it.hasNext()) {
                    it.next().mo3257a(nVar);
                }
                return;
            }
            return;
        }
        Iterator<C0572h> it2 = aVar.f2325k.iterator();
        while (it2.hasNext()) {
            it2.next().mo3257a(nVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3310a(MotionEvent motionEvent, int i, MotionLayout motionLayout) {
        MotionLayout.AbstractC0542d dVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f2311s == null) {
            this.f2311s = this.f2293a.mo3146a();
        }
        this.f2311s.mo3221a(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.f2299g = motionEvent.getRawX();
                this.f2300h = motionEvent.getRawY();
                this.f2308p = motionEvent;
                this.f2309q = false;
                if (this.f2295c.f2326l != null) {
                    RectF b = this.f2295c.f2326l.mo3375b(this.f2293a, rectF);
                    if (b == null || b.contains(this.f2308p.getX(), this.f2308p.getY())) {
                        RectF a = this.f2295c.f2326l.mo3369a(this.f2293a, rectF);
                        if (a == null || a.contains(this.f2308p.getX(), this.f2308p.getY())) {
                            this.f2310r = false;
                        } else {
                            this.f2310r = true;
                        }
                        this.f2295c.f2326l.mo3376b(this.f2299g, this.f2300h);
                        return;
                    }
                    this.f2308p = null;
                    this.f2309q = true;
                    return;
                }
                return;
            } else if (action == 2 && !this.f2309q) {
                float rawY = motionEvent.getRawY() - this.f2300h;
                float rawX = motionEvent.getRawX() - this.f2299g;
                if ((((double) rawX) != 0.0d || ((double) rawY) != 0.0d) && (motionEvent2 = this.f2308p) != null) {
                    C0586a a2 = mo3304a(i, rawX, rawY, motionEvent2);
                    if (a2 != null) {
                        motionLayout.setTransition(a2);
                        RectF a3 = this.f2295c.f2326l.mo3369a(this.f2293a, rectF);
                        if (a3 != null && !a3.contains(this.f2308p.getX(), this.f2308p.getY())) {
                            z = true;
                        }
                        this.f2310r = z;
                        this.f2295c.f2326l.mo3371a(this.f2299g, this.f2300h);
                    }
                } else {
                    return;
                }
            }
        }
        if (!this.f2309q) {
            C0586a aVar = this.f2295c;
            if (!(aVar == null || aVar.f2326l == null || this.f2310r)) {
                this.f2295c.f2326l.mo3372a(motionEvent, this.f2311s, i, this);
            }
            this.f2299g = motionEvent.getRawX();
            this.f2300h = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (dVar = this.f2311s) != null) {
                dVar.mo3219a();
                this.f2311s = null;
                if (motionLayout.f2022f != -1) {
                    mo3318b(motionLayout, motionLayout.f2022f);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3311a(MotionLayout motionLayout) {
        for (int i = 0; i < this.f2296d.size(); i++) {
            int keyAt = this.f2296d.keyAt(i);
            if (m2682f(keyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            } else {
                m2683g(keyAt);
            }
        }
        for (int i2 = 0; i2 < this.f2296d.size(); i2++) {
            this.f2296d.valueAt(i2).mo3891a(motionLayout);
        }
    }

    /* renamed from: n */
    private boolean m2684n() {
        if (this.f2311s != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo3323d() {
        C0586a aVar = this.f2295c;
        if (aVar == null) {
            return -1;
        }
        return aVar.f2318d;
    }

    /* renamed from: g */
    public int mo3327g() {
        C0586a aVar = this.f2295c;
        if (aVar != null) {
            return aVar.f2322h;
        }
        return this.f2297e;
    }

    /* renamed from: h */
    public int mo3328h() {
        C0586a aVar = this.f2295c;
        if (aVar != null) {
            return aVar.f2330p;
        }
        return -1;
    }

    /* renamed from: i */
    public float mo3329i() {
        C0586a aVar = this.f2295c;
        if (aVar != null) {
            return aVar.f2323i;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3332l() {
        C0586a aVar = this.f2295c;
        if (aVar != null && aVar.f2326l != null) {
            this.f2295c.f2326l.mo3370a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo3325e() {
        C0586a aVar = this.f2295c;
        if (aVar == null) {
            return -1;
        }
        return aVar.f2317c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo3330j() {
        C0586a aVar = this.f2295c;
        if (aVar == null || aVar.f2326l == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return this.f2295c.f2326l.mo3374b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo3331k() {
        C0586a aVar = this.f2295c;
        if (aVar == null || aVar.f2326l == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return this.f2295c.f2326l.mo3377c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo3333m() {
        C0586a aVar = this.f2295c;
        if (aVar == null || aVar.f2326l == null) {
            return false;
        }
        return this.f2295c.f2326l.mo3380d();
    }

    /* renamed from: b */
    public int[] mo3319b() {
        int size = this.f2296d.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.f2296d.keyAt(i);
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3322c() {
        Iterator<C0586a> it = this.f2302j.iterator();
        while (it.hasNext()) {
            if (it.next().f2326l != null) {
                return true;
            }
        }
        C0586a aVar = this.f2295c;
        if (aVar == null || aVar.f2326l == null) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public Interpolator mo3326f() {
        int i = this.f2295c.f2319e;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.f2293a.getContext(), this.f2295c.f2321g);
        }
        if (i == -1) {
            final C0530c a = C0530c.m2431a(this.f2295c.f2320f);
            return new Interpolator() {
                /* class androidx.constraintlayout.motion.widget.C0584q.animationInterpolatorC05851 */

                public float getInterpolation(float f) {
                    return (float) a.mo3114a((double) f);
                }
            };
        } else if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        } else {
            if (i == 1) {
                return new AccelerateInterpolator();
            }
            if (i == 2) {
                return new DecelerateInterpolator();
            }
            if (i == 4) {
                return new AnticipateInterpolator();
            }
            if (i != 5) {
                return null;
            }
            return new BounceInterpolator();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0689b mo3321c(int i) {
        return mo3305a(i, -1, -1);
    }

    /* renamed from: e */
    private int m2681e(int i) {
        int a;
        C0696d dVar = this.f2294b;
        if (dVar == null || (a = dVar.mo3928a(i, -1, -1)) == -1) {
            return i;
        }
        return a;
    }

    /* renamed from: a */
    public static String m2677a(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1);
    }

    /* renamed from: b */
    public C0586a mo3316b(int i) {
        Iterator<C0586a> it = this.f2302j.iterator();
        while (it.hasNext()) {
            C0586a next = it.next();
            if (next.f2315a == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: d */
    public void mo3324d(int i) {
        C0586a aVar = this.f2295c;
        if (aVar != null) {
            aVar.mo3337a(i);
        } else {
            this.f2297e = i;
        }
    }

    /* renamed from: f */
    private boolean m2682f(int i) {
        int i2 = this.f2306n.get(i);
        int size = this.f2306n.size();
        while (i2 > 0) {
            if (i2 == i) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.f2306n.get(i2);
            size = i3;
        }
        return false;
    }

    /* renamed from: g */
    private void m2683g(int i) {
        int i2 = this.f2306n.get(i);
        if (i2 > 0) {
            m2683g(this.f2306n.get(i));
            C0689b bVar = this.f2296d.get(i);
            C0689b bVar2 = this.f2296d.get(i2);
            if (bVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + C0547a.m2558a(this.f2293a.getContext(), i2));
                return;
            }
            bVar.mo3894a(bVar2);
            this.f2306n.put(i, -1);
        }
    }

    /* renamed from: a */
    public List<C0586a> mo3307a(int i) {
        int e = m2681e(i);
        ArrayList arrayList = new ArrayList();
        Iterator<C0586a> it = this.f2302j.iterator();
        while (it.hasNext()) {
            C0586a next = it.next();
            if (next.f2318d == e || next.f2317c == e) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3308a(float f, float f2) {
        C0586a aVar = this.f2295c;
        if (aVar != null && aVar.f2326l != null) {
            this.f2295c.f2326l.mo3382e(f, f2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3317b(float f, float f2) {
        C0586a aVar = this.f2295c;
        if (aVar != null && aVar.f2326l != null) {
            this.f2295c.f2326l.mo3379d(f, f2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo3320c(float f, float f2) {
        C0586a aVar = this.f2295c;
        if (aVar == null || aVar.f2326l == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return this.f2295c.f2326l.mo3378c(f, f2);
    }

    /* renamed from: a */
    private void m2679a(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), new int[]{R.attr.defaultDuration, R.attr.layoutDuringTransition});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f2297e = obtainStyledAttributes.getInt(index, this.f2297e);
            } else if (index == 1) {
                this.f2298f = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private int m2676a(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f2307o) {
                PrintStream printStream = System.out;
                printStream.println("id getMap res = " + i);
            }
        } else {
            i = -1;
        }
        if (i != -1) {
            return i;
        }
        if (str != null && str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return i;
    }

    /* renamed from: b */
    private void m2680b(Context context, XmlPullParser xmlPullParser) {
        C0689b bVar = new C0689b();
        bVar.mo3895a(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlPullParser.getAttributeName(i3);
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            if (this.f2307o) {
                PrintStream printStream = System.out;
                printStream.println("id string = " + attributeValue);
            }
            attributeName.hashCode();
            if (attributeName.equals("deriveConstraintsFrom")) {
                i2 = m2676a(context, attributeValue);
            } else if (attributeName.equals("id")) {
                i = m2676a(context, attributeValue);
                this.f2305m.put(m2677a(attributeValue), Integer.valueOf(i));
            }
        }
        if (i != -1) {
            if (this.f2293a.f2032p != 0) {
                bVar.mo3902b(true);
            }
            bVar.mo3889a(context, xmlPullParser);
            if (i2 != -1) {
                this.f2306n.put(i, i2);
            }
            this.f2296d.put(i, bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo3318b(MotionLayout motionLayout, int i) {
        if (m2684n() || this.f2301i) {
            return false;
        }
        Iterator<C0586a> it = this.f2302j.iterator();
        while (it.hasNext()) {
            C0586a next = it.next();
            if (!(next.f2328n == 0 || this.f2295c == next)) {
                if (i == next.f2318d && (next.f2328n == 4 || next.f2328n == 2)) {
                    motionLayout.setState(MotionLayout.EnumC0546h.FINISHED);
                    motionLayout.setTransition(next);
                    if (next.f2328n == 4) {
                        motionLayout.mo3160d();
                        motionLayout.setState(MotionLayout.EnumC0546h.SETUP);
                        motionLayout.setState(MotionLayout.EnumC0546h.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.mo3156a(true);
                        motionLayout.setState(MotionLayout.EnumC0546h.SETUP);
                        motionLayout.setState(MotionLayout.EnumC0546h.MOVING);
                        motionLayout.setState(MotionLayout.EnumC0546h.FINISHED);
                        motionLayout.mo3162e();
                    }
                    return true;
                } else if (i == next.f2317c && (next.f2328n == 3 || next.f2328n == 1)) {
                    motionLayout.setState(MotionLayout.EnumC0546h.FINISHED);
                    motionLayout.setTransition(next);
                    if (next.f2328n == 3) {
                        motionLayout.mo3159c();
                        motionLayout.setState(MotionLayout.EnumC0546h.SETUP);
                        motionLayout.setState(MotionLayout.EnumC0546h.MOVING);
                    } else {
                        motionLayout.setProgress(BitmapDescriptorFactory.HUE_RED);
                        motionLayout.mo3156a(true);
                        motionLayout.setState(MotionLayout.EnumC0546h.SETUP);
                        motionLayout.setState(MotionLayout.EnumC0546h.MOVING);
                        motionLayout.setState(MotionLayout.EnumC0546h.FINISHED);
                        motionLayout.mo3162e();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
        if (r2.equals("Transition") != false) goto L_0x0084;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2678a(android.content.Context r9, int r10) {
        /*
        // Method dump skipped, instructions count: 374
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0584q.m2678a(android.content.Context, int):void");
    }

    C0584q(Context context, MotionLayout motionLayout, int i) {
        this.f2293a = motionLayout;
        m2678a(context, i);
        this.f2296d.put(R$id.motion_base, new C0689b());
        this.f2305m.put("motion_base", Integer.valueOf(R$id.motion_base));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0689b mo3305a(int i, int i2, int i3) {
        int a;
        if (this.f2307o) {
            PrintStream printStream = System.out;
            printStream.println("id " + i);
            PrintStream printStream2 = System.out;
            printStream2.println("size " + this.f2296d.size());
        }
        C0696d dVar = this.f2294b;
        if (!(dVar == null || (a = dVar.mo3928a(i, i2, i3)) == -1)) {
            i = a;
        }
        if (this.f2296d.get(i) != null) {
            return this.f2296d.get(i);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + C0547a.m2558a(this.f2293a.getContext(), i) + " In MotionScene");
        SparseArray<C0689b> sparseArray = this.f2296d;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    /* renamed from: a */
    public C0586a mo3304a(int i, float f, float f2, MotionEvent motionEvent) {
        RectF a;
        float f3;
        if (i == -1) {
            return this.f2295c;
        }
        List<C0586a> a2 = mo3307a(i);
        float f4 = BitmapDescriptorFactory.HUE_RED;
        C0586a aVar = null;
        RectF rectF = new RectF();
        for (C0586a aVar2 : a2) {
            if (!aVar2.f2329o && aVar2.f2326l != null) {
                aVar2.f2326l.mo3373a(this.f2312t);
                RectF a3 = aVar2.f2326l.mo3369a(this.f2293a, rectF);
                if ((a3 == null || motionEvent == null || a3.contains(motionEvent.getX(), motionEvent.getY())) && ((a = aVar2.f2326l.mo3369a(this.f2293a, rectF)) == null || motionEvent == null || a.contains(motionEvent.getX(), motionEvent.getY()))) {
                    float f5 = aVar2.f2326l.mo3383f(f, f2);
                    if (aVar2.f2317c == i) {
                        f3 = -1.0f;
                    } else {
                        f3 = 1.1f;
                    }
                    float f6 = f5 * f3;
                    if (f6 > f4) {
                        aVar = aVar2;
                        f4 = f6;
                    }
                }
            }
        }
        return aVar;
    }
}
