package com.bytedance.ee.bear.wikiv2.browser.plugin;

import com.bytedance.ee.bear.contract.route.parcelable.WikiInfo;
import com.bytedance.ee.util.io.NonProguard;

public class JSWikiInfo implements NonProguard {
    public Info wiki_info;

    public static class Info implements NonProguard {
        public int code;
        public String obj_token;
        public int obj_type;
        public String space_id;
        public String wiki_token;
    }

    public WikiInfo toWikiInfo() {
        WikiInfo wikiInfo = new WikiInfo();
        Info info = this.wiki_info;
        if (info != null) {
            wikiInfo.setCode(info.code);
            wikiInfo.setObjToken(this.wiki_info.obj_token);
            wikiInfo.setObjType(this.wiki_info.obj_type);
            wikiInfo.setSpaceId(this.wiki_info.space_id);
            wikiInfo.setWikiToken(this.wiki_info.wiki_token);
        }
        return wikiInfo;
    }
}
