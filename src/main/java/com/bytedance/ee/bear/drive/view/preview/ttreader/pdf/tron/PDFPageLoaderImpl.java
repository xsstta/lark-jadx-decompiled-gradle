package com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron;

import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.IPDFPageLoader;
import com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.loader.PDFPageModel;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.plugin.common.ttpdfreader.TTPdfReader;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFPageLoaderImpl;", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/IPDFPageLoader;", "fileId", "", "ttPdfReader", "Lcom/bytedance/ee/plugin/common/ttpdfreader/TTPdfReader;", "(Ljava/lang/String;Lcom/bytedance/ee/plugin/common/ttpdfreader/TTPdfReader;)V", "cancelAll", "", "loadPageToView", "view", "Landroid/widget/ImageView;", "loadConfig", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/IPDFPageLoader$LoadConfig;", "pause", "resume", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.d */
public final class PDFPageLoaderImpl implements IPDFPageLoader {

    /* renamed from: a */
    public static final Companion f20152a = new Companion(null);

    /* renamed from: b */
    private final String f20153b;

    /* renamed from: c */
    private final TTPdfReader f20154c;

    @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.IPDFPageLoader
    /* renamed from: c */
    public void mo29111c() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFPageLoaderImpl$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.d$a */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.IPDFPageLoader
    /* renamed from: a */
    public void mo29108a() {
        View view = this.f20154c.getView();
        Intrinsics.checkExpressionValueIsNotNull(view, "ttPdfReader.view");
        ComponentCallbacks2C2115c.m9151c(view.getContext()).mo10426e();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.IPDFPageLoader
    /* renamed from: b */
    public void mo29110b() {
        View view = this.f20154c.getView();
        Intrinsics.checkExpressionValueIsNotNull(view, "ttPdfReader.view");
        ComponentCallbacks2C2115c.m9151c(view.getContext()).mo10422b();
    }

    public PDFPageLoaderImpl(String str, TTPdfReader tTPdfReader) {
        Intrinsics.checkParameterIsNotNull(str, "fileId");
        Intrinsics.checkParameterIsNotNull(tTPdfReader, "ttPdfReader");
        this.f20153b = str;
        this.f20154c = tTPdfReader;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.IPDFPageLoader
    /* renamed from: a */
    public void mo29109a(ImageView imageView, IPDFPageLoader.LoadConfig aVar) {
        Intrinsics.checkParameterIsNotNull(imageView, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "loadConfig");
        C13479a.m54764b("PDFPageLoaderImpl", "loadPageToView, page: " + aVar.mo29112a() + ", " + "size: " + aVar.mo29113b() + 'x' + aVar.mo29114c());
        ((C2124f) ComponentCallbacks2C2115c.m9151c(imageView.getContext()).mo10414a(new PDFPageModel(this.f20154c, this.f20153b, aVar.mo29112a(), aVar.mo29113b(), aVar.mo29114c(), aVar.mo29115d(), aVar.mo29116e(), aVar.mo29117f())).mo11129a(AbstractC2354j.f7812b)).mo10399a(imageView);
    }
}
