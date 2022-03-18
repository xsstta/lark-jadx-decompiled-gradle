package com.bytedance.ee.bear.drive.view.preview.excel;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.drive.biz.preview.show.C6712a;
import com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView;
import com.bytedance.ee.bear.drive.view.preview.excel.ExcelRenderView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.io.File;

public class ExcelRenderView extends BaseWebPreviewView implements AbstractC7549a {

    /* renamed from: e */
    public C7275c f19486e;

    /* renamed from: f */
    public C68289a f19487f = new C68289a();

    /* renamed from: g */
    private C7270a f19488g;

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onBackPressed() {
        return false;
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.excel.ExcelRenderView$a */
    public static class C7270a {

        /* renamed from: a */
        C7553d f19490a;

        /* renamed from: a */
        public C7553d mo28436a() {
            return this.f19490a;
        }

        public C7270a(C7553d dVar) {
            this.f19490a = dVar;
        }
    }

    /* renamed from: a */
    private void m29059a() {
        this.f19466a.addJavascriptInterface(new Object() {
            /* class com.bytedance.ee.bear.drive.view.preview.excel.ExcelRenderView.C72691 */

            @JavascriptInterface
            public void copyWithoutPermission() {
                C13479a.m54764b("ExcelRenderView", "copyWithoutPermission called");
            }

            @JavascriptInterface
            public void firstScreenPainted() {
                C13479a.m54764b("ExcelRenderView", "firstScreenPainted called");
                if (ExcelRenderView.this.f19468c != null) {
                    ExcelRenderView.this.f19468c.mo26118a("html_excel");
                }
                C6712a.m26464b(ExcelRenderView.this.f19469d, ExcelRenderView.this);
            }

            @JavascriptInterface
            public String getInitialData() {
                C13479a.m54764b("ExcelRenderView", "getInitialData called");
                return Base64.encodeToString(ExcelRenderView.this.f19486e.mo28443a().getBytes(), 2);
            }

            @JavascriptInterface
            public void currentTabChanged(String str) {
                C13479a.m54764b("ExcelRenderView", "currentTabChanged called, tabIndex = " + str);
                ExcelRenderView.this.f19487f.mo237937a(ExcelRenderView.this.f19486e.mo28444b(str));
            }

            @JavascriptInterface
            public void requestCachedData(String str) {
                C13479a.m54764b("ExcelRenderView", "requestCachedData called, subId = " + str);
                ExcelRenderView.this.f19487f.mo237937a(ExcelRenderView.this.f19486e.mo28442a(str).mo238001b(new Consumer(str) {
                    /* class com.bytedance.ee.bear.drive.view.preview.excel.$$Lambda$ExcelRenderView$1$GkUwdPz3KqZLSXShpJbCG3JR4U */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        ExcelRenderView.C72691.this.m29069a((ExcelRenderView.C72691) this.f$1, (String) obj);
                    }
                }, new Consumer(str) {
                    /* class com.bytedance.ee.bear.drive.view.preview.excel.$$Lambda$ExcelRenderView$1$GVmPaL51JG6zMZdKUQm_HCDO3M */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        ExcelRenderView.C72691.this.m29070a((ExcelRenderView.C72691) this.f$1, (String) ((Throwable) obj));
                    }
                }));
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m29069a(String str, String str2) throws Exception {
                ExcelRenderView.this.mo28429a(str, str2);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m29070a(String str, Throwable th) throws Exception {
                Toast.showFailureText(ExcelRenderView.this.getContext(), ExcelRenderView.this.getResources().getString(R.string.Doc_Facade_NetworkInterrutedRetry), 0);
                C13479a.m54759a("ExcelRenderView", "requestCachedData failed, subId = " + str, th);
                ExcelRenderView.this.mo28430a(th);
            }
        }, "jsObj");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView
    public void onDetachedFromWindow() {
        if (this.f19469d == null || !this.f19469d.isBlockViewChanging()) {
            this.f19486e.mo28445b();
            C68289a aVar = this.f19487f;
            if (aVar != null) {
                aVar.dispose();
            }
            super.onDetachedFromWindow();
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void show() {
        getWebView().setOnClickListener(null);
        getWebView().setVerticalScrollBarEnabled(false);
        getWebView().setHorizontalScrollBarEnabled(false);
        C7270a aVar = this.f19488g;
        if (aVar == null || aVar.mo28436a() == null) {
            C13479a.m54758a("ExcelRenderView", "mExcelRenderViewEntity is null or fileModel is null");
            return;
        }
        if (this.f19468c != null) {
            this.f19468c.mo26117a();
        }
        C6712a.m26463a(this.f19469d, this);
        C13479a.m54764b("ExcelRenderView", "ExcelRenderView show, token = " + C13598b.m55197d(this.f19488g.mo28436a().mo29479b()));
        this.f19487f.mo237937a(this.f19486e.mo28441a(this.f19488g.mo28436a()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.drive.view.preview.excel.$$Lambda$ExcelRenderView$JskAr4sxnUokk6q3MgxecS2lrkQ */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ExcelRenderView.this.m29060a((ExcelRenderView) ((Boolean) obj));
            }
        }, $$Lambda$ExcelRenderView$p58jKYIGhnJRSL6FDXshDTzfXBo.INSTANCE));
    }

    /* renamed from: a */
    public void mo28427a(C7270a aVar) {
        this.f19488g = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29061a(String str) throws Exception {
        this.f19466a.evaluateJavascript(str, null);
    }

    public ExcelRenderView(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m29063b(Throwable th) throws Exception {
        C13479a.m54759a("ExcelRenderView", "setCacheDataByFilePath failed", th);
        mo28430a(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29060a(Boolean bool) throws Exception {
        m29059a();
        this.f19466a.loadUrl("file:///android_asset/excel/excel.html");
    }

    /* renamed from: a */
    public void mo28428a(C7275c cVar) {
        this.f19486e = cVar;
    }

    /* renamed from: a */
    public void mo28430a(Throwable th) {
        if (this.f19468c != null) {
            this.f19468c.mo26119a("html_excel", th);
        }
        C6712a.m26465c(this.f19469d, this);
    }

    public ExcelRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo28429a(String str, String str2) {
        try {
            if (new File(str2).exists()) {
                this.f19487f.mo237937a(mo28369a(str2, 100000, 110000, false, new BaseWebPreviewView.AbstractC7264a(str) {
                    /* class com.bytedance.ee.bear.drive.view.preview.excel.$$Lambda$ExcelRenderView$pGoNAzccHY61KbBMp5An4SQ3Zcs */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView.AbstractC7264a
                    public final String getBlockData(String str, boolean z) {
                        return ExcelRenderView.this.m29062b(this.f$1, str, z);
                    }
                }).mo238001b(new Consumer() {
                    /* class com.bytedance.ee.bear.drive.view.preview.excel.$$Lambda$ExcelRenderView$HigcEMvqq2KPydBlMyS6KQ0223o */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        ExcelRenderView.this.m29061a((ExcelRenderView) ((String) obj));
                    }
                }, new Consumer() {
                    /* class com.bytedance.ee.bear.drive.view.preview.excel.$$Lambda$ExcelRenderView$QLo0pvJoFb2YC8Qg6X9mXK2vBNk */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        ExcelRenderView.this.m29063b((Throwable) obj);
                    }
                }));
                return;
            }
            C13479a.m54758a("ExcelRenderView", "sendDataToJs file is not exists");
            mo28430a(new Throwable("sendDataToJs file is not exists"));
        } catch (Exception e) {
            C13479a.m54759a("ExcelRenderView", "sendDataToJs failed", e);
            mo28430a(e);
        }
    }

    public ExcelRenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m29062b(String str, String str2, boolean z) {
        C13479a.m54764b("ExcelRenderView", "sendData subId = " + str + "  data.length = " + str2.length());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("subId", (Object) str);
        jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (Object) str2);
        jSONObject.put("hasMore", (Object) Boolean.valueOf(z));
        return String.format("javascript:triggerJSEvent('%1$s')", C7272b.m29081a("setCachedData", jSONObject.toJSONString()));
    }
}
