package com.bytedance.ee.bear.list.p431g;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.list.sort.AbstractC8755a;
import com.bytedance.ee.bear.list.sort.FilterType;
import com.bytedance.ee.bear.list.sort.SortType;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.g.b */
public class C8456b extends AbstractC8755a {
    @Override // com.bytedance.ee.bear.list.sort.AbstractC8765g.AbstractC8766a
    /* renamed from: a */
    public List<SortType> mo32811a() {
        return null;
    }

    @Override // com.bytedance.ee.bear.list.sort.AbstractC8765g.AbstractC8766a, com.bytedance.ee.bear.list.sort.AbstractC8755a
    /* renamed from: b */
    public List<FilterType> mo33058b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FilterType.ALL);
        arrayList.add(FilterType.DOC);
        arrayList.add(FilterType.SHEET);
        boolean a = C4211a.m17514a().mo16536a("spacekit.mobile.template_filter_mindnote_enable", false);
        C13479a.m54764b("TemplateFilterModelFactory", "filterMindnoteEnable = " + a);
        if (a) {
            arrayList.add(FilterType.MINDNOTE);
        }
        boolean a2 = C4211a.m17514a().mo16536a("ccm.spacekit.template.bitable.enable", false);
        C13479a.m54764b("TemplateFilterModelFactory", "filterBitableEnable = " + a2);
        if (a2) {
            arrayList.add(FilterType.BITABLE);
        }
        return arrayList;
    }

    public C8456b(C10917c cVar, boolean z) {
        super(cVar, z);
    }
}
