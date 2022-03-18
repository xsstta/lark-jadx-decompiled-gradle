package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;

public class CreateNodePuller extends AbstractC12451a<Params, TreeNode> {

    public static class Params implements NonProguard {
        public int node_type;
        public int obj_type;
        public String parent_wiki_token;
        public String space_id;
        public String synergy_uuid;
        public String title;
        public String wiki_token;

        public String toString() {
            return "Params{space_id='" + C13721c.m55650d(this.space_id) + '\'' + ", parent_wiki_token='" + C13721c.m55650d(this.parent_wiki_token) + '\'' + ", title='" + C13721c.m55650d(this.title) + '\'' + ", obj_type='" + this.obj_type + '\'' + '}';
        }

        public Params(String str, String str2, String str3, int i, String str4) {
            this.space_id = str;
            this.parent_wiki_token = str2;
            this.title = str3;
            this.obj_type = i;
            this.wiki_token = "";
            this.synergy_uuid = str4;
        }

        public Params(String str, String str2, String str3, String str4, String str5) {
            this.space_id = str;
            this.parent_wiki_token = str2;
            this.title = str3;
            this.wiki_token = str4;
            this.node_type = 1;
            this.synergy_uuid = str5;
        }
    }

    CreateNodePuller(NetService netService) {
        super(netService, "/space/api/wiki/v2/tree/create_node/", 1);
    }
}
