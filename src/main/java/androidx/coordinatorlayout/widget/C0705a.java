package androidx.coordinatorlayout.widget;

import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: androidx.coordinatorlayout.widget.a */
public final class C0705a<T> {

    /* renamed from: a */
    private final Pools.AbstractC0839a<ArrayList<T>> f3003a = new Pools.SimplePool(10);

    /* renamed from: b */
    private final SimpleArrayMap<T, ArrayList<T>> f3004b = new SimpleArrayMap<>();

    /* renamed from: c */
    private final ArrayList<T> f3005c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f3006d = new HashSet<>();

    /* renamed from: c */
    private ArrayList<T> m3498c() {
        ArrayList<T> acquire = this.f3003a.acquire();
        if (acquire == null) {
            return new ArrayList<>();
        }
        return acquire;
    }

    /* renamed from: a */
    public void mo4045a() {
        int size = this.f3004b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> valueAt = this.f3004b.valueAt(i);
            if (valueAt != null) {
                m3497a((ArrayList) valueAt);
            }
        }
        this.f3004b.clear();
    }

    /* renamed from: b */
    public ArrayList<T> mo4048b() {
        this.f3005c.clear();
        this.f3006d.clear();
        int size = this.f3004b.size();
        for (int i = 0; i < size; i++) {
            m3496a(this.f3004b.keyAt(i), this.f3005c, this.f3006d);
        }
        return this.f3005c;
    }

    /* renamed from: b */
    public boolean mo4049b(T t) {
        return this.f3004b.containsKey(t);
    }

    /* renamed from: a */
    private void m3497a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f3003a.release(arrayList);
    }

    /* renamed from: c */
    public List mo4050c(T t) {
        return this.f3004b.get(t);
    }

    /* renamed from: e */
    public boolean mo4052e(T t) {
        int size = this.f3004b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> valueAt = this.f3004b.valueAt(i);
            if (valueAt != null && valueAt.contains(t)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public List<T> mo4051d(T t) {
        int size = this.f3004b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> valueAt = this.f3004b.valueAt(i);
            if (valueAt != null && valueAt.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f3004b.keyAt(i));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo4046a(T t) {
        if (!this.f3004b.containsKey(t)) {
            this.f3004b.put(t, null);
        }
    }

    /* renamed from: a */
    public void mo4047a(T t, T t2) {
        if (!this.f3004b.containsKey(t) || !this.f3004b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.f3004b.get(t);
        if (arrayList == null) {
            arrayList = m3498c();
            this.f3004b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: a */
    private void m3496a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList<T> arrayList2 = this.f3004b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m3496a(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}
