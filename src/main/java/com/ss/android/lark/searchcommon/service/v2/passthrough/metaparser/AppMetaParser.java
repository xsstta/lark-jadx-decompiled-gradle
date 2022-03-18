package com.ss.android.lark.searchcommon.service.v2.passthrough.metaparser;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.entities.AppStatusInfo;
import com.ss.android.lark.pb.usearch.AppMeta;
import com.ss.android.lark.searchcommon.dto.OpenAppState;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/passthrough/metaparser/AppMetaParser;", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/IParser;", "Lcom/ss/android/lark/pb/usearch/AppMeta;", "()V", "parser", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "meta", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.b.a.a */
public final class AppMetaParser {

    /* renamed from: a */
    public static final Companion f133238a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/passthrough/metaparser/AppMetaParser$Companion;", "", "()V", "TAG", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.service.b.b.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public SearchBaseInfo mo184341a(AppMeta appMeta) {
        SearchOpenAppInfo searchOpenAppInfo;
        if (appMeta != null) {
            searchOpenAppInfo = new SearchOpenAppInfo();
            for (AppStatusInfo.FeatureAbility featureAbility : appMeta.mapp_ability) {
                if (featureAbility != null) {
                    int i = C53921b.f133239a[featureAbility.ordinal()];
                    if (i == 1) {
                        searchOpenAppInfo.getAbilities().add(new SearchOpenAppInfo.SearchOpenAppAbility(3, appMeta.mapp_url));
                    } else if (i == 2) {
                        searchOpenAppInfo.getAbilities().add(new SearchOpenAppInfo.SearchOpenAppAbility(2, appMeta.mapp_url));
                    } else if (i == 3) {
                        searchOpenAppInfo.getAbilities().add(new SearchOpenAppInfo.SearchOpenAppAbility(1, appMeta.mbot_id));
                    }
                }
                Log.m165383e("Lark.Search.Recommend.MetaParserAppMetaParser", "wtf!!!");
            }
            searchOpenAppInfo.setAppState(OpenAppState.USABLE);
            searchOpenAppInfo.available(true);
        } else {
            searchOpenAppInfo = null;
        }
        return searchOpenAppInfo;
    }
}
