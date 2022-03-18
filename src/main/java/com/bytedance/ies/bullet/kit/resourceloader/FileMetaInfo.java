package com.bytedance.ies.bullet.kit.resourceloader;

import com.bytedance.ies.bullet.service.base.ResourceFrom;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ies/bullet/kit/resourceloader/FileMetaInfo;", "Lcom/bytedance/ies/bullet/kit/resourceloader/BasicMetaInfo;", "file", "Ljava/io/File;", "from", "Lcom/bytedance/ies/bullet/service/base/ResourceFrom;", "(Ljava/io/File;Lcom/bytedance/ies/bullet/service/base/ResourceFrom;)V", "channelVersion", "", "getChannelVersion", "()Ljava/lang/Long;", "setChannelVersion", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getFile", "()Ljava/io/File;", "filePathUri", "Landroid/net/Uri;", "getFilePathUri", "()Landroid/net/Uri;", "setFilePathUri", "(Landroid/net/Uri;)V", "getFrom", "()Lcom/bytedance/ies/bullet/service/base/ResourceFrom;", "setFrom", "(Lcom/bytedance/ies/bullet/service/base/ResourceFrom;)V", "isCache", "", "()Z", "setCache", "(Z)V", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.a.a.c */
public final class FileMetaInfo extends BasicMetaInfo {

    /* renamed from: a */
    private boolean f37775a;

    /* renamed from: b */
    private Long f37776b;

    /* renamed from: c */
    private final File f37777c;

    /* renamed from: d */
    private ResourceFrom f37778d;

    /* renamed from: b */
    public final Long mo52562b() {
        return this.f37776b;
    }

    /* renamed from: c */
    public final File mo52563c() {
        return this.f37777c;
    }

    /* renamed from: a */
    public final boolean mo52561a() {
        return this.f37775a;
    }

    /* renamed from: a */
    public final void mo52558a(ResourceFrom resourceFrom) {
        this.f37778d = resourceFrom;
    }

    /* renamed from: a */
    public final void mo52559a(Long l) {
        this.f37776b = l;
    }

    /* renamed from: a */
    public final void mo52560a(boolean z) {
        this.f37775a = z;
    }

    public FileMetaInfo(File file, ResourceFrom resourceFrom) {
        Intrinsics.checkParameterIsNotNull(file, "file");
        this.f37777c = file;
        this.f37778d = resourceFrom;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileMetaInfo(File file, ResourceFrom resourceFrom, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? null : resourceFrom);
    }
}
