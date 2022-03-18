package com.ss.android.lark.search.impl.p2606e;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Icon;
import com.ss.android.lark.doc.entity.Icon;
import com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData;
import com.ss.android.lark.search.impl.entity.viewdata.SearchSpaceViewData;
import com.ss.android.lark.search.impl.entity.viewdata.SearchWikiViewData;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchWikiInfo;

/* renamed from: com.ss.android.lark.search.impl.e.k */
public class C53381k extends AbstractC53371a<SearchBaseViewData, SearchBaseInfo> {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.search.impl.p2606e.AbstractC53371a
    /* renamed from: a */
    public SearchBaseViewData mo182051a(SearchBaseInfo searchBaseInfo) {
        if (searchBaseInfo instanceof SearchSpaceInfo) {
            return new SearchSpaceViewData();
        }
        if (searchBaseInfo instanceof SearchWikiInfo) {
            return new SearchWikiViewData();
        }
        return new SearchBaseViewData();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.search.impl.p2606e.AbstractC53371a
    /* renamed from: a */
    public void mo182053a(SearchBaseViewData searchBaseViewData, SearchBaseInfo searchBaseInfo) {
        boolean z;
        if ((searchBaseInfo instanceof SearchSpaceInfo) && (searchBaseViewData instanceof SearchSpaceViewData)) {
            SearchSpaceInfo searchSpaceInfo = (SearchSpaceInfo) searchBaseInfo;
            SearchSpaceViewData searchSpaceViewData = (SearchSpaceViewData) searchBaseViewData;
            searchSpaceViewData.setDocId(searchSpaceInfo.getId());
            searchSpaceViewData.setDocType(searchSpaceInfo.getDocType());
            searchSpaceViewData.setDocUrl(searchSpaceInfo.getDocUrl());
            searchSpaceViewData.setUpdateTime(searchSpaceInfo.getUpdateTime());
            if (!searchSpaceInfo.isCrossTenant() || this.f131908a.mo181817c()) {
                z = false;
            } else {
                z = true;
            }
            searchSpaceViewData.setShowCrossTenantTag(z);
            searchSpaceViewData.setPosition(searchSpaceInfo.getPosition());
            searchSpaceViewData.setOwnerName(searchSpaceInfo.getOwnerName());
            searchSpaceViewData.setThreadId(searchSpaceInfo.getThreadId());
            searchSpaceViewData.setThreadPosition(searchSpaceInfo.getThreadPosition());
            searchSpaceViewData.setLastOpenTime(searchSpaceInfo.getLastOpenTime());
            searchSpaceViewData.setEditUserName(searchSpaceInfo.getEditUserName());
            Icon icon = searchSpaceInfo.getIcon();
            if (icon == null || TextUtils.isEmpty(icon.getValue()) || icon.getType() != Icon.Type.IMAGE.getValue()) {
                searchBaseViewData.setAvatarKey(searchSpaceInfo.getAvatarKey());
            } else {
                searchBaseViewData.setAvatarKey(icon.getValue());
            }
        } else if ((searchBaseInfo instanceof SearchWikiInfo) && (searchBaseViewData instanceof SearchWikiViewData)) {
            SearchWikiInfo searchWikiInfo = (SearchWikiInfo) searchBaseInfo;
            SearchWikiViewData searchWikiViewData = (SearchWikiViewData) searchBaseViewData;
            searchWikiViewData.setUrl(searchWikiInfo.getUrl());
            SearchBaseViewData b = mo182054b(searchWikiInfo.getSpaceInfo());
            if (b instanceof SearchSpaceViewData) {
                searchWikiViewData.setSearchSpaceViewData((SearchSpaceViewData) b);
            }
        }
    }
}
