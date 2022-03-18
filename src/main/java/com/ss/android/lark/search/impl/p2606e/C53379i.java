package com.ss.android.lark.search.impl.p2606e;

import com.ss.android.lark.search.impl.entity.viewdata.SearchOpenAppViewData;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.search.impl.e.i */
public class C53379i extends AbstractC53371a<SearchOpenAppViewData, SearchOpenAppInfo> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public SearchOpenAppViewData mo182051a(SearchOpenAppInfo searchOpenAppInfo) {
        return new SearchOpenAppViewData();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo182053a(SearchOpenAppViewData searchOpenAppViewData, SearchOpenAppInfo searchOpenAppInfo) {
        searchOpenAppViewData.setAppState(searchOpenAppInfo.getAppState());
        HashMap hashMap = new HashMap();
        for (SearchOpenAppInfo.SearchOpenAppAbility searchOpenAppAbility : searchOpenAppInfo.getAbilities()) {
            hashMap.put(Integer.valueOf(searchOpenAppAbility.getType()), new SearchOpenAppViewData.OpenAppAbilityViewData(searchOpenAppAbility.getType(), searchOpenAppAbility.getRequiredInfo()));
        }
        searchOpenAppViewData.setAbilities(hashMap);
        searchOpenAppViewData.setAppStoreUrl(searchOpenAppInfo.getAppStoreUrl());
        searchOpenAppViewData.available(searchOpenAppInfo.isAvailable());
        searchOpenAppViewData.setExtraHitFields(new ArrayList(searchOpenAppInfo.getExtraHitFields()));
    }
}
