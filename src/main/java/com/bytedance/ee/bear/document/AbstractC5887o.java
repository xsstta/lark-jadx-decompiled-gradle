package com.bytedance.ee.bear.document;

/* renamed from: com.bytedance.ee.bear.document.o */
public interface AbstractC5887o {

    /* renamed from: com.bytedance.ee.bear.document.o$a */
    public interface AbstractC5888a {
        void onLoadFail(int i, Throwable th);

        void onLoadStart();

        void onLoadSuccess();
    }

    /* renamed from: com.bytedance.ee.bear.document.o$b */
    public static class C5889b implements AbstractC5888a {
        @Override // com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
        public void onLoadFail(int i, Throwable th) {
        }

        @Override // com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
        public void onLoadStart() {
        }

        @Override // com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
        public void onLoadSuccess() {
        }
    }

    /* renamed from: a */
    void mo23795a();

    /* renamed from: a */
    void mo23796a(AbstractC5888a aVar);

    /* renamed from: a */
    void mo23797a(boolean z);

    /* renamed from: b */
    void mo23798b();

    /* renamed from: b */
    void mo23799b(AbstractC5888a aVar);

    /* renamed from: c */
    void mo23800c();
}
