package com.huawei.hms.locationSdk;

import com.huawei.hms.locationSdk.AbstractC23675x;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.huawei.hms.locationSdk.y */
public class C23676y<T extends AbstractC23675x> {

    /* renamed from: a */
    private List<T> f58442a = new ArrayList(100);

    /* renamed from: a */
    public List<T> mo83543a() {
        return this.f58442a;
    }

    /* renamed from: a */
    public void mo83544a(T t) {
        if (t != null) {
            if (this.f58442a == null) {
                this.f58442a = new ArrayList();
            }
            String a = t.mo83541a();
            u0.m86106c("TidCacheManager", a, "list to add size is:" + this.f58442a.size());
            if (mo83545b(t) != null) {
                u0.m86106c("TidCacheManager", t.mo83541a(), "this request is included");
                return;
            }
            u0.m86106c("TidCacheManager", t.mo83541a(), "add request");
            this.f58442a.add(t);
        }
    }

    /* renamed from: b */
    public T mo83545b(T t) {
        if (t != null && !t0.m86101a(this.f58442a)) {
            String a = t.mo83541a();
            u0.m86106c("TidCacheManager", a, "list to find size is:" + this.f58442a.size());
            for (int i = 0; i < this.f58442a.size(); i++) {
                T t2 = this.f58442a.get(i);
                if (t2 != null && t2.equals(t)) {
                    String a2 = t.mo83541a();
                    u0.m86106c("TidCacheManager", a2, "find tid in list, tid:" + t2.mo83541a());
                    return t2;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo83546c(T t) {
        if (t != null && !t0.m86101a(this.f58442a)) {
            for (T t2 : this.f58442a) {
                if (t2.equals(t)) {
                    u0.m86106c("TidCacheManager", t.mo83541a(), "remove request from list");
                    this.f58442a.remove(t2);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public void mo83547d(T t) {
        if (t != null) {
            if (this.f58442a.isEmpty()) {
                this.f58442a.add(t);
                return;
            }
            String a = t.mo83541a();
            u0.m86106c("TidCacheManager", a, "list to replace size is:" + this.f58442a.size());
            for (int i = 0; i < this.f58442a.size(); i++) {
                T t2 = this.f58442a.get(i);
                if (t2 != null && t2.equals(t)) {
                    String a2 = t.mo83541a();
                    u0.m86106c("TidCacheManager", a2, "replace old tid is " + t2.mo83541a() + ". new tid is " + t.mo83541a());
                    this.f58442a.set(i, t);
                    return;
                }
            }
            this.f58442a.add(t);
            u0.m86106c("TidCacheManager", t.mo83541a(), "replaceRequestCache add Request.");
        }
    }
}
