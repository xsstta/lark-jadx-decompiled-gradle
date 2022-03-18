package com.bytedance.ee.bear.wiki.wikitree.push;

import com.bytedance.ee.util.io.NonProguard;

public class BaseEntity implements NonProguard {
    public long delay_time;
    public String member_id;
    public String op;
    public String op_uid;
    public String space_id;
    public boolean too_many_coordinator;
    public String wiki_token;
}
