package com.ss.android.lark.filedetail.impl.folder.manage.entity;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0016\u001a\u00020\u00172\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u0011J&\u0010\u0018\u001a\u00020\u00172\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FolderPreviewResponse;", "", "()V", "allCount", "", "getAllCount", "()J", "setAllCount", "(J)V", "fileInfos", "", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FilePreviewInfo;", "getFileInfos", "()Ljava/util/List;", "setFileInfos", "(Ljava/util/List;)V", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "append", "", "reset", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.entity.c */
public final class FolderPreviewResponse {

    /* renamed from: a */
    private List<FilePreviewInfo> f98283a = new ArrayList();

    /* renamed from: b */
    private long f98284b;

    /* renamed from: c */
    private boolean f98285c;

    /* renamed from: a */
    public final List<FilePreviewInfo> mo140001a() {
        return this.f98283a;
    }

    /* renamed from: b */
    public final long mo140007b() {
        return this.f98284b;
    }

    /* renamed from: c */
    public final boolean mo140008c() {
        return this.f98285c;
    }

    /* renamed from: a */
    public final void mo140002a(long j) {
        this.f98284b = j;
    }

    /* renamed from: a */
    public final void mo140003a(List<FilePreviewInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f98283a = list;
    }

    /* renamed from: a */
    public final void mo140006a(boolean z) {
        this.f98285c = z;
    }

    /* renamed from: a */
    public final void mo140005a(List<FilePreviewInfo> list, boolean z) {
        boolean z2;
        List<FilePreviewInfo> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            this.f98283a.addAll(list2);
            this.f98285c = z;
        }
    }

    /* renamed from: a */
    public final void mo140004a(List<FilePreviewInfo> list, long j, boolean z) {
        boolean z2;
        List<FilePreviewInfo> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            this.f98283a = list;
            this.f98284b = j;
            this.f98285c = z;
        }
    }
}
