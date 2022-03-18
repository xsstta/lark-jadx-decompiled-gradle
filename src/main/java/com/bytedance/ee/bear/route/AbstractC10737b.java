package com.bytedance.ee.bear.route;

import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.service.C10917c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.route.b */
public abstract class AbstractC10737b extends AbstractC10736a implements AbstractC10739d {

    /* renamed from: a */
    private List<AbstractC10738c> f28726a;

    public AbstractC10737b(C10917c cVar, AbstractC10738c... cVarArr) {
        super(cVar);
        ArrayList arrayList = new ArrayList();
        this.f28726a = arrayList;
        if (cVarArr != null) {
            arrayList.addAll(Arrays.asList(cVarArr));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo40642c(BearUrl bearUrl, RouteBean routeBean) {
        for (AbstractC10738c cVar : this.f28726a) {
            if (cVar.mo17284a(bearUrl, routeBean)) {
                return true;
            }
        }
        return false;
    }
}
