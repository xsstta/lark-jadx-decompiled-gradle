package com.ss.android.lark.moments.impl.publish.grid;

import com.ss.android.lark.moments.impl.publish.draft.VideoGridInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/grid/GridVideoData;", "Lcom/ss/android/lark/moments/impl/publish/grid/MediaData;", "videoGridInfo", "Lcom/ss/android/lark/moments/impl/publish/draft/VideoGridInfo;", "path", "", "mediaState", "Lcom/ss/android/lark/moments/impl/publish/grid/MediaState;", "actionListener", "Lcom/ss/android/lark/moments/impl/publish/grid/OnGridItemActionListener;", "(Lcom/ss/android/lark/moments/impl/publish/draft/VideoGridInfo;Ljava/lang/String;Lcom/ss/android/lark/moments/impl/publish/grid/MediaState;Lcom/ss/android/lark/moments/impl/publish/grid/OnGridItemActionListener;)V", "getActionListener", "()Lcom/ss/android/lark/moments/impl/publish/grid/OnGridItemActionListener;", "getPath", "()Ljava/lang/String;", "getVideoGridInfo", "()Lcom/ss/android/lark/moments/impl/publish/draft/VideoGridInfo;", "setVideoGridInfo", "(Lcom/ss/android/lark/moments/impl/publish/draft/VideoGridInfo;)V", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.publish.grid.c */
public final class GridVideoData extends MediaData {

    /* renamed from: a */
    private VideoGridInfo f120767a;

    /* renamed from: b */
    private final String f120768b;

    /* renamed from: c */
    private final OnGridItemActionListener f120769c;

    /* renamed from: a */
    public final VideoGridInfo mo168057a() {
        return this.f120767a;
    }

    /* renamed from: b */
    public final String mo168059b() {
        return this.f120768b;
    }

    /* renamed from: c */
    public final OnGridItemActionListener mo168060c() {
        return this.f120769c;
    }

    /* renamed from: a */
    public final void mo168058a(VideoGridInfo videoGridInfo) {
        Intrinsics.checkParameterIsNotNull(videoGridInfo, "<set-?>");
        this.f120767a = videoGridInfo;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GridVideoData(VideoGridInfo videoGridInfo, String str, MediaState mediaState, OnGridItemActionListener hVar) {
        super(MediaType.TYPE_VIDEO, mediaState);
        Intrinsics.checkParameterIsNotNull(videoGridInfo, "videoGridInfo");
        Intrinsics.checkParameterIsNotNull(str, "path");
        Intrinsics.checkParameterIsNotNull(mediaState, "mediaState");
        Intrinsics.checkParameterIsNotNull(hVar, "actionListener");
        this.f120767a = videoGridInfo;
        this.f120768b = str;
        this.f120769c = hVar;
    }
}
