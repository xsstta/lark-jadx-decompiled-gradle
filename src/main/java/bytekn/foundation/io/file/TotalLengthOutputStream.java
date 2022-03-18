package bytekn.foundation.io.file;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J \u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lbytekn/foundation/io/file/TotalLengthOutputStream;", "Lbytekn/foundation/io/file/FileOutputStream;", "fileOutputStream", "(Lbytekn/foundation/io/file/FileOutputStream;)V", "<set-?>", "", "length", "getLength", "()J", "close", "", "flush", "write", "buffer", "", "offset", "", "count", "kn_io_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.io.file.k */
public final class TotalLengthOutputStream extends FileOutputStream {

    /* renamed from: b */
    private long f5834b;

    /* renamed from: c */
    private final FileOutputStream f5835c;

    /* renamed from: d */
    public final long mo8749d() {
        return this.f5834b;
    }

    @Override // bytekn.foundation.io.file.KnCloseable, bytekn.foundation.io.file.FileOutputStream
    /* renamed from: b */
    public void mo8708b() {
        this.f5835c.mo8708b();
    }

    @Override // bytekn.foundation.io.file.FileOutputStream
    /* renamed from: c */
    public void mo8742c() {
        this.f5835c.mo8742c();
    }

    public TotalLengthOutputStream(FileOutputStream fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "fileOutputStream");
        this.f5835c = fVar;
    }

    @Override // bytekn.foundation.io.file.FileOutputStream
    /* renamed from: a */
    public void mo8741a(byte[] bArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(bArr, "buffer");
        this.f5835c.mo8741a(bArr, i, i2);
        this.f5834b += (long) i2;
    }
}
