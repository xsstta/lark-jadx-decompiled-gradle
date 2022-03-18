package com.ss.ugc.effectplatform.download;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001c\u001a\u00020\u001dR\"\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/ss/ugc/effectplatform/download/DownloadResult;", "", "()V", "downloadException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getDownloadException", "()Ljava/lang/Exception;", "setDownloadException", "(Ljava/lang/Exception;)V", "downloadTimeMillsCost", "", "getDownloadTimeMillsCost", "()J", "setDownloadTimeMillsCost", "(J)V", "fetchInputStreamTimeMillsCost", "getFetchInputStreamTimeMillsCost", "setFetchInputStreamTimeMillsCost", "fileSize", "getFileSize", "setFileSize", "unzipTimeMillsCost", "getUnzipTimeMillsCost", "setUnzipTimeMillsCost", "writeToDiskTimeMillsCost", "getWriteToDiskTimeMillsCost", "setWriteToDiskTimeMillsCost", "isSuccess", "", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.download.e */
public final class DownloadResult {

    /* renamed from: a */
    private long f164900a;

    /* renamed from: b */
    private long f164901b;

    /* renamed from: c */
    private long f164902c;

    /* renamed from: d */
    private long f164903d;

    /* renamed from: e */
    private long f164904e;

    /* renamed from: f */
    private Exception f164905f;

    /* renamed from: a */
    public final long mo227776a() {
        return this.f164900a;
    }

    /* renamed from: b */
    public final long mo227779b() {
        return this.f164901b;
    }

    /* renamed from: c */
    public final long mo227781c() {
        return this.f164902c;
    }

    /* renamed from: d */
    public final long mo227783d() {
        return this.f164903d;
    }

    /* renamed from: e */
    public final long mo227785e() {
        return this.f164904e;
    }

    /* renamed from: f */
    public final Exception mo227787f() {
        return this.f164905f;
    }

    /* renamed from: g */
    public final boolean mo227788g() {
        if (this.f164905f == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo227777a(long j) {
        this.f164900a = j;
    }

    /* renamed from: b */
    public final void mo227780b(long j) {
        this.f164901b = j;
    }

    /* renamed from: c */
    public final void mo227782c(long j) {
        this.f164902c = j;
    }

    /* renamed from: d */
    public final void mo227784d(long j) {
        this.f164903d = j;
    }

    /* renamed from: e */
    public final void mo227786e(long j) {
        this.f164904e = j;
    }

    /* renamed from: a */
    public final void mo227778a(Exception exc) {
        this.f164905f = exc;
    }
}
