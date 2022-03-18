package com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron;

import android.graphics.RectF;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/IPDFPageLoader;", "", "cancelAll", "", "loadPageToView", "view", "Landroid/widget/ImageView;", "loadConfig", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/IPDFPageLoader$LoadConfig;", "pause", "resume", "LoadConfig", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.a */
public interface IPDFPageLoader {
    /* renamed from: a */
    void mo29108a();

    /* renamed from: a */
    void mo29109a(ImageView imageView, LoadConfig aVar);

    /* renamed from: b */
    void mo29110b();

    /* renamed from: c */
    void mo29111c();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/IPDFPageLoader$LoadConfig;", "", "page", "", "width", "height", "bounds", "Landroid/graphics/RectF;", "bestQuality", "", "annotationRendering", "(IIILandroid/graphics/RectF;ZZ)V", "getAnnotationRendering", "()Z", "getBestQuality", "getBounds", "()Landroid/graphics/RectF;", "getHeight", "()I", "getPage", "getWidth", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.a$a */
    public static final class LoadConfig {

        /* renamed from: a */
        private final int f20123a;

        /* renamed from: b */
        private final int f20124b;

        /* renamed from: c */
        private final int f20125c;

        /* renamed from: d */
        private final RectF f20126d;

        /* renamed from: e */
        private final boolean f20127e;

        /* renamed from: f */
        private final boolean f20128f;

        /* renamed from: a */
        public final int mo29112a() {
            return this.f20123a;
        }

        /* renamed from: b */
        public final int mo29113b() {
            return this.f20124b;
        }

        /* renamed from: c */
        public final int mo29114c() {
            return this.f20125c;
        }

        /* renamed from: d */
        public final RectF mo29115d() {
            return this.f20126d;
        }

        /* renamed from: e */
        public final boolean mo29116e() {
            return this.f20127e;
        }

        /* renamed from: f */
        public final boolean mo29117f() {
            return this.f20128f;
        }

        public LoadConfig(int i, int i2, int i3, RectF rectF, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(rectF, "bounds");
            this.f20123a = i;
            this.f20124b = i2;
            this.f20125c = i3;
            this.f20126d = rectF;
            this.f20127e = z;
            this.f20128f = z2;
        }
    }
}
