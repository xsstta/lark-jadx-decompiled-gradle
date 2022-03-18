package com.bytedance.ee.bear.list.more.itemv2;

import android.os.Bundle;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.more.itemv2.C8634d;

/* renamed from: com.bytedance.ee.bear.list.more.itemv2.c */
public class C8633c implements C8634d.AbstractC8635a {

    /* renamed from: a */
    protected final Document f23389a;

    /* renamed from: b */
    protected final String f23390b;

    /* renamed from: c */
    private final String f23391c;

    @Override // com.bytedance.ee.bear.list.more.itemv2.C8634d.AbstractC8635a
    /* renamed from: a */
    public Bundle mo32808a() {
        Bundle bundle = new Bundle();
        bundle.putString("owner_cn_name", this.f23389a.mo32488v());
        bundle.putString("owner_en_name", this.f23389a.mo32490w());
        bundle.putString("module", this.f23390b);
        bundle.putString("sub_module", this.f23391c);
        bundle.putInt("more_scene", 0);
        return bundle;
    }

    public C8633c(Document document, String str, String str2) {
        this.f23389a = document;
        this.f23390b = str;
        this.f23391c = str2;
    }
}
