package com.bytedance.ee.bear.wikiv2.home.recent;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.util.io.NonProguard;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class RecentWikiListParser extends C8277e {

    public static class Data implements NonProguard {
        public boolean has_more;
        public int total;
        public HashMap<String, UserInfo> users;
        public ArrayList<WikiInfo> wiki_browses;

        public static class UserInfo implements NonProguard {
            public String cn_name;
            public String en_name;
        }

        public static class WikiInfo implements NonProguard {
            public String edit_name;
            public long edit_time;
            public String edit_uid;
            public String obj_token;
            public int obj_type = C8275a.f22377j.mo32555b();
            public long open_count;
            public long open_time;
            public String owner_id;
            public String owner_name;
            public String space_id;
            public String title;
            public String url;
            public String wiki_token;
        }
    }

    @Override // com.bytedance.ee.bear.list.C8277e
    /* renamed from: a */
    public DocumentListInfo parse(String str) {
        Data.UserInfo userInfo;
        DocumentListInfo documentListInfo = new DocumentListInfo();
        NetService.Result result = (NetService.Result) JSON.parseObject(str, new TypeReference<NetService.Result<Data>>() {
            /* class com.bytedance.ee.bear.wikiv2.home.recent.RecentWikiListParser.C122881 */
        }, new Feature[0]);
        if (result.getData() != null) {
            documentListInfo.setHasMore(((Data) result.getData()).has_more);
            documentListInfo.setTotal(((Data) result.getData()).total);
            ArrayList<Document> arrayList = new ArrayList<>();
            if (((Data) result.getData()).wiki_browses != null) {
                Iterator<Data.WikiInfo> it = ((Data) result.getData()).wiki_browses.iterator();
                while (it.hasNext()) {
                    Data.WikiInfo next = it.next();
                    WikiDocument wikiDocument = new WikiDocument();
                    wikiDocument.mo21010b(next.wiki_token);
                    wikiDocument.mo21013c(next.space_id);
                    wikiDocument.mo32476p(String.valueOf(next.open_time));
                    wikiDocument.mo32462l(String.valueOf(next.edit_time));
                    wikiDocument.mo32459k(next.edit_uid);
                    wikiDocument.mo32434d(next.owner_id);
                    HashMap<String, Data.UserInfo> hashMap = ((Data) result.getData()).users;
                    if (!(hashMap == null || (userInfo = hashMap.get(next.owner_id)) == null)) {
                        wikiDocument.mo32470n(userInfo.cn_name);
                        wikiDocument.mo32473o(userInfo.en_name);
                    }
                    wikiDocument.mo32467m(next.url);
                    wikiDocument.mo32451i(next.obj_token);
                    wikiDocument.mo32433d(next.obj_type);
                    wikiDocument.mo32443g(next.title);
                    arrayList.add(wikiDocument);
                }
            }
            documentListInfo.setDocumentList(arrayList);
        }
        return documentListInfo;
    }
}
