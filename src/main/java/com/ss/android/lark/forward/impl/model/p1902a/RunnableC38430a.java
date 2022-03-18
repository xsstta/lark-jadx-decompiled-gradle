package com.ss.android.lark.forward.impl.model.p1902a;

import android.text.TextUtils;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.C38389a;
import com.ss.android.lark.forward.impl.model.p1902a.C38432c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.forward.impl.model.a.a */
public class RunnableC38430a implements Runnable {

    /* renamed from: a */
    private final IGetDataCallback<List<SearchBaseInfo>> f98801a;

    /* renamed from: b */
    private final C38432c f98802b;

    public void run() {
        List<C38389a> a = C38364a.m151054a().mo140443e().mo140504a();
        if (a.size() > 60) {
            a = a.subList(0, 60);
        }
        List<SearchBaseInfo> a2 = this.f98802b.mo140982a(C38434d.m151560a().mo140983a(a), C38432c.EnumC38433a.FEED);
        m151558a(a2);
        IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback = this.f98801a;
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(a2);
        }
    }

    /* renamed from: a */
    private void m151558a(List<SearchBaseInfo> list) {
        Map<String, Integer> a;
        SearchChatterInfo searchChatterInfo;
        if (!C38364a.m151054a().mo140439a("foward.quickswitcher.v119")) {
            Log.m165379d("ForwardFeedDataFetcher", "FG lark.client.contact.opt Disabled");
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (SearchBaseInfo searchBaseInfo : list) {
            if (searchBaseInfo instanceof SearchChatterInfo) {
                SearchChatterInfo searchChatterInfo2 = (SearchChatterInfo) searchBaseInfo;
                hashMap.put(searchChatterInfo2.getId(), searchChatterInfo2);
                String p2pChatId = searchChatterInfo2.getP2pChatId();
                String id = searchChatterInfo2.getId();
                if (p2pChatId.equals(id)) {
                    p2pChatId = searchChatterInfo2.getId();
                }
                if (TextUtils.isEmpty(p2pChatId)) {
                    Log.m165379d("ForwardFeedDataFetcher", "chat id is empty");
                } else {
                    hashMap2.put(id, p2pChatId);
                }
            }
        }
        if (!hashMap2.isEmpty() && (a = C38364a.m151054a().mo140452n().mo140501a(hashMap2)) != null && !a.isEmpty()) {
            for (Map.Entry<String, Integer> entry : a.entrySet()) {
                if (hashMap.containsKey(entry.getKey()) && (searchChatterInfo = (SearchChatterInfo) hashMap.get(entry.getKey())) != null) {
                    searchChatterInfo.setDeniedReason(entry.getValue().intValue());
                }
            }
        }
    }

    public RunnableC38430a(C38432c cVar, IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback) {
        this.f98801a = iGetDataCallback;
        this.f98802b = cVar;
    }
}
