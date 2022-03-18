package com.bytedance.ee.bear.drive.view.preview.markdown;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.bytedance.ee.bear.drive.biz.preview.show.C6712a;
import com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.io.File;

public class MarkdownView extends BaseWebPreviewView implements AbstractC7549a {

    /* renamed from: e */
    private C7406a f19910e;

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onBackPressed() {
        return false;
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.markdown.MarkdownView$a */
    public static class C7406a {

        /* renamed from: a */
        C7553d f19913a;

        /* renamed from: a */
        public C7553d mo28909a() {
            return this.f19913a;
        }

        public C7406a(C7553d dVar) {
            this.f19913a = dVar;
        }
    }

    /* renamed from: a */
    private void m29618a() {
        this.f19466a.loadUrl("javascript:(function(){var objs = Array.from(document.getElementsByTagName('table')); for(var i=0;i<objs.length;i++)  {  let element = objs[i];  let div = document.createElement('div'); div.style = 'width:100%; overflow-x:auto'; div.appendChild(element.cloneNode(true));   element.replaceWith(div);}})()");
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void show() {
        C7406a aVar = this.f19910e;
        if (aVar != null && aVar.mo28909a() != null) {
            if (this.f19468c != null) {
                this.f19468c.mo26117a();
            }
            C6712a.m26463a(this.f19469d, this);
            m29620b(this.f19910e.mo28909a().mo29485e());
        }
    }

    public MarkdownView(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m29622d(String str) {
        m29618a();
    }

    /* renamed from: a */
    public void mo28906a(C7406a aVar) {
        this.f19910e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ String m29623e(String str) throws Exception {
        return Base64.encodeToString(C13675f.m55530e(new File(str)), 2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29619a(Throwable th) throws Exception {
        C13479a.m54761a("MarkdownView", th);
        if (this.f19468c != null) {
            this.f19468c.mo26119a("markdown_view", th);
        }
        C6712a.m26465c(this.f19469d, this);
    }

    /* renamed from: b */
    private void m29620b(final String str) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54758a("MarkdownView", "showDocuments filePath is empty");
            return;
        }
        this.f19466a.addJavascriptInterface(new Object() {
            /* class com.bytedance.ee.bear.drive.view.preview.markdown.MarkdownView.C74051 */

            @JavascriptInterface
            public void javaScriptFinishLoaded() {
                MarkdownView.this.mo28907a(str);
            }
        }, "jsObj");
        this.f19466a.loadUrl("file:///android_asset/markdown/drive_markdown.html");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m29621c(String str) throws Exception {
        this.f19466a.evaluateJavascript("javascript:setMarkDownString('" + str + "')", new ValueCallback() {
            /* class com.bytedance.ee.bear.drive.view.preview.markdown.$$Lambda$MarkdownView$DNigmSaTnJdr9bbAZ8rIhphnGns */

            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                MarkdownView.this.m29622d((String) obj);
            }
        });
        if (this.f19468c != null) {
            this.f19468c.mo26118a("markdown_view");
        }
        C6712a.m26464b(this.f19469d, this);
    }

    /* renamed from: a */
    public void mo28907a(String str) {
        if (!isAttachedToWindow()) {
            C13479a.m54758a("MarkdownView", "showMarkdownText: isAttachedToWindow is false");
        } else {
            this.f19467b = AbstractC68307f.m265083a(str).mo238020d($$Lambda$MarkdownView$0f9hx54uJYWgIGnKJHcWaSK5lSY.INSTANCE).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.drive.view.preview.markdown.$$Lambda$MarkdownView$C7YA6TTuhskTbIH9imYnQMm5XHc */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarkdownView.this.m29621c((String) obj);
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.drive.view.preview.markdown.$$Lambda$MarkdownView$qesY2I84gJahGXHeUTTIPfG4MAs */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarkdownView.this.m29619a((MarkdownView) ((Throwable) obj));
                }
            });
        }
    }

    public MarkdownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MarkdownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
