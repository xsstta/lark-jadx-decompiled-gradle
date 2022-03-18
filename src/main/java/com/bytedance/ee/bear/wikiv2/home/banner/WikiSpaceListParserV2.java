package com.bytedance.ee.bear.wikiv2.home.banner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.wikiv2.home.api.SpaceBean;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p702e.C13657b;
import java.util.ArrayList;
import java.util.List;

public class WikiSpaceListParserV2 extends C8277e {

    public static class Data implements NonProguard {
        public boolean has_more;
        public String last_label;
        public List<SpaceBean> spaces;
    }

    @Override // com.bytedance.ee.bear.list.C8277e
    /* renamed from: a */
    public DocumentListInfo parse(String str) {
        NetService.Result result = (NetService.Result) JSON.parseObject(str, new TypeReference<NetService.Result<Data>>() {
            /* class com.bytedance.ee.bear.wikiv2.home.banner.WikiSpaceListParserV2.C122691 */
        }, new Feature[0]);
        ArrayList<Document> arrayList = new ArrayList<>();
        if (!(result == null || result.getData() == null || C13657b.m55421a(((Data) result.getData()).spaces))) {
            for (SpaceBean spaceBean : ((Data) result.getData()).spaces) {
                WikiDocument wikiDocument = new WikiDocument();
                wikiDocument.mo32376B(spaceBean.space_id);
                wikiDocument.mo32443g(spaceBean.space_name);
                wikiDocument.mo32380D(spaceBean.space_icon);
                wikiDocument.mo32412a(spaceBean.is_star);
                wikiDocument.mo32476p(String.valueOf(spaceBean.browse_time));
                wikiDocument.mo21007a(spaceBean.description);
                wikiDocument.mo21012c(spaceBean.wiki_scope);
                if (spaceBean.space_cover != null) {
                    WikiDocument.SpaceCover spaceCover = new WikiDocument.SpaceCover();
                    spaceCover.mo21032c(spaceBean.space_cover.key);
                    spaceCover.mo21033d(spaceBean.space_cover.color_value);
                    spaceCover.mo21028a(spaceBean.space_cover.is_graph_dark);
                    spaceCover.mo21027a(spaceBean.space_cover.origin);
                    spaceCover.mo21030b(spaceBean.space_cover.thumbnail);
                    wikiDocument.mo21006a(spaceCover);
                }
                arrayList.add(wikiDocument);
            }
        }
        DocumentListInfo documentListInfo = new DocumentListInfo();
        documentListInfo.setDocumentList(arrayList);
        C13479a.m54764b("WikiSpaceListParser", "wiki space list size: " + arrayList.size());
        return documentListInfo;
    }
}
