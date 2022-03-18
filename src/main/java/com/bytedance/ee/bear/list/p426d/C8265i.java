package com.bytedance.ee.bear.list.p426d;

import android.content.Context;
import android.widget.ImageView;
import com.bytedance.ee.bear.facade.common.icon.C7713a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;

/* renamed from: com.bytedance.ee.bear.list.d.i */
public class C8265i extends AbstractC8266j {
    @Override // com.bytedance.ee.bear.list.p426d.AbstractC8266j
    /* renamed from: a */
    public void mo32360a() {
        int i;
        if (FolderVersion.isShareFolder(this.f22305b.an(), this.f22305b.ap())) {
            i = C7713a.m30836a();
        } else {
            i = C7713a.m30837a(C8275a.f22370c.mo32555b());
        }
        this.f22307d.setImageResource(i);
    }

    C8265i(Context context, Document document, String str, ImageView imageView) {
        super(context, document, str, imageView);
    }
}
