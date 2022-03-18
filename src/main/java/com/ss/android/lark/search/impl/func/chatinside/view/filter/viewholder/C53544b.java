package com.ss.android.lark.search.impl.func.chatinside.view.filter.viewholder;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.impl.entity.viewdata.filter.SearchFilterViewData;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.view.filter.viewholder.b */
public class C53544b {

    /* renamed from: a */
    private HashMap<String, AbstractC53547e> f132264a;

    public C53544b() {
        HashMap<String, AbstractC53547e> hashMap = new HashMap<>();
        this.f132264a = hashMap;
        hashMap.put("chat_inside_search_message/filter/time", new C53546d());
        this.f132264a.put("chat_inside_search_message/filter/sender", new C53543a());
        this.f132264a.put("chat_inside_search_space/filter/type", new C53545c());
        this.f132264a.put("chat_inside_search_space/filter/owner", new C53543a());
        this.f132264a.put("chat_inside_search_wiki/filter/owner", new C53543a());
    }

    /* renamed from: a */
    private AbstractC53547e m207344a(String str) {
        return this.f132264a.get(str);
    }

    /* renamed from: a */
    public void mo182774a(SearchFilterViewData searchFilterViewData, SearchFilterViewHolder searchFilterViewHolder) {
        AbstractC53547e a = m207344a(searchFilterViewData.mo182354d());
        if (a == null) {
            Log.m165383e("LarkSearch.Search.FilterBinderFactory", "filter type is unknown");
        } else {
            a.mo182773a(searchFilterViewData, searchFilterViewHolder);
        }
    }
}
