package com.bytedance.ee.bear.wiki.wikitree.push;

import com.bytedance.ee.util.p716r.C13721c;
import java.util.Map;

public class DelV2 extends BaseEntity {
    public Map<String, Double> children_sort_id;
    public String parent;

    public String toString() {
        return "DelV2{parent='" + C13721c.m55650d(this.parent) + '\'' + ", children_sort_id=" + this.children_sort_id + ", op='" + this.op + '\'' + ", space_id='" + C13721c.m55650d(this.space_id) + '\'' + ", wiki_token='" + C13721c.m55650d(this.wiki_token) + '\'' + ", member_id='" + this.member_id + '\'' + ", op_uid='" + this.op_uid + '\'' + ", too_many_coordinator=" + this.too_many_coordinator + ", delay_time=" + this.delay_time + '}';
    }
}
