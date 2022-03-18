package com.bytedance.ee.bear.drive.view.preview.wps;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.ee.bear.drive.view.widget.C7569b;
import com.bytedance.ee.log.C13479a;
import java.util.Arrays;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.wps.c */
public class C7524c extends C7569b {

    /* renamed from: a */
    private ValueCallback<Uri[]> f20329a;

    /* renamed from: b */
    private AbstractC7525a f20330b;

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.wps.c$a */
    public interface AbstractC7525a {
        /* renamed from: a */
        void mo29399a();

        /* renamed from: a */
        void mo29400a(boolean z);

        /* renamed from: a */
        void mo29401a(boolean z, boolean z2);
    }

    public C7524c(AbstractC7525a aVar) {
        this.f20330b = aVar;
    }

    /* renamed from: a */
    public void mo29397a(Uri[] uriArr) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("setOnReceiveValue(): ");
        if (uriArr == null) {
            i = 0;
        } else {
            i = uriArr.length;
        }
        sb.append(i);
        C13479a.m54764b("WPSWebChromeClient", sb.toString());
        ValueCallback<Uri[]> valueCallback = this.f20329a;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(uriArr);
            this.f20329a = null;
        }
    }

    /* renamed from: a */
    private boolean m30124a(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (isEmpty && isEmpty2) {
            return true;
        }
        if (isEmpty || isEmpty2) {
            return false;
        }
        return str.toLowerCase().startsWith(str2);
    }

    @Override // com.bytedance.ee.bear.drive.view.widget.C7569b, android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        boolean z;
        C13479a.m54764b("WPSWebChromeClient", "onShowFileChooser click");
        boolean z2 = false;
        if (fileChooserParams == null || this.f20330b == null) {
            return false;
        }
        C13479a.m54764b("WPSWebChromeClient", "onShowFileChooser: AcceptTypes=" + Arrays.toString(fileChooserParams.getAcceptTypes()) + ", Mode=" + fileChooserParams.getMode() + ", CaptureEnabled=" + fileChooserParams.isCaptureEnabled());
        this.f20329a = valueCallback;
        if (fileChooserParams.isCaptureEnabled()) {
            this.f20330b.mo29399a();
            return true;
        }
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        boolean a = m30124a(acceptTypes[0], "video");
        boolean a2 = m30124a(acceptTypes[0], "image");
        if (acceptTypes.length >= 2 || (!a2 && !a)) {
            z = true;
        } else {
            z = false;
        }
        if (fileChooserParams.getMode() == 1) {
            z2 = true;
        }
        if (z) {
            this.f20330b.mo29400a(z2);
        } else {
            this.f20330b.mo29401a(z2, a2);
        }
        return true;
    }
}
