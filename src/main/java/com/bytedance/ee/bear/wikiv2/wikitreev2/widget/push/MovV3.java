package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push;

import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;

public final class MovV3 implements NonProguard {
    public long delay_time;
    public String from;
    public String new_space_id;
    public String old_space_id;
    public String op;
    public String op_uid;
    public String synergy_uuid;
    public String to;
    public boolean too_many_coordinator;
    public String wiki_token;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MovV3{, old_space_id='");
        sb.append(C13721c.m55650d(this.old_space_id));
        sb.append('\'');
        sb.append(", new_space_id='");
        sb.append(C13721c.m55650d(this.new_space_id));
        sb.append('\'');
        sb.append(", wiki_token='");
        sb.append(C13721c.m55650d(this.wiki_token));
        sb.append('\'');
        sb.append(", from='");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.from);
        sb2.append('\'');
        sb2.append(", to='");
        sb2.append(C13721c.m55650d(this.to + '\'' + '}'));
        sb.append(C13721c.m55650d(sb2.toString()));
        return sb.toString();
    }
}
