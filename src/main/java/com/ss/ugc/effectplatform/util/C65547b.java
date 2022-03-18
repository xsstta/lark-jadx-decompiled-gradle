package com.ss.ugc.effectplatform.util;

import bytekn.foundation.io.file.ContentEncoding;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"convertToEncoding", "", "", "contentEncoding", "Lbytekn/foundation/io/file/ContentEncoding;", "effect_base_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.util.b */
public final class C65547b {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/nio/charset/Charset;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.util.b$a */
    public static final class C65548a extends Lambda implements Function0<Charset> {
        final /* synthetic */ ContentEncoding $contentEncoding;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65548a(ContentEncoding contentEncoding) {
            super(0);
            this.$contentEncoding = contentEncoding;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Charset invoke() {
            if (C65549c.f165093a[this.$contentEncoding.ordinal()] != 1) {
                return Charsets.f173341a;
            }
            return Charsets.f173345e;
        }
    }

    /* renamed from: a */
    public static final String m257044a(byte[] bArr, ContentEncoding contentEncoding) {
        Intrinsics.checkParameterIsNotNull(bArr, "$this$convertToEncoding");
        Intrinsics.checkParameterIsNotNull(contentEncoding, "contentEncoding");
        return new String(bArr, (Charset) new C65548a(contentEncoding).invoke());
    }
}
