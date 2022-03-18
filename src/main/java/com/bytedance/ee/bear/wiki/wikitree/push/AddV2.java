package com.bytedance.ee.bear.wiki.wikitree.push;

import com.bytedance.ee.util.p716r.C13721c;

public class AddV2 extends BaseEntity {
    public String area_id;
    public int child_num;
    public String obj_token;
    public int obj_type;
    public String parent;
    public double sort_id;

    public String toString() {
        return "AddV2{parent='" + C13721c.m55650d(this.parent) + '\'' + ", obj_token='" + C13721c.m55650d(this.obj_token) + '\'' + ", obj_type=" + this.obj_type + ", child_num=" + this.child_num + ", sort_id='" + this.sort_id + '\'' + ", area_id='" + this.area_id + '\'' + ", op='" + this.op + '\'' + ", space_id='" + C13721c.m55650d(this.space_id) + '\'' + ", wiki_token='" + C13721c.m55650d(this.wiki_token) + '\'' + ", member_id='" + this.member_id + '\'' + ", op_uid='" + this.op_uid + '\'' + ", too_many_coordinator=" + this.too_many_coordinator + ", delay_time=" + this.delay_time + '}';
    }
}
