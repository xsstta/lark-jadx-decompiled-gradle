package com.bytedance.ee.bear.drive.view.preview.htmlrender;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.ee.bear.drive.biz.preview.show.C6712a;
import com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;

public class HtmlRenderView extends BaseWebPreviewView implements AbstractC7549a {

    /* renamed from: e */
    private C7279a f19518e;

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onBackPressed() {
        return false;
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.htmlrender.HtmlRenderView$a */
    public static class C7279a {

        /* renamed from: a */
        C7553d f19519a;

        /* renamed from: a */
        public C7553d mo28450a() {
            return this.f19519a;
        }

        public C7279a(C7553d dVar) {
            this.f19519a = dVar;
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void show() {
        getWebView().setOnClickListener(null);
        C7279a aVar = this.f19518e;
        if (aVar != null && aVar.mo28450a() != null) {
            if (this.f19468c != null) {
                this.f19468c.mo26117a();
            }
            C6712a.m26463a(this.f19469d, this);
            m29094a(this.f19518e.mo28450a().mo29485e());
        }
    }

    public HtmlRenderView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo28449a(C7279a aVar) {
        this.f19518e = aVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m29095a(Throwable th) throws Exception {
        C13479a.m54761a("HtmlRenderView", th);
        if (this.f19468c != null) {
            this.f19468c.mo26119a("html_render", th);
        }
        C6712a.m26465c(this.f19469d, this);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m29096b(String str) throws Exception {
        if (this.f19468c != null) {
            this.f19468c.mo26118a("html_render");
        }
        C6712a.m26464b(this.f19469d, this);
        this.f19466a.loadDataWithBaseURL("about:blank?platform=mobile", str, "text/html", "utf-8", null);
    }

    /* renamed from: a */
    private void m29094a(String str) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54758a("HtmlRenderView", "showDocuments filePath is empty");
        } else {
            this.f19467b = AbstractC68307f.m265083a(str).mo238020d($$Lambda$HtmlRenderView$zFCE2d0Fu2GtjOtfeb51pps_Nrk.INSTANCE).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.drive.view.preview.htmlrender.$$Lambda$HtmlRenderView$sAjEjfvObK14znxAyliZ1WBvNHE */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    HtmlRenderView.this.m29096b((String) obj);
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.drive.view.preview.htmlrender.$$Lambda$HtmlRenderView$C1RhdwQUXqZ4evNBZbGSigfb9Eg */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    HtmlRenderView.this.m29095a((HtmlRenderView) ((Throwable) obj));
                }
            });
        }
    }

    public HtmlRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HtmlRenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
