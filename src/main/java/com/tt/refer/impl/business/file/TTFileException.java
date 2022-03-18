package com.tt.refer.impl.business.file;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/tt/refer/impl/business/file/TTFileException;", "Ljava/lang/RuntimeException;", "ttFileError", "Lcom/tt/refer/impl/business/file/TTFileError;", "ttFile", "Lcom/tt/refer/impl/business/file/TTFile;", "cause", "", "(Lcom/tt/refer/impl/business/file/TTFileError;Lcom/tt/refer/impl/business/file/TTFile;Ljava/lang/Throwable;)V", "getTtFile", "()Lcom/tt/refer/impl/business/file/TTFile;", "getTtFileError", "()Lcom/tt/refer/impl/business/file/TTFileError;", "toString", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TTFileException extends RuntimeException {
    private final TTFile ttFile;
    private final TTFileError ttFileError;

    public TTFileException(TTFileError iVar) {
        this(iVar, null, null, 6, null);
    }

    public TTFileException(TTFileError iVar, TTFile gVar) {
        this(iVar, gVar, null, 4, null);
    }

    public final TTFile getTtFile() {
        return this.ttFile;
    }

    public final TTFileError getTtFileError() {
        return this.ttFileError;
    }

    public String toString() {
        return "TTFileException(ttFileError=" + this.ttFileError + ", ttFile=" + this.ttFile + ')';
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTFileException(TTFileError iVar, TTFile gVar, Throwable th) {
        super(th);
        Intrinsics.checkParameterIsNotNull(iVar, "ttFileError");
        this.ttFileError = iVar;
        this.ttFile = gVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TTFileException(TTFileError iVar, TTFile gVar, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, (i & 2) != 0 ? null : gVar, (i & 4) != 0 ? null : th);
    }
}
