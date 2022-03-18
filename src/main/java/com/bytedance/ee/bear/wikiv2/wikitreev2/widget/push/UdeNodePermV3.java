package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push;

import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p716r.C13721c;
import java.util.List;

public final class UdeNodePermV3 implements NonProguard {
    public List<String> affected_user;
    public String delay_time;
    public String op;
    public String op_uid;
    public String parent;
    public String space_id;
    public String synergy_uuid;
    public boolean too_many_coordinator;
    public String wiki_token;

    public boolean effect() {
        if (C13657b.m55421a(this.affected_user)) {
            return true;
        }
        return this.affected_user.contains(C4511g.m18594d().mo17356e());
    }

    public String toString() {
        return "UdeNodePermV3{, space_id='" + C13721c.m55650d(this.space_id) + '\'' + ", wiki_token='" + C13721c.m55650d(this.wiki_token) + '\'' + ", parent_wiki_token='" + C13721c.m55650d(this.parent) + '\'' + ", affected_user='" + Integer.valueOf(C13657b.m55424c(this.affected_user)) + '\'' + '}';
    }
}
