package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.collection.ArrayMap;
import androidx.collection.C0516c;
import androidx.core.content.res.C0767f;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import org.xmlpull.v1.XmlPullParser;

public abstract class Transition implements Cloneable {

    /* renamed from: A */
    private static ThreadLocal<ArrayMap<Animator, C1502a>> f5264A = new ThreadLocal<>();

    /* renamed from: a */
    private static final int[] f5265a = {2, 1, 3, 4};

    /* renamed from: i */
    private static final PathMotion f5266i = new PathMotion() {
        /* class androidx.transition.Transition.C14991 */

        @Override // androidx.transition.PathMotion
        /* renamed from: a */
        public Path mo7802a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };

    /* renamed from: B */
    private ViewGroup f5267B = null;

    /* renamed from: C */
    private int f5268C = 0;

    /* renamed from: D */
    private boolean f5269D = false;

    /* renamed from: E */
    private boolean f5270E = false;

    /* renamed from: F */
    private ArrayList<AbstractC1505d> f5271F = null;

    /* renamed from: G */
    private ArrayList<Animator> f5272G = new ArrayList<>();

    /* renamed from: H */
    private AbstractC1504c f5273H;

    /* renamed from: I */
    private ArrayMap<String, String> f5274I;

    /* renamed from: J */
    private PathMotion f5275J = f5266i;

    /* renamed from: b */
    long f5276b = -1;

    /* renamed from: c */
    ArrayList<Integer> f5277c = new ArrayList<>();

    /* renamed from: d */
    ArrayList<View> f5278d = new ArrayList<>();

    /* renamed from: e */
    TransitionSet f5279e = null;

    /* renamed from: f */
    boolean f5280f = false;

    /* renamed from: g */
    ArrayList<Animator> f5281g = new ArrayList<>();

    /* renamed from: h */
    AbstractC1559w f5282h;

    /* renamed from: j */
    private String f5283j = getClass().getName();

    /* renamed from: k */
    private long f5284k = -1;

    /* renamed from: l */
    private TimeInterpolator f5285l = null;

    /* renamed from: m */
    private ArrayList<String> f5286m = null;

    /* renamed from: n */
    private ArrayList<Class<?>> f5287n = null;

    /* renamed from: o */
    private ArrayList<Integer> f5288o = null;

    /* renamed from: p */
    private ArrayList<View> f5289p = null;

    /* renamed from: q */
    private ArrayList<Class<?>> f5290q = null;

    /* renamed from: r */
    private ArrayList<String> f5291r = null;

    /* renamed from: s */
    private ArrayList<Integer> f5292s = null;

    /* renamed from: t */
    private ArrayList<View> f5293t = null;

    /* renamed from: u */
    private ArrayList<Class<?>> f5294u = null;

    /* renamed from: v */
    private C1563z f5295v = new C1563z();

    /* renamed from: w */
    private C1563z f5296w = new C1563z();

    /* renamed from: x */
    private int[] f5297x = f5265a;

    /* renamed from: y */
    private ArrayList<C1562y> f5298y;

    /* renamed from: z */
    private ArrayList<C1562y> f5299z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface MatchOrder {
    }

    /* renamed from: androidx.transition.Transition$c */
    public static abstract class AbstractC1504c {
        /* renamed from: a */
        public abstract Rect mo7930a(Transition transition);
    }

    /* renamed from: androidx.transition.Transition$d */
    public interface AbstractC1505d {
        /* renamed from: a */
        void mo7815a(Transition transition);

        /* renamed from: b */
        void mo7816b(Transition transition);

        /* renamed from: c */
        void mo7817c(Transition transition);

        /* renamed from: d */
        void mo7818d(Transition transition);

        /* renamed from: e */
        void mo7931e(Transition transition);
    }

    /* renamed from: a */
    private static boolean mo7874a(int i) {
        return i >= 1 && i <= 4;
    }

    /* renamed from: a */
    public Animator mo7806a(ViewGroup viewGroup, C1562y yVar, C1562y yVar2) {
        return null;
    }

    /* renamed from: a */
    public abstract void mo7807a(C1562y yVar);

    /* renamed from: a */
    public String[] mo7809a() {
        return null;
    }

    /* renamed from: b */
    public abstract void mo7810b(C1562y yVar);

    /* renamed from: b */
    public long mo7895b() {
        return this.f5276b;
    }

    /* renamed from: c */
    public long mo7904c() {
        return this.f5284k;
    }

    /* renamed from: d */
    public TimeInterpolator mo7908d() {
        return this.f5285l;
    }

    /* renamed from: f */
    public List<Integer> mo7912f() {
        return this.f5277c;
    }

    /* renamed from: g */
    public List<View> mo7914g() {
        return this.f5278d;
    }

    /* renamed from: h */
    public List<String> mo7915h() {
        return this.f5286m;
    }

    /* renamed from: i */
    public List<Class<?>> mo7916i() {
        return this.f5287n;
    }

    /* renamed from: m */
    public PathMotion mo7920m() {
        return this.f5275J;
    }

    /* renamed from: n */
    public AbstractC1504c mo7921n() {
        return this.f5273H;
    }

    /* renamed from: p */
    public AbstractC1559w mo7923p() {
        return this.f5282h;
    }

    /* renamed from: r */
    public String mo7925r() {
        return this.f5283j;
    }

    /* renamed from: a */
    public Transition mo7879a(TimeInterpolator timeInterpolator) {
        this.f5285l = timeInterpolator;
        return this;
    }

    /* renamed from: a */
    public void mo7893a(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.f5297x = f5265a;
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (!mo7874a(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            } else if (m6821a(iArr, i)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.f5297x = (int[]) iArr.clone();
    }

    /* renamed from: a */
    private static boolean m6821a(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m6818a(C1563z zVar, C1563z zVar2) {
        ArrayMap<View, C1562y> arrayMap = new ArrayMap<>(zVar.f5461a);
        ArrayMap<View, C1562y> arrayMap2 = new ArrayMap<>(zVar2.f5461a);
        int i = 0;
        while (true) {
            int[] iArr = this.f5297x;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m6813a(arrayMap, arrayMap2);
                } else if (i2 == 2) {
                    m6815a(arrayMap, arrayMap2, zVar.f5464d, zVar2.f5464d);
                } else if (i2 == 3) {
                    m6814a(arrayMap, arrayMap2, zVar.f5462b, zVar2.f5462b);
                } else if (i2 == 4) {
                    m6816a(arrayMap, arrayMap2, zVar.f5463c, zVar2.f5463c);
                }
                i++;
            } else {
                m6822b(arrayMap, arrayMap2);
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7888a(ViewGroup viewGroup, C1563z zVar, C1563z zVar2, ArrayList<C1562y> arrayList, ArrayList<C1562y> arrayList2) {
        int i;
        int i2;
        Animator a;
        View view;
        Animator animator;
        C1562y yVar;
        C1562y yVar2;
        Animator animator2;
        ArrayMap<Animator, C1502a> s = mo7944s();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C1562y yVar3 = arrayList.get(i3);
            C1562y yVar4 = arrayList2.get(i3);
            if (yVar3 != null && !yVar3.f5460c.contains(this)) {
                yVar3 = null;
            }
            if (yVar4 != null && !yVar4.f5460c.contains(this)) {
                yVar4 = null;
            }
            if (!(yVar3 == null && yVar4 == null)) {
                if ((yVar3 == null || yVar4 == null || mo7894a(yVar3, yVar4)) && (a = mo7806a(viewGroup, yVar3, yVar4)) != null) {
                    if (yVar4 != null) {
                        view = yVar4.f5459b;
                        String[] a2 = mo7809a();
                        if (a2 != null && a2.length > 0) {
                            yVar2 = new C1562y(view);
                            i2 = size;
                            C1562y yVar5 = zVar2.f5461a.get(view);
                            if (yVar5 != null) {
                                int i4 = 0;
                                while (i4 < a2.length) {
                                    yVar2.f5458a.put(a2[i4], yVar5.f5458a.get(a2[i4]));
                                    i4++;
                                    i3 = i3;
                                    yVar5 = yVar5;
                                }
                            }
                            i = i3;
                            int size2 = s.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    animator2 = a;
                                    break;
                                }
                                C1502a aVar = s.get(s.keyAt(i5));
                                if (aVar.f5305c != null && aVar.f5303a == view && aVar.f5304b.equals(mo7925r()) && aVar.f5305c.equals(yVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i2 = size;
                            i = i3;
                            animator2 = a;
                            yVar2 = null;
                        }
                        animator = animator2;
                        yVar = yVar2;
                    } else {
                        i2 = size;
                        i = i3;
                        view = yVar3.f5459b;
                        animator = a;
                        yVar = null;
                    }
                    if (animator != null) {
                        AbstractC1559w wVar = this.f5282h;
                        if (wVar != null) {
                            long a3 = wVar.mo7998a(viewGroup, this, yVar3, yVar4);
                            sparseIntArray.put(this.f5272G.size(), (int) a3);
                            j = Math.min(a3, j);
                        }
                        s.put(animator, new C1502a(view, mo7925r(), this, aj.m7000b(viewGroup), yVar));
                        this.f5272G.add(animator);
                        j = j;
                    }
                    i3 = i + 1;
                    size = i2;
                }
            }
            i2 = size;
            i = i3;
            i3 = i + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator3 = this.f5272G.get(sparseIntArray.keyAt(i6));
                animator3.setStartDelay((((long) sparseIntArray.valueAt(i6)) - j) + animator3.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo7903b(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f5288o;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f5289p;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f5290q;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f5290q.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (!(this.f5291r == null || ViewCompat.m4106u(view) == null || !this.f5291r.contains(ViewCompat.m4106u(view)))) {
            return false;
        }
        if ((this.f5277c.size() == 0 && this.f5278d.size() == 0 && (((arrayList = this.f5287n) == null || arrayList.isEmpty()) && ((arrayList2 = this.f5286m) == null || arrayList2.isEmpty()))) || this.f5277c.contains(Integer.valueOf(id)) || this.f5278d.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f5286m;
        if (arrayList6 != null && arrayList6.contains(ViewCompat.m4106u(view))) {
            return true;
        }
        if (this.f5287n != null) {
            for (int i2 = 0; i2 < this.f5287n.size(); i2++) {
                if (this.f5287n.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public Transition mo7883a(String str) {
        if (this.f5286m == null) {
            this.f5286m = new ArrayList<>();
        }
        this.f5286m.add(str);
        return this;
    }

    /* renamed from: a */
    public Transition mo7881a(Class<?> cls) {
        if (this.f5287n == null) {
            this.f5287n = new ArrayList<>();
        }
        this.f5287n.add(cls);
        return this;
    }

    /* renamed from: a */
    public Transition mo7877a(int i, boolean z) {
        this.f5288o = m6809a(this.f5288o, i, z);
        return this;
    }

    /* renamed from: a */
    public Transition mo7884a(String str, boolean z) {
        this.f5291r = m6811a(this.f5291r, str, z);
        return this;
    }

    /* renamed from: a */
    public Transition mo7882a(Class<?> cls, boolean z) {
        this.f5290q = m6810a(this.f5290q, cls, z);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7889a(ViewGroup viewGroup, boolean z) {
        ArrayMap<String, String> arrayMap;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        mo7902b(z);
        if ((this.f5277c.size() > 0 || this.f5278d.size() > 0) && (((arrayList = this.f5286m) == null || arrayList.isEmpty()) && ((arrayList2 = this.f5287n) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f5277c.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f5277c.get(i).intValue());
                if (findViewById != null) {
                    C1562y yVar = new C1562y(findViewById);
                    if (z) {
                        mo7807a(yVar);
                    } else {
                        mo7810b(yVar);
                    }
                    yVar.f5460c.add(this);
                    mo7906c(yVar);
                    if (z) {
                        m6817a(this.f5295v, findViewById, yVar);
                    } else {
                        m6817a(this.f5296w, findViewById, yVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f5278d.size(); i2++) {
                View view = this.f5278d.get(i2);
                C1562y yVar2 = new C1562y(view);
                if (z) {
                    mo7807a(yVar2);
                } else {
                    mo7810b(yVar2);
                }
                yVar2.f5460c.add(this);
                mo7906c(yVar2);
                if (z) {
                    m6817a(this.f5295v, view, yVar2);
                } else {
                    m6817a(this.f5296w, view, yVar2);
                }
            }
        } else {
            m6823c(viewGroup, z);
        }
        if (!(z || (arrayMap = this.f5274I) == null)) {
            int size = arrayMap.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f5295v.f5464d.remove(this.f5274I.keyAt(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.f5295v.f5464d.put(this.f5274I.valueAt(i4), view2);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m6817a(C1563z zVar, View view, C1562y yVar) {
        zVar.f5461a.put(view, yVar);
        int id = view.getId();
        if (id >= 0) {
            if (zVar.f5462b.indexOfKey(id) >= 0) {
                zVar.f5462b.put(id, null);
            } else {
                zVar.f5462b.put(id, view);
            }
        }
        String u = ViewCompat.m4106u(view);
        if (u != null) {
            if (zVar.f5464d.containsKey(u)) {
                zVar.f5464d.put(u, null);
            } else {
                zVar.f5464d.put(u, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (zVar.f5463c.mo2966c(itemIdAtPosition) >= 0) {
                    View a = zVar.f5463c.mo2959a(itemIdAtPosition);
                    if (a != null) {
                        ViewCompat.m4049a(a, false);
                        zVar.f5463c.mo2965b(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                ViewCompat.m4049a(view, true);
                zVar.f5463c.mo2965b(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: a */
    public C1562y mo7885a(View view, boolean z) {
        TransitionSet transitionSet = this.f5279e;
        if (transitionSet != null) {
            return transitionSet.mo7885a(view, z);
        }
        return (z ? this.f5295v : this.f5296w).f5461a.get(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7887a(ViewGroup viewGroup) {
        C1502a aVar;
        this.f5298y = new ArrayList<>();
        this.f5299z = new ArrayList<>();
        m6818a(this.f5295v, this.f5296w);
        ArrayMap<Animator, C1502a> s = mo7944s();
        int size = s.size();
        AbstractC1527at b = aj.m7000b(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator keyAt = s.keyAt(i);
            if (!(keyAt == null || (aVar = s.get(keyAt)) == null || aVar.f5303a == null || !b.equals(aVar.f5306d))) {
                C1562y yVar = aVar.f5305c;
                View view = aVar.f5303a;
                C1562y a = mo7885a(view, true);
                C1562y b2 = mo7899b(view, true);
                if (a == null && b2 == null) {
                    b2 = this.f5296w.f5461a.get(view);
                }
                if (!(a == null && b2 == null) && aVar.f5307e.mo7894a(yVar, b2)) {
                    if (keyAt.isRunning() || keyAt.isStarted()) {
                        keyAt.cancel();
                    } else {
                        s.remove(keyAt);
                    }
                }
            }
        }
        mo7888a(viewGroup, this.f5295v, this.f5296w, this.f5298y, this.f5299z);
        mo7910e();
    }

    /* renamed from: a */
    public boolean mo7894a(C1562y yVar, C1562y yVar2) {
        if (yVar == null || yVar2 == null) {
            return false;
        }
        String[] a = mo7809a();
        if (a != null) {
            for (String str : a) {
                if (!m6820a(yVar, yVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : yVar.f5458a.keySet()) {
            if (m6820a(yVar, yVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: a */
    private static boolean m6820a(C1562y yVar, C1562y yVar2, String str) {
        Object obj = yVar.f5458a.get(str);
        Object obj2 = yVar2.f5458a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7886a(Animator animator) {
        if (animator == null) {
            mo7918k();
            return;
        }
        if (mo7895b() >= 0) {
            animator.setDuration(mo7895b());
        }
        if (mo7904c() >= 0) {
            animator.setStartDelay(mo7904c() + animator.getStartDelay());
        }
        if (mo7908d() != null) {
            animator.setInterpolator(mo7908d());
        }
        animator.addListener(new AnimatorListenerAdapter() {
            /* class androidx.transition.Transition.C15013 */

            public void onAnimationEnd(Animator animator) {
                Transition.this.mo7918k();
                animator.removeListener(this);
            }
        });
        animator.start();
    }

    /* renamed from: a */
    public Transition mo7880a(AbstractC1505d dVar) {
        if (this.f5271F == null) {
            this.f5271F = new ArrayList<>();
        }
        this.f5271F.add(dVar);
        return this;
    }

    /* renamed from: a */
    public void mo7890a(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.f5275J = f5266i;
        } else {
            this.f5275J = pathMotion;
        }
    }

    /* renamed from: a */
    public void mo7891a(AbstractC1504c cVar) {
        this.f5273H = cVar;
    }

    /* renamed from: a */
    public void mo7892a(AbstractC1559w wVar) {
        this.f5282h = wVar;
    }

    public String toString() {
        return mo7900b("");
    }

    /* renamed from: o */
    public Rect mo7922o() {
        AbstractC1504c cVar = this.f5273H;
        if (cVar == null) {
            return null;
        }
        return cVar.mo7930a(this);
    }

    /* renamed from: s */
    private static ArrayMap<Animator, C1502a> mo7944s() {
        ArrayMap<Animator, C1502a> arrayMap = f5264A.get();
        if (arrayMap != null) {
            return arrayMap;
        }
        ArrayMap<Animator, C1502a> arrayMap2 = new ArrayMap<>();
        f5264A.set(arrayMap2);
        return arrayMap2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo7910e() {
        mo7917j();
        ArrayMap<Animator, C1502a> s = mo7944s();
        Iterator<Animator> it = this.f5272G.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (s.containsKey(next)) {
                mo7917j();
                m6812a(next, s);
            }
        }
        this.f5272G.clear();
        mo7918k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo7917j() {
        if (this.f5268C == 0) {
            ArrayList<AbstractC1505d> arrayList = this.f5271F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5271F.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC1505d) arrayList2.get(i)).mo7931e(this);
                }
            }
            this.f5270E = false;
        }
        this.f5268C++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo7919l() {
        for (int size = this.f5281g.size() - 1; size >= 0; size--) {
            this.f5281g.get(size).cancel();
        }
        ArrayList<AbstractC1505d> arrayList = this.f5271F;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f5271F.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((AbstractC1505d) arrayList2.get(i)).mo7815a(this);
            }
        }
    }

    /* renamed from: q */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f5272G = new ArrayList<>();
            transition.f5295v = new C1563z();
            transition.f5296w = new C1563z();
            transition.f5298y = null;
            transition.f5299z = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Transition() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo7918k() {
        int i = this.f5268C - 1;
        this.f5268C = i;
        if (i == 0) {
            ArrayList<AbstractC1505d> arrayList = this.f5271F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5271F.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC1505d) arrayList2.get(i2)).mo7816b(this);
                }
            }
            for (int i3 = 0; i3 < this.f5295v.f5463c.mo2962b(); i3++) {
                View c = this.f5295v.f5463c.mo2967c(i3);
                if (c != null) {
                    ViewCompat.m4049a(c, false);
                }
            }
            for (int i4 = 0; i4 < this.f5296w.f5463c.mo2962b(); i4++) {
                View c2 = this.f5296w.f5463c.mo2967c(i4);
                if (c2 != null) {
                    ViewCompat.m4049a(c2, false);
                }
            }
            this.f5270E = true;
        }
    }

    /* renamed from: a */
    public Transition mo7878a(long j) {
        this.f5276b = j;
        return this;
    }

    /* renamed from: b */
    public Transition mo7897b(long j) {
        this.f5284k = j;
        return this;
    }

    /* renamed from: c */
    public Transition mo7905c(View view) {
        this.f5278d.add(view);
        return this;
    }

    /* renamed from: d */
    public Transition mo7909d(View view) {
        this.f5278d.remove(view);
        return this;
    }

    /* renamed from: b */
    public Transition mo7896b(int i) {
        if (i != 0) {
            this.f5277c.add(Integer.valueOf(i));
        }
        return this;
    }

    /* renamed from: b */
    public Transition mo7898b(AbstractC1505d dVar) {
        ArrayList<AbstractC1505d> arrayList = this.f5271F;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.f5271F.size() == 0) {
            this.f5271F = null;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7906c(C1562y yVar) {
        String[] a;
        if (this.f5282h != null && !yVar.f5458a.isEmpty() && (a = this.f5282h.mo7990a()) != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= a.length) {
                    z = true;
                    break;
                } else if (!yVar.f5458a.containsKey(a[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.f5282h.mo7989a(yVar);
            }
        }
    }

    /* renamed from: c */
    private static int[] mo7939c(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                iArr[i] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[(iArr.length - 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            } else {
                throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
            }
            i++;
        }
        return iArr;
    }

    /* renamed from: e */
    public void mo7911e(View view) {
        if (!this.f5270E) {
            ArrayMap<Animator, C1502a> s = mo7944s();
            int size = s.size();
            AbstractC1527at b = aj.m7000b(view);
            for (int i = size - 1; i >= 0; i--) {
                C1502a valueAt = s.valueAt(i);
                if (valueAt.f5303a != null && b.equals(valueAt.f5306d)) {
                    C1511a.m6956a(s.keyAt(i));
                }
            }
            ArrayList<AbstractC1505d> arrayList = this.f5271F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5271F.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((AbstractC1505d) arrayList2.get(i2)).mo7817c(this);
                }
            }
            this.f5269D = true;
        }
    }

    /* renamed from: f */
    public void mo7913f(View view) {
        if (this.f5269D) {
            if (!this.f5270E) {
                ArrayMap<Animator, C1502a> s = mo7944s();
                int size = s.size();
                AbstractC1527at b = aj.m7000b(view);
                for (int i = size - 1; i >= 0; i--) {
                    C1502a valueAt = s.valueAt(i);
                    if (valueAt.f5303a != null && b.equals(valueAt.f5306d)) {
                        C1511a.m6958b(s.keyAt(i));
                    }
                }
                ArrayList<AbstractC1505d> arrayList = this.f5271F;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f5271F.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((AbstractC1505d) arrayList2.get(i2)).mo7818d(this);
                    }
                }
            }
            this.f5269D = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7901b(ViewGroup viewGroup) {
        ArrayMap<Animator, C1502a> s = mo7944s();
        int size = s.size();
        if (!(viewGroup == null || size == 0)) {
            AbstractC1527at b = aj.m7000b(viewGroup);
            ArrayMap arrayMap = new ArrayMap(s);
            s.clear();
            for (int i = size - 1; i >= 0; i--) {
                C1502a aVar = (C1502a) arrayMap.valueAt(i);
                if (!(aVar.f5303a == null || b == null || !b.equals(aVar.f5306d))) {
                    ((Animator) arrayMap.keyAt(i)).end();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo7900b(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f5276b != -1) {
            str2 = str2 + "dur(" + this.f5276b + ") ";
        }
        if (this.f5284k != -1) {
            str2 = str2 + "dly(" + this.f5284k + ") ";
        }
        if (this.f5285l != null) {
            str2 = str2 + "interp(" + this.f5285l + ") ";
        }
        if (this.f5277c.size() <= 0 && this.f5278d.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f5277c.size() > 0) {
            for (int i = 0; i < this.f5277c.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f5277c.get(i);
            }
        }
        if (this.f5278d.size() > 0) {
            for (int i2 = 0; i2 < this.f5278d.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f5278d.get(i2);
            }
        }
        return str3 + ")";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7902b(boolean z) {
        if (z) {
            this.f5295v.f5461a.clear();
            this.f5295v.f5462b.clear();
            this.f5295v.f5463c.mo2971d();
            return;
        }
        this.f5296w.f5461a.clear();
        this.f5296w.f5462b.clear();
        this.f5296w.f5463c.mo2971d();
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.transition.Transition$b */
    public static class C1503b {
        /* renamed from: b */
        static <T> ArrayList<T> m6880b(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }

        /* renamed from: a */
        static <T> ArrayList<T> m6879a(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t)) {
                arrayList.add(t);
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C1562y mo7899b(View view, boolean z) {
        ArrayList<C1562y> arrayList;
        ArrayList<C1562y> arrayList2;
        TransitionSet transitionSet = this.f5279e;
        if (transitionSet != null) {
            return transitionSet.mo7899b(view, z);
        }
        if (z) {
            arrayList = this.f5298y;
        } else {
            arrayList = this.f5299z;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C1562y yVar = arrayList.get(i2);
            if (yVar == null) {
                return null;
            }
            if (yVar.f5459b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        if (z) {
            arrayList2 = this.f5299z;
        } else {
            arrayList2 = this.f5298y;
        }
        return arrayList2.get(i);
    }

    /* renamed from: a */
    private void m6812a(Animator animator, final ArrayMap<Animator, C1502a> arrayMap) {
        if (animator != null) {
            animator.addListener(new AnimatorListenerAdapter() {
                /* class androidx.transition.Transition.C15002 */

                public void onAnimationStart(Animator animator) {
                    Transition.this.f5281g.add(animator);
                }

                public void onAnimationEnd(Animator animator) {
                    arrayMap.remove(animator);
                    Transition.this.f5281g.remove(animator);
                }
            });
            mo7886a(animator);
        }
    }

    /* renamed from: b */
    private void m6822b(ArrayMap<View, C1562y> arrayMap, ArrayMap<View, C1562y> arrayMap2) {
        for (int i = 0; i < arrayMap.size(); i++) {
            C1562y valueAt = arrayMap.valueAt(i);
            if (mo7903b(valueAt.f5459b)) {
                this.f5298y.add(valueAt);
                this.f5299z.add(null);
            }
        }
        for (int i2 = 0; i2 < arrayMap2.size(); i2++) {
            C1562y valueAt2 = arrayMap2.valueAt(i2);
            if (mo7903b(valueAt2.f5459b)) {
                this.f5299z.add(valueAt2);
                this.f5298y.add(null);
            }
        }
    }

    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1553s.f5433c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long a = (long) C0767f.m3693a(obtainStyledAttributes, (XmlPullParser) xmlResourceParser, "duration", 1, -1);
        if (a >= 0) {
            mo7878a(a);
        }
        long a2 = (long) C0767f.m3693a(obtainStyledAttributes, (XmlPullParser) xmlResourceParser, "startDelay", 2, -1);
        if (a2 > 0) {
            mo7897b(a2);
        }
        int c = C0767f.m3703c(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (c > 0) {
            mo7879a(AnimationUtils.loadInterpolator(context, c));
        }
        String a3 = C0767f.m3698a(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (a3 != null) {
            mo7893a(mo7939c(a3));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m6813a(ArrayMap<View, C1562y> arrayMap, ArrayMap<View, C1562y> arrayMap2) {
        C1562y remove;
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            View keyAt = arrayMap.keyAt(size);
            if (keyAt != null && mo7903b(keyAt) && (remove = arrayMap2.remove(keyAt)) != null && mo7903b(remove.f5459b)) {
                this.f5298y.add(arrayMap.removeAt(size));
                this.f5299z.add(remove);
            }
        }
    }

    /* renamed from: c */
    private void m6823c(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f5288o;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f5289p;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f5290q;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        for (int i = 0; i < size; i++) {
                            if (this.f5290q.get(i).isInstance(view)) {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C1562y yVar = new C1562y(view);
                        if (z) {
                            mo7807a(yVar);
                        } else {
                            mo7810b(yVar);
                        }
                        yVar.f5460c.add(this);
                        mo7906c(yVar);
                        if (z) {
                            m6817a(this.f5295v, view, yVar);
                        } else {
                            m6817a(this.f5296w, view, yVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f5292s;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f5293t;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f5294u;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        if (this.f5294u.get(i2).isInstance(view)) {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    m6823c(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private ArrayList<Class<?>> m6810a(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z) {
        if (cls == null) {
            return arrayList;
        }
        if (z) {
            return C1503b.m6879a(arrayList, cls);
        }
        return C1503b.m6880b(arrayList, cls);
    }

    /* renamed from: a */
    private ArrayList<Integer> m6809a(ArrayList<Integer> arrayList, int i, boolean z) {
        if (i <= 0) {
            return arrayList;
        }
        if (z) {
            return C1503b.m6879a(arrayList, Integer.valueOf(i));
        }
        return C1503b.m6880b(arrayList, Integer.valueOf(i));
    }

    /* renamed from: a */
    private static <T> ArrayList<T> m6811a(ArrayList<T> arrayList, T t, boolean z) {
        if (t == null) {
            return arrayList;
        }
        if (z) {
            return C1503b.m6879a(arrayList, t);
        }
        return C1503b.m6880b(arrayList, t);
    }

    /* renamed from: a */
    private void m6814a(ArrayMap<View, C1562y> arrayMap, ArrayMap<View, C1562y> arrayMap2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && mo7903b(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && mo7903b(view)) {
                C1562y yVar = arrayMap.get(valueAt);
                C1562y yVar2 = arrayMap2.get(view);
                if (!(yVar == null || yVar2 == null)) {
                    this.f5298y.add(yVar);
                    this.f5299z.add(yVar2);
                    arrayMap.remove(valueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    /* renamed from: a */
    private void m6815a(ArrayMap<View, C1562y> arrayMap, ArrayMap<View, C1562y> arrayMap2, ArrayMap<String, View> arrayMap3, ArrayMap<String, View> arrayMap4) {
        View view;
        int size = arrayMap3.size();
        for (int i = 0; i < size; i++) {
            View valueAt = arrayMap3.valueAt(i);
            if (valueAt != null && mo7903b(valueAt) && (view = arrayMap4.get(arrayMap3.keyAt(i))) != null && mo7903b(view)) {
                C1562y yVar = arrayMap.get(valueAt);
                C1562y yVar2 = arrayMap2.get(view);
                if (!(yVar == null || yVar2 == null)) {
                    this.f5298y.add(yVar);
                    this.f5299z.add(yVar2);
                    arrayMap.remove(valueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    /* renamed from: a */
    private void m6816a(ArrayMap<View, C1562y> arrayMap, ArrayMap<View, C1562y> arrayMap2, C0516c<View> cVar, C0516c<View> cVar2) {
        View a;
        int b = cVar.mo2962b();
        for (int i = 0; i < b; i++) {
            View c = cVar.mo2967c(i);
            if (c != null && mo7903b(c) && (a = cVar2.mo2959a(cVar.mo2963b(i))) != null && mo7903b(a)) {
                C1562y yVar = arrayMap.get(c);
                C1562y yVar2 = arrayMap2.get(a);
                if (!(yVar == null || yVar2 == null)) {
                    this.f5298y.add(yVar);
                    this.f5299z.add(yVar2);
                    arrayMap.remove(c);
                    arrayMap2.remove(a);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.transition.Transition$a */
    public static class C1502a {

        /* renamed from: a */
        View f5303a;

        /* renamed from: b */
        String f5304b;

        /* renamed from: c */
        C1562y f5305c;

        /* renamed from: d */
        AbstractC1527at f5306d;

        /* renamed from: e */
        Transition f5307e;

        C1502a(View view, String str, Transition transition, AbstractC1527at atVar, C1562y yVar) {
            this.f5303a = view;
            this.f5304b = str;
            this.f5305c = yVar;
            this.f5306d = atVar;
            this.f5307e = transition;
        }
    }
}
