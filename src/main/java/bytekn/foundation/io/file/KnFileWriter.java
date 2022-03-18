package bytekn.foundation.io.file;

import com.ss.android.ttvecamera.p3038g.C60375c;
import java.io.Writer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\u0006H\u0016J\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lbytekn/foundation/io/file/KnFileWriter;", "Lbytekn/foundation/io/file/KnCloseable;", "writer", "Ljava/io/Writer;", "(Ljava/io/Writer;)V", "append", "", "csa", "", "close", "flush", "write", "buf", "", C60375c.f150914a, "", "str", "", "kn_io_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.io.file.j */
public class KnFileWriter implements KnCloseable {

    /* renamed from: a */
    private final Writer f5833a;

    /* renamed from: a */
    public final void mo8746a() {
        this.f5833a.flush();
    }

    @Override // bytekn.foundation.io.file.KnCloseable
    /* renamed from: b */
    public void mo8708b() {
        this.f5833a.close();
    }

    public KnFileWriter(Writer writer) {
        Intrinsics.checkParameterIsNotNull(writer, "writer");
        this.f5833a = writer;
    }

    /* renamed from: a */
    public final void mo8747a(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "csa");
        this.f5833a.append(charSequence);
    }

    /* renamed from: a */
    public final void mo8748a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "str");
        this.f5833a.write(str);
    }
}
