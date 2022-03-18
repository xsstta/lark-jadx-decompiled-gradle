package com.ss.android.videoshop.p3197d.p3198a;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.videoshop.api.AbstractC64101i;
import com.ss.android.videoshop.api.AbstractC64108o;
import com.ss.android.videoshop.p3194a.AbstractC64090d;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.android.videoshop.p3196c.AbstractC64123g;
import com.ss.android.videoshop.p3197d.AbstractC64152a;
import com.ss.android.videoshop.p3197d.AbstractC64158b;
import com.ss.android.videoshop.p3199e.C64159a;
import com.ss.android.videoshop.p3202h.C64169a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.videoshop.d.a.b */
public class C64154b implements AbstractC64158b {

    /* renamed from: a */
    private SparseArray<TreeSet<AbstractC64152a>> f162050a = new SparseArray<>();

    /* renamed from: b */
    private final SparseArray<TreeSet<AbstractC64152a>> f162051b = new SparseArray<>();

    /* renamed from: c */
    private SparseArray<AbstractC64152a> f162052c = new SparseArray<>();

    /* renamed from: d */
    private TreeSet<AbstractC64152a> f162053d = new TreeSet<>();

    /* renamed from: e */
    private AbstractC64155a f162054e;

    /* renamed from: f */
    private Map<Class<? extends AbstractC64101i>, AbstractC64101i> f162055f = new HashMap();

    /* renamed from: g */
    private List<AbstractC64101i> f162056g = new CopyOnWriteArrayList();

    /* renamed from: h */
    private boolean f162057h = false;

    /* renamed from: i */
    private boolean f162058i = false;

    /* renamed from: j */
    private final Set<Integer> f162059j = new LinkedHashSet();

    /* renamed from: k */
    private boolean f162060k = false;

    /* renamed from: l */
    private AbstractC64157d f162061l;

    /* renamed from: com.ss.android.videoshop.d.a.b$a */
    public interface AbstractC64155a {
        /* renamed from: a */
        void mo222248a(AbstractC64090d dVar);

        /* renamed from: a */
        boolean mo222249a();

        C64116b getBindPlayEntity();

        Context getContext();

        ViewGroup getLayerForePlayContainer();

        ViewGroup getLayerMainContainer();

        C64116b getPlayEntity();

        C64169a getPlaySettings();

        AbstractC64108o getVideoStateInquirer();
    }

    /* renamed from: i */
    public boolean mo222245i() {
        return this.f162057h;
    }

    /* renamed from: j */
    public boolean mo222246j() {
        return this.f162058i;
    }

    /* renamed from: k */
    public AbstractC64157d mo222247k() {
        return this.f162061l;
    }

    /* renamed from: a */
    public void mo222235a(boolean z) {
        this.f162057h = z;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64158b
    /* renamed from: a */
    public boolean mo222236a(AbstractC64123g gVar) {
        boolean z;
        if (gVar == null || this.f162050a == null) {
            return false;
        }
        if (this.f162059j.isEmpty() && !this.f162057h) {
            Iterator<AbstractC64152a> it = this.f162053d.iterator();
            while (it.hasNext()) {
                AbstractC64152a next = it.next();
                if (!next.mo222212t()) {
                    next.mo222207d(true);
                }
            }
        }
        this.f162059j.add(Integer.valueOf(gVar.mo221968b()));
        if (this.f162057h) {
            TreeSet<AbstractC64152a> treeSet = this.f162051b.get(gVar.mo221968b());
            if (treeSet != null && !treeSet.isEmpty()) {
                TreeSet<AbstractC64152a> treeSet2 = new TreeSet<>();
                m252038a(treeSet, treeSet2);
                Iterator<AbstractC64152a> it2 = treeSet2.iterator();
                while (it2.hasNext()) {
                    AbstractC64152a next2 = it2.next();
                    if (!next2.mo222212t()) {
                        next2.mo222207d(true);
                        next2.mo222204a(Collections.singletonList(Integer.valueOf(gVar.mo221968b())), mo222239c());
                    }
                }
            }
            if (!this.f162060k && this.f162058i) {
                Iterator<AbstractC64152a> it3 = this.f162053d.iterator();
                while (it3.hasNext()) {
                    AbstractC64152a next3 = it3.next();
                    if (next3 != null && next3.mo222210r() == null && !next3.mo222212t()) {
                        next3.mo222207d(true);
                        next3.mo222204a(Collections.singletonList(Integer.valueOf(gVar.mo221968b())), mo222239c());
                    }
                }
                this.f162060k = true;
            }
        }
        TreeSet<AbstractC64152a> treeSet3 = this.f162050a.get(gVar.mo221968b());
        if (treeSet3 != null && !treeSet3.isEmpty()) {
            Iterator it4 = new TreeSet((SortedSet) treeSet3).iterator();
            loop3:
            while (true) {
                z = false;
                while (true) {
                    if (!it4.hasNext()) {
                        break loop3;
                    }
                    AbstractC64152a aVar = (AbstractC64152a) it4.next();
                    if (aVar instanceof AbstractC64156c) {
                        if (!((AbstractC64156c) aVar).mo222257a(gVar) && !z) {
                        }
                    } else if (!aVar.mo163782a(gVar)) {
                    }
                    z = true;
                }
            }
        } else {
            z = false;
        }
        AbstractC64157d dVar = this.f162061l;
        if (dVar != null) {
            dVar.mo222258a(gVar);
        }
        if (gVar.mo221968b() == 101) {
            this.f162059j.clear();
            if (this.f162057h && this.f162058i) {
                Iterator<AbstractC64152a> it5 = this.f162053d.iterator();
                while (it5.hasNext()) {
                    AbstractC64152a next4 = it5.next();
                    if (next4 != null) {
                        next4.mo222207d(false);
                    }
                }
                this.f162060k = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void mo222234a(List<? extends AbstractC64152a> list) {
        for (AbstractC64152a aVar : m252039b(list)) {
            mo222233a(aVar);
        }
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64158b
    /* renamed from: a */
    public ViewGroup mo222228a() {
        AbstractC64155a aVar = this.f162054e;
        if (aVar != null) {
            return aVar.getLayerMainContainer();
        }
        return null;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64158b
    /* renamed from: b */
    public ViewGroup mo222237b() {
        AbstractC64155a aVar = this.f162054e;
        if (aVar != null) {
            return aVar.getLayerForePlayContainer();
        }
        return null;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64158b
    /* renamed from: c */
    public AbstractC64108o mo222239c() {
        AbstractC64155a aVar = this.f162054e;
        if (aVar != null) {
            return aVar.getVideoStateInquirer();
        }
        return null;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64158b
    /* renamed from: d */
    public boolean mo222240d() {
        AbstractC64155a aVar = this.f162054e;
        if (aVar == null || !aVar.mo222249a()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64158b
    /* renamed from: e */
    public Context mo222241e() {
        AbstractC64155a aVar = this.f162054e;
        if (aVar != null) {
            return aVar.getContext();
        }
        return null;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64158b
    /* renamed from: f */
    public C64116b mo222242f() {
        AbstractC64155a aVar = this.f162054e;
        if (aVar != null) {
            return aVar.getPlayEntity();
        }
        return null;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64158b
    /* renamed from: g */
    public C64116b mo222243g() {
        AbstractC64155a aVar = this.f162054e;
        if (aVar != null) {
            return aVar.getBindPlayEntity();
        }
        return null;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64158b
    /* renamed from: h */
    public C64169a mo222244h() {
        AbstractC64155a aVar = this.f162054e;
        if (aVar != null) {
            return aVar.getPlaySettings();
        }
        return null;
    }

    /* renamed from: a */
    public void mo222231a(AbstractC64155a aVar) {
        this.f162054e = aVar;
    }

    /* renamed from: b */
    public void mo222238b(boolean z) {
        this.f162058i = z;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64158b
    /* renamed from: a */
    public void mo222230a(AbstractC64090d dVar) {
        AbstractC64155a aVar = this.f162054e;
        if (aVar != null) {
            aVar.mo222248a(dVar);
        }
    }

    /* renamed from: b */
    private List<AbstractC64152a> m252039b(List<? extends AbstractC64152a> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (AbstractC64152a aVar : list) {
                if (aVar != null && this.f162052c.get(aVar.mo222208p()) == null) {
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public AbstractC64152a mo222229a(int i) {
        SparseArray<AbstractC64152a> sparseArray = this.f162052c;
        if (sparseArray != null) {
            return sparseArray.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public void mo222232a(AbstractC64157d dVar) {
        this.f162061l = dVar;
    }

    /* renamed from: a */
    public void mo222233a(AbstractC64152a aVar) {
        if (aVar != null) {
            if (this.f162052c.get(aVar.mo222208p()) != null) {
                C64159a.m252080a("BaseVideoLayerHost", "layerType:" + aVar.mo222208p() + " already exist, remove the old before adding new one! " + hashCode());
                return;
            }
            C64159a.m252080a("BaseVideoLayerHost", "add layer:" + aVar.getClass().getSimpleName() + " layerType:" + aVar.mo222208p() + " " + hashCode());
            this.f162052c.put(aVar.mo222208p(), aVar);
            ArrayList<Integer> c = aVar.mo163786c();
            if (c != null) {
                Iterator<Integer> it = c.iterator();
                while (it.hasNext()) {
                    m252037a(this.f162050a, it.next().intValue(), aVar);
                }
            }
            this.f162053d.add(aVar);
            AbstractC64101i m = aVar.mo163923m();
            if (m != null) {
                this.f162056g.add(m);
            }
            aVar.mo222203a(this);
            if (!this.f162057h) {
                Set<Integer> r = aVar.mo222210r();
                if (r != null && !r.isEmpty()) {
                    for (Integer num : r) {
                        m252037a(this.f162051b, num.intValue(), aVar);
                    }
                }
                aVar.mo222207d(true);
                return;
            }
            Set<Integer> r2 = aVar.mo222210r();
            ArrayList arrayList = null;
            if (r2 == null || r2.isEmpty()) {
                aVar.mo222207d(true);
                aVar.mo222204a(null, mo222239c());
                return;
            }
            for (Integer num2 : r2) {
                m252037a(this.f162051b, num2.intValue(), aVar);
                if (this.f162059j.contains(num2)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(num2);
                }
            }
            if (!(arrayList == null || arrayList.isEmpty())) {
                aVar.mo222207d(true);
                aVar.mo222204a(arrayList, mo222239c());
            }
        }
    }

    /* renamed from: a */
    private void m252038a(TreeSet<AbstractC64152a> treeSet, TreeSet<AbstractC64152a> treeSet2) {
        Iterator<AbstractC64152a> it = treeSet.iterator();
        while (it.hasNext()) {
            AbstractC64152a next = it.next();
            if (next != null) {
                treeSet2.add(next);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo222226a(View view, ViewGroup viewGroup) {
        if (view == null || viewGroup == null) {
            return -1;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (view == viewGroup.getChildAt(i)) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64158b
    /* renamed from: a */
    public int mo222227a(AbstractC64152a aVar, ViewGroup viewGroup) {
        TreeSet<AbstractC64152a> treeSet;
        int a;
        int a2;
        if (aVar == null || viewGroup == null || (treeSet = this.f162053d) == null || !treeSet.contains(aVar)) {
            return -1;
        }
        AbstractC64152a lower = this.f162053d.lower(aVar);
        while (lower != null && !lower.mo222209q()) {
            lower = this.f162053d.lower(lower);
        }
        if (lower != null && (a2 = mo222226a(lower.mo222201a(viewGroup), viewGroup)) >= 0) {
            return a2 + 1;
        }
        AbstractC64152a higher = this.f162053d.higher(aVar);
        while (higher != null && !higher.mo222209q()) {
            higher = this.f162053d.higher(higher);
        }
        if (higher == null || (a = mo222226a(higher.mo222205b(viewGroup), viewGroup)) < 0) {
            return viewGroup.getChildCount();
        }
        return a;
    }

    /* renamed from: a */
    private void m252037a(SparseArray<TreeSet<AbstractC64152a>> sparseArray, int i, AbstractC64152a aVar) {
        if (sparseArray.indexOfKey(i) >= 0) {
            sparseArray.get(i).add(aVar);
            return;
        }
        TreeSet<AbstractC64152a> treeSet = new TreeSet<>();
        treeSet.add(aVar);
        sparseArray.put(i, treeSet);
    }
}
