package com.larksuite.framework.apiplugin.core;

import android.text.TextUtils;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.entity.LKPluginInterceptResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25902m;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25904o;
import com.larksuite.framework.apiplugin.p1177c.C25918b;
import com.larksuite.framework.apiplugin.p1179e.C25938a;
import com.ss.android.lark.opmonitor.trace.OPTraceService;
import com.ss.android.lark.optrace.api.ILogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: com.larksuite.framework.apiplugin.core.h */
public class C25931h implements AbstractC25904o {

    /* renamed from: a */
    private final List<AbstractC25937e> f64229a = new ArrayList();

    /* renamed from: b */
    private final Map<String, List<AbstractC25937e>> f64230b = new HashMap();

    /* renamed from: c */
    private final AbstractC25902m f64231c;

    /* renamed from: d */
    private ILogger f64232d;

    /* renamed from: e */
    private final Object f64233e = new Object();

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25904o
    /* renamed from: a */
    public List<AbstractC25937e> mo92198a() {
        return this.f64229a;
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25904o
    /* renamed from: b */
    public void mo92201b() {
        this.f64232d.mo92224i("LKPluginManagerImpl", "onRelease");
        synchronized (this.f64233e) {
            for (AbstractC25937e eVar : this.f64229a) {
                eVar.onRelease();
            }
            this.f64229a.clear();
        }
        this.f64230b.clear();
        this.f64231c.mo92194a();
    }

    /* renamed from: a */
    public void mo92256a(ILogger aVar) {
        this.f64232d = aVar;
    }

    public C25931h(AbstractC25902m mVar) {
        this.f64231c = mVar;
        this.f64232d = new C25918b.C25919a(OPTraceService.m192757a().subTrace());
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25904o
    /* renamed from: a */
    public boolean mo92200a(List<? extends AbstractC25937e> list) {
        boolean z = false;
        if (list == null || list.isEmpty()) {
            this.f64232d.mo92223e("LKPluginManagerImpl", "register plugins is null or empty!");
            return false;
        }
        ILogger aVar = this.f64232d;
        aVar.mo92224i("LKPluginManagerImpl", "register list plugins:" + list.size());
        for (AbstractC25937e eVar : list) {
            z |= mo92199a(eVar);
        }
        return z;
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25904o
    /* renamed from: a */
    public boolean mo92199a(AbstractC25937e eVar) {
        List<AbstractC25937e> list;
        if (eVar == null) {
            this.f64232d.mo92223e("LKPluginManagerImpl", "invalid plugin parameter!");
            return false;
        } else if (this.f64229a.contains(eVar)) {
            this.f64232d.mo92225w("LKPluginManagerImpl", "plugin already registered!");
            return false;
        } else {
            C25927d dVar = new C25927d();
            eVar.addEvents(dVar);
            List<String> a = dVar.mo92191a();
            if (a == null || a.isEmpty()) {
                ILogger aVar = this.f64232d;
                aVar.mo92223e("LKPluginManagerImpl", "empty actions!" + C25938a.m93909a(eVar));
                return false;
            }
            synchronized (this.f64233e) {
                this.f64229a.add(eVar);
            }
            for (String str : a) {
                if (TextUtils.isEmpty(str)) {
                    this.f64232d.mo92223e("LKPluginManagerImpl", "event can`t be empty!");
                } else {
                    if (!this.f64230b.containsKey(str)) {
                        list = new LinkedList<>();
                        this.f64230b.put(str, list);
                    } else {
                        list = this.f64230b.get(str);
                        if (list == null) {
                            this.f64232d.mo92224i("LKPluginManagerImpl", "plugin list is null");
                            list = new ArrayList<>();
                            this.f64230b.put(str, list);
                        }
                    }
                    list.add(eVar);
                }
            }
            ILogger aVar2 = this.f64232d;
            aVar2.mo92222d("LKPluginManagerImpl", "register plugin name:" + eVar.getClass().getName());
            return true;
        }
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25904o
    /* renamed from: b */
    public boolean mo92202b(AbstractC25937e eVar) {
        if (eVar == null) {
            this.f64232d.mo92223e("LKPluginManagerImpl", "invalid plugin parameter!");
            return false;
        } else if (!this.f64229a.contains(eVar)) {
            this.f64232d.mo92224i("LKPluginManagerImpl", "plugin not registered!");
            return false;
        } else {
            if (eVar.shouldHandleActivityResult()) {
                this.f64231c.mo92197b(eVar);
            }
            synchronized (this.f64233e) {
                this.f64229a.remove(eVar);
            }
            Iterator<String> it = this.f64230b.keySet().iterator();
            while (it.hasNext()) {
                List<AbstractC25937e> list = this.f64230b.get(it.next());
                if (list == null) {
                    return false;
                }
                Iterator<AbstractC25937e> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (it2.next().equals(eVar)) {
                        it2.remove();
                    }
                }
                if (list.isEmpty()) {
                    it.remove();
                }
            }
            eVar.onRelease();
            ILogger aVar = this.f64232d;
            aVar.mo92224i("LKPluginManagerImpl", "unRegister plugin name:" + eVar.getClass().getName());
            return false;
        }
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25900k
    /* renamed from: a */
    public LKPluginInterceptResult mo87280a(LKEvent lKEvent) {
        if (lKEvent == null) {
            this.f64232d.mo92223e("LKPluginManagerImpl", "event is null!");
            return LKPluginInterceptResult.f64253d;
        }
        String m = lKEvent.mo92146m();
        if (TextUtils.isEmpty(m)) {
            this.f64232d.mo92223e("LKPluginManagerImpl", "eventName is empty!");
            return LKPluginInterceptResult.f64253d;
        }
        List<AbstractC25937e> list = this.f64230b.get(m);
        if (list == null || list.isEmpty()) {
            ILogger aVar = this.f64232d;
            aVar.mo92223e("LKPluginManagerImpl", "no plugin event:" + m);
            return LKPluginInterceptResult.f64253d;
        }
        if (list.size() > 1) {
            Collections.sort(list);
        }
        ILogger aVar2 = this.f64232d;
        aVar2.mo92224i("LKPluginManagerImpl", "intercept event:" + m + " plugin size:" + list.size());
        ListIterator<AbstractC25937e> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next();
        }
        while (listIterator.hasPrevious()) {
            AbstractC25937e previous = listIterator.previous();
            LKPluginInterceptResult lKPluginInterceptResult = LKPluginInterceptResult.f64253d;
            try {
                if (previous instanceof AbstractC25929f) {
                    lKPluginInterceptResult = ((AbstractC25929f) previous).mo87280a(lKEvent);
                }
            } catch (Exception e) {
                ILogger aVar3 = this.f64232d;
                aVar3.mo92223e("LKPluginManagerImpl", "interceptEvent exception." + previous.getClass(), e);
            }
            String a = C25938a.m93909a(previous);
            if (!lKPluginInterceptResult.mo92284f()) {
                ILogger aVar4 = this.f64232d;
                aVar4.mo92224i("LKPluginManagerImpl", "[" + m + "] intercept pass " + a);
            } else {
                ILogger aVar5 = this.f64232d;
                aVar5.mo92224i("LKPluginManagerImpl", "[" + m + "] intercepted by " + a);
                return lKPluginInterceptResult;
            }
        }
        return LKPluginInterceptResult.f64253d;
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        if (lKEvent == null) {
            this.f64232d.mo92223e("LKPluginManagerImpl", "event is null!");
            return LKPluginHandleResult.f64251d;
        }
        String m = lKEvent.mo92146m();
        if (TextUtils.isEmpty(m)) {
            this.f64232d.mo92223e("LKPluginManagerImpl", "eventName is empty!");
            return LKPluginHandleResult.f64251d;
        }
        List<AbstractC25937e> list = this.f64230b.get(m);
        if (list == null || list.isEmpty()) {
            ILogger aVar = this.f64232d;
            aVar.mo92223e("LKPluginManagerImpl", "no handle event:" + m);
            return LKPluginHandleResult.f64251d;
        }
        if (list.size() > 1) {
            Collections.sort(list);
        }
        ILogger aVar2 = this.f64232d;
        aVar2.mo92224i("LKPluginManagerImpl", "handle event:" + m + " plugin size:" + list.size());
        ListIterator<AbstractC25937e> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next();
        }
        while (listIterator.hasPrevious()) {
            AbstractC25937e previous = listIterator.previous();
            if (previous.shouldHandleActivityResult()) {
                ILogger aVar3 = this.f64232d;
                aVar3.mo92224i("LKPluginManagerImpl", "event:" + m + " registerActivityResult");
                this.f64231c.mo92195a(previous);
            }
            LKPluginHandleResult lKPluginHandleResult = LKPluginHandleResult.f64251d;
            try {
                lKPluginHandleResult = previous.handleEvent(lKEvent);
            } catch (Exception e) {
                ILogger aVar4 = this.f64232d;
                aVar4.mo92223e("LKPluginManagerImpl", "handleEvent exception." + previous.getClass(), e);
            }
            String a = C25938a.m93909a(previous);
            if (!lKPluginHandleResult.mo92281f()) {
                ILogger aVar5 = this.f64232d;
                aVar5.mo92224i("LKPluginManagerImpl", "[" + m + "] handle pass " + a);
            } else {
                ILogger aVar6 = this.f64232d;
                aVar6.mo92224i("LKPluginManagerImpl", "[" + m + "] handled by " + a);
                return lKPluginHandleResult;
            }
        }
        return LKPluginHandleResult.f64251d;
    }
}
