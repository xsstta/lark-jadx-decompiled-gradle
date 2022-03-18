package com.bytedance.ee.bear.list.folder;

import android.os.Bundle;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.more.itemv2.C8633c;

/* renamed from: com.bytedance.ee.bear.list.folder.l */
public class C8369l extends C8633c {

    /* renamed from: c */
    private final String f22598c;

    @Override // com.bytedance.ee.bear.list.more.itemv2.C8634d.AbstractC8635a, com.bytedance.ee.bear.list.more.itemv2.C8633c
    /* renamed from: a */
    public Bundle mo32808a() {
        Bundle a = super.mo32808a();
        a.putString("container_type", "folder");
        a.putString("container_id", this.f22598c);
        return a;
    }

    public C8369l(Document document, String str, String str2, String str3) {
        super(document, str, str2);
        this.f22598c = str3;
    }
}
