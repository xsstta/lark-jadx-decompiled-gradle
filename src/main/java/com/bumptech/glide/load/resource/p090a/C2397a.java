package com.bumptech.glide.load.resource.p090a;

import com.bumptech.glide.load.p083a.AbstractC2149e;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.a.a */
public class C2397a implements AbstractC2149e<ByteBuffer> {

    /* renamed from: a */
    private final ByteBuffer f7941a;

    @Override // com.bumptech.glide.load.p083a.AbstractC2149e
    /* renamed from: b */
    public void mo10505b() {
    }

    /* renamed from: com.bumptech.glide.load.resource.a.a$a */
    public static class C2398a implements AbstractC2149e.AbstractC2150a<ByteBuffer> {
        @Override // com.bumptech.glide.load.p083a.AbstractC2149e.AbstractC2150a
        /* renamed from: a */
        public Class<ByteBuffer> mo10507a() {
            return ByteBuffer.class;
        }

        /* renamed from: a */
        public AbstractC2149e<ByteBuffer> mo10506a(ByteBuffer byteBuffer) {
            return new C2397a(byteBuffer);
        }
    }

    /* renamed from: c */
    public ByteBuffer mo10504a() {
        this.f7941a.position(0);
        return this.f7941a;
    }

    public C2397a(ByteBuffer byteBuffer) {
        this.f7941a = byteBuffer;
    }
}
