package com.larksuite.component.openplatform.plugins.config;

import com.larksuite.component.openplatform.plugins.utils.C25612b;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.core.AbstractC25929f;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.entity.LKPluginInterceptResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25904o;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: com.larksuite.component.openplatform.plugins.config.b */
public class C25573b extends AbstractC25929f {

    /* renamed from: a */
    private AbstractC25904o f62213a;

    /* renamed from: b */
    private Map<String, List<C25575a>> f62214b = new HashMap();

    /* renamed from: c */
    private LKOpenApiAccessConfig f62215c;

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.openplatform.plugins.config.b$a */
    public static class C25575a {

        /* renamed from: a */
        public AbstractC25937e f62216a;

        /* renamed from: b */
        public List<LKOpenApiAccessConfig> f62217b;

        /* renamed from: c */
        public String f62218c;

        /* renamed from: d */
        public volatile boolean f62219d;

        private C25575a() {
        }
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        this.f62213a = null;
        Map<String, List<C25575a>> map = this.f62214b;
        if (map != null) {
            for (String str : map.keySet()) {
                List<C25575a> list = this.f62214b.get(str);
                if (list != null) {
                    for (C25575a aVar : list) {
                        if (!(aVar == null || aVar.f62216a == null || aVar.f62219d)) {
                            aVar.f62216a.onRelease();
                        }
                    }
                }
            }
            this.f62214b.clear();
        }
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void addEvents(AbstractC25896g gVar) {
        for (String str : this.f62214b.keySet()) {
            gVar.mo92192a(str);
        }
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        String m = lKEvent.mo92146m();
        List<C25575a> list = this.f62214b.get(m);
        if (list == null || list.isEmpty()) {
            return lKEvent.mo92155v();
        }
        List<AbstractC25937e> a = m91286a(lKEvent, list);
        if (a.isEmpty()) {
            Log.m165389i("OPPluginProxy", "proceed to plugin：" + m);
            return lKEvent.mo92155v();
        }
        if (a.size() > 1) {
            Collections.sort(a);
        }
        ListIterator<AbstractC25937e> listIterator = a.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next();
        }
        while (listIterator.hasPrevious()) {
            AbstractC25937e previous = listIterator.previous();
            LKPluginHandleResult lKPluginHandleResult = LKPluginHandleResult.f64251d;
            try {
                lKPluginHandleResult = previous.handleEvent(lKEvent);
            } catch (Exception e) {
                Log.m165384e("OPPluginProxy", "handle exception.", e);
            }
            if (!lKPluginHandleResult.mo92281f()) {
                Log.m165389i("OPPluginProxy", "[" + m + "] handle pass " + previous.getClass().getName());
            } else {
                Log.m165389i("OPPluginProxy", "[" + m + "] handle by " + previous.getClass().getName());
                return lKPluginHandleResult;
            }
        }
        Log.m165389i("OPPluginProxy", "[" + m + "] handle pass ");
        return lKEvent.mo92155v();
    }

    @Override // com.larksuite.framework.apiplugin.core.AbstractC25929f, com.larksuite.framework.apiplugin.p1175a.AbstractC25900k
    /* renamed from: a */
    public LKPluginInterceptResult mo87280a(LKEvent lKEvent) {
        String m = lKEvent.mo92146m();
        List<C25575a> list = this.f62214b.get(m);
        if (list == null || list.isEmpty()) {
            Log.m165389i("OPPluginProxy", "invalid proxyInfos:" + m);
            return mo92253a();
        }
        List<AbstractC25937e> a = m91286a(lKEvent, list);
        if (a.isEmpty()) {
            Log.m165389i("OPPluginProxy", "proceed to plugin：" + m);
            return mo92253a();
        }
        if (a.size() > 1) {
            Collections.sort(a);
        }
        ListIterator<AbstractC25937e> listIterator = a.listIterator();
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
                Log.m165384e("OPPluginProxy", "interceptEvent exception.", e);
            }
            if (!lKPluginInterceptResult.mo92284f()) {
                Log.m165389i("OPPluginProxy", "[" + m + "] intercept pass " + previous.getClass().getName());
            } else {
                Log.m165389i("OPPluginProxy", "[" + m + "] intercepted by " + previous.getClass().getName());
                return lKPluginInterceptResult;
            }
        }
        Log.m165389i("OPPluginProxy", "[" + m + "] intercept pass ");
        return mo92253a();
    }

    /* renamed from: a */
    private AbstractC25937e m91285a(C25575a aVar, boolean z) {
        if (aVar.f62216a != null) {
            if (z && !aVar.f62219d) {
                this.f62213a.mo92199a(aVar.f62216a);
                aVar.f62219d = true;
            }
            return aVar.f62216a;
        }
        Class<?> a = C25612b.m91381a(aVar.f62218c);
        if (a == null) {
            return null;
        }
        try {
            Object newInstance = a.newInstance();
            if (!(newInstance instanceof AbstractC25937e)) {
                return null;
            }
            AbstractC25937e eVar = (AbstractC25937e) newInstance;
            aVar.f62216a = eVar;
            if (z) {
                this.f62213a.mo92199a(eVar);
            }
            return eVar;
        } catch (IllegalAccessException e) {
            Log.m165384e("OPPluginProxy", "IllegalAccessException", e);
            return null;
        } catch (InstantiationException e2) {
            Log.m165384e("OPPluginProxy", "InstantiationException", e2);
            return null;
        }
    }

    /* renamed from: a */
    private List<AbstractC25937e> m91286a(LKEvent lKEvent, List<C25575a> list) {
        ArrayList arrayList = new ArrayList();
        for (C25575a aVar : list) {
            if (!aVar.f62219d) {
                if (!CollectionUtils.isEmpty(aVar.f62217b)) {
                    Iterator<LKOpenApiAccessConfig> it = aVar.f62217b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        LKOpenApiAccessConfig next = it.next();
                        LKOpenApiAccessConfig lKOpenApiAccessConfig = this.f62215c;
                        if (lKOpenApiAccessConfig == null) {
                            Log.m165389i("OPPluginProxy", "container not set ApiAccessConfig:" + next.toString());
                        } else if (lKOpenApiAccessConfig.getDomain() == next.getDomain() && this.f62215c.getBizType() == next.getBizType() && next.getScene().equals(this.f62215c.getScene())) {
                            if (next.isPublicToJS() || lKEvent.mo92128a()) {
                                AbstractC25937e a = m91285a(aVar, !lKEvent.mo92128a());
                                if (a != null) {
                                    arrayList.add(a);
                                    break;
                                }
                            } else {
                                Log.m165389i("OPPluginProxy", "not public to JS and not innerEvent. skip:" + next.toString());
                            }
                        }
                    }
                } else {
                    Log.m165379d("OPPluginProxy", "not set OpenConditions:" + aVar.toString());
                    AbstractC25937e a2 = m91285a(aVar, true);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
            }
        }
        return arrayList;
    }

    public C25573b(List<LKPluginConfig> list, AbstractC25904o oVar, LKOpenApiAccessConfig lKOpenApiAccessConfig) {
        this.f62215c = lKOpenApiAccessConfig;
        this.f62213a = oVar;
        if (!(list == null || list.isEmpty())) {
            for (LKPluginConfig lKPluginConfig : list) {
                List<String> eventList = lKPluginConfig.getEventList();
                C25575a aVar = new C25575a();
                aVar.f62216a = lKPluginConfig.mLkPlugin;
                aVar.f62217b = lKPluginConfig.mOpenConditions;
                aVar.f62219d = false;
                aVar.f62218c = lKPluginConfig.mPluginClassName;
                for (String str : eventList) {
                    List<C25575a> list2 = this.f62214b.get(str);
                    if (list2 == null) {
                        list2 = new ArrayList<>();
                        this.f62214b.put(str, list2);
                    }
                    list2.add(aVar);
                }
            }
        }
    }
}
