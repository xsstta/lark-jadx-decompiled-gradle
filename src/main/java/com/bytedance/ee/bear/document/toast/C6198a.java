package com.bytedance.ee.bear.document.toast;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.AbstractC4928g;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.C4918a;
import com.bytedance.ee.bear.document.alert.FullQuoteDialogHandler;
import com.bytedance.ee.bear.document.toast.C6198a;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.component.universe_design.toast.UDToastImpl;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.toast.a */
public class C6198a extends C4918a {

    /* renamed from: com.bytedance.ee.bear.document.toast.a$a */
    private static class C6200a implements AbstractC7945d<String> {
        private C6200a() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            C13479a.m54764b("ToastWebService", "Hide toast");
            Toast.cancel();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.toast.a$b */
    public class C6201b implements AbstractC7945d<ToastModel> {
        private C6201b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m25017a(AbstractC7947h hVar, UDToastImpl dVar) {
            hVar.mo17188a(new JSONObject());
            dVar.cancel();
        }

        /* renamed from: a */
        public void handle(ToastModel toastModel, AbstractC7947h hVar) {
            int i;
            C13479a.m54764b("ToastWebService", "Show toast:" + toastModel);
            if (!C6198a.this.mo19347c()) {
                C13479a.m54775e("ToastWebService", "Ignore show toast because not visible ");
            } else if (toastModel != null && !TextUtils.isEmpty(toastModel.message)) {
                if (toastModel.duration < 3) {
                    i = 0;
                } else {
                    i = 1;
                }
                int i2 = toastModel.type;
                if (i2 == 0) {
                    Toast.showSuccessText(C6198a.this.mo19345b(), toastModel.message, i);
                } else if (i2 == 1) {
                    Toast.showFailureText(C6198a.this.mo19345b(), toastModel.message, i);
                } else if (i2 == 2 || i2 == 3 || i2 == 4) {
                    Toast.showText(C6198a.this.mo19345b(), toastModel.message, i);
                } else if (i2 == 5) {
                    UDToast.build(((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17294b()).mo91643a(toastModel.message).mo91647b(R.drawable.facade_widget_toast_ic_success).mo91640a((long) (toastModel.duration * 1000)).mo91644a(toastModel.buttonMessage, new UDToast.OnActionClickListener() {
                        /* class com.bytedance.ee.bear.document.toast.$$Lambda$a$b$PP_JUtCEUsMCme3utF71d3CY9Qo */

                        @Override // com.larksuite.component.universe_design.toast.UDToast.OnActionClickListener
                        public final void onActionClick(UDToastImpl dVar) {
                            C6198a.C6201b.m25017a(AbstractC7947h.this, dVar);
                        }
                    }).mo91656k();
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.browser.C4918a, com.bytedance.ee.bear.browser.AbstractC4934l
    /* renamed from: a */
    public void mo19340a(AbstractC4928g gVar, AbstractC4931i iVar) {
        super.mo19340a(gVar, iVar);
        mo19344a("biz.util.showToast", new C6201b());
        mo19344a("biz.util.hideToast", new C6200a());
        mo19344a("biz.util.showFullQuoteDialog", new FullQuoteDialogHandler("webview"));
    }
}
