package com.ss.ugc.effectplatform.p3242c;

import bytekn.foundation.io.file.ContentEncoding;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\"\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"toByteArrayExt", "", "", "toString", "startPos", "", "len", "contentEncoding", "Lbytekn/foundation/io/file/ContentEncoding;", "effect_base_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.c.a */
public final class C65503a {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/nio/charset/Charset;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.c.a$a */
    public static final class C65504a extends Lambda implements Function0<Charset> {
        final /* synthetic */ ContentEncoding $contentEncoding;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65504a(ContentEncoding contentEncoding) {
            super(0);
            this.$contentEncoding = contentEncoding;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Charset invoke() {
            if (C65505b.f164879a[this.$contentEncoding.ordinal()] != 1) {
                return Charsets.f173341a;
            }
            return Charsets.f173345e;
        }
    }

    /* renamed from: a */
    public static final byte[] m256759a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "$this$toByteArrayExt");
        byte[] bytes = str.getBytes(Charsets.f173341a);
        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: a */
    public static final String m256758a(byte[] bArr, int i, int i2, ContentEncoding contentEncoding) {
        Intrinsics.checkParameterIsNotNull(bArr, "$this$toString");
        Intrinsics.checkParameterIsNotNull(contentEncoding, "contentEncoding");
        return new String(bArr, i, i2, (Charset) new C65504a(contentEncoding).invoke());
    }
}
