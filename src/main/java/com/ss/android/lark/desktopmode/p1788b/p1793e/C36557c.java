package com.ss.android.lark.desktopmode.p1788b.p1793e;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.FragmentParams;
import com.ss.android.lark.desktopmode.base.LeftWindowParams;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c;
import com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36554b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.desktopmode.b.e.c */
public class C36557c implements AbstractC36554b {

    /* renamed from: a */
    private AbstractC36551c f94098a;

    /* renamed from: b */
    private Map<String, AbstractC36553a> f94099b = new HashMap();

    /* renamed from: c */
    private AbstractC36554b.AbstractC36556b f94100c;

    /* renamed from: d */
    private AbstractC36554b.AbstractC36555a f94101d;

    /* renamed from: e */
    private String f94102e = null;

    /* renamed from: f */
    private Map<AbstractC36553a, Map<ContainerType, String>> f94103f = new HashMap();

    /* renamed from: a */
    public String mo134909a() {
        return this.f94102e;
    }

    /* renamed from: a */
    public void mo134915a(String str, ContainerType containerType, C36516a aVar) {
        mo134917b(str);
        boolean a = m144246a(aVar);
        AbstractC36553a aVar2 = this.f94099b.get(str);
        if (aVar2 != null && a) {
            mo134911a(aVar2, containerType, aVar.getFragmentInfoId());
        }
    }

    /* renamed from: b */
    private boolean m144247b() {
        AbstractC36554b.AbstractC36555a aVar = this.f94101d;
        if (aVar == null || aVar.mo134834b() == null || this.f94101d.mo134833a() == null || this.f94101d.mo134835c() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo134912a(AbstractC36554b.AbstractC36555a aVar) {
        this.f94101d = aVar;
    }

    /* renamed from: b */
    public final Map<ContainerType, String> mo134916b(AbstractC36553a aVar) {
        return this.f94103f.get(aVar);
    }

    public C36557c(AbstractC36551c cVar) {
        this.f94098a = cVar;
    }

    /* renamed from: a */
    public void mo134910a(AbstractC36553a aVar) {
        this.f94099b.put(aVar.mo31311b(), aVar);
    }

    /* renamed from: b */
    public void mo134917b(String str) {
        AbstractC36554b.AbstractC36556b bVar = this.f94100c;
        if (bVar != null) {
            bVar.mo134836a(this.f94102e, str);
        }
        AbstractC36553a aVar = this.f94099b.get(str);
        if (aVar != null) {
            Map<ContainerType, String> b = mo134916b(aVar);
            if (b == null || b.isEmpty()) {
                m144248e(str);
            } else {
                m144249f(str);
            }
        }
        this.f94102e = str;
    }

    /* renamed from: c */
    public void mo134918c(String str) {
        AbstractC36553a aVar = this.f94099b.get(str);
        if (aVar != null) {
            Map<ContainerType, String> b = mo134916b(aVar);
            if (!CollectionUtils.isEmpty(b)) {
                for (String str2 : b.values()) {
                    C36516a d = this.f94098a.mo134903d(str2);
                    if (d != null) {
                        this.f94098a.mo134901c(d);
                    }
                }
                this.f94103f.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    private void m144245a(FragmentParams fragmentParams) {
        if (m144247b()) {
            ContainerType containerType = fragmentParams.getContainerType();
            if (containerType == ContainerType.ALL) {
                this.f94101d.mo134835c().setVisibility(0);
            } else if (containerType == ContainerType.Left || containerType == ContainerType.Right) {
                this.f94101d.mo134835c().setVisibility(8);
                this.f94101d.mo134833a().setVisibility(0);
                this.f94101d.mo134834b().setVisibility(0);
            }
            if (containerType == ContainerType.Left) {
                Context context = this.f94101d.mo134833a().getContext();
                if (fragmentParams instanceof LeftWindowParams) {
                    this.f94101d.mo134833a().getLayoutParams().width = UIUtils.dp2px(context, (float) ((LeftWindowParams) fragmentParams).getTabWidth());
                    return;
                }
                this.f94101d.mo134833a().getLayoutParams().width = UIUtils.dp2px(context, 300.0f);
            }
        }
    }

    /* renamed from: e */
    private List<C36516a> m144248e(String str) {
        AbstractC36553a aVar = this.f94099b.get(str);
        if (aVar == null) {
            return new ArrayList();
        }
        Map<ContainerType, C36516a> r = aVar.mo103433r();
        for (C36516a aVar2 : r.values()) {
            if (m144246a(aVar2)) {
                this.f94098a.mo134905e(aVar2);
                mo134911a(aVar, aVar2.getFragmentParams().getContainerType(), aVar2.getFragmentInfoId());
            }
        }
        return new ArrayList(r.values());
    }

    /* renamed from: d */
    public final Map<ContainerType, C36516a> mo134919d(String str) {
        HashMap hashMap = new HashMap();
        AbstractC36553a aVar = this.f94099b.get(str);
        if (aVar == null) {
            return new HashMap(2);
        }
        for (String str2 : mo134916b(aVar).values()) {
            C36516a d = this.f94098a.mo134903d(str2);
            if (d != null) {
                hashMap.put(d.getFragmentParams().getContainerType(), d);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private boolean m144246a(C36516a aVar) {
        boolean z;
        if (!(aVar.getFragmentParams() instanceof MainWindowParams) || aVar.isAdded()) {
            return false;
        }
        m144243a(aVar.getFragmentParams().getContainerType(), aVar);
        MainWindowParams mainWindowParams = (MainWindowParams) aVar.getFragmentParams();
        if (mainWindowParams.getContainerType() == ContainerType.Left || mainWindowParams.getContainerType() == ContainerType.ALL) {
            z = this.f94098a.mo134896a(aVar);
        } else if (!TextUtils.equals(mainWindowParams.getTabName(), this.f94102e)) {
            z = this.f94098a.mo134896a(aVar);
        } else {
            z = this.f94098a.mo134899b(aVar);
        }
        m144245a(mainWindowParams);
        return z;
    }

    /* renamed from: f */
    private List<C36516a> m144249f(String str) {
        AbstractC36553a aVar = this.f94099b.get(str);
        if (aVar != null) {
            Map<ContainerType, String> b = mo134916b(aVar);
            if (b == null || b.isEmpty()) {
                return new ArrayList();
            }
            for (Map.Entry<ContainerType, String> entry : b.entrySet()) {
                if (this.f94098a.mo134900b(entry.getValue())) {
                    m144244a(entry.getKey(), entry.getValue());
                    this.f94098a.mo134895a(entry.getValue());
                    C36516a d = this.f94098a.mo134903d(entry.getValue());
                    if (d != null) {
                        m144245a(d.getFragmentParams());
                    }
                } else {
                    C36516a aVar2 = aVar.mo103433r().get(entry.getKey());
                    if (aVar2 != null) {
                        m144246a(aVar2);
                    }
                }
            }
        }
        return new ArrayList();
    }

    /* renamed from: a */
    public void mo134913a(AbstractC36554b.AbstractC36556b bVar) {
        this.f94100c = bVar;
    }

    /* renamed from: a */
    public void mo134914a(String str) {
        this.f94099b.remove(str);
    }

    /* renamed from: a */
    private void m144243a(ContainerType containerType, C36516a aVar) {
        if ((containerType == ContainerType.Right || containerType == ContainerType.ALL) && aVar != null) {
            aVar.onFragmentBringToFront();
        }
    }

    /* renamed from: a */
    private void m144244a(ContainerType containerType, String str) {
        m144243a(containerType, this.f94098a.mo134903d(str));
    }

    /* renamed from: a */
    public final void mo134911a(AbstractC36553a aVar, ContainerType containerType, String str) {
        Map<ContainerType, String> map = this.f94103f.get(aVar);
        if (map == null) {
            HashMap hashMap = new HashMap();
            hashMap.put(containerType, str);
            this.f94103f.put(aVar, hashMap);
            return;
        }
        map.put(containerType, str);
    }
}
