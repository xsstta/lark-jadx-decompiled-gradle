package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.ss.lark.android.passport.biz.widget.picker.C65329b;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.compat.v2.featurec.model.a */
public class C64482a implements C65329b.AbstractC65337b {

    /* renamed from: a */
    private String f162821a;

    /* renamed from: b */
    private String f162822b;

    @Override // com.ss.lark.android.passport.biz.widget.picker.C65329b.AbstractC65337b
    public List<C65329b.AbstractC65337b> getPickDatas() {
        return null;
    }

    @Override // com.ss.lark.android.passport.biz.widget.picker.C65329b.AbstractC65337b
    public String getContent() {
        return this.f162821a;
    }

    @Override // com.ss.lark.android.passport.biz.widget.picker.C65329b.AbstractC65337b
    public String getKey() {
        return this.f162822b;
    }

    public C64482a(String str, String str2) {
        this.f162821a = str;
        this.f162822b = str2;
    }
}
