package com.bytedance.pipeline;

/* renamed from: com.bytedance.pipeline.f */
public interface AbstractC20237f {
    /* renamed from: a */
    <T> T mo68500a(Class<T> cls);

    /* renamed from: com.bytedance.pipeline.f$a */
    public static class C20238a implements AbstractC20237f {
        @Override // com.bytedance.pipeline.AbstractC20237f
        /* renamed from: a */
        public <T> T mo68500a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
