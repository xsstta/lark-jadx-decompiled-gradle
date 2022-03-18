package com.ss.ugc.effectplatform.cache.disklrucache;

import bytekn.foundation.io.file.FileOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J \u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/ugc/effectplatform/cache/disklrucache/FaultHidingOutputStream;", "Lbytekn/foundation/io/file/FileOutputStream;", "out", "hasErrorCallback", "Lkotlin/Function0;", "", "(Lbytekn/foundation/io/file/FileOutputStream;Lkotlin/jvm/functions/Function0;)V", "close", "flush", "write", "buffer", "", "offset", "", "count", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.a.a.c */
public final class FaultHidingOutputStream extends FileOutputStream {

    /* renamed from: b */
    private final FileOutputStream f164802b;

    /* renamed from: c */
    private final Function0<Unit> f164803c;

    @Override // bytekn.foundation.io.file.KnCloseable, bytekn.foundation.io.file.FileOutputStream
    /* renamed from: b */
    public void mo8708b() {
        try {
            this.f164802b.mo8708b();
        } catch (Exception unused) {
            this.f164803c.invoke();
        }
    }

    @Override // bytekn.foundation.io.file.FileOutputStream
    /* renamed from: c */
    public void mo8742c() {
        try {
            this.f164802b.mo8742c();
        } catch (Exception unused) {
            this.f164803c.invoke();
        }
    }

    public FaultHidingOutputStream(FileOutputStream fVar, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(fVar, "out");
        Intrinsics.checkParameterIsNotNull(function0, "hasErrorCallback");
        this.f164802b = fVar;
        this.f164803c = function0;
        mo8740a(fVar.mo8739a());
    }

    @Override // bytekn.foundation.io.file.FileOutputStream
    /* renamed from: a */
    public void mo8741a(byte[] bArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(bArr, "buffer");
        try {
            this.f164802b.mo8741a(bArr, i, i2);
        } catch (Exception unused) {
            this.f164803c.invoke();
        }
    }
}
