package com.bytedance.ee.larkbrand.service.extension;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J<\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0016H&J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0018H&J \u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0018H'J0\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nH&J \u0010$\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH&J \u0010'\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H&J \u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H&J(\u0010+\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\n2\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006."}, d2 = {"Lcom/bytedance/ee/larkbrand/service/extension/OpenLarkNativeWrapper;", "", "onCreateWebView", "", "webView", "Landroid/webkit/WebView;", "openApplyVisibleActivity", "context", "Landroid/content/Context;", "appId", "", "appName", "openFeedbackActivity", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "openLarkAboutPage", "activity", "Landroid/app/Activity;", "openLittleAppAboutPage", "appVersion", "session", "callbackJsonMap", "", "startChatWindowActivityByChatId", "", "chatId", "needBadge", "startChatWindowActivityByChatterId", BottomDialog.f17198f, "isBot", "startDocSelectActivity", "requestCode", "", "maxNum", "titleText", "confirmText", "startFileDetailActivity", "filePath", "fileType", "startPasswordVerifyActivity", "callbackId", "startProfileActivityByUserId", "userId", "startQRCodeActivity", "scanType", "showBarCodeInput", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.service.extension.m */
public interface OpenLarkNativeWrapper {
    /* renamed from: a */
    void mo49601a(Activity activity);

    /* renamed from: a */
    void mo49602a(Context context, String str, String str2);

    /* renamed from: a */
    void mo49603a(Context context, String str, String str2, String str3, Map<String, String> map);

    /* renamed from: a */
    void mo49604a(WebView webView);

    /* renamed from: a */
    void mo49605a(IAppContext iAppContext);

    /* renamed from: a */
    void mo49606a(String str, String str2, Activity activity);

    /* renamed from: a */
    boolean mo49607a(String str, String str2, boolean z);

    /* renamed from: a */
    boolean mo49608a(String str, String str2, boolean z, Activity activity);

    /* renamed from: b */
    boolean mo49609b(String str, String str2, boolean z);
}
