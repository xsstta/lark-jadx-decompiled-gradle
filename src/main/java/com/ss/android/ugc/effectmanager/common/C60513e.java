package com.ss.android.ugc.effectmanager.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.ss.android.ugc.effectmanager.common.e */
public class C60513e<K, V> {

    /* renamed from: a */
    private HashMap<K, Collection<V>> f151301a = new HashMap<>();

    /* renamed from: a */
    public Set<K> mo207198a() {
        return this.f151301a.keySet();
    }

    /* renamed from: b */
    public Collection<V> mo207200b() {
        Collection<Collection<V>> values = this.f151301a.values();
        ArrayList arrayList = new ArrayList();
        for (Collection<V> collection : values) {
            arrayList.addAll(collection);
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    /* renamed from: a */
    public Collection<V> mo207197a(K k) {
        Collection<V> collection = this.f151301a.get(k);
        if (collection == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableCollection(collection);
    }

    /* renamed from: a */
    public void mo207199a(K k, V v) {
        Collection<V> collection = this.f151301a.get(k);
        if (collection == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(v);
            this.f151301a.put(k, arrayList);
            return;
        }
        collection.add(v);
    }
}
