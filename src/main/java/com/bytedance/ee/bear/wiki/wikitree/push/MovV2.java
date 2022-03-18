package com.bytedance.ee.bear.wiki.wikitree.push;

import com.bytedance.ee.util.p716r.C13721c;

public class MovV2 extends BaseEntity {
    public String area_id;
    public int child_num;
    public String from;
    public String obj_token;
    public int obj_type;
    public double sort_id;
    public String to;

    public String toString() {
        return "MovV2{, obj_token='" + C13721c.m55650d(this.obj_token) + '\'' + ", obj_type=" + this.obj_type + ", from='" + C13721c.m55650d(this.from) + '\'' + ", to='" + C13721c.m55650d(this.to) + '\'' + ", child_num=" + this.child_num + ", sort_id='" + this.sort_id + '\'' + ", area_id='" + this.area_id + '\'' + ", op='" + this.op + '\'' + ", space_id='" + C13721c.m55650d(this.space_id) + '\'' + ", wiki_token='" + C13721c.m55650d(this.wiki_token) + '\'' + ", member_id='" + this.member_id + '\'' + ", op_uid='" + this.op_uid + '\'' + ", too_many_coordinator=" + this.too_many_coordinator + ", delay_time=" + this.delay_time + '}';
    }
}
