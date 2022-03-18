package com.ss.android.lark.forward.impl.model.p1903b;

import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.forward.impl.model.b.a */
public class C38438a {
    /* renamed from: a */
    public static List<SearchBaseInfo> m151566a(List<SearchBaseInfo> list, List<SearchBaseInfo> list2, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (list.size() <= 3) {
            arrayList.addAll(list);
        } else if (z) {
            arrayList.addAll(list);
        } else {
            arrayList.addAll(list.subList(0, 3));
        }
        arrayList.addAll(list2);
        return arrayList;
    }
}
