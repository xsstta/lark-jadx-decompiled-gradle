package com.ss.android.lark.tab.space.list.mvp.base;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchWikiInfo;
import com.ss.android.lark.tab.space.list.entity.SpaceListViewData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0003J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0003¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/base/ModelParserForSearchResponse;", "", "()V", "parseToSpaceListFromSearch", "", "Lcom/ss/android/lark/tab/space/list/entity/SpaceListViewData;", "searchResponse", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "parseToSpaceListViewData", "spaceInfo", "Lcom/ss/android/lark/searchcommon/dto/info/SearchSpaceInfo;", "wikiInfo", "Lcom/ss/android/lark/searchcommon/dto/info/SearchWikiInfo;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.list.mvp.base.e */
public final class ModelParserForSearchResponse {

    /* renamed from: a */
    public static final ModelParserForSearchResponse f136507a = new ModelParserForSearchResponse();

    private ModelParserForSearchResponse() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<SpaceListViewData> m214519a(SearchResponse searchResponse) {
        Intrinsics.checkParameterIsNotNull(searchResponse, "searchResponse");
        List<SearchBaseInfo> infoList = searchResponse.getInfoList();
        ArrayList arrayList = new ArrayList();
        for (SearchBaseInfo searchBaseInfo : infoList) {
            Intrinsics.checkExpressionValueIsNotNull(searchBaseInfo, "info");
            if (searchBaseInfo.getType() == 6) {
                arrayList.add(m214517a((SearchSpaceInfo) searchBaseInfo));
            } else if (searchBaseInfo.getType() == 15) {
                arrayList.add(m214518a((SearchWikiInfo) searchBaseInfo));
            }
        }
        return arrayList;
    }

    @JvmStatic
    /* renamed from: a */
    private static final SpaceListViewData m214517a(SearchSpaceInfo searchSpaceInfo) {
        boolean z;
        String id = searchSpaceInfo.getId();
        DocType docType = searchSpaceInfo.getDocType();
        Intrinsics.checkExpressionValueIsNotNull(docType, "spaceInfo.docType");
        long updateTime = searchSpaceInfo.getUpdateTime();
        String docUrl = searchSpaceInfo.getDocUrl();
        String ownerName = searchSpaceInfo.getOwnerName();
        if (searchSpaceInfo.isCrossTenant()) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            if (N.mo134399b()) {
                z = true;
                int position = searchSpaceInfo.getPosition();
                String threadId = searchSpaceInfo.getThreadId();
                int threadPosition = searchSpaceInfo.getThreadPosition();
                long lastOpenTime = searchSpaceInfo.getLastOpenTime();
                String editUserName = searchSpaceInfo.getEditUserName();
                String id2 = searchSpaceInfo.getId();
                Intrinsics.checkExpressionValueIsNotNull(id2, "spaceInfo.id");
                String title = searchSpaceInfo.getTitle();
                Intrinsics.checkExpressionValueIsNotNull(title, "spaceInfo.title");
                String subTitle = searchSpaceInfo.getSubTitle();
                Intrinsics.checkExpressionValueIsNotNull(subTitle, "spaceInfo.subTitle");
                String avatarKey = searchSpaceInfo.getAvatarKey();
                Intrinsics.checkExpressionValueIsNotNull(avatarKey, "spaceInfo.avatarKey");
                return new SpaceListViewData(id, docType, updateTime, docUrl, ownerName, z, position, threadId, threadPosition, lastOpenTime, editUserName, id2, title, subTitle, avatarKey, false, null);
            }
        }
        z = false;
        int position2 = searchSpaceInfo.getPosition();
        String threadId2 = searchSpaceInfo.getThreadId();
        int threadPosition2 = searchSpaceInfo.getThreadPosition();
        long lastOpenTime2 = searchSpaceInfo.getLastOpenTime();
        String editUserName2 = searchSpaceInfo.getEditUserName();
        String id22 = searchSpaceInfo.getId();
        Intrinsics.checkExpressionValueIsNotNull(id22, "spaceInfo.id");
        String title2 = searchSpaceInfo.getTitle();
        Intrinsics.checkExpressionValueIsNotNull(title2, "spaceInfo.title");
        String subTitle2 = searchSpaceInfo.getSubTitle();
        Intrinsics.checkExpressionValueIsNotNull(subTitle2, "spaceInfo.subTitle");
        String avatarKey2 = searchSpaceInfo.getAvatarKey();
        Intrinsics.checkExpressionValueIsNotNull(avatarKey2, "spaceInfo.avatarKey");
        return new SpaceListViewData(id, docType, updateTime, docUrl, ownerName, z, position2, threadId2, threadPosition2, lastOpenTime2, editUserName2, id22, title2, subTitle2, avatarKey2, false, null);
    }

    @JvmStatic
    /* renamed from: a */
    private static final SpaceListViewData m214518a(SearchWikiInfo searchWikiInfo) {
        boolean z;
        SearchSpaceInfo spaceInfo = searchWikiInfo.getSpaceInfo();
        String id = searchWikiInfo.getId();
        Intrinsics.checkExpressionValueIsNotNull(spaceInfo, "spaceInfo");
        DocType docType = spaceInfo.getDocType();
        Intrinsics.checkExpressionValueIsNotNull(docType, "spaceInfo.docType");
        long updateTime = spaceInfo.getUpdateTime();
        String docUrl = spaceInfo.getDocUrl();
        String ownerName = spaceInfo.getOwnerName();
        if (spaceInfo.isCrossTenant()) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            if (N.mo134399b()) {
                z = true;
                int position = spaceInfo.getPosition();
                String threadId = spaceInfo.getThreadId();
                int threadPosition = spaceInfo.getThreadPosition();
                long lastOpenTime = spaceInfo.getLastOpenTime();
                String editUserName = spaceInfo.getEditUserName();
                String id2 = searchWikiInfo.getId();
                Intrinsics.checkExpressionValueIsNotNull(id2, "wikiInfo.id");
                String title = searchWikiInfo.getTitle();
                Intrinsics.checkExpressionValueIsNotNull(title, "wikiInfo.title");
                String subTitle = searchWikiInfo.getSubTitle();
                Intrinsics.checkExpressionValueIsNotNull(subTitle, "wikiInfo.subTitle");
                String avatarKey = searchWikiInfo.getAvatarKey();
                Intrinsics.checkExpressionValueIsNotNull(avatarKey, "wikiInfo.avatarKey");
                return new SpaceListViewData(id, docType, updateTime, docUrl, ownerName, z, position, threadId, threadPosition, lastOpenTime, editUserName, id2, title, subTitle, avatarKey, true, searchWikiInfo.getUrl());
            }
        }
        z = false;
        int position2 = spaceInfo.getPosition();
        String threadId2 = spaceInfo.getThreadId();
        int threadPosition2 = spaceInfo.getThreadPosition();
        long lastOpenTime2 = spaceInfo.getLastOpenTime();
        String editUserName2 = spaceInfo.getEditUserName();
        String id22 = searchWikiInfo.getId();
        Intrinsics.checkExpressionValueIsNotNull(id22, "wikiInfo.id");
        String title2 = searchWikiInfo.getTitle();
        Intrinsics.checkExpressionValueIsNotNull(title2, "wikiInfo.title");
        String subTitle2 = searchWikiInfo.getSubTitle();
        Intrinsics.checkExpressionValueIsNotNull(subTitle2, "wikiInfo.subTitle");
        String avatarKey2 = searchWikiInfo.getAvatarKey();
        Intrinsics.checkExpressionValueIsNotNull(avatarKey2, "wikiInfo.avatarKey");
        return new SpaceListViewData(id, docType, updateTime, docUrl, ownerName, z, position2, threadId2, threadPosition2, lastOpenTime2, editUserName2, id22, title2, subTitle2, avatarKey2, true, searchWikiInfo.getUrl());
    }
}
