package com.ss.android.lark.search.impl.p2592b.p2595c;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData;
import com.ss.android.lark.utils.C57859q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.b.c.c */
public class C53348c {
    /* renamed from: a */
    public static List<String> m206468a(List<SearchBaseViewData> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (SearchBaseViewData searchBaseViewData : list) {
            if (searchBaseViewData.getSearchResultType() == 6 || searchBaseViewData.getSearchResultType() == 15) {
                arrayList.add(C57859q.m224565a(searchBaseViewData.getId()));
            } else {
                arrayList.add(searchBaseViewData.getId());
            }
        }
        return arrayList;
    }
}
