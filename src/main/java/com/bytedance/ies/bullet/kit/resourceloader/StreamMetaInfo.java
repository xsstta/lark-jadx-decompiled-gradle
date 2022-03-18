package com.bytedance.ies.bullet.kit.resourceloader;

import android.net.Uri;
import com.bytedance.ies.bullet.service.base.ResourceFrom;
import java.io.InputStream;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ies/bullet/kit/resourceloader/StreamMetaInfo;", "Lcom/bytedance/ies/bullet/kit/resourceloader/BasicMetaInfo;", "stream", "Ljava/io/InputStream;", "from", "Lcom/bytedance/ies/bullet/service/base/ResourceFrom;", "streamPathUri", "Landroid/net/Uri;", "(Ljava/io/InputStream;Lcom/bytedance/ies/bullet/service/base/ResourceFrom;Landroid/net/Uri;)V", "getFrom", "()Lcom/bytedance/ies/bullet/service/base/ResourceFrom;", "setFrom", "(Lcom/bytedance/ies/bullet/service/base/ResourceFrom;)V", "getStream", "()Ljava/io/InputStream;", "getStreamPathUri", "()Landroid/net/Uri;", "setStreamPathUri", "(Landroid/net/Uri;)V", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.a.a.k */
public final class StreamMetaInfo extends BasicMetaInfo {

    /* renamed from: a */
    private final InputStream f37811a;

    /* renamed from: b */
    private ResourceFrom f37812b;

    /* renamed from: c */
    private Uri f37813c;

    /* renamed from: a */
    public final InputStream mo52603a() {
        return this.f37811a;
    }

    /* renamed from: b */
    public final Uri mo52604b() {
        return this.f37813c;
    }

    public StreamMetaInfo(InputStream inputStream, ResourceFrom resourceFrom, Uri uri) {
        this.f37811a = inputStream;
        this.f37812b = resourceFrom;
        this.f37813c = uri;
    }
}
