package com.ss.android.vesdk.audio;

import java.nio.ByteBuffer;

/* renamed from: com.ss.android.vesdk.audio.g */
public class C63948g {

    /* renamed from: a */
    private C63951c f161484a;

    /* renamed from: b */
    private int f161485b;

    /* renamed from: com.ss.android.vesdk.audio.g$c */
    public static class C63951c {
    }

    /* renamed from: com.ss.android.vesdk.audio.g$a */
    public static class C63949a extends C63951c {

        /* renamed from: a */
        public byte[] f161486a;

        /* renamed from: a */
        public byte[] mo221303a() {
            return this.f161486a;
        }

        public C63949a(byte[] bArr) {
            this.f161486a = bArr;
        }
    }

    /* renamed from: com.ss.android.vesdk.audio.g$b */
    public static class C63950b extends C63951c {

        /* renamed from: a */
        ByteBuffer f161487a;

        /* renamed from: a */
        public ByteBuffer mo221304a() {
            return this.f161487a;
        }

        public C63950b(ByteBuffer byteBuffer) {
            this.f161487a = byteBuffer;
        }
    }

    /* renamed from: a */
    public C63951c mo221301a() {
        return this.f161484a;
    }

    /* renamed from: b */
    public int mo221302b() {
        return this.f161485b;
    }

    public C63948g(C63951c cVar, int i) {
        this.f161484a = cVar;
        this.f161485b = i;
    }

    /* renamed from: a */
    public static C63948g m251047a(ByteBuffer byteBuffer, int i) {
        return new C63948g(new C63950b(byteBuffer), i);
    }

    /* renamed from: a */
    public static C63948g m251048a(byte[] bArr, int i) {
        return new C63948g(new C63949a(bArr), i);
    }
}
