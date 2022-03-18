package com.bytedance.ee.bear.drive.view.preview.wrapper;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;
import com.bytedance.ee.bear.drive.biz.plugin.C6535d;
import com.bytedance.ee.bear.drive.biz.preview.vc.AbstractC6730d;
import com.bytedance.ee.bear.drive.biz.preview.vc.C6738g;
import com.bytedance.ee.bear.drive.common.PdfEntityUtil;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7256c;
import com.bytedance.ee.bear.drive.view.preview.pdf.C7413a;
import com.bytedance.ee.bear.drive.view.preview.pdf.ExhibitionMode;
import com.bytedance.ee.bear.drive.view.preview.pdf.SimplePdfView;
import com.bytedance.ee.bear.drive.view.preview.ttreader.C7437a;
import com.bytedance.ee.bear.drive.view.preview.ttreader.TTStreamingPdfView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.ArrayList;

public class PdfPreviewView extends AbsPreviewView {

    /* renamed from: a */
    private AbstractC7549a f20369a;

    /* renamed from: b */
    private C6923a f20370b = C6920b.m27342f().mo27168c();

    /* renamed from: c */
    private C7413a f20371c = new C7413a();

    /* renamed from: a */
    public void mo29432a() {
    }

    /* renamed from: d */
    private AbstractC7256c m30190d() {
        return new AbstractC7256c() {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.PdfPreviewView.C75382 */

            @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7256c
            /* renamed from: a */
            public void mo26117a() {
                PdfPreviewView.this.trackOpenStart();
            }

            @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7256c
            /* renamed from: a */
            public void mo26118a(String str) {
                PdfPreviewView.this.trackOpenSuccess(str);
                PdfPreviewView.this.mo29432a();
            }

            @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7256c
            /* renamed from: a */
            public void mo26119a(String str, Throwable th) {
                PdfPreviewView.this.trackOpenFailed(str, th);
            }
        };
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public View getView() {
        return this.f20369a.getView();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public CommentRectF hideCreateComment() {
        return this.f20369a.hideCreateComment();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public boolean onAreaClick() {
        return this.f20369a.onAreaClick();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void onCommentInputPanelClose() {
        this.f20369a.onCommentInputPanelClose();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void onCommentListPanelClose() {
        this.f20369a.onCommentListPanelClose();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void showThumbnailPreview() {
        this.f20369a.showThumbnailPreview();
    }

    /* renamed from: f */
    private void m30192f() {
        AbstractC7549a aVar = this.f20369a;
        if (aVar != null) {
            aVar.setOnShowViewTrackEventCallback(new AbstractC7256c() {
                /* class com.bytedance.ee.bear.drive.view.preview.wrapper.PdfPreviewView.C75404 */

                @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7256c
                /* renamed from: a */
                public void mo26117a() {
                    PdfPreviewView.this.trackOpenStart();
                }

                @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7256c
                /* renamed from: a */
                public void mo26118a(String str) {
                    PdfPreviewView.this.trackOpenSuccess(str);
                    PdfPreviewView.this.mo29432a();
                }

                @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7256c
                /* renamed from: a */
                public void mo26119a(String str, Throwable th) {
                    PdfPreviewView.this.trackOpenFailed(str, th);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public String getCommentQuote() {
        AbstractC7549a aVar = this.f20369a;
        if (aVar != null) {
            return aVar.getCommentQuote();
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onBackPressed() {
        AbstractC7549a aVar = this.f20369a;
        if (aVar == null || !aVar.onBackPressed()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private AbstractC7549a m30188b() {
        TTStreamingPdfView bVar = new TTStreamingPdfView();
        bVar.mo29037a(this.mContext, this.mViewOwner, this.mFileModel, m30189c(), m30190d());
        return bVar;
    }

    /* renamed from: c */
    private C7437a m30189c() {
        C7437a aVar = new C7437a();
        aVar.mo29030a(new C7437a.C7439a(false, true, true));
        aVar.mo29031a(new C7437a.AbstractC7440b() {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.PdfPreviewView.C75371 */

            @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.C7437a.AbstractC7440b
            /* renamed from: a */
            public void mo29034a() {
                if (PdfPreviewView.this.mPreviewViewModel != null) {
                    PdfPreviewView.this.mPreviewViewModel.liveInnerToggleFullScreen().mo5926a(PdfPreviewView.this.mFileModel.mo29483d());
                }
            }

            @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.C7437a.AbstractC7440b
            /* renamed from: b */
            public void mo29035b() {
                if (PdfPreviewView.this.mPreviewViewModel != null) {
                    PdfPreviewView.this.mPreviewViewModel.liveInnerForceFullScreen().mo5926a((Boolean) true);
                }
            }

            @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.C7437a.AbstractC7440b
            /* renamed from: c */
            public void mo29036c() {
                if (PdfPreviewView.this.mPreviewViewModel != null) {
                    PdfPreviewView.this.mPreviewViewModel.liveInnerForceFullScreen().mo5926a((Boolean) false);
                }
            }
        });
        return aVar;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void show() {
        m30192f();
        PdfEntityUtil.m27192a(this.f20371c, this.mFileModel);
        if (this.f20371c.mo28945c()) {
            C7555f.C7556a aVar = new C7555f.C7556a();
            Context context = this.mContext;
            aVar.mo29562a(C10539a.m43639a(context, R.string.Drive_Drive_PreviewLimitTips, "ext", "." + this.mFileModel.mo29494m()));
            aVar.mo29560a(1);
            this.mPreviewViewModel.getLiveInnerChangeTipsState().mo5926a(aVar);
        }
        this.f20369a.show();
    }

    /* renamed from: e */
    private AbstractC7549a m30191e() {
        boolean z;
        boolean z2;
        boolean z3;
        ExhibitionMode exhibitionMode;
        SimplePdfView simplePdfView = new SimplePdfView(this.mContext);
        simplePdfView.onSetup(this.mViewOwner);
        boolean z4 = false;
        if (this.mVCFollowManager == null || !this.mVCFollowManager.mo26517e()) {
            z = false;
        } else {
            z = true;
        }
        if (z || this.f20370b.mo27228j()) {
            z2 = true;
        } else {
            z2 = false;
        }
        simplePdfView.setPresentationEnable(z2);
        if (z) {
            this.mVCFollowManager.mo26515c().mo26499a((AbstractC6730d) simplePdfView);
            if (this.mContext.getResources().getConfiguration().orientation == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (this.mVCFollowManager.mo26519g() && z3) {
                z4 = true;
            }
            if (z4) {
                exhibitionMode = ExhibitionMode.NORMAL;
            } else {
                exhibitionMode = ExhibitionMode.PRESENTATION;
            }
            simplePdfView.setDefaultExhibitionMode(exhibitionMode);
            if (z3) {
                this.mPreviewViewModel.liveInnerForceFullScreen().mo5926a((Boolean) true);
            }
        } else {
            simplePdfView.setDefaultExhibitionMode(ExhibitionMode.NORMAL);
        }
        simplePdfView.mo28920a(this.f20371c);
        simplePdfView.setOnPageClickListener(new View.OnClickListener(simplePdfView) {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.$$Lambda$PdfPreviewView$Dk6EZGCiNowDtVX2dbgjfdFyEZA */
            public final /* synthetic */ SimplePdfView f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                PdfPreviewView.this.m30187a(this.f$1, view);
            }
        });
        simplePdfView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.PdfPreviewView.View$OnAttachStateChangeListenerC75393 */

            public void onViewAttachedToWindow(View view) {
            }

            public void onViewDetachedFromWindow(View view) {
                if (PdfPreviewView.this.mVCFollowManager != null) {
                    PdfPreviewView.this.mVCFollowManager.mo26515c().mo26506e();
                }
            }
        });
        return simplePdfView;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    /* renamed from: a */
    public void mo28370a(Configuration configuration) {
        AbstractC7549a aVar = this.f20369a;
        if (aVar != null) {
            aVar.mo28370a(configuration);
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void showSelectedComment(String str) {
        this.f20369a.showSelectedComment(str);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void updateComment(ArrayList<CommentRectF> arrayList) {
        this.f20369a.updateComment(arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30187a(SimplePdfView simplePdfView, View view) {
        if (this.mPreviewViewModel != null && !simplePdfView.mo28923b()) {
            this.mPreviewViewModel.liveInnerToggleFullScreen().mo5926a(this.mFileModel.mo29483d());
        }
    }

    public PdfPreviewView(ViewOwner viewOwner, Context context, C7553d dVar, C6738g gVar) {
        super(viewOwner, context, dVar, gVar);
        if (!C6535d.m26242g(this.f20370b) || this.mPreviewViewModel.isVCFollowMode()) {
            C13479a.m54764b("DRIVE_PREVIEW_FLOWPdfPreviewView", "pdfview init simplepdfview");
            this.f20369a = m30191e();
            return;
        }
        C13479a.m54764b("DRIVE_PREVIEW_FLOWPdfPreviewView", "pdfview init streaming pdf");
        this.f20369a = m30188b();
    }
}
