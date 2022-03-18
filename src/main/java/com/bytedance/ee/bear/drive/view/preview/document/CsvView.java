package com.bytedance.ee.bear.drive.view.preview.document;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.JavascriptInterface;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.drive.biz.preview.show.C6712a;
import com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView;
import com.bytedance.ee.bear.drive.view.preview.document.CsvView;
import com.bytedance.ee.bear.drive.view.preview.excel.C7272b;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import io.reactivex.functions.Consumer;

public class CsvView extends BaseWebPreviewView implements AbstractC7549a {

    /* renamed from: e */
    private C7266a f19476e;

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onBackPressed() {
        return false;
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.document.CsvView$a */
    public static class C7266a {

        /* renamed from: a */
        C7553d f19480a;

        /* renamed from: a */
        public C7553d mo28386a() {
            return this.f19480a;
        }

        public C7266a(C7553d dVar) {
            this.f19480a = dVar;
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void show() {
        getWebView().setVerticalScrollBarEnabled(false);
        getWebView().setHorizontalScrollBarEnabled(false);
        C7266a aVar = this.f19476e;
        if (aVar != null && aVar.mo28386a() != null) {
            if (this.f19468c != null) {
                this.f19468c.mo26117a();
            }
            C6712a.m26463a(this.f19469d, this);
            m29041a(this.f19476e.mo28386a().mo29485e());
        }
    }

    public CsvView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo28384a(C7266a aVar) {
        this.f19476e = aVar;
    }

    /* renamed from: a */
    private void m29041a(final String str) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54758a("CsvView", "showDocuments filePath is empty");
            return;
        }
        C13479a.m54764b("CsvView", "CsvView show, token = " + C13598b.m55197d(this.f19476e.mo28386a().mo29479b()));
        this.f19466a.addJavascriptInterface(new Object() {
            /* class com.bytedance.ee.bear.drive.view.preview.document.CsvView.C72651 */

            /* renamed from: a */
            boolean f19477a = true;

            @JavascriptInterface
            public void webviewIsReady() {
                C13479a.m54764b("CsvView", "webviewIsReady");
                CsvView csvView = CsvView.this;
                csvView.f19467b = csvView.mo28369a(str, 100000, 110000, false, new BaseWebPreviewView.AbstractC7264a() {
                    /* class com.bytedance.ee.bear.drive.view.preview.document.$$Lambda$CsvView$1$nQs1i45nZY3mJTNUhguR0gHX2WA */

                    @Override // com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView.AbstractC7264a
                    public final String getBlockData(String str, boolean z) {
                        return CsvView.C72651.lambda$nQs1i45nZY3mJTNUhguR0gHX2WA(CsvView.C72651.this, str, z);
                    }
                }).mo238001b(new Consumer() {
                    /* class com.bytedance.ee.bear.drive.view.preview.document.$$Lambda$CsvView$1$uibOvJHTHg33At1gGEh6J4w2cPc */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        CsvView.C72651.lambda$uibOvJHTHg33At1gGEh6J4w2cPc(CsvView.C72651.this, (String) obj);
                    }
                }, new Consumer() {
                    /* class com.bytedance.ee.bear.drive.view.preview.document.$$Lambda$CsvView$1$EBjUQYEQOTPxzCvhsciWeyhdppw */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        CsvView.C72651.lambda$EBjUQYEQOTPxzCvhsciWeyhdppw(CsvView.C72651.this, (Throwable) obj);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m29046a(Throwable th) throws Exception {
                C13479a.m54759a("CsvView", "setCacheDataByFilePath failed", th);
                if (CsvView.this.f19468c != null) {
                    CsvView.this.f19468c.mo26119a("html_csv", th);
                }
                C6712a.m26465c(CsvView.this.f19469d, CsvView.this);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m29045a(String str) throws Exception {
                CsvView.this.f19466a.evaluateJavascript(str, null);
                if (this.f19477a && CsvView.this.f19468c != null) {
                    CsvView.this.f19468c.mo26118a("html_csv");
                }
                C6712a.m26464b(CsvView.this.f19469d, CsvView.this);
                this.f19477a = false;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ String m29044a(String str, boolean z) {
                return CsvView.this.mo28383a(str, z);
            }
        }, "jsObj");
        this.f19466a.loadUrl("file:///android_asset/csv/csv.html");
    }

    public CsvView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public String mo28383a(String str, boolean z) {
        C13479a.m54764b("CsvView", "sendData  data.length = " + str.length());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("text", (Object) str);
        jSONObject.put("hasMore", (Object) Boolean.valueOf(z));
        return String.format("javascript:triggerJSEvent('%1$s')", C7272b.m29081a("srcData", jSONObject.toJSONString()));
    }

    public CsvView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
