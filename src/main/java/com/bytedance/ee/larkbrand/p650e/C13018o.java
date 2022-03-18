package com.bytedance.ee.larkbrand.p650e;

import com.bytedance.ee.larkbrand.nativeMoudule.rich.C13251h;
import com.bytedance.ee.larkbrand.p651f.p652a.C13059c;
import com.bytedance.ee.larkbrand.p651f.p652a.C13060d;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.C67617c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.larkbrand.e.o */
public class C13018o extends C67617c {
    @Override // com.tt.option.ext.C67617c, com.tt.option.ext.AbstractC67625j
    public List<AbstractC67550j> createNativeModules(AppbrandContext appbrandContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C13251h(appbrandContext));
        arrayList.add(new C13060d(appbrandContext));
        arrayList.add(new C13059c(appbrandContext));
        return arrayList;
    }
}
