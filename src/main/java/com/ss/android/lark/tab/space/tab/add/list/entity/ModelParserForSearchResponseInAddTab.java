package com.ss.android.lark.tab.space.tab.add.list.entity;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchWikiInfo;
import com.ss.android.lark.tab.space.tab.add.list.entity.SpaceSelectViewData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/list/entity/ModelParserForSearchResponseInAddTab;", "", "()V", "parseToSpaceListViewData", "Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData;", "info", "Lcom/ss/android/lark/searchcommon/dto/info/SearchSpaceInfo;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchWikiInfo;", "parseToSpaceSelectResult", "Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectResult;", "searchResponse", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.tab.add.list.entity.a */
public final class ModelParserForSearchResponseInAddTab {

    /* renamed from: a */
    public static final ModelParserForSearchResponseInAddTab f136591a = new ModelParserForSearchResponseInAddTab();

    private ModelParserForSearchResponseInAddTab() {
    }

    /* renamed from: a */
    public final SpaceSelectResult mo188667a(SearchResponse searchResponse) {
        SpaceSelectViewData spaceSelectViewData;
        Intrinsics.checkParameterIsNotNull(searchResponse, "searchResponse");
        ArrayList arrayList = new ArrayList();
        for (SearchBaseInfo searchBaseInfo : searchResponse.getInfoList()) {
            if (searchBaseInfo instanceof SearchSpaceInfo) {
                spaceSelectViewData = m214653a((SearchSpaceInfo) searchBaseInfo);
            } else if (searchBaseInfo instanceof SearchWikiInfo) {
                spaceSelectViewData = m214654a((SearchWikiInfo) searchBaseInfo);
            } else {
                spaceSelectViewData = null;
            }
            if (spaceSelectViewData != null) {
                arrayList.add(spaceSelectViewData);
            }
        }
        return new SpaceSelectResult(searchResponse.isHasMore(), arrayList);
    }

    @JvmStatic
    /* renamed from: a */
    private static final SpaceSelectViewData m214653a(SearchSpaceInfo searchSpaceInfo) {
        boolean z;
        SpaceSelectViewData.Builder a = SpaceSelectViewData.Companion.mo188666a();
        String id = searchSpaceInfo.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "info.id");
        SpaceSelectViewData.Builder a2 = a.mo188655a(id);
        String docUrl = searchSpaceInfo.getDocUrl();
        Intrinsics.checkExpressionValueIsNotNull(docUrl, "info.docUrl");
        SpaceSelectViewData.Builder b = a2.mo188660b(docUrl);
        DocType docType = searchSpaceInfo.getDocType();
        Intrinsics.checkExpressionValueIsNotNull(docType, "info.docType");
        SpaceSelectViewData.Builder c = b.mo188653a(docType).mo188662c(searchSpaceInfo.getOwnerId());
        String title = searchSpaceInfo.getTitle();
        Intrinsics.checkExpressionValueIsNotNull(title, "info.title");
        SpaceSelectViewData.Builder b2 = c.mo188665f(title).mo188652a(searchSpaceInfo.getUpdateTime()).mo188654a(searchSpaceInfo.getIcon()).mo188656a(new ArrayList<>(searchSpaceInfo.getTitleHitTerms())).mo188661b(new ArrayList<>(searchSpaceInfo.getExtraTitleHitTerms()));
        if (searchSpaceInfo.isCrossTenant()) {
            AbstractC36474h b3 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b3.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            if (!N.mo134399b()) {
                z = true;
                return b2.mo188657a(z).mo188658a();
            }
        }
        z = false;
        return b2.mo188657a(z).mo188658a();
    }

    @JvmStatic
    /* renamed from: a */
    private static final SpaceSelectViewData m214654a(SearchWikiInfo searchWikiInfo) {
        boolean z;
        SearchSpaceInfo spaceInfo = searchWikiInfo.getSpaceInfo();
        SpaceSelectViewData.Builder a = SpaceSelectViewData.Companion.mo188666a();
        String id = searchWikiInfo.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "info.id");
        SpaceSelectViewData.Builder a2 = a.mo188655a(id);
        String url = searchWikiInfo.getUrl();
        Intrinsics.checkExpressionValueIsNotNull(url, "info.url");
        SpaceSelectViewData.Builder a3 = a2.mo188660b(url).mo188653a(DocType.WIKI);
        Intrinsics.checkExpressionValueIsNotNull(spaceInfo, "spaceInfo");
        SpaceSelectViewData.Builder c = a3.mo188659b(spaceInfo.getDocType()).mo188662c(spaceInfo.getOwnerId());
        String title = searchWikiInfo.getTitle();
        Intrinsics.checkExpressionValueIsNotNull(title, "info.title");
        SpaceSelectViewData.Builder b = c.mo188665f(title).mo188652a(spaceInfo.getUpdateTime()).mo188654a(searchWikiInfo.getIcon()).mo188656a(new ArrayList<>(searchWikiInfo.getTitleHitTerms())).mo188661b(new ArrayList<>(searchWikiInfo.getExtraTitleHitTerms()));
        if (searchWikiInfo.isCrossTenant()) {
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b2.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            if (!N.mo134399b()) {
                z = true;
                return b.mo188657a(z).mo188658a();
            }
        }
        z = false;
        return b.mo188657a(z).mo188658a();
    }
}
