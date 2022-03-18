package com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.drive.view.preview.block.DriveBlockPreviewVM;
import com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFContentView;
import com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFThumbnailSlider;
import com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFThumbnailView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.log.C13479a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0016\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0014J\u0010\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\b\u0010\u001a\u001a\u00020\u0010H\u0002R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFCtrlView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "blockVM", "Lcom/bytedance/ee/bear/drive/view/preview/block/DriveBlockPreviewVM;", "thumbEnable", "", "viewModel", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFCtrlViewModel;", "viewOwner", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/ViewOwner;", "bindListener", "", "bindView", "handleShowLeftTopIndicator", "handleShowThumbnailIndicator", "init", "initView", "onDetachedFromWindow", "open", "password", "", "removeObservers", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class PDFCtrlView extends FrameLayout {

    /* renamed from: c */
    public static final Companion f20056c = new Companion(null);

    /* renamed from: a */
    public PDFCtrlViewModel f20057a;

    /* renamed from: b */
    public DriveBlockPreviewVM f20058b;

    /* renamed from: d */
    private ViewOwner f20059d;

    /* renamed from: e */
    private final boolean f20060e;

    /* renamed from: f */
    private HashMap f20061f;

    /* renamed from: a */
    public View mo29047a(int i) {
        if (this.f20061f == null) {
            this.f20061f = new HashMap();
        }
        View view = (View) this.f20061f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f20061f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFCtrlView$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFCtrlView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFCtrlView$bindListener$3", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFThumbnailSlider$ViewDelegate;", "onSlideEnd", "", "page", "", "onSlideStart", "onSliding", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFCtrlView$d */
    public static final class C7444d implements PDFThumbnailSlider.AbstractC7457a {

        /* renamed from: a */
        final /* synthetic */ PDFCtrlView f20064a;

        @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFThumbnailSlider.AbstractC7457a
        /* renamed from: b */
        public void mo29056b(int i) {
        }

        @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFThumbnailSlider.AbstractC7457a
        /* renamed from: a */
        public void mo29054a() {
            ImageView imageView = (ImageView) this.f20064a.mo29047a(R.id.pdf_thumbnail_toggle_view);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "pdf_thumbnail_toggle_view");
            imageView.setVisibility(8);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C7444d(PDFCtrlView pDFCtrlView) {
            this.f20064a = pDFCtrlView;
        }

        @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFThumbnailSlider.AbstractC7457a
        /* renamed from: a */
        public void mo29055a(int i) {
            ImageView imageView = (ImageView) this.f20064a.mo29047a(R.id.pdf_thumbnail_toggle_view);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "pdf_thumbnail_toggle_view");
            imageView.setVisibility(0);
            PDFCtrlView.m29771a(this.f20064a).turnToPage(i);
        }
    }

    /* renamed from: c */
    private final void m29773c() {
        PDFContentView pDFContentView = (PDFContentView) mo29047a(R.id.pdf_content_view);
        PDFCtrlViewModel bVar = this.f20057a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        pDFContentView.mo29040a(bVar.getRenderView());
        mo29048a();
        mo29051b();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewOwner viewOwner = this.f20059d;
        if (viewOwner == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewOwner");
        }
        AbstractC1142af viewModel = viewOwner.viewModel(C7555f.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "viewOwner.viewModel(PreviewViewModel::class.java)");
        if (!((C7555f) viewModel).isBlockViewChanging()) {
            m29776f();
            PDFCtrlViewModel bVar = this.f20057a;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            bVar.dismissOutline();
        }
    }

    /* renamed from: e */
    private final void m29775e() {
        ((PDFContentView) mo29047a(R.id.pdf_content_view)).setViewDelegate(new C7442b(this));
        ((ImageView) mo29047a(R.id.pdf_thumbnail_toggle_view)).setOnClickListener(new View$OnClickListenerC7443c(this));
        ((PDFThumbnailSlider) mo29047a(R.id.pdf_thumbnail_slider)).setViewDelegate(new C7444d(this));
        ((PDFThumbnailView) mo29047a(R.id.pdf_thumbnail_view)).setViewDelegate(new C7445e(this));
    }

    /* renamed from: f */
    private final void m29776f() {
        PDFCtrlViewModel bVar = this.f20057a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        C1177w<Boolean> bookLoaded = bVar.getBookLoaded();
        ViewOwner viewOwner = this.f20059d;
        if (viewOwner == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewOwner");
        }
        bookLoaded.mo5922a(viewOwner.lifecycleOwner());
        PDFCtrlViewModel bVar2 = this.f20057a;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        C1177w<Boolean> showThumbnail = bVar2.getShowThumbnail();
        ViewOwner viewOwner2 = this.f20059d;
        if (viewOwner2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewOwner");
        }
        showThumbnail.mo5922a(viewOwner2.lifecycleOwner());
        PDFCtrlViewModel bVar3 = this.f20057a;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        C1177w<Integer> indicator = bVar3.getIndicator();
        ViewOwner viewOwner3 = this.f20059d;
        if (viewOwner3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewOwner");
        }
        indicator.mo5922a(viewOwner3.lifecycleOwner());
        PDFCtrlViewModel bVar4 = this.f20057a;
        if (bVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        C1177w<Integer> requestPwd = bVar4.getRequestPwd();
        ViewOwner viewOwner4 = this.f20059d;
        if (viewOwner4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewOwner");
        }
        requestPwd.mo5922a(viewOwner4.lifecycleOwner());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r0.getLiveBlockState().mo5927b() == com.bytedance.ee.bear.drive.view.preview.block.DriveBlockPreviewVM.BlockState.FULLSCREEN) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29048a() {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFCtrlView.mo29048a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (r0.getLiveBlockState().mo5927b() == com.bytedance.ee.bear.drive.view.preview.block.DriveBlockPreviewVM.BlockState.FULLSCREEN) goto L_0x0031;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29051b() {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFCtrlView.mo29051b():void");
    }

    /* renamed from: d */
    private final void m29774d() {
        DriveBlockPreviewVM driveBlockPreviewVM = this.f20058b;
        if (driveBlockPreviewVM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blockVM");
        }
        C1177w<DriveBlockPreviewVM.BlockState> liveBlockState = driveBlockPreviewVM.getLiveBlockState();
        ViewOwner viewOwner = this.f20059d;
        if (viewOwner == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewOwner");
        }
        liveBlockState.mo5923a(viewOwner.lifecycleOwner(), new C7446f(this));
        PDFCtrlViewModel bVar = this.f20057a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        C1177w<Boolean> bookLoaded = bVar.getBookLoaded();
        ViewOwner viewOwner2 = this.f20059d;
        if (viewOwner2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewOwner");
        }
        bookLoaded.mo5923a(viewOwner2.lifecycleOwner(), new C7447g(this));
        PDFCtrlViewModel bVar2 = this.f20057a;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        C1177w<Boolean> showThumbnail = bVar2.getShowThumbnail();
        ViewOwner viewOwner3 = this.f20059d;
        if (viewOwner3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewOwner");
        }
        showThumbnail.mo5923a(viewOwner3.lifecycleOwner(), new C7448h(this));
        PDFCtrlViewModel bVar3 = this.f20057a;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        C1177w<Integer> indicator = bVar3.getIndicator();
        ViewOwner viewOwner4 = this.f20059d;
        if (viewOwner4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewOwner");
        }
        indicator.mo5923a(viewOwner4.lifecycleOwner(), new C7449i(this));
        PDFCtrlViewModel bVar4 = this.f20057a;
        if (bVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        C1177w<Integer> requestPwd = bVar4.getRequestPwd();
        ViewOwner viewOwner5 = this.f20059d;
        if (viewOwner5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewOwner");
        }
        requestPwd.mo5923a(viewOwner5.lifecycleOwner(), new C7450j(this));
        DriveBlockPreviewVM driveBlockPreviewVM2 = this.f20058b;
        if (driveBlockPreviewVM2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blockVM");
        }
        C1177w<DriveBlockPreviewVM.BlockState> liveBlockState2 = driveBlockPreviewVM2.getLiveBlockState();
        ViewOwner viewOwner6 = this.f20059d;
        if (viewOwner6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewOwner");
        }
        liveBlockState2.mo5923a(viewOwner6.lifecycleOwner(), new C7451k(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFCtrlView$bindListener$1", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFContentView$ViewDelegate;", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "onPasswordInput", "password", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFCtrlView$b */
    public static final class C7442b implements PDFContentView.ViewDelegate {

        /* renamed from: a */
        final /* synthetic */ PDFCtrlView f20062a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C7442b(PDFCtrlView pDFCtrlView) {
            this.f20062a = pDFCtrlView;
        }

        @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFContentView.ViewDelegate
        /* renamed from: a */
        public void mo29045a(MotionEvent motionEvent) {
            PDFCtrlView.m29771a(this.f20062a).setTouchEvent(motionEvent);
        }

        @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFContentView.ViewDelegate
        /* renamed from: a */
        public void mo29046a(String str) {
            PDFCtrlView.m29771a(this.f20062a).openPdf(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFCtrlView$bindListener$4", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFThumbnailView$ViewDelegate;", "onItemClick", "", "page", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFCtrlView$e */
    public static final class C7445e implements PDFThumbnailView.ViewDelegate {

        /* renamed from: a */
        final /* synthetic */ PDFCtrlView f20065a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C7445e(PDFCtrlView pDFCtrlView) {
            this.f20065a = pDFCtrlView;
        }

        @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFThumbnailView.ViewDelegate
        /* renamed from: a */
        public void mo29057a(int i) {
            C13479a.m54764b("PDFCtrlView", "pdf_thumbnail click, page: " + i);
            PDFCtrlView.m29771a(this.f20065a).toggleThumbnail();
            PDFCtrlView.m29771a(this.f20065a).turnToPage(i);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFCtrlView$c */
    public static final class View$OnClickListenerC7443c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PDFCtrlView f20063a;

        View$OnClickListenerC7443c(PDFCtrlView pDFCtrlView) {
            this.f20063a = pDFCtrlView;
        }

        public final void onClick(View view) {
            PDFCtrlView.m29771a(this.f20063a).toggleThumbnail();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ PDFCtrlViewModel m29771a(PDFCtrlView pDFCtrlView) {
        PDFCtrlViewModel bVar = pDFCtrlView.f20057a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ DriveBlockPreviewVM m29772b(PDFCtrlView pDFCtrlView) {
        DriveBlockPreviewVM driveBlockPreviewVM = pDFCtrlView.f20058b;
        if (driveBlockPreviewVM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blockVM");
        }
        return driveBlockPreviewVM;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", UpdateKey.STATUS, "", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFCtrlView$j */
    public static final class C7450j<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ PDFCtrlView f20070a;

        C7450j(PDFCtrlView pDFCtrlView) {
            this.f20070a = pDFCtrlView;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            if (num != null) {
                ((PDFContentView) this.f20070a.mo29047a(R.id.pdf_content_view)).mo29039a(num.intValue());
                this.f20070a.mo29051b();
                this.f20070a.mo29048a();
            }
        }
    }

    /* renamed from: a */
    public final void mo29050a(String str) {
        PDFCtrlViewModel bVar = this.f20057a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        bVar.openPdf(str);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/drive/view/preview/block/DriveBlockPreviewVM$BlockState;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFCtrlView$f */
    public static final class C7446f<T> implements AbstractC1178x<DriveBlockPreviewVM.BlockState> {

        /* renamed from: a */
        final /* synthetic */ PDFCtrlView f20066a;

        C7446f(PDFCtrlView pDFCtrlView) {
            this.f20066a = pDFCtrlView;
        }

        /* renamed from: a */
        public final void onChanged(DriveBlockPreviewVM.BlockState blockState) {
            int i;
            TextView textView = (TextView) this.f20066a.mo29047a(R.id.block_indicator);
            Intrinsics.checkExpressionValueIsNotNull(textView, "block_indicator");
            if (blockState == DriveBlockPreviewVM.BlockState.BLOCK) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            this.f20066a.mo29048a();
            this.f20066a.mo29051b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/drive/view/preview/block/DriveBlockPreviewVM$BlockState;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFCtrlView$k */
    public static final class C7451k<T> implements AbstractC1178x<DriveBlockPreviewVM.BlockState> {

        /* renamed from: a */
        final /* synthetic */ PDFCtrlView f20071a;

        C7451k(PDFCtrlView pDFCtrlView) {
            this.f20071a = pDFCtrlView;
        }

        /* renamed from: a */
        public final void onChanged(DriveBlockPreviewVM.BlockState blockState) {
            Integer b = PDFCtrlView.m29771a(this.f20071a).m269487getPageCount().mo5927b();
            if (b == null) {
                b = 0;
            }
            if (Intrinsics.compare(b.intValue(), 0) > 0 && blockState == DriveBlockPreviewVM.BlockState.BLOCK) {
                PDFCtrlView.m29771a(this.f20071a).setToFirstPage();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "book", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFCtrlView$g */
    public static final class C7447g<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ PDFCtrlView f20067a;

        C7447g(PDFCtrlView pDFCtrlView) {
            this.f20067a = pDFCtrlView;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                ((PDFThumbnailView) this.f20067a.mo29047a(R.id.pdf_thumbnail_view)).mo29084a(PDFCtrlView.m29771a(this.f20067a).getPageCount(), PDFCtrlView.m29771a(this.f20067a).getPageSizeF(0), PDFCtrlView.m29771a(this.f20067a).getPageLoader());
                ((PDFThumbnailSlider) this.f20067a.mo29047a(R.id.pdf_thumbnail_slider)).mo29068a(PDFCtrlView.m29771a(this.f20067a).getPageCount(), PDFCtrlView.m29771a(this.f20067a).getPageSizeF(0), PDFCtrlView.m29771a(this.f20067a).getPageLoader());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isShow", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFCtrlView$h */
    public static final class C7448h<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ PDFCtrlView f20068a;

        C7448h(PDFCtrlView pDFCtrlView) {
            this.f20068a = pDFCtrlView;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            int i;
            boolean z = true;
            ((PDFContentView) this.f20068a.mo29047a(R.id.pdf_content_view)).setVisible(!bool.booleanValue());
            ImageView imageView = (ImageView) this.f20068a.mo29047a(R.id.pdf_thumbnail_toggle_view);
            if (!bool.booleanValue()) {
                i = R.drawable.ud_icon_app_outlined;
            } else {
                i = R.drawable.ud_icon_view_task_outlined;
            }
            imageView.setImageResource(i);
            boolean z2 = !bool.booleanValue();
            if (PDFCtrlView.m29772b(this.f20068a).isFromBlockPreview()) {
                if (!z2 || PDFCtrlView.m29772b(this.f20068a).getLiveBlockState().mo5927b() != DriveBlockPreviewVM.BlockState.FULLSCREEN) {
                    z = false;
                }
                z2 = z;
            }
            ((PDFThumbnailSlider) this.f20068a.mo29047a(R.id.pdf_thumbnail_slider)).mo29070a(z2, false);
            PDFCtrlView.m29771a(this.f20068a).exitFullscreen();
            Intrinsics.checkExpressionValueIsNotNull(bool, "isShow");
            ((PDFThumbnailView) this.f20068a.mo29047a(R.id.pdf_thumbnail_view)).setVisible(bool.booleanValue());
            PDFThumbnailView pDFThumbnailView = (PDFThumbnailView) this.f20068a.mo29047a(R.id.pdf_thumbnail_view);
            Integer b = PDFCtrlView.m29771a(this.f20068a).getIndicator().mo5927b();
            if (b == null) {
                b = 0;
            }
            pDFThumbnailView.setSelected(b.intValue());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "page", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFCtrlView$i */
    public static final class C7449i<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ PDFCtrlView f20069a;

        C7449i(PDFCtrlView pDFCtrlView) {
            this.f20069a = pDFCtrlView;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            Intrinsics.checkExpressionValueIsNotNull(num, "page");
            ((PDFThumbnailSlider) this.f20069a.mo29047a(R.id.pdf_thumbnail_slider)).setCurrentIndicator(num.intValue());
            TextView textView = (TextView) this.f20069a.mo29047a(R.id.block_indicator);
            Intrinsics.checkExpressionValueIsNotNull(textView, "block_indicator");
            textView.setText(C10539a.m43639a(this.f20069a.getContext(), R.string.CreationMobile_Docs_PDFPreview_TotalPages, "total", String.valueOf(PDFCtrlView.m29771a(this.f20069a).m269487getPageCount().mo5927b())));
            PDFThumbnailView pDFThumbnailView = (PDFThumbnailView) this.f20069a.mo29047a(R.id.pdf_thumbnail_view);
            Integer b = PDFCtrlView.m29771a(this.f20069a).getIndicator().mo5927b();
            if (b == null) {
                b = 0;
            }
            pDFThumbnailView.setSelected(b.intValue());
            TextView textView2 = (TextView) this.f20069a.mo29047a(R.id.indicator_view);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "indicator_view");
            StringBuilder sb = new StringBuilder();
            sb.append(num.intValue() + 1);
            sb.append('/');
            sb.append(PDFCtrlView.m29771a(this.f20069a).m269487getPageCount().mo5927b());
            textView2.setText(sb.toString());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PDFCtrlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f20060e = C7473f.m29887c();
        LayoutInflater.from(context).inflate(R.layout.drive_pdf_ctrl_view, this);
    }

    /* renamed from: a */
    public final void mo29049a(ViewOwner viewOwner, PDFCtrlViewModel bVar) {
        Intrinsics.checkParameterIsNotNull(viewOwner, "viewOwner");
        Intrinsics.checkParameterIsNotNull(bVar, "viewModel");
        this.f20059d = viewOwner;
        this.f20057a = bVar;
        AbstractC1142af viewModel = viewOwner.viewModel(DriveBlockPreviewVM.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "viewOwner.viewModel(Driv…ockPreviewVM::class.java)");
        this.f20058b = (DriveBlockPreviewVM) viewModel;
        m29773c();
        m29774d();
        m29775e();
        C13479a.m54764b("PDFCtrlView", "init finish. ");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PDFCtrlView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
