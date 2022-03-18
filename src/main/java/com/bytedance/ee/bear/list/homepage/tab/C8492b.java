package com.bytedance.ee.bear.list.homepage.tab;

import com.bytedance.ee.bear.list.p429f.C8302f;
import com.bytedance.ee.bear.list.recent.C8682d;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.homepage.tab.b */
public class C8492b {
    /* renamed from: a */
    public List<C8493c> mo33169a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C8493c(HomeTabEnum.RECENT.id, R.string.Doc_List_Recent, C8682d.class.getName()));
        arrayList.add(new C8493c(HomeTabEnum.PIN.id, R.string.Doc_List_Quick_Access, C8302f.class.getName()));
        return arrayList;
    }
}
