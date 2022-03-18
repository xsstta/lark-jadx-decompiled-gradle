package com.larksuite.component.dybrid.h5core.p1078f;

import android.text.TextUtils;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.AbstractC24171m;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5core.core.impl.C24204a;
import com.larksuite.component.dybrid.h5core.p1076d.C24214b;
import com.larksuite.component.dybrid.h5core.p1082h.C24246a;
import com.larksuite.framework.utils.C26252ad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.larksuite.component.dybrid.h5core.f.a */
public class C24217a implements AbstractC24171m {

    /* renamed from: a */
    private Set<AbstractC24169l> f59853a = new HashSet();

    /* renamed from: b */
    private Map<String, List<AbstractC24169l>> f59854b = new HashMap();

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: d */
    public synchronized void mo86749d() {
        for (AbstractC24169l lVar : this.f59853a) {
            lVar.mo86749d();
        }
        this.f59853a.clear();
        this.f59854b.clear();
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: a */
    public synchronized boolean mo86747a(H5Event h5Event) {
        if (h5Event == null) {
            C24174b.m88301c("H5PluginManagerImpl", "invalid intent!");
            return false;
        }
        String b = h5Event.mo86707b();
        if (TextUtils.isEmpty(b)) {
            C24174b.m88299b("H5PluginManagerImpl", "invalid intent name");
            return false;
        }
        List<AbstractC24169l> list = this.f59854b.get(b);
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            AbstractC24169l lVar = list.get(size);
            try {
                if (lVar.mo86747a(h5Event)) {
                    C24174b.m88296a("H5PluginManagerImpl", "[" + b + "] intecepted by " + C24246a.m88557a(lVar) + " main process:" + C26252ad.m94993b(C24214b.m88460a()));
                    return true;
                }
            } catch (Throwable th) {
                C24174b.m88301c("H5PluginManagerImpl", "interceptEvent exception." + th.toString());
                return true;
            }
        }
        return false;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: b */
    public synchronized boolean mo86748b(H5Event h5Event) {
        if (h5Event == null) {
            C24174b.m88301c("H5PluginManagerImpl", "invalid intent!");
            return false;
        }
        String b = h5Event.mo86707b();
        if (TextUtils.isEmpty(b)) {
            C24174b.m88299b("H5PluginManagerImpl", "invalid intent name");
            return false;
        }
        List<AbstractC24169l> list = this.f59854b.get(b);
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            AbstractC24169l lVar = list.get(size);
            try {
                if (lVar.mo86748b(h5Event)) {
                    C24174b.m88296a("H5PluginManagerImpl", "[" + b + "] handled by " + C24246a.m88557a(lVar) + " main process:" + C26252ad.m94993b(C24214b.m88460a()));
                    return true;
                }
            } catch (Exception e) {
                C24174b.m88297a("H5PluginManagerImpl", "handleEvent exception.", e);
                return true;
            }
        }
        return false;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24171m
    /* renamed from: a */
    public synchronized boolean mo86762a(AbstractC24169l lVar) {
        List<AbstractC24169l> list;
        if (lVar == null) {
            C24174b.m88299b("H5PluginManagerImpl", "invalid plugin parameter!");
            return false;
        } else if (this.f59853a.contains(lVar)) {
            C24174b.m88299b("H5PluginManagerImpl", "plugin already registered!");
            return false;
        } else {
            C24204a aVar = new C24204a();
            lVar.mo86761a(aVar);
            Iterator<String> a = aVar.mo86722a();
            if (!a.hasNext()) {
                C24174b.m88299b("H5PluginManagerImpl", "empty filter");
                return false;
            }
            this.f59853a.add(lVar);
            while (a.hasNext()) {
                String next = a.next();
                if (TextUtils.isEmpty(next)) {
                    C24174b.m88299b("H5PluginManagerImpl", "intent can't be empty!");
                } else {
                    if (!this.f59854b.containsKey(next)) {
                        list = new ArrayList<>();
                        this.f59854b.put(next, list);
                    } else {
                        list = this.f59854b.get(next);
                    }
                    list.add(lVar);
                }
            }
            String a2 = C24246a.m88557a(lVar);
            C24174b.m88296a("H5PluginManagerImpl", "register plugin " + a2);
            return true;
        }
    }
}
