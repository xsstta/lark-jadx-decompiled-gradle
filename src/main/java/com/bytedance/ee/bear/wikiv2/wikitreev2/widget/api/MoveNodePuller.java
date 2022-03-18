package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;

public class MoveNodePuller extends AbstractC12451a<Params, Result> {

    public static class Result implements NonProguard {
        public double sort_id;

        public String toString() {
            return "Result{sort_id=" + this.sort_id + '}';
        }
    }

    public static class Params implements NonProguard {
        public String new_parent_wiki_token;
        public String new_space_id;
        public String old_parent_wiki_token;
        public String old_space_id;
        public String previous_token = "";
        public String synergy_uuid;
        public boolean to_Last = true;
        public String wiki_token;

        public String toString() {
            return "Params{old_space_id='" + C13721c.m55650d(this.old_space_id) + '\'' + "new_space_id='" + C13721c.m55650d(this.new_space_id) + '\'' + ", old_parent_wiki_token='" + C13721c.m55650d(this.old_parent_wiki_token) + '\'' + ", new_parent_wiki_token='" + C13721c.m55650d(this.new_parent_wiki_token) + '\'' + ", wiki_token='" + C13721c.m55650d(this.wiki_token) + '\'' + ", previous_token='" + C13721c.m55650d(this.previous_token) + '\'' + ", to_Last='" + this.to_Last + '\'' + '}';
        }

        public Params(String str, String str2, String str3, String str4, String str5, String str6) {
            this.old_space_id = str;
            this.new_space_id = str3;
            this.old_parent_wiki_token = str2;
            this.new_parent_wiki_token = str4;
            this.wiki_token = str5;
            this.synergy_uuid = str6;
        }
    }

    MoveNodePuller(NetService netService) {
        super(netService, "/space/api/wiki/v2/tree/move_node/", 1);
    }
}
