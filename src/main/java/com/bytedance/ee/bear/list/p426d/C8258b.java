package com.bytedance.ee.bear.list.p426d;

import android.content.Context;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.service.C10917c;

/* renamed from: com.bytedance.ee.bear.list.d.b */
public class C8258b {

    /* renamed from: a */
    private Context f22278a;

    /* renamed from: b */
    private C10917c f22279b;

    /* renamed from: c */
    private Document f22280c;

    /* renamed from: d */
    private long f22281d;

    /* renamed from: e */
    private boolean f22282e;

    /* renamed from: a */
    public AbstractC8259c mo32358a() {
        if (this.f22280c.mo32483t() != C8275a.f22370c.mo32555b()) {
            return new C8257a(this.f22280c, this.f22281d, this.f22278a, this.f22279b, this.f22282e);
        }
        if (FolderVersion.isPersonalFolder(this.f22280c.an(), this.f22280c.ap())) {
            return new C8269m();
        }
        return new C8270n();
    }

    public C8258b(Context context, C10917c cVar, Document document, long j, boolean z) {
        this.f22278a = context;
        this.f22279b = cVar;
        this.f22280c = document;
        this.f22281d = j;
        this.f22282e = z;
    }
}
