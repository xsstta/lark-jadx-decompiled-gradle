package com.ss.android.lark.moments.impl.publish.grid;

import com.ss.android.lark.moments.impl.publish.draft.ImageData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/grid/GridImageData;", "Lcom/ss/android/lark/moments/impl/publish/grid/MediaData;", "path", "", "imageData", "Lcom/ss/android/lark/moments/impl/publish/draft/ImageData;", "mediaState", "Lcom/ss/android/lark/moments/impl/publish/grid/MediaState;", "isKeepOriginPhoto", "", "actionListener", "Lcom/ss/android/lark/moments/impl/publish/grid/OnGridItemActionListener;", "(Ljava/lang/String;Lcom/ss/android/lark/moments/impl/publish/draft/ImageData;Lcom/ss/android/lark/moments/impl/publish/grid/MediaState;ZLcom/ss/android/lark/moments/impl/publish/grid/OnGridItemActionListener;)V", "getActionListener", "()Lcom/ss/android/lark/moments/impl/publish/grid/OnGridItemActionListener;", "getImageData", "()Lcom/ss/android/lark/moments/impl/publish/draft/ImageData;", "setImageData", "(Lcom/ss/android/lark/moments/impl/publish/draft/ImageData;)V", "()Z", "getPath", "()Ljava/lang/String;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.publish.grid.b */
public final class GridImageData extends MediaData {

    /* renamed from: a */
    private final String f120763a;

    /* renamed from: b */
    private ImageData f120764b;

    /* renamed from: c */
    private final boolean f120765c;

    /* renamed from: d */
    private final OnGridItemActionListener f120766d;

    /* renamed from: a */
    public final String mo168052a() {
        return this.f120763a;
    }

    /* renamed from: b */
    public final ImageData mo168054b() {
        return this.f120764b;
    }

    /* renamed from: c */
    public final boolean mo168055c() {
        return this.f120765c;
    }

    /* renamed from: d */
    public final OnGridItemActionListener mo168056d() {
        return this.f120766d;
    }

    /* renamed from: a */
    public final void mo168053a(ImageData imageData) {
        Intrinsics.checkParameterIsNotNull(imageData, "<set-?>");
        this.f120764b = imageData;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GridImageData(String str, ImageData imageData, MediaState mediaState, boolean z, OnGridItemActionListener hVar) {
        super(MediaType.TYPE_IMAGE, mediaState);
        Intrinsics.checkParameterIsNotNull(str, "path");
        Intrinsics.checkParameterIsNotNull(imageData, "imageData");
        Intrinsics.checkParameterIsNotNull(mediaState, "mediaState");
        Intrinsics.checkParameterIsNotNull(hVar, "actionListener");
        this.f120763a = str;
        this.f120764b = imageData;
        this.f120765c = z;
        this.f120766d = hVar;
    }
}
