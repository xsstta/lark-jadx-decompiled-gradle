package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;

public class CopyNodePuller extends AbstractC12451a<Params, TreeNode> {

    public static class Params implements NonProguard {
        public String space_id;
        public String target_space_id;
        public String target_wiki_token;
        public String title;
        public String wiki_token;

        public String toString() {
            return "Params{space_id='" + C13721c.m55650d(this.space_id) + '\'' + ", wiki_token='" + C13721c.m55650d(this.wiki_token) + '\'' + ", target_space_id='" + C13721c.m55650d(this.target_space_id) + '\'' + ", target_wiki_token='" + C13721c.m55650d(this.target_wiki_token) + '\'' + ", title='" + C13721c.m55650d(this.title) + '\'' + '}';
        }

        public Params(String str, String str2, String str3, String str4, String str5) {
            this.space_id = str;
            this.wiki_token = str2;
            this.target_space_id = str3;
            this.target_wiki_token = str4;
            this.title = str5;
        }
    }

    CopyNodePuller(NetService netService) {
        super(netService, "/space/api/wiki/v2/tree/node/copy/", 1);
    }
}
