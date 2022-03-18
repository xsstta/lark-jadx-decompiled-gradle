package com.bytedance.ee.bear.wiki.wikitree.api;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.wiki.wikitree.bean.TreeNode;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p716r.C13721c;
import java.util.List;

public class GetWikiRelationPuller extends AbstractC12057a<Params, Result> {

    public static class Params implements NonProguard {
        public String space_id;
        public String wiki_token;

        public String toString() {
            return "Params{space_id='" + C13721c.m55650d(this.space_id) + '\'' + ", wiki_token='" + C13721c.m55650d(this.wiki_token) + '\'' + '}';
        }

        public Params(String str, String str2) {
            this.space_id = str;
            this.wiki_token = str2;
        }
    }

    public static class Result implements NonProguard {
        public boolean is_single_tree;
        public List<TreeNode> tree;

        public String toString() {
            return "Result{tree=" + C13657b.m55424c(this.tree) + ", is_single_tree=" + this.is_single_tree + '}';
        }
    }

    GetWikiRelationPuller(NetService netService) {
        super(netService, "/api/wiki/tree/get_wiki_relation/", 2);
    }
}
