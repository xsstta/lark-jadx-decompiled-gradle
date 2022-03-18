package com.bytedance.ee.bear.wiki.wikitree.api;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;
import java.util.Map;

public class DelWikiRelationPuller extends AbstractC12057a<Params, Result> {

    public static class Params implements NonProguard {
        public String member_id;
        public String space_id;
        public String wiki_token;

        public String toString() {
            return "Params{space_id='" + C13721c.m55650d(this.space_id) + '\'' + ", wiki_token='" + C13721c.m55650d(this.wiki_token) + '\'' + ", member_id='" + this.member_id + '\'' + '}';
        }

        public Params(String str, String str2, String str3) {
            this.space_id = str;
            this.wiki_token = str2;
            this.member_id = str3;
        }
    }

    public static class Result implements NonProguard {
        public Map<String, Double> children_sort_id;
        public boolean is_success;

        public String toString() {
            return "Result{isSuccess=" + this.is_success + ", children_sort_id=" + this.children_sort_id + '}';
        }
    }

    DelWikiRelationPuller(NetService netService) {
        super(netService, "/api/wiki/tree/del_wiki_relation/", 1);
    }
}
