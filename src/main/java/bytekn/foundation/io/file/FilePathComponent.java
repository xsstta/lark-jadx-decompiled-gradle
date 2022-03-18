package bytekn.foundation.io.file;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lbytekn/foundation/io/file/FilePathComponent;", "", "component", "", "(Ljava/lang/String;)V", "getComponent", "()Ljava/lang/String;", "file", "Ljava/io/File;", "byAppending", "toString", "kn_io_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.io.file.g */
public final class FilePathComponent {

    /* renamed from: a */
    private final File f5831a;

    /* renamed from: b */
    private final String f5832b;

    /* renamed from: a */
    public final String mo8744a() {
        return this.f5832b;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("[component=");
        sb.append(this.f5832b);
        sb.append(", canonicalPath=");
        File file = this.f5831a;
        String str2 = null;
        if (file != null) {
            str = file.getCanonicalPath();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(", absolutePath=");
        File file2 = this.f5831a;
        if (file2 != null) {
            str2 = file2.getAbsolutePath();
        }
        sb.append(str2);
        sb.append(']');
        return sb.toString();
    }

    public FilePathComponent(String str) {
        File file;
        this.f5832b = str;
        if (str != null) {
            file = new File(str).getAbsoluteFile();
        } else {
            file = null;
        }
        this.f5831a = file;
    }

    /* renamed from: a */
    public final FilePathComponent mo8743a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "component");
        if (this.f5831a == null) {
            return null;
        }
        File absoluteFile = new File(this.f5831a.getAbsolutePath(), str).getAbsoluteFile();
        Intrinsics.checkExpressionValueIsNotNull(absoluteFile, "File(file.absolutePath, component).absoluteFile");
        return new FilePathComponent(absoluteFile.getAbsolutePath());
    }
}
