package com.bytedance.ee.bear.wiki.wikitree.api;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;

public class MoveWikiRelationV2Puller extends AbstractC12057a<Params, Result> {

    public static class Result implements NonProguard {
        public String area_id;
        public boolean is_success;
        public double sort_id;

        public String toString() {
            return "Result{is_success=" + this.is_success + ", sort_id=" + this.sort_id + ", area_id='" + this.area_id + '\'' + '}';
        }
    }

    public static class Params implements NonProguard {
        public boolean follow_new_parent_perm;
        public String member_id;
        public String new_parent_wiki_token;
        public String old_parent_wiki_token;
        public String previous_token;
        public String space_id;
        public boolean to_last;
        public String wiki_token;

        public String toString() {
            return "Params{space_id='" + C13721c.m55650d(this.space_id) + '\'' + ", old_parent_wiki_token='" + C13721c.m55650d(this.old_parent_wiki_token) + '\'' + ", new_parent_wiki_token='" + C13721c.m55650d(this.new_parent_wiki_token) + '\'' + ", wiki_token='" + C13721c.m55650d(this.wiki_token) + '\'' + ", previous_token='" + C13721c.m55650d(this.previous_token) + '\'' + ", to_last='" + this.to_last + '\'' + ", member_id='" + this.member_id + '\'' + ", follow_new_parent_perm=" + this.follow_new_parent_perm + '}';
        }

        public Params(String str, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2) {
            this.space_id = str;
            this.old_parent_wiki_token = str2;
            this.new_parent_wiki_token = str3;
            this.wiki_token = str4;
            this.previous_token = str5;
            this.to_last = z;
            this.member_id = str6;
            this.follow_new_parent_perm = z2;
        }
    }

    MoveWikiRelationV2Puller(NetService netService) {
        super(netService, "/api/wiki/tree/v2/move_wiki_relation/", 1);
    }
}
