package com.ss.android.lark.mail.impl.entity;

import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.mail.impl.service.C43277a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.ss.android.lark.mail.impl.entity.c */
public class C42089c {

    /* renamed from: a */
    private int f107034a;

    /* renamed from: b */
    private BadgeCountState f107035b;

    /* renamed from: c */
    private final Map<String, BadgeCountState> f107036c;

    /* renamed from: d */
    private final Map<String, Integer> f107037d;

    /* renamed from: a */
    public int mo151826a() {
        return this.f107034a;
    }

    /* renamed from: b */
    public BadgeCountState mo151830b() {
        return this.f107035b;
    }

    /* renamed from: c */
    public Map<String, BadgeCountState> mo151832c() {
        return this.f107036c;
    }

    /* renamed from: d */
    public Map<String, Integer> mo151833d() {
        return this.f107037d;
    }

    public int hashCode() {
        return Objects.hash(this.f107036c, this.f107037d);
    }

    /* renamed from: com.ss.android.lark.mail.impl.entity.c$a */
    public static class C42091a {

        /* renamed from: a */
        private int f107038a;

        /* renamed from: b */
        private BadgeCountState f107039b;

        /* renamed from: c */
        private Map<String, BadgeCountState> f107040c = new HashMap();

        /* renamed from: d */
        private Map<String, Integer> f107041d = new HashMap();

        /* renamed from: a */
        public C42089c mo151839a() {
            int i = this.f107038a;
            BadgeCountState badgeCountState = this.f107039b;
            Map map = this.f107041d;
            if (map == null) {
                map = new HashMap();
            }
            Map map2 = this.f107040c;
            if (map2 == null) {
                map2 = new HashMap();
            }
            return new C42089c(i, badgeCountState, map, map2);
        }

        /* renamed from: a */
        public C42091a mo151836a(int i) {
            this.f107038a = i;
            return this;
        }

        /* renamed from: a */
        public C42091a mo151837a(BadgeCountState badgeCountState) {
            this.f107039b = badgeCountState;
            return this;
        }

        /* renamed from: a */
        public C42091a mo151838a(Map<String, BadgeCountState> map) {
            if (map == null) {
                this.f107040c.clear();
            } else {
                this.f107040c = map;
            }
            return this;
        }

        /* renamed from: b */
        public C42091a mo151840b(Map<String, Integer> map) {
            if (map == null) {
                this.f107041d.clear();
            } else {
                this.f107041d = map;
            }
            return this;
        }
    }

    /* renamed from: a */
    public BadgeCountState mo151828a(String str) {
        Map<String, BadgeCountState> c = mo151832c();
        if (c == null) {
            return BadgeCountState.GRAY;
        }
        if (c.containsKey(str)) {
            return c.get(str);
        }
        return BadgeCountState.GRAY;
    }

    /* renamed from: b */
    public int mo151829b(String str) {
        Map<String, Integer> d = mo151833d();
        if (d.containsKey(str)) {
            return d.get(str).intValue();
        }
        return 0;
    }

    /* renamed from: b */
    public BadgeCountState mo151831b(boolean z) {
        if (!z) {
            return this.f107035b;
        }
        String n = C43277a.m171921a().mo154950n();
        BadgeCountState badgeCountState = BadgeCountState.GRAY;
        Iterator<String> it = this.f107036c.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            BadgeCountState badgeCountState2 = this.f107036c.get(next);
            if (!TextUtils.equals(n, next) && badgeCountState2 == BadgeCountState.RED && this.f107037d.containsKey(next) && this.f107037d.get(next).intValue() > 0) {
                badgeCountState = badgeCountState2;
                break;
            }
        }
        C13479a.m54763b("get mail badge state: " + badgeCountState);
        return badgeCountState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C42089c cVar = (C42089c) obj;
        if (mo151826a() != cVar.mo151826a() || mo151830b() != cVar.mo151830b() || !Objects.equals(mo151832c(), cVar.mo151832c()) || !Objects.equals(mo151833d(), cVar.mo151833d())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public int mo151827a(boolean z) {
        int intValue;
        if (!z) {
            return this.f107034a;
        }
        String n = C43277a.m171921a().mo154950n();
        BadgeCountState b = mo151831b(true);
        int i = 0;
        for (String str : this.f107037d.keySet()) {
            if (!TextUtils.equals(n, str)) {
                if (b == BadgeCountState.RED && (!this.f107036c.containsKey(str) || this.f107036c.get(str) == BadgeCountState.RED)) {
                    intValue = this.f107037d.get(str).intValue();
                } else if (b != BadgeCountState.RED && (!this.f107036c.containsKey(str) || this.f107036c.get(str) == BadgeCountState.GRAY)) {
                    intValue = this.f107037d.get(str).intValue();
                }
                i += intValue;
            }
        }
        C13479a.m54763b("get mail badge unread count: " + i);
        return i;
    }

    private C42089c(int i, BadgeCountState badgeCountState, Map<String, Integer> map, Map<String, BadgeCountState> map2) {
        this.f107034a = i;
        this.f107035b = badgeCountState;
        this.f107036c = map2;
        this.f107037d = map;
    }
}
