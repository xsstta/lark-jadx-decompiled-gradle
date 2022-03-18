package com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a;

import android.graphics.Bitmap;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d.C7333f;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.a.a */
class C7297a implements AbstractC7309g {

    /* renamed from: a */
    private final C7299b f19557a = new C7299b();

    /* renamed from: b */
    private final C7303e<C7298a, Bitmap> f19558b = new C7303e<>();

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.a.a$b */
    static class C7299b extends AbstractC7300b<C7298a> {
        C7299b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C7298a mo28502b() {
            return new C7298a(this);
        }

        /* renamed from: a */
        public C7298a mo28501a(int i, int i2, Bitmap.Config config) {
            C7298a aVar = (C7298a) mo28504c();
            aVar.mo28496a(i, i2, config);
            return aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.a.a$a */
    public static class C7298a implements AbstractC7310h {

        /* renamed from: a */
        private final C7299b f19559a;

        /* renamed from: b */
        private int f19560b;

        /* renamed from: c */
        private int f19561c;

        /* renamed from: d */
        private Bitmap.Config f19562d;

        @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7310h
        /* renamed from: a */
        public void mo28495a() {
            this.f19559a.mo28503a(this);
        }

        public String toString() {
            return C7297a.m29150c(this.f19560b, this.f19561c, this.f19562d);
        }

        public int hashCode() {
            int i;
            int i2 = ((this.f19560b * 31) + this.f19561c) * 31;
            Bitmap.Config config = this.f19562d;
            if (config != null) {
                i = config.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public C7298a(C7299b bVar) {
            this.f19559a = bVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7298a)) {
                return false;
            }
            C7298a aVar = (C7298a) obj;
            if (this.f19560b == aVar.f19560b && this.f19561c == aVar.f19561c && this.f19562d == aVar.f19562d) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public void mo28496a(int i, int i2, Bitmap.Config config) {
            this.f19560b = i;
            this.f19561c = i2;
            this.f19562d = config;
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7309g
    /* renamed from: a */
    public Bitmap mo28488a() {
        return this.f19558b.mo28508a();
    }

    C7297a() {
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f19558b;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7309g
    /* renamed from: c */
    public int mo28493c(Bitmap bitmap) {
        return C7333f.m29294a(bitmap);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7309g
    /* renamed from: b */
    public String mo28492b(Bitmap bitmap) {
        return m29151d(bitmap);
    }

    /* renamed from: d */
    private static String m29151d(Bitmap bitmap) {
        return m29150c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7309g
    /* renamed from: a */
    public void mo28490a(Bitmap bitmap) {
        this.f19558b.mo28510a(this.f19557a.mo28501a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7309g
    /* renamed from: b */
    public String mo28491b(int i, int i2, Bitmap.Config config) {
        return m29150c(i, i2, config);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7309g
    /* renamed from: a */
    public Bitmap mo28489a(int i, int i2, Bitmap.Config config) {
        return this.f19558b.mo28509a(this.f19557a.mo28501a(i, i2, config));
    }

    /* renamed from: c */
    public static String m29150c(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }
}
