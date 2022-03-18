package com.bytedance.ee.bear.drive.view.preview.wrapper;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.document.web.C6290a;
import com.bytedance.ee.bear.drive.biz.plugin.C6535d;
import com.bytedance.ee.bear.drive.biz.preview.vc.C6738g;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.common.C6892d;
import com.bytedance.ee.bear.drive.common.C6893f;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.drive.dao.p351a.C6956b;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7216a;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7254b;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7256c;
import com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView;
import com.bytedance.ee.bear.drive.view.preview.document.CsvView;
import com.bytedance.ee.bear.drive.view.preview.document.DocumentView;
import com.bytedance.ee.bear.drive.view.preview.excel.C7275c;
import com.bytedance.ee.bear.drive.view.preview.excel.ExcelRenderView;
import com.bytedance.ee.bear.drive.view.preview.htmlrender.HtmlRenderView;
import com.bytedance.ee.bear.drive.view.preview.markdown.MarkdownView;
import com.bytedance.ee.bear.drive.view.preview.puretext.PureTextView;
import com.bytedance.ee.bear.drive.view.preview.ttreader.C7437a;
import com.bytedance.ee.bear.drive.view.preview.ttreader.TTReaderBaseView;
import com.bytedance.ee.bear.drive.view.preview.ttreader.TTReaderDocPPTView;
import com.bytedance.ee.bear.drive.view.preview.ttreader.TTReaderExcelView;
import com.bytedance.ee.bear.drive.view.widget.C7571d;
import com.bytedance.ee.bear.drive.view.widget.DriveWebView;
import com.bytedance.ee.log.C13479a;

public class DocumentPreviewView extends AbsPreviewView {

    /* renamed from: a */
    public AbstractC7549a f20349a;

    /* renamed from: b */
    private AbstractC7095c f20350b;

    /* renamed from: c */
    private View.OnClickListener f20351c;

    /* renamed from: d */
    private C6923a f20352d;

    /* renamed from: e */
    private C6880a f20353e;

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onBackPressed() {
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void onSetup(ViewOwner viewOwner) {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public View getView() {
        return this.f20349a.getView();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void show() {
        this.f20349a.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.wrapper.DocumentPreviewView$a */
    public class C7533a extends C7571d {
        private C7533a() {
        }

        @Override // com.bytedance.ee.bear.drive.view.widget.C7571d
        /* renamed from: b */
        public boolean mo29430b(WebView webView, String str) {
            DocumentPreviewView.this.mPreviewViewModel.liveInnerRoute().mo5926a(str);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m30161b(String str) {
        this.mPreviewViewModel.liveInnerRoute().mo5926a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m30163c(String str) {
        this.mPreviewViewModel.liveInnerRoute().mo5926a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30155a(C6956b bVar) {
        C13479a.m54764b("DocumentPreviewView", "excel file first loaded");
        this.mPreviewViewModel.liveInnerSaveCache().mo5926a(bVar);
    }

    /* renamed from: b */
    private boolean m30162b(C7553d dVar) {
        if (dVar.mo29488g() <= ((long) (this.f20352d.mo27227i().getHighlight_max_size() * 1024))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30158a(Boolean bool) {
        if (bool != null) {
            ((AbstractC7254b) this.f20349a).mo28333a(bool.booleanValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30159a(String str) {
        this.mPreviewViewModel.liveInnerRoute().mo5926a(str);
    }

    /* renamed from: a */
    private boolean m30160a(C7553d dVar) {
        if (dVar.mo29488g() <= ((long) (this.f20352d.mo27227i().getHighlight_max_size() * 1024))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30156a(C7553d dVar, View view) {
        this.mPreviewViewModel.liveInnerToggleFullScreen().mo5926a(dVar.mo29483d());
    }

    /* renamed from: a */
    private void m30157a(DriveWebView driveWebView, C7553d dVar) {
        driveWebView.mo29642a(new C7533a());
        C6893f.m27257a(driveWebView);
        new C6290a(driveWebView.getSettings(), C4511g.m18594d()).mo25301b(driveWebView);
    }

    public DocumentPreviewView(ViewOwner viewOwner, Context context, final C7553d dVar, C6738g gVar) {
        super(viewOwner, context, dVar, gVar);
        C6920b f = C6920b.m27342f();
        this.f20350b = f.mo27169d();
        this.f20353e = f.mo27170e();
        this.f20352d = f.mo27168c();
        this.f20351c = new View.OnClickListener(dVar) {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.$$Lambda$DocumentPreviewView$5dZ8ArczqROcYSO0ljaLdCJL8A */
            public final /* synthetic */ C7553d f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                DocumentPreviewView.this.m30156a((DocumentPreviewView) this.f$1, (C7553d) view);
            }
        };
        boolean d = C6535d.m26239d(this.f20352d);
        boolean e = C6535d.m26240e(this.f20352d);
        boolean f2 = C6535d.m26241f(this.f20352d);
        C13479a.m54764b("DocumentPreviewView", "enableTTWord: " + d + ", enableTTExcel: " + e + ", enableTTPPT: " + f2);
        if (C6892d.m27243b(this.f20350b, dVar.mo29494m(), dVar.mo29483d())) {
            ExcelRenderView excelRenderView = new ExcelRenderView(this.mContext);
            excelRenderView.mo28427a(new ExcelRenderView.C7270a(dVar));
            excelRenderView.mo28428a(new C7275c(this.f20353e, this.mServiceContext, this.mContext, new C7275c.AbstractC7278a() {
                /* class com.bytedance.ee.bear.drive.view.preview.wrapper.$$Lambda$DocumentPreviewView$PkbHFOiG5ZAALmg9_TYLEOkViE */

                @Override // com.bytedance.ee.bear.drive.view.preview.excel.C7275c.AbstractC7278a
                public final void onFirstLoadFile(C6956b bVar) {
                    DocumentPreviewView.this.m30155a((DocumentPreviewView) bVar);
                }
            }));
            this.f20349a = excelRenderView;
        } else if (C6892d.m27242a(this.f20350b, dVar.mo29494m(), dVar.mo29483d())) {
            HtmlRenderView htmlRenderView = new HtmlRenderView(this.mContext);
            htmlRenderView.mo28449a(new HtmlRenderView.C7279a(dVar));
            this.f20349a = htmlRenderView;
        } else if (e && (this.f20350b.mo27721j(dVar.mo29483d(), null) || this.f20350b.mo27722k(dVar.mo29483d(), null))) {
            TTReaderExcelView tTReaderExcelView = new TTReaderExcelView(this.mContext);
            tTReaderExcelView.mo29007a(this.mFileModel, this.mPreviewViewModel);
            tTReaderExcelView.mo29023a(new TTReaderExcelView.C7436b(dVar));
            this.f20349a = tTReaderExcelView;
        } else if (d && C6892d.m27246d(dVar.mo29483d())) {
            TTReaderDocPPTView tTReaderDocPPTView = new TTReaderDocPPTView(this.mContext);
            tTReaderDocPPTView.mo29007a(this.mFileModel, this.mPreviewViewModel);
            tTReaderDocPPTView.setClickLinkCallback(new AbstractC7216a.AbstractC7217a() {
                /* class com.bytedance.ee.bear.drive.view.preview.wrapper.$$Lambda$DocumentPreviewView$7af76Q1FLOgMTN7ROJOekkCf2Ko */

                @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7216a.AbstractC7217a
                public final void onClickLink(String str) {
                    DocumentPreviewView.this.m30163c(str);
                }
            });
            tTReaderDocPPTView.setIndicatorVisible(false);
            tTReaderDocPPTView.mo29017b();
            this.f20349a = tTReaderDocPPTView;
        } else if (f2 && C6892d.m27249g(dVar.mo29483d())) {
            TTReaderDocPPTView tTReaderDocPPTView2 = new TTReaderDocPPTView(this.mContext);
            tTReaderDocPPTView2.mo29007a(this.mFileModel, this.mPreviewViewModel);
            tTReaderDocPPTView2.setClickLinkCallback(new AbstractC7216a.AbstractC7217a() {
                /* class com.bytedance.ee.bear.drive.view.preview.wrapper.$$Lambda$DocumentPreviewView$yigE1H8Xehyo2OhjCDGnTO2Z5E */

                @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7216a.AbstractC7217a
                public final void onClickLink(String str) {
                    DocumentPreviewView.this.m30161b((DocumentPreviewView) str);
                }
            });
            tTReaderDocPPTView2.mo29017b();
            this.f20349a = tTReaderDocPPTView2;
        } else if (this.f20350b.mo27723l(dVar.mo29483d(), null) && m30162b(dVar)) {
            MarkdownView markdownView = new MarkdownView(this.mContext);
            markdownView.mo28906a(new MarkdownView.C7406a(dVar));
            this.f20349a = markdownView;
        } else if (this.f20350b.mo27722k(dVar.mo29494m(), null)) {
            CsvView csvView = new CsvView(this.mContext);
            csvView.mo28384a(new CsvView.C7266a(dVar));
            this.f20349a = csvView;
        } else if (C6892d.m27244b(dVar.mo29483d())) {
            PureTextView pureTextView = new PureTextView(this.mContext);
            pureTextView.mo28976a(new PureTextView.C7427c(dVar));
            pureTextView.setPureTextOnClickListener(this.f20351c);
            this.f20349a = pureTextView;
        } else if (this.f20350b.mo27719h(dVar.mo29483d(), null)) {
            DocumentView documentView = new DocumentView(this.mContext);
            documentView.mo28387a(new DocumentView.C7268a(dVar));
            documentView.setHighLight(m30160a(dVar));
            this.f20349a = documentView;
        } else {
            this.f20349a = new NotSupportPreviewView(viewOwner, this.mContext, this.mFileModel, this.mVCFollowManager);
        }
        AbstractC7549a aVar = this.f20349a;
        if (aVar instanceof BaseWebPreviewView) {
            m30157a(((BaseWebPreviewView) aVar).getWebView(), this.mFileModel);
        }
        AbstractC7549a aVar2 = this.f20349a;
        if (aVar2 instanceof TTReaderDocPPTView) {
            ((TTReaderBaseView) aVar2).setFullScreenManager(new C7437a.AbstractC7440b() {
                /* class com.bytedance.ee.bear.drive.view.preview.wrapper.DocumentPreviewView.C75301 */

                @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.C7437a.AbstractC7440b
                /* renamed from: a */
                public void mo29034a() {
                    if (DocumentPreviewView.this.mPreviewViewModel != null) {
                        DocumentPreviewView.this.mPreviewViewModel.liveInnerToggleFullScreen().mo5926a(dVar.mo29483d());
                    }
                }

                @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.C7437a.AbstractC7440b
                /* renamed from: b */
                public void mo29035b() {
                    if (DocumentPreviewView.this.mPreviewViewModel != null) {
                        DocumentPreviewView.this.mPreviewViewModel.liveInnerForceFullScreen().mo5926a((Boolean) true);
                    }
                }

                @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.C7437a.AbstractC7440b
                /* renamed from: c */
                public void mo29036c() {
                    if (DocumentPreviewView.this.mPreviewViewModel != null) {
                        DocumentPreviewView.this.mPreviewViewModel.liveInnerForceFullScreen().mo5926a((Boolean) false);
                    }
                }
            });
        }
        AbstractC7549a aVar3 = this.f20349a;
        if (aVar3 != null) {
            aVar3.setOnShowViewTrackEventCallback(new AbstractC7256c() {
                /* class com.bytedance.ee.bear.drive.view.preview.wrapper.DocumentPreviewView.C75312 */

                @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7256c
                /* renamed from: a */
                public void mo26117a() {
                    DocumentPreviewView.this.trackOpenStart();
                }

                @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7256c
                /* renamed from: a */
                public void mo26118a(String str) {
                    C13479a.m54764b("DocumentPreviewView", "onShowSuccess, mPreviewView = " + DocumentPreviewView.this.f20349a.getClass().getSimpleName());
                    DocumentPreviewView.this.trackOpenSuccess(str);
                }

                @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7256c
                /* renamed from: a */
                public void mo26119a(String str, Throwable th) {
                    C13479a.m54758a("DocumentPreviewView", "onShowFailure, mPreviewView = " + DocumentPreviewView.this.f20349a.getClass().getSimpleName());
                    DocumentPreviewView.this.trackOpenFailed(str, th);
                }
            });
        }
        AbstractC7549a aVar4 = this.f20349a;
        if (aVar4 instanceof AbstractC7216a) {
            ((AbstractC7216a) aVar4).setClickLinkCallback(new AbstractC7216a.AbstractC7217a() {
                /* class com.bytedance.ee.bear.drive.view.preview.wrapper.$$Lambda$DocumentPreviewView$oRup0mOA4b_Hb7ze6HcR8HhuQ */

                @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7216a.AbstractC7217a
                public final void onClickLink(String str) {
                    DocumentPreviewView.this.m30159a((DocumentPreviewView) str);
                }
            });
        }
        if (this.f20349a instanceof AbstractC7254b) {
            final $$Lambda$DocumentPreviewView$7OsXcyhvhtzixmp2Rkoxihw2IGk r5 = new AbstractC1178x() {
                /* class com.bytedance.ee.bear.drive.view.preview.wrapper.$$Lambda$DocumentPreviewView$7OsXcyhvhtzixmp2Rkoxihw2IGk */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    DocumentPreviewView.this.m30158a((DocumentPreviewView) ((Boolean) obj));
                }
            };
            this.f20349a.getView().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                /* class com.bytedance.ee.bear.drive.view.preview.wrapper.DocumentPreviewView.View$OnAttachStateChangeListenerC75323 */

                public void onViewAttachedToWindow(View view) {
                    DocumentPreviewView.this.mPreviewViewModel.liveOuterCopyable().mo5925a(r5);
                }

                public void onViewDetachedFromWindow(View view) {
                    DocumentPreviewView.this.mPreviewViewModel.liveOuterCopyable().mo5928b(r5);
                }
            });
        }
        this.f20349a.onSetup(this.mViewOwner);
        disableBehavior();
    }
}
