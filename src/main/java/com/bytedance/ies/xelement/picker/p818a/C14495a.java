package com.bytedance.ies.xelement.picker.p818a;

import java.util.List;

/* renamed from: com.bytedance.ies.xelement.picker.a.a */
public class C14495a implements AbstractC14498d<String> {

    /* renamed from: a */
    private List<String> f38250a;

    @Override // com.bytedance.ies.xelement.picker.p818a.AbstractC14498d
    /* renamed from: a */
    public int mo53384a() {
        return this.f38250a.size();
    }

    public C14495a(List<String> list) {
        this.f38250a = list;
    }

    /* renamed from: a */
    public String mo53386b(int i) {
        if (i < 0 || i >= this.f38250a.size()) {
            return "";
        }
        return this.f38250a.get(i);
    }
}
