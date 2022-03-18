package com.ss.ugc.effectplatform.cache.disklrucache;

import bytekn.foundation.io.file.ByteArrayOutputStream;
import bytekn.foundation.io.file.ContentEncoding;
import bytekn.foundation.io.file.FileInputStream;
import bytekn.foundation.io.file.KnCloseable;
import com.ss.ugc.effectplatform.p3242c.C65503a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/ugc/effectplatform/cache/disklrucache/StrictLineReader;", "Lbytekn/foundation/io/file/KnCloseable;", "inputStream", "Lbytekn/foundation/io/file/FileInputStream;", "capacity", "", "contentEncoding", "Lbytekn/foundation/io/file/ContentEncoding;", "(Lbytekn/foundation/io/file/FileInputStream;ILbytekn/foundation/io/file/ContentEncoding;)V", "buf", "", "end", "pos", "close", "", "fillBuf", "", "hasUnterminatedLine", "readLine", "", "Companion", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.a.a.e */
public final class StrictLineReader implements KnCloseable {

    /* renamed from: b */
    public static final byte f164804b = ((byte) 13);

    /* renamed from: c */
    public static final Companion f164805c = new Companion(null);

    /* renamed from: h */
    private static final byte f164806h = ((byte) 10);

    /* renamed from: a */
    public final ContentEncoding f164807a;

    /* renamed from: d */
    private byte[] f164808d;

    /* renamed from: e */
    private int f164809e;

    /* renamed from: f */
    private int f164810f;

    /* renamed from: g */
    private final FileInputStream f164811g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/ugc/effectplatform/cache/disklrucache/StrictLineReader$Companion;", "", "()V", "CR", "", "LF", "TAG", "", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.a.a.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // bytekn.foundation.io.file.KnCloseable
    /* renamed from: b */
    public void mo8708b() {
        this.f164811g.mo8708b();
        this.f164808d = null;
    }

    /* renamed from: c */
    public final boolean mo227680c() {
        if (this.f164810f == -1) {
            return true;
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/ss/ugc/effectplatform/cache/disklrucache/StrictLineReader$readLine$1$out$1", "Lbytekn/foundation/io/file/ByteArrayOutputStream;", "toString", "", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.a.a.e$b */
    public static final class C65496b extends ByteArrayOutputStream {

        /* renamed from: c */
        final /* synthetic */ StrictLineReader f164812c;

        @Override // bytekn.foundation.io.file.ByteArrayOutputStream
        public String toString() {
            int i;
            if (mo8701b() <= 0 || mo8700a()[mo8701b() - 1] != StrictLineReader.f164804b) {
                i = mo8701b();
            } else {
                i = mo8701b() - 1;
            }
            try {
                return C65503a.m256758a(mo8700a(), 0, i, this.f164812c.f164807a);
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65496b(int i, StrictLineReader eVar) {
            super(i);
            this.f164812c = eVar;
        }
    }

    /* renamed from: d */
    private final boolean m256667d() {
        byte[] bArr = this.f164808d;
        if (bArr != null) {
            if (bArr != null) {
                int a = this.f164811g.mo8705a(bArr, 0, bArr.length);
                if (a <= 0) {
                    return false;
                }
                this.f164809e = 0;
                this.f164810f = a;
            }
            return true;
        }
        throw new Exception("buf is null!");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r0[r3] == com.ss.ugc.effectplatform.cache.disklrucache.StrictLineReader.f164804b) goto L_0x002f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo227679a() {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.cache.disklrucache.StrictLineReader.mo227679a():java.lang.String");
    }

    public StrictLineReader(FileInputStream bVar, int i, ContentEncoding contentEncoding) {
        Intrinsics.checkParameterIsNotNull(bVar, "inputStream");
        Intrinsics.checkParameterIsNotNull(contentEncoding, "contentEncoding");
        this.f164811g = bVar;
        this.f164807a = contentEncoding;
        if (i <= 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (contentEncoding == ContentEncoding.Ascii) {
            this.f164808d = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding!");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StrictLineReader(FileInputStream bVar, int i, ContentEncoding contentEncoding, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i2 & 2) != 0 ? 8192 : i, contentEncoding);
    }
}
