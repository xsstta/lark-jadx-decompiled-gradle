package com.bytedance.ee.bear.drive.view.preview.document;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.bytedance.ee.bear.drive.biz.preview.show.C6712a;
import com.bytedance.ee.bear.drive.common.C6897j;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13748k;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;

public class DocumentView extends BaseWebPreviewView implements AbstractC7549a {

    /* renamed from: e */
    protected boolean f19481e = true;

    /* renamed from: f */
    private C7268a f19482f;

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onBackPressed() {
        return false;
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.document.DocumentView$a */
    public static class C7268a {

        /* renamed from: a */
        C7553d f19485a;

        /* renamed from: a */
        public C7553d mo28391a() {
            return this.f19485a;
        }

        public C7268a(C7553d dVar) {
            this.f19485a = dVar;
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void show() {
        C13479a.m54764b("preview_document", "documentview show()");
        C7268a aVar = this.f19482f;
        if (aVar != null && aVar.mo28391a() != null) {
            if (this.f19468c != null) {
                this.f19468c.mo26117a();
            }
            C6712a.m26463a(this.f19469d, this);
            m29052b(this.f19482f.mo28391a().mo29485e());
        }
    }

    /* renamed from: a */
    public void mo28387a(C7268a aVar) {
        this.f19482f = aVar;
    }

    public void setHighLight(boolean z) {
        this.f19481e = z;
    }

    public DocumentView(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29048a(Throwable th) throws Exception {
        C13479a.m54761a("DocumentView", th);
        if (this.f19468c != null) {
            this.f19468c.mo26119a("document_view", th);
        }
        C6712a.m26465c(this.f19469d, this);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ ArrayList m29054c(String str) throws Exception {
        ArrayList arrayList = new ArrayList();
        C6897j.m27275a(str, new C6897j.AbstractC6898a(arrayList) {
            /* class com.bytedance.ee.bear.drive.view.preview.document.$$Lambda$_V8rjOHShvfKVKZ7nQsc5OP3EA */
            public final /* synthetic */ ArrayList f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.bytedance.ee.bear.drive.common.C6897j.AbstractC6898a
            public final void onBlockReadFile(String str) {
                this.f$0.add(str);
            }
        }, 1000, 2000, true);
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29049a(ArrayList arrayList) throws Exception {
        if (this.f19468c != null) {
            this.f19468c.mo26118a("document_view");
        }
        C6712a.m26464b(this.f19469d, this);
        m29050a(arrayList, 0);
    }

    /* renamed from: b */
    private void m29052b(final String str) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54758a("DocumentView", "showDocuments filePath is empty");
            return;
        }
        this.f19466a.addJavascriptInterface(new Object() {
            /* class com.bytedance.ee.bear.drive.view.preview.document.DocumentView.C72671 */

            @JavascriptInterface
            public void javaScriptFinishLoaded() {
                DocumentView.this.mo28388a(str);
            }
        }, "jsObj");
        this.f19466a.loadUrl("file:///android_asset/highlight/drive_highlight.html");
    }

    /* renamed from: a */
    public void mo28388a(String str) {
        if (!isAttachedToWindow()) {
            C13479a.m54758a("DocumentView", "showHighLightText: isAttachedToWindow is false");
        } else {
            this.f19467b = AbstractC68307f.m265083a(str).mo238020d($$Lambda$DocumentView$urIS1Ebwm1_aED309atxpIgl0r0.INSTANCE).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.drive.view.preview.document.$$Lambda$DocumentView$694J3zBbAkN4U3N6TXbYrzBnuco */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DocumentView.this.m29049a((DocumentView) ((ArrayList) obj));
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.drive.view.preview.document.$$Lambda$DocumentView$Y7AZs7fqtDa4qNXDOx_wyNr_S4g */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DocumentView.this.m29048a((DocumentView) ((Throwable) obj));
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m29053b(ArrayList arrayList, int i) {
        m29050a(arrayList, i + 1);
    }

    public DocumentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m29050a(ArrayList<String> arrayList, int i) {
        if (isAttachedToWindow() && i < arrayList.size()) {
            this.f19466a.evaluateJavascript(String.format("javascript:setString('%1$s',%2$s)", Base64.encodeToString(arrayList.get(i).getBytes(), 2), String.valueOf(this.f19481e)), new ValueCallback(arrayList, i) {
                /* class com.bytedance.ee.bear.drive.view.preview.document.$$Lambda$DocumentView$IznT8_wmfbBlLJxQL62c_2tzFSY */
                public final /* synthetic */ ArrayList f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    DocumentView.this.m29051a(this.f$1, this.f$2, (String) obj);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29051a(ArrayList arrayList, int i, String str) {
        C13748k.m55733a(new Runnable(arrayList, i) {
            /* class com.bytedance.ee.bear.drive.view.preview.document.$$Lambda$DocumentView$nPCpInc6VAYvYvKlJBKrtBD7dI */
            public final /* synthetic */ ArrayList f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                DocumentView.this.m29053b(this.f$1, this.f$2);
            }
        }, 0);
    }

    public DocumentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
