package com.ss.android.lark.ai.smartreply.dto;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.ai.smartreply.dto.a */
public class C28616a {

    /* renamed from: a */
    private List<SmartReplyItem> f72019a;

    /* renamed from: b */
    private Integer f72020b;

    /* renamed from: c */
    private String f72021c;

    /* renamed from: a */
    public List<SmartReplyItem> mo101858a() {
        return this.f72019a;
    }

    /* renamed from: c */
    public String mo101860c() {
        return this.f72021c;
    }

    /* renamed from: b */
    public int mo101859b() {
        Integer num = this.f72020b;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: d */
    public List<String> mo101861d() {
        ArrayList arrayList = new ArrayList();
        for (SmartReplyItem smartReplyItem : this.f72019a) {
            arrayList.add(smartReplyItem.mo101842c());
        }
        return arrayList;
    }

    public C28616a(List<SmartReplyItem> list, Integer num, String str) {
        this.f72019a = list;
        this.f72020b = num;
        this.f72021c = str;
    }
}
