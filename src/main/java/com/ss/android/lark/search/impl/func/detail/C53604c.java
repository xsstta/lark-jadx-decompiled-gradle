package com.ss.android.lark.search.impl.func.detail;

import android.util.SparseArray;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53584f;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53597i;
import com.ss.android.lark.search.impl.func.detail.p2615a.C53551a;
import com.ss.android.lark.search.impl.func.detail.p2617c.C53605a;

/* renamed from: com.ss.android.lark.search.impl.func.detail.c */
public class C53604c {

    /* renamed from: a */
    private static SparseArray<AbstractC53597i> f132364a;

    static {
        SparseArray<AbstractC53597i> sparseArray = new SparseArray<>(5);
        f132364a = sparseArray;
        sparseArray.put(1, new C53551a());
        f132364a.put(8, new C53605a());
    }

    /* renamed from: a */
    public static void m207542a(SearchBaseViewData searchBaseViewData, int i, AbstractC53584f.AbstractC53585a.AbstractC53586a aVar) {
        int searchResultType = searchBaseViewData.getSearchResultType();
        AbstractC53597i iVar = f132364a.get(searchResultType);
        if (iVar == null) {
            Log.m165383e("LarkSearch.Search.SearchDetailClickRouter", "search result type is unknown" + searchResultType);
            return;
        }
        iVar.mo182883a(searchBaseViewData, i, aVar);
    }

    /* renamed from: a */
    public static void m207543a(SearchBaseViewData searchBaseViewData, int i, String str, AbstractC53584f.AbstractC53585a.AbstractC53586a aVar) {
        int searchResultType = searchBaseViewData.getSearchResultType();
        AbstractC53597i iVar = f132364a.get(searchResultType);
        if (iVar == null) {
            Log.m165383e("LarkSearch.Search.SearchDetailClickRouter", "search result type is unknown" + searchResultType);
            return;
        }
        Log.m165389i("LarkSearch.Search.SearchDetailClickRouter", "click advance search result, id:" + searchBaseViewData.getId() + ", result type:" + searchBaseViewData.getSearchResultType());
        iVar.mo182787a(searchBaseViewData, i, str, aVar);
    }
}
