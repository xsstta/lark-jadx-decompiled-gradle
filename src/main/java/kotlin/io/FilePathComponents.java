package kotlin.io;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013J\t\u0010\u001f\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lkotlin/io/FilePathComponents;", "", "root", "Ljava/io/File;", "segments", "", "(Ljava/io/File;Ljava/util/List;)V", "isRooted", "", "()Z", "getRoot", "()Ljava/io/File;", "rootName", "", "getRootName", "()Ljava/lang/String;", "getSegments", "()Ljava/util/List;", "size", "", "getSize", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "subPath", "beginIndex", "endIndex", "toString", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.io.d */
public final class FilePathComponents {

    /* renamed from: a */
    private final File f173161a;

    /* renamed from: b */
    private final List<File> f173162b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilePathComponents)) {
            return false;
        }
        FilePathComponents dVar = (FilePathComponents) obj;
        return Intrinsics.areEqual(this.f173161a, dVar.f173161a) && Intrinsics.areEqual(this.f173162b, dVar.f173162b);
    }

    public int hashCode() {
        File file = this.f173161a;
        int i = 0;
        int hashCode = (file != null ? file.hashCode() : 0) * 31;
        List<File> list = this.f173162b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "FilePathComponents(root=" + this.f173161a + ", segments=" + this.f173162b + ")";
    }

    /* renamed from: b */
    public final File mo239212b() {
        return this.f173161a;
    }

    /* renamed from: c */
    public final List<File> mo239213c() {
        return this.f173162b;
    }

    /* renamed from: a */
    public final int mo239211a() {
        return this.f173162b.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends java.io.File> */
    /* JADX WARN: Multi-variable type inference failed */
    public FilePathComponents(File file, List<? extends File> list) {
        Intrinsics.checkParameterIsNotNull(file, "root");
        Intrinsics.checkParameterIsNotNull(list, "segments");
        this.f173161a = file;
        this.f173162b = list;
    }
}
