package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import android.text.TextUtils;
import com.bytedance.ee.bear.dto.C7584a;
import com.bytedance.ee.bear.dto.SearchResponse;
import com.bytedance.ee.bear.lark.p414b.AbstractC8010s;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo;
import com.ss.android.lark.utils.ApiUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.am */
public class am implements AbstractC8010s {
    /* renamed from: a */
    public static SearchResponse m154989a(com.ss.android.lark.searchcommon.dto.SearchResponse searchResponse) {
        if (searchResponse == null) {
            return null;
        }
        return new SearchResponse(m154990a(searchResponse.getInfoList()), searchResponse.getQuery(), searchResponse.getTotal(), searchResponse.isHasMore());
    }

    /* renamed from: a */
    private static List<C7584a> m154990a(List<SearchBaseInfo> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SearchBaseInfo searchBaseInfo : list) {
            if (searchBaseInfo.getType() == 6) {
                SearchSpaceInfo searchSpaceInfo = (SearchSpaceInfo) searchBaseInfo;
                if (searchSpaceInfo.getWikiInfo() != null && !TextUtils.isEmpty(searchSpaceInfo.getWikiInfo().url)) {
                    arrayList.add(new C7584a(searchSpaceInfo.getTitle(), searchSpaceInfo.getTitleHitTerms(), searchSpaceInfo.getSubTitleHitTerms(), DocType.WIKI, searchSpaceInfo.getDocType(), searchSpaceInfo.getUpdateTime(), searchSpaceInfo.getWikiInfo().url, searchSpaceInfo.getOwnerName(), searchSpaceInfo.getOwnerId(), searchSpaceInfo.getMessageId(), searchSpaceInfo.getPosition(), searchSpaceInfo.isCrossTenant(), searchSpaceInfo.getIcon()));
                } else if (!TextUtils.isEmpty(searchSpaceInfo.getDocUrl())) {
                    arrayList.add(new C7584a(searchSpaceInfo.getTitle(), searchSpaceInfo.getTitleHitTerms(), searchSpaceInfo.getSubTitleHitTerms(), searchSpaceInfo.getDocType(), searchSpaceInfo.getUpdateTime(), searchSpaceInfo.getDocUrl(), searchSpaceInfo.getOwnerName(), searchSpaceInfo.getOwnerId(), searchSpaceInfo.getMessageId(), searchSpaceInfo.getPosition(), searchSpaceInfo.isCrossTenant(), searchSpaceInfo.getIcon()));
                } else {
                    C13479a.m54764b("SearchDependencyImpl", "illegal info");
                }
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8010s
    /* renamed from: a */
    public void mo31023a(String str, int i, int i2, final IGetDataCallback<SearchResponse> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).searchDocForChat(str, i, i2, new IGetDataCallback<com.ss.android.lark.searchcommon.dto.SearchResponse>() {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.am.C392901 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(com.ss.android.lark.searchcommon.dto.SearchResponse searchResponse) {
                iGetDataCallback.onSuccess(am.m154989a(searchResponse));
            }
        });
    }
}
