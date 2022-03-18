package com.bytedance.ee.bear.drive.view.preview.wrapper;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.drive.biz.comment.CommentRectLayout;
import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;
import com.bytedance.ee.bear.drive.biz.preview.vc.C6738g;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7256c;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.AbstractC7365f;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.PhotoViewContainer;
import java.util.ArrayList;

public class ImagePreviewView extends AbsPreviewView {

    /* renamed from: a */
    private PhotoViewContainer f20363a;

    /* renamed from: b */
    private CommentRectLayout f20364b;

    /* renamed from: c */
    private AbstractC7095c f20365c = C6920b.m27342f().mo27169d();

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public View getView() {
        return this.f20363a.getView();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public CommentRectF hideCreateComment() {
        return this.f20363a.hideCreateComment();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public boolean onAreaClick() {
        return this.f20363a.onAreaClick();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void onCommentInputPanelClose() {
        this.f20363a.onCommentInputPanelClose();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void onCommentListPanelClose() {
        this.f20363a.onCommentListPanelClose();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void showThumbnailPreview() {
        this.f20363a.showThumbnailPreview();
    }

    /* renamed from: a */
    private void m30177a() {
        this.f20363a.setOnShowViewTrackEventCallback(new AbstractC7256c() {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.ImagePreviewView.C75362 */

            @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7256c
            /* renamed from: a */
            public void mo26117a() {
                ImagePreviewView.this.trackOpenStart();
            }

            @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7256c
            /* renamed from: a */
            public void mo26118a(String str) {
                ImagePreviewView.this.trackOpenSuccess(str);
            }

            @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7256c
            /* renamed from: a */
            public void mo26119a(String str, Throwable th) {
                ImagePreviewView.this.trackOpenFailed(str, th);
            }
        });
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onBackPressed() {
        CommentRectLayout commentRectLayout = this.f20364b;
        if (commentRectLayout == null || !commentRectLayout.mo25488b()) {
            return false;
        }
        this.f20364b.mo25489c();
        this.mPreviewViewModel.liveInnerForceFullScreen().mo5926a((Boolean) false);
        return true;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void show() {
        m30177a();
        this.f20363a.show();
        this.mPreviewViewModel.liveInnerAreaCommentEnableState().mo5926a((Boolean) true);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void onPermissionChanged(boolean z) {
        this.f20363a.mo28616a(z);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void showSelectedComment(String str) {
        this.f20363a.showSelectedComment(str);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void updateComment(ArrayList<CommentRectF> arrayList) {
        this.f20363a.updateComment(arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30179a(Boolean bool) {
        boolean z;
        CommentRectLayout commentRectLayout = this.f20364b;
        if (bool == null || !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        commentRectLayout.setDisableShowCommentRect(z);
    }

    /* renamed from: a */
    private void m30178a(C7553d dVar) {
        int bizType = this.mPreviewViewModel.getBizType();
        PhotoViewContainer photoViewContainer = new PhotoViewContainer(this.mContext);
        this.f20363a = photoViewContainer;
        photoViewContainer.mo28614a(new PhotoViewContainer.C7352a(dVar, bizType));
        this.f20363a.onSetup(this.mViewOwner);
        this.f20363a.setMimeTypeManager(this.f20365c);
        this.f20363a.setOnPhotoRequestListener(new AbstractC7365f.C7366a() {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.ImagePreviewView.C75351 */

            @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.AbstractC7365f.C7366a, com.bytedance.ee.bear.drive.view.preview.imageviewer.AbstractC7365f
            /* renamed from: a */
            public void mo28627a(String str, Throwable th, boolean z) {
                if (z) {
                    ImagePreviewView.this.mPreviewViewModel.liveInnerShowRetryPage().mo5926a((Void) null);
                } else {
                    ImagePreviewView.this.mPreviewViewModel.getLiveInnerShowPreviewFailedPage().mo5926a((Void) null);
                }
            }
        });
        this.f20364b = this.f20363a.getCommentRectLayout();
    }

    public ImagePreviewView(ViewOwner viewOwner, Context context, C7553d dVar, C6738g gVar) {
        super(viewOwner, context, dVar, gVar);
        m30178a(dVar);
        this.mPreviewViewModel.liveOuterDisableShowComment().mo5923a(viewOwner.lifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.$$Lambda$ImagePreviewView$1pj_tRpnoooafRZHo0nx4dwOGw */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                ImagePreviewView.this.m30179a((ImagePreviewView) ((Boolean) obj));
            }
        });
    }
}
