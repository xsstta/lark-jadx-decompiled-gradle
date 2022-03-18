package com.ss.android.lark.filedetail.impl.folder.manage.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001:\u0001!B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\""}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FolderPreviewLoadParams;", "", "key", "", "start", "", "step", "orderType", "", "orderDirection", "downloadFileScene", "(Ljava/lang/String;JJIII)V", "getDownloadFileScene", "()I", "getKey", "()Ljava/lang/String;", "getOrderDirection", "getOrderType", "getStart", "()J", "getStep", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "Builder", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.entity.b */
public final class FolderPreviewLoadParams {

    /* renamed from: a */
    private final String f98271a;

    /* renamed from: b */
    private final long f98272b;

    /* renamed from: c */
    private final long f98273c;

    /* renamed from: d */
    private final int f98274d;

    /* renamed from: e */
    private final int f98275e;

    /* renamed from: f */
    private final int f98276f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FolderPreviewLoadParams)) {
            return false;
        }
        FolderPreviewLoadParams bVar = (FolderPreviewLoadParams) obj;
        return Intrinsics.areEqual(this.f98271a, bVar.f98271a) && this.f98272b == bVar.f98272b && this.f98273c == bVar.f98273c && this.f98274d == bVar.f98274d && this.f98275e == bVar.f98275e && this.f98276f == bVar.f98276f;
    }

    public int hashCode() {
        String str = this.f98271a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f98272b;
        long j2 = this.f98273c;
        return (((((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f98274d) * 31) + this.f98275e) * 31) + this.f98276f;
    }

    public String toString() {
        return "FolderPreviewLoadParams(key=" + this.f98271a + ", start=" + this.f98272b + ", step=" + this.f98273c + ", orderType=" + this.f98274d + ", orderDirection=" + this.f98275e + ", downloadFileScene=" + this.f98276f + ")";
    }

    /* renamed from: a */
    public final String mo139987a() {
        return this.f98271a;
    }

    /* renamed from: b */
    public final long mo139988b() {
        return this.f98272b;
    }

    /* renamed from: c */
    public final long mo139989c() {
        return this.f98273c;
    }

    /* renamed from: d */
    public final int mo139990d() {
        return this.f98274d;
    }

    /* renamed from: e */
    public final int mo139991e() {
        return this.f98275e;
    }

    /* renamed from: f */
    public final int mo139993f() {
        return this.f98276f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u0014\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FolderPreviewLoadParams$Builder;", "", "()V", "downloadFileScene", "", "downloadFileScene$annotations", "key", "", "orderDirection", "orderDirection$annotations", "orderType", "orderType$annotations", "start", "", "step", "build", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FolderPreviewLoadParams;", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.entity.b$a */
    public static final class Builder {

        /* renamed from: a */
        private String f98277a = "";

        /* renamed from: b */
        private long f98278b;

        /* renamed from: c */
        private long f98279c;

        /* renamed from: d */
        private int f98280d = 1;

        /* renamed from: e */
        private int f98281e = 1;

        /* renamed from: f */
        private int f98282f = 1;

        /* renamed from: a */
        public final FolderPreviewLoadParams mo139999a() {
            return new FolderPreviewLoadParams(this.f98277a, this.f98278b, this.f98279c, this.f98280d, this.f98281e, this.f98282f);
        }

        /* renamed from: a */
        public final Builder mo139996a(int i) {
            Builder aVar = this;
            aVar.f98282f = i;
            return aVar;
        }

        /* renamed from: b */
        public final Builder mo140000b(long j) {
            Builder aVar = this;
            aVar.f98279c = j;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo139997a(long j) {
            Builder aVar = this;
            aVar.f98278b = j;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo139998a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            Builder aVar = this;
            aVar.f98277a = str;
            return aVar;
        }
    }

    public FolderPreviewLoadParams(String str, long j, long j2, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        this.f98271a = str;
        this.f98272b = j;
        this.f98273c = j2;
        this.f98274d = i;
        this.f98275e = i2;
        this.f98276f = i3;
    }
}
