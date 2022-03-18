package com.ss.android.lark.moments.impl.publish.grid;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/grid/MediaData;", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/moments/impl/publish/grid/MediaType;", "mediaState", "Lcom/ss/android/lark/moments/impl/publish/grid/MediaState;", "(Lcom/ss/android/lark/moments/impl/publish/grid/MediaType;Lcom/ss/android/lark/moments/impl/publish/grid/MediaState;)V", "getMediaState", "()Lcom/ss/android/lark/moments/impl/publish/grid/MediaState;", "setMediaState", "(Lcom/ss/android/lark/moments/impl/publish/grid/MediaState;)V", "getType", "()Lcom/ss/android/lark/moments/impl/publish/grid/MediaType;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.publish.grid.f */
public class MediaData {

    /* renamed from: a */
    private final MediaType f120771a;

    /* renamed from: b */
    private MediaState f120772b;

    /* renamed from: e */
    public final MediaType mo168064e() {
        return this.f120771a;
    }

    /* renamed from: f */
    public final MediaState mo168065f() {
        return this.f120772b;
    }

    /* renamed from: a */
    public final void mo168063a(MediaState mediaState) {
        Intrinsics.checkParameterIsNotNull(mediaState, "<set-?>");
        this.f120772b = mediaState;
    }

    public MediaData(MediaType mediaType, MediaState mediaState) {
        Intrinsics.checkParameterIsNotNull(mediaType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(mediaState, "mediaState");
        this.f120771a = mediaType;
        this.f120772b = mediaState;
    }
}
