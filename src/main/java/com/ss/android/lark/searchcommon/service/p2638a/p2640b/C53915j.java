package com.ss.android.lark.searchcommon.service.p2638a.p2640b;

import com.bytedance.lark.pb.search.v1.SearchOpenAppMeta;
import com.ss.android.lark.searchcommon.dto.OpenAppState;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.searchcommon.service.a.b.j */
public class C53915j extends AbstractC53906a<SearchOpenAppInfo, SearchOpenAppMeta> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public SearchOpenAppInfo mo184290a() {
        return new SearchOpenAppInfo();
    }

    /* renamed from: a */
    private List<SearchOpenAppInfo.SearchOpenAppAbility> m208957a(List<SearchOpenAppMeta.OpenAppAbility> list) {
        ArrayList arrayList = new ArrayList();
        for (SearchOpenAppMeta.OpenAppAbility openAppAbility : list) {
            if (openAppAbility.micro_app != null) {
                arrayList.add(new SearchOpenAppInfo.SearchOpenAppAbility(3, openAppAbility.micro_app.url));
            } else if (openAppAbility.h5 != null) {
                arrayList.add(new SearchOpenAppInfo.SearchOpenAppAbility(2, openAppAbility.h5.url));
            } else if (openAppAbility.bot != null) {
                arrayList.add(new SearchOpenAppInfo.SearchOpenAppAbility(1, openAppAbility.bot.bot_id));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo184292a(SearchOpenAppInfo searchOpenAppInfo, SearchOpenAppMeta searchOpenAppMeta) {
        searchOpenAppInfo.setAbilities(m208957a(searchOpenAppMeta.abilities));
        searchOpenAppInfo.setAppState(OpenAppState.forNumber(searchOpenAppMeta.state.getValue()));
        searchOpenAppInfo.setAppStoreUrl(searchOpenAppMeta.app_store_url);
        searchOpenAppInfo.available(searchOpenAppMeta.is_available.booleanValue());
        searchOpenAppInfo.setExtraHitFields(new ArrayList(searchOpenAppMeta.extra_hit_fields));
    }
}
