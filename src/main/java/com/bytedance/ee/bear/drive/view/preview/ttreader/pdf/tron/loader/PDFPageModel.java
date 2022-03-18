package com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.loader;

import android.graphics.RectF;
import com.bumptech.glide.load.p085b.C2219g;
import com.bytedance.ee.plugin.common.ttpdfreader.TTPdfReader;
import com.bytedance.ee.util.p700c.C13602d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/loader/PDFPageModel;", "Lcom/bumptech/glide/load/model/GlideUrl;", "pdfReader", "Lcom/bytedance/ee/plugin/common/ttpdfreader/TTPdfReader;", "fileId", "", "page", "", "width", "height", "bounds", "Landroid/graphics/RectF;", "bestQuality", "", "annotationRendering", "(Lcom/bytedance/ee/plugin/common/ttpdfreader/TTPdfReader;Ljava/lang/String;IIILandroid/graphics/RectF;ZZ)V", "getAnnotationRendering", "()Z", "getBestQuality", "getBounds", "()Landroid/graphics/RectF;", "getFileId", "()Ljava/lang/String;", "getHeight", "()I", "getPage", "getPdfReader", "()Lcom/bytedance/ee/plugin/common/ttpdfreader/TTPdfReader;", "getWidth", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.a.c */
public final class PDFPageModel extends C2219g {

    /* renamed from: b */
    private final TTPdfReader f20130b;

    /* renamed from: c */
    private final String f20131c;

    /* renamed from: d */
    private final int f20132d;

    /* renamed from: e */
    private final int f20133e;

    /* renamed from: f */
    private final int f20134f;

    /* renamed from: g */
    private final RectF f20135g;

    /* renamed from: h */
    private final boolean f20136h;

    /* renamed from: i */
    private final boolean f20137i;

    /* renamed from: e */
    public final TTPdfReader mo29120e() {
        return this.f20130b;
    }

    /* renamed from: f */
    public final int mo29121f() {
        return this.f20132d;
    }

    /* renamed from: g */
    public final int mo29122g() {
        return this.f20133e;
    }

    /* renamed from: h */
    public final int mo29123h() {
        return this.f20134f;
    }

    /* renamed from: i */
    public final RectF mo29124i() {
        return this.f20135g;
    }

    /* renamed from: j */
    public final boolean mo29125j() {
        return this.f20136h;
    }

    /* renamed from: k */
    public final boolean mo29126k() {
        return this.f20137i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PDFPageModel(TTPdfReader tTPdfReader, String str, int i, int i2, int i3, RectF rectF, boolean z, boolean z2) {
        super(C13602d.m55222a("PDFPageModel(" + "fileId=" + str + ", " + "page=" + i + ", " + "width=" + i2 + ", " + "height=" + i2 + ", " + "bestQuality=" + z + ", " + "annotationRendering=" + z2 + ')'));
        Intrinsics.checkParameterIsNotNull(tTPdfReader, "pdfReader");
        Intrinsics.checkParameterIsNotNull(str, "fileId");
        Intrinsics.checkParameterIsNotNull(rectF, "bounds");
        this.f20130b = tTPdfReader;
        this.f20131c = str;
        this.f20132d = i;
        this.f20133e = i2;
        this.f20134f = i3;
        this.f20135g = rectF;
        this.f20136h = z;
        this.f20137i = z2;
    }
}
