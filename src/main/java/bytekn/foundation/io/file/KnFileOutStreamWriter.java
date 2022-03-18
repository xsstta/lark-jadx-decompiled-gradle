package bytekn.foundation.io.file;

import java.io.OutputStreamWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbytekn/foundation/io/file/KnFileOutStreamWriter;", "Lbytekn/foundation/io/file/KnFileWriter;", "outputStream", "Lbytekn/foundation/io/file/FileOutputStream;", "contentEncoding", "Lbytekn/foundation/io/file/ContentEncoding;", "(Lbytekn/foundation/io/file/FileOutputStream;Lbytekn/foundation/io/file/ContentEncoding;)V", "kn_io_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.io.file.i */
public final class KnFileOutStreamWriter extends KnFileWriter {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KnFileOutStreamWriter(FileOutputStream fVar, ContentEncoding contentEncoding) {
        super(new OutputStreamWriter(fVar.mo8739a()));
        Intrinsics.checkParameterIsNotNull(fVar, "outputStream");
        Intrinsics.checkParameterIsNotNull(contentEncoding, "contentEncoding");
    }
}
