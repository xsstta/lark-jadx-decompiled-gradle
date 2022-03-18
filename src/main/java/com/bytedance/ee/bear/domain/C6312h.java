package com.bytedance.ee.bear.domain;

import android.text.TextUtils;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.log.C13479a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.bear.domain.h */
public class C6312h {

    /* renamed from: a */
    private static volatile C6312h f17504a;

    /* renamed from: b */
    private final PersistenceSharedPreference f17505b = new PersistenceSharedPreference("passportDomainConfig");

    /* renamed from: c */
    private String f17506c;

    /* renamed from: d */
    private final Map<Integer, String> f17507d = new ConcurrentHashMap();

    /* renamed from: e */
    private final Set<Integer> f17508e = Collections.newSetFromMap(new ConcurrentHashMap());

    private C6312h() {
    }

    /* renamed from: a */
    public static C6312h m25323a() {
        if (f17504a == null) {
            synchronized (C6312h.class) {
                if (f17504a == null) {
                    f17504a = new C6312h();
                }
            }
        }
        return f17504a;
    }

    /* renamed from: b */
    private Map<Integer, String> m25324b() {
        if (this.f17507d.size() == 0) {
            C13479a.m54764b("PassportHostHelper", "regex map is empty, get value from Preference");
            for (Integer num : (Set) this.f17505b.mo34038b("urlRegexKeySet", new HashSet())) {
                String string = this.f17505b.getString(num.toString(), "");
                if (!TextUtils.isEmpty(string)) {
                    this.f17507d.put(num, string);
                }
            }
        }
        return this.f17507d;
    }

    /* renamed from: a */
    public void mo25379a(String str) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54764b("PassportHostHelper", "update passport host, but receive empty host");
            return;
        }
        this.f17506c = this.f17505b.getString("passportHost", "");
        C13479a.m54764b("PassportHostHelper", "old passport host is " + this.f17506c + " new value is " + str);
        if (!TextUtils.equals(str, this.f17506c)) {
            this.f17506c = str;
            this.f17505b.mo34037a("passportHost", str);
        }
    }

    /* renamed from: a */
    public void mo25380a(Map<Integer, String> map) {
        m25324b();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (!this.f17507d.containsKey(entry.getKey())) {
                C13479a.m54764b("PassportHostHelper", "do not contains key, add key to map");
                this.f17507d.put(entry.getKey(), entry.getValue());
                this.f17505b.mo34037a(entry.getKey(), entry.getValue());
            } else if (!entry.getValue().equals(this.f17507d.get(entry.getKey()))) {
                C13479a.m54764b("PassportHostHelper", "contains key, change value");
                this.f17507d.put(entry.getKey(), entry.getValue());
                this.f17505b.mo34037a(entry.getKey(), entry.getValue());
            }
            this.f17508e.add(entry.getKey());
        }
        this.f17505b.mo34037a("urlRegexKeySet", this.f17508e);
    }
}
