package com.bytedance.ee.bear.wiki.homepage.spacebanner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import java.util.ArrayList;
import java.util.Iterator;

public class WikiSpaceListParser extends C8277e {

    public static class Data implements NonProguard {
        public int attr;
        public long browse_time;
        public String description;
        public HomePage home_page;
        public boolean is_star;
        public SpaceCover space_cover;
        public String space_icon;
        public String space_id;
        public String space_name;

        public static class HomePage implements NonProguard {
            public String obj_token;
            public int obj_type;
            public String wiki_token;
        }

        public static class SpaceCover implements NonProguard {
            public String color_value;
            public boolean is_graph_dark;
            public String key;
            public String origin;
            public String thumbnail;
        }
    }

    @Override // com.bytedance.ee.bear.list.C8277e
    /* renamed from: a */
    public DocumentListInfo parse(String str) {
        ArrayList<Document> arrayList = new ArrayList<>();
        Iterator it = ((ArrayList) ((NetService.Result) JSON.parseObject(str, new TypeReference<NetService.Result<ArrayList<Data>>>() {
            /* class com.bytedance.ee.bear.wiki.homepage.spacebanner.WikiSpaceListParser.C119851 */
        }, new Feature[0])).getData()).iterator();
        while (it.hasNext()) {
            Data data = (Data) it.next();
            WikiDocument wikiDocument = new WikiDocument();
            wikiDocument.mo32376B(data.space_id);
            wikiDocument.mo32443g(data.space_name);
            wikiDocument.mo32380D(data.space_icon);
            wikiDocument.mo32412a(data.is_star);
            wikiDocument.mo32476p(String.valueOf(data.browse_time));
            wikiDocument.mo21007a(data.description);
            wikiDocument.mo21005a(data.attr);
            if (data.home_page != null) {
                wikiDocument.mo21010b(data.home_page.wiki_token);
                wikiDocument.mo32451i(data.home_page.obj_token);
                wikiDocument.mo32433d(data.home_page.obj_type);
            }
            if (data.space_cover != null) {
                WikiDocument.SpaceCover spaceCover = new WikiDocument.SpaceCover();
                spaceCover.mo21032c(data.space_cover.key);
                spaceCover.mo21033d(data.space_cover.color_value);
                spaceCover.mo21028a(data.space_cover.is_graph_dark);
                spaceCover.mo21027a(data.space_cover.origin);
                spaceCover.mo21030b(data.space_cover.thumbnail);
                wikiDocument.mo21006a(spaceCover);
            }
            arrayList.add(wikiDocument);
        }
        DocumentListInfo documentListInfo = new DocumentListInfo();
        documentListInfo.setDocumentList(arrayList);
        C13479a.m54764b("WikiSpaceListParser", "wiki space list size: " + arrayList.size());
        return documentListInfo;
    }
}
