package com.ss.android.lark.search.impl.func.detail.p2615a;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.impl.entity.viewdata.SearchChatterViewData;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53576c;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53597i;
import com.ss.android.lark.search.impl.func.detail.p2618d.C53618d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.search.impl.func.detail.a.a */
public class C53551a extends AbstractC53597i<SearchChatterViewData, AbstractC53576c> {

    /* renamed from: a */
    private static final Map<Class<? extends AbstractC53576c>, AbstractC53554a> f132273a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.search.impl.func.detail.a.a$a */
    public interface AbstractC53554a<T extends AbstractC53576c> {
        /* renamed from: a */
        void mo182792a(SearchChatterViewData searchChatterViewData, int i, T t);

        /* renamed from: a */
        void mo182794a(SearchChatterViewData searchChatterViewData, int i, String str, T t);
    }

    static {
        HashMap hashMap = new HashMap();
        f132273a = hashMap;
        hashMap.put(C53559d.class, new AbstractC53554a<C53559d>() {
            /* class com.ss.android.lark.search.impl.func.detail.p2615a.C53551a.C535521 */

            /* renamed from: a */
            public void mo182792a(SearchChatterViewData searchChatterViewData, int i, C53559d dVar) {
                if (searchChatterViewData.isSecretP2PChat()) {
                    dVar.mo182805a(searchChatterViewData.getSecretP2pChatId(), i, searchChatterViewData.getId(), searchChatterViewData.getSession());
                } else {
                    dVar.mo182804a(searchChatterViewData, i);
                }
            }

            /* renamed from: a */
            public void mo182794a(SearchChatterViewData searchChatterViewData, int i, String str, C53559d dVar) {
                dVar.mo182803a(searchChatterViewData, i, str);
            }
        });
        hashMap.put(C53618d.class, new AbstractC53554a<C53618d>() {
            /* class com.ss.android.lark.search.impl.func.detail.p2615a.C53551a.C535532 */

            /* renamed from: a */
            public void mo182792a(SearchChatterViewData searchChatterViewData, int i, C53618d dVar) {
                dVar.mo182909c(searchChatterViewData.getChatterId(), i, searchChatterViewData.getSession());
            }

            /* renamed from: a */
            public void mo182794a(SearchChatterViewData searchChatterViewData, int i, String str, C53618d dVar) {
                dVar.mo182908a(searchChatterViewData, i, str);
            }
        });
    }

    /* renamed from: a */
    public void mo182790b(SearchChatterViewData searchChatterViewData, int i, AbstractC53576c cVar) {
        AbstractC53554a aVar = f132273a.get(cVar.getClass());
        if (aVar == null) {
            Log.m165383e("LarkSearch.Search.ChatterClickHandler", "can not find handle click action");
        } else {
            aVar.mo182792a(searchChatterViewData, i, cVar);
        }
    }

    /* renamed from: a */
    public void mo182787a(SearchChatterViewData searchChatterViewData, int i, String str, AbstractC53576c cVar) {
        AbstractC53554a aVar = f132273a.get(cVar.getClass());
        if (aVar == null) {
            Log.m165383e("LarkSearch.Search.ChatterClickHandler", "can not find handle click action");
        } else {
            aVar.mo182794a(searchChatterViewData, i, str, cVar);
        }
    }
}
