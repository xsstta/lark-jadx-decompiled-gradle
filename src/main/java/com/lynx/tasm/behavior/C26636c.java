package com.lynx.tasm.behavior;

import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.lynx.tasm.behavior.c */
public class C26636c {

    /* renamed from: a */
    private final Map<String, C26622a> f65934a = new HashMap();

    public C26636c(List<C26622a> list) {
        mo94607a(list);
    }

    /* renamed from: a */
    public void mo94607a(List<C26622a> list) {
        if (list != null) {
            for (C26622a aVar : list) {
                mo94606a(aVar);
            }
        }
    }

    /* renamed from: a */
    public C26622a mo94605a(String str) {
        C26622a aVar = this.f65934a.get(str);
        if (aVar != null) {
            return aVar;
        }
        throw new RuntimeException("No BehaviorController defined for class " + str);
    }

    /* renamed from: a */
    public void mo94606a(C26622a aVar) {
        if (aVar != null) {
            String d = aVar.mo94572d();
            C26622a aVar2 = this.f65934a.get(d);
            if (aVar2 != null) {
                Log.e("LynxError", "Duplicated Behavior For Name: " + d + ", " + aVar2 + " will be override");
            }
            this.f65934a.put(d, aVar);
        }
    }
}
