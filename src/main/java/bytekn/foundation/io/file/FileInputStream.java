package bytekn.foundation.io.file;

import com.ss.android.vesdk.p3188b.C63954b;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lbytekn/foundation/io/file/FileInputStream;", "Lbytekn/foundation/io/file/KnCloseable;", "()V", "inputStream", "Ljava/io/InputStream;", "getInputStream", "()Ljava/io/InputStream;", "setInputStream", "(Ljava/io/InputStream;)V", "available", "", "close", "", "read", "", C63954b.f161494a, "", "offset", "len", "kn_io_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.io.file.b */
public class FileInputStream implements KnCloseable {

    /* renamed from: a */
    public InputStream f5816a;

    /* renamed from: a */
    public final InputStream mo8706a() {
        InputStream inputStream = this.f5816a;
        if (inputStream == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inputStream");
        }
        return inputStream;
    }

    @Override // bytekn.foundation.io.file.KnCloseable
    /* renamed from: b */
    public void mo8708b() {
        InputStream inputStream = this.f5816a;
        if (inputStream == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inputStream");
        }
        inputStream.close();
    }

    /* renamed from: a */
    public final void mo8707a(InputStream inputStream) {
        Intrinsics.checkParameterIsNotNull(inputStream, "<set-?>");
        this.f5816a = inputStream;
    }

    /* renamed from: a */
    public int mo8705a(byte[] bArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(bArr, C63954b.f161494a);
        InputStream inputStream = this.f5816a;
        if (inputStream == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inputStream");
        }
        return inputStream.read(bArr, i, i2);
    }
}
