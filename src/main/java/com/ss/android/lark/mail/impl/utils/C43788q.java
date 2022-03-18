package com.ss.android.lark.mail.impl.utils;

import android.text.TextUtils;
import com.ss.android.lark.mail.impl.utils.C43788q.AbstractC43789a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.mail.impl.utils.q */
public class C43788q<T extends AbstractC43789a> {

    /* renamed from: a */
    AbstractC43790b<T> f111088a;

    /* renamed from: b */
    private final T f111089b;

    /* renamed from: c */
    private final Map<String, T> f111090c = new ConcurrentHashMap();

    /* renamed from: com.ss.android.lark.mail.impl.utils.q$a */
    public interface AbstractC43789a<T> {
        /* renamed from: N */
        String mo155022N();

        /* renamed from: d */
        void mo155040d(String str);
    }

    /* renamed from: com.ss.android.lark.mail.impl.utils.q$b */
    public interface AbstractC43790b<T> {
        /* renamed from: b */
        T mo155066b(String str);
    }

    /* renamed from: a */
    public synchronized T mo155954a() {
        return this.f111089b;
    }

    public C43788q(AbstractC43790b<T> bVar) {
        this.f111088a = bVar;
        this.f111089b = bVar.mo155066b("");
    }

    /* renamed from: a */
    public synchronized T mo155955a(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.f111089b;
        } else if (TextUtils.equals(str, this.f111089b.mo155022N())) {
            return this.f111089b;
        } else {
            T t = this.f111090c.get(str);
            if (t == null) {
                t = this.f111088a.mo155066b(str);
                this.f111090c.put(str, t);
            }
            return t;
        }
    }

    /* renamed from: a */
    public synchronized void mo155956a(String str, List<String> list) {
        this.f111089b.mo155040d(str);
        if (list == null || list.size() <= 1) {
            this.f111090c.clear();
        } else {
            HashSet<String> hashSet = new HashSet(this.f111090c.keySet());
            ArrayList<String> arrayList = new ArrayList(list);
            arrayList.remove(str);
            for (String str2 : arrayList) {
                hashSet.remove(str2);
            }
            for (String str3 : hashSet) {
                this.f111090c.remove(str3);
            }
        }
    }
}
