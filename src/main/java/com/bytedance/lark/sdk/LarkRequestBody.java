package com.bytedance.lark.sdk;

import java.io.ByteArrayInputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\"\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/bytedance/lark/sdk/LarkRequestBody;", "", "body", "", "contentType", "", "([BLjava/lang/String;)V", "<set-?>", "Ljava/io/ByteArrayInputStream;", "bodyStream", "getBodyStream", "()Ljava/io/ByteArrayInputStream;", "", "contentLength", "getContentLength", "()I", "getContentType", "()Ljava/lang/String;", "Companion", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.lark.sdk.j */
public final class LarkRequestBody {

    /* renamed from: a */
    public static final Companion f48403a = new Companion(null);

    /* renamed from: b */
    private int f48404b;

    /* renamed from: c */
    private ByteArrayInputStream f48405c;

    /* renamed from: d */
    private String f48406d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/lark/sdk/LarkRequestBody$Companion;", "", "()V", "createEmptyRequestBody", "Lcom/bytedance/lark/sdk/LarkRequestBody;", "createRequestBody", "contents", "", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.sdk.j$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final LarkRequestBody mo67193a() {
            return new LarkRequestBody(new byte[0], null, 2, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final LarkRequestBody mo67194a(byte[] bArr) {
            Intrinsics.checkParameterIsNotNull(bArr, "contents");
            return new LarkRequestBody(bArr, null, 2, null);
        }
    }

    /* renamed from: a */
    public final ByteArrayInputStream mo67192a() {
        return this.f48405c;
    }

    private LarkRequestBody(byte[] bArr, String str) {
        this.f48406d = "application/octet-stream";
        this.f48404b = bArr.length;
        this.f48405c = new ByteArrayInputStream(bArr);
        this.f48406d = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ LarkRequestBody(byte[] bArr, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i & 2) != 0 ? "application/octet-stream" : str);
    }
}
