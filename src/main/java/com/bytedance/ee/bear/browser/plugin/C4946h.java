package com.bytedance.ee.bear.browser.plugin;

import com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.ee.bear.browser.plugin.h */
public class C4946h {

    /* renamed from: a */
    private final List<C4947a> f14517a;

    /* renamed from: b */
    private List<AbstractC4941c> f14518b = new ArrayList();

    /* renamed from: com.bytedance.ee.bear.browser.plugin.h$a */
    public static class C4947a {

        /* renamed from: a */
        public AbstractC4941c f14519a;

        /* renamed from: b */
        public boolean f14520b = true;

        /* renamed from: c */
        public String f14521c = "Tag#NotSet";

        /* renamed from: d */
        public int f14522d = Integer.MIN_VALUE;

        /* renamed from: e */
        public PluginMountStrategy f14523e;
    }

    /* renamed from: a */
    public static C4947a m20449a(AbstractC4941c<?> cVar, boolean z) {
        return m20443a(cVar, Integer.MIN_VALUE, z, (PluginMountStrategy) null);
    }

    /* renamed from: a */
    public static C4947a m20450a(AbstractC4941c<?> cVar, boolean z, PluginMountStrategy pluginMountStrategy) {
        return m20443a(cVar, Integer.MIN_VALUE, z, pluginMountStrategy);
    }

    /* renamed from: a */
    public static C4946h m20453a(C4947a... aVarArr) {
        return new C4946h(aVarArr);
    }

    /* renamed from: a */
    public static C4946h m20452a(List<C4947a> list) {
        return new C4946h(list);
    }

    /* renamed from: a */
    public static C4946h m20451a(C4946h hVar, C4946h hVar2) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        m20454a(hVar.f14517a, arrayList, hashSet, hashSet2);
        m20454a(hVar2.f14517a, arrayList, hashSet, hashSet2);
        C4947a[] aVarArr = new C4947a[arrayList.size()];
        arrayList.toArray(aVarArr);
        return new C4946h(aVarArr);
    }

    /* renamed from: a */
    private static void m20454a(Collection<C4947a> collection, List<C4947a> list, Set<Class> set, Set<Integer> set2) {
        if (!(collection == null || collection.isEmpty())) {
            for (C4947a aVar : collection) {
                Class<?> cls = aVar.f14519a.getClass();
                boolean contains = set.contains(cls);
                boolean contains2 = set2.contains(Integer.valueOf(aVar.f14522d));
                if (contains || contains2) {
                    if (contains) {
                        C13479a.m54774d("PluginList", new IllegalStateException("Found same type plugin :" + cls));
                    }
                    if (contains2) {
                        C13479a.m54774d("PluginList", new IllegalStateException("Found same level plugin :" + cls));
                    }
                } else {
                    set.add(cls);
                    list.add(aVar);
                    if (!(aVar.f14522d == Integer.MIN_VALUE || aVar.f14522d == Integer.MAX_VALUE)) {
                        set2.add(Integer.valueOf(aVar.f14522d));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public <T extends AbstractC4941c> T mo19570a(Class<T> cls) {
        Iterator<AbstractC4941c> it = this.f14518b.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (cls.isAssignableFrom(t.getClass())) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<C4947a> mo19572a(boolean z) {
        if (!z) {
            return this.f14517a;
        }
        ArrayList arrayList = new ArrayList();
        for (C4947a aVar : this.f14517a) {
            if (aVar.f14520b) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<AbstractC4941c, C4947a> mo19573a() {
        HashMap hashMap = new HashMap();
        for (C4947a aVar : this.f14517a) {
            hashMap.put(aVar.f14519a, aVar);
        }
        return hashMap;
    }

    /* renamed from: a */
    public C4946h mo19571a(PluginMountStrategy pluginMountStrategy) {
        C13479a.m54764b("PluginList", "setDefaultMountStrategy:" + pluginMountStrategy);
        for (C4947a aVar : this.f14517a) {
            if (aVar.f14523e == null) {
                aVar.f14523e = pluginMountStrategy;
            }
        }
        return this;
    }

    /* renamed from: b */
    private void m20456b() {
        for (C4947a aVar : this.f14517a) {
            if (aVar.f14520b) {
                this.f14518b.add(aVar.f14519a);
            }
        }
    }

    /* renamed from: a */
    public static C4947a m20440a(AbstractC4941c<?> cVar) {
        return m20455b(cVar);
    }

    /* renamed from: b */
    public static C4947a m20455b(AbstractC4941c<?> cVar) {
        return m20449a(cVar, true);
    }

    private C4946h(List<C4947a> list) {
        this.f14517a = list == null ? new ArrayList<>() : list;
        m20456b();
    }

    /* renamed from: c */
    public C4947a mo19575c(AbstractC4941c<?> cVar) {
        for (C4947a aVar : this.f14517a) {
            if (aVar.f14519a == cVar) {
                return aVar;
            }
        }
        return null;
    }

    private C4946h(C4947a[] aVarArr) {
        List<C4947a> list;
        if (aVarArr == null) {
            list = Collections.emptyList();
        } else {
            list = new ArrayList(Arrays.asList(aVarArr));
        }
        this.f14517a = list;
        m20456b();
    }

    /* renamed from: b */
    public void mo19574b(Class<? extends AbstractC4941c> cls) {
        Iterator<C4947a> it = this.f14517a.iterator();
        while (it.hasNext()) {
            C4947a next = it.next();
            if (cls.isAssignableFrom(next.f14519a.getClass())) {
                it.remove();
                if (next.f14520b) {
                    this.f14518b.remove(next.f14519a);
                }
            }
        }
    }

    /* renamed from: a */
    public static C4947a m20441a(AbstractC4941c<?> cVar, int i) {
        return m20443a(cVar, i, true, (PluginMountStrategy) null);
    }

    /* renamed from: a */
    public static C4947a m20444a(AbstractC4941c<?> cVar, PluginMountStrategy pluginMountStrategy) {
        return m20443a(cVar, Integer.MIN_VALUE, true, pluginMountStrategy);
    }

    /* renamed from: a */
    public static C4947a m20445a(AbstractC4941c<?> cVar, Enum<?> r3) {
        return m20443a(cVar, r3.ordinal(), true, (PluginMountStrategy) null);
    }

    /* renamed from: a */
    public static C4947a m20442a(AbstractC4941c<?> cVar, int i, PluginMountStrategy pluginMountStrategy) {
        return m20443a(cVar, i, true, pluginMountStrategy);
    }

    /* renamed from: a */
    public static C4947a m20446a(AbstractC4941c<?> cVar, Enum<?> r2, PluginMountStrategy pluginMountStrategy) {
        return m20443a(cVar, r2.ordinal(), true, pluginMountStrategy);
    }

    /* renamed from: a */
    public static C4947a m20447a(AbstractC4941c<?> cVar, Enum<?> r2, boolean z) {
        return m20443a(cVar, r2.ordinal(), z, (PluginMountStrategy) null);
    }

    /* renamed from: a */
    public static C4947a m20443a(AbstractC4941c<?> cVar, int i, boolean z, PluginMountStrategy pluginMountStrategy) {
        C4947a aVar = new C4947a();
        aVar.f14519a = cVar;
        aVar.f14522d = i;
        aVar.f14520b = z;
        aVar.f14523e = pluginMountStrategy;
        return aVar;
    }

    /* renamed from: a */
    public static C4947a m20448a(AbstractC4941c<?> cVar, Enum<?> r1, boolean z, PluginMountStrategy pluginMountStrategy) {
        return m20443a(cVar, r1.ordinal(), z, pluginMountStrategy);
    }
}
