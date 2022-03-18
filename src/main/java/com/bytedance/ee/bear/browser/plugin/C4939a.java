package com.bytedance.ee.bear.browser.plugin;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.widgets.NoConsumeInsetsFrameLayout;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.browser.plugin.a */
public class C4939a implements AbstractC4958n.AbstractC4959a {

    /* renamed from: a */
    private final String f14497a = ("LayoutStrategy#" + Integer.toHexString(hashCode()));

    /* renamed from: b */
    private C4946h f14498b;

    /* renamed from: c */
    private final AbstractC4958n f14499c;

    /* renamed from: d */
    private ViewGroup f14500d;

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n.AbstractC4959a
    /* renamed from: b */
    public ViewGroup mo19535b() {
        return this.f14500d;
    }

    /* renamed from: c */
    private void m20396c() {
        ViewGroup viewGroup = (ViewGroup) this.f14499c.mo19583a(R.id.pluginUIContainer);
        this.f14500d = viewGroup;
        if (viewGroup != null) {
            viewGroup.setTag("AllPluginsRoot");
            return;
        }
        throw new IllegalStateException("All plugins root not found ! [find by id: R.id.pluginUIContainer]");
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n.AbstractC4959a
    /* renamed from: a */
    public C4960o mo19532a() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f14500d.getChildCount(); i++) {
            View childAt = this.f14500d.getChildAt(i);
            if (childAt.getTag(R.id.pluginUIContainer) != null) {
                arrayList.add(new Pair(childAt.getTag(), Integer.valueOf(childAt.getId())));
            }
        }
        return new C4960o(arrayList);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n.AbstractC4959a
    /* renamed from: a */
    public void mo19533a(C4946h hVar) {
        this.f14498b = hVar;
        m20396c();
        m20394b(hVar);
    }

    /* renamed from: a */
    private int m20389a(AbstractC4941c cVar) {
        View findViewWithTag = this.f14500d.findViewWithTag(cVar.getClass().getName());
        if (findViewWithTag != null) {
            return findViewWithTag.getId();
        }
        return View.generateViewId();
    }

    C4939a(AbstractC4958n nVar) {
        this.f14499c = nVar;
    }

    /* renamed from: b */
    private String m20393b(AbstractC4941c cVar) {
        String name = cVar.getClass().getName();
        if (this.f14500d.findViewWithTag(name) != null) {
            return name;
        }
        C4946h.C4947a c = m20395c(cVar);
        if (c == null || c.f14522d == Integer.MIN_VALUE) {
            return "AllPluginsRoot";
        }
        return name;
    }

    /* renamed from: c */
    private C4946h.C4947a m20395c(AbstractC4941c<?> cVar) {
        C4946h.C4947a aVar;
        C4946h hVar = this.f14498b;
        if (hVar != null) {
            aVar = hVar.mo19575c(cVar);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            String str = this.f14497a;
            C13479a.m54775e(str, "Plugin metadata not found:" + cVar);
        }
        return aVar;
    }

    /* renamed from: a */
    private View m20391a(String str) {
        if ("AllPluginsRoot".equals(str)) {
            return this.f14500d;
        }
        return this.f14499c.mo19585a(str);
    }

    /* renamed from: b */
    private void m20394b(C4946h hVar) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<AbstractC4941c, C4946h.C4947a> entry : hVar.mo19573a().entrySet()) {
            AbstractC4941c key = entry.getKey();
            C4946h.C4947a value = entry.getValue();
            if (value.f14522d != Integer.MIN_VALUE) {
                arrayList.add(key);
                hashMap.put(key, Integer.valueOf(value.f14522d));
            }
        }
        Collections.sort(arrayList, new Comparator(hashMap) {
            /* class com.bytedance.ee.bear.browser.plugin.$$Lambda$a$sIKoDdJh6SlkQudXsgIzgTcME */
            public final /* synthetic */ Map f$0;

            {
                this.f$0 = r1;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C4939a.m269137lambda$sIKoDdJh6SlkQudXsgIzgTcME(this.f$0, (AbstractC4941c) obj, (AbstractC4941c) obj2);
            }
        });
        for (int i = 0; i < arrayList.size(); i++) {
            AbstractC4941c cVar = (AbstractC4941c) arrayList.get(i);
            m20392a(cVar.getClass().getName(), m20389a(cVar));
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n.AbstractC4959a
    /* renamed from: a */
    public void mo19534a(C4960o oVar) {
        m20396c();
        if (oVar != null) {
            for (Pair<Object, Integer> pair : oVar.f14547a) {
                m20392a(pair.first, ((Integer) pair.second).intValue());
            }
        }
    }

    /* renamed from: a */
    private void m20392a(Object obj, int i) {
        if (this.f14500d.findViewWithTag(obj) == null) {
            NoConsumeInsetsFrameLayout noConsumeInsetsFrameLayout = new NoConsumeInsetsFrameLayout(this.f14499c.mo19593b());
            noConsumeInsetsFrameLayout.setTag(obj);
            noConsumeInsetsFrameLayout.setTag(R.id.pluginUIContainer, obj);
            noConsumeInsetsFrameLayout.setId(i);
            this.f14500d.addView(noConsumeInsetsFrameLayout, -1, -1);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n.AbstractC4959a
    /* renamed from: a */
    public ViewGroup mo19531a(AbstractC4958n nVar, AbstractC4941c cVar) {
        String b = m20393b(cVar);
        View a = m20391a(b);
        if (a != null) {
            return (ViewGroup) a;
        }
        IllegalStateException illegalStateException = new IllegalStateException(cVar.toString());
        String str = this.f14497a;
        C13479a.m54759a(str, "no pluginContainer found:" + b, illegalStateException);
        return this.f14500d;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m20390a(Map map, AbstractC4941c cVar, AbstractC4941c cVar2) {
        return ((Integer) map.get(cVar)).compareTo((Integer) map.get(cVar2));
    }
}
