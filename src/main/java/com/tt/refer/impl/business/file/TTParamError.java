package com.tt.refer.impl.business.file;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/tt/refer/impl/business/file/TTParamError;", "Lcom/tt/refer/impl/business/file/TTFileError;", "paramName", "", "(Ljava/lang/String;)V", "getParamName", "()Ljava/lang/String;", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.file.j */
public final class TTParamError extends TTFileError {

    /* renamed from: a */
    public static final TTParamError f171124a = new TTParamError("length");

    /* renamed from: b */
    public static final TTParamError f171125b = new TTParamError("position");

    /* renamed from: c */
    public static final Companion f171126c = new Companion(null);

    /* renamed from: d */
    private final String f171127d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/tt/refer/impl/business/file/TTParamError$Companion;", "", "()V", "INVALID_LENGTH", "Lcom/tt/refer/impl/business/file/TTParamError;", "INVALID_POSITION", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.file.j$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final String mo235663b() {
        return this.f171127d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTParamError(String str) {
        super(TTFileError.f171119u.mo235661a());
        Intrinsics.checkParameterIsNotNull(str, "paramName");
        this.f171127d = str;
    }
}
