package com.bytedance.ee.bear.list.p426d;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.ee.bear.facade.common.icon.C7713a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.p376e.p377a.AbstractC7588a;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.d.f */
public class C8262f extends AbstractC8266j {

    /* renamed from: e */
    private final boolean f22293e;

    @Override // com.bytedance.ee.bear.list.p426d.AbstractC8266j
    /* renamed from: a */
    public void mo32360a() {
        int a = C7713a.m30837a(this.f22305b.mo32483t());
        if (!this.f22293e || this.f22305b.ag().mo32505b() == -1 || TextUtils.isEmpty(this.f22305b.ag().mo32502a())) {
            this.f22307d.setImageResource(a);
        } else {
            ((AbstractC7588a) KoinJavaComponent.m268610a(AbstractC7588a.class)).mo29856a(this.f22305b.ag().mo32502a(), this.f22305b.ag().mo32507c(), a, this.f22307d, this.f22293e);
        }
    }

    C8262f(Context context, Document document, String str, ImageView imageView, boolean z) {
        super(context, document, str, imageView);
        this.f22293e = z;
    }
}
