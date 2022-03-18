package com.bytedance.ee.bear.list.p426d;

import android.content.Context;
import android.widget.ImageView;
import com.bytedance.ee.bear.list.dto.Document;

/* renamed from: com.bytedance.ee.bear.list.d.j */
public abstract class AbstractC8266j {

    /* renamed from: a */
    protected Context f22304a;

    /* renamed from: b */
    protected Document f22305b;

    /* renamed from: c */
    protected String f22306c;

    /* renamed from: d */
    protected ImageView f22307d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo32360a();

    public AbstractC8266j(Context context, Document document, String str, ImageView imageView) {
        this.f22305b = document;
        this.f22304a = context;
        this.f22306c = str;
        this.f22307d = imageView;
    }
}
