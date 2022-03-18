package bytekn.foundation.io.file;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J \u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lbytekn/foundation/io/file/FileOutputStream;", "Lbytekn/foundation/io/file/KnCloseable;", "()V", "outputStream", "Ljava/io/FileOutputStream;", "Lbytekn/foundation/io/file/AndroidFileOutStream;", "getOutputStream", "()Ljava/io/FileOutputStream;", "setOutputStream", "(Ljava/io/FileOutputStream;)V", "close", "", "flush", "write", "buffer", "", "offset", "", "count", "kn_io_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.io.file.f */
public class FileOutputStream implements KnCloseable {

    /* renamed from: a */
    public java.io.FileOutputStream f5830a;

    /* renamed from: a */
    public final java.io.FileOutputStream mo8739a() {
        java.io.FileOutputStream fileOutputStream = this.f5830a;
        if (fileOutputStream == null) {
            Intrinsics.throwUninitializedPropertyAccessException("outputStream");
        }
        return fileOutputStream;
    }

    @Override // bytekn.foundation.io.file.KnCloseable
    /* renamed from: b */
    public void mo8708b() {
        java.io.FileOutputStream fileOutputStream = this.f5830a;
        if (fileOutputStream == null) {
            Intrinsics.throwUninitializedPropertyAccessException("outputStream");
        }
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
    }

    /* renamed from: c */
    public void mo8742c() {
        java.io.FileOutputStream fileOutputStream = this.f5830a;
        if (fileOutputStream == null) {
            Intrinsics.throwUninitializedPropertyAccessException("outputStream");
        }
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
    }

    /* renamed from: a */
    public final void mo8740a(java.io.FileOutputStream fileOutputStream) {
        Intrinsics.checkParameterIsNotNull(fileOutputStream, "<set-?>");
        this.f5830a = fileOutputStream;
    }

    /* renamed from: a */
    public void mo8741a(byte[] bArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(bArr, "buffer");
        java.io.FileOutputStream fileOutputStream = this.f5830a;
        if (fileOutputStream == null) {
            Intrinsics.throwUninitializedPropertyAccessException("outputStream");
        }
        if (fileOutputStream != null) {
            fileOutputStream.write(bArr, i, i2);
        }
    }
}
