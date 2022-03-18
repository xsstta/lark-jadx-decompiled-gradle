package com.bytedance.ee.bear.wiki.wikitree.api;

import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;

public class MoveWikiRelationPuller extends AbstractC12057a<Params, Result> {

    public static class Result implements NonProguard {
        public boolean isSuccess;

        public String toString() {
            return "Result{isSuccess=" + this.isSuccess + '}';
        }
    }

    public static class Params implements NonProguard {
        public String member_id;
        public String new_parent_wiki_token;
        public String old_parent_wiki_token;
        public int seq_id;
        public String space_id;
        public String wiki_token;

        public String toString() {
            return "Params{space_id='" + C13721c.m55650d(this.space_id) + '\'' + ", old_parent_wiki_token='" + C13721c.m55650d(this.old_parent_wiki_token) + '\'' + ", new_parent_wiki_token='" + C13721c.m55650d(this.new_parent_wiki_token) + '\'' + ", wiki_token='" + C13721c.m55650d(this.wiki_token) + '\'' + ", seq_id='" + this.seq_id + '\'' + ", member_id='" + this.member_id + '\'' + '}';
        }
    }
}
