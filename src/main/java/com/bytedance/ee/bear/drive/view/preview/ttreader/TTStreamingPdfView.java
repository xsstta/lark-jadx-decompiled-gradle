package com.bytedance.ee.bear.drive.view.preview.ttreader;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7256c;
import com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFCtrlView;
import com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFCtrlViewModel;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.drive.view.preview.wrapper.TitleBarViewModel;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;
import com.bytedance.ee.plugin.common.PluginManager;
import com.bytedance.ee.plugin.common.ttpdfreader.TTPdfReader;
import com.bytedance.ee.plugin.common.ttpdfreader.TTPdfReaderFactory;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J.\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\u0012\u0010\u001e\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u001f\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010!\u001a\u00020\u000eH\u0016J\u0012\u0010\"\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010$\u001a\u00020\u000eH\u0016J\u0018\u0010%\u001a\u00020\u000e2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010'H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/TTStreamingPdfView;", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/IPreviewView;", "()V", "pdfCtrlView", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFCtrlView;", "viewOwner", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/ViewOwner;", "getCommentQuote", "", "getView", "Landroid/view/View;", "hideCreateComment", "Lcom/bytedance/ee/bear/drive/biz/comment/area/CommentRectF;", "init", "", "context", "Landroid/content/Context;", "previewFileModel", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/PreviewFileModel;", "clickHelper", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/TTClickHelper;", "trackEventCallback", "Lcom/bytedance/ee/bear/drive/view/preview/OnShowViewTrackEventCallback;", "onAreaClick", "", "onBackPressed", "onCommentInputPanelClose", "onCommentListPanelClose", "onPermissionChanged", "canView", "onSetup", "setOnShowViewTrackEventCallback", "callback", "show", "showSelectedComment", "commentId", "showThumbnailPreview", "updateComment", "rectFArrayList", "Ljava/util/ArrayList;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.b */
public final class TTStreamingPdfView implements AbstractC7549a {

    /* renamed from: a */
    private PDFCtrlView f20050a;

    /* renamed from: b */
    private ViewOwner f20051b;

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    /* renamed from: a */
    public /* synthetic */ void mo28370a(Configuration configuration) {
        AbstractC7549a.CC.$default$a(this, configuration);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public String getCommentQuote() {
        return null;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public CommentRectF hideCreateComment() {
        return null;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onAreaClick() {
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onBackPressed() {
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void onCommentInputPanelClose() {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void onCommentListPanelClose() {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void onSetup(ViewOwner viewOwner) {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7262d
    public void setOnShowViewTrackEventCallback(AbstractC7256c cVar) {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void showSelectedComment(String str) {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void showThumbnailPreview() {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void updateComment(ArrayList<CommentRectF> arrayList) {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public View getView() {
        PDFCtrlView pDFCtrlView = this.f20050a;
        if (pDFCtrlView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdfCtrlView");
        }
        return pDFCtrlView;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void show() {
        PDFCtrlView pDFCtrlView = this.f20050a;
        if (pDFCtrlView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdfCtrlView");
        }
        pDFCtrlView.mo29050a((String) null);
    }

    /* renamed from: a */
    public final void mo29037a(Context context, ViewOwner viewOwner, C7553d dVar, C7437a aVar, AbstractC7256c cVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(viewOwner, "viewOwner");
        Intrinsics.checkParameterIsNotNull(dVar, "previewFileModel");
        Intrinsics.checkParameterIsNotNull(aVar, "clickHelper");
        Intrinsics.checkParameterIsNotNull(cVar, "trackEventCallback");
        this.f20051b = viewOwner;
        TTPdfReader create = ((TTPdfReaderFactory) PluginManager.getPluginApi(TTPdfReaderFactory.class)).create(context);
        LifecycleOwner lifecycleOwner = viewOwner.lifecycleOwner();
        if (lifecycleOwner != null) {
            AbstractC1142af a = new C1144ai((Fragment) lifecycleOwner).mo6005a(PDFCtrlViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProvider(viewOw…trlViewModel::class.java)");
            PDFCtrlViewModel bVar = (PDFCtrlViewModel) a;
            TitleBarViewModel hVar = (TitleBarViewModel) viewOwner.viewModel(TitleBarViewModel.class);
            if (bVar.isInit()) {
                bVar.release();
            }
            LifecycleOwner lifecycleOwner2 = viewOwner.lifecycleOwner();
            Intrinsics.checkExpressionValueIsNotNull(lifecycleOwner2, "viewOwner.lifecycleOwner()");
            Intrinsics.checkExpressionValueIsNotNull(create, "ttPdfReader");
            bVar.init(lifecycleOwner2, create, dVar, (C7555f) viewOwner.viewModel(C7555f.class), hVar, this, aVar, cVar);
            PDFCtrlView pDFCtrlView = new PDFCtrlView(context, null, 2, null);
            this.f20050a = pDFCtrlView;
            if (pDFCtrlView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pdfCtrlView");
            }
            pDFCtrlView.mo29049a(viewOwner, bVar);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
    }
}
