package com.bytedance.ee.bear.wiki.wikitree.push;

import com.bytedance.ee.util.p716r.C13721c;

public class UdeArea extends BaseEntity {
    public String new_area_id;
    public String old_area_id;
    public boolean perm_change;
    public String root_token;
    public String scope;

    public String toString() {
        return "UdeArea{root_token='" + C13721c.m55650d(this.root_token) + '\'' + ", old_area_id='" + this.old_area_id + '\'' + ", new_area_id='" + this.new_area_id + '\'' + ", scope='" + this.scope + '\'' + ", perm_change=" + this.perm_change + ", op='" + this.op + '\'' + ", space_id='" + C13721c.m55650d(this.space_id) + '\'' + ", wiki_token='" + C13721c.m55650d(this.wiki_token) + '\'' + ", member_id='" + this.member_id + '\'' + ", op_uid='" + this.op_uid + '\'' + ", too_many_coordinator=" + this.too_many_coordinator + ", delay_time=" + this.delay_time + '}';
    }
}
