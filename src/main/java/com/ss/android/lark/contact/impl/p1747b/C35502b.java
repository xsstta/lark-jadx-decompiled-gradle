package com.ss.android.lark.contact.impl.p1747b;

import com.ss.android.lark.contact.impl.viewdata.ContactViewDataWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.contact.impl.b.b */
public class C35502b {

    /* renamed from: a */
    private HashMap<String, Integer> f91785a = new HashMap<>();

    /* renamed from: a */
    public Map<String, Integer> mo130934a() {
        return this.f91785a;
    }

    /* renamed from: a */
    public List<String> mo130933a(List<ContactViewDataWrapper> list) {
        this.f91785a.clear();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (ContactViewDataWrapper contactViewDataWrapper : list) {
            if (contactViewDataWrapper.getType() == 2) {
                String valueOf = String.valueOf(contactViewDataWrapper.getViewData().f93251i);
                if (!this.f91785a.containsKey(valueOf.toUpperCase())) {
                    this.f91785a.put(valueOf.toUpperCase(), Integer.valueOf(i));
                    arrayList.add(valueOf.toUpperCase());
                } else if (!arrayList.contains(valueOf.toUpperCase())) {
                    arrayList.add(valueOf.toUpperCase());
                }
                i++;
            }
        }
        return arrayList;
    }
}
