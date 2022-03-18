package com.bytedance.ies.bullet.kit.resourceloader;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ies/bullet/kit/resourceloader/ResourceMetaData;", "", "sourceUri", "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "metaInfo", "Lcom/bytedance/ies/bullet/kit/resourceloader/BasicMetaInfo;", "getMetaInfo", "()Lcom/bytedance/ies/bullet/kit/resourceloader/BasicMetaInfo;", "setMetaInfo", "(Lcom/bytedance/ies/bullet/kit/resourceloader/BasicMetaInfo;)V", "getSourceUri", "()Landroid/net/Uri;", "asFileMeta", "Lcom/bytedance/ies/bullet/kit/resourceloader/FileMetaInfo;", "asStreamMeta", "Lcom/bytedance/ies/bullet/kit/resourceloader/StreamMetaInfo;", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.a.a.h */
public final class ResourceMetaData {

    /* renamed from: a */
    private BasicMetaInfo f37807a;

    /* renamed from: b */
    private final Uri f37808b;

    /* renamed from: a */
    public final FileMetaInfo mo52599a() {
        BasicMetaInfo aVar = this.f37807a;
        if (!(aVar instanceof FileMetaInfo)) {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        if (aVar != null) {
            return (FileMetaInfo) aVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.resourceloader.FileMetaInfo");
    }

    /* renamed from: b */
    public final StreamMetaInfo mo52601b() {
        BasicMetaInfo aVar = this.f37807a;
        if (!(aVar instanceof StreamMetaInfo)) {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        if (aVar != null) {
            return (StreamMetaInfo) aVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.resourceloader.StreamMetaInfo");
    }

    /* renamed from: a */
    public final void mo52600a(BasicMetaInfo aVar) {
        this.f37807a = aVar;
    }

    public ResourceMetaData(Uri uri) {
        Intrinsics.checkParameterIsNotNull(uri, "sourceUri");
        this.f37808b = uri;
    }
}
