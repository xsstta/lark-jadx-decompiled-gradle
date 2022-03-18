package com.bytedance.ee.bear.wiki.wikitree.api;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;

public class CreateWikiRelationPuller extends AbstractC12057a<Params, Result> {

    public static class Params implements NonProguard {
        public String member_id;
        public String name;
        public int obj_type;
        public String space_id;
        public String wiki_token;

        public String toString() {
            return "Params{space_id='" + C13721c.m55650d(this.space_id) + '\'' + ", wiki_token='" + C13721c.m55650d(this.wiki_token) + '\'' + ", name='" + C13721c.m55650d(this.name) + '\'' + ", obj_type=" + this.obj_type + ", member_id='" + this.member_id + '\'' + '}';
        }

        public Params(String str, String str2, String str3, int i, String str4) {
            this.space_id = str;
            this.wiki_token = str2;
            this.name = str3;
            this.obj_type = i;
            this.member_id = str4;
        }
    }

    public static class Result implements NonProguard {
        public String area_id;
        public int child_num;
        public String name;
        public String obj_token;
        public int obj_type;
        public String parent;
        public double sort_id;
        public String space_id;
        public String wikiToken;

        public String toString() {
            return "Result{wikiToken='" + C13721c.m55650d(this.wikiToken) + '\'' + ", name='" + C13721c.m55650d(this.name) + '\'' + ", child_num=" + this.child_num + ", sort_id=" + this.sort_id + ", area_id='" + this.area_id + '\'' + '}';
        }
    }

    CreateWikiRelationPuller(NetService netService) {
        super(netService, "/api/wiki/tree/create_wiki_relation/", 1);
    }
}
