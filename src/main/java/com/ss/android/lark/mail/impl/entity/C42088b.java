package com.ss.android.lark.mail.impl.entity;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.lark.mail.impl.entity.b */
public class C42088b {

    /* renamed from: a */
    private List<C42087a> f107032a;

    /* renamed from: b */
    private String f107033b;

    /* renamed from: b */
    public List<C42087a> mo151820b() {
        return this.f107032a;
    }

    /* renamed from: c */
    public String mo151821c() {
        return this.f107033b;
    }

    /* renamed from: d */
    public C42087a mo151822d() {
        return mo151818a(this.f107033b);
    }

    /* renamed from: a */
    public List<String> mo151819a() {
        ArrayList arrayList = new ArrayList();
        List<C42087a> list = this.f107032a;
        if (list != null) {
            for (C42087a aVar : list) {
                arrayList.add(aVar.f107024a);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        return Objects.hash(this.f107032a, mo151821c());
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("AccountList{accountSize=");
        List<C42087a> list = this.f107032a;
        if (list != null) {
            obj = Integer.valueOf(list.size());
        } else {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", currentAccountId='");
        sb.append(this.f107033b);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public C42087a mo151818a(String str) {
        if (this.f107032a != null && !TextUtils.isEmpty(str)) {
            for (C42087a aVar : this.f107032a) {
                if (TextUtils.equals(aVar.f107024a, str)) {
                    return aVar;
                }
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C42088b bVar = (C42088b) obj;
        if (!Objects.equals(this.f107032a, bVar.f107032a) || !Objects.equals(mo151821c(), bVar.mo151821c())) {
            return false;
        }
        return true;
    }

    public C42088b(List<C42087a> list, String str) {
        this.f107032a = list;
        this.f107033b = str;
    }
}
