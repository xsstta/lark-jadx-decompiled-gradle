package bytekn.foundation.io.file;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010#\u001a\u00020\rHÆ\u0003JZ\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lbytekn/foundation/io/file/FileMeta;", "", "name", "", "absolutePath", "Lbytekn/foundation/io/file/FilePathComponent;", "canonicalPath", "createdAt", "", "modifiedAt", "size", "", ShareHitPoint.f121869d, "Lbytekn/foundation/io/file/FileType;", "(Ljava/lang/String;Lbytekn/foundation/io/file/FilePathComponent;Lbytekn/foundation/io/file/FilePathComponent;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Lbytekn/foundation/io/file/FileType;)V", "getAbsolutePath", "()Lbytekn/foundation/io/file/FilePathComponent;", "getCanonicalPath", "getCreatedAt", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getModifiedAt", "getName", "()Ljava/lang/String;", "getSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getType", "()Lbytekn/foundation/io/file/FileType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lbytekn/foundation/io/file/FilePathComponent;Lbytekn/foundation/io/file/FilePathComponent;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Lbytekn/foundation/io/file/FileType;)Lbytekn/foundation/io/file/FileMeta;", "equals", "", "other", "hashCode", "", "toString", "kn_io_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.io.file.e */
public final class FileMeta {

    /* renamed from: a */
    private final String f5823a;

    /* renamed from: b */
    private final FilePathComponent f5824b;

    /* renamed from: c */
    private final FilePathComponent f5825c;

    /* renamed from: d */
    private final Double f5826d;

    /* renamed from: e */
    private final Double f5827e;

    /* renamed from: f */
    private final Long f5828f;

    /* renamed from: g */
    private final FileType f5829g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileMeta)) {
            return false;
        }
        FileMeta eVar = (FileMeta) obj;
        return Intrinsics.areEqual(this.f5823a, eVar.f5823a) && Intrinsics.areEqual(this.f5824b, eVar.f5824b) && Intrinsics.areEqual(this.f5825c, eVar.f5825c) && Intrinsics.areEqual(this.f5826d, eVar.f5826d) && Intrinsics.areEqual(this.f5827e, eVar.f5827e) && Intrinsics.areEqual(this.f5828f, eVar.f5828f) && Intrinsics.areEqual(this.f5829g, eVar.f5829g);
    }

    public int hashCode() {
        String str = this.f5823a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        FilePathComponent gVar = this.f5824b;
        int hashCode2 = (hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31;
        FilePathComponent gVar2 = this.f5825c;
        int hashCode3 = (hashCode2 + (gVar2 != null ? gVar2.hashCode() : 0)) * 31;
        Double d = this.f5826d;
        int hashCode4 = (hashCode3 + (d != null ? d.hashCode() : 0)) * 31;
        Double d2 = this.f5827e;
        int hashCode5 = (hashCode4 + (d2 != null ? d2.hashCode() : 0)) * 31;
        Long l = this.f5828f;
        int hashCode6 = (hashCode5 + (l != null ? l.hashCode() : 0)) * 31;
        FileType fileType = this.f5829g;
        if (fileType != null) {
            i = fileType.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        return "FileMeta(name=" + this.f5823a + ", absolutePath=" + this.f5824b + ", canonicalPath=" + this.f5825c + ", createdAt=" + this.f5826d + ", modifiedAt=" + this.f5827e + ", size=" + this.f5828f + ", type=" + this.f5829g + ")";
    }

    /* renamed from: a */
    public final FilePathComponent mo8733a() {
        return this.f5824b;
    }

    /* renamed from: b */
    public final Long mo8734b() {
        return this.f5828f;
    }

    /* renamed from: c */
    public final FileType mo8735c() {
        return this.f5829g;
    }

    public FileMeta(String str, FilePathComponent gVar, FilePathComponent gVar2, Double d, Double d2, Long l, FileType fileType) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(gVar, "absolutePath");
        Intrinsics.checkParameterIsNotNull(gVar2, "canonicalPath");
        Intrinsics.checkParameterIsNotNull(fileType, ShareHitPoint.f121869d);
        this.f5823a = str;
        this.f5824b = gVar;
        this.f5825c = gVar2;
        this.f5826d = d;
        this.f5827e = d2;
        this.f5828f = l;
        this.f5829g = fileType;
    }
}
