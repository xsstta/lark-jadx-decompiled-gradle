package com.larksuite.component.webview.container.impl.p1171b;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.DownloadListener;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.lynx.webview.TTWebSdk;
import com.bytedance.lynx.webview.extension.TTWebViewExtension;
import com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionsdk113;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.webview.container.p1169a.AbstractC25820a;
import com.larksuite.component.webview.container.p1169a.C25821b;
import com.larksuite.framework.utils.C26323w;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.AbstractC51324c;
import com.ss.android.lark.permission.C51327f;
import com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.larksuite.component.webview.container.impl.b.a */
public class C25842a implements DownloadListener {

    /* renamed from: a */
    private static final List<String> f63930a = Arrays.asList("doc", "docx", "xls", "xlsx", "ppt", "pptx", "pdf", "jpeg");

    /* renamed from: b */
    private Activity f63931b;

    /* renamed from: c */
    private LarkWebView f63932c;

    /* renamed from: d */
    private String f63933d;

    /* renamed from: e */
    private LoadingDialog f63934e;

    /* renamed from: f */
    private int f63935f;

    /* renamed from: b */
    private boolean m93498b() {
        boolean z;
        AbstractC25820a a = C25821b.m93347a();
        if (a != null) {
            z = a.mo91848a("openplatform.webapp.download.file.preview");
        } else {
            z = false;
        }
        Log.m165389i("LarkWebDownloader", "isFilePreviewOpened:" + z);
        return z;
    }

    /* renamed from: a */
    public Map<String, String> mo91934a() {
        HashMap hashMap = new HashMap();
        hashMap.put("pdf", "application/pdf");
        hashMap.put("doc", "application/msword");
        hashMap.put("jpeg", "image/jpeg");
        hashMap.put("jpg", "image/jpeg");
        hashMap.put("docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        hashMap.put("xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        hashMap.put("xls", "application/vnd.ms-excel");
        hashMap.put("pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation");
        hashMap.put("ppt", "application/vnd.ms-powerpoint");
        return hashMap;
    }

    /* renamed from: a */
    public void mo91935a(String str) {
        Log.m165389i("LarkWebDownloader", "openBySystemBrowser");
        Activity activity = this.f63931b;
        if (activity != null) {
            C26323w.m95324a(activity, str);
        }
    }

    /* renamed from: c */
    private String m93500c(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("LarkWebDownloader", "url is empty");
            return "";
        }
        String encodedPath = Uri.parse(str).getEncodedPath();
        if (encodedPath != null) {
            return encodedPath;
        }
        return "";
    }

    /* renamed from: b */
    private String m93497b(String str) {
        Map<String, String> a = mo91934a();
        if (a.containsValue(str)) {
            for (Map.Entry<String, String> entry : a.entrySet()) {
                if (TextUtils.equals(entry.getValue(), str)) {
                    Log.m165389i("LarkWebDownloader", "getFileTypeByMineType:" + entry.getKey());
                    return entry.getKey();
                }
            }
        }
        Log.m165389i("LarkWebDownloader", "getFileTypeByMineType get null,mimetype --" + str);
        return "";
    }

    /* renamed from: a */
    private void m93496a(boolean z) {
        Activity activity = this.f63931b;
        if (activity == null) {
            Log.m165383e("LarkWebDownloader", "showLoadingDialog mActivity == null");
        } else if (activity.isFinishing() || this.f63931b.isDestroyed()) {
            Log.m165383e("LarkWebDownloader", "showLoadingDialog mActivity isDestroyed");
        } else {
            if (this.f63934e == null) {
                this.f63934e = LoadingDialog.m226492a(this.f63931b).mo197784a(LoadingDialog.Style.SPIN_INDETERMINATE).mo197789b(28, 28).mo197785a(this.f63931b.getString(R.string.Lark_Legacy_Loading)).mo197791c(14.0f).mo197783a(SmEvents.EVENT_NW, SmEvents.EVENT_NW).mo197787b(5.0f).mo197788b(2).mo197782a(UIUtils.getColor(this.f63931b, R.color.loading_dialog_background_color)).mo197781a(BitmapDescriptorFactory.HUE_RED);
            }
            if (z && !this.f63934e.mo197790b()) {
                this.f63934e.mo197780a();
            } else if (!z) {
                this.f63934e.mo197792c();
            }
        }
    }

    /* renamed from: a */
    public void mo91936a(String str, String str2) {
        m93496a(true);
        new TTWebViewExtension(this.f63932c).downloadFile(str, new IWebViewExtensionsdk113.DownloadFileCallback(str2, str) {
            /* class com.larksuite.component.webview.container.impl.p1171b.$$Lambda$a$5w8Hxso59LY8WF8tr0CR7pl1yHM */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionsdk113.DownloadFileCallback
            public final void onDownloadFinish(String str, boolean z, String str2) {
                C25842a.this.m93495a(this.f$1, this.f$2, str, z, str2);
            }
        });
    }

    /* renamed from: c */
    private void m93501c(final String str, final String str2) {
        Log.m165389i("LarkWebDownloader", "tryDownLoadAndShow");
        if (C51327f.m199081a(this.f63932c.getContext(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
            Log.m165389i("LarkWebDownloader", "Permissions is ok");
            mo91936a(str, str2);
            return;
        }
        C51327f.m199079a(this.f63931b, new AbstractC51324c() {
            /* class com.larksuite.component.webview.container.impl.p1171b.C25842a.C258431 */

            @Override // com.ss.android.lark.permission.AbstractC51324c
            /* renamed from: b */
            public void mo49824b() {
                Log.m165383e("LarkWebDownloader", "apply premission failed");
                C25842a.this.mo91935a(str);
            }

            @Override // com.ss.android.lark.permission.AbstractC51324c
            /* renamed from: a */
            public void mo49823a() {
                Log.m165389i("LarkWebDownloader", "Permissions is success");
                C25842a.this.mo91936a(str, str2);
            }
        });
    }

    /* renamed from: d */
    private String m93502d(String str, String str2) {
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("LarkWebDownloader", "sourceStr is empty");
            return str3;
        }
        String replace = str.replace("\"", str3);
        int lastIndexOf = replace.lastIndexOf(".") + 1;
        if (lastIndexOf < replace.length()) {
            String substring = replace.substring(lastIndexOf);
            Log.m165389i("LarkWebDownloader", "getFileType:" + substring);
            if (f63930a.contains(substring.toLowerCase())) {
                str3 = substring.toLowerCase();
            }
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        return m93497b(str2);
    }

    /* renamed from: b */
    private boolean m93499b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("LarkWebDownloader", "contentDisposition is empty");
            return false;
        }
        String d = m93502d(str, str2);
        Log.m165389i("LarkWebDownloader", "fileType:" + d);
        if (TextUtils.isEmpty(d)) {
            return false;
        }
        Log.m165389i("LarkWebDownloader", "find support FileType");
        return true;
    }

    public C25842a(String str, LarkWebView larkWebView, FragmentActivity fragmentActivity) {
        this.f63933d = str;
        this.f63931b = fragmentActivity;
        this.f63932c = larkWebView;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m93495a(String str, String str2, String str3, boolean z, String str4) {
        Log.m165389i("LarkWebDownloader", "success:" + z + ", url:" + m93500c(str3) + ",path:" + str4);
        boolean z2 = false;
        m93496a(false);
        if (!z) {
            mo91935a(str3);
            Log.m165383e("LarkWebDownloader", "downLoad is fail ,will open system browser");
        } else if (!new File(str4).exists()) {
            Log.m165383e("LarkWebDownloader", "downLoadFail do not exist");
            mo91935a(str3);
        } else {
            Activity activity = this.f63931b;
            if (activity != null && !activity.isDestroyed() && !this.f63931b.isFinishing()) {
                z2 = C25821b.m93347a().mo91847a(this.f63931b, "", str4, str, false);
            }
            if (z2 && TextUtils.equals(this.f63933d, str2)) {
                this.f63931b.finish();
                Log.m165389i("LarkWebDownloader", "originUrl is FileUrl,will finish web container");
            } else if (!z2) {
                Log.m165389i("LarkWebDownloader", "startDriveSDKActivity fail will open system browser");
                mo91935a(str3);
            }
        }
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("LarkWebDownloader", "url is empty will return");
        } else if (this.f63932c == null) {
            Log.m165383e("LarkWebDownloader", "larkWebView is empty will return");
        } else if (!TTWebSdk.isTTWebView()) {
            Log.m165383e("LarkWebDownloader", "is system webView，will use defalut");
            mo91935a(str);
        } else if (!m93498b()) {
            Log.m165383e("LarkWebDownloader", "isFilePreviewOpened is false run default");
            mo91935a(str);
        } else {
            Log.m165389i("LarkWebDownloader", "onDownloadStart: mimetype: " + str4);
            if (!TextUtils.isEmpty(str3) && str3.contains("filename")) {
                this.f63935f = 0;
                if (m93499b(str3, str4)) {
                    m93501c(str, m93502d(str3, str4));
                    Log.m165389i("LarkWebDownloader", "onDownloadStart: isSupportPreviewInApp true");
                    return;
                }
                mo91935a(str);
            } else if (this.f63935f < 5) {
                this.f63932c.loadUrl(str);
                StringBuilder sb = new StringBuilder();
                sb.append(" will continue loadUrl,currentReloadCount--");
                int i = this.f63935f;
                this.f63935f = i + 1;
                sb.append(i);
                Log.m165389i("LarkWebDownloader", sb.toString());
            } else {
                this.f63935f = 0;
                mo91935a(str);
            }
        }
    }
}
