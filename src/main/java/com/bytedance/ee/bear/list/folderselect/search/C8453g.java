package com.bytedance.ee.bear.list.folderselect.search;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.folderselect.search.SearchResponse;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.list.folderselect.search.g */
public class C8453g implements NetService.AbstractC5074c<SearchResult> {
    /* renamed from: a */
    public SearchResult parse(String str) {
        SearchResult searchResult = new SearchResult();
        try {
            return mo33053a((SearchResponse) JSON.parseObject(str, SearchResponse.class));
        } catch (Exception e) {
            C13479a.m54758a("SearchResultParser", e.getMessage());
            return searchResult;
        }
    }

    /* renamed from: a */
    public SearchResult mo33053a(SearchResponse searchResponse) {
        SearchResult searchResult = new SearchResult();
        searchResult.setHas_more(searchResponse.getData().isHas_more());
        searchResult.setStrategy(searchResponse.getData().getStrategy());
        searchResult.setTotal(searchResponse.getData().getTotal());
        ArrayList arrayList = new ArrayList();
        for (String str : searchResponse.getData().getTokens()) {
            SearchResponse.Data.C8433Entity.ObjsBean objsBean = searchResponse.getData().getEntities().getObjs().get(str);
            Document a = mo33052a(objsBean, searchResponse.getData().getEntities().getUsers().get(objsBean.getOwner_id()));
            if (a != null) {
                arrayList.add(a);
            }
        }
        searchResult.setObjs(arrayList);
        return searchResult;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Document mo33052a(SearchResponse.Data.C8433Entity.ObjsBean objsBean, SearchResponse.Data.C8433Entity.UsersBean usersBean) {
        boolean z;
        if (objsBean == null) {
            return null;
        }
        if (objsBean.getType() == C8275a.f22370c.mo32555b()) {
            int owner_type = objsBean.getOwner_type();
            if (!FolderVersion.isShareFolderV1(owner_type)) {
                z = FolderVersion.acceptOwnerType(owner_type);
            } else if (objsBean.getShare_version() != -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C13479a.m54764b("SearchResultParser", "objToDocument()...unknown ownerType!!!, ownerType = " + owner_type);
                return null;
            } else if (FolderVersion.isNewShareFolder(objsBean.getShare_version())) {
                return null;
            }
        }
        Document document = new Document();
        document.mo32451i(objsBean.getToken());
        document.mo32433d(objsBean.getType());
        document.mo32443g(objsBean.getTitle());
        document.mo32440f(objsBean.getPreview());
        document.mo32434d(objsBean.getOwner_id());
        document.mo32476p(String.valueOf(objsBean.getOpen_time()));
        document.mo32459k(objsBean.getEdit_uid());
        document.mo32446h(objsBean.getEdit_name());
        document.mo32462l(String.valueOf(objsBean.getEdit_time()));
        document.mo32437e(objsBean.getAuthor());
        document.mo32432c(objsBean.isIs_external());
        document.mo32467m(objsBean.getUrl());
        document.mo32487u(objsBean.getSubtype());
        document.mo32431b(objsBean.isCached());
        document.mo32438e(objsBean.isPined());
        document.mo32412a(objsBean.isStared());
        document.mo32435d(objsBean.isIs_share_root());
        document.mo32376B(objsBean.getSpace_id());
        document.mo32442g(objsBean.getShare_version());
        document.mo32461l(objsBean.getOwner_type());
        document.mo32471n(objsBean.isIs_share_folder());
        if (objsBean.getExtra() != null) {
            SearchResponse.Data.C8433Entity.ObjsBean.ExtraBean extra = objsBean.getExtra();
            document.mo32439f(extra.getIcon_encrypted_type());
            document.mo32489v(extra.getIcon());
            document.mo32491w(extra.getIcon_key());
            document.mo32493x(extra.getIcon_nonce());
        }
        if (usersBean != null) {
            document.mo32378C(usersBean.getTenant_id());
        }
        return document;
    }
}
