package com.bytedance.ee.bear.list.folderselect.p430a;

import android.content.Intent;
import com.bytedance.ee.bear.list.folderselect.C8424n;

/* renamed from: com.bytedance.ee.bear.list.folderselect.a.f */
public class C8396f implements AbstractC8391c<Boolean> {

    /* renamed from: a */
    private final String f22663a;

    /* renamed from: b */
    private final String f22664b;

    /* renamed from: c */
    private final C8424n.AbstractC8427b f22665c;

    /* renamed from: a */
    public Boolean mo32841b() {
        if (this.f22665c == null) {
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("EXTRA_DEST_TOKEN", this.f22663a);
        intent.putExtra("EXTRA_DEST_NAME", this.f22664b);
        this.f22665c.mo32887a(intent);
        return true;
    }

    public C8396f(String str, String str2, C8424n.AbstractC8427b bVar) {
        this.f22663a = str;
        this.f22664b = str2;
        this.f22665c = bVar;
    }
}
